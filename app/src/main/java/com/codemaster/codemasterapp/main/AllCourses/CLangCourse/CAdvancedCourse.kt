package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.InteractiveInputBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.QuizContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun CAdvancedCourse(): Stage {
    return Stage(
        id = "c_advanced_stage",
        title = "Advanced",
        lessons = listOf(

            // lesson 1
            Lesson(
                id = "advanced_c1",
                title = "Welcome to Advanced Programming",
                description = "Take your programming skills to the next level by mastering functions, memory management, pointers, and more.",
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c1_sub1",
                        title = "Overview",
                        description = "Explore the key advanced topics that will shape your programming expertise.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In this lesson, you'll learn about the power of functions, memory addresses, pointers, file operations, enums, and memory management. Mastering these concepts will help you write more efficient, modular, and scalable programs.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c1_sub2",
                        title = "Stay Inspired",
                        description = "Encouragement to keep you motivated as you tackle complex programming challenges.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("By mastering advanced concepts like memory management and pointers, you unlock the ability to write efficient and high-performance programs. Embrace the complexity, as each challenge is an opportunity to deepen your understanding of how computers work.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c1_sub3",
                        title = "Effective Learning Strategies",
                        description = "Tips for mastering challenging advanced topics and becoming a better programmer.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Practice writing and testing functions, manipulating pointers, and managing memory. Break complex problems into smaller steps, and don’t be afraid to revisit concepts as you deepen your understanding. Debugging and optimizing code is crucial at this stage.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c1_sub4",
                        title = "Ready to Begin",
                        description = "Prepare yourself for diving deep into advanced topics in the upcoming lessons.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("As you advance, focus on writing programs that utilize pointers, manage memory effectively, and work with files. Learning how to manipulate memory and handle resources properly is essential to becoming a skilled programmer.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),


            // lesson 2
            Lesson(
                id = "advanced_c2",
                title = "C Functions",
                description = "Learn how functions in C improve code reusability and modularity! 🧑‍💻",
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c2_sub1",
                        title = "Introduction to Functions",
                        description = "Understand functions, their syntax, and how they modularize code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A function in C is a block of code that performs a specific task. It helps promote reusability and maintainability by organizing the code.",
                                    listOf("function")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Functions can take inputs (parameters) and return outputs (return values), making your code modular and easier to debug.",
                                    listOf("parameters", "return values")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    returnType functionName(parameters) {
                        // Code to execute
                    }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c2_sub2",
                        title = "Predefined Functions",
                        description = "Explore built-in functions like printf and scanf.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C provides several built-in functions, such as printf() for displaying output and scanf() for accepting input from the user.",
                                    listOf("printf()", "scanf()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Using predefined functions helps avoid reinventing the wheel, saving time and reducing errors.",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c2_sub3",
                        title = "Create a Function",
                        description = "Learn to define custom functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Custom functions allow you to group code logically and reuse it whenever needed. They help make the program more modular and organized.",
                                    listOf("Custom functions")
                                )
                            ),
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
                        id = "advanced_c2_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the function to return the sum of two integers.",
                                incompleteCode = """
        int add(int a, int b) {
            return ___;
        }
    """.trimIndent(),
                                correctCode = "a + b",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c2_sub5",
                        title = "Call a Function (Way 1)",
                        description = "Learn how to call a function by defining it at the top and calling it in main().",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this approach, the function is defined above main() and called within main(). This method is more modular and allows reuse throughout the program.",
                                    listOf("main()")
                                )
                            ),
                            ContentBlock.Code(
                                """
                // Function Definition
                int add(int a, int b) {
                    return a + b;
                }

                int main() {
                    int result = add(5, 3); // Function call
                    printf("Sum: %d", result);
                    return 0;
                }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "advanced_c2_sub6",
                        title = "Call a Function (Way 2)",
                        description = "Learn how to define a function within main() and call it in main().",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here, you declare the function above main(), but define it inside main() after it's called. This works for functions used only within main(), but reduces flexibility.",
                                    listOf("main()")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int add(int a, int b);  // Function declaration

                int main() {
                    int result = add(5, 3); // Function call
                    printf("Sum: %d", result);
                    return 0;
                }

                int add(int a, int b) {  // Function definition
                    return a + b;
                }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c2_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the function call inside main() to use the add function.",
                                incompleteCode = """
        int add(int a, int b);  // Function declaration

        int main() {
            int result = ___(5, 3); // Function call
            printf("Sum: %d", result);
            return 0;
        }

        int add(int a, int b) {  // Function definition
            return a + b;
        }
    """.trimIndent(),
                                correctCode = "add",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c2_sub8",
                        title = "Real-Life Example of Functions",
                        description = "See how functions can be used in real-world scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Functions are essential for organizing tasks in real-world projects. They help break down complex processes into manageable parts.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "For example, a banking system might use functions to check balances, withdraw funds, and deposit money, making the code easier to maintain and expand.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #include <stdio.h>
                    void checkBalance(float balance) {
                        printf("Balance: %.2f\n", balance);
                    }
                    void withdraw(float* balance, float amount) {
                        if (*balance >= amount) {
                            *balance -= amount;
                        }
                    }
                    int main() {
                        float balance = 1000.00;
                        checkBalance(balance);
                        return 0;
                    }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c2_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the main benefit of using functions in C programming?",
                                options = listOf(
                                    "Functions help avoid code repetition by allowing code reuse.",
                                    "Functions make the program run faster.",
                                    "Functions increase the memory usage.",
                                    "Functions make the code more complex."
                                ),
                                correctAnswer = "Functions help avoid code repetition by allowing code reuse.",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.ACTIVE
            ),
            

            // lesson 3
            Lesson(
                id = "advanced_c3",
                title = "C Functions: Data Types",
                description = "Learn how different data types are used in C functions! 🧑‍💻",
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c3_sub1",
                        title = "Function Data Types Overview",
                        description = "Learn about the role of data types in functions and how they define the return value.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, function data types define the type of value a function will return. The function's return type is specified before its name in the function declaration.",
                                    listOf("function", "return type", "declaration")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Functions can return a variety of data types such as int, float, char, void, and others. These types help define the kind of value the function outputs, allowing proper handling of the returned value in the program.",
                                    listOf("int", "float", "char", "void")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c3_sub2",
                        title = "int Data Type",
                        description = "Learn how the int data type is used in functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The int data type is used for functions that return integer values. Integer values are whole numbers, which can be positive, negative, or zero.",
                                    listOf("int", "integer", "whole numbers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Function returning an integer:",
                                    listOf("")
                                )
                            ),
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
                        title = "float Data Type",
                        description = "Understand the use of the float data type in functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The float data type is used for functions that return floating-point numbers. These are numbers that can contain decimals, allowing for more precise calculations.",
                                    listOf("float", "floating-point")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Function returning a float value:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c3_sub4",
                        title = "char Data Type",
                        description = "Explore how the char data type is used in functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The char data type is used for functions that return a single character. A char represents a single letter, number, or symbol in C.",
                                    listOf("char", "character", "symbol")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Function returning a character:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c3_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct return type for a function that returns a floating-point value?",
                                incompleteCode = """
            ___ divide(float a, float b) {
                return a / b;
            }
        """.trimIndent(),
                                correctCode = "float",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c3_sub6",
                        title = "void Data Type",
                        description = "Learn how the void data type works for functions that don't return a value.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The void data type is used for functions that do not return any value. Functions with the void return type are typically used for actions rather than calculations.",
                                    listOf("void", "not return")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: A function that doesn't return anything:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                void printMessage() {
                    printf("Hello, World!\\n");
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c3_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Which return type should be used for a function that doesn't return any value?",
                                incompleteCode = """
            ___ printMessage() {
                printf("Hello, World!\\n");
            }
        """.trimIndent(),
                                correctCode = "void",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c3_sub8",
                        title = "Real-Life Example of Function Data Types",
                        description = "See how different function data types can be used in a practical, real-world scenario.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Let's consider a real-life scenario of a simple calculator program that uses different function data types to perform various operations. In this example, we will see the use of int, float, and void data types.",
                                    listOf("int", "float", "void")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This program will include functions that use the int, float, and void data types to handle addition, division, and display messages.",
                                    listOf("addition", "division", "display messages")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: A calculator with different functions for addition, division, and a message display:",
                                    listOf("")
                                )
                            ),
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
                    printf("Welcome to the Calculator!\\n");
                }

                int main() {
                    int sum = add(5, 3);    // Calling the add function
                    printf("Sum: %d\\n", sum);

                    float result = divide(10.0, 2.0);    // Calling the divide function
                    printf("Result: %.2f\\n", result);

                    displayMessage();   // Calling the display message function
                    return 0;
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c3_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why do we specify a data type for a function's return value?",
                                options = listOf(
                                    "To define the size of the function",
                                    "To ensure the function returns the correct type of value",
                                    "To optimize memory usage",
                                    "To make the function compatible with all types of data"
                                ),
                                correctAnswer = "To ensure the function returns the correct type of value",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 4
            Lesson(
                id = "advanced_c4",
                title = "C Function Parameters",
                description = "Learn about function parameters and how they work in C functions! 🧑‍💻",
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c4_sub1",
                        title = "Introduction to Parameters",
                        description = "Get introduced to function parameters and understand their importance in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, function parameters are variables defined in the function declaration. They are placeholders for the values that will be passed to the function.",
                                    listOf("parameters", "variables", "declaration")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Parameters allow functions to be more flexible and reusable by enabling the passing of different values when the function is called.",
                                    listOf("flexible", "reusable")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void greet(char name[]) {
                        printf("Hello, %s!\n", name);
                    }
                    int main() {
                        greet("Alice");  // 'Alice' is passed as an argument
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c4_sub2",
                        title = "Multiple Parameters",
                        description = "Understand how to pass multiple parameters to a function.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A function can accept multiple parameters, separated by commas.",
                                    listOf("multiple parameters", "comma-separated")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example with multiple parameters:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c4_sub3",
                        title = "Non-Parameter Functions",
                        description = "Learn about functions that do not take any parameters.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, some functions do not take parameters. These are called non-parameter functions.",
                                    listOf("non-parameter functions")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A non-parameter function does not require any input values when it is called. This is useful for simple operations that do not depend on input data.",
                                    listOf("simple operations", "no input")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void greet() {
                        printf("Hello, World!\n");
                    }
                    int main() {
                        greet();  // No arguments are passed
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c4_sub4",
                        title = "Arguments in Functions",
                        description = "Understand the difference between parameters and arguments, and how arguments are passed to functions during a function call in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, arguments are the values that are passed to the function when it is called.",
                                    listOf("arguments", "values", "function")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arguments are used to provide input to functions. These values are passed in the function call and can be used within the function.",
                                    listOf("input", "passed")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of using arguments in a function call:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
void greet(char name[]) {
    printf("Hello, %s!\n", name);
}

int main() {
    greet("Alice");  // "Alice" is the argument passed to the function
    return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c4_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to complete the 'add' function that takes two integer parameters.",
                                incompleteCode = """
        int add(___a, int b) {  // Fill in the parameters for the add function
            return a + b;
        }
        int main() {
            int result = add(5, 10);  // 5 and 10 are arguments
            printf("Result: %d\n", result);
            return 0;
        }
    """.trimIndent(),
                                correctCode = "int"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c4_sub6",
                        title = "Pass Arrays as Function Parameters",
                        description = "Learn how to pass arrays to functions in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, you can pass arrays to functions as parameters.",
                                    listOf("arrays")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays are passed by reference, meaning the function can modify the original array.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of passing an array as a function parameter:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c4_sub7",
                        title = "Return Values from Functions",
                        description = "Learn how functions return values to the caller.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Functions in C can return values to the calling code.",
                                    listOf("return values")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The return type is specified in the function declaration, and the return value is given with the return keyword.",
                                    listOf("return keyword")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: A function that returns an integer value:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c4_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing  keyword in the 'multiply' function.",
                                incompleteCode = """
                int multiply(int a, int b) {  // Function definition
                    ___ a * b;  // Missing return keyword
                }
                int main() {
                    int result = multiply(4, 5);
                    printf("Product: %d\n", result);
                    return 0;
                }
            """.trimIndent(),
                                correctCode = "return"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c4_sub9",
                        title = "Real-Life Example of Function Parameters",
                        description = "Understand the use of function parameters with a real-life example.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Let's consider a real-world example: A function to calculate the area of a rectangle.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The function will take two parameters: length and width, and return the calculated area.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                    ),
                    LessonContent(
                        id = "advanced_c4_sub10",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is a function parameter in C?",
                                options = listOf(
                                    "A variable used to pass values into the function",
                                    "A value that the function returns",
                                    "A statement inside the function body",
                                    "The function's return type"
                                ),
                                correctAnswer = "A variable used to pass values into the function"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 5
            Lesson(
                id = "advanced_c5",
                title = "C Variable Scope",
                description = "Understand how variables behave inside and outside functions in C.",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c5_sub1",
                        title = "Introduction to Variable Scope",
                        description = "Get a fundamental understanding of variable scope and its significance in C programming.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub2",
                        title = "Local Scope",
                        description = "Learn how local variables are restricted to the function they're declared in.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub3",
                        title = "Global Scope",
                        description = "Understand the accessibility of global variables across functions.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub5",
                        title = "Naming Variables",
                        description = "Explore how naming works and the impact of scope in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub7",
                        title = "Real-Life Example",
                        description = "See practical examples of variable scope.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c5_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c5_sub1",
                        title = "Introduction to Variable Scope",
                        description = "Get a fundamental understanding of variable scope and its significance in C programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Variable scope defines where a variable can be accessed or modified in your program. In C, variables are categorized by their scope, which determines their visibility and lifetime.",
                                    listOf("accessed", "modified")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Scope is crucial to avoid conflicts, manage memory efficiently, and maintain code clarity. The two main types of scope in C are local scope and global scope. Let's explore each in detail.",
                                    listOf("local scope", "global scope")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub2",
                        title = "Local Scope",
                        description = "Learn how local variables are restricted to the function they're declared in.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Variables declared inside a function are local and only accessible within that function.",
                                    listOf("accessible")
                                )
                            ),
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
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub3",
                        title = "Global Scope",
                        description = "Understand the accessibility of global variables across functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Global variables are declared outside functions and can be accessed anywhere in the program.",
                                    listOf("accessed")
                                )
                            ),
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
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "In the following code, fill in the blank to make 'x' a global variable with the value 20.",
                                incompleteCode = """
            ___ x = 20;  // Global variable
            void display() {
                printf("%d\n", x);  // Accessible here
            }
            int main() {
                display();
                return 0;
            }
        """.trimIndent(),
                                correctCode = "int",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub5",
                        title = "Naming Variables",
                        description = "Explore how naming works and the impact of scope in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Variable names must start with a letter or an underscore. They are case-sensitive and cannot be C keywords.",
                                    listOf("letter", "underscore")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Important: If the same name is used for a variable inside and outside a function, C treats them as separate variables.",
                                    listOf("")
                                )
                            ),
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
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to ensure the global variable 'score' is modified by the 'increaseScore' function.",
                                incompleteCode = """
            int score = 0;  // Global variable
            void increaseScore(int points) {
                ___ += points;  // Modify global score
            }
        """.trimIndent(),
                                correctCode = "score",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub7",
                        title = "Real-Life Example",
                        description = "See practical examples of variable scope.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In a game, we can use global variables to track scores and local variables to compute values within specific functions.",
                                    listOf("")
                                )
                            ),
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
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c5_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is variable scope in C?",
                                options = listOf(
                                    "The data type of a variable",
                                    "The lifetime and visibility of a variable",
                                    "The memory size of a variable",
                                    "The naming convention of a variable"
                                ),
                                correctAnswer = "The lifetime and visibility of a variable",
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
                id = "advanced_c6",
                title = "C Recursion",
                description = "Understand recursion in C and use it effectively.",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c6_sub1",
                        title = "Introduction to Recursion",
                        description = "Learn the definition of recursion in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub2",
                        title = "Base Case in Recursion",
                        description = "Understand the base case's importance.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub3",
                        title = "Recursive Case in Recursion",
                        description = "See a recursive function in action.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub5",
                        title = "Recursive vs Iterative Solutions",
                        description = "Compare recursion and iteration.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub7",
                        title = "Real-Life Example of Recursion",
                        description = "Apply recursion in real-world scenarios.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c6_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c6_sub1",
                        title = "Introduction to Recursion",
                        description = "Learn the definition of recursion in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Recursion in C is when a function calls itself to solve smaller instances of a problem.",
                                    listOf("Recursion")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A recursive function has two parts:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Base Case: Stops recursion to prevent infinite calls.",
                                    listOf("Base Case")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Recursive Case: Calls itself to solve the subproblem.",
                                    listOf("Recursive Case")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of recursion:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c6_sub2",
                        title = "Base Case in Recursion",
                        description = "Understand the base case's importance.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The base case is crucial. It defines when recursion should stop.",
                                    listOf("base case")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Without it, the function calls itself indefinitely, causing a stack overflow.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of a base case:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c6_sub3",
                        title = "Recursive Case in Recursion",
                        description = "See a recursive function in action.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The recursive case is when a function solves a small part of a problem by calling itself. Let's see an example of calculating factorial using recursion.",
                                    listOf("recursive case")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Factorial (n!) is the multiplication of all integers from 1 to n. By definition, 0! = 1.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here is an example:",
                                    listOf("")
                                )
                            ),
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
                        id = "advanced_c6_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What should be the return value for the base case in a factorial function?",
                                incompleteCode = """
        int factorial(int n) {
            if (n == 0)  // Base case
                return ___;  // What should be returned here?
            else
                return n * factorial(n - 1);  // Recursive case
        }
    """.trimIndent(),
                                correctCode = "1", // The correct answer for the base case is '1'
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c6_sub5",
                        title = "Recursive vs Iterative Solutions",
                        description = "Compare recursion and iteration.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Recursion can often be replaced with iteration using loops.",
                                    listOf("Recursion")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of factorial using recursion:",
                                    listOf("recursion")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int factorial(int n) {
                        if (n == 0) return 1;
                        return n * factorial(n - 1);
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of factorial using iteration:",
                                    listOf("iteration")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Recursion is simpler to write, but iteration is often more memory-efficient.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c6_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "In the following code snippet for calculating factorial, which value should be returned? Choose the correct one.",
                                incompleteCode = """
            int factorial(int n) {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return ___;
            }
            """.trimIndent(),
                                correctCode = "result", // The correct answer is 'result' to be returned in the iterative approach
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c6_sub7",
                        title = "Real-Life Example of Recursion",
                        description = "Apply recursion in real-world scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A real-world example of recursion is directory traversal.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf())),
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
                                    listFiles(entry->d_name);  // Recursive call
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
                    ),
                    LessonContent(
                        id = "advanced_c6_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the base case in recursion?",
                                options = listOf(
                                    "The condition that triggers the recursive function",
                                    "The condition that causes the recursion to stop",
                                    "The first function call in recursion",
                                    "The condition that loops continuously"
                                ),
                                correctAnswer = "The condition that causes the recursion to stop"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 7
            Lesson(
                id = "advanced_c7",
                title = "C Math Functions",
                description = "Learn basic math functions in C.",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c7_sub1",
                        title = "Intro to C Math Functions",
                        description = "Understand the math.h library.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c7_sub2",
                        title = "Common Math Functions",
                        description = "Learn basic functions like sqrt(), pow(), and abs().",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c7_sub3",
                        title = "Trigonometric Functions",
                        description = "Use functions like sin(), cos(), and tan().",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c7_sub4",
                        title = "Logarithmic & Exponential",
                        description = "Learn log(), log10(), and exp().",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c7_sub5",
                        title = "Rounding Functions",
                        description = "Explore round(), floor(), and ceil().",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c7_sub6",
                        title = "Real Life Example",
                        description = "See how C math functions are used in real-world applications.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c7_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c7_sub1",
                        title = "Intro to C Math Functions",
                        description = "Understand the math.h library.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("The math.h library provides basic math functions like square roots, powers, and trigonometry.", listOf("math.h"))),
                            ContentBlock.Code("""#include <math.h>""")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c7_sub2",
                        title = "Common Math Functions",
                        description = "Learn basic functions like sqrt(), pow(), and abs().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Common functions include:")),
                            ContentBlock.Text(createAnnotatedText("1. sqrt(x) - Square root of x.", listOf("sqrt(x)"))),
                            ContentBlock.Text(createAnnotatedText("2. pow(x, y) - x raised to the power of y.", listOf("pow(x, y)"))),
                            ContentBlock.Text(createAnnotatedText("3. fabs(x) - Absolute value of x.", listOf("fabs(x)"))),
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
                        id = "advanced_c7_sub3",
                        title = "Trigonometric Functions",
                        description = "Use functions like sin(), cos(), and tan().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Functions like sin(), cos(), and tan() work with radians.", listOf("sin()", "cos()", "tan()"))),
                            ContentBlock.Text(createAnnotatedText("Example:")),
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
                        id = "advanced_c7_sub4",
                        title = "Logarithmic & Exponential",
                        description = "Learn log(), log10(), and exp().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Use log(), log10(), and exp() for logarithmic and exponential calculations.", listOf("log()", "log10()", "exp()"))),
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
                        id = "advanced_c7_sub5",
                        title = "Rounding Functions",
                        description = "Explore round(), floor(), and ceil().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Rounding functions include:", listOf("round", "floor", "ceil"))),
                            ContentBlock.Text(createAnnotatedText("1. round(x) - Rounds x to the nearest integer.", listOf("round(x)"))),
                            ContentBlock.Text(createAnnotatedText("2. floor(x) - Largest integer less than or equal to x.", listOf("floor(x)"))),
                            ContentBlock.Text(createAnnotatedText("3. ceil(x) - Smallest integer greater than or equal to x.", listOf("ceil(x)"))),
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
                    ),
                    LessonContent(
                        id = "advanced_c7_sub6",
                        title = "Real Life Example",
                        description = "See how C math functions are used in real-world applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("In real-life applications, C math functions are used in various fields such as engineering, computer graphics, and physics simulations.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("For example, calculating the trajectory of a moving object or creating a 3D model involves mathematical computations using functions from math.h.")),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <math.h>
