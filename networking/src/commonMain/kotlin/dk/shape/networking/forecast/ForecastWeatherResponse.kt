package dk.shape.networking.forecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastWeatherResponse(
        @SerialName("id") val id: Int?,
        @SerialName("main") val name: String?,
        @SerialName("description") val description: String?,
        @SerialName("icon") val icon: String?
)