package edu.festu.ivankuznetsov.roomcomposesample.database.entity.embedded

import androidx.room.ColumnInfo
import java.time.LocalDateTime

data class EventInfo(
                     @ColumnInfo(name = "eventName")
                     val eventName: String,
                     @ColumnInfo(name = "eventDescription", defaultValue = "")
                     val eventDescription: String = "",
                     @ColumnInfo(name = "startDate")
                     val startDate: LocalDateTime = LocalDateTime.now(),
                     @ColumnInfo(name = "endDate")
                     val endDate: LocalDateTime = LocalDateTime.now())
