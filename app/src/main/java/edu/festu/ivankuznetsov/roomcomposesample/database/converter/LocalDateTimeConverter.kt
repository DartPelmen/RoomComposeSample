package edu.festu.ivankuznetsov.roomcomposesample.database.converter

import androidx.room.TypeConverter
import java.time.LocalDateTime
import java.time.ZoneOffset

public class LocalDateTimeConverter{
    @TypeConverter
    fun timestampFromDate(date: LocalDateTime?): Long? {
        return date?.toEpochSecond(ZoneOffset.UTC)
    }

    @TypeConverter
    fun dateFromTimestamp(timestamp: Long?): LocalDateTime? {
        return timestamp?.let {
            LocalDateTime.ofEpochSecond(it,0, ZoneOffset.UTC)
        }
    }
}