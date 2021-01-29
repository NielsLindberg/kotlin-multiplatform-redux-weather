package dk.shape.weatherstate.forecast

import dk.shape.weatherstate.framework.redux.Reducer

val ForecastReducer: Reducer<ForecastState> = { old, action ->
    when (action) {
        is FetchForecastSuccessful -> old.copy(forecast = action.forecast, errorMessage = null)
        is FetchForecastUnsuccessful -> old.copy(errorMessage = action.errorMessage)
        is SelectDailyForecast -> old.copy(forecast = old.forecast?.copy(selectedDaily = action.forecastDaily))
        else -> old
    }
}