package edu.festu.ivankuznetsov.roomcomposesample.database.repository

import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface CRUDRepository<T>{
    suspend fun create(t: T)
    fun readAll(): Flow<List<T>>
    suspend fun read(id: UUID): T?
    suspend fun update(t: T)
    suspend fun delete(t: T)
}