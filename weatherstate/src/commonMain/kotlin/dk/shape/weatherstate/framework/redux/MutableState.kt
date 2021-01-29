package dk.shape.weatherstate.framework.redux

interface MutableState<S: State> {
    var value: S
}

class MutabaleStateImpl<S: State>(state: S): MutableState<S> {
    override var value: S = state
}
fun <S: State>mutableStateOf(state: S): MutableState<S> = MutabaleStateImpl(state)
