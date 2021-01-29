package dk.shape.weatherstate.places

import dk.shape.weatherstate.forecast.Temperature

data class Place(
    val woeId: String,
    val city: String,
    val country: String,
    val temperature: Temperature,
    val weatherCode: Int,
    val icon: String? = "",
    val name: String? = "",
    val description: String? = ""
) {
    val weatherImageUrl get() = "https://openweathermap.org/img/wn/$icon@2x.png"
}