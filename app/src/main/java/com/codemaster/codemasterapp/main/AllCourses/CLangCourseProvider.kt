package com.codemaster.codemasterapp.main.AllCourses

import com.codemaster.codemasterapp.R
import androidx.compose.ui.res.painterResource
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage


class CLangCourseProvider() {


    fun getCompleteCLangCourse(): Course {
        return Course(
            id = "c_course",
            language = "C",
            stages = listOf(
                CBeginnerCourse(),
                CIntermediateCourse(),
                CAdvancedCourse(),
                CExpertCourse()
            )
        )
    }

    fun CBeginnerCourse(): Stage {
        return Stage(
            id = "c_beginner_stage",
            title = "Beginner",
            lessons = listOf(
                Lesson(
                    id = "beginner_c1",
                    title = "Introduction to C Programming",
                    description = "In this lesson, we will cover the basics of programming and introduce the origins, purpose, and structure of the C language.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c1_sub1",
                            title = "What is Programming?",
                            description = "Learn what programming is, why it’s important, and how computers understand and execute instructions.",
                            status = LessonStatus.ACTIVE
                        ),
                        Lesson(
                            id = "beginner_c1_sub2",
                            title = "Understanding Code and How It Works",
                            description = "Dive deeper into what code is, its structure, and how instructions are written and processed in a program.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub3",
                            title = "Introduction to the C Language",
                            description = "Discover the origins of the C programming language, its role in modern programming, and its core syntax.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub4",
                            title = "Applications of C Programming",
                            description = "Explore where the C language is applied in real-world scenarios like operating systems, embedded systems, and game development.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub5",
                            title = "Why Learn C?",
                            description = "Understand the benefits of learning C programming, including its foundational role in understanding other programming languages.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub6",
                            title = "What’s Next?",
                            description = "Get an overview of the upcoming lessons and the path you will take in learning C programming basics.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c1_sub1",
                            title = "What is Programming?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Programming creates instructions for computers to automate tasks, solve problems, and build software."),
                                ContentBlock.Image(R.drawable.c_intro),
                                ContentBlock.Text("Programming languages help bridge human communication with machines, enabling the creation of games, websites, and systems.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c1_sub2",
                            title = "Introduction to the C Language",
                            contentBlocks = listOf(
                                ContentBlock.Text("C, developed in the 1970s, is a powerful, efficient, and portable language used for operating systems like UNIX."),
                                ContentBlock.Image(R.drawable.c_intro),
                                ContentBlock.Text("C combines low-level power with ease of use and has influenced many languages like C++, Java, and Python.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c1_sub3",
                            title = "Applications of C Programming",
                            contentBlocks = listOf(
                                ContentBlock.Text("C is widely used in operating systems, embedded systems, game development, and system software."),
                                ContentBlock.Image(R.drawable.c_intro),
                                ContentBlock.Text("C’s direct hardware access and memory management make it ideal for resource-constrained environments.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c1_sub4",
                            title = "Benefits of Learning C Language",
                            contentBlocks = listOf(
                                ContentBlock.Text("Learning C builds a strong foundation in core programming concepts and computational thinking."),
                                ContentBlock.Image(R.drawable.c_intro),
                                ContentBlock.Text("It opens career opportunities and prepares you for advanced programming topics and languages influenced by C.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c1_sub5",
                            title = "What's Next?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Congrats! You now have a foundation in C programming and its importance."),
                                ContentBlock.Image(R.drawable.c_intro),
                                ContentBlock.Text("Upcoming lessons will cover loops, arrays, functions, and advanced topics like pointers and algorithms.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c1_sub6",
                            title = "What's Next?",
                            contentBlocks = listOf(
                                ContentBlock.Text("You're ready for more! Dive into loops, arrays, functions, and advanced topics like memory management."),
                                ContentBlock.Image(R.drawable.c_intro),
                                ContentBlock.Text("Hands-on projects will strengthen your skills and build your confidence as a programmer.")
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
                    description = "Learn to set up your programming environment, write your first C program, and run it.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c2_sub1",
                            title = "Installing a C Compiler",
                            description = "Install a C compiler (e.g., GCC, MinGW) or an IDE (Code::Blocks, VS Code).",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c2_sub2",
                            title = "Writing Your First Program",
                            description = "Write a simple C program using your compiler or IDE.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c2_sub3",
                            title = "Running the Program",
                            description = "Learn how to compile and run your C program.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c2_sub1",
                            title = "Installing a C Compiler",
                            contentBlocks = listOf(
                                ContentBlock.Text("Install a C compiler like GCC or an IDE like Code::Blocks. Follow the setup instructions for your tool.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c2_sub2",
                            title = "Writing Your First Program",
                            contentBlocks = listOf(
                                ContentBlock.Text("Write your first C program with the following code:"),
                                ContentBlock.Code("#include <stdio.h>\n\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"),
                                ContentBlock.Text("Explanation: `#include <stdio.h>` includes I/O functions, `int main()` is the main function, `printf()` prints the message.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c2_sub3",
                            title = "Running the Program",
                            contentBlocks = listOf(
                                ContentBlock.Text("To compile, use `gcc hello_world.c -o hello_world` and run with `./hello_world` to display `Hello, World!`.")
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
                    description = "Understand the structure of a C program and learn to write statements effectively.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c3_sub1",
                            title = "What is Syntax in C?",
                            description = "Learn the rules for writing C programs.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c3_sub2",
                            title = "Core Elements of Syntax",
                            description = "Explore essential syntax elements in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c3_sub3",
                            title = "What is a Statement in C?",
                            description = "Understand and use statements in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c3_sub4",
                            title = "Types of Statements in C",
                            description = "Learn about different types of statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c3_sub5",
                            title = "Combining Multiple Statements",
                            description = "Organize and execute multiple statements.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c3_sub1",
                            title = "What is Syntax in C?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Syntax defines rules for writing understandable and executable code."),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        printf("Hello, World!\\n");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- `#include <stdio.h>` enables input/output functions."),
                                ContentBlock.Text("- `int main()` is the entry point."),
                                ContentBlock.Text("- Statements like `printf(...)` must follow syntax rules.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c3_sub2",
                            title = "Core Elements of Syntax",
                            contentBlocks = listOf(
                                ContentBlock.Text("Key syntax elements:"),
                                ContentBlock.Text("1. **Keywords**: Reserved words like `int`, `return`."),
                                ContentBlock.Text("2. **Identifiers**: User-defined names (e.g., `int num;`)."),
                                ContentBlock.Text("3. **Operators**: Symbols for operations (e.g., `+`, `-`)."),
                                ContentBlock.Code(
                                    """
                    int x = 5, y = 10;
                    int sum = x + y;
                    printf("Sum: %d\\n", sum);
                """.trimIndent()
                                ),
                                ContentBlock.Text("4. **Delimiters**: Structure code (e.g., `;`, `{}`).")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c3_sub3",
                            title = "What is a Statement in C?",
                            contentBlocks = listOf(
                                ContentBlock.Text("A statement is an instruction to perform a task."),
                                ContentBlock.Code(
                                    """
                    int x = 10;
                    printf("x: %d\\n", x);
                """.trimIndent()
                                ),
                                ContentBlock.Text("Statements must end with `;` and are executed sequentially.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c3_sub4",
                            title = "Types of Statements in C",
                            contentBlocks = listOf(
                                ContentBlock.Text("Types of statements:"),
                                ContentBlock.Text("1. **Declaration**: `int x = 5;`."),
                                ContentBlock.Text("2. **Expression**: `x = x + 1;`."),
                                ContentBlock.Text("3. **Control**: Direct execution flow (e.g., `if`, `while`)."),
                                ContentBlock.Code(
                                    """
                    if (x > 0) {
                        printf("Positive\\n");
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("4. **Compound**: Grouped in `{}`.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c3_sub5",
                            title = "Combining Multiple Statements",
                            contentBlocks = listOf(
                                ContentBlock.Text("Programs use sequential statements."),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        int a = 5, b = 10, sum = a + b;
                        printf("Sum: %d\\n", sum);
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- Initialize variables."),
                                ContentBlock.Text("- Calculate results."),
                                ContentBlock.Text("- Print output.")
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
                    description = "Master how to display text and handle output in C programs, with a splash of fun! 😄",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c4_sub1",
                            title = "Printing Text in C",
                            description = "Learn how to display text output using `printf()`.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c4_sub2",
                            title = "New Lines in Output",
                            description = "Understand how to manage output with new lines.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c4_sub3",
                            title = "Special Characters in Output",
                            description = "Explore special characters like tabs and quotes.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c4_sub4",
                            title = "Printing Variables",
                            description = "Learn to print values stored in variables using format specifiers.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c4_sub5",
                            title = "Printing Multiple Values",
                            description = "Learn how to print more than one value at once.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c4_sub6",
                            title = "Formatted Output",
                            description = "Understand how to format your output nicely.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c4_sub1",
                            title = "Printing Text in C",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, we use `printf()` to print messages to the console. It's like talking to your computer! 🖥️"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        printf("Hello, C World!");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- Wrap your message in double quotes (\"...\"). 🎁"),
                                ContentBlock.Text("- `printf()` prints exactly what's inside the quotes."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    printf("Coding is fun! 🎉");
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c4_sub2",
                            title = "New Lines in Output",
                            contentBlocks = listOf(
                                ContentBlock.Text("Want neat output? Use `\\n` to start a new line. 📜"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        printf("Hello, World!\\n");
                        printf("Welcome to C programming!\\n");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- `\\n` is like pressing 'Enter' on your keyboard. ⌨️"),
                                ContentBlock.Text("Output:"),
                                ContentBlock.Code(
                                    """
                    Hello, World!
                    Welcome to C programming!
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c4_sub3",
                            title = "Special Characters in Output",
                            contentBlocks = listOf(
                                ContentBlock.Text("Add cool characters using escape sequences! 🚀"),
                                ContentBlock.Text("- `\\t`: Adds a tab space."),
                                ContentBlock.Text("- `\\\"`: Prints double quotes."),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        printf("Tabs\\tare\\tfun!\\n");
                        printf("She said, \\\"Hello!\\\"\\n");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Output:"),
                                ContentBlock.Code(
                                    """
                    Tabs    are    fun!
                    She said, "Hello!"
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c4_sub4",
                            title = "Printing Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("Display variable values with format specifiers. 🎯"),
                                ContentBlock.Text("- `%d`: For integers"),
                                ContentBlock.Text("- `%f`: For floats"),
                                ContentBlock.Text("- `%s`: For strings"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        int age = 25;
                        float height = 5.9;
                        printf("Age: %d\\n", age);
                        printf("Height: %.1f\\n", height);
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Output:"),
                                ContentBlock.Code(
                                    """
                    Age: 25
                    Height: 5.9
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c4_sub5",
                            title = "Printing Multiple Values",
                            contentBlocks = listOf(
                                ContentBlock.Text("Print multiple values in one `printf()`! 🤹‍♂️"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        int age = 25;
                        float height = 5.9;
                        printf("Age: %d, Height: %.1f\\n", age, height);
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Output:"),
                                ContentBlock.Code(
                                    """
                    Age: 25, Height: 5.9
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c4_sub6",
                            title = "Formatted Output",
                            contentBlocks = listOf(
                                ContentBlock.Text("Want to format your output? Use precision and width! 🎨"),
                                ContentBlock.Text("- Control decimal places with `.2f` for 2 decimals."),
                                ContentBlock.Text("- Align text using width formatting like `%10s`."),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        float pi = 3.14159;
                        printf("Pi to 2 decimals: %.2f\\n", pi);
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Output:"),
                                ContentBlock.Code(
                                    """
                    Pi to 2 decimals: 3.14
                """.trimIndent()
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
                            title = "Multi-Line Comments",
                            description = "How to write multi-line comments.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c5_sub4",
                            title = "Nested Comments",
                            description = "Handling comments inside other comments.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c5_sub5",
                            title = "Best Practices",
                            description = "Best practices for effective commenting.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c5_sub1",
                            title = "Introduction to Comments",
                            contentBlocks = listOf(
                                ContentBlock.Text("Comments are non-executable lines that explain code, improving readability. 📖"),
                                ContentBlock.Text("They’re ignored by the compiler, ideal for documentation and clarifying logic."),
                                ContentBlock.Text("Why use comments?"),
                                ContentBlock.Text("- Explain code to others (or future you). 💬"),
                                ContentBlock.Text("- Improve code maintenance. 🔧")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c5_sub2",
                            title = "Single-Line Comments",
                            contentBlocks = listOf(
                                ContentBlock.Text("Single-line comments begin with `//` and continue until the end of the line. 🎯"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        // Single-line comment
                        printf("Hello, World!\\n");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- Use for quick notes or explanations."),
                                ContentBlock.Text("Example output:"),
                                ContentBlock.Code(
                                    """
                    Hello, World!
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c5_sub3",
                            title = "Multi-Line Comments",
                            contentBlocks = listOf(
                                ContentBlock.Text("Multi-line comments start with `/*` and end with `*/`, spanning multiple lines. 📄"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        /* This comment spans
                           multiple lines to explain code in detail */
                        printf("Hello, World!\\n");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- Use for detailed explanations or large comment blocks."),
                                ContentBlock.Text("Example output:"),
                                ContentBlock.Code(
                                    """
                    Hello, World!
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c5_sub4",
                            title = "Nested Comments",
                            contentBlocks = listOf(
                                ContentBlock.Text("C doesn’t support nested multi-line comments. For example, `/* /* ... */ */` doesn’t work. 🚫"),
                                ContentBlock.Text("Use single-line comments for nested comments within multi-line ones."),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int main() {
                        /* This is a multi-line comment
                           // This is a single-line comment inside it
                           */
                        printf("Hello, World!\\n");
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("- Be careful with nested comments; combine single-line and multi-line for best results.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c5_sub5",
                            title = "Commenting Best Practices",
                            contentBlocks = listOf(
                                ContentBlock.Text("Effective comments improve code clarity and maintenance. Follow these practices: 🔑"),
                                ContentBlock.Text("- Explain *why*, not *what*. Example: why bubble sort is used, not just what it does."),
                                ContentBlock.Text("- Keep comments concise. Avoid over-explaining simple code."),
                                ContentBlock.Text("- Clarify complex or tricky logic."),
                                ContentBlock.Text("- Remove outdated comments."),
                                ContentBlock.Text("Good Example:"),
                                ContentBlock.Code(
                                    """
                    // Using bubble sort for small arrays
                    bubbleSort(arr, n);
                """.trimIndent()
                                ),
                                ContentBlock.Text("Bad Example:"),
                                ContentBlock.Code(
                                    """
                    // Sorting the array
                    bubbleSort(arr, n);
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
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
                            title = "Declare Multiple Variables",
                            description = "Learn how to declare multiple variables in one line.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c6_sub5",
                            title = "Variable Names",
                            description = "Understand the rules for naming variables.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c6_sub6",
                            title = "Real-Life Example",
                            description = "A practical example using variables in a program.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c6_sub1",
                            title = "Creating Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("Variables store data that can be used throughout a program. Declare variables with a type and a name. 🖥️"),
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
                                ContentBlock.Text("Format specifiers are used to display different data types correctly. 🎯"),
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
                                ContentBlock.Text("You can update a variable's value at any point in the program. 🔄"),
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
                            title = "Declare Multiple Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can declare multiple variables of the same type in a single line. 🖋️"),
                                ContentBlock.Code(
                                    """
                    int x = 10, y = 20, z = 30;  // Declaring multiple integers
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c6_sub5",
                            title = "Variable Names",
                            contentBlocks = listOf(
                                ContentBlock.Text("Variable names must start with a letter or an underscore, followed by letters, numbers, or underscores. 🚫"),
                                ContentBlock.Text("Example of valid names: `age`, `_count`, `temperature1`"),
                                ContentBlock.Text("Example of invalid names: `1age`, `@count`"),
                                ContentBlock.Text("Naming should be meaningful and follow conventions (e.g., `snake_case`).")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c6_sub6",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here's an example using variables in a simple program:"),
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
                                ContentBlock.Text("This program uses integer and float variables to store age and height, then prints them out.")
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
                    description = "Learn about data types in C: understanding the different types, precision, memory size, and type conversion! 🎯",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c7_sub1",
                            title = "Data Types",
                            description = "Understand the different data types in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c7_sub2",
                            title = "The `char` Type",
                            description = "Learn about the `char` data type and its usage.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c7_sub3",
                            title = "Numeric Types",
                            description = "Explore integer and floating-point numeric types.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c7_sub4",
                            title = "Set Decimal Precision",
                            description = "Control decimal precision with format specifiers.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c7_sub5",
                            title = "Get the Memory Size",
                            description = "Learn how to check the memory size of data types.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c7_sub6",
                            title = "Real-Life Example",
                            description = "See a practical example using various data types.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c7_sub7",
                            title = "Type Conversion",
                            description = "Learn how to convert between data types.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c7_sub1",
                            title = "Data Types",
                            contentBlocks = listOf(
                                ContentBlock.Text("C provides several data types for storing different kinds of values. 🧮"),
                                ContentBlock.Text("Common types:"),
                                ContentBlock.Text("- `int` for integers"),
                                ContentBlock.Text("- `float` and `double` for floating-point numbers"),
                                ContentBlock.Text("- `char` for characters"),
                                ContentBlock.Text("- `void` for functions that don’t return a value")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c7_sub2",
                            title = "The `char` Type",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `char` type stores a single character or small integer value. 🅰️"),
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
                                ContentBlock.Text("Numeric types store numbers. C supports integers (`int`) and floating-point numbers (`float`, `double`). 🔢"),
                                ContentBlock.Code(
                                    """
                    int age = 25;  // Integer
                    float weight = 65.5;  // Float
                    double pi = 3.14159;  // Double (higher precision)
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c7_sub4",
                            title = "Set Decimal Precision",
                            contentBlocks = listOf(
                                ContentBlock.Text("Use format specifiers to control the number of decimal places when printing floating-point numbers. 🎯"),
                                ContentBlock.Code(
                                    """
                    float price = 10.12345;
                    printf("Price: %.2f", price);  // Prints 10.12
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c7_sub5",
                            title = "Get the Memory Size",
                            contentBlocks = listOf(
                                ContentBlock.Text("Use `sizeof()` to get the memory size of a data type. 📏"),
                                ContentBlock.Code(
                                    """
                    printf("Size of int: %zu bytes", sizeof(int));
                    printf("Size of char: %zu bytes", sizeof(char));
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c7_sub6",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here’s an example using various data types in a simple program:"),
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
                                ContentBlock.Text("This program combines integers, floats, and characters to store and display personal information.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c7_sub7",
                            title = "Type Conversion",
                            contentBlocks = listOf(
                                ContentBlock.Text("Sometimes you may need to convert one type to another. C supports implicit and explicit conversions. 🔄"),
                                ContentBlock.Text("Example of implicit conversion (automatic):"),
                                ContentBlock.Code(
                                    """
                    int num = 5;
                    float result = num + 5.5;  // int to float
                    printf("Result: %.2f", result);  // 10.50
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of explicit conversion (manual):"),
                                ContentBlock.Code(
                                    """
                    float pi = 3.14;
                    int intPi = (int)pi;  // Convert float to int
                    printf("Integer Pi: %d", intPi);  // 3
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
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
                            title = "Constant Naming",
                            description = "Understand naming conventions for constants.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c8_sub4",
                            title = "Real-Life Example",
                            description = "See a practical example of using constants in a program.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c8_sub1",
                            title = "Introduction to Constants",
                            contentBlocks = listOf(
                                ContentBlock.Text("Constants are fixed values that cannot be changed during the execution of a program. 🔒"),
                                ContentBlock.Text("They make code more readable and maintainable by using meaningful names instead of hard-coded numbers.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c8_sub2",
                            title = "Defining Constants",
                            contentBlocks = listOf(
                                ContentBlock.Text("There are two common ways to define constants in C:"),
                                ContentBlock.Text("1. Using `#define`:"),
                                ContentBlock.Code(
                                    """
                    #define PI 3.14159
                    printf("PI value: %f", PI);  // Output: 3.14159
                """.trimIndent()
                                ),
                                ContentBlock.Text("2. Using `const` keyword:"),
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
                            title = "Constant Naming",
                            contentBlocks = listOf(
                                ContentBlock.Text("Naming constants follows the same rules as variables but is often written in uppercase to distinguish them. 📛"),
                                ContentBlock.Text("Example: `const int MAX_SPEED = 120;`"),
                                ContentBlock.Text("Using uppercase letters makes constants easy to identify in code.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c8_sub4",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("A practical example of using constants in a program:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    #define MAX_ATTEMPTS 5
                    
                    int main() {
                        for(int i = 0; i < MAX_ATTEMPTS; i++) {
                            printf("Attempt %d of %d\\n", i + 1, MAX_ATTEMPTS);
                        }
                        return 0;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("This program uses a constant `MAX_ATTEMPTS` to control the number of attempts in the loop.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
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
                            title = "Relational Operators",
                            description = "Learn how to compare values using relational operators.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c9_sub4",
                            title = "Logical Operators",
                            description = "Explore logical operators for combining conditions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c9_sub5",
                            title = "Assignment and Increment/Decrement Operators",
                            description = "Understand assignment and increment/decrement operations.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c9_sub1",
                            title = "Introduction to Operators",
                            contentBlocks = listOf(
                                ContentBlock.Text("Operators are symbols that perform operations on variables and values. They are essential in performing computations and comparisons. 🔧"),
                                ContentBlock.Text("Examples: `+`, `-`, `*`, `/`, `%`.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c9_sub2",
                            title = "Arithmetic Operators",
                            contentBlocks = listOf(
                                ContentBlock.Text("Arithmetic operators perform basic math operations:"),
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
                            title = "Relational Operators",
                            contentBlocks = listOf(
                                ContentBlock.Text("Relational operators compare two values and return a boolean result:"),
                                ContentBlock.Code(
                                    """
                    int x = 10, y = 20;
                    bool result = (x > y);   // false
                    result = (x == y);       // false
                    result = (x != y);       // true
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c9_sub4",
                            title = "Logical Operators",
                            contentBlocks = listOf(
                                ContentBlock.Text("Logical operators are used to combine multiple conditions:"),
                                ContentBlock.Code(
                                    """
                    int a = 1, b = 0;
                    bool result = (a && b);  // false (AND)
                    result = (a || b);       // true (OR)
                    result = !a;             // false (NOT)
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c9_sub5",
                            title = "Assignment and Increment/Decrement Operators",
                            contentBlocks = listOf(
                                ContentBlock.Text("Assignment (`=`) stores a value in a variable. Increment (`++`) and Decrement (`--`) increase or decrease a variable's value by 1:"),
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
                            title = "Boolean Values",
                            description = "Learn how to use `true` and `false` values with the `stdbool.h` library.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c10_sub4",
                            title = "Boolean Operations",
                            description = "Use booleans in logical expressions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c10_sub5",
                            title = "Boolean in Conditional Statements",
                            description = "How to use booleans in `if` and `while` statements.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c10_sub1",
                            title = "Introduction to Booleans",
                            contentBlocks = listOf(
                                ContentBlock.Text("A boolean is a binary value that represents either `true` (1) or `false` (0)."),
                                ContentBlock.Text("In C, booleans are often implemented using integers, where `0` represents `false` and any non-zero value represents `true`. This binary representation is fundamental for decision making and logical operations in programs.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c10_sub2",
                            title = "Basic Boolean Representation",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, boolean values are represented using integers, where `0` represents `false` and `1` (or any non-zero integer) represents `true`."),
                                ContentBlock.Text("Example:"),
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
                            title = "Boolean Values",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `stdbool.h` library in C defines the `bool` type. It provides the constants `true` (1) and `false` (0) for better readability."),
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
                            id = "beginner_c10_sub4",
                            title = "Boolean Operations",
                            contentBlocks = listOf(
                                ContentBlock.Text("Boolean operations use logical operators (`&&`, `||`, `!`) to combine or negate conditions:"),
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
                            id = "beginner_c10_sub5",
                            title = "Boolean in Conditional Statements",
                            contentBlocks = listOf(
                                ContentBlock.Text("Booleans are often used in `if` and `while` statements to control program flow:"),
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
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // continue from here to add more lessons

            )
        )
    }

    fun CIntermediateCourse(): Stage {
        return Stage(
            id = "c_intermediate_stage",
            title = "Intermediate",
            lessons = listOf(

                // lesson 1
                Lesson(
                    id = "intermediate_c1",
                    title = "C If ... Else",
                    description = "Learn how to use `if`, `else`, and `else if` statements in C to control program flow and make decisions! 💡",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c1_sub1",
                            title = "If Statements",
                            description = "Learn how to use `if` statements to make decisions.",
                            status = LessonStatus.ACTIVE
                        ),
                        Lesson(
                            id = "intermediate_c1_sub2",
                            title = "Else Statement",
                            description = "Learn how to use the `else` statement to handle the opposite condition.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c1_sub3",
                            title = "Else If Statement",
                            description = "Learn how to handle multiple conditions with `else if` statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c1_sub4",
                            title = "Short Hand If...Else (Ternary Operator)",
                            description = "Learn how to use the ternary operator as a shorthand for `if...else` statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c1_sub5",
                            title = "Real-Life Examples",
                            description = "See how `if`, `else`, and `else if` statements are used in real-world scenarios.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c1_sub1",
                            title = "If Statements",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `if` statement allows you to execute a block of code if a condition is true."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """
                    if (condition) {
                        // code to execute if condition is true
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int age = 18;
                    if (age >= 18) {
                        printf("You are an adult.\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c1_sub2",
                            title = "Else Statement",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `else` statement allows you to execute a block of code when the `if` condition is false."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """
                    if (condition) {
                        // code if condition is true
                    } else {
                        // code if condition is false
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int age = 16;
                    if (age >= 18) {
                        printf("You are an adult.\n");
                    } else {
                        printf("You are a minor.\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c1_sub3",
                            title = "Else If Statement",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `else if` statement is used to test multiple conditions sequentially."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """
                    if (condition1) {
                        // code if condition1 is true
                    } else if (condition2) {
                        // code if condition2 is true
                    } else {
                        // code if neither condition is true
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int score = 85;
                    if (score >= 90) {
                        printf("Grade A\n");
                    } else if (score >= 75) {
                        printf("Grade B\n");
                    } else {
                        printf("Grade C\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c1_sub4",
                            title = "Short Hand If...Else (Ternary Operator)",
                            contentBlocks = listOf(
                                ContentBlock.Text("The ternary operator (`?:`) is a shorthand version of the `if...else` statement."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """
                    condition ? expression_if_true : expression_if_false;
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int age = 20;
                    printf(age >= 18 ? "Adult\n" : "Minor\n");
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c1_sub5",
                            title = "Real-Life Examples",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here are some practical examples where `if`, `else`, and `else if` are used:"),
                                ContentBlock.Text("Example 1: Checking if a user is logged in."),
                                ContentBlock.Code(
                                    """
                    bool isLoggedIn = true;
                    if (isLoggedIn) {
                        printf("Welcome back!\n");
                    } else {
                        printf("Please log in.\n");
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example 2: Determine the largest of three numbers."),
                                ContentBlock.Code(
                                    """
                    int a = 5, b = 10, c = 3;
                    if (a > b && a > c) {
                        printf("A is the largest\n");
                    } else if (b > a && b > c) {
                        printf("B is the largest\n");
                    } else {
                        printf("C is the largest\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),

                // Lesson 2
                Lesson(
                    id = "intermediate_c2",
                    title = "C If ... Else Nested",
                    description = "Learn how to nest `if...else` statements to create more complex decision-making structures in C! 🧩",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c2_sub1",
                            title = "Introduction to Nested If...Else",
                            description = "Learn the basics of nesting `if...else` statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c2_sub2",
                            title = "Nesting Multiple If...Else",
                            description = "Learn how to nest multiple `if...else` statements within each other.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c2_sub3",
                            title = "Real-Life Example",
                            description = "See how nested `if...else` statements are used in practical scenarios.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c2_sub1",
                            title = "Introduction to Nested If...Else",
                            contentBlocks = listOf(
                                ContentBlock.Text("A nested `if...else` statement is an `if` statement inside another `if` statement, allowing for more complex conditions."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """
                    if (condition1) {
                        if (condition2) {
                            // code if condition1 and condition2 are true
                        } else {
                            // code if condition1 is true, but condition2 is false
                        }
                    } else {
                        // code if condition1 is false
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c2_sub2",
                            title = "Nesting Multiple If...Else",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can nest multiple `if...else` statements to handle more than two conditions."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int age = 20;
                    int score = 85;
                    
                    if (age >= 18) {
                        if (score >= 90) {
                            printf("You are an adult and have an excellent score!\n");
                        } else {
                            printf("You are an adult, but your score needs improvement.\n");
                        }
                    } else {
                        if (score >= 90) {
                            printf("You are a minor, but you have an excellent score!\n");
                        } else {
                            printf("You are a minor and your score needs improvement.\n");
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c2_sub3",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here's a real-life example where you use nested `if...else` to check user permissions:"),
                                ContentBlock.Code(
                                    """
                    bool isAdmin = true;
                    bool isLoggedIn = true;
                    
                    if (isLoggedIn) {
                        if (isAdmin) {
                            printf("Welcome, Admin! You have full access.\n");
                        } else {
                            printf("Welcome, User! You have limited access.\n");
                        }
                    } else {
                        printf("Please log in to continue.\n");
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("This example checks if the user is logged in first, then checks if the user is an admin to give them different levels of access.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 3
                Lesson(
                    id = "intermediate_c3",
                    title = "C Switch Statement",
                    description = "Learn how to use the `switch` statement to simplify multiple conditional branches in C! 🔄",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c3_sub1",
                            title = "Introduction to Switch Statement",
                            description = "Understand the syntax and purpose of the `switch` statement.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c3_sub2",
                            title = "Switch Case and Default",
                            description = "Learn how to use `case` and `default` in a `switch` statement.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c3_sub3",
                            title = "Real-Life Example",
                            description = "See how the `switch` statement is used in practical applications.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c3_sub1",
                            title = "Introduction to Switch Statement",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `switch` statement evaluates an expression and executes corresponding code blocks for matching `case` values."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """
                    switch (expression) {
                        case value1:
                            // code for value1
                            break;
                        case value2:
                            // code for value2
                            break;
                        default:
                            // code for default case
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c3_sub2",
                            title = "Switch Case and Default",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can have multiple `case` labels and one `default` label, which is executed if no `case` matches."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int day = 3;
                    switch (day) {
                        case 1:
                            printf("Monday\n");
                            break;
                        case 2:
                            printf("Tuesday\n");
                            break;
                        case 3:
                            printf("Wednesday\n");
                            break;
                        default:
                            printf("Invalid day\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c3_sub3",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here's an example where the `switch` statement is used to handle different menu options:"),
                                ContentBlock.Code(
                                    """
                    int option = 2;
                    switch (option) {
                        case 1:
                            printf("Option 1 selected\n");
                            break;
                        case 2:
                            printf("Option 2 selected\n");
                            break;
                        case 3:
                            printf("Option 3 selected\n");
                            break;
                        default:
                            printf("Invalid option\n");
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("This `switch` statement makes it easy to handle different menu selections.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 4
                Lesson(
                    id = "intermediate_c4",
                    title = "C Loops",
                    description = "Master the `while`, `do-while`, and `for` loops to control repetitive tasks in C! 🔄",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c4_sub1",
                            title = "While Loop",
                            description = "Learn how to use the `while` loop to repeat code as long as a condition is true.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c4_sub2",
                            title = "The Do/While Loop",
                            description = "Understand the `do-while` loop where the code runs at least once.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c4_sub3",
                            title = "The For Loop",
                            description = "Learn how the `for` loop provides a compact way to write loops with initialization, condition, and increment in a single line.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c4_sub4",
                            title = "Real-Life Examples",
                            description = "See practical applications of `while`, `do-while`, and `for` loops.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c4_sub1",
                            title = "While Loop",
                            contentBlocks = listOf(
                                ContentBlock.Text("A `while` loop repeats code as long as a condition evaluates to `true`. The condition is checked before each iteration."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    while (condition) {
                        // code to be executed
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c4_sub2",
                            title = "The Do/While Loop",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `do-while` loop executes code at least once, regardless of the condition, and checks the condition after each iteration."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    do {
                        // code to be executed
                    } while (condition);
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c4_sub3",
                            title = "The For Loop",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `for` loop is a more compact version of the `while` loop where the initialization, condition, and increment are all included in one line."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    for (initialization; condition; increment) {
                        // code to be executed
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c4_sub4",
                            title = "Real-Life Examples",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here are practical examples of `while`, `do-while`, and `for` loops in C."),
                                ContentBlock.Text("Example of `while` loop:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    while (i < 5) {
                        printf("i = %d\n", i);
                        i++;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `do-while` loop:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    do {
                        printf("i = %d\n", i);
                        i++;
                    } while (i < 5);
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `for` loop:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 5; i++) {
                        printf("i = %d\n", i);
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 5
                Lesson(
                    id = "intermediate_c5",
                    title = "C Nested Loops",
                    description = "Learn how to use nested loops in C for complex tasks and control flows! 🔄🔄",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c5_sub1",
                            title = "Nested For Loops",
                            description = "Learn how to use a `for` loop inside another `for` loop.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c5_sub2",
                            title = "Nested While Loops",
                            description = "Learn how to use a `while` loop inside another `while` loop.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c5_sub3",
                            title = "For in While Loops",
                            description = "Learn how to nest a `for` loop inside a `while` loop.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c5_sub4",
                            title = "While in For Loops",
                            description = "Learn how to nest a `while` loop inside a `for` loop.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c5_sub5",
                            title = "Nested Do-While Loops",
                            description = "Learn how to use a `do-while` loop inside another `do-while` loop.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c5_sub6",
                            title = "Real-Life Examples",
                            description = "See practical examples of nested loops in action.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c5_sub1",
                            title = "Nested For Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("A `for` loop can be nested inside another `for` loop, useful for multi-dimensional data or complex iterations."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            // code to be executed
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c5_sub2",
                            title = "Nested While Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("A `while` loop can be nested inside another `while` loop for more complex conditions."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    while (condition1) {
                        while (condition2) {
                            // code to be executed
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c5_sub3",
                            title = "For in While Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can nest a `for` loop inside a `while` loop to handle specific conditions within an ongoing iteration."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    while (condition) {
                        for (int i = 0; i < m; i++) {
                            // code to be executed
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c5_sub4",
                            title = "While in For Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("A `while` loop can also be nested inside a `for` loop to handle different conditions for each iteration."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < n; i++) {
                        while (condition) {
                            // code to be executed
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c5_sub5",
                            title = "Nested Do-While Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("A `do-while` loop can be nested inside another `do-while` loop. This ensures that code runs at least once, even if conditions aren't initially met."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    do {
                        do {
                            // code to be executed
                        } while (condition2);
                    } while (condition1);
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c5_sub6",
                            title = "Real-Life Examples",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here are practical examples of different nested loop types."),
                                ContentBlock.Text("Example of nested `for` loops:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            printf("%d %d\n", i, j);
                        }
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of nested `while` loops:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    while (i < 3) {
                        int j = 0;
                        while (j < 3) {
                            printf("%d %d\n", i, j);
                            j++;
                        }
                        i++;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `for` in `while` loop:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    while (i < 3) {
                        for (int j = 0; j < 3; j++) {
                            printf("%d %d\n", i, j);
                        }
                        i++;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `while` in `for` loop:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 3; i++) {
                        int j = 0;
                        while (j < 3) {
                            printf("%d %d\n", i, j);
                            j++;
                        }
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of nested `do-while` loops:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    do {
                        int j = 0;
                        do {
                            printf("%d %d\n", i, j);
                            j++;
                        } while (j < 3);
                        i++;
                    } while (i < 3);
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 6
                Lesson(
                    id = "intermediate_c6",
                    title = "C Break and Continue",
                    description = "Master the `break` and `continue` statements to control loop flow in C! 🛑➡️",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c6_sub1",
                            title = "Basic Break Statement",
                            description = "Learn the simple use of the `break` statement in loops.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c6_sub2",
                            title = "Basic Continue Statement",
                            description = "Understand the basic usage of `continue` to skip loop iterations.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c6_sub3",
                            title = "Break in Nested Loops",
                            description = "Learn how to use `break` in nested loops.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c6_sub4",
                            title = "Continue in Nested Loops",
                            description = "See how to use `continue` in nested loops to skip iterations.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c6_sub5",
                            title = "Real-Life Examples",
                            description = "Check out practical examples of `break` and `continue` in loops.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c6_sub1",
                            title = "Basic Break Statement",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `break` statement allows you to exit a loop early when a condition is met."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    while (condition) {
                        if (some_condition) {
                            break;  // Exits the loop immediately
                        }
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `break` in a `for` loop:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 10; i++) {
                        if (i == 5) {
                            break;  // Exits the loop when i equals 5
                        }
                        printf("%d ", i);
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c6_sub2",
                            title = "Basic Continue Statement",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `continue` statement skips the current iteration and moves to the next iteration in the loop."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """ 
                    while (condition) {
                        if (some_condition) {
                            continue;  // Skips the rest of the loop for this iteration
                        }
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `continue` in a `for` loop:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 10; i++) {
                        if (i == 5) {
                            continue;  // Skips printing 5
                        }
                        printf("%d ", i);
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c6_sub3",
                            title = "Break in Nested Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("In nested loops, `break` only exits the innermost loop. You can’t directly exit outer loops."),
                                ContentBlock.Text("Example of `break` in nested `for` loops:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (i == 1 && j == 1) {
                                break;  // Exits the inner loop when i=1 and j=1
                            }
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c6_sub4",
                            title = "Continue in Nested Loops",
                            contentBlocks = listOf(
                                ContentBlock.Text("In nested loops, `continue` will skip the current iteration of the innermost loop."),
                                ContentBlock.Text("Example of `continue` in nested `for` loops:"),
                                ContentBlock.Code(
                                    """ 
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (i == 1 && j == 1) {
                                continue;  // Skips the inner loop iteration when i=1 and j=1
                            }
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c6_sub5",
                            title = "Real-Life Examples",
                            contentBlocks = listOf(
                                ContentBlock.Text("Practical examples of `break` and `continue` in loops:"),
                                ContentBlock.Text("Example of `break` in a `while` loop:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    while (i < 10) {
                        if (i == 7) {
                            break;  // Exits the loop when i equals 7
                        }
                        printf("%d ", i);
                        i++;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of `continue` in a `while` loop:"),
                                ContentBlock.Code(
                                    """ 
                    int i = 0;
                    while (i < 10) {
                        if (i == 4) {
                            continue;  // Skips the current iteration when i equals 4
                        }
                        printf("%d ", i);
                        i++;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 7
                Lesson(
                    id = "intermediate_c7",
                    title = "C Arrays",
                    description = "Master arrays in C for efficient data storage and access! 🗃️",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c7_sub1",
                            title = "Introduction to Arrays",
                            description = "Understand what arrays are and how they are used in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c7_sub2",
                            title = "Array Declaration and Initialization",
                            description = "Learn how to declare and initialize arrays.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c7_sub3",
                            title = "Accessing Array Elements",
                            description = "Learn how to access and modify array elements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c7_sub4",
                            title = "Array Size or Length",
                            description = "Understand how to get the size of an array.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c7_sub5",
                            title = "Multidimensional Arrays",
                            description = "Explore how to work with 2D and multi-dimensional arrays.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c7_sub6",
                            title = "Array Operations",
                            description = "Perform operations like sorting, searching, and more on arrays.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c7_sub7",
                            title = "Real-Life Example with Arrays",
                            description = "See how arrays are used in practical scenarios.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c7_sub1",
                            title = "Introduction to Arrays",
                            contentBlocks = listOf(
                                ContentBlock.Text("An array is a collection of elements, all of the same type, stored in contiguous memory locations."),
                                ContentBlock.Text("Arrays allow you to store multiple values under a single variable name, indexed by integers."),
                                ContentBlock.Text("In C, the elements in an array are of the same type, such as `int`, `char`, etc."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    int numbers[5];  // Declares an array of 5 integers
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c7_sub2",
                            title = "Array Declaration and Initialization",
                            contentBlocks = listOf(
                                ContentBlock.Text("To declare an array, you need to specify the type and the size of the array."),
                                ContentBlock.Text("Arrays can be initialized at the time of declaration or after declaration."),
                                ContentBlock.Text("Example of declaration and initialization:"),
                                ContentBlock.Code(
                                    """
                    int numbers[5] = {1, 2, 3, 4, 5};  // Initializes the array with values
                """.trimIndent()
                                ),
                                ContentBlock.Text("You can also initialize an array without specifying the size:"),
                                ContentBlock.Code(
                                    """
                    int numbers[] = {1, 2, 3, 4, 5};  // Size is inferred automatically
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c7_sub3",
                            title = "Accessing Array Elements",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can access and modify elements of an array using the index, starting from 0."),
                                ContentBlock.Text("Example of accessing array elements:"),
                                ContentBlock.Code(
                                    """
                    int numbers[5] = {1, 2, 3, 4, 5};
                    printf("%d", numbers[0]);  // Accesses the first element (output: 1)
                """.trimIndent()
                                ),
                                ContentBlock.Text("To modify an element in the array, assign a new value to it using its index:"),
                                ContentBlock.Code(
                                    """
                    numbers[2] = 10;  // Changes the third element to 10
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c7_sub4",
                            title = "Array Size or Length",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, the size of an array is fixed once it is declared. However, you can calculate the size of an array using `sizeof`."),
                                ContentBlock.Text("To calculate the number of elements in an array:"),
                                ContentBlock.Code(
                                    """
                    int numbers[5] = {1, 2, 3, 4, 5};
                    int size = sizeof(numbers) / sizeof(numbers[0]);  // Size of the array
                    printf("Size: %d", size);  // Output: 5
                """.trimIndent()
                                ),
                                ContentBlock.Text("This gives the number of elements in the array. The `sizeof` operator returns the total size in bytes of the array."),
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c7_sub5",
                            title = "Multidimensional Arrays",
                            contentBlocks = listOf(
                                ContentBlock.Text("A multidimensional array is an array of arrays. The most common form is a 2D array."),
                                ContentBlock.Text("Syntax for a 2D array:"),
                                ContentBlock.Code(
                                    """
                    int matrix[3][3] = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                """.trimIndent()
                                ),
                                ContentBlock.Text("Accessing elements of a 2D array:"),
                                ContentBlock.Code(
                                    """
                    printf("%d", matrix[0][0]);  // Accesses the element at row 0, column 0 (output: 1)
                """.trimIndent()
                                ),
                                ContentBlock.Text("You can also use loops to traverse through multidimensional arrays."),
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c7_sub6",
                            title = "Array Operations",
                            contentBlocks = listOf(
                                ContentBlock.Text("Arrays can be used for various operations like searching, sorting, and modifying elements."),
                                ContentBlock.Text("Example of sorting an array:"),
                                ContentBlock.Code(
                                    """
                    int numbers[5] = {5, 2, 9, 1, 3};
                    for (int i = 0; i < 4; i++) {
                        for (int j = i + 1; j < 5; j++) {
                            if (numbers[i] > numbers[j]) {
                                // Swap elements
                                int temp = numbers[i];
                                numbers[i] = numbers[j];
                                numbers[j] = temp;
                            }
                        }
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of searching in an array (linear search):"),
                                ContentBlock.Code(
                                    """
                    int numbers[5] = {1, 2, 3, 4, 5};
                    int target = 3;
                    for (int i = 0; i < 5; i++) {
                        if (numbers[i] == target) {
                            printf("Found at index %d", i);
                        }
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c7_sub7",
                            title = "Real-Life Example with Arrays",
                            contentBlocks = listOf(
                                ContentBlock.Text("Arrays are used in real-life applications such as storing temperatures, processing data, etc."),
                                ContentBlock.Text("Example: Store temperatures for a week in an array."),
                                ContentBlock.Code(
                                    """
                    float temperatures[7] = {20.5, 22.3, 21.0, 19.8, 23.5, 21.6, 20.1};
                    float average = 0;
                    for (int i = 0; i < 7; i++) {
                        average += temperatures[i];
                    }
                    average /= 7;
                    printf("Average Temperature: %.2f", average);
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 8
                Lesson(
                    id = "intermediate_c8",
                    title = "C Strings",
                    description = "Learn how to work with strings in C and perform string manipulations. 📝",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c8_sub1",
                            title = "Introduction to Strings in C",
                            description = "Understand the basics of strings in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub2",
                            title = "Declaring and Initializing Strings",
                            description = "Learn how to declare and initialize strings in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub3",
                            title = "Accessing String Elements",
                            description = "Learn how to access individual characters in a string.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub4",
                            title = "String Length and Size",
                            description = "Understand how to calculate the length of a string.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub5",
                            title = "String Special Characters",
                            description = "Learn how to handle special characters in strings.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub6",
                            title = "Common String Functions",
                            description = "Explore commonly used functions for string manipulation.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub7",
                            title = "String Comparison",
                            description = "Learn how to compare strings.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub8",
                            title = "String Copying and Concatenation",
                            description = "Learn how to copy and concatenate strings.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub9",
                            title = "String Input and Output",
                            description = "Understand how to handle input and output with strings.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c8_sub10",
                            title = "Real-Life Example with Strings",
                            description = "See how strings are used in real applications.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c8_sub1",
                            title = "Introduction to Strings in C",
                            contentBlocks = listOf(
                                ContentBlock.Text("A string in C is an array of characters, terminated by a null character (`'0'`)."),
                                ContentBlock.Text("Strings in C are handled as arrays of characters with a special character (`'0'`) at the end."),
                                ContentBlock.Text("Example of a string:"),
                                ContentBlock.Code(
                                    """
                    char name[] = "Hello";
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub2",
                            title = "Declaring and Initializing Strings",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, a string is declared as a character array."),
                                ContentBlock.Text("You can initialize a string at the time of declaration:"),
                                ContentBlock.Code(
                                    """
                    char name[] = "John";  // Automatic null-termination
                """.trimIndent()
                                ),
                                ContentBlock.Text("Alternatively, you can declare an empty string and later assign a value:"),
                                ContentBlock.Code(
                                    """
                    char name[10];  // A string of size 10
                    strcpy(name, "John");  // Assigning a value using strcpy
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub3",
                            title = "Accessing String Elements",
                            contentBlocks = listOf(
                                ContentBlock.Text("To access individual characters of a string, use the array indexing method."),
                                ContentBlock.Text("Example of accessing characters in a string:"),
                                ContentBlock.Code(
                                    """
                    char name[] = "Hello";
                    printf("%c", name[0]);  // Output: 'H'
                    printf("%c", name[4]);  // Output: 'o'
                """.trimIndent()
                                ),
                                ContentBlock.Text("Note that the first character is at index 0, and the last character is at `length-1`.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub4",
                            title = "String Length and Size",
                            contentBlocks = listOf(
                                ContentBlock.Text("The length of a string can be calculated using the `strlen` function from `string.h`."),
                                ContentBlock.Text("Example to calculate the length of a string:"),
                                ContentBlock.Code(
                                    """
                    char name[] = "Hello";
                    int length = strlen(name);  // length = 5
                    printf("Length: %d", length);
                """.trimIndent()
                                ),
                                ContentBlock.Text("The `sizeof` operator returns the size of the array in bytes, including the null-terminator.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub5",
                            title = "String Special Characters",
                            contentBlocks = listOf(
                                ContentBlock.Text("Strings can contain special characters, such as `\n` (new line), `\t` (tab), and `\'` (single quote)."),
                                ContentBlock.Text("Example of a string with special characters:"),
                                ContentBlock.Code(
                                    """
                    char message[] = "Hello, world!\nWelcome to C programming.";
                    printf("%s", message);
                """.trimIndent()
                                ),
                                ContentBlock.Text("The `\n` inserts a new line when printed.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub6",
                            title = "Common String Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("C provides several string functions, such as `strlen()`, `strcpy()`, `strcat()`, and `strcmp()`."),
                                ContentBlock.Text("Some common functions are:"),
                                ContentBlock.Code(
                                    """
                    // Copying a string
                    char src[] = "Hello";
                    char dest[10];
                    strcpy(dest, src);
                    
                    // Concatenating two strings
                    char str1[] = "Hello, ";
                    char str2[] = "world!";
                    strcat(str1, str2);  // str1 becomes "Hello, world!"
                    
                    // Comparing two strings
                    if (strcmp(str1, str2) == 0) {
                        printf("Strings are equal");
                    } else {
                        printf("Strings are different");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub7",
                            title = "String Comparison",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `strcmp()` function compares two strings lexicographically."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    char str1[] = "apple";
                    char str2[] = "orange";
                    if (strcmp(str1, str2) < 0) {
                        printf("apple is less than orange");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub8",
                            title = "String Copying and Concatenation",
                            contentBlocks = listOf(
                                ContentBlock.Text("Strings can be copied and concatenated using `strcpy()` and `strcat()`."),
                                ContentBlock.Text("Example of copying a string:"),
                                ContentBlock.Code(
                                    """
                    char src[] = "Hello";
                    char dest[10];
                    strcpy(dest, src);  // Copies "Hello" into dest
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of concatenating two strings:"),
                                ContentBlock.Code(
                                    """
                    char str1[20] = "Hello, ";
                    char str2[] = "world!";
                    strcat(str1, str2);  // str1 becomes "Hello, world!"
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub9",
                            title = "String Input and Output",
                            contentBlocks = listOf(
                                ContentBlock.Text("Strings can be input using `scanf()` and output using `printf()`."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    char name[20];
                    printf("Enter your name: ");
                    scanf("%s", name);  // Reads a string
                    printf("Hello, %s!", name);  // Outputs the string
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c8_sub10",
                            title = "Real-Life Example with Strings",
                            contentBlocks = listOf(
                                ContentBlock.Text("Strings are used in a wide variety of real-world applications, like user input, file reading, and string manipulation."),
                                ContentBlock.Text("Example: Prompting a user for input and greeting them:"),
                                ContentBlock.Code(
                                    """
                    char name[50];
                    printf("Enter your name: ");
                    fgets(name, sizeof(name), stdin);
                    printf("Welcome, %s!", name);
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 9
                Lesson(
                    id = "intermediate_c9",
                    title = "C User Input",
                    description = "Learn how to accept user input in C using various input functions! ⌨️",
                    subLessons = listOf(
                        Lesson(
                            id = "intermediate_c9_sub1",
                            title = "Using `scanf` for Input",
                            description = "Understand how to use `scanf` to accept formatted input.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c9_sub2",
                            title = "Using `getchar` for Single Character Input",
                            description = "Learn how to use `getchar` to read a single character.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c9_sub3",
                            title = "Using `fgets` for String Input",
                            description = "See how to use `fgets` to accept strings, including spaces.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "intermediate_c9_sub4",
                            title = "Input Validation",
                            description = "Learn how to validate user input for accuracy.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "intermediate_c9_sub1",
                            title = "Using `scanf` for Input",
                            contentBlocks = listOf(
                                ContentBlock.Text("`scanf` is used to accept formatted input from the user."),
                                ContentBlock.Code(
                                    """
                    int age;
                    scanf("%d", &age);  // Reads an integer input
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c9_sub2",
                            title = "Using `getchar` for Single Character Input",
                            contentBlocks = listOf(
                                ContentBlock.Text("`getchar` reads a single character entered by the user."),
                                ContentBlock.Code(
                                    """
                    char letter;
                    letter = getchar();  // Reads a single character
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c9_sub3",
                            title = "Using `fgets` for String Input",
                            contentBlocks = listOf(
                                ContentBlock.Text("`fgets` allows reading a full line of input, including spaces."),
                                ContentBlock.Code(
                                    """
                    char name[50];
                    fgets(name, sizeof(name), stdin);  // Reads a string with spaces
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "intermediate_c9_sub4",
                            title = "Input Validation",
                            contentBlocks = listOf(
                                ContentBlock.Text("It's important to validate user input to ensure it's correct."),
                                ContentBlock.Code(
                                    """
                    int num;
                    if (scanf("%d", &num) != 1) {
                        printf("Invalid input.\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // continue to add here


            )
        )
    }

    fun CAdvancedCourse(): Stage {
        return Stage(
            id = "c_advanced_stage",
            title = "Advanced",
            lessons = listOf(
                Lesson(
                    id = "advanced_c1",
                    title = "C Memory Address",
                    description = "Dive into memory addresses in C and understand how variables are stored in memory! 🧠",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c1_sub1",
                            title = "Understanding Memory Address",
                            description = "Learn the concept of memory addresses and how variables are stored in memory.",
                            status = LessonStatus.ACTIVE
                        ),
                        Lesson(
                            id = "advanced_c1_sub2",
                            title = "Accessing Memory Address",
                            description = "Understand how to access and print the memory address of a variable.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c1_sub1",
                            title = "Understanding Memory Address",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, every variable has a memory address, which is the location in memory where the data is stored."),
                                ContentBlock.Text("You can access a variable's memory address using the `&` operator."),
                                ContentBlock.Text("Memory addresses are typically represented as hexadecimal values."),
                                ContentBlock.Code(
                                    """
                    int num = 10;
                    printf("Memory address of num: %p\n", &num);  // Use & to get the address of the variable
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c1_sub2",
                            title = "Accessing Memory Address",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can access a variable's memory address by using the `&` operator followed by the variable name."),
                                ContentBlock.Text("The `%p` format specifier is used in `printf` to print the memory address."),
                                ContentBlock.Code(
                                    """
                    int num = 10;
                    printf("Address of num: %p\n", &num);  // Prints the address of the variable 'num'
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),
                // Lesson
                Lesson(
                    id = "advanced_c2",
                    title = "C Pointers",
                    description = "Master pointers in C, including creating pointers and their relationship with arrays! 🔑",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c2_sub1",
                            title = "Creating Pointers",
                            description = "Learn how to create pointers and assign them to variables.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c2_sub2",
                            title = "Pointer Dereferencing",
                            description = "Understand how to dereference pointers to access the value they point to.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c2_sub3",
                            title = "Pointers & Arrays",
                            description = "Learn how pointers and arrays are closely related in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c2_sub4",
                            title = "Pointer Arithmetic",
                            description = "Explore pointer arithmetic and how to manipulate pointer values.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c2_sub5",
                            title = "Pointers to Pointers",
                            description = "Understand pointers that point to other pointers and how to work with them.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c2_sub6",
                            title = "Pointer & Function Arguments",
                            description = "Learn how to pass pointers to functions and manipulate data through them.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c2_sub7",
                            title = "Real-Life Example of Pointers",
                            description = "Learn how pointers can be used in real-world applications, such as dynamic memory management or handling large data.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c2_sub1",
                            title = "Creating Pointers",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, a pointer is a variable that stores the memory address of another variable."),
                                ContentBlock.Text("A pointer is declared using the `*` symbol. Example: `int* ptr;`"),
                                ContentBlock.Text("To assign a pointer, use the `&` operator to store the address of a variable."),
                                ContentBlock.Code(
                                    """
                    int num = 10;
                    int* ptr = &num;  // 'ptr' now holds the address of 'num'
                    printf("Value of num: %d\n", *ptr);  // Dereferencing the pointer to access the value
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c2_sub2",
                            title = "Pointer Dereferencing",
                            contentBlocks = listOf(
                                ContentBlock.Text("Dereferencing a pointer means accessing the value stored at the memory address it points to."),
                                ContentBlock.Text("Use the `*` operator to dereference a pointer and access the variable's value."),
                                ContentBlock.Code(
                                    """
                    int num = 10;
                    int* ptr = &num;  // Pointer to num
                    printf("Dereferenced value: %d\n", *ptr);  // Prints the value stored at ptr's address
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c2_sub3",
                            title = "Pointers & Arrays",
                            contentBlocks = listOf(
                                ContentBlock.Text("Arrays and pointers are closely related in C. The name of an array is a constant pointer to its first element."),
                                ContentBlock.Text("You can use pointers to access array elements by incrementing the pointer."),
                                ContentBlock.Code(
                                    """
                    int arr[] = {1, 2, 3};
                    int* ptr = arr;  // Pointer to the first element of arr
                    printf("%d\n", *(ptr + 1));  // Prints the second element of the array
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c2_sub4",
                            title = "Pointer Arithmetic",
                            contentBlocks = listOf(
                                ContentBlock.Text("Pointers in C allow arithmetic operations like addition or subtraction."),
                                ContentBlock.Text("When you increment or decrement a pointer, it moves by the size of the type it points to."),
                                ContentBlock.Code(
                                    """
                    int arr[] = {1, 2, 3};
                    int* ptr = arr;
                    ptr++;  // Moves to the next element of the array
                    printf("%d\n", *ptr);  // Prints the second element of the array
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c2_sub5",
                            title = "Pointers to Pointers",
                            contentBlocks = listOf(
                                ContentBlock.Text("A pointer to a pointer is a pointer that stores the address of another pointer."),
                                ContentBlock.Text("You can access the value of a pointer to a pointer by dereferencing it twice."),
                                ContentBlock.Code(
                                    """
                    int num = 10;
                    int* ptr = &num;
                    int** ptr2 = &ptr;  // Pointer to pointer
                    printf("%d\n", **ptr2);  // Dereferencing twice to access num's value
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c2_sub6",
                            title = "Pointer & Function Arguments",
                            contentBlocks = listOf(
                                ContentBlock.Text("Pointers are commonly used to pass large structures or arrays to functions, as they allow modification of data directly."),
                                ContentBlock.Text("Passing a pointer to a function allows that function to modify the original data."),
                                ContentBlock.Code(
                                    """
                    void updateValue(int* ptr) {
                        *ptr = 20;  // Changes the value of the variable pointed to
                    }

                    int main() {
                        int num = 10;
                        updateValue(&num);
                        printf("Updated value: %d\n", num);  // Prints 20
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c2_sub7",
                            title = "Real-Life Example of Pointers",
                            contentBlocks = listOf(
                                ContentBlock.Text("In real life, pointers are useful when you need to work with dynamic memory or large amounts of data that should not be copied multiple times."),
                                ContentBlock.Text("Consider a game with a large array of data (e.g., the state of each player). Instead of copying the whole array when passing data between functions, a pointer to the array can be passed, making the process more efficient."),
                                ContentBlock.Text("Real-life use case: If you're designing a game or a simulation program where you need to pass large structures like a player's game state (inventory, stats, etc.), pointers are used to avoid the high cost of copying large amounts of data."),
                                ContentBlock.Code(
                                    """
                    // Example: Game with a player's data
                    typedef struct {
                        int health;
                        int score;
                        char name[50];
                    } Player;

                    void updatePlayerStats(Player* p) {
                        p->health -= 10;  // Update health directly using pointer
                        p->score += 100;   // Update score directly using pointer
                    }

                    int main() {
                        Player player1 = {100, 0, "Alice"};
                        updatePlayerStats(&player1);  // Pass pointer to player data
                        printf("Updated stats - Health: %d, Score: %d\n", player1.health, player1.score);
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 3
                Lesson(
                    id = "advanced_c3",
                    title = "C Functions",
                    description = "Master functions in C to modularize your code and make it reusable! 🧑‍💻",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c3_sub1",
                            title = "Predefined Functions",
                            description = "Learn about functions that are already provided by C like `printf` and `scanf`.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c3_sub2",
                            title = "Create a Function",
                            description = "Understand how to define your own functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c3_sub3",
                            title = "Call a Function",
                            description = "Learn how to call your custom functions in the program.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c3_sub4",
                            title = "Real-Life Example of Functions",
                            description = "Understand the practical use of functions in real-world applications.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c3_sub1",
                            title = "Predefined Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Predefined functions are built into C, such as `printf()` for output and `scanf()` for input."),
                                ContentBlock.Text("Example of using `printf` to print a message:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    int main() {
                        printf("Hello, world!");
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c3_sub2",
                            title = "Create a Function",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, you can define your own functions to group code into reusable blocks."),
                                ContentBlock.Text("Function syntax:"),
                                ContentBlock.Code(
                                    """
                    returnType functionName(parameters) {
                        // code to be executed
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example: A function to add two numbers:"),
                                ContentBlock.Code(
                                    """
                    int add(int a, int b) {
                        return a + b;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c3_sub3",
                            title = "Call a Function",
                            contentBlocks = listOf(
                                ContentBlock.Text("To use a function, simply call it by its name and pass the required arguments."),
                                ContentBlock.Text("Example: Calling the `add` function in `main`:"),
                                ContentBlock.Code(
                                    """
                    int main() {
                        int result = add(5, 3);
                        printf("Sum: %d", result);
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c3_sub4",
                            title = "Real-Life Example of Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Functions are useful in real-life applications to keep the code organized, reusable, and maintainable."),
                                ContentBlock.Text("For example, in a banking system, functions could be used to handle different tasks like checking balance, withdrawing money, and depositing money."),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    void checkBalance(float balance) {
                        printf("Current balance: %.2f\n", balance);
                    }

                    void withdrawMoney(float* balance, float amount) {
                        if (*balance >= amount) {
                            *balance -= amount;
                            printf("Withdrawal successful! Remaining balance: %.2f\n", *balance);
                        } else {
                            printf("Insufficient funds!\n");
                        }
                    }

                    void depositMoney(float* balance, float amount) {
                        *balance += amount;
                        printf("Deposit successful! New balance: %.2f\n", *balance);
                    }

                    int main() {
                        float balance = 1000.00;
                        checkBalance(balance);
                        withdrawMoney(&balance, 200.00);
                        depositMoney(&balance, 500.00);
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 4
                Lesson(
                    id = "advanced_c4",
                    title = "C Functions: Data Types",
                    description = "Learn how different data types are used in C functions! 🧑‍💻",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c4_sub1",
                            title = "Function Data Types Overview",
                            description = "Learn about the role of data types in functions and how they define the return value.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c4_sub2",
                            title = "int Data Type",
                            description = "Learn how the `int` data type is used in functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c4_sub3",
                            title = "float Data Type",
                            description = "Understand the use of the `float` data type in functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c4_sub4",
                            title = "char Data Type",
                            description = "Explore how the `char` data type is used in functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c4_sub5",
                            title = "void Data Type",
                            description = "Learn how the `void` data type works for functions that don't return a value.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c4_sub6",
                            title = "Real-Life Example of Function Data Types",
                            description = "See how different function data types can be used in a practical, real-world scenario.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c4_sub1",
                            title = "Function Data Types Overview",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, function data types define the type of value a function will return. The function's return type is specified before its name in the function declaration."),
                                ContentBlock.Text("Functions can return a variety of data types such as `int`, `float`, `char`, `void`, and others."),
                                ContentBlock.Text("This sub-lesson will cover the use of specific data types in functions, including their purpose and examples.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c4_sub2",
                            title = "int Data Type",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `int` data type is used for functions that return integer values."),
                                ContentBlock.Text("Example: Function returning an integer:"),
                                ContentBlock.Code(
                                    """
                    int add(int a, int b) {
                        return a + b;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c4_sub3",
                            title = "float Data Type",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `float` data type is used for functions that return floating-point numbers."),
                                ContentBlock.Text("Example: Function returning a float value:"),
                                ContentBlock.Code(
                                    """
                    float divide(float a, float b) {
                        return a / b;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c4_sub4",
                            title = "char Data Type",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `char` data type is used for functions that return a single character."),
                                ContentBlock.Text("Example: Function returning a character:"),
                                ContentBlock.Code(
                                    """
                    char getGrade(int score) {
                        if (score >= 90) return 'A';
                        else if (score >= 80) return 'B';
                        else return 'C';
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c4_sub5",
                            title = "void Data Type",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `void` data type is used for functions that do not return any value."),
                                ContentBlock.Text("Example: A function that doesn't return anything:"),
                                ContentBlock.Code(
                                    """
                    void printMessage() {
                        printf("Hello, World!\n");
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c4_sub6",
                            title = "Real-Life Example of Function Data Types",
                            contentBlocks = listOf(
                                ContentBlock.Text("Let's consider a real-life scenario of a simple calculator program that uses different function data types to perform various operations."),
                                ContentBlock.Text("This program will include functions that use the `int`, `float`, and `void` data types."),
                                ContentBlock.Text("Example: A calculator with different functions for addition, division, and a message display:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>

                    // int data type for addition
                    int add(int a, int b) {
                        return a + b;
                    }

                    // float data type for division
                    float divide(float a, float b) {
                        return a / b;
                    }

                    // void data type for displaying a message
                    void displayMessage() {
                        printf("Welcome to the Calculator!\n");
                    }

                    int main() {
                        int sum = add(5, 3);    // Calling the add function
                        printf("Sum: %d\n", sum);

                        float result = divide(10.0, 2.0);    // Calling the divide function
                        printf("Result: %.2f\n", result);

                        displayMessage();   // Calling the display message function
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 5
                Lesson(
                    id = "advanced_c5",
                    title = "C Function Parameters",
                    description = "Learn about function parameters and how they work in C functions! 🧑‍💻",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c5_sub1",
                            title = "Parameters and Arguments",
                            description = "Learn the difference between parameters and arguments when calling functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c5_sub2",
                            title = "Multiple Parameters",
                            description = "Understand how to pass multiple parameters to a function.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c5_sub3",
                            title = "Pass Arrays as Function Parameters",
                            description = "Learn how to pass arrays to functions in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c5_sub4",
                            title = "Return Values from Functions",
                            description = "Learn how functions return values to the caller.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c5_sub5",
                            title = "Real-Life Example of Function Parameters",
                            description = "Understand the use of function parameters with a real-life example.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c5_sub1",
                            title = "Parameters and Arguments",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, function parameters are variables defined in the function declaration."),
                                ContentBlock.Text("Arguments are values passed to the function when it is called."),
                                ContentBlock.Text("Example of parameters and arguments:"),
                                ContentBlock.Code(
                                    """
                    void greet(char name[]) {
                        printf("Hello, %s!\n", name);
                    }

                    int main() {
                        greet("Alice");  // "Alice" is the argument
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c5_sub2",
                            title = "Multiple Parameters",
                            contentBlocks = listOf(
                                ContentBlock.Text("A function can accept multiple parameters, separated by commas."),
                                ContentBlock.Text("Example with multiple parameters:"),
                                ContentBlock.Code(
                                    """
                    int add(int a, int b) {
                        return a + b;
                    }

                    int main() {
                        int result = add(5, 10);  // 5 and 10 are arguments for a and b
                        printf("Result: %d\n", result);
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c5_sub3",
                            title = "Pass Arrays as Function Parameters",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, you can pass arrays to functions as parameters."),
                                ContentBlock.Text("Arrays are passed by reference, meaning the function can modify the original array."),
                                ContentBlock.Text("Example of passing an array as a function parameter:"),
                                ContentBlock.Code(
                                    """
                    void printArray(int arr[], int size) {
                        for (int i = 0; i < size; i++) {
                            printf("%d ", arr[i]);
                        }
                        printf("\n");
                    }

                    int main() {
                        int numbers[] = {1, 2, 3, 4};
                        printArray(numbers, 4);
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c5_sub4",
                            title = "Return Values from Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Functions in C can return values to the calling code."),
                                ContentBlock.Text("The return type is specified in the function declaration, and the return value is given with the `return` keyword."),
                                ContentBlock.Text("Example: A function that returns an integer value:"),
                                ContentBlock.Code(
                                    """
                    int multiply(int a, int b) {
                        return a * b;
                    }

                    int main() {
                        int result = multiply(4, 5);
                        printf("Product: %d\n", result);
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c5_sub5",
                            title = "Real-Life Example of Function Parameters",
                            contentBlocks = listOf(
                                ContentBlock.Text("Let's consider a real-world example: A function to calculate the area of a rectangle."),
                                ContentBlock.Text("The function will take two parameters: `length` and `width`, and return the calculated area."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>

                    // Function to calculate the area of a rectangle
                    int calculateArea(int length, int width) {
                        return length * width;
                    }

                    int main() {
                        int length = 5, width = 3;
                        int area = calculateArea(length, width);  // Passing length and width as arguments
                        printf("Area of the rectangle: %d\n", area);
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 6
                Lesson(
                    id = "advanced_c6",
                    title = "C Variable Scope",
                    description = "Understand how variables behave inside and outside functions in C.",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c6_sub1",
                            title = "Local Scope",
                            description = "Learn how local variables are restricted to the function they're declared in.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c6_sub2",
                            title = "Global Scope",
                            description = "Understand the accessibility of global variables across functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c6_sub3",
                            title = "Naming Variables",
                            description = "Explore how naming works and the impact of scope in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c6_sub4",
                            title = "Real-Life Example",
                            description = "See practical examples of variable scope.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c6_sub1",
                            title = "Local Scope",
                            contentBlocks = listOf(
                                ContentBlock.Text("Variables declared inside a function are local and only accessible within that function."),
                                ContentBlock.Code(
                                    """
                    void myFunction() {
                        int x = 10;  // Local variable
                        printf("%d\n", x);  // Accessible inside the function
                    }
                    int main() {
                        // printf("%d\n", x);  // Error: x is not accessible here
                        myFunction();
                        return 0;
                    }
                """
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c6_sub2",
                            title = "Global Scope",
                            contentBlocks = listOf(
                                ContentBlock.Text("Global variables are declared outside functions and can be accessed anywhere in the program."),
                                ContentBlock.Code(
                                    """
                    int x = 10;  // Global variable
                    void myFunction() {
                        printf("%d\n", x);  // Accessible here
                    }
                    int main() {
                        printf("%d\n", x);  // Accessible here as well
                        myFunction();
                        return 0;
                    }
                """
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c6_sub3",
                            title = "Naming Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("Variable names must start with a letter or an underscore. They are case-sensitive and cannot be C keywords."),
                                ContentBlock.Text("Important: If the same name is used for a variable inside and outside a function, C treats them as separate variables."),
                                ContentBlock.Code(
                                    """
                    int x = 10;  // Global variable
                    void myFunction() {
                        int x = 5;  // Local variable
                        printf("Local x: %d\n", x);  // Prints 5
                    }
                    int main() {
                        printf("Global x: %d\n", x);  // Prints 10
                        myFunction();
                        return 0;
                    }
                """
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c6_sub4",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("In a game, we can use global variables to track scores and local variables to compute values within specific functions."),
                                ContentBlock.Code(
                                    """
                    int score = 0;  // Global variable
                    void increaseScore(int points) {
                        score += points;  // Modify global score
                    }
                    void showScore() {
                        printf("Current score: %d\n", score);  // Access global score
                    }
                    int main() {
                        int roundScore = 10;  // Local variable
                        increaseScore(roundScore);  // Pass local score
                        showScore();
                        return 0;
                    }
                """
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 7
                Lesson(
                    id = "advanced_c7",
                    title = "C Function Declaration and Definition",
                    description = "Learn how to declare and define functions in C, and how they interact with each other.",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c7_sub1",
                            title = "Function Declaration",
                            description = "Learn how to declare functions to make them accessible throughout the program.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c7_sub2",
                            title = "Function Definition",
                            description = "Understand how to define functions and their implementation.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c7_sub3",
                            title = "Functions Calling Other Functions",
                            description = "Explore how functions can call other functions to perform tasks.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c7_sub4",
                            title = "Real-Life Example",
                            description = "See how functions can be used in real-world scenarios.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c7_sub1",
                            title = "Function Declaration",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, a function declaration tells the compiler about the function's name, return type, and parameters. This allows the compiler to check for errors when the function is called before it is defined."),
                                ContentBlock.Text("Function declaration syntax:"),
                                ContentBlock.Code(
                                    """
                    return_type function_name(parameter1, parameter2, ...);
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of a function declaration:"),
                                ContentBlock.Code(
                                    """
                    int add(int a, int b);  // Function declaration
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c7_sub2",
                            title = "Function Definition",
                            contentBlocks = listOf(
                                ContentBlock.Text("A function definition provides the actual implementation of the function. It includes the function's body, where the code is written to execute the desired task."),
                                ContentBlock.Text("Function definition syntax:"),
                                ContentBlock.Code(
                                    """
                    return_type function_name(parameter1, parameter2, ...) {
                        // Function body
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Example of a function definition:"),
                                ContentBlock.Code(
                                    """
                    int add(int a, int b) {  // Function definition
                        return a + b;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c7_sub3",
                            title = "Functions Calling Other Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Functions in C can call other functions to perform specific tasks, making code modular and reusable."),
                                ContentBlock.Text("To call a function, simply use its name followed by the arguments (if any) in parentheses."),
                                ContentBlock.Text("Example of one function calling another:"),
                                ContentBlock.Code(
                                    """
                    int add(int a, int b) {
                        return a + b;
                    }
                    
                    void displaySum(int a, int b) {
                        int sum = add(a, b);  // Calling the add function
                        printf("Sum: %d\n", sum);
                    }

                    int main() {
                        displaySum(5, 10);  // Calling displaySum
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c7_sub4",
                            title = "Real-Life Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("Consider a scenario where we need to calculate the area of different shapes in a program. We can create separate functions for calculating the area of a circle, rectangle, and triangle, and call them as needed."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    #include <math.h>
                    
                    float calculateCircleArea(float radius) {
                        return M_PI * radius * radius;  // Circle area formula
                    }

                    float calculateRectangleArea(float length, float width) {
                        return length * width;  // Rectangle area formula
                    }

                    void displayArea(float area) {
                        printf("Area: %.2f\n", area);
                    }

                    int main() {
                        float circleArea = calculateCircleArea(5.0);
                        displayArea(circleArea);  // Display area of the circle

                        float rectangleArea = calculateRectangleArea(4.0, 6.0);
                        displayArea(rectangleArea);  // Display area of the rectangle
                        
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 8
                Lesson(
                    id = "advanced_c8",
                    title = "C Recursion",
                    description = "Understand how recursion works in C and how to use it effectively.",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c8_sub1",
                            title = "What is Recursion?",
                            description = "Learn the definition of recursion and how it works in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c8_sub2",
                            title = "Base Case in Recursion",
                            description = "Understand the importance of the base case in recursive functions.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c8_sub3",
                            title = "Recursive Function Example",
                            description = "See a simple recursive function in action.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c8_sub4",
                            title = "Recursive vs Iterative Solutions",
                            description = "Compare recursion with iteration for solving problems.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c8_sub5",
                            title = "Real-Life Example of Recursion",
                            description = "Learn how recursion can be applied in real-world scenarios.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c8_sub1",
                            title = "What is Recursion?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Recursion in C is when a function calls itself in order to solve smaller instances of the same problem."),
                                ContentBlock.Text("A recursive function typically has two parts:"),
                                ContentBlock.Text("1. **Base Case**: A condition that stops the recursion to prevent infinite calls."),
                                ContentBlock.Text("2. **Recursive Case**: The part of the function that calls itself to solve the smaller subproblem."),
                                ContentBlock.Text("Example of recursion concept:"),
                                ContentBlock.Code(
                                    """
                    int factorial(int n) {
                        if (n == 0)  // Base case
                            return 1;
                        else
                            return n * factorial(n - 1);  // Recursive call
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c8_sub2",
                            title = "Base Case in Recursion",
                            contentBlocks = listOf(
                                ContentBlock.Text("The **base case** is critical in recursion. It defines when the recursion should stop and return a result."),
                                ContentBlock.Text("Without a base case, the function would call itself indefinitely, resulting in a stack overflow."),
                                ContentBlock.Text("Example of base case in recursion:"),
                                ContentBlock.Code(
                                    """
                    int factorial(int n) {
                        if (n == 0)  // Base case
                            return 1;
                        return n * factorial(n - 1);  // Recursive case
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c8_sub3",
                            title = "Recursive Function Example",
                            contentBlocks = listOf(
                                ContentBlock.Text("A simple recursive function example: Calculating the factorial of a number."),
                                ContentBlock.Text("The factorial of a number `n` is the product of all integers from 1 to n. It is defined as:"),
                                ContentBlock.Text("`n! = n * (n - 1) * (n - 2) * ... * 1`, with `0! = 1`."),
                                ContentBlock.Text("Recursive function example:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    
                    int factorial(int n) {
                        if (n == 0)
                            return 1;  // Base case
                        else
                            return n * factorial(n - 1);  // Recursive case
                    }

                    int main() {
                        int result = factorial(5);
                        printf("Factorial of 5 is %d\n", result);  // Output: 120
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c8_sub4",
                            title = "Recursive vs Iterative Solutions",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, recursion can often be replaced with an iterative solution using loops."),
                                ContentBlock.Text("For example, calculating the factorial of a number can be done recursively or iteratively."),
                                ContentBlock.Text("Recursive approach (previous example):"),
                                ContentBlock.Code(
                                    """
                    int factorial(int n) {
                        if (n == 0) return 1;
                        return n * factorial(n - 1);
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("Iterative approach:"),
                                ContentBlock.Code(
                                    """
                    int factorial(int n) {
                        int result = 1;
                        for (int i = 1; i <= n; i++) {
                            result *= i;
                        }
                        return result;
                    }
                """.trimIndent()
                                ),
                                ContentBlock.Text("The recursive approach is elegant and simpler to write, but the iterative approach is often more efficient in terms of memory usage.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c8_sub5",
                            title = "Real-Life Example of Recursion",
                            contentBlocks = listOf(
                                ContentBlock.Text("A real-world example of recursion is **directory traversal**. When you need to process files in directories and subdirectories, recursion helps to navigate through each folder and subfolder."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """
                    #include <stdio.h>
                    #include <dirent.h>
                    
                    void listFiles(const char *path) {
                        struct dirent *entry;
                        DIR *dp = opendir(path);
                        if (dp == NULL) {
                            printf("Unable to open directory %s\n", path);
                            return;
                        }

                        while ((entry = readdir(dp)) != NULL) {
                            if (entry->d_type == DT_DIR) {
                                if (strcmp(entry->d_name, ".") != 0 && strcmp(entry->d_name, "..") != 0) {
                                    // Recursively list files in subdirectories
                                    listFiles(entry->d_name);
                                }
                            } else {
                                printf("%s\n", entry->d_name);  // Print file name
                            }
                        }
                        closedir(dp);
                    }

                    int main() {
                        listFiles("my_folder");  // Start traversal
                        return 0;
                    }
                """.trimIndent()
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 9
                Lesson(
                    id = "advanced_c9",
                    title = "C Math Functions",
                    description = "Learn basic math functions in C.",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c9_sub1",
                            title = "Intro to C Math Functions",
                            description = "Understand the math.h library.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c9_sub2",
                            title = "Common Math Functions",
                            description = "Learn basic functions like sqrt(), pow(), and abs().",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c9_sub3",
                            title = "Trigonometric Functions",
                            description = "Use functions like sin(), cos(), and tan().",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c9_sub4",
                            title = "Logarithmic & Exponential",
                            description = "Learn log(), log10(), and exp().",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c9_sub5",
                            title = "Rounding Functions",
                            description = "Explore round(), floor(), and ceil().",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c9_sub1",
                            title = "Intro to C Math Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("The `math.h` library provides basic math functions like square roots, powers, and trigonometry."),
                                ContentBlock.Code("""#include <math.h>""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c9_sub2",
                            title = "Common Math Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Common functions include:"),
                                ContentBlock.Text("1. `sqrt(x)` - Square root of `x`."),
                                ContentBlock.Text("2. `pow(x, y)` - `x` raised to the power of `y`."),
                                ContentBlock.Text("3. `fabs(x)` - Absolute value of `x`."),
                                ContentBlock.Code(
                                    """#include <stdio.h>
#include <math.h>
int main() {
    printf("sqrt(9) = %.2f\n", sqrt(9));
    printf("pow(2, 3) = %.2f\n", pow(2, 3));
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c9_sub3",
                            title = "Trigonometric Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Functions like sin(), cos(), and tan() work with radians."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>
#include <math.h>
int main() {
    printf("sin(1) = %.2f\n", sin(1));
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c9_sub4",
                            title = "Logarithmic & Exponential",
                            contentBlocks = listOf(
                                ContentBlock.Text("Use log(), log10(), and exp() for logarithmic and exponential calculations."),
                                ContentBlock.Code(
                                    """#include <stdio.h>
#include <math.h>
int main() {
    printf("log(2.718) = %.2f\n", log(2.718));
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c9_sub5",
                            title = "Rounding Functions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Rounding functions include:"),
                                ContentBlock.Text("1. `round(x)` - Rounds `x` to the nearest integer."),
                                ContentBlock.Text("2. `floor(x)` - Largest integer less than or equal to `x`."),
                                ContentBlock.Text("3. `ceil(x)` - Smallest integer greater than or equal to `x`."),
                                ContentBlock.Code(
                                    """#include <stdio.h>
#include <math.h>
int main() {
    printf("round(2.7) = %.2f\n", round(2.7));
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),

                // lesson 10
                Lesson(
                    id = "advanced_c10",
                    title = "C Structures",
                    description = "Learn how to use structures (structs) in C to group different types of data.",
                    subLessons = listOf(
                        Lesson(
                            id = "advanced_c10_sub1",
                            title = "Introduction to Structures",
                            description = "Understand the basics of structures in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c10_sub2",
                            title = "Creating a Structure",
                            description = "Learn how to define and initialize a structure.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c10_sub3",
                            title = "Accessing Structure Members",
                            description = "Learn how to access and modify structure members.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c10_sub4",
                            title = "Nested Structures",
                            description = "Learn how to define structures within structures.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "advanced_c10_sub5",
                            title = "Pointers to Structures",
                            description = "Understand how to use pointers with structures.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "advanced_c10_sub1",
                            title = "Introduction to Structures",
                            contentBlocks = listOf(
                                ContentBlock.Text("Structures allow grouping of different data types into a single unit. It's useful when you need to represent real-world entities."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """struct StructureName {
    dataType member1;
    dataType member2;
    // more members
};"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c10_sub2",
                            title = "Creating a Structure",
                            contentBlocks = listOf(
                                ContentBlock.Text("To create a structure, you define it with the `struct` keyword and then create an instance of it."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """struct Person {
    char name[50];
    int age;
}; 

int main() {
    struct Person p1;
    p1.age = 25;
    strcpy(p1.name, "Alice");
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c10_sub3",
                            title = "Accessing Structure Members",
                            contentBlocks = listOf(
                                ContentBlock.Text("Structure members can be accessed using the dot operator (`.`)."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """struct Person {
    char name[50];
    int age;
}; 

int main() {
    struct Person p1 = {"Alice", 25};
    printf("Name: %s, Age: %d", p1.name, p1.age);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c10_sub4",
                            title = "Nested Structures",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can define a structure inside another structure."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """struct Address {
    char street[100];
    char city[50];
}; 

struct Person {
    char name[50];
    int age;
    struct Address address;
};

int main() {
    struct Person p1;
    strcpy(p1.name, "Alice");
    p1.age = 25;
    strcpy(p1.address.street, "123 Main St");
    strcpy(p1.address.city, "Wonderland");
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "advanced_c10_sub5",
                            title = "Pointers to Structures",
                            contentBlocks = listOf(
                                ContentBlock.Text("Pointers can be used to reference structures. To access members via pointers, use the arrow operator (`->`)."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """struct Person {
    char name[50];
    int age;
}; 

int main() {
    struct Person p1 = {"Alice", 25};
    struct Person *ptr = &p1;
    printf("Name: %s, Age: %d", ptr->name, ptr->age);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),
                // continue from here


            )
        )
    }

    fun CExpertCourse(): Stage {
        return Stage(
            id = "c_expert_stage",
            title = "expert",
            lessons = listOf(
                Lesson(
                    id = "expert_c1",
                    title = "C Files",
                    description = "Learn advanced file handling techniques in C, including creating, reading, writing, and closing files.",
                    subLessons = listOf(
                        Lesson(
                            id = "expert_c1_sub1",
                            title = "Introduction to File Handling",
                            description = "Understand the basics of file handling in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c1_sub2",
                            title = "Creating a File",
                            description = "Learn how to create and open files in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c1_sub3",
                            title = "Reading from a File",
                            description = "Learn how to read data from a file.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c1_sub4",
                            title = "Writing to a File",
                            description = "Learn how to write data to a file.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c1_sub5",
                            title = "Closing a File",
                            description = "Learn how to close a file safely.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c1_sub6",
                            title = "File Error Handling",
                            description = "Understand how to handle file errors in C.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c1_sub1",
                            title = "Introduction to File Handling",
                            contentBlocks = listOf(
                                ContentBlock.Text("File handling in C allows programs to read from and write to files. You'll use file pointers to access files."),
                                ContentBlock.Text("To work with files, you need to include the `stdio.h` header."),
                                ContentBlock.Code("""#include <stdio.h>""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c1_sub2",
                            title = "Creating a File",
                            contentBlocks = listOf(
                                ContentBlock.Text("To create and open a file in C, use the `fopen()` function with mode `w` (write) or `wb` (binary)."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(file, "Hello, world!");
    fclose(file);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c1_sub3",
                            title = "Reading from a File",
                            contentBlocks = listOf(
                                ContentBlock.Text("To read from a file, use `fopen()` in `r` (read) mode, and use functions like `fscanf()`, `fgets()`, or `fgetc()` to read data."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "r");
    char str[100];
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fgets(str, sizeof(str), file);
    printf("%s", str);
    fclose(file);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c1_sub4",
                            title = "Writing to a File",
                            contentBlocks = listOf(
                                ContentBlock.Text("To write to a file, use `fopen()` in `w` or `a` (append) mode, and use functions like `fprintf()`, `fputs()`, or `fwrite()`."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(file, "Hello, world!");
    fclose(file);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c1_sub5",
                            title = "Closing a File",
                            contentBlocks = listOf(
                                ContentBlock.Text("To safely close a file, use the `fclose()` function. This ensures all data is written and the file is properly closed."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(file, "Hello, world!");
    fclose(file);  // Closing the file
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c1_sub6",
                            title = "File Error Handling",
                            contentBlocks = listOf(
                                ContentBlock.Text("Always check if file operations succeed. Use `ferror()` to check for errors during file operations."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

int main() {
    FILE *file = fopen("nonexistent.txt", "r");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    // Further file operations
    fclose(file);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),
                // Lesson 2
                Lesson(
                    id = "expert_c2",
                    title = "C Enumeration (enum)",
                    description = "Learn advanced techniques for using enums in C, including defining enums, changing their values, and using them in switch statements.",
                    subLessons = listOf(
                        Lesson(
                            id = "expert_c2_sub1",
                            title = "Introduction to Enums",
                            description = "Learn the basics of defining and using enums in C.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c2_sub2",
                            title = "Changing Enum Values",
                            description = "Understand how to assign and change values of enums.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c2_sub3",
                            title = "Enum in Switch Statement",
                            description = "Learn how to use enums with switch-case statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "expert_c2_sub4",
                            title = "Enum with Bit Flags",
                            description = "Learn how to use enums with bit flags for more efficient storage.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c2_sub1",
                            title = "Introduction to Enums",
                            contentBlocks = listOf(
                                ContentBlock.Text("Enums in C are used to define a set of named integer constants. They improve code readability and provide better organization."),
                                ContentBlock.Text("Syntax:"),
                                ContentBlock.Code(
                                    """enum EnumName {
    CONSTANT_1,
    CONSTANT_2,
    CONSTANT_3
};"""
                                ),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };

int main() {
    enum Day today = Wednesday;
    printf("Today is %d\\n", today);
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c2_sub2",
                            title = "Changing Enum Values",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can change the underlying integer values of an enum. By default, the first value is 0, and each subsequent value increments by 1."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

enum Day { Sunday = 1, Monday = 2, Tuesday = 4, Wednesday = 8, Thursday = 16 };

int main() {
    enum Day today = Tuesday;
    printf("Today is %d\\n", today);
    return 0;
}"""
                                ),
                                ContentBlock.Text("In the above code, Sunday starts at 1, Monday at 2, Tuesday at 4, etc.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c2_sub3",
                            title = "Enum in Switch Statement",
                            contentBlocks = listOf(
                                ContentBlock.Text("Enums work well with switch statements, as you can match specific enum values to execute corresponding code."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };

int main() {
    enum Day today = Wednesday;
    
    switch(today) {
        case Sunday:
            printf("It's Sunday\\n");
            break;
        case Wednesday:
            printf("It's Wednesday\\n");
            break;
        default:
            printf("It's a weekday\\n");
    }
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c2_sub4",
                            title = "Enum with Bit Flags",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can use enums with bit flags for efficient storage and checking multiple conditions."),
                                ContentBlock.Text("Bitwise OR (`|`) and AND (`&`) operations are used to combine or check flags."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code(
                                    """#include <stdio.h>

enum Permissions {
    READ = 1 << 0,    // 0001
    WRITE = 1 << 1,   // 0010
    EXECUTE = 1 << 2  // 0100
};

int main() {
    int userPermissions = READ | WRITE;  // User has read and write permissions
    if (userPermissions & READ) {
        printf("User has read permissions\\n");
    }
    if (userPermissions & EXECUTE) {
        printf("User has execute permissions\\n");
    } else {
        printf("User does not have execute permissions\\n");
    }
    return 0;
}"""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),
                // lesson 3
                Lesson(
                    id = "expert_c3",
                    title = "C Memory Management",
                    description = "Master memory management in C, including dynamic memory allocation, deallocation, and handling memory efficiently.",
                    subLessons = listOf(
                        Lesson(id = "expert_c3_sub1", title = "Memory in C", description = "Understand the concept of memory in C, including stack and heap memory.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c3_sub2", title = "Dynamic Memory Allocation", description = "Learn how to allocate memory dynamically using malloc, calloc, and realloc.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c3_sub3", title = "Memory Deallocation", description = "Learn the importance of deallocating memory using free.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c3_sub4", title = "Memory Leaks and Optimization", description = "Understand how to prevent memory leaks and optimize memory usage.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c3_sub5", title = "Advanced Memory Management Techniques", description = "Explore advanced techniques like memory pools and garbage collection.", status = LessonStatus.LOCKED)
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c3_sub1",
                            title = "Memory in C",
                            contentBlocks = listOf(
                                ContentBlock.Text("Memory in C is divided into three sections: the stack, heap, and data segment."),
                                ContentBlock.Text("1. **Stack**: Used for local variables, automatically managed, limited size."),
                                ContentBlock.Text("2. **Heap**: Used for dynamic memory allocation, manually managed."),
                                ContentBlock.Text("3. **Data Segment**: Used for global and static variables.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c3_sub2",
                            title = "Dynamic Memory Allocation",
                            contentBlocks = listOf(
                                ContentBlock.Text("C provides functions for dynamic memory allocation, allowing memory to be allocated at runtime."),
                                ContentBlock.Text("Functions:"),
                                ContentBlock.Text("1. **malloc()**: Allocates uninitialized memory."),
                                ContentBlock.Text("2. **calloc()**: Allocates zero-initialized memory."),
                                ContentBlock.Text("3. **realloc()**: Resizes previously allocated memory."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // malloc allocates 5 integers
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }
    arr[0] = 10;
    arr[1] = 20;
    printf("arr[0]: %d, arr[1]: %d\\n", arr[0], arr[1]);

    // Reallocate memory
    arr = (int*)realloc(arr, 10 * sizeof(int));  // realloc resizes the array
    if (arr == NULL) {
        printf("Memory reallocation failed\\n");
        return 1;
    }
    arr[5] = 50;
    printf("arr[5]: %d\\n", arr[5]);

    free(arr);  // Free memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c3_sub3",
                            title = "Memory Deallocation",
                            contentBlocks = listOf(
                                ContentBlock.Text("Memory allocated dynamically using malloc, calloc, or realloc should be deallocated using **free()**."),
                                ContentBlock.Text("Failure to free memory can cause memory leaks, leading to resource wastage."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int*)malloc(sizeof(int));
    *ptr = 100;
    printf("Value: %d\\n", *ptr);
    
    free(ptr);  // Always free dynamically allocated memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c3_sub4",
                            title = "Memory Leaks and Optimization",
                            contentBlocks = listOf(
                                ContentBlock.Text("Memory leaks occur when dynamically allocated memory is not freed, causing wasted resources and possible application crashes."),
                                ContentBlock.Text("Best Practices:"),
                                ContentBlock.Text("1. Always pair malloc/calloc/realloc with free."),
                                ContentBlock.Text("2. Use tools like **Valgrind** to detect memory leaks."),
                                ContentBlock.Text("3. Consider using **smart pointers** in C++ to automate memory management."),
                                ContentBlock.Text("Example of a memory leak:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));
    // Memory is not freed, causing a memory leak
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c3_sub5",
                            title = "Advanced Memory Management Techniques",
                            contentBlocks = listOf(
                                ContentBlock.Text("Advanced memory management techniques can help optimize memory usage in larger applications."),
                                ContentBlock.Text("1. **Memory Pools**: Pre-allocate a fixed amount of memory and distribute it to components as needed."),
                                ContentBlock.Text("2. **Garbage Collection**: Though C doesn't have built-in garbage collection, you can implement custom memory management strategies."),
                                ContentBlock.Text("Example of a basic memory pool (conceptual):"),
                                ContentBlock.Code("""// A simple memory pool would allocate a chunk of memory and return pointers to sections of it.
#include <stdio.h>
#include <stdlib.h>

#define POOL_SIZE 1024
char memory_pool[POOL_SIZE];  // Pre-allocated memory pool

void* allocate_from_pool(size_t size) {
    static size_t offset = 0;
    if (offset + size > POOL_SIZE) return NULL;  // Not enough space
    void* ptr = memory_pool + offset;
    offset += size;
    return ptr;
}

int main() {
    int* p = (int*)allocate_from_pool(sizeof(int));
    if (p == NULL) {
        printf("Memory pool exhausted\\n");
    }
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 4
                Lesson(
                    id = "expert_c4",
                    title = "C Allocate Memory",
                    description = "Learn how to allocate memory in C, both statically and dynamically, and understand their differences and use cases.",
                    subLessons = listOf(
                        Lesson(id = "expert_c4_sub1", title = "Static Memory Allocation", description = "Learn how memory is allocated at compile-time using static memory allocation.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c4_sub2", title = "Dynamic Memory Allocation", description = "Understand how to allocate memory at runtime using dynamic memory allocation.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c4_sub3", title = "Differences Between Static and Dynamic Memory", description = "Compare static and dynamic memory allocation in C.", status = LessonStatus.LOCKED)
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c4_sub1",
                            title = "Static Memory Allocation",
                            contentBlocks = listOf(
                                ContentBlock.Text("Static memory allocation is done at compile time, and the memory is reserved for the entire lifetime of the program."),
                                ContentBlock.Text("Variables allocated statically have a fixed size and are stored on the stack or in the data segment."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>

int main() {
    int arr[5];  // Static array with 5 integers
    arr[0] = 10;
    printf("arr[0]: %d\\n", arr[0]);
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c4_sub2",
                            title = "Dynamic Memory Allocation",
                            contentBlocks = listOf(
                                ContentBlock.Text("Dynamic memory allocation is done at runtime using functions like `malloc()`, `calloc()`, and `realloc()`."),
                                ContentBlock.Text("Memory is allocated on the heap and can be resized, deallocated, and managed manually."),
                                ContentBlock.Text("Functions:"),
                                ContentBlock.Text("1. **malloc()**: Allocates memory but does not initialize it."),
                                ContentBlock.Text("2. **calloc()**: Allocates memory and initializes it to zero."),
                                ContentBlock.Text("3. **realloc()**: Changes the size of previously allocated memory."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }
    arr[0] = 10;
    printf("arr[0]: %d\\n", arr[0]);

    arr = (int*)realloc(arr, 10 * sizeof(int));  // Resize memory
    if (arr == NULL) {
        printf("Reallocation failed\\n");
        return 1;
    }
    free(arr);  // Free dynamically allocated memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c4_sub3",
                            title = "Differences Between Static and Dynamic Memory",
                            contentBlocks = listOf(
                                ContentBlock.Text("1. **Static Memory**: Allocated at compile time, fixed size, faster access, limited flexibility."),
                                ContentBlock.Text("2. **Dynamic Memory**: Allocated at runtime, flexible size, can be resized, requires manual management (using `malloc()`, `realloc()`, `free()`)."),
                                ContentBlock.Text("Use Case:"),
                                ContentBlock.Text("1. **Static Memory**: Use when the size of the data is known and constant throughout the program."),
                                ContentBlock.Text("2. **Dynamic Memory**: Use when the size of the data can change at runtime or when memory requirements are not known upfront.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 5
                Lesson(
                    id = "expert_c5",
                    title = "C Access Memory",
                    description = "Learn how to access and manage dynamic memory in C after allocation.",
                    subLessons = listOf(
                        Lesson(id = "expert_c5_sub1", title = "Accessing Dynamically Allocated Memory", description = "Learn how to access elements in dynamically allocated memory.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c5_sub2", title = "Using Pointers with Dynamic Memory", description = "Understand the role of pointers when working with dynamic memory.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c5_sub3", title = "Freeing Dynamically Allocated Memory", description = "Learn the importance of freeing dynamically allocated memory to avoid memory leaks.", status = LessonStatus.LOCKED)
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c5_sub1",
                            title = "Accessing Dynamically Allocated Memory",
                            contentBlocks = listOf(
                                ContentBlock.Text("Once memory is allocated dynamically, you access it just like static memory, using pointers and array indexing."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Accessing dynamically allocated memory using array indexing
    arr[0] = 10;
    arr[1] = 20;

    printf("arr[0]: %d\\n", arr[0]);
    printf("arr[1]: %d\\n", arr[1]);

    free(arr);  // Free memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c5_sub2",
                            title = "Using Pointers with Dynamic Memory",
                            contentBlocks = listOf(
                                ContentBlock.Text("Dynamic memory allocation returns a pointer to the allocated memory block."),
                                ContentBlock.Text("You can access memory using the pointer directly or through pointer arithmetic."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Accessing memory through pointer arithmetic
    *(arr + 0) = 10;
    *(arr + 1) = 20;

    printf("arr[0]: %d\\n", *(arr + 0));
    printf("arr[1]: %d\\n", *(arr + 1));

    free(arr);  // Free memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c5_sub3",
                            title = "Freeing Dynamically Allocated Memory",
                            contentBlocks = listOf(
                                ContentBlock.Text("It's important to free dynamically allocated memory using `free()` to prevent memory leaks."),
                                ContentBlock.Text("Once you free the memory, the pointer still holds the address, but it's no longer valid."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Using memory
    arr[0] = 10;
    printf("arr[0]: %d\\n", arr[0]);

    // Free memory when done
    free(arr);
    // Accessing after free may lead to undefined behavior
    // printf("arr[0]: %d\\n", arr[0]);  // Dangerous

    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 6
                Lesson(
                    id = "expert_c6",
                    title = "C Reallocate Memory",
                    description = "Learn how to reallocate memory dynamically and handle NULL pointers and error checking in C.",
                    subLessons = listOf(
                        Lesson(id = "expert_c6_sub1", title = "Reallocating Memory in C", description = "Learn how to change the size of dynamically allocated memory.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c6_sub2", title = "NULL Pointer & Error Checking", description = "Understand how to handle NULL pointers and check for allocation errors.", status = LessonStatus.LOCKED)
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c6_sub1",
                            title = "Reallocating Memory in C",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, you can use `realloc()` to change the size of a previously allocated memory block."),
                                ContentBlock.Text("Syntax: `ptr = realloc(ptr, new_size);`"),
                                ContentBlock.Text("If `realloc()` fails, it returns `NULL` and the original memory is untouched."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(3 * sizeof(int));  // Initial allocation
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    // Reallocate memory to hold 5 integers
    arr = realloc(arr, 5 * sizeof(int));
    if (arr == NULL) {
        printf("Reallocation failed\\n");
        return 1;
    }

    arr[3] = 40;
    arr[4] = 50;

    // Print values
    for (int i = 0; i < 5; i++) {
        printf("arr[%d]: %d\\n", i, arr[i]);
    }

    free(arr);  // Free memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c6_sub2",
                            title = "NULL Pointer & Error Checking",
                            contentBlocks = listOf(
                                ContentBlock.Text("When reallocating memory, it's crucial to check for `NULL` to prevent memory corruption or loss."),
                                ContentBlock.Text("If `realloc()` fails, it returns `NULL`. Always assign the result to a temporary pointer to avoid memory leaks."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(3 * sizeof(int));  // Initial allocation
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    // Reallocation with error checking
    int *temp = realloc(arr, 5 * sizeof(int));
    if (temp == NULL) {
        printf("Reallocation failed\\n");
        free(arr);  // Free original memory to avoid leak
        return 1;
    }
    arr = temp;  // Assign the new memory block to the original pointer

    arr[3] = 40;
    arr[4] = 50;

    // Print values
    for (int i = 0; i < 5; i++) {
        printf("arr[%d]: %d\\n", i, arr[i]);
    }

    free(arr);  // Free memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 7
                Lesson(
                    id = "expert_c7",
                    title = "C Deallocate Memory",
                    description = "Learn how to deallocate memory using `free()` and prevent memory leaks in C.",
                    subLessons = listOf(
                        Lesson(id = "expert_c7_sub1", title = "Deallocate (Free) Memory", description = "Learn how to use `free()` to release dynamically allocated memory.", status = LessonStatus.LOCKED),
                        Lesson(id = "expert_c7_sub2", title = "Memory Leaks", description = "Understand the importance of proper memory deallocation to avoid memory leaks.", status = LessonStatus.LOCKED)
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "expert_c7_sub1",
                            title = "Deallocate (Free) Memory",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C, memory that is dynamically allocated using `malloc()`, `calloc()`, or `realloc()` must be manually freed using `free()` when it's no longer needed."),
                                ContentBlock.Text("Syntax: `free(ptr);`"),
                                ContentBlock.Text("Always ensure that you deallocate memory after you’re done using it to prevent memory leaks."),
                                ContentBlock.Text("Example:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Allocating memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    for (int i = 0; i < 5; i++) {
        arr[i] = i * 10;  // Initializing array
    }

    // Use memory for operations
    for (int i = 0; i < 5; i++) {
        printf("arr[%d] = %d\\n", i, arr[i]);
    }

    // Free memory when done
    free(arr);  // Deallocating memory
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "expert_c7_sub2",
                            title = "Memory Leaks",
                            contentBlocks = listOf(
                                ContentBlock.Text("A memory leak occurs when memory is allocated dynamically but not freed after use, leading to unused memory consuming system resources."),
                                ContentBlock.Text("Memory leaks can slow down or crash programs, especially when dealing with large amounts of data."),
                                ContentBlock.Text("To avoid memory leaks, always ensure that every `malloc()`, `calloc()`, or `realloc()` has a corresponding `free()` call."),
                                ContentBlock.Text("Example of memory leak:"),
                                ContentBlock.Code("""#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Memory allocated but never freed
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Memory is used, but never freed
    for (int i = 0; i < 5; i++) {
        arr[i] = i * 10;
    }

    // Program exits without freeing memory (memory leak)
    return 0;
}""")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),
                // lesson 8





            )
        )
    }
}