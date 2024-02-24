package edu.festu.ivankuznetsov.roomcomposesample.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import edu.festu.ivankuznetsov.roomcomposesample.database.complex.EventWithSubEvents
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import kotlinx.coroutines.flow.Flow
import java.util.UUID

@Dao
interface EventDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun add(event: Event)
    @Update
    suspend fun update(event: Event)
    @Delete
    suspend fun delete(event: Event)
    @Query("SELECT * FROM EVENTS")
    fun readAll(): Flow<List<Event>>
    @Query("SELECT * FROM EVENTS WHERE idEvent = :id")
    suspend fun readById(id: UUID):Event?

    @Transaction
    @Query("SELECT * FROM events")
    fun getEventWithSubEvents(): Flow<List<EventWithSubEvents>>
}