int main() {
    double angle = 45.0; // Angle in degrees
    double radian = angle * M_PI / 180.0; // Convert to radians
    printf("sin(45 degrees) = %.2f\n", sin(radian));
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c7_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why do we use the math.h library in C?",
                                options = listOf("For math operations", "For input/output functions", "For string manipulation", "For data structures"),
                                correctAnswer = "For math operations"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // lesson 8
            Lesson(
                id = "advanced_c8",
                title = "C Memory Address",
                description = "Dive into memory addresses in C and understand how variables are stored in memory! 🧠",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c8_sub1",
                        title = "Introduction to Memory Addresses",
                        description = "Introduction to memory addresses and how variables are stored in memory.",
                        status = LessonStatus.ACTIVE
                    ),
                    Lesson(
                        id = "advanced_c8_sub2",
                        title = "What is a Memory Address?",
                        description = "Learn what a memory address is and how it relates to variable storage.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c8_sub3",
                        title = "Variables and Their Memory Locations",
                        description = "Understand how variables are stored at specific memory locations.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c8_sub4",
                        title = "How Variables are Stored in Memory",
                        description = "Learn how variables are physically stored in memory and allocated.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c8_sub5",
                        title = "Basic Use of the & (Address-of) Operator",
                        description = "Understand how to use the `&` operator to access the memory address.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c8_sub6",
                        title = "Real-life Example of Dynamic Memory Usage",
                        description = "Understand dynamic memory allocation in real applications.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c8_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c8_sub1",
                        title = "Introduction to Memory Addresses",
                        description = "Introduction to memory addresses and how variables are stored in memory.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("In C, each variable has a memory address, where data is stored.", listOf("memory address"))),
                            ContentBlock.Text(createAnnotatedText("Memory addresses are unique for accessing and manipulating data.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Use the & operator to access the memory address of a variable.", listOf("operator", "&"))),
                            ContentBlock.Code(
                                """
int num = 10;
printf("Memory address of num: %p\n", &num);
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub2",
                        title = "What is a Memory Address?",
                        description = "Learn what a memory address is and how it relates to variable storage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("A memory address is a unique identifier for a location in memory.", listOf("identifier", "memory"))),
                            ContentBlock.Text(createAnnotatedText("Memory addresses are key for data access and manipulation.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("The %p specifier prints a memory address.", listOf("%p"))),
                            ContentBlock.Code(
                                """
int num = 10;
printf("Address of num: %p\n", &num);
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub3",
                        title = "Variables and Their Memory Locations",
                        description = "Understand how variables are stored at specific memory locations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Variables are stored in memory locations identified by memory addresses.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Stack stores local variables, heap stores dynamically allocated memory.", listOf("Stack", "heap"))),
                            ContentBlock.Text(createAnnotatedText("Access a variable’s address using the & operator.", listOf("&"))),
                            ContentBlock.Code(
                                """
int num = 10;  // Stack
printf("%p", &num);
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub4",
                        title = "How Variables are Stored in Memory",
                        description = "Learn how variables are physically stored in memory and allocated.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Variables are allocated memory by the compiler at specific locations.", listOf("compiler"))),
                            ContentBlock.Text(createAnnotatedText("Stack and heap manage memory for local and dynamic variables.", listOf("Stack", "heap"))),
                            ContentBlock.Text(createAnnotatedText("The operating system handles memory allocation during program execution.", listOf(""))),
                            ContentBlock.Code(
                                """
int num = 10;  // Stored on the stack
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub5",
                        title = "Basic Use of the & (Address-of) Operator",
                        description = "Understand how to use the & operator to access the memory address.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("The & operator is used to get the memory address of a variable.", listOf("&"))),
                            ContentBlock.Text(createAnnotatedText("This operator helps when working with memory locations.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("& returns the address of the variable.", listOf("address", "&"))),
                            ContentBlock.Code(
                                """
int num = 10;
printf("Memory address of num: %p\n", &num);
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub6",
                        title = "Real-life Example of Dynamic Memory Usage",
                        description = "Understand dynamic memory allocation in real applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Dynamic memory allocation is crucial for efficient memory management.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("It is used in applications like image processing, where data size is unknown.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Memory is allocated and freed at runtime as needed.", listOf(""))),
                            ContentBlock.Code(
                                """
int width = 1024;
int height = 768;
int *imageData = (int *)malloc(width * height * sizeof(int));

if (imageData != NULL) {
    free(imageData);
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which operator in C is used to get the memory address of a variable?",
                                options = listOf("&", "%p", "*", "->"),
                                correctAnswer = "&"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 9
            Lesson(
                id = "advanced_c9",
                title = "C Pointers",
                description = "Master pointers in C, including creating pointers and their relationship with arrays! 🔑",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c9_sub1",
                        title = "Introduction to Pointers",
                        description = "An introduction to what pointers are and why they are important in C programming.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub2",
                        title = "Creating Pointers",
                        description = "Learn how to create pointers and assign them to variables. This is the fundamental step in understanding pointers.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub4",
                        title = "Pointers & Arrays",
                        description = "Learn how pointers and arrays are closely related in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub6",
                        title = "Pointer Arithmetic",
                        description = "Explore pointer arithmetic and how to manipulate pointer values.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub7",
                        title = "Pointers to Pointers",
                        description = "Understand pointers that point to other pointers and how to work with them.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub9",
                        title = "Pointer & Function Arguments",
                        description = "Learn how to pass pointers to functions and manipulate data through them.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub10",
                        title = "Real-Life Example of Pointers",
                        description = "Learn how pointers can be used in real-world applications, such as dynamic memory management or handling large data.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c9_sub11",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c9_sub1",
                        title = "Introduction to Pointers",
                        description = "An introduction to what pointers are and why they are important in C programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("In C, a pointer is a variable that stores the memory address of another variable.", listOf("pointer", "memory address"))),
                            ContentBlock.Text(createAnnotatedText("Pointers are essential in C programming as they allow direct manipulation of memory, efficient function calls, and dynamic memory allocation.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Understanding pointers helps you better manage memory and work with complex data structures.", listOf(""))),
                            ContentBlock.Code(
                                """
// Example: Basic pointer declaration
int num = 10;
int* ptr;  // Pointer to an integer
ptr = &num;  // 'ptr' now holds the address of 'num'
printf("Value of num using pointer: %d\n", *ptr);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Creating Pointers
                    LessonContent(
                        id = "advanced_c9_sub2",
                        title = "Creating Pointers",
                        description = "Learn how to create pointers and assign them to variables. This is the fundamental step in understanding pointers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("To create a pointer in C, you use the * symbol. A pointer stores the memory address of a variable.", listOf("pointer","*"))),
                            ContentBlock.Text(createAnnotatedText("You can assign a pointer the address of a variable using the & operator.", listOf("&"))),
                            ContentBlock.Text(createAnnotatedText("A pointer is typically declared as: type* pointerName; .", listOf("type* pointerName;"))),
                            ContentBlock.Code(
                                """
// Example: Creating a pointer
int num = 20;
int* ptr;  // Declaring a pointer to an integer
ptr = &num;  // Assign the address of num to ptr

// Display the address and the value stored at that address
printf("Address of num: %p\n", (void*)ptr);  // Prints address
printf("Value at the address: %d\n", *ptr);  // Dereferencing the pointer to get the value
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c9_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What operator is used to get the address of a variable and assign it to a pointer?",
                                incompleteCode = "ptr = ___num;",
                                correctCode = "&",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c9_sub4",
                        title = "Pointers & Arrays",
                        description = "Learn how pointers and arrays are closely related in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Arrays and pointers are closely related in C. The name of an array is a constant pointer to its first element.", listOf("array", "pointer", "constant"))),
                            ContentBlock.Text(createAnnotatedText("You can use pointers to access array elements by incrementing the pointer.", listOf())),
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
                        id = "advanced_c9_sub5",
                        title = "Pointer Arithmetic",
                        description = "Explore pointer arithmetic and how to manipulate pointer values.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Pointers in C allow arithmetic operations like addition or subtraction.", listOf("pointer arithmetic"))),
                            ContentBlock.Text(createAnnotatedText("When you increment or decrement a pointer, it moves by the size of the type it points to.", listOf())),
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
                        id = "advanced_c9_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to print the third element of the array using pointer arithmetic.",
                                incompleteCode = """
int arr[] = {1, 2, 3};
int* ptr = arr;
printf("%d\n", *(ptr + ___));  // Fill in the blank
                """.trimIndent(),
                                correctCode = "2", // The correct answer is 2 to print the third element (index 2)
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c9_sub7",
                        title = "Pointers to Pointers",
                        description = "Understand pointers that point to other pointers and how to work with them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("A pointer to a pointer is a pointer that stores the address of another pointer.", listOf("pointer to pointer", "address", "dereferencing"))),
                            ContentBlock.Text(createAnnotatedText("You can access the value of a pointer to a pointer by dereferencing it twice.", listOf())),
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
                        id = "advanced_c9_sub8",
                        title = "Pointer & Function Arguments",
                        description = "Learn how to pass pointers to functions and manipulate data through them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Pointers are commonly used to pass large structures or arrays to functions, as they allow modification of data directly.", listOf("pass by pointer"))),
                            ContentBlock.Text(createAnnotatedText("Passing a pointer to a function allows that function to modify the original data.", listOf())),
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
                        id = "advanced_c9_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing part to correctly dereference the pointer to pointer and print the value of 'num'.",
                                incompleteCode = """
int num = 10;
int* ptr = &num;
int** ptr2 = &ptr;  // Pointer to pointer
printf("%d\n", ___);  // Fill in the blank to access 'num' using pointer to pointer
                """.trimIndent(),
                                correctCode = "**ptr2", // Correct answer is dereferencing ptr2 twice
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c9_sub10",
                        title = "Real-Life Example of Pointers",
                        description = "Learn how pointers can be used in real-world applications, such as dynamic memory management or handling large data.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Pointers are used for efficient memory management, especially with large data that shouldn't be copied.", listOf())),
                            ContentBlock.Text(createAnnotatedText("In games or simulations, pointers pass large structures like player data without copying them, improving efficiency.", listOf())),
                            ContentBlock.Text(createAnnotatedText("For example, passing a player's game state via pointers avoids the overhead of copying data.", listOf())),
                            ContentBlock.Code(
                                """
// Example: Game with player's data
typedef struct {
    int health;
    int score;
    char name[50];
} Player;

void updatePlayerStats(Player* p) {
    p->health -= 10;  // Update health directly
    p->score += 100;   // Update score directly
}

int main() {
    Player player1 = {100, 0, "Alice"};
    updatePlayerStats(&player1);  // Pass pointer
    printf("Updated stats - Health: %d, Score: %d\n", player1.health, player1.score);
}
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c9_sub11",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What does a pointer in C store?",
                                options = listOf(
                                    "The value of a variable",
                                    "The memory address of a variable",
                                    "The size of a variable",
                                    "The name of a variable"
                                ),
                                correctAnswer = "The memory address of a variable",
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
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c10_sub5",
                        title = "Nested Structures",
                        description = "Learn how to define structures within structures.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c10_sub6",
                        title = "Pointers to Structures",
                        description = "Understand how to use pointers with structures.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c10_sub7",
                        title = "Accessing Structure Members",
                        description = "Learn how to access and modify structure members.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c10_sub8",
                        title = "Real-Life Example of Structures",
                        description = "An advanced example of structures with arrays and functions.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c10_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c10_sub1",
                        title = "Introduction to Structures",
                        description = "Understand the basics of structures in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Structures allow grouping of different data types into a single unit. It's useful when you need to represent real-world entities.", listOf("Structures"))),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
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
                        description = "Learn how to define and initialize a structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("To create a structure, you define it with the struct keyword and then create an instance of it.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        description = "Learn how to access and modify structure members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Structure members can be accessed using the dot operator(.).", listOf("dot operator", "."))),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What keyword is used to define a structure in C?",
                                incompleteCode = """___ Person {
    char name[50];
    int age;
};""",
                                correctCode = "struct",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c10_sub5",
                        title = "Nested Structures",
                        description = "Learn how to define structures within structures.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("You can define a structure inside another structure.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = "advanced_c10_sub6",
                        title = "Pointers to Structures",
                        description = "Understand how to use pointers with structures.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Pointers can be used to reference structures. To access members via pointers, use the arrow operator (->).", listOf("Pointers", "->", "arrow operator"))),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                    ),
                    LessonContent(
                        id = "advanced_c10_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What type should the address member in the Person structure be?",
                                incompleteCode = """
struct Person {
    char name[50];
    int age;
   struct ___;
};""",
                                correctCode = "address",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c10_sub8",
                        title = "Real-Life Example of Structures",
                        description = "An advanced example of structures with arrays and functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("In this example, we'll use structures with arrays and pass them to functions.", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>

struct Student {
    char name[50];
    int marks[5];
};

void printStudent(struct Student s) {
    printf("Name: %s\n", s.name);
    printf("Marks: ");
    for(int i = 0; i < 5; i++) {
        printf("%d ", s.marks[i]);
    }
    printf("\\n");
}

int main() {
    struct Student s1 = {"Alice", {80, 90, 85, 70, 95}};
    printStudent(s1);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c10_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why do we use 'struct' in C programming?",
                                options = listOf(
                                    "To group related data together",
                                    "To create dynamic memory allocation",
                                    "To define classes",
                                    "To handle memory addresses"
                                ),
                                correctAnswer = "To group related data together",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 11
            Lesson(
                id = "advanced_c11",
                title = "C Files",
                description = "Learn advanced file handling techniques in C, including creating, reading, writing, and closing files.",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c11_sub1",
                        title = "Introduction to File Handling",
                        description = "Understand the basics of file handling in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c11_sub2",
                        title = "Creating a File",
                        description = "Learn how to create and open files in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c11_sub3",
                        title = "Reading from a File",
                        description = "Learn how to read data from a file.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c11_sub4",
                        title = "Writing to a File",
                        description = "Learn how to write data to a file.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c11_sub5",
                        title = "Closing a File",
                        description = "Learn how to close a file safely.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c11_sub6",
                        title = "File Error Handling",
                        description = "Understand how to handle file errors in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c11_sub7",
                        title = "Real-Life Example of File Handling",
                        description = "Learn a practical application of file handling in C.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c11_sub1",
                        title = "Introduction to File Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "File handling in C allows programs to perform operations like reading and writing files using file pointers. File handling is crucial for data persistence.",
                                    listOf("file handling", "file pointers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The stdio.h header provides necessary functions for file operations.",
                                    listOf("stdio.h")
                                )
                            ),
                            ContentBlock.Code("#include <stdio.h>")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c11_sub2",
                        title = "Creating a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The fopen() function is used to create and open files. Mode w writes to a text file, and wb writes to a binary file.",
                                    listOf("fopen()", "writes", "binary")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here’s how you can create a file and write to it.",
                                    listOf()
                                )
                            ),
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
                        id = "advanced_c11_sub3",
                        title = "Reading from a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use fopen() in r mode to open files for reading. Functions like fscanf(), fgets(), or fgetc() can retrieve file content.",
                                    listOf("fopen()", "fscanf()", "fgets()", "fgetc()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of reading a file line-by-line:",
                                    listOf()
                                )
                            ),
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
                        id = "advanced_c11_sub4",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to create and write to a file using fopen() with write mode.",
                                incompleteCode = """
FILE *file = fopen("example.txt", ___);
if (file == NULL) {
    printf("Error opening file.\n");
    return 1;
}
""",
                                correctCode = "w",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c11_sub5",
                        title = "Writing to a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use modes like w (overwrite) or a (append) with fopen() for writing. Functions like fprintf(), fputs(), or fwrite() handle file writing.",
                                    listOf("fopen()", "fprintf()", "fputs()", "fwrite()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here’s an example of writing to a file:",
                                    listOf()
                                )
                            ),
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
                        id = "advanced_c11_sub6",
                        title = "Closing a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use fclose() to close a file and ensure data integrity by flushing buffers.",
                                    listOf("fclose()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example demonstrating file closure:",
                                    listOf()
                                )
                            ),
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
                        id = "advanced_c11_sub7",
                        title = "File Error Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Always check file operations for errors. Use functions like ferror() to identify issues.",
                                    listOf("ferror()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example demonstrating error handling during file access:",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("nonexistent.txt", "r");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fclose(file);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c11_sub8",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What mode should be used with fopen() to append content to an existing file?",
                                incompleteCode = "FILE *file = fopen(\"example.txt\", ___);",
                                correctCode = "a",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c11_sub9",
                        title = "Real-Life Example of File Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A real-world application demonstrates managing student records using file handling in C.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

struct Student {
    char name[50];
    int rollNumber;
    float marks;
};

void addStudent(FILE *file) {
    struct Student s;
    printf("Enter name: ");
    scanf("%s", s.name);
    printf("Enter roll number: ");
    scanf("%d", &s.rollNumber);
    printf("Enter marks: ");
    scanf("%f", &s.marks);
    fwrite(&s, sizeof(struct Student), 1, file);
    printf("Student added successfully.\n");
}

void viewStudents(FILE *file) {
    struct Student s;
    rewind(file);
    while (fread(&s, sizeof(struct Student), 1, file)) {
        printf("Name: %s, Roll Number: %d, Marks: %.2f\n", s.name, s.rollNumber, s.marks);
    }
}

int main() {
    FILE *file = fopen("students.dat", "wb+");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    int choice;
    do {
        printf("1. Add Student\n2. View Students\n3. Exit\nEnter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                addStudent(file);
                break;
            case 2:
                viewStudents(file);
                break;
            case 3:
                fclose(file);
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice.\n");
        }
    } while (choice != 3);

    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c11_sub10",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is a file in the context of C programming?",
                                options = listOf(
                                    "A temporary storage used by the program",
                                    "A collection of instructions executed by the CPU",
                                    "A collection of data stored on a storage device",
                                    "A program that helps manage memory"
                                ),
                                correctAnswer = "A collection of data stored on a storage device",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 12
            Lesson(
                id = "advanced_c12",
                title = "C Enumeration (enum)",
                description = "Learn advanced techniques for using enums in C, including defining enums, changing their values, and using them in switch statements.",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c12_sub1",
                        title = "Introduction to Enums",
                        description = "Learn the basics of defining and using enums in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub2",
                        title = "Changing Enum Values",
                        description = "Understand how to assign and change values of enums.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub4",
                        title = "Enum in Switch Statement",
                        description = "Learn how to use enums with switch-case statements.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub5",
                        title = "Enum with Bit Flags",
                        description = "Learn how to use enums with bit flags for more efficient storage.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub6",
                        title = "Real-life Example of Enums",
                        description = "Learn how enums can be used to represent real-world concepts such as user roles in a system.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c12_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c12_sub1",
                        title = "Introduction to Enums",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enums in C are used to define a set of named integer constants. They improve code readability and provide better organization.",
                                    listOf("Enums")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """enum EnumName {
    CONSTANT_1,
    CONSTANT_2,
    CONSTANT_3
};"""
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = "advanced_c12_sub2",
                        title = "Changing Enum Values",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can change the underlying integer values of an enum. By default, the first value is 0, and each subsequent value increments by 1.",
                                    listOf("0", "1")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>

enum Day { Sunday = 1, Monday = 2, Tuesday = 4, Wednesday = 8, Thursday = 16 };

int main() {
    enum Day today = Tuesday;
    printf("Today is %d\\n", today);
    return 0;
}"""
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In the above code, Sunday starts at 1, Monday at 2, Tuesday at 4, etc.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c12_sub3",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the missing part in code.",
                                incompleteCode = """___ Day {
    Sunday, 
    Monday, 
    Tuesday, 
    Wednesday, 
    Thursday, 
    Friday, 
    Saturday
};""",
                                correctCode = "enum"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c12_sub4",
                        title = "Enum in Switch Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enums work well with switch statements, as you can match specific enum values to execute corresponding code.",
                                    listOf("statements")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = "advanced_c12_sub4",
                        title = "Enum with Bit Flags",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can use enums with bit flags for efficient storage and checking multiple conditions.",
                                    listOf("bit flags")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Bitwise OR | and AND & operations are used to combine or check flags.",
                                    listOf("|", "&")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                    ),
                    LessonContent(
                        id = "advanced_c12_sub5",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the switch statement to print the correct message for today (assuming today = Wednesday):",
                                incompleteCode = """enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };

int main() {
    enum ___ today = Wednesday;
    
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
}""",
                                correctCode = "Day"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c12_sub6",
                        title = "Real-life Example of Enums",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Enums can represent user roles in a system, improving clarity and managing permissions efficiently.")),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>

// Enum for user roles
enum UserRole {
    ADMIN,
    MODERATOR,
    USER,
    GUEST
};

void printUserRole(enum UserRole role) {
    switch(role) {
        case ADMIN: printf("Admin privileges\\n"); break;
        case MODERATOR: printf("Moderator privileges\\n"); break;
        case USER: printf("User privileges\\n"); break;
        case GUEST: printf("Guest privileges\\n"); break;
        default: printf("Unknown role\\n");
    }
}

int main() {
    printUserRole(ADMIN);
    printUserRole(GUEST);
    return 0;
}"""
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This example shows how enums make role management and code readability simpler.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c12_sub7",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is an example of enum declaration?",
                                options = listOf(
                                    "int days = 7;",
                                    "enum Day { Sunday, Monday, Tuesday };",
                                    "const Day = { Sunday, Monday, Tuesday };",
                                    "Day[] days = { Sunday, Monday, Tuesday };"
                                ),
                                correctAnswer = "enum Day { Sunday, Monday, Tuesday };"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 13
            Lesson(
                id = "advanced_c13",
                title = "C Memory Management",
                description = "Master memory management in C, including dynamic memory allocation, deallocation, and handling memory efficiently.",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c13_sub1",
                        title = "Introduction to Memory Management",
                        description = "Understand the concept of memory management in C, including stack and heap memory.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub2",
                        title = "Dynamic Memory Allocation",
                        description = "Learn how to allocate memory dynamically using malloc, calloc, and realloc.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub4",
                        title = "Memory Deallocation",
                        description = "Learn the importance of deallocating memory using free.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub5",
                        title = "Memory Leaks and Optimization",
                        description = "Understand how to prevent memory leaks and optimize memory usage.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub7",
                        title = "Advanced Memory Management Techniques",
                        description = "Explore advanced techniques like memory pools, garbage collection, and real-life memory management strategies.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c13_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c13_sub1",
                        title = "Introduction to Memory Management",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory management in C is a crucial concept that involves managing the allocation, use, and deallocation of memory resources. Efficient memory management ensures optimal performance, prevents memory leaks, and avoids issues like fragmentation.",
                                    listOf("Memory management")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory in C is divided into three sections: the stack, heap, and data segment.",
                                    listOf("stack", "heap")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Stack: Used for local variables, automatically managed, limited size.",
                                    listOf(
                                        "Stack",
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Heap: Used for dynamic memory allocation, manually managed.",
                                    listOf("Heap")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Data Segment: Used for global and static variables.",
                                    listOf("Data Segment")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub2",
                        title = "Dynamic Memory Allocation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C provides functions for dynamic memory allocation, allowing memory to be allocated at runtime.",
                                    listOf("dynamic memory allocation")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Functions:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.malloc(): Allocates uninitialized memory.",
                                    listOf("malloc()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.calloc(): Allocates zero-initialized memory.",
                                    listOf("calloc()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.realloc(): Resizes previously allocated memory.",
                                    listOf("realloc()")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>
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
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub3",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the function used for dynamic memory allocation in C that allocates uninitialized memory?",
                                incompleteCode = """int *arr = (int*)___(5 * sizeof(int));""",
                                correctCode = "malloc",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub4",
                        title = "Memory Deallocation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory allocated dynamically using malloc, calloc, or realloc should be deallocated using free().",
                                    listOf(
                                        "free()",
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Failure to free memory can cause memory leaks, leading to resource wastage.",
                                    listOf("memory leaks")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int*)malloc(sizeof(int));
    *ptr = 100;
    printf("Value: %d\\n", *ptr);
    
    free(ptr);  // Always free dynamically allocated memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub5",
                        title = "Memory Leaks and Optimization",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory leaks occur when dynamically allocated memory is not freed, causing wasted resources and possible application crashes.",
                                    listOf(
                                        "application crashes"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Best Practices:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Always pair malloc/calloc/realloc with free.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Use tools like Valgrind to detect memory leaks.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Consider using smart pointers in C++ to automate memory management.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of a memory leak:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));
    // Memory is not freed, causing a memory leak
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub6",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "In the following code, what is the missing step after malloc to avoid a memory leak?",
                                incompleteCode = """int *ptr = (int*)malloc(sizeof(int));  ___(ptr);""",
                                correctCode = "free",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub7",
                        title = "Real-Life Memory Management Examples",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Efficient memory management is crucial in large apps like games and browsers.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Memory Pools: Pre-allocate memory for reuse to reduce allocation overhead.",
                                    listOf(
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Games: Memory pools manage textures, reusing memory instead of reallocating it frequently.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Browsers: Allocate memory for tabs, freeing it when closed to ensure smooth performance.",
                                    listOf(
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Memory pool for game textures:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

#define POOL_SIZE 1024
char texture_pool[POOL_SIZE];

void* allocate_texture(size_t size) {
    static size_t offset = 0;
    if (offset + size > POOL_SIZE) return NULL;
    void* ptr = texture_pool + offset;
    offset += size;
    return ptr;
}

int main() {
    char* texture = (char*)allocate_texture(100);
    if (texture == NULL) {
        printf("Texture pool exhausted\\n");
    }
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c13_sub8",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the consequence of failing to free dynamically allocated memory?",
                                options = listOf("Memory leaks", "Segmentation fault", "Memory fragmentation", "Out of memory error"),
                                correctAnswer = "Memory leaks",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                ),
                status = LessonStatus.LOCKED
            ),


            // lesson 14
            Lesson(
                id = "advanced_c14",
                title = "Advanced Recap",
                description = "A brief recap of advanced programming concepts in C, focusing on memory management, pointers, and other complex topics.",
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c14_sub1",
                        title = "Introduction and Encouragement",
                        description = "Let's revisit advanced concepts that will solidify your skills in C programming. These topics are the building blocks of efficient, high-performance applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You're now venturing into more intricate areas of programming. Pointers, memory management, and file handling are not just concepts but essential tools that will allow you to write efficient, scalable, and performant code. Keep pushing forward, the mastery of these topics will elevate your programming to the next level.",
                                    listOf("efficiency", "scalable", "performance")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c14_sub2",
                        title = "Pointers and Memory Management",
                        description = "Understanding pointers and memory management is critical for writing optimized code. Pointers give you direct access to memory, and mastering memory allocation and deallocation allows for efficient resource usage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointers are powerful tools that allow direct manipulation of memory. Mastering pointers, along with dynamic memory allocation (`malloc`, `calloc`) and deallocation (`free`), is essential for handling resources efficiently. Proper memory management ensures that your programs are not only functional but optimized for performance and reliability.",
                                    listOf("pointers", "memory allocation", "dynamic memory")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c14_sub3",
                        title = "Enums and Advanced Data Structures",
                        description = "Enums allow you to work with sets of named constants, while advanced data structures like structs and linked lists enable you to manage complex data efficiently.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enums improve code readability by associating names with constant values, making your programs easier to understand and maintain. Pairing enums with structs and linked lists further enhances your ability to manage and process complex datasets efficiently.",
                                    listOf("enums", "structs", "linked lists")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c14_sub4",
                        title = "Keep Going! Your Next Challenge Awaits",
                        description = "You’ve gained mastery over advanced topics like pointers and memory management. These concepts will support the most complex tasks you’ll encounter. As you continue, your ability to write efficient and scalable code will grow exponentially.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You're well-equipped to tackle larger projects and more challenging problems. Keep pushing forward—advanced topics like multithreading, system-level programming, and optimization are next on your journey. Stay focused and continue growing as a programmer.",
                                    listOf("next challenge", "growth")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 15
            Lesson(
                id = "advanced_c15",
                title = "Advanced Quiz",
                description = "Test your advanced knowledge of C programming concepts such as memory management, pointers, structs, and file I/O! 🧠💻",
                subLessons = listOf(
                    Lesson(
                        id = "advanced_c15_sub1",
                        title = "Quiz: Pointers and Memory Management",
                        description = "Test your understanding of pointers, dynamic memory allocation, and memory management techniques in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c15_sub2",
                        title = "Quiz: Structs and Enums",
                        description = "Quiz on structs, enums, and their usage in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c15_sub3",
                        title = "Quiz: File I/O and Error Handling",
                        description = "Test your knowledge of file input/output and error handling in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c15_sub4",
                        title = "Quiz: Advanced Data Structures",
                        description = "Test your understanding of linked lists, trees, and other advanced data structures in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advanced_c15_sub5",
                        title = "Quiz: Multithreading and Concurrency",
                        description = "Quiz on multithreading, synchronization, and concurrency concepts in C.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advanced_c15_sub1",
                        title = "Quiz: Pointers and Memory Management",
                        description = "Answer questions about pointers, dynamic memory allocation, and memory management techniques in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the purpose of malloc() in C?",
                                options = listOf(
                                    "Allocates memory dynamically",
                                    "Frees dynamically allocated memory",
                                    "Returns a pointer to a string",
                                    "Creates an array of fixed size"
                                ),
                                correctAnswer = "Allocates memory dynamically"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "advanced_c15_sub2",
                        title = "Quiz: Structs and Enums",
                        description = "Test your understanding of structs, enums, and their applications in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "How do you define a struct in C?",
                                options = listOf(
                                    "struct name { int x; float y; };",
                                    "struct { int x, float y; } name;",
                                    "struct { int x, float y; };",
                                    "int struct name { x; y; };"
                                ),
                                correctAnswer = "struct name { int x; float y; };"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "advanced_c15_sub3",
                        title = "Quiz: File I/O and Error Handling",
                        description = "Answer questions about file input/output and error handling in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What does fopen() return if it fails to open a file?",
                                options = listOf(
                                    "NULL",
                                    "0",
                                    "An error message",
                                    "File pointer"
                                ),
                                correctAnswer = "NULL"
                            ),

                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "advanced_c15_sub4",
                        title = "Quiz: Advanced Data Structures",
                        description = "Test your understanding of advanced data structures like linked lists and trees.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is the correct way to define a node in a singly linked list?",
                                options = listOf(
                                    "struct node { int data; struct node *next; };",
                                    "struct node { int data; node *next; };",
                                    "struct { int data, struct node *next; };",
                                    "int node { data; next; };"
                                ),
                                correctAnswer = "struct node { int data; struct node *next; };"
                            ),

                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "advanced_c15_sub5",
                        title = "Quiz: Multithreading and Concurrency",
                        description = "Test your knowledge of multithreading and concurrency concepts in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which function is used to create a thread in C?",
                                options = listOf(
                                    "pthread_create()",
                                    "thread_create()",
                                    "create_thread()",
                                    "create_task()"
                                ),
                                correctAnswer = "pthread_create()"
                            ),

                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "advanced_c15_sub6",
                        title = "Stage Completed",
                        description = "You’ve completed this stage, now prepare for the next one!",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Fantastic! You've successfully completed this stage. Continue practicing and get ready for the next stage to master advanced C programming concepts. 🚀"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            )


            // continue from here


        )
    )
}