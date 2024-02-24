package edu.festu.ivankuznetsov.roomcomposesample.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import edu.festu.ivankuznetsov.roomcomposesample.EventsApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {

        initializer {
            EventListViewModel(eventApplication().container.eventRepository)
        }
    }
}


fun CreationExtras.eventApplication(): EventsApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as EventsApplication)