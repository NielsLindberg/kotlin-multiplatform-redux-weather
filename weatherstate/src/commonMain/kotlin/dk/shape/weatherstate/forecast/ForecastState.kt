package dk.shape.weatherstate.forecast

data class ForecastState(
    val forecast: Forecast? = null,
    val errorMessage: String? = null
)