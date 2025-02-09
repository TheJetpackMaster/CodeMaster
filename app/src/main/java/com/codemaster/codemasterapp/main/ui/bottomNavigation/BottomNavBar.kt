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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes

@Composable
fun CustomBottomBar(
    items: List<BottomBarItem>,
    navController: NavController
) {

    val bottomBarGradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF1A1A1A), // Dark Charcoal
            Color(0xFF2A2A2A)  // Slightly lighter gray
        )
    )

    val darkNeutralBottomBar = Color(0xFF2C2C2C) // Deep Gray
    val accentedDarkBottomBar = Color(0xFF1E1F26) // Dark Blueish Gray
    val darkPurpleBottomBar = Color(0xFF012B33) // Deep Purple
    val mutedBlueGrayBottomBar = Color(0xFF20232A) // Dark Slate Blue


    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route


    // Box to contain the Row and underline
    Box(
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
            .background(
                darkPurpleBottomBar
            )
//            .background(
//                brush = bottomBarGradient
//            )

            .shadow(
                elevation = .5.dp,
                shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp),
                ambientColor = Color.White,
                spotColor = Color.White
            )
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
                    isSelected = currentDestination == item.route,
                    onClick = {
                        if (currentDestination != item.route) {
                            if (item.route == BottomNavRoutes.HomeScreen.route) {
                                // Navigate to HomeScreen and ensure no black screen
                                navController.navigate(item.route) {
                                    // Clear all other destinations
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = false // Ensure fresh start for HomeScreen
                                    }
                                    launchSingleTop = true // Prevent multiple instances of HomeScreen
                                }
                            } else {
                                // Navigate to other screens, keeping HomeScreen in the stack
                                navController.navigate(item.route) {
                                    popUpTo(BottomNavRoutes.HomeScreen.route)
                                }
                            }

                        }
                    },
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


            val activeIconColor = Color(0xFFEAC645) // Warm golden yellow
            val activeIconColor2 = Color(0xFF4FC3F7) // Muted cyan
            val activeIconColor3 = Color(0xFFB39DDB) // Soft lavender purple


            // Icon for the BottomBarItem
            Icon(
                painter = painterResource(id = item.iconRes),
                contentDescription = item.label,
                tint = if (isSelected) activeIconColor
                else Color.White,
                modifier = Modifier.size(25.dp) // Set the icon size
            )

            // Underline for selected item, placed at the bottom of the box
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter) // Align underline to the bottom of the Box
                    .width(underlineWidth.value) // Animate the underline width
                    .height(3.dp) // Height of the underline
                    .clip(CircleShape)
                    .background(
                        activeIconColor
                    ) // Active underline

            )
        }
    }
}


data class BottomBarItem(
    val label: String,
    val iconRes: Int,
    val route: String
)

