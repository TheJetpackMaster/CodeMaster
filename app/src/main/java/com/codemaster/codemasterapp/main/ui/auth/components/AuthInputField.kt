package com.codemaster.codemasterapp.main.ui.auth.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AuthInputField(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    leadingIcon: @Composable (() -> Unit)? = null, // Icon parameter
    keyboardActions: KeyboardActions = KeyboardActions(),
    keyboardOptions: KeyboardOptions = KeyboardOptions()
) {
    var isFieldDisabled by remember { mutableStateOf(false) }
    var isFocused by remember { mutableStateOf(false) }

    // BasicTextField without any styling or decoration
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        enabled = !isFieldDisabled,  // Disable TextField when isFieldDisabled is true
        textStyle = MaterialTheme.typography.bodyMedium.copy(
            color = Color.Black,
            fontWeight = FontWeight.Medium
        ),
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // Disable the TextField when clicked
                isFieldDisabled = true
            }
            .onFocusChanged { focusState ->
                isFocused = focusState.isFocused
            }
    ) { innerTextField ->
        // Here, you can add a custom decoration around the BasicTextField
        Box(
            modifier = Modifier
                .height(60.dp)
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            Color.White,
                            Color(0xFF88A5FF)
                        ) // Gradient from white to Color(0xFF576cd6)
                    ),
                    shape = RoundedCornerShape(12.dp) // Rounded corners with 12.dp radius
                )
                .border(
                    width = 1.dp, // Border width
                    color = Color.White.copy(alpha = 0.6f), // White border with 0.5 alpha
                    shape = RoundedCornerShape(12.dp) // Rounded corners for the border
                )

                .padding(horizontal = 16.dp, vertical = 12.dp) // Padding for inner text
        ) {
            // Display the leading icon if provided
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                if (leadingIcon != null) {
                    leadingIcon() // Display the icon
                    Spacer(modifier = Modifier.width(8.dp)) // Add some space between the icon and the text
                }

                // Only show hint text if the TextField is not focused and value is empty
                if (value.isEmpty() && !isFocused) {
                    Text(
                        text = hint, // Hint text
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = Color.Gray
                        )
                    )
                }
                innerTextField() // Actual input field
            }
        }
    }
}