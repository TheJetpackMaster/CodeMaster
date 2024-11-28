package com.codemaster.codemasterapp.main.AllCourses.CppCourse

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun cPPBeginnerCourse(): Stage {
    return Stage(
        id = "cpp_beginner_stage",
        title = "Beginner",
        lessons = listOf(


            // Lesson 1: Introduction to C++ Programming
            Lesson(
                id = "beginner_cpp1",
                title = "Introduction to C++ Programming",
                description = "In this lesson, we will cover the basics of C++ programming. Don't worry, no complicated stuff yet!",
                subLessons = listOf(
                    // Sub-lesson 1: What is C++?
                    Lesson(
                        id = "beginner_c1_sub1",
                        title = "What is C++?",
                        description = "In this lesson, we'll briefly talk about the C++ programming language, where it came from, and why it's still awesome today.",
                        status = LessonStatus.ACTIVE
                    ),
                    // Sub-lesson 2: Why C++?
                    Lesson(
                        id = "beginner_c1_sub2",
                        title = "Why C++?",
                        description = "C++ isn't just any language. Let's explore why it's so powerful, and why you should care.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 3: History of C++
                    Lesson(
                        id = "beginner_c1_sub3",
                        title = "History of C++",
                        description = "We’ll look back to the early 1980s when C++ was born and how it grew up to be the language it is today.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 4: What's Next in C++?
                    Lesson(
                        id = "beginner_c1_sub4",
                        title = "What's Next in Course?",
                        description = "Now that you've got the basics, we will move on to variables, data types, and how to manipulate them in upcoming lessons!",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 5: Get Ready for Action!
                    Lesson(
                        id = "beginner_c1_sub5",
                        title = "Get Ready for Action!",
                        description = "Get ready to start coding! In the next lesson, you'll create your first interactive program and learn how to handle user input.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 6: QUIZ!
                    Lesson(
                        id = "beginner_c1_sub6",
                        title = "Quiz!",
                        description = "Basic quiz to test your simple knowledge about what is C++.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content 1: What is C++?
                    LessonContent(
                        id = "beginner_c1_sub1_content",
                        title = "What is C++?",

                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the function to return the square of a number.",
                                incompleteCode = "fun square(x: Int): Int { return ___ }",
                                correctCode = "x * x"

                            )
                        ),
//
//                        contentBlocks = listOf(
//                            ContentBlock.Text.fromString(
//                                "C++ is a powerful, high-performance programming language that is widely used in software development." +
//                                        " It was created by Bjarne Stroustrup in 1979 and has evolved to support both object-oriented and procedural programming."
//                            ),
//                            ContentBlock.Text.fromString(
//                                "Its ability to give programmers fine control over system resources is one of the reasons it’s still popular today."
//                            ),
//                            ContentBlock.Text(
//                                buildAnnotatedString {
//                                    val text =
//                                        "C++ supports object-oriented programming, allowing for more modular and scalable code."
//                                    append(text)
//
//                                    // Highlight "object-oriented" with a distinct color
//                                    val wordsToStyle = listOf("object-oriented")
//                                    for (word in wordsToStyle) {
//                                        val startIndex = text.indexOf(word)
//                                        if (startIndex != -1) {
//                                            addStyle(
//                                                style = SpanStyle(
//                                                    color = Color(0xFF05B3E7), // Tomato red
//                                                    fontWeight = FontWeight.SemiBold
//                                                ),
//                                                start = startIndex,
//                                                end = startIndex + word.length
//                                            )
//                                        }
//                                    }
//                                }
//                            )
//                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    // Content 2: Why C++?
                    LessonContent(
                        id = "beginner_c1_sub2_content",
                        title = "Why C++?",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "C++ is not just about writing code. It's about writing efficient, powerful code that can do anything from games to operating systems." +
                                        " The language's versatility, performance, and wide usage in high-performance applications make it a must-learn for programmers."
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "C++ is a perfect choice for performance-critical applications such as games, operating systems, and real-time software."
                                    append(text)

                                    // Emphasize "performance-critical" with bold and color
                                    val wordsToStyle = listOf("performance-critical")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Light blue
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 3: History of C++
                    LessonContent(
                        id = "beginner_c1_sub3_content",
                        title = "History of C++",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "C++ originated as an extension of the C programming language in the early 1980s. C++, as its name suggests, is 'C with classes,' " +
                                        "introducing object-oriented concepts to the language."
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Since then, C++ has evolved and remained a go-to language for applications where performance and efficiency are crucial."
                                    append(text)

                                    // Emphasize "performance" and "efficiency" with bold and color
                                    val wordsToStyle = listOf("performance", "efficiency")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 4: What's Next in C++?
                    LessonContent(
                        id = "beginner_c1_sub4_content",
                        title = "What's Next in Course?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "In the next lessons, we will dive into variables, data types, and how to use them effectively in your programs. The real fun starts here!"
                                    append(text)

                                    // Emphasize "variables", "data types" with bold and color
                                    val wordsToStyle = listOf("variables", "data types")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "We’ll explore how to work with numbers, strings, and different data structures, preparing you to write more complex programs."
                                    append(text)

                                    // Emphasize "numbers", "strings" with bold and color
                                    val wordsToStyle = listOf("numbers", "strings")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 5: Get Ready for Action!
                    LessonContent(
                        id = "beginner_c1_sub5_content",
                        title = "Get Ready for Action!",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Now it's time to roll up your sleeves! In upcoming lessons, you'll create a fully interactive program and learn how to take user input."
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "We'll also introduce you to loops and conditions, which will allow you to make your programs more dynamic and responsive!"
                                    append(text)

                                    // Emphasize "loops" and "conditions" with bold and color
                                    val wordsToStyle = listOf("loops", "conditions")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 6: Quiz
                    LessonContent(
                        id = "beginner_cpp_sub6",
                        title = "Quiz!",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is C++ used for?",
                                options = listOf(
                                    "System Programming",
                                    "Web Development",
                                    "Mobile App Development"
                                ),
                                correctAnswer = "System Programming",
                                userAnswer = null, // Initially, no answer is selected
                                isCorrect = false // Initially, answer is incorrect until the user answers
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.ACTIVE
            ),


            // Lesson 2: Getting Started with C++
            Lesson(
                id = "beginner_cpp2",
                title = "Getting Started with C++",
                description = "In this lesson, we'll guide you through setting up the C++ development environment, installing IDEs and compilers, and writing your first C++ program.",
                subLessons = listOf(
                    // Sub-lesson 1: Setting Up an IDE
                    Lesson(
                        id = "beginner_c2_sub1",
                        title = "Setting Up an IDE",
                        description = "In this lesson, you'll learn how to install an IDE (Integrated Development Environment) to start writing C++ code. We’ll walk you through popular choices like Visual Studio (Windows), Code::Blocks (Cross-platform), or CLion (Cross-platform).",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 2: Installing a C++ Compiler
                    Lesson(
                        id = "beginner_c2_sub2",
                        title = "Installing a C++ Compiler",
                        description = "A C++ compiler is essential to compile and run your C++ programs. We will show you how to install GCC, MinGW, or Clang, depending on your operating system.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 3: Your First C++ Program
                    Lesson(
                        id = "beginner_c2_sub3",
                        title = "Your First C++ Program",
                        description = "Now that your environment is set up, let’s write your first C++ program: a simple 'Hello, World!' that you can compile and run.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 4: Setting Up Debugging Tools
                    Lesson(
                        id = "beginner_c2_sub4",
                        title = "Setting Up Debugging Tools",
                        description = "Debugging is an essential part of programming. In this sub-lesson, you’ll learn how to use debugging tools within your IDE to step through your code and catch bugs early.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 5: Quiz
                    Lesson(
                        id = "beginner_c2_sub5",
                        title = "Quiz!",
                        description = "At the end of this lesson, test your knowledge with a quiz about IDEs, compilers, and your first program.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content 1: Setting Up an IDE
                    LessonContent(
                        id = "beginner_c2_sub1_content",
                        title = "Setting Up an IDE",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "To start writing C++ code, you need an IDE (Integrated Development Environment) where you can write, compile, and run your programs. There are several popular IDEs for C++ programming, such as:"
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "for Android: Coding C++ (PlayStore)\nfor IOS: C++ Compiler"
                                    append(text)

                                    // Emphasize platform names like "Android", "IOS" with bold and color
                                    val wordsToStyle = listOf("for Android", "for IOS")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "for Windows: Visual Studio,Code Blocks\nfor Mac or Linux: CodeBlocks,Clion"
                                    append(text)

                                    // Emphasize platform names like "Windows", "Mac", "Linux" with bold and color
                                    val wordsToStyle =
                                        listOf("for Windows", "for Mac", "for Linux")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            )

                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 2: Installing a C++ Compiler
                    LessonContent(
                        id = "beginner_c2_sub2_content",
                        title = "Installing a C++ Compiler",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "A C++ compiler is necessary for converting the C++ code you write into an executable program. On Windows, we recommend installing MinGW or the Cygwin environment to get GCC (GNU Compiler Collection)."
                                    append(text)

                                    // Emphasize "C++ compiler", "Windows", and "MinGW"
                                    val wordsToStyle = listOf("C++ compiler")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "If you are on macOS or Linux, you likely already have Clang or GCC installed, but if not, we’ll show you how to install it using a package manager."
                                    append(text)

                                    // Emphasize "macOS" and "Linux"
                                    val wordsToStyle = listOf("macOS", "Linux")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "To install MinGW on Windows, download and install it from the official website, then add it to your system’s PATH variable to allow the compiler to be accessed from the command line."
                                    append(text)

                                    // Emphasize "MinGW" and "Windows"
                                    val wordsToStyle = listOf("MinGW", "Windows")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            )

                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 3: Your First C++ Program
                    LessonContent(
                        id = "beginner_c2_sub3_content",
                        title = "Your First C++ Program",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Now that your IDE and compiler are set up, let’s write your first program. This program will display 'Hello, World!' on the screen."
                            ),
                            ContentBlock.Code(
                                code = """
                            #include <iostream>

                            int main() {
                                cout << "Hello, World!" <<endl;
                                return 0;
                            }
                        """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code = "Output : Hello, World!"
                            ),
                            ContentBlock.Text.fromString(
                                "After writing the code, click 'Build' or 'Run' in your IDE to compile and execute it. You should see 'Hello, World!' printed on the screen."
                            )
                        ),

                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 4: Setting Up Debugging Tools
                    LessonContent(
                        id = "beginner_c2_sub4_content",
                        title = "Setting Up Debugging Tools",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Debugging is essential for finding and fixing errors in your programs. IDEs like Visual Studio, Code::Blocks, and CLion come with built-in debuggers."
                            ),
                            ContentBlock.Text.fromString(
                                "You can use breakpoints to pause your program’s execution at specific points, allowing you to examine the state of variables and track down bugs."
                            ),
                            ContentBlock.Text.fromString(
                                "In this sub-lesson, you’ll learn how to set breakpoints in your IDE and step through your code to understand how it executes."
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 5: Quiz
                    LessonContent(
                        id = "beginner_c2_sub5",
                        title = "Quiz!",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does an IDE do?",
                                options = listOf(
                                    "Compiles code",
                                    "Runs code",
                                    "Both of the above"
                                ),
                                correctAnswer = "Both of the above",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 3: Basic Syntax
            Lesson(
                id = "beginner_cpp3",
                title = "C++ Basic Syntax",
                description = "Ready to dive into C++ syntax? We'll cover essentials like '#include', the all-important 'main()' function, and more. Buckle up, because it's time to code like a pro!",
                subLessons = listOf(
                    // Sub-lesson 1: Why Syntax is Important
                    Lesson(
                        id = "beginner_c3_sub0",
                        title = "Why Syntax is Important",
                        description = "Learn why syntax is your program's BFF. It's like the grammar of programming—skip it, and things just won’t make sense!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: The '#include' Directive
                    Lesson(
                        id = "beginner_c3_sub1",
                        title = "The '#include' Directive",
                        description = "What's the deal with '#include'? It's how you invite external libraries to your C++ party. Think of it like your program's shopping list!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Understanding the 'main()' Function
                    Lesson(
                        id = "beginner_c3_sub2",
                        title = """Understanding the "main()" Function""",
                        description = "The 'main()' function: where every C++ program starts its journey. It's the ‘start’ button for your code!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: C++ Statements
                    Lesson(
                        id = "beginner_c3_sub3",
                        title = "C++ Statements",
                        description = "C++ statements: small but mighty! These are the building blocks of your code. Like LEGO for grown-ups.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: C++ Single Statement
                    Lesson(
                        id = "beginner_c3_sub4",
                        title = "C++ Single Statement",
                        description = "Single statement = one action. Think of it as a solo performance—straight to the point!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: C++ Multiple Statements
                    Lesson(
                        id = "beginner_c3_sub5",
                        title = "C++ Multiple Statements",
                        description = "Multiple statements? It's like a team working together to get things done. Teamwork makes the code work!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: More on Statements
                    Lesson(
                        id = "beginner_c3_sub6",
                        title = "More on Statements!",
                        description = "Let's dig deeper! Think of statements as the tiny gears in the machine of your program.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 8: Code Block Structure
                    Lesson(
                        id = "beginner_c3_sub8",
                        title = "Code Block Structure",
                        description = "Curly braces, baby! Code blocks group statements like a VIP club, making sure everything runs smoothly.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 9: Quiz
                    Lesson(
                        id = "beginner_c3_sub9",
                        title = "Quiz",
                        description = "Test your C++ syntax knowledge. Will you ace it? Or will your code need a little more TLC?",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content 1: Why Syntax is Important
                    LessonContent(
                        id = "beginner_c3_sub0",
                        title = "Why Syntax is Important",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "In C++, syntax is like the grammar of your program. If your syntax is wrong, it’s like speaking a language nobody understands."
                                    append(text)

                                    // Emphasize "MinGW" and "Windows"
                                    val wordsToStyle = listOf("syntax")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text.fromString(
                                "No syntax? No program. Without syntax, you might as well be typing random letters. So, remember, good syntax = good program!"
                            ),
                            ContentBlock.Text.fromString(
                                "Think of it like cooking: If you miss key ingredients, your recipe is doomed. Same goes for programming."
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 2: The '#include' Directive
                    LessonContent(
                        id = "beginner_c3_sub1",
                        title = "The '#include' Directive",
                        contentBlocks = listOf(

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "In C++, '#include' is your invite to external libraries. It’s like going grocery shopping for your code!"
                                    append(text)

                                    // Emphasize "MinGW" and "Windows"
                                    val wordsToStyle = listOf("'#include'")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "For example, '#include <iostream>' invites the I/O library, letting you print stuff on the screen. Pretty handy!"
                                    append(text)

                                    // Emphasize "MinGW" and "Windows"
                                    val wordsToStyle = listOf("'#include <iostream>'")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),


                            ContentBlock.Text.fromString(
                                "Without '#include', you can't call on the outside world. It’s like trying to bake without the recipe!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 3: Understanding the 'main()' Function
                    LessonContent(
                        id = "beginner_c3_sub2",
                        title = "Understanding the 'main()' Function",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Every C++ program has a 'main()' function. It’s like the red carpet where everything begins. No main(), no program."
                            ),
                            ContentBlock.Text.fromString(
                                "Here’s a simple example:"
                            ),
                            ContentBlock.Code(
                                code = """int main() {
                    cout << "Hello, World!" << endl;
                    return 0;
                }""".trimIndent()
                            ),
                            ContentBlock.Text.fromString(
                                "It's like the opening scene of your favorite movie. No main() means no show!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 4: C++ Statements
                    LessonContent(
                        id = "beginner_c3_sub3",
                        title = "C++ Statements",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "A statement in C++ is like a command. ‘Do this, do that.’ Each statement ends with a semicolon—because we’re polite like that!"
                                    append(text)

                                    // Emphasize "MinGW" and "Windows"
                                    val wordsToStyle = listOf("command")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Text.fromString(
                                "Here’s an example statement that tells the program to print something on the screen:"
                            ),
                            ContentBlock.Code(
                                code = "cout << \"Hello, World!\";"
                            ),
                            ContentBlock.Text.fromString(
                                "Think of statements as mini instructions. And each one ends with a semicolon, like ending a sentence with a period!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 5: C++ Single Statement
                    LessonContent(
                        id = "beginner_c3_sub4",
                        title = "Single Statements",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "One statement, one action! Here’s an example of a single statement in C++:"
                            ),
                            ContentBlock.Code(
                                code = "cout << \"I love coding!\";"
                            ),
                            ContentBlock.Text.fromString(
                                "Remember, single statements end with a semicolon. Skipping it? It’s like leaving a period off your sentences!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 6: C++ Multiple Statements
                    LessonContent(
                        id = "beginner_c3_sub5",
                        title = "Multiple Statements",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Multiple statements work together like a team. Here’s how multiple statements team up in C++:"
                            ),
                            ContentBlock.Code(
                                code = """
                #include <iostream>
                using namespace std;

                int main() {
                    cout << "Hello, ";
                    cout << "World!";
                    return 0;
                }
                                    """
                            ),
                            ContentBlock.Text.fromString(
                                "Just like steps in a recipe, each statement adds something special. Teamwork makes the dream work!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 7: More on Statements
                    LessonContent(
                        id = "beginner_c3_sub6",
                        title = "More on Statements!",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Think of statements as tiny gears in a well-oiled machine. The more you have, the more your program can do!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 8: Code Block Structure
                    LessonContent(
                        id = "beginner_c3_sub8",
                        title = "Code Block Structure",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Curly braces '{}': The secret sauce of code blocks. They group statements into manageable units, so your program knows what to do and when!"
                                    append(text)

                                    // Emphasize "MinGW" and "Windows"
                                    val wordsToStyle = listOf("'{}'")
                                    for (word in wordsToStyle) {
                                        val startIndex = text.indexOf(word)
                                        if (startIndex != -1) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7), // Tomato color
                                                    fontWeight = FontWeight.SemiBold
                                                ),
                                                start = startIndex,
                                                end = startIndex + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Text.fromString(
                                "Check out this code block in action:"
                            ),
                            ContentBlock.Code(
                                code = """
                int main() {
                    cout << "Hello!";
                    return 0;
                }
                                    """
                            ),
                            ContentBlock.Text.fromString(
                                "Just like organizing your workspace, code blocks make sure everything stays neat and tidy!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content 9: Quiz
                    LessonContent(
                        id = "beginner_c3_sub9",
                        title = "Quiz",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Time to test your knowledge! Can you handle this quiz?"
                            ),
                            ContentBlock.Text.fromString(
                                "Answer the questions and see how much you've learned so far!"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                )
            ),


            // Lesson 4: C++ Comments
            Lesson(
                id = "beginner_cpp4",
                title = "C++ Comments",
                description = "Learn how to use comments to make your code more readable and maintainable.",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_cpp4_sub1",
                        title = "What Are Comments?",
                        description = "Understand the concept of comments and their purpose in programming.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp4_sub2",
                        title = "Single-Line Comments",
                        description = "Learn how to write single-line comments in C++.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp4_sub3",
                        title = "Multi-Line Comments",
                        description = "Explore the use of multi-line comments for more detailed explanations.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp4_sub4",
                        title = "Why Use Comments?",
                        description = "Discover why comments are essential for writing clear and maintainable code.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp4_sub5",
                        title = "Commenting Best Practices",
                        description = "Master the art of writing effective and meaningful comments.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp4_sub6",
                        title = "Quiz!",
                        description = "Test your knowledge with a quiz on C++ comments.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content 1: What Are Comments?
                    LessonContent(
                        id = "beginner_cpp4_sub1",
                        title = "What Are Comments? 📝",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Comments are messages for humans in the code—notes to yourself or others that help explain what's happening."
                                    append(text)
                                    val styledWords =
                                        listOf("messages for humans", "notes to yourself")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text.fromString(
                                "The computer skips comments when running your code. They’re for clarity, not execution."
                            ),
                            ContentBlock.Code(
                                code = """// This is a single-line comment!"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 2: Single-Line Comments
                    LessonContent(
                        id = "beginner_cpp4_sub2",
                        title = "Single-Line Comments",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("A single-line comment starts with ")
                                    pushStyle(
                                        SpanStyle(
                                            color = Color(0xFF05B3E7),
                                            fontWeight = FontWeight.Bold
                                        )
                                    )
                                    append("//")
                                    pop()
                                    append(". Perfect for quick notes.")
                                }
                            ),
                            ContentBlock.Code(
                                code = """// Print a friendly message
                cout << "Hello, World!";"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 3: Multi-Line Comments
                    LessonContent(
                        id = "beginner_cpp4_sub3",
                        title = "Multi-Line Comments",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Use multi-line comments for longer explanations. Start with '/*' and end with '*/'."
                            ),
                            ContentBlock.Code(
                                code = """/*
                This is a multi-line comment.
                It spans multiple lines.
                Perfect for detailed notes!
                */"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 4: Why Use Comments?
                    LessonContent(
                        id = "beginner_cpp4_sub4",
                        title = "Why Use Comments? 🤔",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "- Comments make code easier to understand.\n" +
                                        "- They are lifesavers for debugging.\n" +
                                        "- They ensure your code is maintainable for others and yourself."
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 5: Commenting Best Practices
                    LessonContent(
                        id = "beginner_cpp4_sub5",
                        title = "Commenting Best Practices 🧹",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "- Be concise: Stick to the point.\n" +
                                                "- Avoid stating the obvious: Explain the 'why,' not the 'what.'\n" +
                                                "- Keep comments updated: Remove or revise outdated notes."
                                    append(text)
                                    val styledWords =
                                        listOf(
                                            "Be concise:",
                                            "Avoid stating the obvious:",
                                            "Keep comments updated:"
                                        )
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content 6: Quiz!
                    LessonContent(
                        id = "beginner_cpp4_sub6",
                        title = "Quiz! 📝",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which symbol starts a single-line comment in C++?",
                                options = listOf("//", "/*", "##", "#"),
                                correctAnswer = "//",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // Lesson 5 : C++ Output
            Lesson(
                id = "beginner_cpp5",
                title = "C++ Output",
                description = "Learn how to make your C++ program talk to you (okay, not literally). From printing text to numbers, let’s see how to show some cool stuff on the screen.",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_cpp5_sub1",
                        title = "What is Output?",
                        description = "What’s the point of a program if it stays silent? Let’s learn what output is all about.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp5_sub2",
                        title = "Introducing cout",
                        description = "Meet 'cout', your program’s microphone for talking to the screen.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp5_sub3",
                        title = "Printing Text",
                        description = "Learn how to make your program say, \"Hello, World!\" (because that’s tradition).",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp5_sub4",
                        title = "Printing Numbers",
                        description = "Find out how to display numbers, like showing off your favorite ones.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp5_sub5",
                        title = "Adding New Lines with \\n",
                        description = "Let’s learn how to neatly move text to a new line. Nobody likes a messy program.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp5_sub6",
                        title = "Using endl",
                        description = "Another way to break lines – because options are nice!",
                        status = LessonStatus.LOCKED
                    ),

                    Lesson(
                        id = "beginner_cpp5_sub7",
                        title = "Quiz Time!",
                        description = "Time to show off what you learned – don’t worry, there’s no grade.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Lesson Content 1: What is Output?
                    LessonContent(
                        id = "beginner_cpp5_sub1",
                        title = "What is Output?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Output is how your program shares things with you. " +
                                                "Think of it as your program's way of saying, \"Hey, look what I can do!\""
                                    append(text)
                                    val styledWords =
                                        listOf("Hey, look what I can do!")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text.fromString(
                                "In programming, output means displaying text, numbers, or results to the screen. Without it, your program is like a mime – silent and mysterious."
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Next, we’ll introduce the superstar of C++ output: 'cout' with '<<'."
                                    append(text)
                                    val styledWords =
                                        listOf("'cout'", "'<<'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Lesson Content 2: Introducing cout
                    LessonContent(
                        id = "beginner_cpp5_sub2",
                        title = "Introducing cout",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "In C++, we use 'cout' (pronounced \"see-out\") to send stuff to the screen. It’s part of the iostream library – fancy name, but it’s basically for input and output."
                            ),
                            ContentBlock.Code(
                                code = """
                    #include <iostream>
                    
                    int main() {
                        cout << "Hello, World!";
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Code(
                                "Output: Hello, World!"
                            ),
                            ContentBlock.Text.fromString(
                                "When you run this code, 'cout' sends \"Hello, World!\" to the screen. Easy, right?"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Lesson Content 3: Printing Text
                    LessonContent(
                        id = "beginner_cpp5_sub3",
                        title = "Printing Text",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "To print text, wrap text in double quotes and hand it over to 'cout'. " +
                                                "The quotes tell the program, \"This is text – not some weird command!\""
                                    append(text)
                                    val styledWords = listOf("wrap text in double quotes")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Code(
                                code = """
                    #include <iostream>
                    
                    int main() {
                        cout << "Coding is fun!";
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Code(
                                "Output: Coding is fun!"
                            ),
                            ContentBlock.Text.fromString(
                                """"If you miss those quotes (""), and your program will scream errors at you. Trust me, it’s not pretty."""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Lesson Content 4: Printing Numbers
                    LessonContent(
                        id = "beginner_cpp5_sub4",
                        title = "Printing Numbers",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "Want to show off your favorite number? No need for quotes – just type it!"
                            ),
                            ContentBlock.Code(
                                code = """
                    #include <iostream>
                    
                    int main() {
                        cout << 42;
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Code(
                                "Output: 42"
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Lesson Content 5: Adding New Lines with \n
                    LessonContent(
                        id = "beginner_cpp5_sub5",
                        title = "Adding New Lines with \\n",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Use '\\n' to move to the next line in your output. It’s like hitting the \"Enter\" key when typing."
                                    append(text)
                                    val styledWords = listOf("'\\n'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Code(
                                code = """
                    #include <iostream>
                    
                    int main() {
                        cout << "Line 1\nLine 2";
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Code(
                                "Output: Line 1\nLine 2"
                            ),
                            ContentBlock.Text.fromString(
                                "This is great for keeping things organized. Nobody likes cluttered output!"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Lesson Content 6: Using endl
                    LessonContent(
                        id = "beginner_cpp5_sub6",
                        title = "Using endl",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "'endl' is another way to move to the next line. Bonus: It also clears the output buffer (don’t worry, we’ll explain buffers someday)."
                                    append(text)
                                    val styledWords = listOf("'endl'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Code(
                                code = """
                        cout << "Line 1" << endl << "Line 2";
                    """.trimIndent()
                            ),
                            ContentBlock.Code(
                                "Output: Line 1\nLine 2"
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "'\\n' is faster because it skips the buffer-clearing part. " +
                                                "Use 'endl' if you care about being neat, not speed."
                                    append(text)
                                    val styledWords = listOf("'\n'", "'endl'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),


                    // Lesson Content 7: Quiz Time!
                    LessonContent(
                        id = "beginner_cpp5_sub7",
                        title = "Quiz Time!",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which statement correctly prints 'Hello, World!' to the screen in C++?",
                                options = listOf(
                                    "cout << Hello, World;",
                                    "cout << \"Hello, World!\";",
                                    "print(\"Hello, World!\");",
                                    "console.log(\"Hello, World!\");"
                                ),
                                correctAnswer = "cout << \"Hello, World!\";",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),

                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // Lesson 6 : Variables
            Lesson(
                id = "beginner_cpp6",
                title = "Variables in C++",
                description = "Learn about variables – the containers of your program’s data. From declaring to initializing and using them, let’s dive into the world of variables! 🛠️📦",
                subLessons = listOf(
                    // Sub-lesson 1: Practice Previous Lessons
                    Lesson(
                        id = "beginner_cpp6_sub1",
                        title = "Practice Previous Lessons! 🔄",
                        description = "Before diving into variables, take a moment to practice what you've learned in the previous lessons! This will help you build a strong foundation for the next concepts.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: What Are Variables?
                    Lesson(
                        id = "beginner_cpp6_sub2",
                        title = "What Are Variables?",
                        description = "Variables are like storage boxes in your code. You put data inside them, and later on, you can retrieve it. 🎁 Let’s explore how to declare them!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Declaring Variables
                    Lesson(
                        id = "beginner_cpp6_sub3",
                        title = "Declaring Variables",
                        description = "Before you can use a variable, you need to declare it. 🏷️ This tells the program what type of data the variable will hold.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Initializing Variables
                    Lesson(
                        id = "beginner_cpp6_sub4",
                        title = "Initializing Variables",
                        description = "Once declared, you can initialize variables with values. You can assign data right away, or leave them empty. Let's see how!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Declaring Multiple Variables
                    Lesson(
                        id = "beginner_cpp6_sub5",
                        title = "Declaring Multiple Variables",
                        description = "You can declare multiple variables of the same type in one line.  Let's see how to make the most of this shortcut!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Variable Types
                    Lesson(
                        id = "beginner_cpp6_sub6",
                        title = "Variable Types",
                        description = "C++ offers different data types for variables like 'int', 'float', and 'char'. Let’s learn how to choose the right type!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: Variable Types overview
                    Lesson(
                        id = "beginner_cpp6_sub7",
                        title = "data Types overview",
                        description = "C++ offers different data types for variables like 'int', 'float', and 'char'. Let’s learn how to choose the right type!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 8: Quiz
                    Lesson(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of variables and their declaration in C++! Let’s see if you’re ready to move forward.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "Practice Previous Lessons"
                    LessonContent(
                        id = "beginner_cpp6_sub1",
                        title = "Practice Previous Lessons! 🔄",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Before jumping into variables, take time to practice what you've learned in the previous lessons." +
                                                " Make sure you’re comfortable with the basics to get the most out of this lesson! 💡"
                                    append(text)
                                    val styledWords = listOf("practice")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "What Are Variables?"
                    LessonContent(
                        id = "beginner_cpp6_sub2",
                        title = "What Are Variables?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Variables are like storage containers in your program." +
                                                " You store data in them, and later you can use that data to perform operations or make decisions."
                                    append(text)
                                    val styledWords = listOf("storage containers")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Think of a variable like a labeled box. " +
                                                "You put something inside it (data), and you can retrieve it later by " +
                                                "referring to the label (the variable's name)."
                                    append(text)
                                    val styledWords = listOf("labled box")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Text.fromString(
                                "In C++, we can declare a variable by " +
                                        "specifying its type and giving it a name. Let's see how this works in code! 🖥️"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Declaring Variables"
                    LessonContent(
                        id = "beginner_cpp6_sub3",
                        title = "Declaring Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString(
                                "To declare a variable, we need to specify its type first, followed by its name. " +
                                        "The type determines what kind of data the variable can hold. 🎯"
                            ),
                            ContentBlock.Code(code = "int age;"),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This declares an integer variable named 'age'. But wait – it's not yet holding any value! 🤔"
                                    append(text)
                                    val styledWords = listOf("integer variable named 'age'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Initializing Variables"
                    LessonContent(
                        id = "beginner_cpp6_sub4",
                        title = "Initializing Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("You can initialize a variable by giving it a value right when you declare it. This is like filling the box with something! 🎁"),
                            ContentBlock.Code(code = "int age = 25;"),
                            ContentBlock.Text.fromString("Now the variable 'age' holds the value '25'. You can use it in calculations or display it. 💪")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Declaring Multiple Variables"
                    LessonContent(
                        id = "beginner_cpp6_sub5",
                        title = "Declaring Multiple Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("You can also declare multiple variables of the same type in a single line. This is a great way to keep your code neat and efficient. 🎯"),
                            ContentBlock.Code(code = "int x = 5, y = 10, z = 15;"),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "\"In this case, 'x', 'y', and 'z' are all integer variables, each initialized with a value.\""
                                    append(text)
                                    val styledWords = listOf("'x','y','z'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Variable Types"
                    LessonContent(
                        id = "beginner_cpp6_sub6",
                        title = "Variable Types",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Variables in C++ can hold different types of data," +
                                                " like integers ('int'), floating-point numbers ('float'), " +
                                                "characters ('char'), and more. \uD83D\uDCAD"
                                    append(text)
                                    val styledWords = listOf("different types of data")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Code(code = "float height = 5.9;"),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This declares a variable 'height' that holds a floating-point number (a decimal). " +
                                                "It's important to choose the correct type based on what kind of data you need to store."
                                    append(text)
                                    val styledWords = listOf("choose the correct type")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Text.fromString("In next lesson we have  breakdown of common C++ variable types and how they work!")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Data Types Overview
                    LessonContent(
                        id = "beginner_cpp6_sub6_data_types",
                        title = "Data Types in C++",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("In C++, variables are containers for storing different types of data. Here's a look at common data types: 🎉"),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "int: Stores integers (whole numbers), without decimals, such as 123 or -123."
                                    append(text)
                                    val styledWords = listOf("int:")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "double: Stores floating-point numbers, with decimals, such as 19.99 or -19.99."
                                    append(text)
                                    val styledWords = listOf("double:")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "char: Stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes."
                                    append(text)
                                    val styledWords = listOf("char:")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "string: Stores text, such as \"Hello World\". String values are surrounded by double quotes."
                                    append(text)
                                    val styledWords = listOf("string:")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "bool: Stores values with two states: true or false."
                                    append(text)
                                    val styledWords = listOf("bool:")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of these is the correct syntax to declare a variable in C++? 🧐",
                                options = listOf(
                                    "int age;",
                                    "age int;",
                                    "declare int age;",
                                    "variable age int;"
                                ),
                                correctAnswer = "int age;",
                                userAnswer = null,
                                isCorrect = false
                            ),
//                                ContentBlock.QuizContentBlock(
//                                    question = "What type of variable would you use to store a decimal number? 🤔",
//                                    options = listOf("int", "float", "char", "double"),
//                                    correctAnswer = "float",
//                                    userAnswer = null,
//                                    isCorrect = false
//                                )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 7: More on Variables
            Lesson(
                id = "beginner_cpp7",
                title = "More on Variables",
                description = "Now that you know the basics, let’s explore variables further. This lesson covers naming conventions, constants, and outputting variable values.",
                subLessons = listOf(
                    // Sub-lesson 1: Review Previous Lessons
                    Lesson(
                        id = "beginner_cpp7_sub1",
                        title = "Review Your Variables",
                        description = "Before diving deeper, take a moment to review what you’ve learned so far. Revisiting basics ensures a solid foundation.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 2: Outputting Variables
                    Lesson(
                        id = "beginner_cpp7_sub2",
                        title = "Outputting Variables",
                        description = "Learn how to display variable values using `cout`. Understanding how to work with output is essential for debugging and communicating results.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 3: Naming Variables
                    Lesson(
                        id = "beginner_cpp7_sub3",
                        title = "Naming Variables",
                        description = "Learn the best practices for naming your variables. Descriptive names make your code easier to understand and maintain.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 4: Constants
                    Lesson(
                        id = "beginner_cpp7_sub4",
                        title = "Constants",
                        description = "Discover how to use constants in your programs. They ensure important values remain unchanged.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 5: Naming Conventions
                    Lesson(
                        id = "beginner_cpp7_sub5",
                        title = "Naming Conventions",
                        description = "Explore common naming conventions in C++ and learn why consistency is key for clean, maintainable code.",
                        status = LessonStatus.LOCKED
                    ),
                    // Sub-lesson 6: Quiz
                    Lesson(
                        id = "beginner_cpp7_sub6",
                        title = "Quiz: Naming & Constants",
                        description = "Test your knowledge on naming conventions and constants in this quiz.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "Review Your Variables"
                    LessonContent(
                        id = "beginner_cpp7_sub1",
                        title = "Review Your Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Before advancing, revisit previous lessons. " +
                                                "\nPractice declaring and initializing variables to reinforce your understanding."
                                    append(text)
                                    val styledWords = listOf("Practice")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content for "Outputting Variables"
                    LessonContent(
                        id = "beginner_cpp7_sub2",
                        title = "Outputting Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text = "In C++, you use 'cout' to output values." +
                                            " This is particularly useful for checking the contents of your variables."
                                    append(text)
                                    val styledWords = listOf("'cout'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Code(
                                code = """
                        #include <iostream>
                        using namespace std;
                        
                        int main() {
                            int age = 25;
                            cout << "Your age is: " << age << endl;
                            return 0;
                        }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "In the code above, 'cout' is used to display the value of the variable `age`." +
                                                "\nPractice outputting different types of variables."
                                    append(text)
                                    val styledWords = listOf("Practice outputting")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Naming Variables"
                    LessonContent(
                        id = "beginner_cpp7_sub3",
                        title = "Naming Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Variable names should be descriptive and follow naming conventions." +
                                                " This helps in writing readable and maintainable code."
                                    append(text)
                                    val styledWords = listOf("naming conventions")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Code(
                                code = """
                        // Descriptive and clear name
                        int userAge;
                        
                        // Avoid single-letter names
                        int x;       
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Avoid starting variable names with numbers or using spaces. " +
                                                "For example, '123name','user age' are invalid."
                                    append(text)
                                    val styledWords =
                                        listOf("'123name'", "'user age' are invalid")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Constants"
                    LessonContent(
                        id = "beginner_cpp7_sub4",
                        title = "Constants",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Constants are variables whose values cannot be changed after initialization. They are useful for defining values that should remain constant throughout your program."),
                            ContentBlock.Code(
                                code = """
                        const int MAX_USERS = 100; 
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Using constants improves code readability and reduces the likelihood of errors."
                                    append(text)
                                    val styledWords = listOf("improves code readability")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Naming Conventions"
                    LessonContent(
                        id = "beginner_cpp7_sub5",
                        title = "Naming Conventions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Consistent naming conventions make your code more understandable. Common styles include camelCase and snake_case."
                                    append(text)
                                    val styledWords = listOf("snake_case", "camelCase")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Code(
                                code = """
                        int totalAmount; // camelCase
                        int total_amount; // snake_case
                    """.trimIndent()
                            ),
                            ContentBlock.Text.fromString("Pick a style and stick to it throughout your codebase.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    // Content for "Quiz"
                    LessonContent(
                        id = "beginner_cpp7_sub6",
                        title = "Quiz: Naming & Constants",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following is a valid constant declaration in C++?",
                                options = listOf(
                                    "const int MAX_USERS = 100;",
                                    "int const MAX_USERS = 100;",
                                    "MAX_USERS = 100;"
                                ),
                                correctAnswer = "const int MAX_USERS = 100;",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 8 : C++ User Input
            Lesson(
                id = "beginner_cpp8",
                title = "C++ User Input",
                description = "We’re moving from showing things on the screen to interacting with the user. Ready to let the user speak to your program? Let’s do this! 💬",
                subLessons = listOf(
                    // Sub-lesson 1: Fun Introduction to User Input
                    Lesson(
                        id = "beginner_cpp8_sub1",
                        title = "User Input: Let’s Hear It!",
                        description = "Welcome to the world of User Input! Instead of just talking at the user (with cout), now you’ll let them talk back using cin. Let’s explore how we can get the user’s input with ease.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Getting Simple Input with cin 🎮
                    Lesson(
                        id = "beginner_cpp8_sub2",
                        title = "Getting Input with cin: Ready, Set, Go! ",
                        description = "So, you've learned how to display things. But can your program listen? That’s where cin comes in. It’s like inviting the user to the party and letting them choose the playlist! 🎶",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Example - Get a Number from the User
                    Lesson(
                        id = "beginner_cpp8_sub3",
                        title = "Get a Number: Your First Input ",
                        description = "Here’s where we’ll ask the user for a number. They type it in, and voilà, you’ve got their answer! Let’s make it happen!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Creating a Simple Calculator
                    Lesson(
                        id = "beginner_cpp8_sub4",
                        title = "Creating a Simple Calculator: Math Magic!‍♂",
                        description = "Are you ready to make math fun? Now, let’s build a simple calculator where the user gives you two numbers and you perform the magic (or math) to get the sum.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Fun with Multiple Inputs
                    Lesson(
                        id = "beginner_cpp8_sub5",
                        title = "Multiple Inputs: Getting Fancy",
                        description = "Why settle for one input when you can have more? Let’s spice things up and get multiple inputs from the user. You’re the DJ now, let’s create a party! ",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Quiz Block – Testing Your Input Skills 📝
                    Lesson(
                        id = "beginner_cpp8_sub6",
                        title = "Quiz Time: Test Your User Input Knowledge! ",
                        description = "You’ve learned a lot about user input, so let's see if you can remember what you’ve learned. Ready to put your thinking cap on? ",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "Fun Introduction to User Input"
                    LessonContent(
                        id = "beginner_cpp8_sub1",
                        title = "User Input: Let’s Hear It! 🎤",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Okay, we’ve been talking to the screen with 'cout' like it’s our best friend.But now, it's time to invite the user to the conversation! Enter 'cin', your new best friend in the world of user input."
                                    append(text)

                                    val styledWords = listOf("'cin'")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "In C++, 'cin' stands for 'Character Input' but you can think of it like 'Chat Input'.It lets you receive data from the keyboard. Let’s dive into it! "
                                    append(text)
                                    val styledWords =
                                        listOf("'Character Input'", "receive data")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Getting Input with cin"
                    LessonContent(
                        id = "beginner_cpp8_sub2",
                        title = "Getting Input with cin: Ready, Set, Go!",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("So, you’ve learned how to output data with 'cout'. Now let’s see how we can take some input with 'cin'. It’s like when your friend says, ‘Hey, tell me a joke!’ You reply, and they laugh."),
                            ContentBlock.Text.fromString("Here’s how it works:"),
                            ContentBlock.Code(
                                code = """
int x; 
cout << 'Type a number: '; 
cin >> x;
cout << 'Your number is: ' << x;
                """
                            ),
                            ContentBlock.Text.fromString("Now, your program is waiting for the user to type something. Just like how you wait for a pizza delivery. 🍕")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Get a Number from the User"
                    LessonContent(
                        id = "beginner_cpp8_sub3",
                        title = "Your First Input",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("In this lesson, let’s get the user’s number. Simple, right? Here’s an example:"),
                            ContentBlock.Code(
                                code = """
int x;
cout << 'Type a number: ';
cin >> x;
cout << 'Your number is: ' << x;
                """
                            ),
                            ContentBlock.Text.fromString("Now your program can talk back! It’s like magic, but real!✨")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Creating a Simple Calculator"
                    LessonContent(
                        id = "beginner_cpp8_sub4",
                        title = "Creating a Simple Calculator: Math Magic!️",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Let’s build a simple calculator. The user will give us two numbers, and we’ll sum them up. Easy, right? Let’s make it happen!"

                                    append(text)

                                    val styledWords = listOf("simple calculator")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),
                            ContentBlock.Code(
                                code = """
int x, y, sum;
cout << 'Type a number: ';
cin >> x;
cout << 'Type another number: ';
cin >> y;
sum = x + y;
cout << 'Sum is: ' << sum;
                """
                            ),
                            ContentBlock.Code(
                                code = "Output: Sum is __"

                            ),
                            ContentBlock.Text.fromString("You’ve just built your first calculator! You’re officially a programmer! 🎉")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Multiple Inputs"
                    LessonContent(
                        id = "beginner_cpp8_sub5",
                        title = "Multiple Inputs: Getting Fancy ️",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Now, let’s get fancy with multiple inputs. Who said we can’t handle more than one request at a time?"

                                    append(text)

                                    val styledWords = listOf("multiple inputs")
                                    for (word in styledWords) {
                                        val start = text.indexOf(word)
                                        if (start >= 0) {
                                            addStyle(
                                                style = SpanStyle(
                                                    fontSize = 16.sp,
                                                    color = Color(0xFF05B3E7),
                                                    fontWeight = FontWeight.Bold
                                                ),
                                                start = start,
                                                end = start + word.length
                                            )
                                        }
                                    }
                                }
                            ),

                            ContentBlock.Text.fromString("You can ask the user for multiple inputs at once. Here’s how:"),
                            ContentBlock.Code(
                                code = """
int x, y, z;
cout << 'Enter three numbers: ';
cin >> x >> y >> z;
cout << 'You entered: ' << x << ', ' << y << ', ' << z;
                """
                            ),
                            ContentBlock.Text.fromString("Boom! You just handled multiple inputs like a pro!️")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for Quiz Block
                    LessonContent(
                        id = "beginner_cpp8_sub6",
                        title = "Quiz Time: Test Your User Input Knowledge! 🧠",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which keyword is used to get user input in C++?",
                                options = listOf("cin", "cout", "get", "input"),
                                correctAnswer = "cin",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 9: C++ Data types
            Lesson(
                id = "beginner_cpp9",
                title = "C++ Data Types",
                description = "We’ve learned how to get input from the user, but now it’s time to store that data in the right container! Ready to choose the right data type for the job?",
                subLessons = listOf(
                    // Sub-lesson 1: Fun Introduction to Data Types
                    Lesson(
                        id = "beginner_cpp9_sub1",
                        title = "The Right Container for Your Data!",
                        description = "In the world of programming, there are many types of data, and just like we pack things in different bags, we store data in different types. Let's get to know them!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Working with Numbers ('int', 'float', 'double')
                    Lesson(
                        id = "beginner_cpp9_sub2",
                        title = "Counting on 'int', 'float', and 'double'!",
                        description = "When you need to store numbers, you have several choices. Use 'int' for whole numbers, 'float' for numbers with decimals, and 'double' when you need more precision. It’s like choosing between a pencil, a marker, and a fine-tipped pen!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Booleans ('bool') – True or False?
                    Lesson(
                        id = "beginner_cpp9_sub3",
                        title = "Booleans ('bool'): True or False?",
                        description = "Booleans can store only two values: 'true' or 'false'. It's like flipping a coin! Will it be heads or tails? You decide.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Characters ('char') – The Alphabet's Little Helper!
                    Lesson(
                        id = "beginner_cpp9_sub4",
                        title = "Characters ('char'): The Alphabet's Little Helper!",
                        description = "Need to store a single letter? Use 'char'! It’s like putting one letter into a tiny pocket. Need more letters? Use 'string' for the whole word!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Strings ('string') – Words Are Important!
                    Lesson(
                        id = "beginner_cpp9_sub5",
                        title = "Strings ('string'): Words Are Important!",
                        description = "When you need to store more than one letter, use 'string'. It’s like writing a sentence in your notebook!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Quiz Block – Testing Your Data Types Knowledge
                    Lesson(
                        id = "beginner_cpp9_sub6",
                        title = "Quiz Time: Test Your Data Types Knowledge!",
                        description = "Now that you’ve learned the data types, let’s test your knowledge. Ready to show what you’ve got?",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "Fun Introduction to Data Types"
                    LessonContent(
                        id = "beginner_cpp9_sub1",
                        title = "The Right Container for Your Data!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Just like packing your clothes into different bags for a trip, C++ requires you to store data in different types. You can store whole numbers in 'int', decimals in 'float' or 'double', and even characters or words in 'char' and 'string'. Each has its purpose!")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Working with Numbers ('int', 'float', 'double')"
                    LessonContent(
                        id = "beginner_cpp9_sub2",
                        title = "Counting on 'int', 'float', and 'double'!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Numbers come in all shapes and sizes, and C++ has the perfect containers for them: 'int' for whole numbers, 'float' for decimal numbers, and 'double' for high-precision numbers.")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
int age = 25;
float height = 5.9;
double pi = 3.1415926535;
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In this example, we use 'int' for the age, 'float' for the height, and 'double' for Pi's precise value.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Booleans ('bool')"
                    LessonContent(
                        id = "beginner_cpp9_sub3",
                        title = "Booleans ('bool'): True or False?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Booleans store one of two values: 'true' or 'false'. They are perfect for making decisions. Let’s use a 'bool' to check if it's sunny!")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
bool isSunny = true;
cout << 'Is it sunny? ' << isSunny;
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In this example, 'isSunny' is set to 'true', so the program will print 'Is it sunny? 1'. In C++, 'true' is represented by 1, and 'false' is represented by 0.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Characters ('char')"
                    LessonContent(
                        id = "beginner_cpp9_sub4",
                        title = "Characters ('char'): The Alphabet's Little Helper!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Need to store a single letter or character? Use 'char'! It's perfect for representing things like grades, initials, or even emoji!")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
char grade = 'A';
char symbol = '#';
cout << 'Grade: ' << grade << ', Symbol: ' << symbol;
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In this example, 'grade' stores a single character ('A'), and 'symbol' stores the '#' symbol.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Strings ('string')"
                    LessonContent(
                        id = "beginner_cpp9_sub5",
                        title = "Strings ('string'): Words Are Important!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("When you need to store a sequence of characters (like a name or sentence), use 'string'.")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
string greeting = 'Hello, world!';
cout << 'Greeting: ' << greeting;
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In this example, we store a full sentence in 'string'. It's like having a word processor for your program!")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Quiz Block"
                    LessonContent(
                        id = "beginner_cpp9_sub6",
                        title = "Quiz Time: Test Your Data Types Knowledge!",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which data type would you use to store the number 3.14?",
                                options = listOf("int", "float", "bool", "string"),
                                correctAnswer = "float",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // Lesson 10: String in C++
            Lesson(
                id = "beginner_cpp10",
                title = "C++ Strings: The Word Wizards!",
                description = "Time to play with strings! Let's learn how to handle words, numbers, and user input in C++!",
                subLessons = listOf(
                    // Sub-lesson 1: Introduction to Strings
                    Lesson(
                        id = "beginner_cpp10_sub1",
                        title = "Strings: The Basics",
                        description = "Strings hold words and sentences! Let’s create a simple string and display it.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: String Concatenation
                    Lesson(
                        id = "beginner_cpp10_sub2",
                        title = "String Concatenation",
                        description = "Combine strings and numbers together with concatenation. It’s like making a message!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: String Input
                    Lesson(
                        id = "beginner_cpp10_sub3",
                        title = "User Input with Strings",
                        description = "Take input from the user and store it in a string.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: String Length
                    Lesson(
                        id = "beginner_cpp10_sub4",
                        title = "Measuring String Length",
                        description = "Find out how many characters are in your string.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: String Functions
                    Lesson(
                        id = "beginner_cpp10_sub5",
                        title = "Using String Functions",
                        description = "Learn some fun functions like 'substr()' and 'find()' to manipulate strings.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: String Quiz
                    Lesson(
                        id = "beginner_cpp10_sub6",
                        title = "String Quiz",
                        description = "Test your string knowledge with a fun quiz!",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "Strings: The Basics"
                    LessonContent(
                        id = "beginner_cpp10_sub1",
                        title = "Strings: The Basics",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Strings are used to store text. Here's how we can store and display a simple string:"
                                    append(text)
                                }
                            ),
                            ContentBlock.Code(
                                code = """
string greeting = "Hello, World!";
cout << greeting;
                """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text = "This prints: 'Hello, World!'"
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "String Concatenation"
                    LessonContent(
                        id = "beginner_cpp10_sub2",
                        title = "String Concatenation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "You can combine strings and numbers using concatenation:"
                                    append(text)
                                }
                            ),
                            ContentBlock.Code(
                                code = """
string name = "Alice";
int age = 30;
cout << "Hello, " << name << ". You are " << age << " years old.";
                """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This will output: 'Hello, Alice. You are 30 years old.'"
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "User Input with Strings"
                    LessonContent(
                        id = "beginner_cpp10_sub3",
                        title = "User Input with Strings",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text = "Get user input and store it in a string:"
                                    append(text)
                                }
                            ),
                            ContentBlock.Code(
                                code = """
string name;
getline(cin, name);
cout << "Hello, " << name << "!";
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This asks for a name, and when you enter it, it prints: 'Hello, [your name]!'"
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Measuring String Length"
                    LessonContent(
                        id = "beginner_cpp10_sub4",
                        title = "Measuring String Length",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "To find the length of a string, use the 'length()' function:"
                                    append(text)
                                }
                            ),
                            ContentBlock.Code(
                                code = """
string message = "C++ is awesome!";
cout << message.length();
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This will print '15', the number of characters in the string."
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Using String Functions"
                    LessonContent(
                        id = "beginner_cpp10_sub5",
                        title = "Using String Functions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "You can use various functions to manipulate strings. For example, 'substr()' extracts a part of the string:"
                                    append(text)
                                }
                            ),
                            ContentBlock.Code(
                                code = """
string message = "Hello, World!";
string part = message.substr(0, 5);
cout << part;
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text = "This will print 'Hello'."
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "String Quiz"
                    LessonContent(
                        id = "beginner_cpp10_sub6",
                        title = "String Quiz",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What function is used to get the length of a string?",
                                options = listOf("size()", "length()", "getLength()"),
                                correctAnswer = "length()"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // Lesson 11: Booleans
            Lesson(
                id = "beginner_cpp11",
                title = "Booleans: True or False?",
                description = "Time to learn about Booleans in C++! Let’s play with true or false!",
                subLessons = listOf(
                    // Sub-lesson 1: Introduction to Booleans
                    Lesson(
                        id = "beginner_cpp11_sub1",
                        title = "Booleans: Yes or No?",
                        description = "Let's start with a boolean variable that checks if something is true or false.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Using Booleans in Decisions
                    Lesson(
                        id = "beginner_cpp11_sub2",
                        title = "Booleans for Decisions",
                        description = "Booleans help make decisions. We’ll see how to use 'true' or 'false' for making choices.",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Boolean Variables in Action
                    Lesson(
                        id = "beginner_cpp11_sub3",
                        title = "Boolean Variables in Action",
                        description = "In this lesson, we’ll use boolean variables in different scenarios. Don’t worry about using 'if-else' for now, we’ll cover that in the next lesson!",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Boolean Quiz
                    Lesson(
                        id = "beginner_cpp11_sub4",
                        title = "Boolean Quiz",
                        description = "Test your knowledge with a fun quiz about booleans!",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "Booleans: Yes or No?"
                    LessonContent(
                        id = "beginner_cpp11_sub1",
                        title = "Booleans: Yes or No?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Ever been asked if you want to go to school and you said 'no'? But your mother said 'Yes!'"
                                    append(text)
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "That's how it feels when we deal with booleans in C++. A boolean can be either 'true' or 'false', and that's all!"
                                    append(text)
                                }
                            ),

                            ContentBlock.Code(
                                code = """
bool isSchoolToday = false;
cout << isSchoolToday;
                    """.trimIndent()
                            ),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This will output: '0' because 'false' is represented as '0' in C++. If it were 'true', it would output '1'!"
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Booleans for Decisions"
                    LessonContent(
                        id = "beginner_cpp11_sub2",
                        title = "Booleans for Decisions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Let’s use booleans to make decisions. You might want to check if it’s the weekend and whether to relax or do homework."
                                    append(text)
                                }
                            ),

                            ContentBlock.Code(
                                code = """
bool isWeekend = true;
cout << "Is it the weekend? " << isWeekend;
                    """
                            ),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "This will output '1' because 'true' is represented as '1' in C++, and if it were 'false', it would print '0'."
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Boolean Variables in Action"
                    LessonContent(
                        id = "beginner_cpp11_sub3",
                        title = "Boolean Variables in Action",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Booleans can be used to check conditions and represent different states. Let’s try a scenario where we check if a student has passed their exam."
                                    append(text)
                                }
                            ),

                            ContentBlock.Code(
                                code = """
bool hasPassedExam = true;
cout << "Has the student passed the exam? " << hasPassedExam;
                    """
                            ),

                            ContentBlock.Text(
                                buildAnnotatedString {
                                    val text =
                                        "Here, if 'hasPassedExam' is 'true', it will print '1' (passed), and 'false' will print '0' (not passed). This helps us track true or false scenarios!"
                                    append(text)
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Boolean Quiz"
                    LessonContent(
                        id = "beginner_cpp11_sub4",
                        title = "Boolean Quiz",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the value of a boolean 'false' in C++?",
                                options = listOf("1", "0", "true"),
                                correctAnswer = "0"
                            ),
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            //Lesson 12 : Else if
            Lesson(
                id = "beginner_cpp12",
                title = "If-Else – Make Choices!",
                description = "Time to make decisions in your code! With If-Else, you can choose what happens next in your program. Let’s get started!",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_cpp12_sub1",
                        title = "What is If-Else?",
                        description = "Let’s explore what If-Else does in the world of code. It’s like making decisions every day: should I stay in bed or get up? We’ll figure that out with If-Else.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp12_sub2",
                        title = "The Ultimate Decision: Should I Eat or Not?",
                        description = "Imagine deciding whether to eat lunch. Should I eat pizza, or am I okay without food? That’s what If-Else is about – making choices based on a condition.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp12_sub3",
                        title = "If-Else: The Code Behind the Decision",
                        description = "Now let’s turn our decision-making into code. If you’re hungry, you eat pizza. If not, maybe salad. Let's see it in action!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp12_sub4",
                        title = "A Simple Decision: Should I Get Up or Not?",
                        description = "Let’s make a simple decision before we dive deeper. Imagine you’re lying in bed, and the big question is: Should I get up or not? If you’re lazy, you stay in bed; otherwise, you get up and conquer the day!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp12_sub5",
                        title = "Else-If and Else: More Choices!",
                        description = "Now, let’s level up! With `else if`, we can check multiple conditions, and with `else`, we have a default choice. Think of it like deciding if you want pizza, burger, or salad – the options just keep getting better!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp12_sub6",
                        title = "Else-If Quiz",
                        description = "Test your knowledge of `else if` and `else` with a fun quiz!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp12_sub7",
                        title = "Final Quiz: Conditionals Recap!",
                        description = "Let's test everything we've learned so far about `if`, `else`, and `else if` in one big quiz!",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_cpp12_sub1",
                        title = "What is If-Else?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("If-Else is like making a choice: if something is true, do one thing; if not, do something else. It’s all about making decisions.")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Think about it like deciding whether to stay in bed or get up. If you’re feeling lazy, you stay in bed. If you’re energetic, you get up! That’s the power of If-Else.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp12_sub2",
                        title = "The Ultimate Decision: Should I Eat or Not?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Imagine you’ve just woken up. The big question: should I eat pizza or not? The answer depends on one condition – are you hungry?")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("If you’re hungry, you get pizza. If not, maybe salad or nothing. That’s the magic of If-Else decisions!")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp12_sub3",
                        title = "If-Else: The Code Behind the Decision",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Here’s how you can express this decision in code:")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
bool isHungry = true;
if (isHungry) {
    cout << "Pizza time!";
} else {
    cout << "Maybe salad or nothing!";
}
                """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("This code checks if you're hungry. If `true`, you get pizza. If `false`, you get salad or nothing. Simple, right?")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp12_sub4",
                        title = "A Simple Decision: Should I Get Up or Not?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("You’ve woken up and the question is: should I get up or stay in bed?")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("If you’re feeling lazy, you stay in bed. If you’re feeling productive, you get up and make coffee.")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Let’s put this into code!")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp12_sub5",
                        title = "Else-If and Else: More Choices!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Here’s where we level up! With `else if`, we can handle more conditions. It’s like saying:")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
bool isHungry = false;
bool isCravingPizza = true;
if (isHungry) {
    cout << "Let’s eat!";
} else if (isCravingPizza) {
    cout << "Pizza time!";
} else {
    cout << "Maybe a snack later!";
}
                """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("This code checks if you’re hungry. If not, it checks if you’re craving pizza. If neither is true, the `else` statement takes over.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp12_sub6",
                        title = "Else-If Quiz",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What will this code print?\n\n`bool isHungry = false;\nbool isCravingPizza = true;\nif (isHungry) {\n    cout << \"Let’s eat!\";\n} else if (isCravingPizza) {\n    cout << \"Pizza time!\";\n} else {\n    cout << \"Maybe a snack later!\";\n}`",
                                options = listOf(
                                    "Let’s eat!",
                                    "Pizza time!",
                                    "Maybe a snack later!"
                                ),
                                correctAnswer = "Pizza time!"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp12_sub7",
                        title = "Final Quiz: Conditionals Recap!",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following is true about `else if` statements?\n\n1. `else if` checks an additional condition if the previous condition was false.\n2. `else if` is the last choice after all other conditions.\n3. You should use `else` instead of `else if` if you have multiple conditions.",
                                options = listOf("Option 1", "Option 2", "Option 3"),
                                correctAnswer = "Option 1"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // Lesson13 :Nested else if
            Lesson(
                id = "beginner_cpp13",
                title = "Nested if-else: Decisions!",
                description = "Ready to level up your decision-making skills? In this lesson, we’ll explore Nested If-Else statements, where you’ll make decisions based on multiple conditions, one inside another. Think of it as deciding what to eat based on your hunger, time, and mood! 🍕🤔",
                subLessons = listOf(
                    // Sub-lesson 1: What is Nested If-Else?
                    Lesson(
                        id = "beginner_cpp13_sub1",
                        title = "What is Nested If-Else?",
                        description = "Nested if-else is like making multiple decisions one after another. For example, if it's sunny, check if you have time for a walk! 🌞🚶‍♂️",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Nested Decisions: Should I Go Outside or Stay In?
                    Lesson(
                        id = "beginner_cpp13_sub2",
                        title = "Nested Decisions: Should I Go Outside or Stay In?",
                        description = "Imagine deciding whether to go outside or not. First, you check if it's sunny, then you check if you have time. If both are true, you go outside! 🌞⏰",
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz on Nested If-Else
                    Lesson(
                        id = "beginner_cpp13_sub5",
                        title = "Quiz on Nested If-Else",
                        description = "Test your understanding of nested if-else logic with a fun quiz! 📝🎉",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    // Content for "What is Nested If-Else?"
                    LessonContent(
                        id = "beginner_cpp13_sub1",
                        title = "What is Nested If-Else?",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Nested if-else is like asking a series of questions. For example, if it's sunny, then check if you have time to go outside. If both are true, you go outside! 🌞🚶‍♂️"),
                            ContentBlock.Text.fromString("It’s like a chain of decisions, where each condition can depend on the result of the previous one.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Should I Go Outside or Stay In?"
                    LessonContent(
                        id = "beginner_cpp13_sub2",
                        title = "Should I Go Outside or Stay In?",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Let’s say you want to decide whether to go outside or not. First, check if it’s sunny. If yes, check if you have time. If both are true, you go outside!"),
                            ContentBlock.Text.fromString("Here’s the code that makes this decision:"),
                            ContentBlock.Code(
                                code = """
int isSunny = 1;  // 1 means it's sunny
int hasTime = 0;  // 0 means you don't have time

if (isSunny) {
    if (hasTime) {
        printf("Go outside!");
    } else {
        printf("Stay inside and relax.");
    }
} else {
    printf("Stay inside.");
}
                    """
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Nested If-Else with AND Logic"
                    LessonContent(
                        id = "beginner_cpp13_sub3",
                        title = "Nested If-Else with AND Logic",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Let’s put the AND logic into nested if-else. First, check if it’s sunny. Then check if you have time. Both must be true to go outside."),
                            ContentBlock.Code(
                                code = """
int isSunny = 1; 
int hasTime = 1; 

if (isSunny) {
    if (hasTime) {
        printf("Let’s go for a walk!");
    } else {
        printf("No time to walk today.");
    }
} else {
    printf("Stay inside.");
}
                    """
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Content for "Quiz on Nested If-Else"
                    LessonContent(
                        id = "beginner_cpp13_sub5",
                        title = "Quiz on Nested If-Else",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What will this code print?\n\n`int isSunny = 1;\nint hasTime = 0;\nif (isSunny) {\n    if (hasTime) {\n        printf(\"Go outside!\");\n    } else {\n        printf(\"Stay inside.\");\n    }\n} else {\n    printf(\"Stay inside.\");\n}`",
                                options = listOf(
                                    "Go outside!",
                                    "Stay inside.",
                                    "It depends on the weather."
                                ),
                                correctAnswer = "Stay inside."
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 14 : Switch case
            Lesson(
                id = "beginner_cpp_switch_case",
                title = "Switch-Case: Simplifying Multiple Choices",
                description = "Time to take decision-making to the next level! With Switch-Case, we can simplify multiple condition checks in a clean and readable way. Let’s dive into it!",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_cpp_switch_case_sub1",
                        title = "Introduction to Switch-Case",
                        description = "In this sub-lesson, we'll understand the Switch-Case structure and how it works. Instead of multiple if-else statements, Switch-Case helps to check multiple conditions at once with ease.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub2",
                        title = "If-Else vs. Switch-Case",
                        description = "Let’s compare `if-else` and `switch-case`. Both help in decision-making, but one is more efficient when handling multiple choices. We’ll see the differences in practice!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub3",
                        title = "The Basic Switch-Case Syntax",
                        description = "Let’s start with the basic syntax of Switch-Case. How to declare a switch statement, use `case` labels, and handle a `default` case.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub4",
                        title = "Understanding `break` and `default` in Switch-Case",
                        description = "Now that we know the basic syntax, let’s learn about the `break` statement and `default` case. These are essential for controlling the flow inside a switch-case.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub5",
                        title = "Switch-Case with Multiple Conditions",
                        description = "Explore using multiple cases in a Switch-Case. What happens if multiple `case` labels point to the same action? Let’s find out!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub6",
                        title = "Switch-Case with Ranges and Expressions",
                        description = "Learn how to handle ranges or more complex expressions within a Switch-Case. This is a step up from simple values!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub7",
                        title = "Common Mistakes in Switch-Case",
                        description = "Understand some of the common pitfalls developers face when using Switch-Case, such as missing `break` statements or fall-through issues.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_cpp_switch_case_sub8",
                        title = "Final Quiz: Mastering Switch-Case",
                        description = "Test your understanding of Switch-Case with a final quiz! Let’s see if you’re ready to handle decision-making in a more efficient way.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub1",
                        title = "Introduction to Switch-Case",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Switch-Case is a control structure that allows you to execute one of many code blocks based on a condition. Think of it as a more organized version of multiple `if-else` statements.")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Instead of checking each condition one by one, `switch-case` checks the condition and jumps directly to the relevant block of code, making your code cleaner and faster to process.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub2",
                        title = "If-Else vs. Switch-Case",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Let’s compare both decision-making structures:\n\n")
                                    append("1. **If-Else:** You have to check each condition one by one. It’s flexible but can get messy with a lot of conditions.\n")
                                    append("2. **Switch-Case:** The switch checks your variable against several values (cases) and jumps to the correct one. It’s cleaner and more efficient when you have many conditions.")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("So, if you have a small number of conditions, `if-else` works fine, but for many options, `switch-case` is preferred for better readability and efficiency.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub3",
                        title = "The Basic Switch-Case Syntax",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Here’s how you write a basic Switch-Case in C++:")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
int number = 2;
switch (number) {
    case 1:
        cout << "One";
        break;
    case 2:
        cout << "Two";
        break;
    case 3:
        cout << "Three";
        break;
    default:
        cout << "Not 1, 2, or 3";
}
                    """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In this example, the `switch` checks the value of `number`. If it matches `case 2`, the program prints 'Two'. If none of the cases match, it goes to the `default` case.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub4",
                        title = "Understanding `break` and `default` in Switch-Case",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In C++, both `break` and `default` are important in a `switch-case` statement:\n\n")
                                    append("1. **`break`:** If you omit the `break` statement, the code will continue to execute the next case after a match (fall-through), which can lead to unexpected behavior. Always use `break` to exit the `switch` after executing a case.\n\n")
                                    append("2. **`default`:** This case is optional, and it’s used when none of the cases match the condition. It’s like the 'else' in an `if-else` statement.")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
int number = 4;
switch (number) {
    case 1:
        cout << "One";
        break;
    case 2:
        cout << "Two";
        break;
    case 3:
        cout << "Three";
        break;
    default:
        cout << "This number is not 1, 2, or 3";
}
                    """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Here, if `number` is 4, it will not match any `case`, so the program will go to the `default` case and print 'This number is not 1, 2, or 3'.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub5",
                        title = "Switch-Case with Multiple Conditions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Sometimes multiple `case` labels can lead to the same action. Let’s see how to handle this:")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
int number = 2;
switch (number) {
    case 1:
    case 2:
    case 3:
        cout << "Small number!";
        break;
    case 4:
    case 5:
        cout << "Big number!";
        break;
    default:
        cout << "Unknown number";
}
                    """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Here, `case 1`, `case 2`, and `case 3` all print 'Small number!'. This is a way to group multiple cases that perform the same action.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub6",
                        title = "Switch-Case with Ranges and Expressions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Now, let’s level up! In modern C++, you can use ranges and expressions within a switch-case. Let’s look at an example of checking ranges:")
                                }
                            ),
                            ContentBlock.Code(
                                code = """
int number = 3;
switch (number) {
    case 1 ... 3:
        cout << "Between 1 and 3!";
        break;
    case 4 ... 6:
        cout << "Between 4 and 6!";
        break;
    default:
        cout << "Number out of range";
}
                    """
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("In this example, we're checking if `number` falls within a range like '1 to 3' or '4 to 6'. This feature is available in newer C++ versions.")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub7",
                        title = "Common Mistakes in Switch-Case",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Let’s review some of the common mistakes developers make while using switch-case:")
                                }
                            ),
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("1. Forgetting to use `break` which leads to fall-through.\n")
                                    append("2. Misusing `default` or omitting it when necessary.\n")
                                    append("3. Trying to switch on complex types like strings (C++11 introduced support for strings).")
                                }
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_cpp_switch_case_sub8",
                        title = "Final Quiz: Mastering Switch-Case",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                buildAnnotatedString {
                                    append("Now that you’ve learned about switch-case, let’s test your knowledge with a quiz. Time to apply everything you’ve learned!")
                                }
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            )
        )
    )
}