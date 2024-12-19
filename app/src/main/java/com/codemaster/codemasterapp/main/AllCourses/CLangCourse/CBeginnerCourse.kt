package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.courseIds.CBeginnerStageIds
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
        id = CBeginnerStageIds.stageId,
        title = "Beginner",
        lessons = listOf(
            // lesson 1
            Lesson(
                id = CBeginnerStageIds.lesson1,
                title = "Introduction to C Programming",
                description = "In this lesson, we’ll cover the basics of programming, exploring the origins, purpose, and structure of the C language.",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[1],
                        title = "What is Programming?",
                        description = "Understand programming, why it matters, and how it lets computers execute your instructions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Programming creates instructions for computers to automate tasks, solve problems, and build software.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Programming languages like C, Python, or Java help us communicate instructions to machines.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Without programming, your favorite apps and systems wouldn’t exist."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[2],
                        title = "Understanding Code and How It Works",
                        description = "Peek behind the scenes to see how code tells computers what to do.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Code is like a recipe—a series of step-by-step instructions for computers.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C code translates directly into machine language, making it powerful and efficient.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Think of it as giving directions versus driving the car yourself."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[3],
                        title = "Introduction to the C Language",
                        description = "Meet C: the foundation of many modern programming languages.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C was created in the 1970s by Dennis Ritchie for building UNIX.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C combines low-level power with ease of use and has influenced many languages like C++, Java, and Python.",
                                    listOf("low-level")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Languages like Python and Java owe their roots to C."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[4],
                        title = "Applications of C Programming",
                        description = "Discover where C is used in real-world scenarios like operating systems and embedded systems.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C is widely used in operating systems, embedded systems, and gaming.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "It’s essential for gaming, robotics, and embedded systems where precision is key.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Imagine your gaming console and smartwatch running thanks to C!"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[5],
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
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[6],
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
                        type = LessonContentType.QUIZ,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson1_subs[7],
                        title = "What’s Next?",
                        description = "Preview the journey ahead as we dive into loops, arrays, and advanced concepts.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Get ready to unlock the core building blocks of programming!")),
                            ContentBlock.Text(createSimpleText("In the next lessons, you’ll master input/output, variables, and data types—skills that power every program you’ll ever write.")),
                            ContentBlock.Text(createSimpleText("With hands-on projects, you'll bring ideas to life and take your first big steps as a programmer."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // lesson 2
            Lesson(
                id = CBeginnerStageIds.lesson2,
                title = "Building a Winning Mindset for Programming",
                description = "In this lesson, we focus on developing the right mindset to succeed in programming. Programming is more than just writing code—it's about resilience, learning from mistakes, and pushing through challenges. Let's cultivate a growth mindset to become a successful programmer.",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson2_subs[1],
                        title = "The Power of Persistence",
                        description = "In programming, persistence is key. Even the best programmers encounter errors and roadblocks, but they don't give up. They debug, retry, and learn from mistakes. The more you practice, the more you improve.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Programming is a journey, not a destination. Every error you encounter is an opportunity to grow. Through persistence, you will unlock new skills, develop resilience, and eventually become a master of your craft."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson2_subs[2],
                        title = "Building Consistency",
                        description = "Success in programming isn't about working long hours in a single stretch. It's about consistent, focused effort. Try to code every day, even if it's just for 30 minutes. Small, consistent steps lead to big progress over time.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("The key to becoming a proficient programmer is consistency. It’s better to practice a little bit every day than to cram a lot of information once in a while. Consistency builds confidence and deepens understanding."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson2_subs[3],
                        title = "Setting Realistic Goals",
                        description = "When you're starting out, it can be tempting to aim for huge projects. But success comes from breaking down your learning into small, manageable chunks. Set goals that are achievable, and celebrate your progress along the way.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Set clear, realistic goals that you can measure. For example: 'I will write my first program by the end of the week.' By setting achievable goals, you ensure a steady path toward learning and growth. Each small victory boosts your motivation to keep moving forward."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson2_subs[4],
                        title = "Learning from Challenges",
                        description = "The best programmers are those who embrace challenges. Rather than feeling frustrated when things go wrong, look at challenges as opportunities to learn something new.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("When you face challenges, don't be afraid to ask for help, research, or try new approaches. The more you push through difficulties, the more you grow as a programmer. Challenges strengthen your problem-solving skills and open doors to new techniques."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson2_subs[5],
                        title = "Staying Motivated Over Time",
                        description = "Programming can be difficult, and it's easy to feel discouraged. But with the right mindset, you can keep going. Set small milestones, find a programming community to support you, and remember that every line of code is progress.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Remember, motivation comes from within. When the going gets tough, remember why you started and visualize the success you'll achieve. Breaking your journey into smaller milestones makes the entire process more rewarding and less overwhelming."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 3
            Lesson(
                id = CBeginnerStageIds.lesson3,
                title = "C Syntax & Statements",
                description = "Master the rules of C and write error-free code that won't make your robot self-destruct.",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson3_subs[1],
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
                        id = CBeginnerStageIds.lesson3_subs[2],
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
                        id = CBeginnerStageIds.lesson3_subs[3],
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
                        id = CBeginnerStageIds.lesson3_subs[4],
                        title = "What is a Statement in C?",
                        description = "Learn what a statement is in C and how it defines actions in your program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A statement is a single line of code that performs an action, such as assigning a value or printing a message.",
                                    listOf("")
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
                        id = CBeginnerStageIds.lesson3_subs[5],
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
                        id = CBeginnerStageIds.lesson3_subs[6],
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
                        id = CBeginnerStageIds.lesson3_subs[7],
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
                        id = CBeginnerStageIds.lesson3_subs[8],
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
                        id = CBeginnerStageIds.lesson3_subs[9],
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
                id = CBeginnerStageIds.lesson4,
                title = "C Output",
                description = "Learn to talk to your computer with printf() and make it answer back—with style and humor!",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson4_subs[1],
                        title = "Printing Text in C",
                        description = "Learn to use printf() to output text in C. Output anything your program needs to communicate! 🎉",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "printf() is the standard function for outputting data to the console in C.",
                                    listOf("")
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
                                    "Strings in printf() need to be enclosed in double quotes, just like string literals in C.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = CBeginnerStageIds.lesson4_subs[2],
                        title = "New Lines in Output",
                        description = "Learn to control your output layout using \\n for new lines.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "\\n is the escape sequence for a newline. It helps you format your output on separate lines.",
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
                        id = CBeginnerStageIds.lesson4_subs[3],
                        title = "Special Characters in Output",
                        description = "Learn how to use escape sequences like \\t for tabbing and \\\" for quotes in your output.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Enhance your output with escape sequences for better formatting!")),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    printf("Tabs\\tare\\tawesome!\n");
    printf("Quotes: \\\"Wow!\\\"\n");
    return 0;
}
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = CBeginnerStageIds.lesson4_subs[4],
                        title = "Printing Variables",
                        description = "Display variable values dynamically with printf() using format specifiers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To print a variable's value, use printf() with format specifiers such as %d for integers. This allows you to output data stored in variables.",
                                    listOf("")
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
                        id = CBeginnerStageIds.lesson4_subs[5],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What format specifier is required to print the integer value of the variable age?",
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
                        id = CBeginnerStageIds.lesson4_subs[6],
                        title = "Printing Multiple Values",
                        description = "Master printing multiple variables in one printf() statement using multiple format specifiers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use multiple format specifiers within printf() to output multiple variables in a single call.",
                                    listOf("")
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
                                            "%d : Used for integers (e.g., age).\n" +
                                            "%.1f : Used for floating-point numbers with one decimal (e.g., height).\n" +
                                            "%c : Used for single characters (e.g., initial).",
                                    listOf("%d", "%.1f", "%c")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = CBeginnerStageIds.lesson4_subs[7],
                        title = "Formatting Output",
                        description = "Learn to refine the layout of your output with advanced format specifiers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Control the appearance of your output with format specifiers and precision settings. This can help make your printed results look cleaner and more organized.",
                                    listOf("")
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
                id = CBeginnerStageIds.lesson5,
                title = "C Comments",
                description = "Master how to use comments in C for better code readability and documentation!",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson5_subs[0],
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
                        id = CBeginnerStageIds.lesson5_subs[1],
                        title = "Single-Line Comments",
                        description = "How to use single-line comments in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Single-line comments start with // and extend to the end of the line.",
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
                        id = CBeginnerStageIds.lesson5_subs[3],
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
                        id = CBeginnerStageIds.lesson5_subs[4],
                        title = "Multi-Line Comments",
                        description = "How to use multi-line comments in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Multi-line comments start with /* and end with */, spanning multiple lines.",
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
                        id = CBeginnerStageIds.lesson5_subs[5],
                        title = "Nested Comments",
                        description = "Handling nested comments in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C doesn’t support nested multi-line comments (/* /* ... */ */).",
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
                        id = CBeginnerStageIds.lesson5_subs[6],
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
                        id = CBeginnerStageIds.lesson5_subs[7],
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
                id = CBeginnerStageIds.lesson6,
                title = "C Variables",
                description = "Learn how to work with variables in C: declaring, formatting, changing values, and naming! 🎯",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson6_subs[0],
                        title = "Creating Variables",
                        description = "Learn how to declare and initialize variables.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Variables store data for later use in the program.",
                                    listOf("")
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
                        id = CBeginnerStageIds.lesson6_subs[1],
                        title = "Format Specifiers",
                        description = "Understand format specifiers for different data types.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Format specifiers ensure correct display of variable types (e.g., integer, float).",
                                    listOf()
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
                        id = CBeginnerStageIds.lesson6_subs[3],
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
                        id = CBeginnerStageIds.lesson6_subs[4],
                        title = "Change Variable Values",
                        description = "Learn how to update the values of variables.",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to reuse the variable age for updating its value.",
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
                        id = CBeginnerStageIds.lesson6_subs[5],
                        title = "Declare Multiple Variables",
                        description = "Learn how to declare multiple variables in one line.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Declare multiple variables in one line to save space.",
                                    listOf()
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
                        id = CBeginnerStageIds.lesson6_subs[6],
                        title = "Variable Names",
                        description = "Understand the rules for naming variables.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Use meaningful names for variables.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Valid names: age, _count, temperature1. Invalid names: 1age, @count.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Follow conventions like snake_case for readability.",
                                    listOf("snake_case")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Snake case is a naming convention where words are separated by underscores and all letters are lowercase. For example: user_name, total_score."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson6_subs[7],
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
                        id = CBeginnerStageIds.lesson6_subs[8],
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
                id = CBeginnerStageIds.lesson7,
                title = "C Data Types",
                description = "Explore the different data types in C: what they are, how they work, and how to convert between them! 🧮🎯",
                lessonContents = listOf(
                    LessonContent(
                        id = CBeginnerStageIds.lesson7_subs[0],
                        title = "Data Types",
                        description = "Learn about data types in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, you can store numbers, characters, and more.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key types include:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.int: for whole numbers (like your age)",
                                    listOf("int")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.float/double: for numbers with decimals (like the price of your coffee)",
                                    listOf("float", "double")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.char: for characters (like the letter A)",
                                    listOf("char")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "4.void: when a function doesn't return anything",
                                    listOf("void")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Choosing the right type is like choosing the right tool for the job!"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson7_subs[1],
                        title = "The char Type",
                        description = "Learn about the char type for characters.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The char type is used to store a single character such as a letter, digit, or symbol. It is enclosed in single quotes (' ') and occupies 1 byte of memory. Examples include 'A', 'z', and '@'.",
                                    listOf("' '")
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
                        id = CBeginnerStageIds.lesson7_subs[2],
                        title = "Numeric Types",
                        description = "Learn how to handle integer and floating-point numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "In C, numeric types are used to store numbers. Integers (int) represent whole numbers such as 25 or -100. For numbers with decimal points, floating-point types like float and double are used, with double offering higher precision for calculations requiring more accuracy."
                                )
                            ),
                            ContentBlock.Code(
                                """
int age = 25;         // Integer (whole number)
float weight = 65.5;  // Float (decimal number)
double pi = 3.14159;  // Double (higher precision decimal)
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = CBeginnerStageIds.lesson7_subs[3],
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
                        id = CBeginnerStageIds.lesson7_subs[4],
                        title = "Set Decimal Precision",
                        description = "Control decimal precision when displaying numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "In C, you can control the number of decimal places displayed for floating-point numbers using format specifiers. The %.2f specifier rounds the number to two decimal places when printing, ensuring that the output shows the desired precision without extra digits."
                                )
                            ),
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
                        id = CBeginnerStageIds.lesson7_subs[5],
                        title = "Get the Memory Size",
                        description = "Find out how much memory each data type uses.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, you can use the sizeof() operator to determine the memory size of any data type. This is useful for understanding the memory usage of variables in your program.",
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
                        id = CBeginnerStageIds.lesson7_subs[6],
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
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "For example, adding an integer to a float results in automatic conversion.",
                                    listOf("")
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
                        description = "Learn how to define constants in C using #define and const.",
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
                        description = "Learn how to define constants in C using #define and const.",
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
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: const int MAX_SPEED = 120;",
                                    listOf("")
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
                                    listOf("")
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
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c9_sub1",
                        title = "Introduction to Operators",
                        description = "Understand operators and their uses.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Operators are essential for performing operations in a program.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Operators allow you to perform operations on variables and values. They are crucial for calculations, comparisons, and logical operations in your code.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Examples: +, -, *, /, %. Basic yet powerful operators.",
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
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "These operators are used to perform basic mathematical calculations on numeric values, such as adding, subtracting, multiplying, dividing, and finding remainders.",
                                    listOf("")
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
                                    "Relational operators like >, <, ==, !=, >=, and <= are used to compare values.",
                                    listOf(">", "<", "==", "!=", ">=", "<=")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "These operators allow us to compare two values and return a boolean result. They help in decision-making processes, such as checking if one value is greater than or equal to another.",
                                    listOf("")
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
                                    "Logical operators &&, ||, and ! are used to combine or negate conditions.",
                                    listOf("&&", "||", "!")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "These operators allow you to evaluate multiple conditions. The && (AND) operator checks if both conditions are true, || (OR) checks if at least one condition is true, and ! (NOT) negates a condition.",
                                    listOf("")
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
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The assignment operator (=) stores a value into a variable. The increment (++) and decrement (--) operators increase or decrease a variable's value by one, respectively. Additionally, compound assignment operators (+=, -=, *=) modify variables by applying arithmetic operations and then storing the result.",
                                    listOf("")
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
                                question = "What will be the value of a after a += 5; where a = 3?",
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
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c10_sub1",
                        title = "Introduction to Booleans",
                        description = "Understand how booleans work in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A boolean is a binary value: either true (1) or false (0).",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Booleans are used to represent conditions in programming. True means a condition is met, and false means it isn't. They are essential for controlling program flow with conditionals like if and while.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c10_sub2",
                        title = "Basic Boolean Representation",
                        description = "Learn how booleans are represented as 0 and 1 in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, booleans are represented as 0 (false) and 1 (true), enabling binary logic operations. These values are fundamental in decision-making, helping to control the flow of programs using conditions like if-else statements and loops.",
                                    listOf("")
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
                        description = "Learn how to use true and false with the stdbool.h library.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The stdbool.h library defines the bool type for better readability.",
                                    listOf("stdbool.h")
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
                        description = "Using booleans in if and while statements.",
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
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the result of !true in boolean logic?",
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
                lessonContents = listOf(
                    LessonContent(
                        id = "beginner_c11_sub1",
                        title = "C Syntax Overview",
                        description = "Review the basic syntax of C programming. Remember to focus on semicolons, curly braces, and the structure of main().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C programs begin with the main function, and statements are terminated with a semicolon. Curly braces are used to define code blocks. In C, each function must be defined within these braces, and the program starts execution from the main function. The use of semicolons is essential to mark the end of statements, making the program syntactically correct.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub2",
                        title = "Understanding Statements",
                        description = "Statements are the building blocks of your program. Each statement performs a task, like declaring variables or performing operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In C, statements like variable declarations and expressions are used to perform tasks. Each statement can represent an action like assigning values, performing arithmetic operations, or calling functions. Statements must end with a semicolon to be syntactically correct. For example, declaring variables, performing assignments, or displaying results all count as statements in C.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub3",
                        title = "Working with Variables and Data Types",
                        description = "Variables store data values in a program. Review the common data types such as int, char, float, and double.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In C, variables are assigned specific data types, which determine the kind of data they can hold. For example, an int can store whole numbers, a char can store single characters, and float and double are used to store decimal numbers with varying precision. Properly choosing the data type ensures that data is stored efficiently and correctly.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub4",
                        title = "Using Operators in C",
                        description = "Operators are used to perform operations on variables and values. Refresh your knowledge on arithmetic, comparison, and logical operators.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Operators in C help perform operations such as addition, subtraction, comparison, and logical operations. Arithmetic operators like +, -, *, and / perform basic mathematical calculations. Comparison operators like ==, !=, >, <, >=, and <= allow for value comparisons. Logical operators like && (AND), || (OR), and ! (NOT) help evaluate multiple conditions together.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub5",
                        title = "Booleans and Logical Operations",
                        description = "Booleans represent true/false values. Logical operations help combine multiple conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Booleans can be used in logical operations like AND (&&), OR (||), and NOT (!) to combine multiple conditions. Logical operations help make decisions based on multiple criteria, for example, checking if both conditions are true or if at least one condition is true.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "beginner_c11_sub6",
                        title = "Conditional Statements",
                        description = "Conditional statements such as if, else if, and while control program flow based on conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Conditional statements are used to control the flow of the program by executing code based on whether certain conditions are true or false. For example, if statements allow you to run code when a condition is true, while else lets you run alternative code when the condition is false. The while loop repeatedly executes code as long as the given condition is true.")),
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