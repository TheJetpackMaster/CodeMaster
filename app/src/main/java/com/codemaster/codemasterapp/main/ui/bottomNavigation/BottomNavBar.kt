package com.codemaster.codemasterapp.main.ui.bottomNavigation;

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

/*@Composable
fun BottomNavBar(navController: NavController) {
    NavigationBar(
        containerColor = Color.LightGray,
        contentColor = Color.White
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    Icons.Filled.Home, contentDescription = "Home",
                    tint = Color.Black
                )
            },
            selected = false,
            onClick = {
                navController.navigate("home")
            }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    Icons.Filled.Settings, contentDescription = "Learning",
                    tint = Color.Black
                )
            },
            selected = false,
            onClick = {
                navController.navigate("settings")
            }
        )

        NavigationBarItem(
            icon = {
                Icon(
                    Icons.Filled.Person, contentDescription = "Learning",
                    tint = Color.Black
                )
            },
            selected = false,
            onClick = {
                navController.navigate("settings")
            }
        )
    }
}*/


@Composable
fun CustomBottomBar(
    items: List<BottomBarItem>,
    selectedItemIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    // Box to contain the Row and underline
    Box(
        modifier = Modifier
            .height(70.dp) // Height of the BottomBar
            .fillMaxWidth() // Fill the full width
            .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)) // Rounded corners at the top
            .background(Color.White) // Dark background
            .shadow(elevation = 0.7.dp, shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
    ) {
        // Row to hold the icons
        Row(
            modifier = Modifier
                .fillMaxSize(), // Fill the available space
            horizontalArrangement = Arrangement.SpaceAround, // Equal spacing between items
            verticalAlignment = Alignment.CenterVertically // Vertically center icons
        ) {
            items.forEachIndexed { index, item ->
                BottomBarItem(
                    item = item,
                    isSelected = index == selectedItemIndex,
                    onClick = { onItemSelected(index) },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun BottomBarItem(
    item: BottomBarItem,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier
) {
    val underlineWidth = animateDpAsState(
        targetValue = if (isSelected) 40.dp else 0.dp, // Animate width based on selection
        animationSpec = tween(durationMillis = 300) // Animation duration
    )

    // Box to contain the icon and underline
    Column(
        modifier = modifier
            .fillMaxHeight() // Fill the available height
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp), // Padding between items
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Center icon vertically
    ) {
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.Center // Ensures icon stays centered
        ) {
            // Icon for the BottomBarItem
            Icon(
                painter = painterResource(id = item.iconRes),
                contentDescription = item.label,
                tint = if (isSelected) Color.Blue else Color.Gray,
                modifier = Modifier.size(25.dp) // Set the icon size
            )

            // Underline for selected item, placed at the bottom of the box
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter) // Align underline to the bottom of the Box
                    .width(underlineWidth.value) // Animate the underline width
                    .height(3.dp) // Height of the underline
                    .clip(CircleShape)
                    .background(Color.Blue) // Active underline

            )
        }
    }
}



data class BottomBarItem(
    val label: String,
    val iconRes: Int // Resource ID for the icon
)

