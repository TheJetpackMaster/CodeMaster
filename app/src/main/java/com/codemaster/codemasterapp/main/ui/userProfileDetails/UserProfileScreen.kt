package com.codemaster.codemasterapp.main.ui.userProfileDetails

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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.UserProfileScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes


val profileSectionGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF557A95), // Muted steel blue (top)
        Color(0xFF436D8D), // Rich blue-gray (middle)
        Color(0xFF2A4F6D)  // Dark slate blue (bottom)
    )
)


val statsCardGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF3C5866), // Medium slate blue-gray (top)
        Color(0xFF2F4554)  // Deep blue-gray (bottom)
    )
)

val waveGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF2A4F6D), // Dark blue (top)
        Color(0xFF3C5866)  // Medium blue-gray (bottom)
    )
)

val freeCoursesGradientColors = Brush.horizontalGradient(
    listOf(
        Color(0xFFFFB7A5), // Soft coral (gentle and inviting)
        Color(0xFFFF6F61)  // Warm reddish-pink (vibrant but not harsh)
    )
)


val liveSupportButtonColors = Brush.horizontalGradient(
    colors = listOf(
        Color(0xFF64B5F6), // Soft sky blue (lighter and calming)
        Color(0xFF1565C0)  // Deep blue (provides contrast and vibrancy)
    )
)


@Composable
fun UserProfileScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        // Top Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF101820).copy(.5f))
                .padding(bottom = 16.dp)
                .padding(horizontal = 12.dp)
                .statusBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Profile",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.White.copy(.7f),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .clickable(onClick = {
                        navController.navigate(ProfileRoutes.SettingsScreen.route)
                    })
                    .background(Color.LightGray.copy(.2f))
                    .padding(6.dp)

            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "",
                    tint = Color.White.copy(.7f)
                )

                Text(
                    "Settings",
                    color = Color.White.copy(.7f),
                    fontWeight = FontWeight.Medium
                )
            }
        }

        HorizontalDivider(thickness = 1.dp, color = Color.LightGray.copy(.2f))


        //Main Content Section
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(Modifier.height(14.dp))

            //User Profile Section
            UserProfileSection()

            Spacer(modifier = Modifier.height(16.dp))

            // Highlight Free Courses Section
            Box(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp) // Added vertical padding
                    .fillMaxWidth()
                    .height(72.dp) // Slightly taller for breathing room
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(14.dp)
                    ) // Subtle shadow for depth
                    .background(
                        brush = freeCoursesGradientColors,
                        shape = RoundedCornerShape(14.dp) // Slightly more rounded
                    )
                    .padding(12.dp), // Increased padding
                contentAlignment = Alignment.Center
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(0.7f) // Adjusted width allocation
                    ) {
                        Text(
                            text = "All Courses Are Free",
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.Black, // Black for contrast
                                fontWeight = FontWeight.Bold // Slightly bolder
                            )
                        )
                        Spacer(modifier = Modifier.height(4.dp)) // Added spacing
                        Text(
                            text = "Learn without limits. Start exploring!",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = Color(0xFF4F4F4F) // Subtle gray for readability
                            ),
                            maxLines = 2,
                        )
                    }

                    Spacer(Modifier.weight(1f))

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFF1A7306)) // Vibrant green for CTA
                            .padding(horizontal = 8.dp, vertical = 6.dp), // Compact padding
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Explore Now!",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold // Better emphasis
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Stats Section
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                StatsCard(
                    iconRes = R.drawable.person, // Replace with correct icons
                    value = "0",
                    label = "Gems",
                    modifier = Modifier.weight(1f)
                )
                StatsCard(
                    iconRes = R.drawable.person, // Replace with correct icons
                    value = "0",
                    label = "Social Index",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Stats Section
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                StatsCard(
                    iconRes = R.drawable.person, // Replace with correct icons
                    value = "0",
                    label = "Days Streak",
                    modifier = Modifier.weight(1f)
                )
                StatsCard(
                    iconRes = R.drawable.person, // Replace with correct icons
                    value = "0%",
                    label = "Accuracy",
                    modifier = Modifier.weight(1f)
                )

            }

            Spacer(modifier = Modifier.height(16.dp))


            // Live Support Button
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(12.dp))
                    .background(
                        liveSupportButtonColors,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .clickable { /* Handle click */ }
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Live Support",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Composable
fun UserProfileSection() {
    Box(
        modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth()
            .height(200.dp)
            .shadow(3.dp, shape = RoundedCornerShape(16.dp))
            .background(
                brush = profileSectionGradient,
                shape = RoundedCornerShape(16.dp)
            )


    ) {
        // Background with gradient and wave
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp)) // Clip for rounded corners
        ) {
            val width = size.width
            val height = size.height


            // Wave path
            val wavePath = Path().apply {
                moveTo(0f, height * .65f)
                cubicTo(
                    width * 0.25f, height * .1f,
                    width * 0.75f, height * 0.85f,
                    width, height * 0.6f
                )
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }

            drawPath(
                path = wavePath,
                brush = waveGradient
            )
        }

        // Edit Icon (Top-right corner)
        Icon(
            painter = painterResource(R.drawable.editicon), // Replace with your edit icon resource
            contentDescription = "Edit Profile",
            tint = Color.White,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(44.dp)
                .padding(12.dp)
                .clickable(onClick = {

                })

        )


        // Profile content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            // Profile Picture with dashed border
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF2A2A2A)) // Dark background for avatar
            ) {
                Canvas(modifier = Modifier.matchParentSize()) {
                    drawCircle(
                        color = Color(0xFFFFD700), // Golden border
                        style = Stroke(
                            width = 3.dp.toPx(),
                            pathEffect = PathEffect.dashPathEffect(floatArrayOf(12f, 6f))
                        ),
                    )
                }
                Image(
                    painter = painterResource(R.drawable.person), // Replace with your avatar resource
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Username
            Text(
                text = "Anonymous",
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )

            // Followers and Following
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "0 Followers  |  0 Following",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.Gray
                )
            )
        }
    }
}


