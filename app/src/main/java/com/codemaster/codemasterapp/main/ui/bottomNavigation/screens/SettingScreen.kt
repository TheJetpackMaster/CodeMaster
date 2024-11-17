package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.UserProfileScreenCustomTopBar
import com.codemaster.codemasterapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        modifier = Modifier
                            .size(30.dp),
                        onClick = { navController.popBackStack() } // Navigate back
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft, // Back arrow icon
                            contentDescription = "Back",
                            tint = Color.Black // Black arrow for better contrast
                        )
                    }
                },
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Settings", // Title text
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.Black
                            ),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFF7F9FC) // Light background color
                ),
                actions = {
                    // Optional action buttons (if needed)
                    /* IconButton(onClick = { /* Additional action */ }) {
                        Icon(
                            imageVector = Icons.Default.Settings, // Example action icon
                            contentDescription = "Settings",
                            tint = Color.Black
                        )
                    }*/
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF7F9FC))
                    .padding(paddingValues)
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Content here
                SettingScreenUserProfile()

                SettingRowItem(
                    icon = painterResource(id = R.drawable.stud), // Replace with your icon
                    title = "Change Password",
                    subtitle = "Update your login password",
                    onClick = { /* Handle click */ }
                )

                SettingRowItem(
                    icon = painterResource(id = R.drawable.stud), // Replace with your icon
                    title = "FAQs",
                    subtitle = "Frequently Asked Questions",
                    onClick = { /* Handle click */ }
                )

                SettingRowItem(
                    icon = painterResource(id = R.drawable.stud), // Replace with your icon
                    title = "About Us",
                    onClick = { /* Handle click */ }
                )

                SettingRowItem(
                    icon = painterResource(id = R.drawable.stud), // Replace with your icon
                    title = "Change Password",
                    subtitle = "Update your login password",
                    onClick = { /* Handle click */ }
                )

                SettingRowItem(
                    icon = painterResource(id = R.drawable.stud), // Replace with your icon
                    title = "FAQs",
                    subtitle = "Frequently Asked Questions",
                    onClick = { /* Handle click */ }
                )

                SettingRowItem(
                    icon = painterResource(id = R.drawable.stud), // Replace with your icon
                    title = "About Us",
                    onClick = { /* Handle click */ }
                )
            }
        }
    )
}

@Composable
fun SettingScreenUserProfile() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFF3086F5).copy(.8f), shape = CircleShape)
            .padding(8.dp)
    ) {

        // Profile Section
        Column(
            horizontalAlignment = Alignment.Start, // Align text to the left
            modifier = Modifier
                .fillMaxWidth() // Take full width of the screen
            // .padding(start = 16.dp) // Padding around the profile content
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
                                Color.Black
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
                        tint = Color.Black // Set the color of the icon to white
                    )
                }
                Spacer(modifier = Modifier.width(16.dp)) // Spacer to create space between the image and text

                // Column to display username and "Winner" text
                Column(
                    horizontalAlignment = Alignment.Start // Align text to the left
                ) {
                    Text(
                        text = "Parvez Mayar", // Username text (dynamic username can be used here)
                        color = Color.Black,
                        style = MaterialTheme.typography.bodyMedium, // Text style for username
                    )

                    // Winner Text
                    Text(
                        text = "Edit Account", // Static or dynamic "Winner" text
                        style = MaterialTheme.typography.bodyMedium, // Optional: Style the text
                        color = Color.Black,
                        modifier = Modifier.padding(top = 4.dp) // Padding between the username and winner text
                    )
                }
            }
        }
    }
}

@Composable
fun SettingRowItem(
    icon: Painter,
    title: String,
    subtitle: String? = null,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Circular Icon
        Box(
            modifier = Modifier
                .size(40.dp) // Adjust size as needed
                .background(color = Color(0xFFADD8E6), shape = CircleShape)
                .padding(8.dp)
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.width(16.dp)) // Space between icon and text column

        // Title and Subtitle
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                color = Color.Black
            )
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.width(8.dp)) // Space between text and arrow

        // Arrow Icon
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "Navigate",
            tint = Color.Gray
        )
    }
}
