package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.R

@Composable
fun NormalCodeBlock(contentBlock: String) {
    val keywords = listOf(
        "int", "return", "cout", "endl", "void", "if", "else", "while",
        "for", "#include", "#define", "++", "--", "bool", "cin", "float", "char", "double"
    )
    val braces = listOf("{", "}", "(", ")", "[", "]")
    val codeLines = contentBlock.split("\n")

    // Create a scroll state for tracking scroll position
    val scrollState = rememberScrollState()


    //For copying code
    // Get the system clipboard manager
    val context = LocalContext.current
    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager


    // State to track if content has been copied
    var isCopied by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.Black,
                shape = RoundedCornerShape(8.dp)
            ) // Background color of the code block
    ) {
        // Code content with scrolling
        Column(
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .horizontalScroll(scrollState) // Make the code block scrollable
        ) {
            Spacer(Modifier.height(12.dp))

            // Loop through each line of code
            codeLines.forEachIndexed { index, line ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp)
                ) {
                    // Column for Line Numbers
                    Column(
                        modifier = Modifier
                            .padding(end = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "${index + 1}",
                            style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                        )
                    }

                    // Column for Code content
                    Column(
                        modifier = Modifier.wrapContentHeight()
                    ) {
                        // Display code with styled syntax
                        Text(
                            text = buildAnnotatedString {
                                var tempLine =
                                    line // A temporary line to handle cases like `printf(`

                                // Updated regex to handle spaces and syntax components more precisely
                                val regex = Regex(
                                    "([#a-zA-Z_][a-zA-Z0-9_]*|\"[^\"]*\")|" +      // Keywords, identifiers, strings
                                            "([0-9]+(?:\\.[0-9]+)?)|" +                     // Numbers (integer and floating point)
                                            "([+\\-*/%=<>!&|^,;:._?])|" +                   // Operators and punctuation
                                            "([(){}\\[\\]])|"                                // Parentheses, braces, and brackets
                                )

                                val matches = regex.findAll(tempLine)

                                // Process each match
                                matches.forEach { matchResult ->
                                    val word = matchResult.value
                                    when {
                                        word in keywords -> {
                                            withStyle(
                                                style = SpanStyle(color = Color(0xFF49D9C8)) // Keyword color
                                            ) { append(word) }
                                        }

                                        word in braces -> {
                                            withStyle(
                                                style = SpanStyle(color = Color(0XFFFFFFFF)) // Braces color
                                            ) { append(word) }
                                        }

                                        word.startsWith("\"") && word.endsWith("\"") -> {
                                            // Ensure strings inside parentheses or anywhere else are colored red
                                            withStyle(
                                                style = SpanStyle(color = Color.Red) // String literal color
                                            ) { append(word) }
                                        }

                                        word.isNotBlank() -> {
                                            append(word) // Default text color for regular tokens
                                        }

                                        else -> {
                                            append(" ") // Preserve spaces exactly as they are
                                        }
                                    }
                                }
                            },
                            style = TextStyle(
                                fontSize = 12.sp,
                                color = Color.White
                            ) // Font size for code text
                        )
                    }
                }
            }

            Spacer(Modifier.height(12.dp))
        }

        IconButton(
            onClick = {
                // Copy content to clipboard
                val clip = ClipData.newPlainText("code", contentBlock)
                clipboardManager.setPrimaryClip(clip)

                // Change icon state to "copied"
                isCopied = true

            },
            modifier = Modifier
                .align(Alignment.TopEnd)
        ) {
            // Change the icon based on the state
            if (isCopied) {
                Icon(
                    painter = painterResource(id = R.drawable.check_icon),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = Color.White
                )
            } else {
                Icon(
                    painter = painterResource(id = R.drawable.copy_icon),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = Color.White
                )
            }
        }
//
//        IconButton(
//            onClick = {
//                // Copy content to clipboard
//                val clip = ClipData.newPlainText("code", contentBlock)
//                clipboardManager.setPrimaryClip(clip)
//            },
//            modifier = Modifier.align(Alignment.TopEnd)
//        ) {
//            Icon(
//                painterResource(id = R.drawable.copy_icon),
//                contentDescription = null,
//                modifier = Modifier.size(18.dp),
//                tint = Color.White
//            )
//        }
    }
}
