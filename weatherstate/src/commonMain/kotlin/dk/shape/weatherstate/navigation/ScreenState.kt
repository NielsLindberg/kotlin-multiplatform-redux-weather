package dk.shape.weatherstate.navigation

data class ScreenState(
    val currentScreen: Screen = Screen.Home,
    val drawer: List<Screen> = listOf(Screen.Home, Screen.Places)
)