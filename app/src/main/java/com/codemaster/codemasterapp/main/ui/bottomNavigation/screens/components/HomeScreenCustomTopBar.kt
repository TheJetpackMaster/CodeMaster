package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import kotlin.random.Random
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.showToast
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.greenishPython

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun HomeScreenCustomTopBar(
    onProfileClick: () -> Unit,
    userProfileImage: ByteArray? = null,
    userName: String? = ""

) {

    val context = LocalContext.current

    // Remember Lottie composition
    val composition =
        rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.homescreentopbarlotie))

    // Animate the Lottie composition with looping enabled
    val progress = animateLottieCompositionAsState(
        composition = composition.value,
        iterations = LottieConstants.IterateForever
    )


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))

    ) {

        // Background with gradient and coding elements
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // Gradient Background
            drawRect(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF171B21), // Dark Grey
                        Color(0xFF30475E), // Cool Blue
                        Color(0xFF65A9BD)  // Warm Orange highlight
                    )
                ),
                size = size
            )

            // Binary numbers
            for (i in 0..10) {
                drawContext.canvas.nativeCanvas.drawText(
                    "1010 0101 1100",
                    Random.nextFloat() * width,
                    Random.nextFloat() * height,
                    Paint().apply {
                        color = android.graphics.Color.WHITE
                        alpha = 30 // Low opacity
                        textSize = 20f
                        isAntiAlias = true
                    }
                )
            }

            // Circle-like Paths (more added)
            for (i in 1..2) {
                val centerX = Random.nextFloat() * width
                val centerY = Random.nextFloat() * height
                drawCircle(
                    color = Color.White.copy(alpha = 0.1f),
                    radius = 60f * i,
                    center = Offset(centerX, centerY),
                    style = Stroke(width = 2f)
                )
            }

            // </> Coding Symbols
            for (i in 0..5) {
                drawContext.canvas.nativeCanvas.drawText(
                    "</>",
                    Random.nextFloat() * width,
                    Random.nextFloat() * height,
                    Paint().apply {
                        color = android.graphics.Color.WHITE
                        alpha = 30 // Low opacity
                        textSize = 30f
                        isAntiAlias = true
                    }
                )
            }

            // Curved Brackets
            val bracketPath = Path().apply {
                moveTo(width * 0.15f, height * 0.1f)
                cubicTo(
                    width * 0.05f, height * 0.3f,
                    width * 0.25f, height * 0.5f,
                    width * 0.15f, height * 0.7f
                )
            }
            drawPath(
                path = bracketPath,
                color = Color.White.copy(alpha = 0.15f),
                style = Stroke(width = 2f)
            )

            // Circuit-like paths (more dynamic)
            for (i in 1..3) {
                val startX = Random.nextFloat() * width
                val startY = Random.nextFloat() * height
                val endX = Random.nextFloat() * width
                val endY = Random.nextFloat() * height
                drawLine(
                    color = Color.White.copy(alpha = 0.15f),
                    start = Offset(startX, startY),
                    end = Offset(endX, endY),
                    strokeWidth = 2f
                )
            }
        }



        LottieAnimation(
            composition = composition.value,
            progress = { progress.value },
            modifier = Modifier
                .fillMaxWidth(.6f)
                .scale(2.1f)
                .padding(end = 60.dp)
                .align(Alignment.Center)
        )

        // Foreground Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Notification Icon
                IconButton(
                    onClick = {
                        showToast(context = context,"You don't have any notifications yet!")
                    },
                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(greenishPython.copy(.2f), bluishPython.copy(.2f))
                            ),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .border(1.dp, Color.White.copy(.2f), shape = RoundedCornerShape(16.dp))
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.White
                    )
                }

                // Profile Section
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .height(64.dp)
                        .widthIn(max = 150.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(greenishPython.copy(.2f), bluishPython.copy(.2f))
                            )
                        )
                        .clickable(onClick = { onProfileClick() })
                        .border(1.dp, Color.White.copy(.2f), shape = RoundedCornerShape(16.dp))
                        .padding(12.dp)
                ) {
                    // Profile Picture
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .border(1.dp,Color.White.copy(.5f),CircleShape)
                            .clip(CircleShape)
                            .background(Color.LightGray.copy(0.4f)),
                        contentAlignment = Alignment.Center
                    ) {
                        GlideImage(
                            model = userProfileImage,
                        contentDescription = "Profile Picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Name and Points
                    Column {
                        Text(
                            text = userName.toString(),
                            maxLines = 1,
                            style = MaterialTheme.typography.bodyLarge.copy(
                                color = Color.White,
                                fontWeight = FontWeight.Medium
                            ),
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = "1520 pts",
                            color = Color(0xFFD1D1D1),
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color(0xFFD1D1D1),
                            )
                        )
                    }
                }
            }
        }
    }
}


