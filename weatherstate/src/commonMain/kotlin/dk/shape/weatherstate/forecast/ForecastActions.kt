package dk.shape.weatherstate.forecast

import dk.shape.networking.NetworkCall
import dk.shape.networking.forecast.ForecastGroupResponse
import dk.shape.weatherstate.DI
import dk.shape.weatherstate.framework.redux.Action
import dk.shape.weatherstate.framework.redux.async.AsyncAction
import dk.shape.weatherstate.error_handling.ErrorActions

class FetchForecastUnsuccessful(val errorMessage: String) : ErrorActions(errorMessage)
class FetchForecastSuccessful(val forecast: Forecast) : Action(forecast)
class SelectDailyForecast(val forecastDaily: ForecastDaily) : Action(forecastDaily)

class FetchForecastAction(id: String) : AsyncAction(
    asyncFun = suspend {
        val networkCall = NetworkCall<ForecastGroupResponse>()
        networkCall.onResponse { forecastGroupResponse ->
            val forecast = forecastGroupResponse.asForecast() ?: return@onResponse
            DI.dispatch(FetchForecastSuccessful(forecast))
        }
        networkCall.onFailure {
            DI.dispatch(FetchForecastUnsuccessful(it.message ?: ""))
        }
        DI.weatherService?.forecastQuery(id = id, networkCall = networkCall) ?: Unit
    })