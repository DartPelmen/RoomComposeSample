package edu.festu.ivankuznetsov.roomcomposesample.database.repository

import edu.festu.ivankuznetsov.roomcomposesample.database.dao.EventDao
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import kotlinx.coroutines.flow.Flow
import java.util.UUID

class EventRepositoryImpl(private val eventDao: EventDao):
    EventRepository {
    override suspend fun create(t: Event) = eventDao.add(t)
    override fun readAll(): Flow<List<Event>> = eventDao.readAll()
    override suspend fun read(id: UUID): Event? = eventDao.readById(id)
    override suspend fun update(t: Event)  = eventDao.update(t)
    override suspend fun delete(t: Event) = eventDao.delete(t)
    override fun readAllWithSubEvents() = eventDao.getEventWithSubEvents()
}