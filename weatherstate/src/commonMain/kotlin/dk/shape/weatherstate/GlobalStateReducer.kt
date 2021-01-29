package dk.shape.weatherstate

import dk.shape.weatherstate.error_handling.ErrorStateReducer
import dk.shape.weatherstate.framework.redux.Reducer
import dk.shape.weatherstate.forecast.ForecastReducer
import dk.shape.weatherstate.navigation.NavigationReducer
import dk.shape.weatherstate.places.PlacesReducer

val GlobalStateReducer: Reducer<GlobalState> = { old, action ->
    GlobalState(
        errorState = ErrorStateReducer(old.errorState, action),
        placesState = PlacesReducer(old.placesState, action),
        forecastState = ForecastReducer(old.forecastState, action),
        screenState = NavigationReducer(old.screenState, action)
    )
}