package com.codemaster.codemasterapp.main.ui.auth

import android.R.attr.value
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = { navController.popBackStack() }
                    ) {

                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft, // Left arrow icon
                            contentDescription = "Back",
                            tint = Color.White // Set the color of the icon to white
                        )
                    }
                },
                title = {
                    /*Text(
                        text = "Login",
                        style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
                    )*/
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color(0xFF576cd6)
                    )
                    .padding(paddingValues),
                   // .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LoginSection(
                    onLoginClick = {}, onForgotPasswordClick = {})
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginSection(
    onLoginClick: () -> Unit,
    onForgotPasswordClick: () -> Unit,
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Welcome Text
        Text(
            text = "Welcome Back",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Login to continue",
            style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(24.dp))

        // Username TextField
        SimpleTextField(
            value = username,
            onValueChange = { username = it },
            hint = "Username",
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Username Icon",
                    tint = Color.Gray
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Password TextField
        SimpleTextField(
            value = password,
            onValueChange = { password = it },
            hint = "Password",
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Username Icon",
                    tint = Color.Gray
                )
            }
        )

        // forget Password
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End) {
            TextButton(onClick = onForgotPasswordClick) {
                Text(
                    text = "Forgot Password?",
                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // Login Button
        Button(
            onClick = onLoginClick,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF293959), // First gradient color
                                Color(0xFF354C88)  // Second gradient color
                            )
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        //Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Dont have an Account?",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
            TextButton(onClick = onForgotPasswordClick) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun SimpleTextField(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    leadingIcon: @Composable (() -> Unit)? = null // Icon parameter
) {
    var isFieldDisabled by remember { mutableStateOf(false) }
    var isFocused by remember { mutableStateOf(false) }

    // BasicTextField without any styling or decoration
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        enabled = !isFieldDisabled,  // Disable TextField when isFieldDisabled is true
        textStyle = TextStyle(
            color = Color.Black,  // Text color
            fontSize = 16.sp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // Disable the TextField when clicked
                isFieldDisabled = true
            }
            .onFocusChanged { focusState ->
                isFocused = focusState.isFocused // Track if the TextField is focused
            }
    ) { innerTextField ->
        // Here, you can add a custom decoration around the BasicTextField
        Box(
            modifier = Modifier
                .height(60.dp)
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color.White, Color(0xFF88A5FF)) // Gradient from white to Color(0xFF576cd6)
                    ),
                    shape = RoundedCornerShape(12.dp) // Rounded corners with 12.dp radius
                )
                .border(
                    width = 1.dp, // Border width
                    color = Color.White.copy(alpha = 0.8f), // White border with 0.5 alpha
                    shape = RoundedCornerShape(12.dp) // Rounded corners for the border
                )

                .padding(horizontal = 16.dp, vertical = 12.dp) // Padding for inner text
        ) {
            // Display the leading icon if provided
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().height(60.dp)
            ) {
                if (leadingIcon != null) {
                    leadingIcon() // Display the icon
                    Spacer(modifier = Modifier.width(8.dp)) // Add some space between the icon and the text
                }

                // Only show hint text if the TextField is not focused and value is empty
                if (value.isEmpty() && !isFocused) {
                    Text(
                        text = hint, // Hint text
                        style = TextStyle(color = Color.Gray)
                    )
                }
                innerTextField() // Actual input field
            }
        }
    }
}
