package dk.shape.weatherstate.navigation

import dk.shape.weatherstate.places.Place

sealed class Screen(val index: Int, val title: String, val action: NavigateActions) {
    object Home : Screen(0, "Home", NavigateActions.HomeScreen)
    object Places : Screen(1, "Places", NavigateActions.PlacesScreen)
    class Forecast(val place: Place) : Screen(2, place.city, NavigateActions.ForecastScreen(place))
}