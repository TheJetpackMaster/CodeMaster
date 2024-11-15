package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens;

import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenCustomTopBar() {
    // Number of stars to draw
    val starCount = 200

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.Transparent) // Transparent background for Canvas to take full space
            .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)) // Apply bottom radius
        // .border(1.dp, Color.Gray, RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)) // Optional border to highlight the shape
    ) {
        // Use Canvas to manually draw the blended colors and stars
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .blur(100.dp)  // Adjust blur for background effect
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width
                val height = size.height

                // Define the colors for the gradient
                val colorLeft = Color(0xFFbb5bc3)  // Purple (Left)
                val colorRight = Color(0xFF0750bc)  // Light Blue (Right)
                val colorTopLeft = Color(0xFF28889e)  // Deep Orange (Top Left)
                val colorTopCenter = Color(0xFF00040f)  // Violet (Top Center)

                // Create a sweeping gradient
                val gradientBrush = Brush.sweepGradient(
                    colors = listOf(
                        colorLeft,            // Purple at the far left
                        colorTopLeft,         // Deep Orange in the center-left
                        colorTopCenter,       // Violet toward the top-center
                        colorRight            // Light Blue at the far right
                    ),
                    center = Offset(width / 2, height / 2)   // Center of the canvas
                )

                // Apply the gradient across the entire canvas
                drawRect(
                    brush = gradientBrush,
                    size = size // Fill the entire canvas with the gradient
                )
            }
        }

        // Box for stars
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val width = size.width
                val height = size.height

                // Draw stars in the empty Box
                for (i in 0 until starCount) {
                    // Random position for each star
                    val starX = Random.nextFloat() * width
                    val starY = Random.nextFloat() * height

                    // Random size for each star (small)
                    val starSize = (1..3).random().toFloat() // Small size between 1 and 3 dp

                    drawCircle(
                        color = Color.White.copy(alpha = 0.6f), // White stars with some transparency
                        radius = starSize,
                        center = Offset(starX, starY)
                    )
                }
            }
        }

        TopAppBar(
            title = {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Circular button at the start of the title
                    IconButton(
                        onClick = { /* Handle button click */ },
                        modifier = Modifier
                            .background(
                                Color.Gray.copy(.5f),
                                shape = CircleShape
                            ) // Circular background
                            .size(50.dp) // Size of the circular button
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Menu, // Replace with any icon you prefer
                            contentDescription = "Menu",
                            tint = Color.White // White icon inside the gray circle
                        )
                    }

                    Spacer(Modifier.width(8.dp)) // Space between the button and the title

                    // Right Side Row with IconButton and Text
                    Spacer(Modifier.weight(1f)) // Push the elements to the right
                    Row(
                        modifier = Modifier
                            .width(160.dp)
                            .height(60.dp)
                            .padding(end = 8.dp)
                            .background(Color.Gray.copy(.5f), shape = CircleShape),
                        // horizontalArrangement = Arrangement.Center, // Center align the right side content
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Circular IconButton on the right side
                        IconButton(
                            onClick = { /* Handle button click */ },
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .background(Color.White, shape = CircleShape) // Circular background
                                .size(40.dp) // Size of the circular button
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Menu, // Replace with any icon you prefer
                                contentDescription = "Menu",
                                tint = Color.White // White icon inside the gray circle
                            )
                        }

                        Spacer(Modifier.width(8.dp)) // Space between the button and text

                        // Column with Name and Level
                        Column(
                            horizontalAlignment = Alignment.Start,
                        ) {
                            Text(
                                text = "Khubaib", // Replace with dynamic name
                                color = Color.White, // White text color
                                fontSize = 18.sp

                                // style = MaterialTheme.typography // Font size and weight
                            )
                            Text(
                                text = "400 Level", // Replace with dynamic level
                                color = Color(0xFFD1D1D1), // Light gray for level text
                                fontSize = 16.sp
                                // style = MaterialTheme.typography.body2 // Slightly smaller text for level
                            )
                        }
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent // Transparent so the canvas background is visible
            ),
        )

    }
}