//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreenCustomTopBar(
//    onProfileClick: () -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(180.dp)
//            .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
//    ) {
//        // Background with gradient and abstract coding elements
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            val width = size.width
//            val height = size.height
//
//            // Gradient Background
//            drawRect(
//                brush = Brush.verticalGradient(
//                    colors = listOf(
//                        Color(0xFF222831), // Dark Grey
//                        Color(0xFF30475E), // Cool Blue
//                        Color(0xFFF2A365)  // Warm Orange highlight
//                    )
//                ),
//                size = size
//            )
//
//            // Coding-Inspired Designs
//            // Binary numbers
//            for (i in 0..20) {
//                drawContext.canvas.nativeCanvas.drawText(
//                    "1010 0101 1100",
//                    Random.nextFloat() * width,
//                    Random.nextFloat() * height,
//                    android.graphics.Paint().apply {
//                        color = android.graphics.Color.WHITE
//                        alpha = 50 // Low opacity
//                        textSize = 20f
//                        isAntiAlias = true
//                    }
//                )
//            }
//
//            // Curved Brackets
//            val bracketPath = Path().apply {
//                moveTo(width * 0.2f, height * 0.1f)
//                cubicTo(
//                    width * 0.1f, height * 0.3f,
//                    width * 0.3f, height * 0.5f,
//                    width * 0.2f, height * 0.7f
//                )
//            }
//            drawPath(
//                path = bracketPath,
//                color = Color.White.copy(alpha = 0.1f),
//                style = Stroke(width = 2f)
//            )
//
//
//
//            // Circuit-like paths
//            val circuitPath = Path().apply {
//                moveTo(width * 0.8f, height * 0.2f)
//                lineTo(width * 0.7f, height * 0.4f)
//                lineTo(width * 0.9f, height * 0.6f)
//            }
//            drawPath(
//                path = circuitPath,
//                color = Color.White.copy(alpha = 0.15f),
//                style = Stroke(width = 3f)
//            )
//
//        }
//
//        // Foreground Content
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp)
//                .statusBarsPadding()
//        ) {
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                // Notification Icon
//                IconButton(
//                    onClick = { /* Notification click */ },
//                    modifier = Modifier
//                        .size(40.dp)
//                        .background(Color.White.copy(alpha = 0.1f), shape = CircleShape)
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = "Notifications",
//                        tint = Color.White
//                    )
//                }
//
//                // Profile Section
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color.White.copy(alpha = 0.1f))
//                        .clickable(onClick = { onProfileClick() })
//                        .padding(8.dp)
//                ) {
//                    // Profile Picture
//                    Box(
//                        modifier = Modifier
//                            .size(40.dp)
//                            .clip(CircleShape)
//                            .background(Color.Gray.copy(0.4f)),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.person),
//                            contentDescription = "Profile Picture",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier.size(30.dp)
//                        )
//                    }
//
//                    Spacer(modifier = Modifier.width(8.dp))
//
//                    // Name and Points
//                    Column {
//                        Text(
//                            text = "Alan Cooper",
//                            color = Color.White,
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                        Text(
//                            text = "1520 pts",
//                            color = Color(0xFFD1D1D1),
//                            fontSize = 14.sp
//                        )
//                    }
//                }
//            }
//        }
//    }
//}


//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreenCustomTopBar(
//    onProfileClick: () -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(180.dp)
//            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
//    ) {
//
//        // Background with abstract geometric shapes
//        Canvas(modifier = Modifier.fillMaxSize()) {
//            val width = size.width
//            val height = size.height
//
//            // Gradient Background
//            drawRect(
//                brush = Brush.verticalGradient(
//                    colors = listOf(
//                        Color(0xFF222831), // Dark Grey
//                        Color(0xFF30475E), // Cool Blue
//                        Color(0xFFF2A365)  // Warm Orange highlight
//                    )
//                ),
//                size = size
//            )
//
//            // Geometric Triangle Design
//            val trianglePath = Path().apply {
//                moveTo(width * 0.2f, height * 0.4f) // Bottom-left corner
//                lineTo(width * 0.5f, height * 0.1f) // Top-center
//                lineTo(width * 0.8f, height * 0.4f) // Bottom-right corner
//                close()
//            }
//
//            drawPath(
//                path = trianglePath,
//                color = Color(0x55FFFFFF), // Semi-transparent white
//            )
//
//            // Smaller triangle for depth
//            val smallTrianglePath = Path().apply {
//                moveTo(width * 0.3f, height * 0.5f) // Slightly below
//                lineTo(width * 0.5f, height * 0.3f)
//                lineTo(width * 0.7f, height * 0.5f)
//                close()
//            }
//
//            drawPath(
//                path = smallTrianglePath,
//                color = Color(0x33FFFFFF) // Even lighter white for subtle layering
//            )
//
//            for (i in 0..10) {
//                drawLine(
//                    color = Color(0x22FFFFFF), // Faint diagonal texture
//                    start = Offset(0f, size.height * i / 10),
//                    end = Offset(size.width, size.height * (i + 0.5f) / 10),
//                    strokeWidth = 1.5f
//                )
//            }
//
//        }
//
//
//
//        // Foreground Content
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .statusBarsPadding()
//        ) {
//            Row(
//                modifier = Modifier.fillMaxWidth()
//                    .padding(start = 10.dp, end = 10.dp),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                // Notification Icon
//                IconButton(
//                    onClick = { /* Notification click */ },
//                    modifier = Modifier
//                        .size(40.dp)
//                        .background(Color.White.copy(alpha = 0.1f), shape = CircleShape)
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = "Notifications",
//                        tint = Color.White
//                    )
//                }
//
//                // Profile Section
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color.White.copy(alpha = 0.1f))
//                        .clickable(onClick = {
//                            onProfileClick()
//                        })
//                        .padding(6.dp)
//                ) {
//                    // Profile Picture
//                    Box(
//                        modifier = Modifier
//                            .size(40.dp)
//                            .clip(CircleShape)
//                            .background(Color.Gray.copy(0.4f)), // Placeholder for the profile image
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.person),
//                            contentDescription = "Profile Picture",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier.size(30.dp)
//                        )
//                    }
//
//                    Spacer(modifier = Modifier.width(8.dp))
//
//                    // Name and Points
//                    Column {
//                        Text(
//                            text = "Alan Cooper",
//                            color = Color.White,
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                        Text(
//                            text = "1520 pts",
//                            color = Color(0xFFD1D1D1),
//                            fontSize = 14.sp
//                        )
//                    }
//                }
//            }
//        }
//    }
//}
//


//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreenCustomTopBar(
//    onProfileClick:()->Unit
//) {
//    // Number of stars to draw
//    val starCount = 300
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(180.dp) // Increased height to accommodate all content
//            .background(Color.Transparent)
//            .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)) // Rounded corners at the bottom
//    ) {
//        // Gradient Background with Stars
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(180.dp)
//                .blur(100.dp)
//        ) {
//            Canvas(modifier = Modifier.fillMaxSize()) {
//                val width = size.width
//                val height = size.height
//
//                val gradientBrush = Brush.sweepGradient(
//                    colors = listOf(
//                        Color(0xFFbb5bc3),
//                        Color(0xFF28889e),
//                        Color(0xFF00040f),
//                        Color(0xFF0750bc)
//                    ),
//                    center = Offset(width / 2, height / 2)
//                )
//
//                drawRect(
//                    brush = gradientBrush,
//                    size = size
//                )
//            }
//        }
//
//        Box(modifier = Modifier.fillMaxSize()) {
//            Canvas(modifier = Modifier.fillMaxSize()) {
//                val width = size.width
//                val height = size.height
//                for (i in 0 until starCount) {
//                    val starX = Random.nextFloat() * width
//                    val starY = Random.nextFloat() * height
//                    val starSize = (1..3).random().toFloat()
//                    drawCircle(
//                        color = Color.White.copy(alpha = 0.1f),
//                        radius = starSize,
//                        center = Offset(starX, starY)
//                    )
//                }
//            }
//        }
//
//        // Top Section with Profile
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp)
//                .statusBarsPadding()
//
//        ) {
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                // Notification Icon
//                IconButton(
//                    onClick = { /* Notification click */ },
//                    modifier = Modifier
//                        .size(40.dp)
//                        .background(Color.White.copy(alpha = 0.1f), shape = CircleShape)
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Notifications,
//                        contentDescription = "Notifications",
//                        tint = Color.White
//                    )
//                }
//
//                // Profile Section
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier
//                        .clip(RoundedCornerShape(20.dp))
//                        .background(Color.White.copy(alpha = 0.1f))
//                        .clickable(onClick = {
//                            onProfileClick()
//                        })
//                        .padding(8.dp)
//                ) {
//                    // Profile Picture
//                    Box(
//                        modifier = Modifier
//                            .size(40.dp)
//                            .clip(CircleShape)
//                            .background(Color.Gray.copy(0.4f)), // Placeholder for the profile image
//                        contentAlignment = Alignment.Center
//
//                    ) {
//                        // Replace with actual Image
//                        Image(
//                            painter = painterResource(id = R.drawable.person),
//                            contentDescription = "Profile Picture",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier.size(30.dp)
//                        )
//                    }
//
//                    Spacer(modifier = Modifier.width(8.dp))
//
//                    // Name and Points
//                    Column {
//                        Text(
//                            text = "Alan Cooper",
//                            color = Color.White,
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                        Text(
//                            text = "1520 pts",
//                            color = Color(0xFFD1D1D1),
//                            fontSize = 14.sp
//                        )
//                    }
//                }
//            }
//        }
//    }
//}
//


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
