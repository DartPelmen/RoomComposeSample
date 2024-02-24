package edu.festu.ivankuznetsov.roomcomposesample.database.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.embedded.EventInfo
import java.time.LocalDateTime
import java.util.UUID

@Entity(tableName = "subEvents",
    foreignKeys = [ForeignKey(entity = Event::class,
                              parentColumns = ["idEvent"],
                              childColumns = ["eventId"],
                              onDelete = ForeignKey.RESTRICT,
                              onUpdate = ForeignKey.CASCADE)])
data class SubEvent(@PrimaryKey
                    @ColumnInfo(name = "idEvent")
                    val idEvent: UUID = UUID.randomUUID(),
                    @Embedded
                    val eventInfo: EventInfo,
                    @ColumnInfo(name = "eventId")
                    val parentEventId: UUID)