@Composable
fun StatsCard(
    iconRes: Int, value: String, label: String,
    modifier: Modifier = Modifier
) {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .height(100.dp)
            .shadow(elevation = 3.dp, shape = RoundedCornerShape(8.dp))
            .background(
                brush = statsCardGradient,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(12.dp)

    ) {
        Icon(
            painter = painterResource(iconRes),
            contentDescription = label,
            tint = Color.White,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.titleMedium.copy(
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall.copy(color = Color.Gray)
        )
    }
}


//
//@Composable
//fun UserProfileScreen(
//    navController: NavController
//) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFF121212)) // Dark background
//            .padding(16.dp)
//    ) {
//        // Header with Title and Settings Button
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 16.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Profile",
//                style = MaterialTheme.typography.titleLarge,
//                color = Color.White
//            )
//            IconButton(onClick = { /* Handle settings click */ }) {
//                Icon(
//                    painter = painterResource(R.drawable.person), // Replace with settings icon
//                    contentDescription = "Settings",
//                    tint = Color.White
//                )
//            }
//        }
//
//        // User Avatar, Name, Followers, and Following
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color(0xFF1E1E1E), shape = RoundedCornerShape(8.dp))
//                .padding(16.dp)
//        ) {
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Box(
//                    modifier = Modifier.size(100.dp),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Image(
//                        painter = painterResource(R.drawable.person), // Replace with avatar icon
//                        contentDescription = "User Avatar",
//                        modifier = Modifier
//                            .clip(CircleShape)
//                            .background(Color(0xFFEDEDED))
//                            .size(100.dp)
//                    )
//                    IconButton(
//                        onClick = { /* Handle edit profile image */ },
//                        modifier = Modifier
//                            .align(Alignment.BottomEnd)
//                            .background(Color.White, shape = CircleShape)
//                            .padding(4.dp)
//                    ) {
//                        Icon(
//                            painter = painterResource(R.drawable.badge), // Replace with edit icon
//                            contentDescription = "Edit Profile Picture",
//                            tint = Color(0xFF1E88E5)
//                        )
//                    }
//                }
//
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(
//                    text = "Anonymous",
//                    style = MaterialTheme.typography.titleMedium,
//                    color = Color.White
//                )
//                Spacer(modifier = Modifier.height(4.dp))
//                Text(
//                    text = "0 Followers  |  0 Following",
//                    style = MaterialTheme.typography.bodySmall,
//                    color = Color.Gray
//                )
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Premium Upgrade Section
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color(0xFFFFD700), shape = RoundedCornerShape(8.dp))
//                .padding(16.dp)
//        ) {
//            Row(
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Column {
//                    Text(
//                        text = "Upgrade to Premium",
//                        style = MaterialTheme.typography.titleMedium,
//                        color = Color.Black
//                    )
//                    Text(
//                        text = "Get more premium courses",
//                        style = MaterialTheme.typography.bodySmall,
//                        color = Color.DarkGray
//                    )
//                }
//                Button(
//                    onClick = { /* Handle Try Pro */ },
//                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF43A047))
//                ) {
//                    Text(text = "Try Pro")
//                }
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Stats Section
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            StatsCard(
//                iconRes = R.drawable.person, // Replace with fire icon
//                value = "0",
//                label = "Days Streak",
//                modifier = Modifier.weight(1f)
//            )
//            StatsCard(
//                iconRes = R.drawable.person, // Replace with accuracy icon
//                value = "0%",
//                label = "Question Accuracy",
//                modifier = Modifier.weight(1f)
//            )
//            StatsCard(
//                iconRes = R.drawable.badge, // Replace with gem icon
//                value = "0",
//                label = "Total Gems",
//                modifier = Modifier.weight(1f)
//            )
//            StatsCard(
//                iconRes = R.drawable.person, // Replace with social index icon
//                value = "0",
//                label = "Social Index",
//                modifier = Modifier.weight(1f)
//            )
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Live Support Button
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color(0xFF1E88E5), shape = RoundedCornerShape(8.dp))
//                .clickable { /* Handle live support click */ }
//                .padding(16.dp),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = "Live Support",
//                style = MaterialTheme.typography.titleMedium,
//                color = Color.White
//            )
//        }
//    }
//}
//
//@Composable
//fun StatsCard(
//    iconRes: Int, value: String, label: String,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = modifier
//            .background(Color(0xFF1E1E1E), shape = RoundedCornerShape(8.dp))
//            .padding(8.dp)
//    ) {
//        Icon(
//            painter = painterResource(iconRes),
//            contentDescription = label,
//            tint = Color.White,
//            modifier = Modifier.size(32.dp)
//        )
//        Spacer(modifier = Modifier.height(4.dp))
//        Text(
//            text = value,
//            style = MaterialTheme.typography.titleMedium,
//            color = Color.White
//        )
//        Spacer(modifier = Modifier.height(4.dp))
//        Text(
//            text = label,
//            style = MaterialTheme.typography.bodySmall,
//            color = Color.Gray
//        )
//    }
//}




