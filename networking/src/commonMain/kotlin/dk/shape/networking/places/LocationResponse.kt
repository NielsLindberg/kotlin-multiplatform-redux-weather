package dk.shape.networking.places

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocationResponse(@SerialName("lat") val latitude: Double? = null,
                            @SerialName("lon") val longitude: Double? = null)