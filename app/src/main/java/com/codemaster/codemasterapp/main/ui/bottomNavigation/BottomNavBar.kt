package com.codemaster.codemasterapp.main.ui.bottomNavigation;

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable;
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
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
}
