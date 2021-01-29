package dk.shape.kmpweather.androidApp.networking

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dk.shape.networking.NetworkCall
import dk.shape.networking.WeatherServiceProtocol
import dk.shape.networking.forecast.ForecastGroupResponse
import dk.shape.networking.places.PlaceGroupResponse
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

private const val baseUrl = "https://api.openweathermap.org/data/2.5/"


class WeatherService(apiKey: String) : WeatherServiceProtocol {

    private val service = initWeatherAPI(initHttpClient(apiKey))
    override fun placesQuery(ids: String, units: String, networkCall: NetworkCall<PlaceGroupResponse>) {
        mapRetrofitCall(service.placesQuery(ids, units), networkCall)
    }

    override fun forecastQuery(id: String, units: String, networkCall: NetworkCall<ForecastGroupResponse>) {
        mapRetrofitCall(service.forecastQuery(id, units), networkCall)
    }

    private fun <Value: Any> mapRetrofitCall(retrofit: Call<Value>, local: NetworkCall<Value>) {
        retrofit.enqueue(object : Callback<Value> {
            override fun onResponse(call: Call<Value>, response: Response<Value>) {
                val result = response.body()
                when {
                    !response.isSuccessful -> local.returnFailure(Exception("Network call unsuccesfull"))
                    result == null -> local.returnFailure(Exception("Empty body"))
                    else -> local.returnResponse(result)
                }
            }

            override fun onFailure(call: Call<Value>, t: Throwable) {
                local.returnFailure(t)
            }
        })
    }

    interface RetrofitService {
        @GET("group")
        fun placesQuery(
            @Query("id") ids: String,
            @Query("units") units: String = "metric"
        ): Call<PlaceGroupResponse>

        /**
         * Added query for forecast.
         */
        @GET("forecast")
        fun forecastQuery(
            @Query("id") id: String,
            @Query("units") units: String = "metric"
        ): Call<ForecastGroupResponse>
    }

    private fun initHttpClient(apiKey: String): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor { chain ->
                var request = chain.request()
                val url = request.url().newBuilder().addQueryParameter("appid", apiKey).build()
                request = request.newBuilder().url(url).build()
                chain.proceed(request)
            }.build()
    }

    private fun initWeatherAPI(httpClient: OkHttpClient): RetrofitService {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(httpClient)
            .addConverterFactory(
                Json {
                    this.ignoreUnknownKeys = true
                    this.isLenient = true
                }.asConverterFactory(MediaType.get("application/json"))
            )
            .build()

        return retrofit.create(RetrofitService::class.java)
    }
}
