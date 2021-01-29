package dk.shape.networking.places

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlaceDetailsResponse(
        @SerialName("type") val type: Int? = null,
        @SerialName("id") val id: Int? = null,
        @SerialName("country") val countryCode: String? = null,
        @SerialName("sunrise") val sunrise: Long? = null,
        @SerialName("sunset") val sunset: Long? = null
)