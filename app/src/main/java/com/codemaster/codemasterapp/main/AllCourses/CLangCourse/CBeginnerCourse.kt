package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.InteractiveCodeBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.InteractiveInputBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.QuizContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun CBeginnerCourse(): Stage {
    return Stage(
        id = "c_beginner_stage",
        title = "Beginner",
        lessons = listOf(
            Lesson(
                id = "beginner_c1",
                title = "Introduction to C Programming",
                description = "In this lesson, we’ll cover the basics of programming, exploring the origins, purpose, and structure of the C language.",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c1_sub1",
                        title = "What is Programming?",
                        description = "Understand programming, why it matters, and how it lets computers execute your instructions.",
                        status = LessonStatus.ACTIVE
                    ),
                    Lesson(
                        id = "beginner_c1_sub2",
                        title = "Understanding Code and How It Works",
                        description = "Peek behind the scenes to see how code tells computers what to do.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c1_sub3",
                        title = "Introduction to the C Language",
                        description = "Meet C: the foundation of many modern programming languages.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c1_sub4",
                        title = "Applications of C Programming",
                        description = "Discover where C is used in real-world scenarios like operating systems and embedded systems.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c1_sub5",
                        title = "Why Learn C?",
                        description = "Explore the benefits of learning C, including its role as a foundation for other programming languages.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c1_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c1_sub7",
                        title = "What’s Next?",
                        description = "Preview the journey ahead as we dive into loops, arrays, and advanced concepts.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c1_sub1",
                        title = "What is Programming?",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Programming creates instructions for computers to automate tasks, solve problems, and build software.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Programming languages like C, Python, or Java help us communicate instructions to machines.",
                                    listOf("Programming languages", "C, Python, or Java")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Without programming, your favorite apps and systems wouldn’t exist. 🚀"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c1_sub2",
                        title = "Understanding Code and How It Works",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Code is like a recipe—a series of step-by-step instructions for computers.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C code translates directly into machine language, making it powerful and efficient.",
                                    listOf("C code", "machine language")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Think of it as giving directions versus driving the car yourself."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c1_sub3",
                        title = "Introduction to the C Language",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C was created in the 1970s by Dennis Ritchie for building UNIX.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C combines low-level power with ease of use and has influenced many languages like C++, Java, and Python.",
                                    listOf("low-level", "C++, Java, and Python")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Languages like Python and Java owe their roots to C."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c1_sub4",
                        title = "Applications of C Programming",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C is widely used in operating systems, embedded systems, and gaming.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "It’s essential for gaming, robotics, and embedded systems where precision is key.",
                                    listOf("gaming", "robotics", "embedded systems")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Imagine your gaming console and smartwatch running thanks to C! 🎮"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c1_sub5",
                        title = "Why Learn C?",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Learning C builds a solid foundation in core programming concepts.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C teaches the principles of programming, making it easier to master other languages.",
                                    listOf("principles of programming")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Plus, it’s a valuable skill for software development roles."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c1_sub6",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What makes programming essential for modern technology?",
                                options = listOf(
                                    "It enables precise control over hardware.",
                                    "It allows for the automation of tasks.",
                                    "It is a foundation for software development.",
                                    "All of the above."
                                ),
                                correctAnswer = "All of the above.",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c1_sub7",
                        title = "What’s Next?",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Get ready to unlock the core building blocks of programming! 🚀")),
                            ContentBlock.Text(createSimpleText("In the next lessons, you’ll master input/output, variables, and data types—skills that power every program you’ll ever write. 💡")),
                            ContentBlock.Text(createSimpleText("With hands-on projects, you'll bring ideas to life and take your first big steps as a programmer. 🛠️"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),

                status = LessonStatus.ACTIVE
            ),

            // Lesson 2
            Lesson(
                id = "beginner_c2",
                title = "Setting Up Your Programming Environment",
                description = "Learn to set up your programming environment, write your first C program, and run it. It’s like assembling a robot to do your homework.",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c2_sub1",
                        title = "Installing a C Compiler",
                        description = "Equip yourself with a powerful compiler like GCC or a slick IDE like Code::Blocks. Let’s start your coding adventure!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub2",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub3",
                        title = "Writing Your First Program",
                        description = "Write a program that tells the world 'Hello!' (because politeness matters).",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub4",
                        title = "Running the Program with User Input",
                        description = "Write a program that tells the world 'Hello!' (because politeness matters).",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub5",
                        title = "Running the Program",
                        description = "See your program come alive by compiling and running it. It’s like lighting up a bulb for the first time!",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c2_sub1",
                        title = "Installing a C Compiler",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To start programming, you'll need a C compiler (like GCC) or an IDE (like Code::Blocks or VS Code).",
                                    listOf("C compiler", "GCC", "IDE", "Code::Blocks", "VS Code")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Think of a compiler as a translator between you and your computer. Without it, your computer will stare blankly at your code like a tourist without Google Translate."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub2",
                        title = "What is an IDE?",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is an IDE (Integrated Development Environment)?",
                                options = listOf(
                                    "Notepad",
                                    "VS Code",
                                    "GCC",
                                    "Python"
                                ),
                                correctAnswer = "VS Code",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),

                    LessonContent(
                        id = "beginner_c2_sub3",
                        title = "Writing Your First Program",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Now, let’s write your first C program. Don’t worry—it’s as simple as saying 'Hi' (but to a computer).",
                                    listOf("Hi")
                                )
                            ),
                            ContentBlock.Code(
                                "#include <stdio.h>\n\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Here's what this does:
                        '#include <stdio.h>' tells your program it can use functions like printf().
                        'int main()' is the starting point—like the ignition in your car.
                        'printf()' displays the message 'Hello, World!' on your screen. Neat, right?
                    """.trimIndent(),
                                    listOf("'printf()'", "#include <stdio.h>", "int main()")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub4",
                        title = "Running the Program with User Input",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the following C program by fixing the syntax error (missing semicolon).",
                                options = listOf(
                                    ";",      // Correct option: adding the semicolon
                                    ",",      // Incorrect option: replacing semicolon with comma
                                    ":",      // Incorrect option: using colon instead of semicolon
                                    "."       // Incorrect option: using period instead of semicolon
                                ),
                                correctAnswer = ";",   // Correct answer is the semicolon
                                incompleteCode = """
                #include <stdio.h>
                
                int main() {
                    printf("Hello, World!") // Missing semicolon
                    return 0;
                }
            """.trimIndent(),
                                userAnswer = null
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub5",
                        title = "Running the Program",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Now it’s time to see your creation in action! First, compile your program with the command: `gcc hello_world.c -o hello_world`. Then, run it with: `./hello_world`.",
                                    listOf("`gcc hello_world.c -o hello_world`", "`./hello_world`")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Congratulations! Your computer just said 'Hello, World!' Talk about making new friends. 🎉"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 3
            Lesson(
                id = "beginner_c3",
                title = "C Syntax & Statements",
                description = "Master the rules of C and write error-free code that won't make your robot self-destruct.",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c3_sub1",
                        title = "What is Syntax in C?",
                        description = "Discover the golden rules for writing C programs. Think of it as grammar for robots.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c3_sub2",
                        title = "Core Elements of Syntax",
                        description = "Peek under the hood to understand the building blocks of C syntax. It's like learning how to read your robot's wiring diagram.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c3_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c3_sub4",
                        title = "What is a Statement in C?",
                        description = "Learn the language of robot commands. Teach your robot to say 'Hello!' instead of '404: Emotion Not Found.'",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c3_sub5",
                        title = "Types of Statements in C",
                        description = "Explore different types of instructions that power your programs, from 'turn left' to 'don’t dance in public.'",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c3_sub6",
                        title = "Combining Multiple Statements",
                        description = "Make your program work like a well-oiled machine. No more 'robot dropped coffee on cat' incidents.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c3_sub1",
                        title = "What is Syntax in C?",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Syntax is like the traffic rules for C code. No skipping red lights, or your program crashes!")),
                            ContentBlock.Code(
                                """
                    #include <stdio.h>
                    
                    int main() {
                        printf("Syntax rules? Check!\\n");
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "#include <stdio.h>: Think of this as activating your robot's speech module.",
                                    listOf("#include <stdio.h>")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "int main(): The brain of your program.",
                                    listOf("int main()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "printf: Makes your robot talk!",
                                    listOf("printf")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub2",
                        title = "Core Elements of Syntax",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here's your syntax survival kit:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Keywords: Pre-programmed magic words like 'int', 'return'. They’re like robot commands—strictly followed.",
                                    listOf("Keywords", "int", "return")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Identifiers: Custom names you give, like naming your robot 'RoboBob'.",
                                    listOf("Identifiers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Operators: Tools for your robot, like '+' for adding parts.",
                                    listOf("Operators", "+")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int x = 5, y = 10;
                    int sum = x + y;
                    printf("Sum: %d\\n", sum);
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "4.Delimiters: The punctuation of programming. Miss one, and your robot may explode (not really).",
                                    listOf("Delimiters")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub3",
                        title = "Test Your Knowledge: What is Syntax in C?",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is NOT a key element of syntax in C?",
                                options = listOf(
                                    "Keywords",
                                    "Identifiers",
                                    "Functions",
                                    "Operators"
                                ),
                                correctAnswer = "Functions",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),

                    LessonContent(
                        id = "beginner_c3_sub4",
                        title = "What is a Statement in C?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Statements are the orders you give your robot. Example: 'Start cleaning!'",
                                    listOf("Start cleaning!")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int x = 10;
                    printf("Robot battery: %d%%\\n", x);
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Statements always end with a semicolon. It's like the period in a sentence."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub5",
                        title = "Types of Statements in C",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C statements can be broadly categorized into the following types:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Expression Statements: These evaluate expressions, like assignments or function calls.",
                                    listOf("Expression Statements")
                                )
                            ),
                            ContentBlock.Code(
                                """
int a = 5; // Assignment statement
printf("Hello, World!\\n"); // Function call statement
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Control Statements: These alter the flow of execution.",
                                    listOf("Control Statements")
                                )
                            ),
                            ContentBlock.Code(
                                """
if (a > 0) {
    printf("Positive\\n");
} else {
    printf("Non-positive\\n");
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Compound Statements: A group of statements enclosed in curly braces.",
                                    listOf("Compound Statements")
                                )
                            ),
                            ContentBlock.Code(
                                """
{
    int a = 10;
    printf("%d\\n", a);
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Understanding these types helps you construct better programs."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub6",
                        title = "Combining Multiple Statements",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("When building complex programs, combining multiple statements effectively is crucial.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Using Blocks: Group statements into blocks for clarity and scope.",
                                    listOf("Using Blocks")
                                )
                            ),
                            ContentBlock.Code(
                                """
if (x > 0) {
    int y = x + 1;
    printf("Value: %d\\n", y);
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Using Functions: Encapsulate multiple related statements in functions.",
                                    listOf("Using Functions")
                                )
                            ),
                            ContentBlock.Code(
                                """
void greet() {
    printf("Hello, ");
    printf("World!\\n");
}
int main() {
    greet();
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Chaining Statements: Execute sequential operations for logical flow.",
                                    listOf("Chaining Statements")
                                )
                            ),
                            ContentBlock.Code(
                                """
int a = 5, b = 10;
int sum = a + b;
printf("Sum: %d\\n", sum);
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Effective combination leads to maintainable and error-free code."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),

                status = LessonStatus.LOCKED
            ),

            // lesson 4
            Lesson(
                id = "beginner_c4",
                title = "C Output",
                description = "Learn to talk to your computer with `printf()` and make it answer back—with style and humor! 😄",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c4_sub1",
                        title = "Printing Text in C",
                        description = "Use `printf()` to make your computer say anything you want. 🎉",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c4_sub2",
                        title = "New Lines in Output",
                        description = "Keep your output clean with `\\n`—because messy outputs are so last year.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c4_sub3",
                        title = "Special Characters in Output",
                        description = "Learn escape sequences like `\\t` to format text or `\\\"` to make it fancy!",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c4_sub4",
                        title = "Printing Variables",
                        description = "Ever wanted to show off your variables? `printf()` + format specifiers = magic. 🪄",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c4_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c4_sub6",
                        title = "Printing Multiple Values",
                        description = "Print multiple values like a pro with `printf()` arguments. 🚀",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c4_sub7",
                        title = "Formatted Output",
                        description = "Use formatting tricks to impress even the most organized output fans. ✨",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c4_sub1",
                        title = "Printing Text in C",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "printf() is like a microphone for your computer—use it to shout out messages!",
                                    listOf("printf()")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    printf("Hello, World!"); // Your first computer hello!
    return 0;
}
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Wrap your message in \"...\", just like wrapping a gift. 🎁",
                                    listOf("\"...\"")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c4_sub2",
                        title = "New Lines in Output",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "\\n is your best friend when you want things on different lines!",
                                    listOf("\\n")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    printf("Line 1\\n");
    printf("Line 2\\n");
    return 0;
}
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c4_sub3",
                        title = "Special Characters in Output",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText(text = "Jazz up your output with escape sequences!")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    printf("Tabs\\tare\\tawesome!\\n");
    printf("Quotes: \\\"Wow!\\\"\\n");
    return 0;
}
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c4_sub4",
                        title = "Printing Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Ever wanted to show off your variables? `printf()` with a single format specifier is your key to displaying one value at a time. 🪄 It's like telling your computer, 'Hey, here's my age!'",
                                    listOf("printf()", "format specifiers")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    int age = 20;
    printf("Age: %d", age); // %d for integers
    return 0;
}
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "beginner_c4_sub5",
                        title = "Printing Variables",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the `printf` statement to display the value of the variable 'age'. What format specifier should you use?",
                                incompleteCode = """
                #include <stdio.h>

int main() {
    int age = 20;
    printf("Age: ___", age); // %d for integers
    return 0;
}
            """.trimIndent(),
                                correctCode = """
               %d
            """.trimIndent(),
                                userInput = null, // Initially empty, user will fill this in
                                isCodeCorrect = false // Initially set to false, will be updated later based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c4_sub6",
                        title = "Printing Multiple Values",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use printf() with multiple format specifiers to print different values in a single statement. 🍽️",
                                    listOf("printf()", "format specifiers")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    int age = 25;
    float height = 5.9;
    char initial = 'A';

    printf("Age: %d, Height: %.1f, Initial: %c\\n", age, height, initial);

    return 0;
}
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In the code:\n" +
                                            "%d : For integers (e.g., 'age').\n" +
                                            "%.1f : For floats with 1 decimal (e.g., 'height').\n" +
                                            "%c : For characters (e.g., 'initial').",
                                    listOf("%d", "%.1f", "%c")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c4_sub7",
                        title = "Formatting Output",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Formatting output in C is like dressing up for a party—precision and style matter! Use format specifiers with width and precision settings for a polished look. 🎩✨",
                                    listOf("format specifiers", "precision settings")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 5
            Lesson(
                id = "beginner_c5",
                title = "C Comments",
                description = "Master how to use comments in C for better code readability and documentation! 📚💡",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c5_sub1",
                        title = "Introduction to Comments",
                        description = "What are comments and why they’re important.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c5_sub2",
                        title = "Single-Line Comments",
                        description = "How to use single-line comments in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c5_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c5_sub4",
                        title = "Multi-Line Comments",
                        description = "How to write multi-line comments.",
                        status = LessonStatus.LOCKED
                    ),

                    Lesson(
                        id = "beginner_c5_sub5",
                        title = "Nested Comments",
                        description = "Handling comments inside other comments.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c5_sub6",
                        title = "Best Practices",
                        description = "Best practices for effective commenting.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c5_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c5_sub1",
                        title = "Introduction to Comments",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Comments are notes for humans, ignored by the compiler.")),
                            ContentBlock.Text(createSimpleText("Think of comments as reminders for why your code does what it does.")),
                            ContentBlock.Text(createSimpleText("Without comments, you might forget the logic behind your code later."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub2",
                        title = "Single-Line Comments",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Single-line comments start with '//' and last until the end of the line.",
                                    listOf("//")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Use single-line comments for quick notes.")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    // Print a greeting
    printf("Hello, World!\n");
    return 0;
}
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Think of them as short post-it notes for your code."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub3",
                        title = "Single-Line Comments",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to add a single-line comment.",
                                incompleteCode = """
#include <stdio.h>

int main() {
    ___ Print a greeting
    printf("Hello, World!\\n");
    return 0;
}
            """.trimIndent(),
                                correctCode = "//",
                                userInput = null, // User will input this
                                isCodeCorrect = false // Initially false, updated upon input validation
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub4",
                        title = "Multi-Line Comments",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Multi-line comments start with '/*' and end with '*/', spanning multiple lines.",
                                    listOf("/*", "*/")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Use them for detailed explanations spanning multiple lines.")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    /* This code prints "Hello, World!" 
       It’s part of the beginner’s guide */
    printf("Hello, World!\n");
    return 0;
}
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Don’t overuse multi-line comments, keep them concise."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub5",
                        title = "Nested Comments",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C doesn’t support nested multi-line comments ('/* /* ... */ */').",
                                    listOf("/* /* ... */ */")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Use single-line comments inside multi-line blocks if needed.")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    /* Multi-line comment
       // Single-line comment inside it
       Explaining comments */
    printf("Hello, World!\n");
    return 0;
}
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Stick to simple comment structures for clarity."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub6",
                        title = "Commenting Best Practices",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Good comments clarify why, bad comments state the obvious.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Explain the purpose (why), not what the code does.",
                                    listOf("why")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Avoid comments that repeat the code.")),
                            ContentBlock.Text(createSimpleText("Update comments to stay relevant.")),
                            ContentBlock.Text(createSimpleText("Good Example:")),
                            ContentBlock.Code(
                                """
// Bubble sort is used because the input is small
bubbleSort(arr, n);
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Bad Example:")),
                            ContentBlock.Code(
                                """
// Sorting the array
bubbleSort(arr, n);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub7",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why do we use comments in code?",
                                options = listOf(
                                    "To make the code execute faster",
                                    "To explain the code for better understanding",
                                    "To make the code look longer",
                                    "To remove errors from the code"
                                ),
                                correctAnswer = "To explain the code for better understanding",
                                userAnswer = null, // Initially null, user will select an answer
                                isCorrect = false // Initially false, updated after validation
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 6
            Lesson(
                id = "beginner_c6",
                title = "C Variables",
                description = "Learn how to work with variables in C: declaring, formatting, changing values, and naming! 🎯",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c6_sub1",
                        title = "Creating Variables",
                        description = "Learn how to declare and initialize variables.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub2",
                        title = "Format Specifiers",
                        description = "Understand format specifiers for different data types.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub3",
                        title = "Change Variable Values",
                        description = "Learn how to update the values of variables.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub5",
                        title = "Declare Multiple Variables",
                        description = "Learn how to declare multiple variables in one line.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub6",
                        title = "Variable Names",
                        description = "Understand the rules for naming variables.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub7",
                        title = "Real-Life Example",
                        description = "A practical example using variables in a program.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c6_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c6_sub1",
                        title = "Creating Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Variables are like your digital storage bins. 🗄️ They store data to use later in the program.",
                                    listOf(
                                        "Variables",
                                        "digital storage bins",
                                        "store data"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
                int age = 25;  // Declaring an integer variable with an initial value
                float temperature = 36.5;  // Declaring a float
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub2",
                        title = "Format Specifiers",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Format specifiers are like wardrobe labels for your variables. They ensure things like integers and floats don’t get mixed up! 👚🎯",
                                    listOf("Format specifiers", "variables")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int x = 10;
                printf("The value of x is: %d", x);  // %d for integer
                float pi = 3.14;
                printf("Pi is approximately: %.2f", pi);  // %.2f for float
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub3",
                        title = "Change Variable Values",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("You can swap the value in a variable whenever you want! It’s like updating your shopping list: 'Oh, I need eggs instead of milk! 🥚'")),
                            ContentBlock.Code(
                                """
                int age = 25;
                age = 30;  // Changing the value of age
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub4",
                        title = "Change Variable Values",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to reuse the variable 'age' for updating its value.",
                                incompleteCode = """
                int age = 25;
                ___ = 30;  // Update the value of age
            """.trimIndent(),
                                correctCode = "age", // The correct variable name to complete the code
                                userInput = null, // Initially empty, user will fill this in
                                isCodeCorrect = false // Initially false, updated after validation
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub5",
                        title = "Declare Multiple Variables",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Want to save time? Declare multiple variables in one line! It’s like putting all your shopping items in one cart instead of grabbing each one individually. 🛒",
                                    listOf("Declare multiple variables")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int x = 10, y = 20, z = 30;  // Declaring multiple integers
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub6",
                        title = "Variable Names",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Naming variables is like naming your pets—make it meaningful and easy to remember. 🐶🚫")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Valid names: 'age', '_count', 'temperature1'. Invalid names: '1age', '@count'.",
                                    listOf(
                                        "age",
                                        "temperature1",
                                        "_count",
                                        "1age",
                                        "@count"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Stick to conventions like 'snake_case' for clarity.",
                                    listOf("snake_case")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub7",
                        title = "Real-Life Example",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s how you use variables in a program, like tracking your height and age in your diary:")),
                            ContentBlock.Code(
                                """
                #include <stdio.h>
                
                int main() {
                    int age = 25;
                    float height = 5.9;
                    
                    printf("Age: %d, Height: %.2f", age, height);
                    
                    return 0;
                }
            """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("This program uses variables to store your age and height, then prints them out like a mini bio!"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub8",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "How can you declare multiple variables in a single line?",
                                options = listOf(
                                    "int x, y, z = 10, 20, 30;",
                                    "int x = 10; int y = 20; int z = 30;",
                                    "int x = 10, y = 20, z = 30;",
                                    "int x, y, z = 10;"
                                ),
                                correctAnswer = "int x = 10, y = 20, z = 30;",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 7
            Lesson(
                id = "beginner_c7",
                title = "C Data Types",
                description = "Explore the different data types in C: what they are, how they work, and how to convert between them! 🧮🎯",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c7_sub1",
                        title = "Data Types",
                        description = "Get to know the essential data types in C and their purposes.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub2",
                        title = "The `char` Type",
                        description = "Learn about the `char` type for characters.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub3",
                        title = "Numeric Types",
                        description = "Understand how to handle integer and floating-point numbers.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub5",
                        title = "Set Decimal Precision",
                        description = "Control decimal precision when displaying numbers.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub6",
                        title = "Get the Memory Size",
                        description = "Find out how much memory each data type uses.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub7",
                        title = "Real-Life Example",
                        description = "See a real-world example using C data types.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub8",
                        title = "Type Conversion",
                        description = "Learn how to convert between different data types.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c7_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c7_sub1",
                        title = "Data Types",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, you can store numbers, characters, and more. 🧮🎯",
                                    listOf("C")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key types include:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "int for whole numbers (like your age)",
                                    listOf("int")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "float/double for numbers with decimals (like the price of your coffee)",
                                    listOf("float", "double")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "char for characters (like the letter 'A' on your keyboard)",
                                    listOf("char")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "void when a function doesn't return anything",
                                    listOf("void")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Choosing the right type is like choosing the right tool for the job! 🛠️"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub2",
                        title = "The 'char' Type",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The 'char' type stores a single character. It’s like storing a letter on your keyboard. 🅰️",
                                    listOf("char")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char letter = 'A';  // A character
                    printf("Character: %c", letter);  // Prints A
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub3",
                        title = "Numeric Types",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, numbers are handled with different types: integers and floating-point numbers. 🔢",
                                    listOf("integers", "floating-point")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int age = 25;  // Integer (whole number)
                    float weight = 65.5;  // Float (decimal number)
                    double pi = 3.14159;  // Double (higher precision decimal)
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub4",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to declare a floating-point variable to store weight with one decimal.",
                                incompleteCode = """
                ___ weight = 70.5;  // Declare a variable for weight
            """.trimIndent(),
                                correctCode = "float", // Correct answer
                                userInput = null, // Initially null
                                isCodeCorrect = false // Initially false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub5",
                        title = "Set Decimal Precision",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("You can control how many decimals are displayed using format specifiers. 🎯")),
                            ContentBlock.Code(
                                """
                    float price = 10.12345;
                    printf("Price: %.2f", price);  // Prints 10.12 (rounded to 2 decimals)
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub6",
                        title = "Get the Memory Size",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use 'sizeof()' to check how much memory a data type occupies. 📏",
                                    listOf("sizeof()")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    printf("Size of int: %zu bytes", sizeof(int));  // Check memory size of int
                    printf("Size of char: %zu bytes", sizeof(char));  // Check memory size of char
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub7",
                        title = "Real-Life Example",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s an example using various data types in a simple program:")),
                            ContentBlock.Code(
                                """
                    #include <stdio.h>
                    
                    int main() {
                        int age = 25;
                        float height = 5.9;
                        char grade = 'A';
                        
                        printf("Age: %d, Height: %.1f, Grade: %c", age, height, grade);
                        
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This example demonstrates how to use integers, floats, and chars to store and display data.",
                                    listOf("integers", "floats", "chars")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub8",
                        title = "Type Conversion",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Sometimes, you need to convert types – like turning a floating-point number into an integer. 🔄",
                                    listOf("integer", "floating-point")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "For example, adding an integer to a float results in automatic conversion (implicit conversion).",
                                    listOf("integer", "float")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int num = 5;
                    float result = num + 5.5;  // Implicitly converts int to float
                    printf("Result: %.2f", result);  // Prints 10.50
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Or you can manually convert (explicit conversion) using a cast:")),
                            ContentBlock.Code(
                                """
                    float pi = 3.14;
                    int intPi = (int)pi;  // Explicit conversion from float to int
                    printf("Integer Pi: %d", intPi);  // Prints 3
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub9",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the result of the following operation?\n\nint num = 5;\nfloat result = num + 5.5;\n\nOptions: ",
                                options = listOf("10.50", "5.50", "5", "11"),
                                correctAnswer = "10.50"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // lesson 8
            Lesson(
                id = "beginner_c8",
                title = "C Constants",
                description = "Understand how constants are used in C programs for fixed values that do not change! 🔒",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c8_sub1",
                        title = "Introduction to Constants",
                        description = "Learn what constants are and why to use them.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c8_sub2",
                        title = "Defining Constants",
                        description = "Learn how to define constants in C using `#define` and `const`.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c8_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c8_sub4",
                        title = "Constant Naming",
                        description = "Understand naming conventions for constants.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c8_sub5",
                        title = "Real-Life Example",
                        description = "See a practical example of using constants in a program.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c8_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c8_sub1",
                        title = "Introduction to Constants",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Constants are fixed values that cannot be changed during the execution of a program. 🔒")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "They make code more readable and maintainable by using meaningful names instead of hard-coded numbers.",
                                    listOf("hard-coded")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub2",
                        title = "Defining Constants",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("There are two common ways to define constants in C:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Using #define:",
                                    listOf("#define")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #define PI 3.14159
                    printf("PI value: %f", PI);  // Output: 3.14159
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Using const keyword:",
                                    listOf("const")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    const int maxLimit = 100;
                    printf("Max limit: %d", maxLimit);  // Output: 100
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub3",
                        title = "Defining Constants",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to define a constant for Pi using the #define directive:",
                                incompleteCode = """
        ___ PI 3.14159;  // Define constant Pi
    """.trimIndent(),
                                correctCode = "#define",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub4",
                        title = "Constant Naming",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Naming constants follows the same rules as variables but is often written in uppercase to distinguish them. 📛",
                                    listOf("uppercase")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: const int MAX_SPEED = 120;",
                                    listOf("MAX_SPEED")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Using uppercase letters makes constants easy to identify in code.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub5",
                        title = "Real-Life Example",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Imagine trying to set a limit on how many times you can hit snooze on your alarm. 😴")),
                            ContentBlock.Text(createSimpleText("You wouldn’t want to change that limit every day, right? So, use a constant!")),
                            ContentBlock.Code(
                                """
                    #include <stdio.h>
                    #define MAX_SNOOZES 3
                    
                    int main() {
                        for(int i = 0; i < MAX_SNOOZES; i++) {
                            printf("Snooze #%d of %d\n", i + 1, MAX_SNOOZES);
                        }
                        return 0;
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This program uses a constant MAX_SNOOZES to limit how many times you can press snooze. No more endless snoozing! ⏰",
                                    listOf("MAX_SNOOZES")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub6",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is used to define a constant value that cannot be changed during the program execution in C?",
                                options = listOf(
                                    "#define",
                                    "const",
                                    "int",
                                    "static"
                                ),
                                correctAnswer = "#define",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            // lesson 9
            Lesson(
                id = "beginner_c9",
                title = "C Operators",
                description = "Learn the different operators in C used for performing operations on variables and values! 🔧",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c9_sub1",
                        title = "Introduction to Operators",
                        description = "Understand what operators are and why they're used.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub2",
                        title = "Arithmetic Operators",
                        description = "Learn about the basic arithmetic operators in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub4",
                        title = "Relational Operators",
                        description = "Learn how to compare values using relational operators.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub6",
                        title = "Logical Operators",
                        description = "Explore logical operators for combining conditions.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub8",
                        title = "Assignment and Increment/Decrement Operators",
                        description = "Understand assignment and increment/decrement operations.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c9_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c9_sub1",
                        title = "Introduction to Operators",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Operators are like the tools in your toolbox. Without them, you can't build anything in your program! 🔧")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Examples: '+', '-', '*', '/', '%'. Simple but powerful!",
                                    listOf("+", "-", "*", "/", "%")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub2",
                        title = "Arithmetic Operators",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arithmetic operators are your math buddies. They help you add, subtract, multiply, and divide like a pro:",
                                    listOf("add", "subtract", "multiply", "divide", "%")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int a = 5, b = 3;
                    int sum = a + b;    // 8
                    int diff = a - b;   // 2
                    int prod = a * b;   // 15
                    int quotient = a / b;  // 1
                    int mod = a % b;    // 2
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub3",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the code to calculate the sum of a and b using the appropriate arithmetic operator:",
                                options = listOf(
                                    "+",
                                    "-",
                                    "*",
                                    "/"
                                ), // List of possible operators as options
                                correctAnswer = "+", // Correct operator for addition
                                incompleteCode = """
        int a = 5, b = 3;
        int sum = a ___ b;  // Fill in the missing operator
    """.trimIndent(),
                                userAnswer = null // Initially, the user hasn't answered
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub4",
                        title = "Relational Operators",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Relational operators '>', '<', '==', '!=', '>=', and '<=' compare things, just like deciding whether your pizza is bigger than your friend's, or if you're both on the same level. 🍕",
                                    listOf(">", "<", "==", "!=", ">=", "<=")
                                )
                            ),
                            ContentBlock.Code(
                                """
            int x = 10, y = 20;
            bool result = (x > y);   // false (Is x greater than y?)
            result = (x < y);        // true  (Is x less than y?)
            result = (x == y);       // false (Are x and y equal?)
            result = (x != y);       // true  (Are x and y not equal?)
            result = (x >= y);       // false (Is x greater than or equal to y?)
            result = (x <= y);       // true  (Is x less than or equal to y?)
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub5",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the code to check if x is greater than y using the correct relational operator:",
                                options = listOf(
                                    ">",
                                    "<",
                                    "==",
                                    ">=",
                                    "<="
                                ), // List of possible relational operators
                                correctAnswer = ">", // Correct relational operator for "greater than"
                                incompleteCode = """
        int x = 10, y = 20;
        bool result = (x ___ y);  // Fill in the missing relational operator
    """.trimIndent(),
                                userAnswer = null // Initially, the user hasn't answered
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub6",
                        title = "Logical Operators",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Logical operators '&&', '||', and '!' combine conditions, like deciding whether you want to go out if it's sunny AND warm:",
                                    listOf("&&", "||", "!")
                                )
                            ),
                            ContentBlock.Code(
                                """
            int a = 1, b = 0;
            bool result = (a && b);  // false (Both conditions must be true)
            result = (a || b);       // true  (At least one condition must be true)
            result = !a;             // false (Negates the condition)
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub7",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the code to check if both a and b are true using the correct logical operator:",
                                options = listOf(
                                    "&&",
                                    "||",
                                    "!"
                                ),  // List of possible logical operators
                                correctAnswer = "&&",               // Correct answer for logical AND
                                incompleteCode = """
        int a = 1, b = 0;
        bool result = (a ___ b);  // Fill in the missing logical operator
    """.trimIndent(),
                                userAnswer = null  // Initially, the user hasn't provided an answer
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub8",
                        title = "Assignment and Increment/Decrement Operators",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Assignment stores a value, increment and decrement change it. Like adjusting the volume up or down:",
                                    listOf("increment", "decrement")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int a = 5;
                    a++;  // a becomes 6
                    a--;  // a becomes 5
                    int b = 10;
                    b += 5;  // b becomes 15
                    b *= 2;  // b becomes 30
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub9",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What will the value of `a` be after executing 'a += 5;' where 'a = 3'?",
                                options = listOf("3", "5", "8", "10"), // Possible answers
                                correctAnswer = "8", // Correct value after increment
                                userAnswer = null, // User hasn't answered yet
                                isCorrect = false // Initially, the answer is incorrect
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // lesson 10

            Lesson(
                id = "beginner_c10",
                title = "C Booleans",
                description = "Learn how to use booleans in C for conditional statements and logical operations! ✅❌",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c10_sub1",
                        title = "Introduction to Booleans",
                        description = "Understand what booleans are and how they work in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c10_sub2",
                        title = "Basic Boolean Representation",
                        description = "Learn how boolean values are represented as `0` and `1` in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c10_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c10_sub4",
                        title = "Boolean Values",
                        description = "Learn how to use `true` and `false` values with the `stdbool.h` library.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c10_sub5",
                        title = "Boolean Operations",
                        description = "Use booleans in logical expressions.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c10_sub6",
                        title = "Boolean in Conditional Statements",
                        description = "How to use booleans in `if` and `while` statements.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c10_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c10_sub1",
                        title = "Introduction to Booleans",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A boolean is like a yes/no decision. It's either 'true' (1) or 'false' (0), like deciding whether you want pizza: Yes = True, No = False. 🍕❌",
                                    listOf(
                                        "yes",
                                        "no",
                                        "true",
                                        "(1)",
                                        "false",
                                        "(0)",
                                        "Yes",
                                        "True",
                                        "No",
                                        "False"
                                    )
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub2",
                        title = "Basic Boolean Representation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, booleans are represented as '0' for false and '1' for true. It's like having a light switch that only knows on (1) or off (0). 💡",
                                    listOf("0", "false", "true", "1", "(1)", "(0)")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int flag = 1;  // true
                    int isZero = 0;  // false
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub3",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Which of the following is the correct representation of a false boolean value in C?",
                                options = listOf("0", "1", "true", "false"),
                                correctAnswer = "0",
                                incompleteCode = """
            int flag = ___;  // Complete the code with the correct representation of a boolean value
    """.trimIndent(),  // Code with a placeholder for the user to fill
                                userAnswer = null  // User has not answered yet
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub4",
                        title = "Boolean Values",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The 'stdbool.h' library in C gives us bool type. It’s like making your conditions more readable, like using 'true' for yes and 'false' for no.",
                                    listOf("stdbool.h", "bool", "false", "true")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #include <stdbool.h>
                    
                    bool isEven = true;   // true (1)
                    bool isOdd = false;   // false (0)
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub5",
                        title = "Boolean Operations",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Logical operations combine conditions, like deciding whether to go out if it's sunny AND warm:")),
                            ContentBlock.Code(
                                """
                    bool a = true, b = false;
                    bool result = a && b;  // false (AND)
                    result = a || b;       // true (OR)
                    result = !a;           // false (NOT)
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub6",
                        title = "Boolean in Conditional Statements",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Booleans control your program's flow. Like asking, 'Should I go out? If true, I’ll go!' 🤔")),
                            ContentBlock.Code(
                                """
                    if (isEven) {
                        printf("Even number\n");
                    } else {
                        printf("Odd number\n");
                    }
                    
                    while (!isOdd) {
                        printf("Still not odd\n");
                        isOdd = true; // Update condition
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub7",
                        title = "Boolean in Conditional Statements",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the result of '!true' in boolean logic?",
                                options = listOf("true", "false", "undefined", "error"),
                                correctAnswer = "false", // NOT true is false
                                userAnswer = null, // User hasn't answered yet
                                isCorrect = false // Initially, the answer is incorrect)
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // continue from here to add more lessons

        )
    )
}