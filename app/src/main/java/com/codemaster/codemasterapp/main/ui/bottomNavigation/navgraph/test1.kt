package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@Composable
fun login(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "auth",
            modifier = Modifier.clickable(
                onClick = {
                    navController.navigate("bottom")
                }
            ),
            color = Color.White
        )
    }
}


@Composable
fun home(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home",
            color = Color.White)
    }
}

@Composable
fun settings(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Settings",
            modifier = Modifier.clickable(
                onClick = {
                    navController.navigate("test")
                }
            ),
            color = Color.White
        )
    }
}

@Composable
fun main(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("MainScreen",
            color = Color.White)
    }
}