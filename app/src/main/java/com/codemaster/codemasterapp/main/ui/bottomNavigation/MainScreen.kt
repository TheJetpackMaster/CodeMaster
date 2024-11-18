package com.codemaster.codemasterapp.main.ui.bottomNavigation;

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.codemaster.codemasterapp.R
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.RootNavHost
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import javax.annotation.meta.When


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MainScreen() {
    val navController = rememberNavController()
    val selectedIndex = remember { mutableStateOf(0) }

    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    val showBar = currentRoute == BottomNavRoutes.HomeScreen.route || currentRoute == BottomNavRoutes.AchievementsScreen.route

    Scaffold(
        bottomBar = {
            if(showBar) {
                //BottomNavBar(navController)

                CustomBottomBar(
                    items = listOf(
                        BottomBarItem("Home", R.drawable.stud),
                        BottomBarItem("Search", R.drawable.com),
                        BottomBarItem("Profile", R.drawable.achivments)
                    ),
                    selectedItemIndex = selectedIndex.value,
                    onItemSelected = { index ->
                        selectedIndex.value = index
                        // Navigate or perform actions based on index
                        when (index) {
                            0 -> navController.navigate(BottomNavRoutes.HomeScreen.route)
                            1 -> {
//                                navController.navigate(BottomNavRoutes.ExtraScreen.route)
                            }
                            2 -> navController.navigate(BottomNavRoutes.AchievementsScreen.route)
                        }
                    }
                )
            }
        }
    ) {  innerPadding->
        Column(
            modifier = Modifier.fillMaxSize()

        ){
            RootNavHost(navController = navController)
        }
    }
}
