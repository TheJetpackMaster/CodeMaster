package com.codemaster.codemasterapp.main.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.auth.components.AuthActionButton
import com.codemaster.codemasterapp.main.ui.auth.components.AuthBasicTopBar
import com.codemaster.codemasterapp.main.ui.auth.components.AuthInputField
import com.codemaster.codemasterapp.ui.theme.greenishPython


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterGuestScreen(navController: NavController) {

    Scaffold(
        topBar = {
            AuthBasicTopBar(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(0xFF576cd6)
                )
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            GuestScreenContent(
                onContinue = {

                }
            )

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GuestScreenContent(
    onContinue: () -> Unit
) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }

    // FocusManager to clear focus on "Done"
    val focusManager = LocalFocusManager.current


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 0.dp,
                start = 18.dp, end = 18.dp, bottom = 24.dp
            )
            .verticalScroll(rememberScrollState())

    ) {
        Spacer(modifier = Modifier.weight(.2f))

        Box(
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .background(Color.LightGray.copy(.55f))
                .border(1.dp, greenishPython, CircleShape),
            contentAlignment = Alignment.Center

        ) {
            Icon(
                imageVector = Icons.Default.Add,
                tint = Color.Black,
                contentDescription = ""
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxSize()

        ) {
            Spacer(modifier = Modifier.height(4.dp))
            // Welcome Text
            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Login to continue",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))

            // First Name
            AuthInputField(
                value = firstName,
                onValueChange = { firstName = it },
                hint = "first name",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Firstname",
                        tint = Color.Gray
                    )
                },
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(focusDirection = FocusDirection.Next)
                    }
                ),
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next
                ),
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Last Name
            AuthInputField(
                value = lastName,
                onValueChange = { lastName = it },
                hint = "last name",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Lastname icon",
                        tint = Color.Gray
                    )
                },
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                    }
                ),
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Done
                ),
            )

        }

        Spacer(modifier = Modifier.weight(1f))

        // Login Button
        AuthActionButton(
            text = "Continue",
            onClick = {
                onContinue()
            },
            innerModifier = Modifier.fillMaxWidth(),
            modifier = Modifier.shadow(2.dp, shape = CircleShape)
        )

    }
}


