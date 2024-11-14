package com.codemaster.codemasterapp.main.ui.bottomNavigation;

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.RootNavHost
import javax.annotation.meta.When


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MainScreen() {
    val navController = rememberNavController()

    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    val showBar = currentRoute == "home" || currentRoute == "settings"

    Scaffold(
        bottomBar = {
            if(showBar) {
                BottomNavBar(navController)
            }
        }
    ) {  innerPadding->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
        ){
            RootNavHost(navController = navController)
        }
    }
}
