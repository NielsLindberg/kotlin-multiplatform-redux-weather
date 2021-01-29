package dk.shape.weatherstate.places

import dk.shape.networking.NetworkCall
import dk.shape.networking.forecast.ForecastGroupResponse
import dk.shape.networking.places.PlaceGroupResponse
import dk.shape.weatherstate.DI
import dk.shape.weatherstate.framework.redux.Action
import dk.shape.weatherstate.framework.redux.async.AsyncAction
import dk.shape.weatherstate.error_handling.ErrorActions
import dk.shape.weatherstate.forecast.FetchForecastSuccessful
import dk.shape.weatherstate.forecast.FetchForecastUnsuccessful
import dk.shape.weatherstate.forecast.asForecast


class FetchLocationsUnsuccessful(val errorMessage: String) : ErrorActions(errorMessage)
class FetchLocationsSuccessful(val places: List<Place>) : Action(places)

class FetchLocationsAction : AsyncAction(
    asyncFun = suspend {
        val networkCall = NetworkCall<PlaceGroupResponse>()
        networkCall.onResponse { forecastGroupResponse ->
            val places = forecastGroupResponse.asPlaces()
            DI.dispatch(FetchLocationsSuccessful(places))
        }
        networkCall.onFailure {
            DI.dispatch(FetchLocationsUnsuccessful(it.message ?: ""))
        }
        DI.weatherService?.placesQuery(ids = DI.woeIds.joinToString(","), networkCall = networkCall)
            ?: Unit
    })