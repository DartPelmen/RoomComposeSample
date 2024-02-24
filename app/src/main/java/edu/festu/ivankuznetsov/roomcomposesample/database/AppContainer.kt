package edu.festu.ivankuznetsov.roomcomposesample.database

import android.content.Context
import edu.festu.ivankuznetsov.roomcomposesample.database.repository.EventRepository
import edu.festu.ivankuznetsov.roomcomposesample.database.repository.EventRepositoryImpl

interface AppContainer {
    val eventRepository: EventRepository
}

class AppDataContainer(private val context: Context) : AppContainer {

    override val eventRepository: EventRepository by lazy {
        EventRepositoryImpl(EventDatabase.getDatabase(context).eventDao())
    }
}