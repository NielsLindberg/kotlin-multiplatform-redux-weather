package dk.shape.networking.places

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlaceWeatherResponse(
        @SerialName("id") val id: Int? = null,
        @SerialName("main") val name: String? = null,
        @SerialName("description") val description: String? = null,
        @SerialName("icon") val icon: String? = null
)