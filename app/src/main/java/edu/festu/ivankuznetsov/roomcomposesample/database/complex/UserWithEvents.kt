package edu.festu.ivankuznetsov.roomcomposesample.database.complex

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.User
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.UserEventCross

data class UserWithEvents(@Embedded
                          val user: User,
                          @Relation(parentColumn = "idUser",
                              entityColumn = "eventId",
                              associateBy = Junction(UserEventCross::class))
                          val events: List<Event>)