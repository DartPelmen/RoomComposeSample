package edu.festu.ivankuznetsov.roomcomposesample.ui.model

import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import java.time.format.DateTimeFormatter

class EventModel(event: Event){
     val name: String
     val description: String
     val date: String
    init {
        name = event.eventInfo.eventName
        description = event.eventInfo.eventDescription
        date = "${event.eventInfo.startDate.format(formatter)} - ${event.eventInfo.endDate.format(formatter)}"
    }
    companion object{
        private val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")
    }
}