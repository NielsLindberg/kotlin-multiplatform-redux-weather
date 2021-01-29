package dk.shape.weatherstate.forecast

data class Temperature(val value: Int,
                       val unit: TemperatureUnit
) {
    override fun toString(): String {
        return "$value ${unit.postFix}"
    }
}

sealed class TemperatureUnit(val postFix: String) {
    object Celsius : TemperatureUnit(postFix = "°C")
}