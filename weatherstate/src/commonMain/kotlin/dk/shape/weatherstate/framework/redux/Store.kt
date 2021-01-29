package dk.shape.weatherstate.framework.redux

interface Store<AppState: State> {
    fun dispatch(action: Action)
    val state: MutableState<AppState>
}