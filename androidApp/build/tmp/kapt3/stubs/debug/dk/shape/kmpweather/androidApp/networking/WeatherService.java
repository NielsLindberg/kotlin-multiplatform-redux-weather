package dk.shape.kmpweather.androidApp.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0003J.\u0010\u0012\u001a\u00020\b\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00130\fH\u0002J&\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001a0\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Ldk/shape/kmpweather/androidApp/networking/WeatherService;", "Ldk/shape/networking/WeatherServiceProtocol;", "apiKey", "", "(Ljava/lang/String;)V", "service", "Ldk/shape/kmpweather/androidApp/networking/WeatherService$RetrofitService;", "forecastQuery", "", "id", "units", "networkCall", "Ldk/shape/networking/NetworkCall;", "Ldk/shape/networking/forecast/ForecastGroupResponse;", "initHttpClient", "Lokhttp3/OkHttpClient;", "initWeatherAPI", "httpClient", "mapRetrofitCall", "Value", "", "retrofit", "Lretrofit2/Call;", "local", "placesQuery", "ids", "Ldk/shape/networking/places/PlaceGroupResponse;", "RetrofitService", "androidApp_debug"})
public final class WeatherService implements dk.shape.networking.WeatherServiceProtocol {
    private final dk.shape.kmpweather.androidApp.networking.WeatherService.RetrofitService service = null;
    
    @java.lang.Override()
    public void placesQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String ids, @org.jetbrains.annotations.NotNull()
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    dk.shape.networking.NetworkCall<dk.shape.networking.places.PlaceGroupResponse> networkCall) {
    }
    
    @java.lang.Override()
    public void forecastQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    dk.shape.networking.NetworkCall<dk.shape.networking.forecast.ForecastGroupResponse> networkCall) {
    }
    
    private final <Value extends java.lang.Object>void mapRetrofitCall(retrofit2.Call<Value> retrofit, dk.shape.networking.NetworkCall<Value> local) {
    }
    
    private final okhttp3.OkHttpClient initHttpClient(java.lang.String apiKey) {
        return null;
    }
    
    @kotlinx.serialization.ExperimentalSerializationApi()
    private final dk.shape.kmpweather.androidApp.networking.WeatherService.RetrofitService initWeatherAPI(okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    public WeatherService(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Ldk/shape/kmpweather/androidApp/networking/WeatherService$RetrofitService;", "", "forecastQuery", "Lretrofit2/Call;", "Ldk/shape/networking/forecast/ForecastGroupResponse;", "id", "", "units", "placesQuery", "Ldk/shape/networking/places/PlaceGroupResponse;", "ids", "androidApp_debug"})
    public static abstract interface RetrofitService {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "group")
        public abstract retrofit2.Call<dk.shape.networking.places.PlaceGroupResponse> placesQuery(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "id")
        java.lang.String ids, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "units")
        java.lang.String units);
        
        /**
         * Added query for forecast.
         */
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "forecast")
        public abstract retrofit2.Call<dk.shape.networking.forecast.ForecastGroupResponse> forecastQuery(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "id")
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "units")
        java.lang.String units);
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
}