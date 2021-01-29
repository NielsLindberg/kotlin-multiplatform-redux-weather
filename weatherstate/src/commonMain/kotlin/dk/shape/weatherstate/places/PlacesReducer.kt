package dk.shape.weatherstate.places

import dk.shape.weatherstate.framework.redux.Reducer

val PlacesReducer: Reducer<PlacesState> = { old, action ->
    when (action) {
        is FetchLocationsSuccessful -> old.copy(places = action.places, errorMessage = null)
        is FetchLocationsUnsuccessful -> old.copy(errorMessage = action.errorMessage)
        else -> old
    }
}