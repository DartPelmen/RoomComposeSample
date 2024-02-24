package edu.festu.ivankuznetsov.roomcomposesample.database.entity

import androidx.room.Entity
import java.util.UUID

@Entity(primaryKeys = ["eventId", "userId"])
data class UserEventCross(val eventId: UUID, val userId: UUID)