package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import com.codemaster.codemasterapp.main.data.ContentBlock
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
                            ContentBlock.Text.fromString("In C, every variable has a memory address, which is the location in memory where the data is stored."),
                            ContentBlock.Text.fromString("You can access a variable's memory address using the `&` operator."),
                            ContentBlock.Text.fromString("Memory addresses are typically represented as hexadecimal values."),
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
                            ContentBlock.Text.fromString("You can access a variable's memory address by using the `&` operator followed by the variable name."),
                            ContentBlock.Text.fromString("The `%p` format specifier is used in `printf` to print the memory address."),
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
                            ContentBlock.Text.fromString("In C, a pointer is a variable that stores the memory address of another variable."),
                            ContentBlock.Text.fromString("A pointer is declared using the `*` symbol. Example: `int* ptr;`"),
                            ContentBlock.Text.fromString("To assign a pointer, use the `&` operator to store the address of a variable."),
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
                            ContentBlock.Text.fromString("Dereferencing a pointer means accessing the value stored at the memory address it points to."),
                            ContentBlock.Text.fromString("Use the `*` operator to dereference a pointer and access the variable's value."),
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
                            ContentBlock.Text.fromString("Arrays and pointers are closely related in C. The name of an array is a constant pointer to its first element."),
                            ContentBlock.Text.fromString("You can use pointers to access array elements by incrementing the pointer."),
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
                            ContentBlock.Text.fromString("Pointers in C allow arithmetic operations like addition or subtraction."),
                            ContentBlock.Text.fromString("When you increment or decrement a pointer, it moves by the size of the type it points to."),
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
                            ContentBlock.Text.fromString("A pointer to a pointer is a pointer that stores the address of another pointer."),
                            ContentBlock.Text.fromString("You can access the value of a pointer to a pointer by dereferencing it twice."),
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
                            ContentBlock.Text.fromString("Pointers are commonly used to pass large structures or arrays to functions, as they allow modification of data directly."),
                            ContentBlock.Text.fromString("Passing a pointer to a function allows that function to modify the original data."),
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
                            ContentBlock.Text.fromString("In real life, pointers are useful when you need to work with dynamic memory or large amounts of data that should not be copied multiple times."),
                            ContentBlock.Text.fromString("Consider a game with a large array of data (e.g., the state of each player). Instead of copying the whole array when passing data between functions, a pointer to the array can be passed, making the process more efficient."),
                            ContentBlock.Text.fromString("Real-life use case: If you're designing a game or a simulation program where you need to pass large structures like a player's game state (inventory, stats, etc.), pointers are used to avoid the high cost of copying large amounts of data."),
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
                            ContentBlock.Text.fromString("Predefined functions are built into C, such as `printf()` for output and `scanf()` for input."),
                            ContentBlock.Text.fromString("Example of using `printf` to print a message:"),
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
                            ContentBlock.Text.fromString("In C, you can define your own functions to group code into reusable blocks."),
                            ContentBlock.Text.fromString("Function syntax:"),
                            ContentBlock.Code(
                                """
                    returnType functionName(parameters) {
                        // code to be executed
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text.fromString("Example: A function to add two numbers:"),
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
                            ContentBlock.Text.fromString("To use a function, simply call it by its name and pass the required arguments."),
                            ContentBlock.Text.fromString("Example: Calling the `add` function in `main`:"),
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
                            ContentBlock.Text.fromString("Functions are useful in real-life applications to keep the code organized, reusable, and maintainable."),
                            ContentBlock.Text.fromString("For example, in a banking system, functions could be used to handle different tasks like checking balance, withdrawing money, and depositing money."),
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
                            ContentBlock.Text.fromString("In C, function data types define the type of value a function will return. The function's return type is specified before its name in the function declaration."),
                            ContentBlock.Text.fromString("Functions can return a variety of data types such as `int`, `float`, `char`, `void`, and others."),
                            ContentBlock.Text.fromString("This sub-lesson will cover the use of specific data types in functions, including their purpose and examples.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c4_sub2",
                        title = "int Data Type",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("The `int` data type is used for functions that return integer values."),
                            ContentBlock.Text.fromString("Example: Function returning an integer:"),
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
                            ContentBlock.Text.fromString("The `float` data type is used for functions that return floating-point numbers."),
                            ContentBlock.Text.fromString("Example: Function returning a float value:"),
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
                            ContentBlock.Text.fromString("The `char` data type is used for functions that return a single character."),
                            ContentBlock.Text.fromString("Example: Function returning a character:"),
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
                            ContentBlock.Text.fromString("The `void` data type is used for functions that do not return any value."),
                            ContentBlock.Text.fromString("Example: A function that doesn't return anything:"),
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
                            ContentBlock.Text.fromString("Let's consider a real-life scenario of a simple calculator program that uses different function data types to perform various operations."),
                            ContentBlock.Text.fromString("This program will include functions that use the `int`, `float`, and `void` data types."),
                            ContentBlock.Text.fromString("Example: A calculator with different functions for addition, division, and a message display:"),
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
                            ContentBlock.Text.fromString("In C, function parameters are variables defined in the function declaration."),
                            ContentBlock.Text.fromString("Arguments are values passed to the function when it is called."),
                            ContentBlock.Text.fromString("Example of parameters and arguments:"),
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
                            ContentBlock.Text.fromString("A function can accept multiple parameters, separated by commas."),
                            ContentBlock.Text.fromString("Example with multiple parameters:"),
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
                            ContentBlock.Text.fromString("In C, you can pass arrays to functions as parameters."),
                            ContentBlock.Text.fromString("Arrays are passed by reference, meaning the function can modify the original array."),
                            ContentBlock.Text.fromString("Example of passing an array as a function parameter:"),
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
                            ContentBlock.Text.fromString("Functions in C can return values to the calling code."),
                            ContentBlock.Text.fromString("The return type is specified in the function declaration, and the return value is given with the `return` keyword."),
                            ContentBlock.Text.fromString("Example: A function that returns an integer value:"),
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
                            ContentBlock.Text.fromString("Let's consider a real-world example: A function to calculate the area of a rectangle."),
                            ContentBlock.Text.fromString("The function will take two parameters: `length` and `width`, and return the calculated area."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("Variables declared inside a function are local and only accessible within that function."),
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
                            ContentBlock.Text.fromString("Global variables are declared outside functions and can be accessed anywhere in the program."),
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
                            ContentBlock.Text.fromString("Variable names must start with a letter or an underscore. They are case-sensitive and cannot be C keywords."),
                            ContentBlock.Text.fromString("Important: If the same name is used for a variable inside and outside a function, C treats them as separate variables."),
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
                            ContentBlock.Text.fromString("In a game, we can use global variables to track scores and local variables to compute values within specific functions."),
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
                            ContentBlock.Text.fromString("In C, a function declaration tells the compiler about the function's name, return type, and parameters. This allows the compiler to check for errors when the function is called before it is defined."),
                            ContentBlock.Text.fromString("Function declaration syntax:"),
                            ContentBlock.Code(
                                """
                    return_type function_name(parameter1, parameter2, ...);
                """.trimIndent()
                            ),
                            ContentBlock.Text.fromString("Example of a function declaration:"),
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
                            ContentBlock.Text.fromString("A function definition provides the actual implementation of the function. It includes the function's body, where the code is written to execute the desired task."),
                            ContentBlock.Text.fromString("Function definition syntax:"),
                            ContentBlock.Code(
                                """
                    return_type function_name(parameter1, parameter2, ...) {
                        // Function body
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text.fromString("Example of a function definition:"),
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
                            ContentBlock.Text.fromString("Functions in C can call other functions to perform specific tasks, making code modular and reusable."),
                            ContentBlock.Text.fromString("To call a function, simply use its name followed by the arguments (if any) in parentheses."),
                            ContentBlock.Text.fromString("Example of one function calling another:"),
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
                            ContentBlock.Text.fromString("Consider a scenario where we need to calculate the area of different shapes in a program. We can create separate functions for calculating the area of a circle, rectangle, and triangle, and call them as needed."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("Recursion in C is when a function calls itself in order to solve smaller instances of the same problem."),
                            ContentBlock.Text.fromString("A recursive function typically has two parts:"),
                            ContentBlock.Text.fromString("1. **Base Case**: A condition that stops the recursion to prevent infinite calls."),
                            ContentBlock.Text.fromString("2. **Recursive Case**: The part of the function that calls itself to solve the smaller subproblem."),
                            ContentBlock.Text.fromString("Example of recursion concept:"),
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
                            ContentBlock.Text.fromString("The **base case** is critical in recursion. It defines when the recursion should stop and return a result."),
                            ContentBlock.Text.fromString("Without a base case, the function would call itself indefinitely, resulting in a stack overflow."),
                            ContentBlock.Text.fromString("Example of base case in recursion:"),
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
                            ContentBlock.Text.fromString("A simple recursive function example: Calculating the factorial of a number."),
                            ContentBlock.Text.fromString("The factorial of a number `n` is the product of all integers from 1 to n. It is defined as:"),
                            ContentBlock.Text.fromString("`n! = n * (n - 1) * (n - 2) * ... * 1`, with `0! = 1`."),
                            ContentBlock.Text.fromString("Recursive function example:"),
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
                            ContentBlock.Text.fromString("In C, recursion can often be replaced with an iterative solution using loops."),
                            ContentBlock.Text.fromString("For example, calculating the factorial of a number can be done recursively or iteratively."),
                            ContentBlock.Text.fromString("Recursive approach (previous example):"),
                            ContentBlock.Code(
                                """
                    int factorial(int n) {
                        if (n == 0) return 1;
                        return n * factorial(n - 1);
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text.fromString("Iterative approach:"),
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
                            ContentBlock.Text.fromString("The recursive approach is elegant and simpler to write, but the iterative approach is often more efficient in terms of memory usage.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c8_sub5",
                        title = "Real-Life Example of Recursion",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("A real-world example of recursion is **directory traversal**. When you need to process files in directories and subdirectories, recursion helps to navigate through each folder and subfolder."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("The `math.h` library provides basic math functions like square roots, powers, and trigonometry."),
                            ContentBlock.Code("""#include <math.h>""")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advanced_c9_sub2",
                        title = "Common Math Functions",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Common functions include:"),
                            ContentBlock.Text.fromString("1. `sqrt(x)` - Square root of `x`."),
                            ContentBlock.Text.fromString("2. `pow(x, y)` - `x` raised to the power of `y`."),
                            ContentBlock.Text.fromString("3. `fabs(x)` - Absolute value of `x`."),
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
                            ContentBlock.Text.fromString("Functions like sin(), cos(), and tan() work with radians."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("Use log(), log10(), and exp() for logarithmic and exponential calculations."),
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
                            ContentBlock.Text.fromString("Rounding functions include:"),
                            ContentBlock.Text.fromString("1. `round(x)` - Rounds `x` to the nearest integer."),
                            ContentBlock.Text.fromString("2. `floor(x)` - Largest integer less than or equal to `x`."),
                            ContentBlock.Text.fromString("3. `ceil(x)` - Smallest integer greater than or equal to `x`."),
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
                            ContentBlock.Text.fromString("Structures allow grouping of different data types into a single unit. It's useful when you need to represent real-world entities."),
                            ContentBlock.Text.fromString("Syntax:"),
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
                            ContentBlock.Text.fromString("To create a structure, you define it with the `struct` keyword and then create an instance of it."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("Structure members can be accessed using the dot operator (`.`)."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("You can define a structure inside another structure."),
                            ContentBlock.Text.fromString("Example:"),
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
                            ContentBlock.Text.fromString("Pointers can be used to reference structures. To access members via pointers, use the arrow operator (`->`)."),
                            ContentBlock.Text.fromString("Example:"),
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