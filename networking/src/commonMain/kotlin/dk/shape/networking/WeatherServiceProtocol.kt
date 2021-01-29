package dk.shape.networking

import dk.shape.networking.forecast.ForecastGroupResponse
import dk.shape.networking.places.PlaceGroupResponse

class NetworkCall<Value: Any> {
    private var callback: ((Value) -> Unit)? = null
    private var failureCallback: ((Throwable) -> Unit)? = null

    fun returnResponse(value: Value) = callback?.invoke(value)
    fun returnFailure(failure: Throwable) = failureCallback?.invoke(failure)
    fun onResponse(callback: (Value) -> Unit) {
        this.callback = callback
    }
    fun onFailure(callback: (Throwable) -> Unit) {
        this.failureCallback = callback
    }
}

interface WeatherServiceProtocol {
    fun placesQuery(ids: String, units: String = "metric", networkCall: NetworkCall<PlaceGroupResponse>)
    fun forecastQuery(id: String, units: String = "metric", networkCall: NetworkCall<ForecastGroupResponse>)
}