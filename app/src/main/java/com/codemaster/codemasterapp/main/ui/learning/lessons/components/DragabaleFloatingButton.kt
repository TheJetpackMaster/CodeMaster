package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun DraggableFloatingButton(onClick: (Boolean) -> Unit) {
    // State for vertical offset
    var offsetY by remember { mutableStateOf(0f) }

    // Get screen dimensions and density
    val configuration = LocalConfiguration.current
    val density = LocalDensity.current

    // Convert dimensions to pixels
    val screenWidthPx = with(density) { configuration.screenWidthDp.dp.toPx() }
    val screenHeightPx = with(density) { configuration.screenHeightDp.dp.toPx() }
    val buttonHeightPx = with(density) { 35.dp.toPx() } // Height of the button

    // Set initial offset for center-right position
    if (offsetY == 0f) {
        offsetY = (screenHeightPx - buttonHeightPx) / 2 // Center vertically
    }

    Box(
        modifier = Modifier
            .offset {
                IntOffset(
                    x = (screenWidthPx - 60.dp.toPx()).roundToInt(), // Stick to the right side
                    y = offsetY.roundToInt()
                )
            }
            .padding(start = 24.dp)
            .width(40.dp)
            .height(35.dp)
            .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
            .border(
                BorderStroke(1.dp, Color.White),
                shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp)
            )
            .background(Color(0xFF1D2836))
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consume()
                    // Update the vertical offset within bounds
                    offsetY = (offsetY + dragAmount.y).coerceIn(0f, screenHeightPx - buttonHeightPx)
                }
            }
            .clickable {
                // Call the onClick callback and pass `true` when the button is clicked
                onClick(true)
            },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Edit,
            contentDescription = "Edit",
            modifier = Modifier.size(25.dp),
            tint = Color.White
        )
    }
}

