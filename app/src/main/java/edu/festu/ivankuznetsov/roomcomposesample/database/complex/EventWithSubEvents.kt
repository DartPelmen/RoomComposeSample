package edu.festu.ivankuznetsov.roomcomposesample.database.complex

import androidx.room.Embedded
import androidx.room.Relation
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.SubEvent

data class EventWithSubEvents(@Embedded
                              private val event: Event,
                              @Relation(
                                  parentColumn = "idEvent",
                                  entityColumn = "eventId")
                              val playlists: List<SubEvent>)