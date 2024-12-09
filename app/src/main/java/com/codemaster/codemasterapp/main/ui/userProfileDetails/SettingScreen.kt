package com.codemaster.codemasterapp.main.ui.userProfileDetails

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R

//val screenBackgroundGradient = Brush.verticalGradient(
//    colors = listOf(
//        Color(0x55101820), // Very Dark Blue
//        Color(0x550F263D), // Slightly Brighter Blue
//        Color(0x5515476E)  // Cool Medium Blue
//    )
//)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
                navigationIcon = {

                    OutlinedIconButton(
                        onClick = {
                            if (navController.currentBackStackEntry?.lifecycle?.currentState
                                == Lifecycle.State.RESUMED
                            ) {
                                navController.popBackStack()
                            }
                        },
                        modifier = Modifier
                            .statusBarsPadding()
                            .padding(start = 8.dp)
                            .size(36.dp),
                        border = BorderStroke(
                            1.3.dp,
                            color = Color.LightGray.copy(alpha = 0.4f)
                        ), // Light border with transparency
                        colors = IconButtonDefaults.outlinedIconButtonColors(
                            containerColor = Color.White.copy(.08f),
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "",
                            modifier = Modifier.size(26.dp),
                            tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
                        )
                    }
                },

                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "Settings",
                        color = Color.White
                    )

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0x990F263D) // Desired dark gradient tone
                ),
                modifier = Modifier.shadow(
                    .5.dp,
                    ambientColor = Color.White,
                    spotColor = Color.White
                )

            )
        }
    ) { paddingValues ->


        Column(
            modifier = Modifier
                .fillMaxSize()
//                .background(screenBackgroundGradient) // Apply gradient background
                .padding(paddingValues)
                .verticalScroll(scrollState)
                .padding(horizontal = 12.dp) // Reduced horizontal padding for tighter layout
        ) {

            // Account Section
            SectionCard(title = "Account") {
                SettingItem(icon = Icons.Default.AccountCircle, label = "Sign In") {}
            }

            // Premium Learner Section
            SectionCard(title = "Premium Learner") {
                SettingItem(icon = Icons.Default.Star, label = "Become a premium learner") {}
                SettingItem(icon = Icons.Default.Info, label = "Classroom premium code") {}
            }

            // General Section
            SectionCard(title = "General Section") {
                SettingItem(icon = Icons.Default.Notifications, label = "Notification") {}
                SettingItem(icon = Icons.Default.Info, label = "Sound") {}
                SettingItem(icon = Icons.Default.Info, label = "Voice Navigation") {}
                SettingItem(icon = Icons.Default.Info, label = "Shake to feedback") {}
                SettingItem(icon = Icons.Default.ThumbUp, label = "Rate us") {}
                SettingItem(icon = Icons.Default.Share, label = "Share this app") {}
                SettingItem(icon = Icons.Default.Info, label = "Language") {}
            }

            // About Section
            SectionCard(title = "About") {
                SettingItem(icon = Icons.Default.Info, label = "About Programming Hero") {}
                SettingItem(icon = Icons.Default.Info, label = "Community") {}
                SettingItem(icon = Icons.Default.Info, label = "Give us feedback") {}
                SettingItem(icon = Icons.Default.Info, label = "Report issues") {}
                SettingItem(icon = Icons.Default.Info, label = "Privacy policy") {}
                SettingItem(icon = Icons.Default.Info, label = "Terms of use") {}
                SettingItem(icon = Icons.Default.Info, label = "Credits") {}
                SettingItem(icon = Icons.Default.Info, label = "Release log") {}
                SettingItem(icon = Icons.Default.Info, label = "Reset all my progress") {}
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun SectionCard(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {
        // Section title
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color(0xFF80A4C0), // Muted blue-gray for a modern look
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(start = 8.dp, bottom = 6.dp) // Consistent spacing
        )

        // Card for the section
        Card(
            shape = RoundedCornerShape(12.dp), // Slightly rounded for a modern feel
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF1A3149) // Rich dark blue for card background
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), // Subtle shadow for depth
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 0.dp, vertical = 8.dp) // Comfortable padding inside card
            ) {
                content()
            }
        }
    }
}


@Composable
fun SettingItem(
    icon: ImageVector,
    label: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 6.dp)
            .padding(horizontal = 10.dp), // Reduced vertical padding for tighter layout
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Icon with circle background
        Box(
            modifier = Modifier
                .size(36.dp) // Slightly smaller for compact design
                .background(
                    color = Color(0xFF15476E), // Blue tone matching background
                    shape = CircleShape
                )
                .padding(6.dp), // Compact padding
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(20.dp) // Smaller icon size
            )
        }

        Spacer(modifier = Modifier.width(12.dp)) // Closer spacing between icon and text

        // Label text
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.White), // White text for contrast
            modifier = Modifier.weight(1f)
        )

        // Arrow icon at the end
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "Arrow",
            tint = Color(0xFFB0BEC5), // Light gray arrow color
            modifier = Modifier.size(20.dp)
        )
    }
}

