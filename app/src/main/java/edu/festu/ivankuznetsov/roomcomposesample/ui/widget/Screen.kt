package edu.festu.ivankuznetsov.roomcomposesample.ui.widget

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.festu.ivankuznetsov.roomcomposesample.ui.model.EventModel
import edu.festu.ivankuznetsov.roomcomposesample.ui.viewmodel.AppViewModelProvider
import edu.festu.ivankuznetsov.roomcomposesample.ui.viewmodel.EventListViewModel


@Composable
fun Screen(modifier: Modifier = Modifier,
           eventViewModel: EventListViewModel = viewModel(factory = AppViewModelProvider.Factory)){
    val eventListState by eventViewModel.retrieveEvents().collectAsState(listOf())
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { Log.d("SCREEN", "CLICKED") }) {
            Text(text = "NEW EVENT")
        }
        EventList(modifier = modifier, eventListState.map { EventModel(it) })
    }
}
