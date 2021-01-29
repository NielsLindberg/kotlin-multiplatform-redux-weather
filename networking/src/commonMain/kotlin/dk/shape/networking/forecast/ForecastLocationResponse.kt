package dk.shape.networking.forecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastLocationResponse(@SerialName("lat") val latitude: Double?,
                                    @SerialName("lon") val longitude: Double?)