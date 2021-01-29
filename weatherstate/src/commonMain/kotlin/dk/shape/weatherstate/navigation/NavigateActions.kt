package dk.shape.weatherstate.navigation

import dk.shape.weatherstate.framework.redux.Action
import dk.shape.weatherstate.places.Place

sealed class NavigateActions: Action() {
    object HomeScreen: NavigateActions()
    object PlacesScreen: NavigateActions()
    class ForecastScreen(val place: Place): NavigateActions()
}