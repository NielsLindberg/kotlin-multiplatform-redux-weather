package dk.shape.networking.places

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlaceGroupResponse(
        @SerialName("cnt") val count: Int? = null,
        @SerialName("list") val places: List<PlaceResponse>? = null
)