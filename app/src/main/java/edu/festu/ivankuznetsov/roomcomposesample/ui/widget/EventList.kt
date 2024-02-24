package edu.festu.ivankuznetsov.roomcomposesample.ui.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.embedded.EventInfo
import edu.festu.ivankuznetsov.roomcomposesample.ui.model.EventModel
import java.time.LocalDateTime

@Composable
fun EventList(
    modifier: Modifier, events: List<EventModel>
) {
    LazyColumn(modifier = modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(4.dp)){
        items(events) {
            Card(modifier = Modifier,
                eventName = it.name,
                eventDate = it.date)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEventList(modifier: Modifier = Modifier) {
    val list = listOf(
        Event(
            eventInfo = EventInfo(
                "My first Event",
                "My first Event Desc",
                LocalDateTime.now(),
                LocalDateTime.now()
            )
        ),
        Event(
            eventInfo = EventInfo(
                "My second Event",
                "My second Event Desc",
                LocalDateTime.now(),
                LocalDateTime.now()
            )
        )
    )
    EventList(modifier = Modifier, events = list.map { x-> EventModel(x) })
}