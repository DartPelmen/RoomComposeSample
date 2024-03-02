package edu.festu.ivankuznetsov.roomcomposesample.ui.widget

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewModelScope
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.Event
import edu.festu.ivankuznetsov.roomcomposesample.database.entity.embedded.EventInfo
import edu.festu.ivankuznetsov.roomcomposesample.ui.model.EventModel
import edu.festu.ivankuznetsov.roomcomposesample.ui.viewmodel.EventListViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel
import java.time.LocalDateTime


@Composable
fun Screen(
    modifier: Modifier = Modifier,
    eventViewModel: EventListViewModel = koinViewModel()
) {
    val eventListState by eventViewModel.retrieveEvents().collectAsState(listOf())
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            eventViewModel.viewModelScope.launch {
                eventViewModel.add(
                    Event(
                        eventInfo = EventInfo(
                            eventName = "My Name",
                            eventDescription = "blank",
                            startDate = LocalDateTime.now(),
                            endDate = LocalDateTime.now()
                        )
                    )
                )
            }
        }) {
            Text(text = "NEW EVENT")
        }
        EventList(modifier = modifier, eventListState.map { EventModel(it) })
    }
}
