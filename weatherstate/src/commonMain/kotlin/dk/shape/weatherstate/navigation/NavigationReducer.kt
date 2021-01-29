package dk.shape.weatherstate.navigation

import dk.shape.weatherstate.framework.redux.Reducer

val NavigationReducer: Reducer<ScreenState> = { old, action ->
    when (action) {
        is NavigateActions.HomeScreen -> old.copy(currentScreen = Screen.Home)
        is NavigateActions.ForecastScreen -> old.copy(currentScreen = Screen.Forecast(action.place))
        is NavigateActions.PlacesScreen -> old.copy(currentScreen = Screen.Places)
        else -> old
    }
}