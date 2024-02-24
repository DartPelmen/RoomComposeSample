package edu.festu.ivankuznetsov.roomcomposesample.database.complex

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.User
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.UserEventCross

data class EventWithUsers(@Embedded
                          val event: Event,
                          @Relation(parentColumn = "eventId",
                              entityColumn = "idUser",
                              associateBy = Junction(UserEventCross::class))
                          val users: List<User>)