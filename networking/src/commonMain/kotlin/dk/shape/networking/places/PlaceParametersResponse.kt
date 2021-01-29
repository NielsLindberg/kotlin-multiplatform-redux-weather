package dk.shape.networking.places

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlaceParametersResponse(
        @SerialName("temp") val temperature: Float? = null,
        @SerialName("pressure") val pressure: Int? = null,
        @SerialName("humidity") val humidity: Int? = null,
        @SerialName("temp_min") val minTemperature: Float? = null,
        @SerialName("temp_max") val maxTemperature: Float? = null
)