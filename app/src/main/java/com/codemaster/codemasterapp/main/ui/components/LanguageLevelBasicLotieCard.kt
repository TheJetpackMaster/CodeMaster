package com.codemaster.codemasterapp.main.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R

@Composable
fun LanguageLevelBasicLotieCard(){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(horizontal = 10.dp)
            .clip(RoundedCornerShape(8.dp)) // Rounded corners for elegance
            .background(Color.Transparent) // Transparent background to blend

    ) {
        // Gradient Background
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF2D3047), // Deep blue-gray
                            Color(0xFF4A4E69)  // Soft purple-gray
                        ),
                        start = Offset(0f, 0f),
                        end = Offset(0f, 400f) // Adjust gradient direction
                    )
                )
        )

        // Subtle Overlay with Stars
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .blur(8.dp) // Add subtle blur to soften edges
        ) {
            val width = size.width
            val height = size.height
            val starColor = Color(0xFFFFFFFF) // Soft white with transparency

            for (i in 1..30) { // Add random small stars
                val x = (0..width.toInt()).random().toFloat()
                val y = (0..height.toInt()).random().toFloat()
                drawCircle(
                    color = starColor,
                    radius = (2..4).random().toFloat(),
                    center = Offset(x, y)
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Remember Lottie composition
            val composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.introcodinglotie))

            // Animate the Lottie composition with looping enabled
            val progress = animateLottieCompositionAsState(
                composition = composition.value,
                iterations = LottieConstants.IterateForever // Loop infinitely
            )

            // Lottie Animation
            LottieAnimation(
                composition = composition.value,
                progress = { progress.value },
                modifier = Modifier
                    .fillMaxSize()
                    .scale(2.5f)
                    .align(Alignment.CenterHorizontally)
            )
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
