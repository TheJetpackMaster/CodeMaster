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
                        description = "Understand programming, why it matters, and how it lets computers execute your instructions.",
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
                        description = "Peek behind the scenes to see how code tells computers what to do.",
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
                        description = "Meet C: the foundation of many modern programming languages.",
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
                        description = "Discover where C is used in real-world scenarios like operating systems and embedded systems.",
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
                        description = "Explore the benefits of learning C, including its role as a foundation for other programming languages.",
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
                        description = "Quiz",
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
                        description = "Preview the journey ahead as we dive into loops, arrays, and advanced concepts.",
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
//            Lesson(
//                id = "beginner_c2",
//                title = "Setting Up Your Programming Environment",
//                description = "Learn to set up your programming environment, write your first C program, and run it. It’s like assembling a robot to do your homework.",
//                subLessons = listOf(
//                    Lesson(
//                        id = "beginner_c2_sub1",
//                        title = "Installing a C Compiler",
//                        description = "Equip yourself with a powerful compiler like GCC or a slick IDE like Code::Blocks. Let’s start your coding adventure!",
//                        status = LessonStatus.LOCKED
//                    ),
//                    Lesson(
//                        id = "beginner_c2_sub2",
//                        title = "Quiz",
//                        description = "Quiz",
//                        status = LessonStatus.LOCKED
//                    ),
//                    Lesson(
//                        id = "beginner_c2_sub3",
//                        title = "Writing Your First Program",
//                        description = "Write a program that tells the world 'Hello!' (because politeness matters).",
//                        status = LessonStatus.LOCKED
//                    ),
//                    Lesson(
//                        id = "beginner_c2_sub4",
//                        title = "Running the Program with User Input",
//                        description = "Write a program that tells the world 'Hello!' (because politeness matters).",
//                        status = LessonStatus.LOCKED
//                    ),
//                    Lesson(
//                        id = "beginner_c2_sub5",
//                        title = "Running the Program",
//                        description = "See your program come alive by compiling and running it. It’s like lighting up a bulb for the first time!",
//                        status = LessonStatus.LOCKED
//                    )
//                ),
//                lessonContents = listOf(
//                    LessonContent(
//                        id = "beginner_c2_sub1",
//                        title = "Installing a C Compiler",
//                        description = "Equip yourself with a powerful compiler like GCC or a slick IDE like Code::Blocks. Let’s start your coding adventure!",
//                        contentBlocks = listOf(
//                            ContentBlock.Text(
//                                createAnnotatedText(
//                                    "To start programming, you'll need a C compiler (like GCC) or an IDE (like Code::Blocks or VS Code).",
//                                    listOf("C compiler", "GCC", "IDE", "Code::Blocks", "VS Code")
//                                )
//                            ),
//                            ContentBlock.Text(createSimpleText("Think of a compiler as a translator between you and your computer. Without it, your computer will stare blankly at your code like a tourist without Google Translate."))
//                        ),
//                        type = LessonContentType.NON_INTERACTIVE
//                    ),
//                    LessonContent(
//                        id = "beginner_c2_sub2",
//                        title = "What is an IDE?",
//                        description = "Learn to set up your programming environment, write your first C program, and run it. It’s like assembling a robot to do your homework.",
//                        contentBlocks = listOf(
//                            QuizContentBlock(
//                                question = "Which of the following is an IDE (Integrated Development Environment)?",
//                                options = listOf(
//                                    "Notepad",
//                                    "VS Code",
//                                    "GCC",
//                                    "Python"
//                                ),
//                                correctAnswer = "VS Code",
//                                userAnswer = null,
//                                isCorrect = false
//                            ),
//                        ),
//                        type = LessonContentType.QUIZ
//                    ),
//
//                    LessonContent(
//                        id = "beginner_c2_sub3",
//                        title = "Writing Your First Program",
//                        description = "Write a program that tells the world 'Hello!' (because politeness matters).",
//                        contentBlocks = listOf(
//                            ContentBlock.Text(
//                                createAnnotatedText(
//                                    "Now, let’s write your first C program. Don’t worry—it’s as simple as saying 'Hi' (but to a computer).",
//                                    listOf("Hi")
//                                )
//                            ),
//                            ContentBlock.Code(
//                                "#include <stdio.h>\n\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
//                            ),
//                            ContentBlock.Text(
//                                createAnnotatedText(
//                                    """
//                        Here's what this does:
//                        '#include <stdio.h>' tells your program it can use functions like printf().
//                        'int main()' is the starting point—like the ignition in your car.
//                        'printf()' displays the message 'Hello, World!' on your screen. Neat, right?
//                    """.trimIndent(),
//                                    listOf("'printf()'", "#include <stdio.h>", "int main()")
//                                )
//                            )
//                        ),
//                        type = LessonContentType.NON_INTERACTIVE
//                    ),
//                    LessonContent(
//                        id = "beginner_c2_sub4",
//                        title = "Running the Program with User Input",
//                        description = "Write a program that tells the world 'Hello!' (because politeness matters).",
//                        contentBlocks = listOf(
//                            InteractiveCodeBlock(
//                                question = "Complete the following C program by fixing the syntax error (missing semicolon).",
//                                options = listOf(
//                                    ";",      // Correct option: adding the semicolon
//                                    ",",      // Incorrect option: replacing semicolon with comma
//                                    ":",      // Incorrect option: using colon instead of semicolon
//                                    "."       // Incorrect option: using period instead of semicolon
//                                ),
//                                correctAnswer = ";",   // Correct answer is the semicolon
//                                incompleteCode = """
//                #include <stdio.h>
//
//                int main() {
//                    printf("Hello, World!") // Missing semicolon
//                    return 0;
//                }
//            """.trimIndent(),
//                                userAnswer = null
//                            )
//                        ),
//                        type = LessonContentType.INTERACTIVE
//                    ),
//                    LessonContent(
//                        id = "beginner_c2_sub5",
//                        title = "Running the Program",
//                        description = "See your program come alive by compiling and running it. It’s like lighting up a bulb for the first time!",
//                        contentBlocks = listOf(
//                            ContentBlock.Text(
//                                createAnnotatedText(
//                                    "Now it’s time to see your creation in action! First, compile your program with the command: `gcc hello_world.c -o hello_world`. Then, run it with: `./hello_world`.",
//                                    listOf("`gcc hello_world.c -o hello_world`", "`./hello_world`")
//                                )
//                            ),
//                            ContentBlock.Text(createSimpleText("Congratulations! Your computer just said 'Hello, World!' Talk about making new friends. 🎉"))
//                        ),
//                        type = LessonContentType.NON_INTERACTIVE
//                    )
//                ),
//                status = LessonStatus.LOCKED
//            ),

            Lesson(
                id = "beginner_c2",
                title = "Building a Winning Mindset for Programming",
                description = "In this lesson, we focus on developing the right mindset to succeed in programming. Programming is more than just writing code—it's about resilience, learning from mistakes, and pushing through challenges. Let's cultivate a growth mindset to become a successful programmer.",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c2_sub1",
                        title = "The Power of Persistence",
                        description = "Understand that failure is part of the learning process. Embrace mistakes as opportunities to improve.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub2",
                        title = "Building Consistency",
                        description = "Learn how to create a consistent programming routine that will help you progress every day.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub3",
                        title = "Setting Realistic Goals",
                        description = "Set achievable goals that help you stay motivated and focused on the journey.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub4",
                        title = "Learning from Challenges",
                        description = "View challenges as opportunities to grow. The best programmers are those who keep learning.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub5",
                        title = "Staying Motivated Over Time",
                        description = "Discover tips and strategies for staying motivated even when progress feels slow.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c2_sub6",
                        title = "What’s Next?",
                        description = "In this stage, you’ll learn the basics of C programming, including syntax, statements, output, comments, variables, data types, constants, operators, and booleans. These fundamental concepts will set you up for success in more complex projects ahead!",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c2_sub1",
                        title = "The Power of Persistence",
                        description = "In programming, persistence is key. Even the best programmers encounter errors and roadblocks, but they don't give up. They debug, retry, and learn from mistakes. The more you practice, the more you improve.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Programming is a journey, not a destination. Every error you encounter is an opportunity to grow. Through persistence, you will unlock new skills, develop resilience, and eventually become a master of your craft."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub2",
                        title = "Building Consistency",
                        description = "Success in programming isn't about working long hours in a single stretch. It's about consistent, focused effort. Try to code every day, even if it's just for 30 minutes. Small, consistent steps lead to big progress over time.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("The key to becoming a proficient programmer is consistency. It’s better to practice a little bit every day than to cram a lot of information once in a while. Consistency builds confidence and deepens understanding."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub3",
                        title = "Setting Realistic Goals",
                        description = "When you're starting out, it can be tempting to aim for huge projects. But success comes from breaking down your learning into small, manageable chunks. Set goals that are achievable, and celebrate your progress along the way.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Set clear, realistic goals that you can measure. For example: 'I will write my first program by the end of the week.' By setting achievable goals, you ensure a steady path toward learning and growth. Each small victory boosts your motivation to keep moving forward."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub4",
                        title = "Learning from Challenges",
                        description = "The best programmers are those who embrace challenges. Rather than feeling frustrated when things go wrong, look at challenges as opportunities to learn something new.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("When you face challenges, don't be afraid to ask for help, research, or try new approaches. The more you push through difficulties, the more you grow as a programmer. Challenges strengthen your problem-solving skills and open doors to new techniques."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub5",
                        title = "Staying Motivated Over Time",
                        description = "Programming can be difficult, and it's easy to feel discouraged. But with the right mindset, you can keep going. Set small milestones, find a programming community to support you, and remember that every line of code is progress.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Remember, motivation comes from within. When the going gets tough, remember why you started and visualize the success you'll achieve. Breaking your journey into smaller milestones makes the entire process more rewarding and less overwhelming."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c2_sub6",
                        title = "What’s Next?",
                        description = "In this stage, you’ll start diving into the basics of C programming. You’ll learn the foundational concepts like syntax, statements, output, comments, variables, data types, constants, operators, and boolean values. These are essential skills for building more complex programs and moving towards mastery.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Next, we’ll explore the key building blocks of C programming. Understanding these concepts will prepare you for more advanced topics and help you become a confident coder. By mastering these fundamentals, you’ll set yourself up for tackling real-world coding challenges and developing more complex projects."))
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
                        description = "Discover the basic rules for writing C programs, which define the structure and format of the code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Syntax is the set of rules that defines the structure of C code. Without correct syntax, your program won't compile.")),
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
                                    "#include <stdio.h>: This is a preprocessor directive that tells the compiler to include the standard input-output library.",
                                    listOf("#include <stdio.h>")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "int main(): This is the entry point of the program where execution starts.",
                                    listOf("int main()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "printf: This function outputs text to the console.",
                                    listOf("printf")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub2",
                        title = "Core Elements of Syntax",
                        description = "Understand the building blocks of C syntax.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here are the essential components of C syntax:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1. Keywords: Predefined words like int, return that have special meaning in the language.",
                                    listOf("Keywords", "int", "return")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2. Identifiers: Names given to variables, functions, and other user-defined elements in your code.",
                                    listOf("Identifiers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3. Operators: Symbols used to perform operations on variables and values, such as + for addition.",
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
                                    "4. Delimiters: Punctuation marks like semicolons and braces that separate statements and code blocks.",
                                    listOf("Delimiters")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub3",
                        title = "Quiz",
                        description = "Test your knowledge of C syntax elements.",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Which data type should be used to define the main function in C?",
                                incompleteCode = """
___ main() {
    printf("Hello World");
    return 0;
}
            """.trimIndent(),
                                correctCode = "int",
                                userInput = null, // User's input will be captured here
                                isCodeCorrect = false // Will be updated based on user input
                            ),
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub4",
                        title = "What is a Statement in C?",
                        description = "Learn what a statement is in C and how it defines actions in your program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A statement is a single line of code that performs an action, such as assigning a value or printing a message.",
                                    listOf("statement")
                                )
                            ),
                            ContentBlock.Code(
                                """
int x = 10;
printf("Value: %d\\n", x);
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Statements in C must end with a semicolon, which acts as a delimiter."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub5",
                        title = "Types of Statements in C",
                        description = "Explore the different types of statements in C that control program flow.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C statements can be categorized into the following types:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1. Expression Statements: These include assignments and function calls.",
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
                                    "2. Control Statements: These alter the flow of execution, like conditionals and loops.",
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
                                    "3. Compound Statements: A group of statements enclosed in curly braces, typically used for defining blocks of code.",
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
                            ContentBlock.Text(createSimpleText("Understanding these types will help you write more structured and organized code."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is missing in the following C statement to assign a value to the variable x?",
                                incompleteCode = """
int x ___ 10;
            """.trimIndent(),
                                correctCode = "=",
                                userInput = null, // User's input will be captured here
                                isCodeCorrect = false // Will be updated based on user input
                            ),
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub7",
                        title = "Combining Multiple Statements",
                        description = "Learn how to combine multiple statements to create more complex and functional programs.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In more advanced programs, combining statements is essential for maintaining logical flow and readability.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1. Using Blocks: Grouping statements into blocks of code for better readability and scope control.",
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
                                    "2. Using Functions: Grouping related statements into functions helps with code reusability and organization.",
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
                                    "3. Chaining Statements: Executing statements sequentially for desired behavior in the program.",
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
                            ContentBlock.Text(createSimpleText("Combining statements effectively leads to clean and efficient code."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub8",
                        title = "Real-Life Example of C Syntax & Statements",
                        description = "See how C syntax is applied in a simple real-world example, like a basic calculator program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In this lesson, let's build a simple calculator using C syntax.")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    int a, b, sum;
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);
    sum = a + b;
    printf("The sum is: %d\\n", sum);
    return 0;
}
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this program, we use basic syntax elements like variables (a, b, sum), input/output functions (printf, scanf), and arithmetic operators (+).",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c3_sub9",
                        title = "Quiz",
                        description = "Test your knowledge of C syntax elements.",
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
                        type = LessonContentType.QUIZ
                    ),
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
                        description = "Learn to use `printf()` to output text in C. Output anything your program needs to communicate! 🎉",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "`printf()` is the standard function for outputting data to the console in C.",
                                    listOf("printf()")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    printf("Hello, World!"); // Displaying a basic message
    return 0;
}
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings in `printf()` need to be enclosed in double quotes, just like string literals in C.",
                                    listOf("\"...\"")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "beginner_c4_sub2",
                        title = "New Lines in Output",
                        description = "Learn to control your output layout using `\\n` for new lines.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "`\\n` is the escape sequence for a newline. It helps you format your output on separate lines.",
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
                        description = "Learn how to use escape sequences like `\\t` for tabbing and `\\\"` for quotes in your output.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Enhance your output with escape sequences for better formatting!")),
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
                        description = "Display variable values dynamically with `printf()` using format specifiers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To print a variable's value, use `printf()` with format specifiers such as `%d` for integers. This allows you to output data stored in variables.",
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
                        title = "Quiz",
                        description = "Quiz your understanding of `printf()` and format specifiers.",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What format specifier is required to print the integer value of the variable `age`?",
                                incompleteCode = """
#include <stdio.h>

int main() {
    int age = 20;
    printf("Age: ___", age); // %d for integers
    return 0;
}
            """.trimIndent(),
                                correctCode = "%d",
                                userInput = null, // User's input will be captured here
                                isCodeCorrect = false // Will be updated based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),

                    LessonContent(
                        id = "beginner_c4_sub6",
                        title = "Printing Multiple Values",
                        description = "Master printing multiple variables in one `printf()` statement using multiple format specifiers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use multiple format specifiers within `printf()` to output multiple variables in a single call.",
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
                                            "%d : Used for integers (e.g., 'age').\n" +
                                            "%.1f : Used for floating-point numbers with one decimal (e.g., 'height').\n" +
                                            "%c : Used for single characters (e.g., 'initial').",
                                    listOf("%d", "%.1f", "%c")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "beginner_c4_sub7",
                        title = "Formatting Output",
                        description = "Learn to refine the layout of your output with advanced format specifiers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Control the appearance of your output with format specifiers and precision settings. This can help make your printed results look cleaner and more organized.",
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
                        description = "Understanding comments and their importance in code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Comments are annotations in the code ignored by the compiler.")),
                            ContentBlock.Text(createSimpleText("They help explain the purpose or logic of the code.")),
                            ContentBlock.Text(createSimpleText("Without comments, the code can become harder to understand and maintain.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub2",
                        title = "Single-Line Comments",
                        description = "How to use single-line comments in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Single-line comments start with '//' and extend to the end of the line.",
                                    listOf("//")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Single-line comments are used for brief notes.")),
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
                            ContentBlock.Text(createSimpleText("Use them for short explanations or annotations in the code.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub3",
                        title = "Interactive: Add a Single-Line Comment",
                        description = "Add a single-line comment in the code.",
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
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub4",
                        title = "Multi-Line Comments",
                        description = "How to use multi-line comments in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Multi-line comments start with '/*' and end with '*/', spanning multiple lines.",
                                    listOf("/*", "*/")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Use multi-line comments for longer explanations.")),
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
                            ContentBlock.Text(createSimpleText("Keep multi-line comments concise and relevant.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub5",
                        title = "Nested Comments",
                        description = "Handling nested comments in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C doesn’t support nested multi-line comments ('/* /* ... */ */').",
                                    listOf("/* /* ... */ */")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Use single-line comments inside multi-line comments if needed.")),
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
                            ContentBlock.Text(createSimpleText("Avoid complex comment structures to maintain clarity.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub6",
                        title = "Commenting Best Practices",
                        description = "Best practices for writing effective comments.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Good comments explain the reasoning, not just the action.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Explain the purpose of the code, not what it does.",
                                    listOf("why")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Avoid redundant comments that repeat the code.")),
                            ContentBlock.Text(createSimpleText("Update comments to reflect code changes.")),
                            ContentBlock.Text(createSimpleText("Good Example:")),
                            ContentBlock.Code(
                                """
// Bubble sort is used due to the small size of the input array
bubbleSort(arr, n);
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Bad Example:")),
                            ContentBlock.Code(
                                """
// Sorting the array
bubbleSort(arr, n);
                """.trimIndent()
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c5_sub7",
                        title = "Quiz",
                        description = "Test your knowledge of comments.",
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
                                userAnswer = null,
                                isCorrect = false
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
                        description = "Learn how to declare and initialize variables.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Variables store data for later use in the program.",
                                    listOf("Variables", "store data")
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
                        description = "Understand format specifiers for different data types.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Format specifiers ensure correct display of variable types (e.g., integer, float).",
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
                        description = "Learn how to update the values of variables.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("You can change a variable’s value whenever needed.")),
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
                        description = "Learn how to update the values of variables.",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to reuse the variable 'age' for updating its value.",
                                incompleteCode = """
int age = 25;
___ = 30;  // Update the value of age
""".trimIndent(),
                                correctCode = "age",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub5",
                        title = "Declare Multiple Variables",
                        description = "Learn how to declare multiple variables in one line.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Declare multiple variables in one line to save space.",
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
                        description = "Understand the rules for naming variables.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Use meaningful names for variables.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Valid names: 'age', '_count', 'temperature1'. Invalid names: '1age', '@count'.",
                                    listOf("age", "temperature1", "_count", "1age", "@count")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Follow conventions like 'snake_case' for readability.",
                                    listOf("snake_case")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub7",
                        title = "Real-Life Example",
                        description = "A practical example using variables in a program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s how you use variables in a program to store and display data:")),
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
                            ContentBlock.Text(createSimpleText("This program uses variables to store age and height and displays them."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c6_sub8",
                        title = "Quiz",
                        description = "Quiz",
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
                        description = "Learn about data types in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, you can store numbers, characters, and more.",
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
                                    "char for characters (like the letter 'A')",
                                    listOf("char")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "void when a function doesn't return anything",
                                    listOf("void")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Choosing the right type is like choosing the right tool for the job!"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub2",
                        title = "The 'char' Type",
                        description = "Learn about the 'char' type for characters.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The 'char' type stores a single character.",
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
                        description = "Learn how to handle integer and floating-point numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, numbers are handled with integers and floating-point types.",
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
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to declare a floating-point variable for weight.",
                                incompleteCode = """
                    ___ weight = 70.5;  // Declare a variable for weight
                """.trimIndent(),
                                correctCode = "float",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub5",
                        title = "Set Decimal Precision",
                        description = "Control decimal precision when displaying numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("You can control decimal places using format specifiers.")),
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
                        description = "Find out how much memory each data type uses.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use 'sizeof()' to check how much memory a data type occupies.",
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
                        description = "See a real-world example using C data types.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s an example using various data types in a program:")),
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
                                    "This example shows how to use integers, floats, and chars to store and display data.",
                                    listOf("integers", "floats", "chars")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c7_sub8",
                        title = "Type Conversion",
                        description = "Learn how to convert between data types.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Sometimes, you need to convert types – like turning a float into an integer.",
                                    listOf("integer", "floating-point")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "For example, adding an integer to a float results in automatic conversion.",
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
                            ContentBlock.Text(createSimpleText("Or you can manually convert using a cast:")),
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
                        description = "Quiz",
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
                        description = "Learn what constants are and why to use them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Constants are fixed values that cannot be modified during program execution.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "They improve code readability and maintainability by replacing hard-coded values with meaningful names.",
                                    listOf("hard-coded")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub2",
                        title = "Defining Constants",
                        description = "Learn how to define constants in C using `#define` and `const`.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("There are two common ways to define constants in C:")),
                            ContentBlock.Text(
                                createAnnotatedText("1. Using #define:", listOf("#define"))
                            ),
                            ContentBlock.Code(
                                """
                #define PI 3.14159
                printf("PI value: %f", PI);  // Output: 3.14159
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText("2. Using the const keyword:", listOf("const"))
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
                        description = "Learn how to define constants in C using `#define` and `const`.",
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
                        description = "Understand naming conventions for constants.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Constant names follow variable naming rules, but they are often written in uppercase for clarity.",
                                    listOf("uppercase")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: const int MAX_SPEED = 120;",
                                    listOf("MAX_SPEED")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Uppercase helps identify constants in code easily.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub5",
                        title = "Real-Life Example",
                        description = "See a practical example of using constants in a program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Imagine setting a limit on how many times you can hit snooze on your alarm.")),
                            ContentBlock.Text(createSimpleText("You wouldn’t want to change that limit every day, so use a constant!")),
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
                                    "This program uses the constant MAX_SNOOZES to limit the number of snoozes.",
                                    listOf("MAX_SNOOZES")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c8_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is used to define a constant value that cannot be changed during program execution in C?",
                                options = listOf("#define", "const", "int", "static"),
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
                        description = "Understand operators and their uses.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Operators are essential for performing operations in a program.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Examples: '+', '-', '*', '/', '%'. Basic yet powerful operators.",
                                    listOf("+", "-", "*", "/", "%")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub2",
                        title = "Arithmetic Operators",
                        description = "Learn about arithmetic operators in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arithmetic operators perform mathematical operations like addition, subtraction, multiplication, and division:",
                                    listOf(
                                        "addition",
                                        "subtraction",
                                        "multiplication",
                                        "division",
                                        "%"
                                    )
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
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the code to calculate the sum of a and b using the correct operator:",
                                options = listOf(
                                    "+",
                                    "-",
                                    "*",
                                    "/"
                                ),
                                correctAnswer = "+",
                                incompleteCode = """
                int a = 5, b = 3;
                int sum = a ___ b;  // Fill in the missing operator
                """.trimIndent(),
                                userAnswer = null
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub4",
                        title = "Relational Operators",
                        description = "Learn relational operators for comparison.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Relational operators like '>', '<', '==', '!=', '>=', and '<=' are used to compare values.",
                                    listOf(">", "<", "==", "!=", ">=", "<=")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int x = 10, y = 20;
                bool result = (x > y);   // false
                result = (x < y);        // true  
                result = (x == y);       // false
                result = (x != y);       // true
                result = (x >= y);       // false
                result = (x <= y);       // true
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the code to check if x is greater than y:",
                                options = listOf(
                                    ">",
                                    "<",
                                    "==",
                                    ">=",
                                    "<="
                                ),
                                correctAnswer = ">",
                                incompleteCode = """
                int x = 10, y = 20;
                bool result = (x ___ y);  // Fill in the missing operator
                """.trimIndent(),
                                userAnswer = null
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub6",
                        title = "Logical Operators",
                        description = "Learn logical operators for combining conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Logical operators '&&', '||', and '!' are used to combine or negate conditions.",
                                    listOf("&&", "||", "!")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int a = 1, b = 0;
                bool result = (a && b);  // false
                result = (a || b);       // true  
                result = !a;             // false
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Complete the code to check if both a and b are true:",
                                options = listOf(
                                    "&&",
                                    "||",
                                    "!"
                                ),
                                correctAnswer = "&&",
                                incompleteCode = """
                int a = 1, b = 0;
                bool result = (a ___ b);  // Fill in the missing operator
                """.trimIndent(),
                                userAnswer = null
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c9_sub8",
                        title = "Assignment and Increment/Decrement Operators",
                        description = "Understand assignment, increment, and decrement operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Assignment stores values, and increment/decrement changes values. These are fundamental operations:",
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
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What will be the value of `a` after 'a += 5;' where 'a = 3'?",
                                options = listOf("3", "5", "8", "10"),
                                correctAnswer = "8",
                                userAnswer = null,
                                isCorrect = false
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
                        description = "Understand how booleans work in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A boolean is a binary value: either 'true' (1) or 'false' (0).",
                                    listOf("true", "1", "false", "0")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub2",
                        title = "Basic Boolean Representation",
                        description = "Learn how booleans are represented as `0` and `1` in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, booleans are represented as '0' for false and '1' for true.",
                                    listOf("0", "false", "true", "1")
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
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "Which of the following is the correct representation of a false boolean value in C?",
                                options = listOf("0", "1", "true", "false"),
                                correctAnswer = "0",
                                incompleteCode = """
                    int flag = ___;  // Complete the code with the correct representation of a boolean value
                """.trimIndent(),
                                userAnswer = null
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub4",
                        title = "Boolean Values",
                        description = "Learn how to use `true` and `false` with the `stdbool.h` library.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The 'stdbool.h' library defines the `bool` type for better readability.",
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
                        description = "Use booleans in logical operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Logical operations combine conditions:")),
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
                        description = "Using booleans in `if` and `while` statements.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Booleans control program flow, such as in conditionals:")),
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
                        description = "Using booleans in `if` and `while` statements.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the result of '!true' in boolean logic?",
                                options = listOf("true", "false", "undefined", "error"),
                                correctAnswer = "false", // NOT true is false
                                userAnswer = null, // User hasn't answered yet
                                isCorrect = false // Initially, the answer is incorrect
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 11
            Lesson(
                id = "beginner_c11",
                title = "Recap",
                description = "Review important topics from this stage and prepare for the next stage in your C programming journey! 🧠💻",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c11_sub1",
                        title = "C Syntax Overview",
                        description = "Understand the basic syntax of C programs. This includes learning how to write a valid C program structure, the importance of semicolons, curly braces, and the main function.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c11_sub2",
                        title = "Understanding Statements",
                        description = "Learn about statements in C, which are the building blocks of any program. Statements can declare variables, perform operations, and control program flow.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c11_sub3",
                        title = "Working with Variables and Data Types",
                        description = "Review the use of variables in C, how to define them, and how to work with various data types such as integers, floating-point numbers, and characters.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c11_sub4",
                        title = "Using Operators in C",
                        description = "Refresh your understanding of operators in C, including arithmetic operators, comparison operators, and logical operators.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c11_sub5",
                        title = "Booleans and Logical Operations",
                        description = "Focus on using boolean values and logical operations in C to create more complex conditions and decision-making processes.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c11_sub6",
                        title = "Conditional Statements",
                        description = "Learn how conditional statements like `if`, `else if`, and `while` control the flow of the program based on specific conditions.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c11_sub7",
                        title = "Your Next Step",
                        description = "You’ve completed the recap! It’s time to move forward, continue practicing, and explore more advanced topics in C programming.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c11_sub1",
                        title = "C Syntax Overview",
                        description = "Review the basic syntax of C programming. Remember to focus on semicolons, curly braces, and the structure of main().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C programs begin with the `main` function, and statements are terminated with a semicolon. Curly braces are used to define code blocks.")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    printf("Hello, World!");
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub2",
                        title = "Understanding Statements",
                        description = "Statements are the building blocks of your program. Each statement performs a task, like declaring variables or performing operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In C, statements like variable declarations and expressions are used to perform tasks.")),
                            ContentBlock.Code(
                                """
int a = 5;  // Variable declaration
a = a + 10; // Expression
printf("%d", a);  // Output statement
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub3",
                        title = "Working with Variables and Data Types",
                        description = "Variables store data values in a program. Review the common data types such as `int`, `char`, `float`, and `double`.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In C, variables are assigned specific data types, which determine the kind of data they can hold.")),
                            ContentBlock.Code(
                                """
int age = 25;
float height = 5.9;
char grade = 'A';
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub4",
                        title = "Using Operators in C",
                        description = "Operators are used to perform operations on variables and values. Refresh your knowledge on arithmetic, comparison, and logical operators.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Operators in C help perform operations such as addition, subtraction, comparison, and logical operations.")),
                            ContentBlock.Code(
                                """
int a = 5, b = 3;
int sum = a + b; // Arithmetic operator
bool isEqual = (a == b); // Comparison operator
bool result = (a > b) && (b < 5); // Logical operator
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub5",
                        title = "Booleans and Logical Operations",
                        description = "Booleans represent true/false values. Logical operations help combine multiple conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Booleans can be used in logical operations like AND, OR, and NOT to combine multiple conditions.")),
                            ContentBlock.Code(
                                """
bool isEven = true, isOdd = false;
bool result = isEven && !isOdd;  // AND and NOT operation
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub6",
                        title = "Conditional Statements",
                        description = "Conditional statements such as `if`, `else if`, and `while` control program flow based on conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Conditionals control the flow of your program by deciding whether certain code should run.")),
                            ContentBlock.Code(
                                """
if (isEven) {
    printf("Even number\n");
} else {
    printf("Odd number\n");
}

while (!isOdd) {
    printf("Still not odd\n");
    isOdd = true;  // Update condition
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub7",
                        title = "Your Next Step",
                        description = "Great job! You've covered some important concepts in C programming. Keep practicing and researching on your own to build stronger skills.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("You’re ready for the next stage! Keep practicing and exploring, and don’t hesitate to dive deeper into topics that interest you.")),
                            ContentBlock.Text(createSimpleText("Programming is all about practice and learning from experience. Keep coding and have fun! 🚀"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 12
            Lesson(
                id = "beginner_c12",
                title = "Quiz",
                description = "Test your knowledge of the topics covered in this stage! 🧠💻",
                subLessons = listOf(
                    Lesson(
                        id = "beginner_c12_sub1",
                        title = "Quiz: C Syntax Overview",
                        description = "Quiz on the basic syntax of C programs.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c12_sub2",
                        title = "Quiz: Understanding Statements",
                        description = "Test your understanding of statements in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c12_sub3",
                        title = "Quiz: Working with Variables and Data Types",
                        description = "Quiz on variables and data types in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c12_sub4",
                        title = "Quiz: Using Operators in C",
                        description = "Test your knowledge of operators in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c12_sub5",
                        title = "Quiz: Booleans and Logical Operations",
                        description = "Quiz on booleans and logical operations in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c12_sub6",
                        title = "Quiz: Conditional Statements",
                        description = "Test your understanding of conditional statements in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "beginner_c12_sub7",
                        title = "Quiz: Your Next Step",
                        description = "Motivate yourself for the next stage in C programming!",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c12_sub1",
                        title = "Quiz: C Syntax Overview",
                        description = "Answer the questions related to C syntax.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the entry point of a C program?",
                                options = listOf("main", "start", "begin", "beginning"),
                                correctAnswer = "main"

                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c12_sub2",
                        title = "Quiz: Understanding Statements",
                        description = "Test your knowledge of statements in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(

                                question = "What is the purpose of a statement in C?",
                                options = listOf(
                                    "Declare variables",
                                    "Perform tasks",
                                    "Both A and B",
                                    "None of the above"
                                ),
                                correctAnswer = "Both A and B"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c12_sub3",
                        title = "Quiz: Working with Variables and Data Types",
                        description = "Answer the questions about variables and data types in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which data type is used to store decimal numbers in C?",
                                options = listOf("int", "float", "char", "double"),
                                correctAnswer = "float"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c12_sub4",
                        title = "Quiz: Using Operators in C",
                        description = "Test your knowledge of operators in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What operator is used for addition in C?",
                                options = listOf("+", "-", "*", "/"),
                                correctAnswer = "+"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c12_sub5",
                        title = "Quiz: Booleans and Logical Operations",
                        description = "Answer questions related to booleans and logical operations in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is used for logical AND operation in C?",
                                options = listOf("&&", "&", "||", "|"),
                                correctAnswer = "&&"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c12_sub6",
                        title = "Quiz: Conditional Statements",
                        description = "Test your knowledge of conditional statements in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(

                                question = "Which of the following is a valid C conditional statement?",
                                options = listOf(
                                    "if",
                                    "switch",
                                    "while",
                                    "all of the above"
                                ),
                                correctAnswer = "all of the above"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "beginner_c12_sub7",
                        title = "Stage Completed",
                        description = "You’ve completed this stage, now prepare for the next one!",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Great job completing this stage! Keep practicing and move on to the next stage to further improve your C programming skills. 🚀"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // continue from here to add more lessons

        )
    )
}