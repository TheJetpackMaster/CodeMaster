package com.codemaster.codemasterapp.main.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.R
import kotlin.random.Random

@Composable
fun LanguageLevelOverviewCard(){
    // Number of stars to draw
    val starCount = 10

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp) // Increased height to accommodate all content
            .background(Color.Transparent)
            .clip(RoundedCornerShape(20.dp)) // Rounded corners at the bottom
    ) {
        // Gradient Background with Stars
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .blur(100.dp)
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width
                val height = size.height

                val gradientBrush = Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFbb5bc3),
                        Color(0xFF28889e),
                        Color(0xFF00040f),
                        Color(0xFF0750bc)
                    ),
                    center = Offset(width / 2, height / 2)
                )

                drawRect(
                    brush = gradientBrush,
                    size = size
                )
            }
        }

        /*Box(modifier = Modifier.fillMaxSize()) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width
                val height = size.height
                for (i in 0 until starCount) {
                    val starX = Random.nextFloat() * width
                    val starY = Random.nextFloat() * height
                    val starSize = (50..100).random().toFloat()
                    drawCircle(
                        color = Color.White.copy(alpha = 0.6f),
                        radius = starSize,
                        center = Offset(starX, starY)
                    )
                }
            }
        }*/

        // Top Section with Profile
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .statusBarsPadding()

        ) {

        }
    }
}



@Composable
fun UserActivityIndicator(
    progress: Float, // Progress value (0.0f to 1.0f)
    icon: ImageVector, // Icon to display
    dateText: String, // Text to display below the indicator
    circleSize: Dp = 60.dp, // Size of the circular indicator
    iconSize: Dp = 35.dp, // Size of the icon inside the circle
    strokeColor: Color = Color.White, // Color for the progress stroke
    backgroundStrokeColor: Color = Color.Gray.copy(alpha = 0f), // Background stroke color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(circleSize)
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.1f)),
            contentAlignment = Alignment.Center
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val strokeWidth = 5.dp.toPx()
                drawCircle(
                    color = backgroundStrokeColor,
                    style = Stroke(width = strokeWidth)
                )
                drawArc(
                    color = strokeColor,
                    startAngle = -90f,
                    sweepAngle = 360f * progress,
                    useCenter = false,
                    style = Stroke(width = strokeWidth)
                )
            }
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier.size(iconSize)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = dateText,
            color = Color.White,
            fontSize = 12.sp
        )
    }
}
