package dk.shape.weatherstate.utils

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun unixToDate(unix: Long?): LocalDateTime? {
    if(unix == null) return null
    return Instant.fromEpochMilliseconds(unix).toLocalDateTime(TimeZone.currentSystemDefault())
}

fun LocalDateTime.longDate(): String {
    return date.toString()
}
fun LocalDateTime.hourMinute() = "$hour:$minute"