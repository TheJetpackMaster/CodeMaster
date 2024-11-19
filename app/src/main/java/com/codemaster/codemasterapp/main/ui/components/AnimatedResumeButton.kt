package com.codemaster.codemasterapp.main.ui.components;

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnimatedResumeButton(
    onClick: () -> Unit,
    buttonHeight:Dp = 38.dp,
    buttonBackgroundColor: Color = Color(0xFF0B8755),
    buttonTextColor: Color = Color.White,
    buttonText: String = "Resume",
    buttonTextSize: TextUnit = 12.sp,
    animatedButtonBorderColor1:Color = Color(0xFF0B8755), // Green
    animatedButtonBorderColor2:Color = Color(0xFFB9FBC0), // Green
) {
    // Infinite transition for animating the border color
    val infiniteTransition = rememberInfiniteTransition(label = "")
    val animatedBorderColor = infiniteTransition.animateColor(
        initialValue = animatedButtonBorderColor1, // Green
        targetValue = animatedButtonBorderColor2, // Light green
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 1200, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ), label = ""
    )

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 2.dp,
                color = animatedBorderColor.value,
                shape = (CircleShape)
            ) // Animated border
            .padding(2.dp)
    ) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = buttonBackgroundColor
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(buttonHeight)
        ) {
            Text(
                text = buttonText,
                color = buttonTextColor,
                fontSize = buttonTextSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
