package com.codemaster.codemasterapp.main.ui.userProfileDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.UserProfileScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.ProfileRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserProfileScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            UserProfileScreenCustomTopBar(
                onSettingsClick = {
                    navController.navigate(ProfileRoutes.SettingsScreen.route)
                },
                onBackClick = {
                    navController.popBackStack()
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


                // Badges Section
                BadgesSection()


            }
        }
    )
}


@Composable
fun BadgesSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            "Badges",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
            BadgeIcon(R.drawable.badge, Color.LightGray.copy(.6f))
        }

    }
}


@Composable
fun BadgeIcon(imageRes: Int, color: Color) {
    Column(
        modifier = Modifier
            .size(70.dp) // Set image size
            .background(
                color,
                shape = CircleShape
            ) // Set black background and clip to circle shape
            .clip(CircleShape), // Clip the image into a circle
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // User Image with Circular Shape and White Border
        Image(
            painter = painterResource(id = imageRes), // Directly load image resource here
            contentDescription = "User Profile Image",
            modifier = Modifier
                .size(45.dp) // Set image size
                .background(
                    Color.Transparent,
                    shape = CircleShape
                ) // Set black background and clip to circle shape
                .clip(CircleShape) // Clip the image into a circle
        )
    }

}
