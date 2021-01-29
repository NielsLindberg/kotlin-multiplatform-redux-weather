package dk.shape.weatherstate

import dk.shape.networking.WeatherServiceProtocol
import dk.shape.weatherstate.framework.redux.Action
import dk.shape.weatherstate.framework.redux.async.AsyncMiddleware
import dk.shape.weatherstate.error_handling.ErrorState
import dk.shape.weatherstate.forecast.ForecastState
import dk.shape.weatherstate.framework.redux.logger.LoggerMiddleware
import dk.shape.weatherstate.navigation.ScreenState
import dk.shape.weatherstate.places.PlacesState

object DI {

    val store = DefaultStore(
        initialState = GlobalState(
            errorState = ErrorState("init"),
            placesState = PlacesState(),
            forecastState = ForecastState(),
            screenState = ScreenState()
        ),
        reducer = GlobalStateReducer,
        middleware = listOf(AsyncMiddleware(), LoggerMiddleware())
    )
    fun dispatch(action: Action) = store.dispatch(action)

    val woeIds = listOf(
        "2643743",
        "2950159",
        "3128760",
        "2267057",
        "2964574",
        "2618425",
        "524901",
        "5128581",
        "5375480",
        "2147714",
        "292223",
        "2988507")

    private val apiKey = "a428b773470cf1f1888d7ca0aaea1751"
    var weatherService: WeatherServiceProtocol? = null
    fun setupWeatherService(weatherService: WeatherServiceProtocol) {
        this.weatherService = weatherService
    }

    var logger: LoggerProtocol? = null
    fun setupLogger(logger: LoggerProtocol) {
        this.logger = logger
    }
}