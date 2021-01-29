package dk.shape.weatherstate.framework.redux

open class Action(val payload: Any? = null) {
    override fun toString(): String {
        return payload.toString()
    }
}