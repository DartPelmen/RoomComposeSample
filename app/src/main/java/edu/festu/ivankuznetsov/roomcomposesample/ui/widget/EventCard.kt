package edu.festu.ivankuznetsov.roomcomposesample.ui.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Card(modifier: Modifier = Modifier, eventName: String, eventDate: String){
        Row(modifier = modifier.width(360.dp)
            .height(64.dp)

            .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(Color(244,244,244,1))
            .padding(8.dp)
            .alpha(1f)) {
            Icon(imageVector = Icons.Filled.Check,
                contentDescription = "future avatar",
                modifier = Modifier
                    .clip(CircleShape)
                    .width(48.dp)
                    .height(48.dp))
            Column(modifier.fillMaxSize()){
                Text(text = eventName,
                    modifier = Modifier,
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal
                )
                Text(text = eventDate,
                    modifier = Modifier,
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic)
            }
        }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard(modifier: Modifier = Modifier){
    Card(modifier = modifier, eventName = "My event", eventDate = "24.02.2024 - 29.02.2024")
}
