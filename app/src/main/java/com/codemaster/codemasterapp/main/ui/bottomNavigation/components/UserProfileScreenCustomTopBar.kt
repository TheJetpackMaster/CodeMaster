package com.codemaster.codemasterapp.main.ui.bottomNavigation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
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
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import kotlin.random.Random
import androidx.compose.runtime.*
import com.airbnb.lottie.compose.LottieAnimation
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserProfileScreenCustomTopBar() {

    // Load Lottie composition (achievement animation)
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.achivment))

    // Animate the Lottie composition
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever // Infinite loop for continuous animation
    )

    // Main Box layout for the top bar
    Box(
        modifier = Modifier
            .fillMaxWidth() // Fill the entire width of the screen
            .height(200.dp) // Set height of the top bar
            .background(Color.Transparent) // Set the background as transparent
    ) {
        // Gradient Background with blurred stars effect
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .blur(100.dp) // Blur effect on background for smooth look
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width
                val height = size.height

                // Create a sweep gradient effect from center
                val gradientBrush = Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFF4A90E2), // Base Blue
                        Color(0xFF3578C5), // Darker Blue (variant of the base color)
                        Color(0xFF75A9EB)  // Lighter Blue (variant of the base color)
                    ),
                    center = Offset(
                        width / 2,
                        height / 2
                    ) // Gradient center in the middle of the screen
                )

                // Draw the gradient fill on the canvas
                drawRect(
                    brush = gradientBrush,
                    size = size
                )
            }
        }

        // Wave effect drawn on top of the gradient
        Box {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val waveHeight = size.height * 0.3f // Adjust wave height here

                val wavePath = Path().apply {
                    moveTo(0f, waveHeight) // Start the path at the specified wave height

                    // Create a cubic Bézier curve for the wave
                    cubicTo(
                        size.width * 0.25f, waveHeight - (waveHeight * 0.5f), // Control point 1
                        size.width * 0.75f, waveHeight + (waveHeight * 0.5f), // Control point 2
                        size.width, waveHeight // End point of the curve
                    )

                    // Close the path to fill the top section
                    lineTo(size.width, 0f)
                    lineTo(0f, 0f)
                    close()
                }

                // Draw the wave path with a white color and low opacity
                drawPath(
                    path = wavePath,
                    color = Color.White.copy(0.1f)
                )
            }
        }

        // Top section with profile details and buttons
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding() // Avoid overlap with status bar
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth() // Take the full width of the screen
                    .padding(horizontal = 0.dp), // Padding for row elements
                horizontalArrangement = Arrangement.SpaceBetween, // Place items at opposite ends
                verticalAlignment = Alignment.CenterVertically // Vertically align the items in the center
            ) {
                // Arrow Back Button (for navigation)
                IconButton(
                    onClick = {
                        // Handle back navigation (you can add action here)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft, // Left arrow icon
                        contentDescription = "Back",
                        tint = Color.White // Set the color of the icon to white
                    )
                }

                // Settings Button
                Button(
                    onClick = { /* Handle settings action here */ },
                    modifier = Modifier
                        .padding(
                            horizontal = 16.dp,
                            vertical = 16.dp
                        ), // Add padding around the button
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA726)) // Set button background color
                ) {
                    Text("Setting", color = Color.White) // Text inside the button (white color)
                }
            }

            // Profile Section
            Column(
                horizontalAlignment = Alignment.Start, // Align text to the left
                modifier = Modifier
                    .fillMaxWidth() // Take full width of the screen
                    .padding(start = 16.dp) // Padding around the profile content
            ) {
                // Row to align image and text
                Row(
                    horizontalArrangement = Arrangement.Center, // Center-align horizontally
                    verticalAlignment = Alignment.CenterVertically // Vertically center-align
                ) {

                    Column(
                        modifier = Modifier
                            .size(60.dp) // Set image size
                            .background(
                                color = Color.White.copy(0.2f),
                                shape = CircleShape
                            )
                            .border(
                                BorderStroke(
                                    1.dp,
                                    Color.White
                                ), // Fix: Wrap `1.dp` in a `BorderStroke` object
                                shape = CircleShape
                            )
                            .clip(CircleShape), // Clip the image into a circle
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // User Image with Circular Shape and White Border
                        /*Image(
                        painter = painterResource(id = R.drawable.badge), // User's profile image
                        contentDescription = "User Profile Image",
                        modifier = Modifier
                            .size(50.dp) // Set image size
                            .background(Color.Black, shape = CircleShape) // Set black background and clip to circle shape
                            .clip(CircleShape) // Clip the image into a circle
                            .border(
                                2.dp,
                                Color.White,
                                CircleShape
                            ) // Add a white border around the circle image
                    )*/
                        Icon(
                            modifier = Modifier.size(40.dp),
                            imageVector = Icons.Default.Person, // Left arrow icon
                            contentDescription = "Back",
                            tint = Color.White // Set the color of the icon to white
                        )
                    }
                    Spacer(modifier = Modifier.width(16.dp)) // Spacer to create space between the image and text

                    // Column to display username and "Winner" text
                    Column(
                        horizontalAlignment = Alignment.Start // Align text to the left
                    ) {
                        Text(
                            text = "Parvez Mayar", // Username text (dynamic username can be used here)
                            style = MaterialTheme.typography.bodyMedium, // Text style for username
                        )

                        // Winner Text
                        Text(
                            text = "Winner", // Static or dynamic "Winner" text
                            style = MaterialTheme.typography.bodyMedium, // Optional: Style the text
                            modifier = Modifier.padding(top = 4.dp) // Padding between the username and winner text
                        )
                    }
                }
            }
        }
    }
}
