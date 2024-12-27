package com.codemaster.codemasterapp.main.AllCourses.PythonCourse

import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.courseIds.CAdvancedStageIds
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun PythonBeginnerCourse(): Stage {
    return Stage(
        id = "python_beginner_stage",
        title = "Python",
        lessons = listOf(

            // Lesson 1: Welcome to Python Programming!
            Lesson(
                id = "beginner_python1",
                title = "Welcome to Python Programming!",
                description = "Begin your Python journey! Learn what Python is, why it’s awesome, and what you’ll achieve in this course.",
                lessonContents = listOf(
                    // Sub-lesson 1: Introduction to Python
                    LessonContent(
                        id = "beginner_python1_sub1",
                        title = "Introduction to Python",
                        description = "Discover what Python is and why it’s a popular programming language.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Python is a versatile and beginner-friendly programming language used for web development, data analysis, AI, and more. " +
                                            "Its simple syntax makes it a favorite among new and experienced developers alike!",
                                    styledText = listOf("experienced developers")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 2: Why Python?
                    LessonContent(
                        id = "beginner_python1_sub2",
                        title = "Why Python?",
                        description = "Learn why Python is an essential skill for modern programmers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Python is everywhere! It powers websites, automates tasks, analyzes data, and even runs machine learning models. " +
                                            "It's simple yet powerful, making it the perfect language to kickstart your programming journey.",
                                    styledText = listOf("perfect language")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: What You’ll Learn
                    LessonContent(
                        id = "beginner_python1_sub3",
                        title = "What You’ll Learn",
                        description = "Explore the key topics we’ll cover in this course.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "In this course, you'll learn:\n" +
                                            "- The basics of Python syntax and structure.\n" +
                                            "- How to work with variables, data types, and operators.\n" +
                                            "- Writing Python functions and understanding control flow.\n" +
                                            "- Using Python for real-world applications like data handling."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Let’s Get Started!
                    LessonContent(
                        id = "beginner_python1_sub4",
                        title = "Let’s Get Started!",
                        description = "Kick off your Python journey with hands-on learning.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "This course is designed to be interactive and fun!\n" +
                                            "- Read the lessons.\n" +
                                            "- Practice coding with simple exercises.\n" +
                                            "- Take quizzes to test your knowledge.\n\n" +
                                            "Ready? Let’s dive into Python programming!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Practice Makes Perfect
                    LessonContent(
                        id = "beginner_python1_sub5",
                        title = "Practice Makes Perfect",
                        description = "Understand the importance of practice in mastering Python.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Programming is a skill you learn by doing.\n" +
                                            "- Write code every day, even if it’s just a few lines.\n" +
                                            "- Experiment with small projects to apply what you learn.\n" +
                                            "- Don’t worry about making mistakes—they’re part of the process!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),


                    // Sub-lesson 6: Quiz Time!
                    LessonContent(
                        id = "beginner_python1_sub6",
                        title = "Quiz Time!",
                        description = "Test your understanding of Python basics.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following is Python known for?",
                                options = listOf(
                                    "Complex syntax",
                                    "Being beginner-friendly",
                                    "Only used for AI",
                                    "None of these"
                                ),
                                correctAnswer = "Being beginner-friendly",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        points = 10,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.ACTIVE,
            ),

            // Lesson 2: Getting Started with Python
            Lesson(
                id = "beginner_python2",
                title = "Getting Started with Python",
                description = "In this lesson, we'll guide you through setting up your Python development environment.",
                lessonContents = listOf(
                    // Sub-lesson 1: Introduction to Running Python Code
                    LessonContent(
                        id = "beginner_python2_sub1",
                        title = "IDE - (Interpreter)",
                        description = "To run Python code, you need the right tools. Let’s get started by setting up everything you need to bring your code to life!",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Before we dive into writing code, let's talk about what you need to actually run your Python programs. You can't just write code and expect it to run on its own – you need a special tool to help you execute your code!")),
                            ContentBlock.Text(createAnnotatedText("This tool is called an IDE or code editor. It’s like your personal coding workspace where you can write, edit, and run your Python code. But don't worry – setting it up is easy and fun!"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 2: Choosing an IDE
                    LessonContent(
                        id = "beginner_python2_sub2",
                        title = "Choosing an IDE",
                        description = "Now that you know you need an IDE, let's look at some popular choices for different platforms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("To start writing Python code, you need an IDE or code editor. Here are some popular options for different platforms:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For Android: Pydroid 3 (Play Store)\nFor iOS: Pythonista",
                                    styledText = listOf("For Android", "For iOS")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For Windows: PyCharm, Visual Studio Code\nFor macOS: PyCharm, Visual Studio Code\nFor Linux: PyCharm, Visual Studio Code",
                                    styledText = listOf("For Windows", "For macOS", "For Linux")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Installing Python
                    LessonContent(
                        id = "beginner_python2_sub3",
                        title = "Installing Python",
                        description = "To run Python code on your PC, you need to install Python. Let’s go through the installation process.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To run Python code, you need to install Python itself. Here’s how to install it:",
                                    styledText = listOf("run Python code")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "1. Visit the official Python website (python.org) and download the latest version for your operating system.\n" +
                                            "2. Run the installer and follow the instructions. Make sure to check the box to add Python to your system PATH.\n" +
                                            "3. Verify the installation by typing `python --version` in your terminal or command prompt.",
                                    styledText = listOf(
                                        "Visit the official Python website",
                                        "Run the installer",
                                        "Verify the installation"
                                    )
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("On macOS and Linux, Python is often pre-installed. To check, type `python3 --version` in the terminal. If not installed, use a package manager like Homebrew (macOS) or apt (Linux)."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Let's Get Started with Coding!
                    LessonContent(
                        id = "beginner_python2_sub4",
                        title = "Let's Get Started with Coding!",
                        description = "Now that you're all set up, let's get ready to learn and code in the coming lessons!",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("You're all set up and ready to go! In the upcoming lessons, we’ll dive into coding, starting with simple and fun projects.")),
                            ContentBlock.Text(createAnnotatedText("Don't worry about writing code just yet – we’ll get there soon! For now, let's get excited about what’s coming up.")),
                            ContentBlock.Text(createAnnotatedText("In the next lessons, you'll start writing your first Python programs. Stay tuned!"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz!
                    LessonContent(
                        id = "beginner_python2_sub5",
                        title = "Quiz!",
                        description = "At the end of this lesson, test your knowledge with a quiz about setting up Python and running your first program.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the first step to run Python code?",
                                options = listOf(
                                    "Install Python",
                                    "Write a Python program",
                                    "Run the code without an IDE"
                                ),
                                correctAnswer = "Install Python",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        points = 10,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 3: Python Syntax Basics
            Lesson(
                id = "beginner_python3",
                title = "Python Syntax Basics",
                description = "In this lesson, we’ll introduce you to the essential syntax of Python, including how to structure your code and the importance of indentation.",
                lessonContents = listOf(
                    // Sub-lesson 1: Introduction to Python Syntax
                    LessonContent(
                        id = "beginner_python3_sub1",
                        title = "Introduction to Python Syntax",
                        description = "Let’s take a look at the basic structure of a Python program. Python syntax is simple and easy to understand, but it's important to follow the rules.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Python uses a very clean and readable syntax. It’s designed to be easy to understand and write. Let’s get familiar with some of the core concepts.",
                                    styledText = listOf("Python", "clean", "readable syntax")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The way you write your code affects how it runs. Following the correct syntax is crucial for making your code work.",
                                    styledText = listOf(
                                        "write your code",
                                        "affects",
                                        "correct syntax"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 2: Indentation in Python
                    LessonContent(
                        id = "beginner_python3_sub2",
                        title = "Indentation in Python",
                        description = "In Python, indentation is not just for readability – it’s a critical part of the syntax. Learn how to use it correctly.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In Python, indentation defines blocks of code. Unlike many other languages, Python does not use braces or other markers. Instead, indentation determines what code belongs to which block.",
                                    styledText = listOf("indentation", "blocks of code", "Python")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, after a statement like `if` or `for`, the code that follows must be indented. Forgetting to indent will result in an error.",
                                    styledText = listOf("if", "for", "indented", "error")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here’s a simple example:\n\nif True:\n    print('This is indented correctly')",
                                    styledText = listOf("True", "indented correctly")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Python Statements and Structure
                    LessonContent(
                        id = "beginner_python3_sub3",
                        title = "Python Statements and Structure",
                        description = "Python code is structured in statements, each of which typically ends with a newline. Let’s look at how statements are used.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Each line of Python code is a statement. Most statements end with a newline, though some can span multiple lines.",
                                    styledText = listOf("statement", "newline", "Python code")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Python doesn’t require semicolons at the end of statements, unlike many other languages. This makes the syntax simpler and more readable.",
                                    styledText = listOf("semicolons", "simpler", "readable")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Colons and Structure in Python
                    LessonContent(
                        id = "beginner_python3_sub4",
                        title = "Colons and Structure in Python",
                        description = "In Python, colons are used to signify the start of a block of code, such as in loops, conditionals, and function definitions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Colons are used to indicate the start of a new block. For example, in an `if` statement or a `for` loop, the colon tells Python to expect an indented block of code.",
                                    styledText = listOf(
                                        "colons",
                                        "new block",
                                        "if statement",
                                        "for loop"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example:\n\nif x > 5:\n    print('x is greater than 5')",
                                    styledText = listOf("x > 5", "print", "greater than 5")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Don't Stress Out!
                    LessonContent(
                        id = "beginner_python3_sub5",
                        title = "Don’t Stress Out!",
                        description = "Take a deep breath – you’ll learn everything at your own pace. Don’t worry if things seem confusing at first, you’ll get the hang of it soon.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Learning to code takes time. You don’t need to understand everything right away. Just take it one step at a time.",
                                    styledText = listOf(
                                        "Learning to code",
                                        "time",
                                        "one step at a time"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Don’t stress out if things seem complicated now – you’ll understand them as you go. Keep practicing and it will start to make sense!",
                                    styledText = listOf(
                                        "Don’t stress out",
                                        "complicated",
                                        "practice"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Quiz!
                    LessonContent(
                        id = "beginner_python3_sub6",
                        title = "Quiz!",
                        description = "Now that you’ve learned about Python syntax, it’s time to test your knowledge with a quiz.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following is used to define a block of code in Python?",
                                options = listOf(
                                    "Indentation",
                                    "Braces",
                                    "Parentheses"
                                ),
                                correctAnswer = "Indentation",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        points = 10,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 4: Python Comments
            Lesson(
                id = "beginner_python4",
                title = "Python Comments",
                description = "Learn how to use comments to make your code more readable and maintainable in Python.",
                lessonContents = listOf(
                    // Content 1: What Are Comments?
                    LessonContent(
                        id = "beginner_python4_sub1",
                        title = "What Are Comments? 📝",
                        description = "Understand the concept of comments and their purpose in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Comments are messages for humans in the code—notes to yourself or others that help explain what's happening.",
                                    styledText = listOf("messages for humans", "notes to yourself")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "The computer skips comments when running your code. They’re for clarity, not execution."
                                )
                            ),
                            ContentBlock.Code(
                                code = """# This is a single-line comment!"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 2: Single-Line Comments
                    LessonContent(
                        id = "beginner_python4_sub2",
                        title = "Single-Line Comments",
                        description = "Learn how to write single-line comments in Python.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A single-line comment starts with '#'",
                                    styledText = listOf("'#'")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Perfect for quick notes. Use single-line comments for simple notes.",
                                    styledText = listOf("quick notes")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
# Print a friendly message
print("Hello, World!")
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 3: Multi-Line Comments
                    LessonContent(
                        id = "beginner_python4_sub3",
                        title = "Multi-Line Comments",
                        description = "Explore the use of multi-line comments for more detailed explanations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Use multi-line comments for longer explanations, " +
                                            "for example explaining a whole logic related to a function or class, etc."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Multi-line comments are written using triple quotes (''' or \")",
                                    styledText = listOf("'''")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
'''
This is a multi-line comment.
It spans multiple lines.
Perfect for detailed notes!
'''
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_python4_sub4",
                        title = "Try Writing Comments! 🖊️",
                        description = "Now it's time to try writing comments in Python! Complete the missing part of the code to add a single-line comment.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the code with an appropriate single-line comment.",
                                incompleteCode = """
def greet():
    ___ this is a comment
    print("Hello, Python!")
""".trimIndent(),
                                correctCode = "#",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        points = 20,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 5: Why Use Comments?
                    LessonContent(
                        id = "beginner_python4_sub5",
                        title = "Why Use Comments? 🤔",
                        description = "Discover why comments are essential for writing clear and maintainable code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "- Comments make code easier to understand.\n" +
                                            "- They are lifesavers for debugging.\n" +
                                            "- They ensure your code is maintainable for others and yourself."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 6: Interactive Code Block
                    LessonContent(
                        id = "beginner_python4_sub6",
                        title = "Complete the Multi-Line Comment Code",
                        description = "Now it's time to practice writing multi-line comments. Complete the code by adding a multi-line comment.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveCodeBlock(
                                question = "Complete the code to write a multi-line comment.",
                                options = listOf("#", "'''", "?"),
                                incompleteCode = """
def example():
    ___ this is a comment and 
    it spans across multiple lines. '''
    print("Python is fun!")
""".trimIndent(),
                                correctAnswer = "'''",
                                userAnswer = null,
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        points = 20,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 7: Commenting Best Practices
                    LessonContent(
                        id = "beginner_python4_sub7",
                        title = "Commenting Best Practices 🧹",
                        description = "Master the art of writing effective and meaningful comments.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "- Be concise: Stick to the point.\n" +
                                            "- Avoid stating the obvious: Explain the 'why,' not the 'what.'\n" +
                                            "- Keep comments updated: Remove or revise outdated notes.",
                                    styledText = listOf(
                                        "Be concise:",
                                        "Avoid stating the obvious:",
                                        "Keep comments updated:"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 8: Quiz
                    LessonContent(
                        id = "beginner_python4_sub8",
                        title = "Quiz!",
                        description = "Basic quiz to check your lesson knowledge.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the meaning of comments in Python?",
                                options = listOf(
                                    "To output text",
                                    "To create text variables",
                                    "To explain code"
                                ),
                                correctAnswer = "To explain code",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ, points = 10,
                        status = LessonStatus.LOCKED
                    ),
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 5: Python Output
            Lesson(
                id = "beginner_python5",
                title = "Output in Python",
                description = "Learn how to display outputs in Python using the print() function.",
                lessonContents = listOf(
                    // Content 1: Why Output?
                    LessonContent(
                        id = "beginner_python5_sub1",
                        title = "Why Output?",
                        description = "Understand the importance of output in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Output is important because it allows us to display results, feedback, or messages to the user. " +
                                            "Without output, the program’s actions would be hidden, making it difficult to understand its behavior. " +
                                            "Output is also useful for debugging and logging purposes."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 2: Displaying Output with print()
                    LessonContent(
                        id = "beginner_python5_sub2",
                        title = "Displaying Output with print()",
                        description = "Learn how to display output using the print() function.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In Python, the print() function is used to display output.",
                                    styledText = listOf("print() function")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Syntax: `print('message')`\n" +
                                            "Example:\n" +
                                            "```python\n" +
                                            "print('Hello, World!')\n" +
                                            "```"
                                )
                            ),
                            ContentBlock.Code(
                                code = """# Display a simple message
print('Welcome to Python programming!')"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 3: Outputting Different Data Types
                    LessonContent(
                        id = "beginner_python5_sub3",
                        title = "Outputting Different Data Types",
                        description = "Learn how to output various data types like numbers, strings, and variables.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "You can use print() to display various types of data, such as numbers, strings, and even variables."
                                )
                            ),
                            ContentBlock.Code(
                                code = """# Displaying numbers and strings
print(42)            # Number
print('Hello!')      # String"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Task - Output a Message
                    LessonContent(
                        id = "beginner_python5_sub4",
                        title = "Try Outputting a Message!",
                        description = "Now it’s time to output a simple message using the print() function.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Write a Python program that outputs a greeting message using print().",
                                incompleteCode = """
# Write your code below to output a greeting message
___
""".trimIndent(),
                                correctCode = "print('Hello, Python!')",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        points = 20,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 5: Output in Real-World Applications
                    LessonContent(
                        id = "beginner_python_output_sub5",
                        title = "Output in Real-World Applications",
                        description = "Discover how output is used in real-world applications for user interaction.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "In real-world applications, output is used to display results of calculations, user messages, and " +
                                            "even to debug code during development. For example, in web development, output is used to display " +
                                            "messages on websites or to log data for monitoring."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 6: Quiz - Understanding Output
                    LessonContent(
                        id = "beginner_python_output_sub6",
                        title = "Quiz - Understanding Output",
                        description = "Test your knowledge about output in Python.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does the print() function do in Python?",
                                options = listOf(
                                    "It takes input from the user",
                                    "It displays output to the screen",
                                    "It saves data to a file"
                                ),
                                correctAnswer = "It displays output to the screen",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        points = 10,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 6: Python Input
            Lesson(
                id = "beginner_python6",
                title = "Input in Python",
                description = "Learn how to take input from users in Python.",
                lessonContents = listOf(
                    // Content 1: Introduction to Input
                    LessonContent(
                        id = "beginner_python6_sub1",
                        title = "What is Input?",
                        description = "Learn why we need to take input from users in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In programming, input is used to get information from the user. This allows the program to work based on what the user provides. For example, asking for the user's name or age.",
                                    styledText = listOf("input", "information")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 2: The input() Function
                    LessonContent(
                        id = "beginner_python6_sub2",
                        title = "How to Use the input() Function",
                        description = "Learn how to use the `input()` function to get data from users.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In Python, we use the `input()` function to get information from the user. It will show a message and wait for the user to type something.",
                                    styledText = listOf("input() function")
                                )
                            ),
                            ContentBlock.Code(
                                code = """# Asking for the user's name
name = input('What is your name? ')
print('Hello, ' + name)"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 3: What Type of Data Does input() Return?
                    LessonContent(
                        id = "beginner_python6_sub3",
                        title = "Understanding the Data Type of Input",
                        description = "Learn that `input()` always gives a string and how to change it to other types like numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The `input()` function always returns the input as a string, even if the user types a number. If you need to use it as a number, you can convert it.",
                                    styledText = listOf("input() function", "string", "convert")
                                )
                            ),
                            ContentBlock.Code(
                                code = """# Converting input to a number
age = int(input('How old are you? '))
print('Next year, you will be', age + 1)"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 4: Handling Errors with Input
                    LessonContent(
                        id = "beginner_python6_sub4",
                        title = "What If the User Makes a Mistake?",
                        description = "Learn how to handle mistakes when users enter the wrong type of data.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Sometimes, users may enter the wrong type of data. For example, if you ask for a number and they type letters, it will cause an error. We can handle these mistakes using `try-except`.",
                                    styledText = listOf("error", "try-except")
                                )
                            ),
                            ContentBlock.Code(
                                code = """# Handling a mistake with try-except
try:
    age = int(input('How old are you? '))
    print('Next year, you will be', age + 1)
except ValueError:
    print('Please enter a valid number for your age.')"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    // Content 5: Complete code
                    LessonContent(
                        id = "beginner_python6_sub5",
                        title = "Your Turn!",
                        description = "Now, it's your turn to write a program that asks the user for their favorite color.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Write a Python program that asks the user for their favorite color and then displays a message using that input.",
                                incompleteCode = """

color = ___('What is your favorite color? ')
print('Your favorite color is', color)
""".trimIndent(),
                                correctCode = "input",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        points = 20,
                        status = LessonStatus.LOCKED
                    ),

                    // Final content: Conclusion and Next Steps
                    LessonContent(
                        id = "beginner_python6_sub6",
                        title = "What's Next?",
                        description = "Don't worry if you're not familiar with variables or data types yet. In the next lesson, we will learn all about variables and data types, so you'll be able to use the input in even more powerful ways!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the next lesson, we will dive deeper into how to store data in variables and understand different types of data. This will help you use the input more effectively!",
                                    styledText = listOf("variables", "data types")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

        )
    )
}