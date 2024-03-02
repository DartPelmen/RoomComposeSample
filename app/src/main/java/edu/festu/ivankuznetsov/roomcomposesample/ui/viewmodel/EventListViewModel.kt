package edu.festu.ivankuznetsov.roomcomposesample.ui.viewmodel

import androidx.lifecycle.ViewModel
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.repository.EventRepository


class EventListViewModel(private val eventRepository: EventRepository): ViewModel() {
    fun retrieveEvents() = eventRepository.readAll()
    suspend fun add(event:Event){
        eventRepository.create(event)
    }
    fun retrieveWithSubEvents() = eventRepository.readAllWithSubEvents()
}