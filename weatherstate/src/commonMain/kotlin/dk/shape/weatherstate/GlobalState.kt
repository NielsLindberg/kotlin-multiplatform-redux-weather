package dk.shape.weatherstate

import dk.shape.weatherstate.error_handling.ErrorState
import dk.shape.weatherstate.forecast.ForecastState
import dk.shape.weatherstate.framework.redux.State
import dk.shape.weatherstate.navigation.ScreenState
import dk.shape.weatherstate.places.PlacesState

data class GlobalState(
    val errorState: ErrorState,
    val placesState: PlacesState,
    val forecastState: ForecastState,
    val screenState: ScreenState
): State

