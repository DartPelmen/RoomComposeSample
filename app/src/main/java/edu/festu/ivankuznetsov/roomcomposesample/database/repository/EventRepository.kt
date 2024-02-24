package edu.festu.ivankuznetsov.roomcomposesample.database.repository

import edu.festu.ivankuznetsov.roomcomposesample.database.complex.EventWithSubEvents
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface EventRepository: CRUDRepository<Event> {
    override suspend fun create(t: Event)
    override fun readAll(): Flow<List<Event>>
    override suspend fun read(id: UUID): Event?
    override suspend fun update(t: Event)
    override suspend fun delete(t: Event)
    fun readAllWithSubEvents(): Flow<List<EventWithSubEvents>>
}
