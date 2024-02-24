package edu.festu.ivankuznetsov.roomcomposesample.database.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.embedded.EventInfo
import java.util.UUID


@Entity(tableName = "events")
data class Event(@PrimaryKey
                 @ColumnInfo(name = "idEvent")
                 val idEvent: UUID = UUID.randomUUID(),
                 @Embedded
                 val eventInfo: EventInfo)
