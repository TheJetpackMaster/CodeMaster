package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

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

fun CIntermediateCourse(): Stage {
    return Stage(
        id = "c_intermediate_stage",
        title = "Intermediate",
        lessons = listOf(

            // lesson 1
            Lesson(
                id = "intermediate_c1",
                title = "Welcome to Intermediate",
                description = "An essential step to advance your programming skills with logic and control structures.",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c1_sub1",
                        title = "Overview",
                        description = "Learn the key topics and goals of this stage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In this lesson, you'll explore key programming concepts like If-Else Statements, Switch Cases, Loops, Arrays, Strings, and more. These are essential tools for developing efficient code and making dynamic decisions in your programs.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c1_sub2",
                        title = "Stay Inspired",
                        description = "Encouraging words to keep you motivated.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Every line of code brings you closer to becoming a proficient programmer. Embrace each challenge as an opportunity to learn and grow, and celebrate the progress you make along the way."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c1_sub3",
                        title = "Effective Learning Strategies",
                        description = "Tips for improving your skills and staying on track.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Persistence and practice are key to success in programming. Write small programs to test your concepts, embrace debugging as a learning tool, and practice consistently to strengthen your skills."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c1_sub4",
                        title = "Ready to Begin",
                        description = "Learn what comes next in your journey.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Start by testing each concept with small programs, debug your code to understand how it works, and practice regularly. Stay curious and ask questions—learning is a continuous journey that evolves with every challenge you face."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // lesson 2
            Lesson(
                id = "intermediate_c2",
                title = "C If ... Else",
                description = "Learn how to use if, else, and else if statements in C to control program flow and make decisions! 💡",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c2_sub1",
                        title = "If Statements",
                        description = "Learn how to use if statements to make decisions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The if statement is a conditional structure that evaluates a condition. If the condition is true, the code inside the block runs otherwise, it is skipped.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Syntax:")),
                            ContentBlock.Code(
                                """
                if (condition) {
                    // code to execute if condition is true
                }
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Code(
                                """
                int rain = 1; // 1 means raining
                if (rain) {
                    printf("Take an umbrella!\n");
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c2_sub2",
                        title = "Else Statement",
                        description = "Learn how to use the else statement to handle the opposite condition.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The else statement specifies an alternative block of code to run if the condition in the if statement evaluates to false. It ensures the program handles scenarios where the initial condition isn't met.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Syntax:")),
                            ContentBlock.Code(
                                """
                if (condition) {
                    // code if condition is true
                } else {
                    // code if condition is false
                }
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Code(
                                """
                bool hasFood = false;
                if (hasFood) {
                    printf("Eat leftovers.\n");
                } else {
                    printf("Order pizza.\n");
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c2_sub3",
                        title = "Else If Statement",
                        description = "Learn how to handle multiple conditions with else if statements.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The else if statement allows checking additional conditions when the previous if condition is false, enabling multiple decision branches within a program.",
                                    listOf("Else if")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Syntax:")),
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
                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Code(
                                """
                char weather = 'C'; // C for cold, R for rain, S for sunny
                if (weather == 'S') {
                    printf("Wear sunglasses.\n");
                } else if (weather == 'R') {
                    printf("Take an umbrella.\n");
                } else {
                    printf("Wear a jacket.\n");
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c2_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing condition to check if score is greater than 50.",
                                incompleteCode = """
                int score = 75;
                if (score ___ 50) {
                    printf("You passed the test!\n");
                }
                """.trimIndent(),
                                correctCode = ">",
                                userInput = null, // Placeholder for user's input
                                isCodeCorrect = false // Placeholder for checking correctness
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c2_sub5",
                        title = "Short Hand If...Else (Ternary Operator)",
                        description = "Learn how to use the ternary operator as a shorthand for if...else statements.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The ternary operator is a compact way to make decisions in code. It evaluates a condition and returns one value if true and another if false, all in a single line.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Syntax:")),
                            ContentBlock.Code(
                                """
                condition ? expression_if_true : expression_if_false;
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Code(
                                """
                int isSunny = 1; // 1 means sunny
                printf(isSunny ? "Go to the beach.\n" : "Stay home.\n");
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c2_sub6",
                        title = "Real-Life Examples",
                        description = "See how if, else, and else if statements are used in real-world scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Let’s see if, else, and else if in real action:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Example 1: Logging in.")),
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
                            ContentBlock.Text(createSimpleText("Example 2: Choosing the largest number.")),
                            ContentBlock.Code(
                                """
                int a = 5, b = 10, c = 3;
                if (a > b && a > c) {
                    printf("A is the largest.\n");
                } else if (b > c) {
                    printf("B is the largest.\n");
                } else {
                    printf("C is the largest.\n");
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c2_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = """
                What will the following code output?

                int temperature = 30;
                if (temperature > 25) {
                    printf("It’s warm outside.\n");
                }
            """.trimIndent(),
                                options = listOf(
                                    "It’s warm outside.",
                                    "It’s cold outside.",
                                    "No output.",
                                    "It’s freezing outside."
                                ),
                                correctAnswer = "It’s warm outside.",
                                userAnswer = null, // Placeholder for user input
                                isCorrect = false // Initial state
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 3
            Lesson(
                id = "intermediate_c3",
                title = "C If ... Else Nested",
                description = "Learn how to nest if...else statements to create more complex decision-making structures in C! 🧩",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c3_sub1",
                        title = "Introduction to Nested If...Else",
                        description = "Learn the basics of nesting if...else statements.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A nested if...else statement allows multiple layers of decision-making by placing one if...else block inside another, enabling more specific conditions to be handled.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
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
                        id = "intermediate_c3_sub2",
                        title = "Nesting Multiple If...Else",
                        description = "Learn how to nest multiple if...else statements within each other.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nesting multiple if...else statements allows for complex decision-making. Each decision is evaluated based on a prior condition, enabling logic flow where one condition depends on the outcome of another.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """
                int weather = 1; // 1 for sunny, 0 for rainy
                int mood = 1; // 1 for happy, 0 for grumpy

                if (weather == 1) {
                    if (mood == 1) {
                        printf("Go for a picnic!\n");
                    } else {
                        printf("Stay in and watch a movie.\n");
                    }
                } else {
                    if (mood == 1) {
                        printf("Go to the museum!\n");
                    } else {
                        printf("Order pizza and sleep.\n");
                    }
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c3_sub3",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "What should replace the blank (?) to check nested condition?",
                                options = listOf("else if", "if", "else", "switch"),
                                correctAnswer = "if",
                                incompleteCode = """
                if (weather == 1) {
                    ? (mood == 1) {
                        printf("Go for a picnic!\\n");
                    }
                } else {
                    printf("Order pizza and sleep.\\n");
                }
            """.trimIndent(),
                                userAnswer = null
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c3_sub4",
                        title = "Real-Life Example",
                        description = "See how nested if...else statements are used in practical scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine using nested if...else to decide whether to let someone into a VIP party.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                bool isVIP = true;
                bool isInvited = false;

                if (isInvited) {
                    if (isVIP) {
                        printf("Welcome to the VIP lounge!\n");
                    } else {
                        printf("Enjoy the main event!\n");
                    }
                } else {
                    printf("Sorry, this party is invite-only.\n");
                }
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here, the first check ensures the person is invited, and the second checks if they get VIP access.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c3_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the main purpose of using a nested if...else statement?",
                                options = listOf(
                                    "To handle multiple conditions within conditions.",
                                    "To iterate over a collection of elements.",
                                    "To check syntax errors in code.",
                                    "To perform repetitive tasks efficiently."
                                ),
                                correctAnswer = "To handle multiple conditions within conditions.",
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
                id = "intermediate_c4",
                title = "C Switch Statement",
                description = "Learn how to use the switch statement to simplify multiple conditional branches in C! 🔄",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c4_sub1",
                        title = "Introduction to Switch Statement",
                        description = "Understand the syntax and purpose of the switch statement.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A switch statement simplifies decision-making by evaluating an expression and matching it against multiple possible conditions, making it easier to choose the correct path based on predefined values.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """
                    switch (dayOfWeek) {
                        case 1:
                            // 'Pizza' for Monday
                            break;
                        case 2:
                            // 'Tacos' for Tuesday
                            break;
                        default:
                            // 'Whatever's in the fridge'
                    }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c4_sub2",
                        title = "Switch Case and Default",
                        description = "Learn how to use case and default in a switch statement.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The default case in a switch statement is used when no conditions match. It's a fallback option, ensuring that a value is always returned, similar to having a Surprise me! option if no specific choice is made.",
                                    listOf("default")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """
                    int day = 3;
                    switch (day) {
                        case 1:
                            printf("Pizza\n");
                        case 2:
                            printf("Tacos\n");
                        default:
                            printf("Surprise me!\n");
                    }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c4_sub3",
                        title = "Switch Case and Break",
                        description = "Learn why the break keyword is used in a switch statement to prevent fall-through.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The break keyword is used to exit a switch statement after a matching case is found, preventing the execution from falling through to subsequent cases.",
                                    listOf("break")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Without break:", listOf(""))),
                            ContentBlock.Code(
                                """
                    int option = 2;
                    switch (option) {
                        case 1:
                            printf("Burger\n");
                        case 2:
                            printf("Pizza\n");
                        case 3:
                            printf("Salad\n");
                        default:
                            printf("Invalid choice\n");
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Without the break keyword, all case blocks below the matching case will execute, which is known as fall-through. This may lead to unintended results.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("With break:", listOf(""))),
                            ContentBlock.Code(
                                """
                    int option = 2;
                    switch (option) {
                        case 1:
                            printf("Burger\n");
                            break;
                        case 2:
                            printf("Pizza\n");
                            break;
                        case 3:
                            printf("Salad\n");
                            break;
                        default:
                            printf("Invalid choice\n");
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The break ensures only the matching case executes and the switch exits immediately.",
                                    listOf("break")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c4_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing keyword to prevent fall-through in the switch statement:",
                                incompleteCode = """
        switch (option) {
            case 1:
                printf("Burger\\n");
                ___;
            default:
                printf("Invalid choice\\n");
        }
    """.trimIndent(),
                                correctCode = "break"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c4_sub5",
                        title = "Real-Life Example",
                        description = "See how the switch statement is used in practical applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Picture a menu with options. The switch statement helps you handle each choice. Pick a meal, any meal!",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int option = 2;
                    switch (option) {
                        case 1:
                            printf("Burger\n");
                            break;
                        case 2:
                            printf("Pizza\n");
                            break;
                        case 3:
                            printf("Salad\n");
                            break;
                        default:
                            printf("Invalid choice\n");
                    }
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The switch helps you easily handle menu choices without overcomplicating things.",
                                    listOf()
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c4_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is the best choice when you need to check multiple conditions based on a single variable?",
                                options = listOf(
                                    "Use if...else statements",
                                    "Use switch statements",
                                    "Use for loops",
                                    "Use while loops"
                                ),
                                correctAnswer = "Use switch statements"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 5
            Lesson(
                id = "intermediate_c5",
                title = "C Loops",
                description = "Master the while, do-while, and for loops to control repetitive tasks in C!",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c5_sub1",
                        title = "Introduction to Loops",
                        description = "Learn about the importance of loops and how they help to repeat tasks efficiently in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Loops allow you to execute a block of code repeatedly based on certain conditions, saving time and effort in programming.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Types of loops:", listOf(""))),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this lesson, we will explore three types of loops: while, do-while, and for, each with its unique use case.",
                                    listOf("while", "do-while", "for")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c5_sub2",
                        title = "While Loop",
                        description = "Learn how to use the while loop to repeat code as long as a condition is true.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A while loop continuously executes a block of code as long as a specified condition evaluates to true, controlling the flow of execution until the condition becomes false.",
                                    listOf("while")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """ 
                    while (pizzaIsHot) {
                        // eat the pizza
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c5_sub3",
                        title = "The Do/While Loop",
                        description = "Understand the do-while loop where the code runs at least once.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A do-while loop executes a block of code at least once and then continues to execute as long as a specified condition is true, ensuring the code runs before checking the condition.",
                                    listOf("do-while")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """ 
                    do {
                        // eat the pizza
                    } while (pizzaIsTasty);
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c5_sub4",
                        title = "The For Loop",
                        description = "Learn how the for loop provides a compact way to write loops with initialization, condition, and increment in a single line.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A for loop is a control flow statement used for iteration, where the initialization, condition check, and increment are defined to repeat a block of code a specific number of times.",
                                    listOf("for")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """ 
                    for (int lap = 0; lap < totalLaps; lap++) {
                        // run the lap
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c5_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing part of the code to make the loop run for a total of 10 laps in the race.",
                                incompleteCode = """ 
                    for (int lap = ___; lap < 10; lap++) {
                        printf("Running lap %d\\n", lap + 1);
                    }
                    """.trimIndent(),
                                correctCode = "0",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c5_sub6",
                        title = "Real-Life Examples",
                        description = "See practical applications of while, do-while, and for loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here are practical examples of while, do-while, and for loops in C, but in a more real-world scenario!",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of while loop: Let's eat pizza as long as it’s warm.",
                                    listOf("while")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
                    int pizzaTemperature = 100;
                    while (pizzaTemperature > 50) {
                        printf("Pizza is still hot! Eating...\\n");
                        pizzaTemperature -= 5; // pizza cools down
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of do-while loop: You’ll always have a first slice, even if it's cold!",
                                    listOf("do-while")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
                    int pizzaTemperature = 30;
                    do {
                        printf("Eating the pizza slice...\\n");
                        pizzaTemperature -= 5; // pizza cools down
                    } while (pizzaTemperature > 20);
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of for loop: You’re running a 5-lap race.",
                                    listOf("for")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
                    for (int lap = 0; lap < 5; lap++) {
                        printf("Running lap %d\\n", lap + 1);
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c5_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "In the following code, what is the purpose of 'pizzaTemperature -= 5' inside the loop?",
                                options = listOf(
                                    "To increase the temperature of the pizza.",
                                    "To cool down the pizza by reducing its temperature.",
                                    "To check if the temperature is greater than 50.",
                                    "To stop the loop when the temperature reaches 50."
                                ),
                                correctAnswer = "To cool down the pizza by reducing its temperature.",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 6
            Lesson(
                id = "intermediate_c6",
                title = "C Nested Loops",
                description = "Learn how to use nested loops in C for complex tasks and control flows! 🔄🔄",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c6_sub1",
                        title = "Nested For Loops",
                        description = "Learn how to use a for loop inside another for loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nested for loops involve an outer loop iterating through elements, and an inner loop iterating through a subset of elements, allowing for multi-level iteration over a collection or data structure.",
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """
for (int i = 0; i < tables; i++) {
    for (int j = 0; j < seats; j++) {
        // Perform action for seat at table
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c6_sub2",
                        title = "Nested While Loops",
                        description = "Learn how to use a while loop inside another while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nested while loops involve an outer loop controlling the higher-level iteration, and an inner loop performing repetitive tasks for each iteration of the outer loop, allowing for multi-level iteration and task execution.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """
while (level < maxLevel) {
    while (task < maxTasks) {
        // Perform action for task in level
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c6_sub3",
                        title = "For in While Loops",
                        description = "Learn how to nest a for loop inside a while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A while loop executes as long as a condition is true, whereas a for loop iterates a fixed number of times. The while loop is used for indefinite iteration, while the for loop is used for definite iteration, like incrementing a counter or iterating over a range.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf())),
                            ContentBlock.Code(
                                """
while (gameOn) {
    for (int i = 0; i < players; i++) {
        // Update score for player
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c6_sub4",
                        title = "While in For Loops",
                        description = "Learn how to nest a while loop inside a for loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A for loop iterates over a collection or range, while a while loop continues execution as long as a condition is true. The for loop handles predefined iterations, and the while loop manages ongoing conditions within each iteration.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf())),
                            ContentBlock.Code(
                                """
for (int i = 0; i < rooms; i++) {
    while (notClean) {
        // Clean the room
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c6_sub5",
                        title = "Nested Do-While Loops",
                        description = "Learn how to use a do-while loop inside another do-while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Do-while loops guarantee that a block of code runs at least once, as the condition is checked after the first iteration. It ensures the task executes before the condition is evaluated for further iterations.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf())),
                            ContentBlock.Code(
                                """
do {
    do {
        // Perform action
    } while (innerCondition);
} while (outerCondition);
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c6_sub6",
                        title = "Real-Life Examples",
                        description = "See practical examples of nested loops in action.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Practical applications of nested loops include:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Nested for loops: Serve dishes to every table at a banquet.",
                                    listOf("Nested for loops")
                                )
                            ),
                            ContentBlock.Code(
                                """
for (int i = 0; i < tables; i++) {
    for (int j = 0; j < dishes; j++) {
        // Serve dish to table
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Nested while loops: Park cars in a multi-floor garage.",
                                    listOf("Nested while loops")
                                )
                            ),
                            ContentBlock.Code(
                                """
int floor = 0;
while (floor < totalFloors) {
    int spot = 0;
    while (spot < spotsPerFloor) {
        // Park car in spot
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.For in while loop: Manage tasks for multiple projects.",
                                    listOf("For", "while loop")
                                )
                            ),
                            ContentBlock.Code(
                                """
int project = 0;
while (project < totalProjects) {
    for (int task = 0; task < tasksPerProject; task++) {
        // Complete task for project
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "4.While in for loop: Fill boxes with items until they're full.",
                                    listOf("While", "for loop")
                                )
                            ),
                            ContentBlock.Code(
                                """
for (int box = 0; box < totalBoxes; box++) {
    while (notFull) {
        // Add item to box
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "5.Nested do-while loops: Clean each table in a café.",
                                    listOf("Nested do-while loops")
                                )
                            ),
                            ContentBlock.Code(
                                """
int table = 0;
do {
    int chair = 0;
    do {
        // Clean chair
    } while (chair < chairsPerTable);
    table++;
} while (table < totalTables);
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c6_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why would you use nested loops in programming?",
                                options = listOf(
                                    "To handle multiple levels of iteration where each level performs a task within the other.",
                                    "To avoid the need for conditions in loops.",
                                    "To improve the performance of a single loop.",
                                    "To simplify the logic of a single loop."
                                ),
                                correctAnswer = "To handle multiple levels of iteration where each level performs a task within the other."
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    )

                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 7
            Lesson(
                id = "intermediate_c7",
                title = "C Break and Continue",
                description = "Master the break and continue statements to control loop flow in C! 🛑➡️",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c7_sub1",
                        title = "Basic Break Statement",
                        description = "Learn the simple use of the break statement in loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The break statement terminates the current loop or switch statement, similar to exiting a loop early when a certain condition is met, such as encountering a specific case.",
                                    listOf("break")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
while (isPartyOn) {
    if (bossStartsDancing) {
        break;  // Leave the party (exit loop) right away
    }
    enjoySnacks();
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub2",
                        title = "Basic Continue Statement",
                        description = "Understand the basic usage of continue to skip loop iterations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The continue statement skips the current iteration of a loop and moves to the next iteration, similar to skipping a step in a sequence when a condition is met.",
                                    listOf("continue")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
for (int dish = 0; dish < buffetSize; dish++) {
    if (dish == spicyCurry) {
        continue;  // Skip the spicy curry and go to the next dish
    }
    eat(dish);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub3",
                        title = "Break in Nested Loops",
                        description = "Learn how to use break in nested loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In nested loops, the break statement terminates the innermost loop, similar to exiting a loop when a specific condition is met, such as finding the target element.",
                                    listOf("break")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
for (int section = 0; section < 5; section++) {
    for (int spot = 0; spot < 10; spot++) {
        if (foundKey(section, spot)) {
            break;  // Stop searching this section
        }
    }
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct statement to exit the current loop and stop further iterations in a nested loop?",
                                incompleteCode = """
                for (int section = 0; section < 5; section++) {
                    for (int spot = 0; spot < 10; spot++) {
                        if (foundKey(section, spot)) {
                            ___;  // What statement should go here to exit the loop?
                        }
                    }
                }
            """.trimIndent(),
                                correctCode = "break", // The correct code to complete the missing part
                                userInput = null, // Placeholder for user input
                                isCodeCorrect = false // Initially set to false, can be updated based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub5",
                        title = "Continue in Nested Loops",
                        description = "See how to use continue in nested loops to skip iterations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In nested loops, the continue statement skips the current iteration of the innermost loop and proceeds to the next iteration, similar to skipping a condition and continuing the loop.",
                                    listOf("continue")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
for (int street = 0; street < 5; street++) {
    for (int house = 0; house < 10; house++) {
        if (isNoisyHouse(street, house)) {
            continue;  // Skip noisy house and move to next
        }
        collectCandy(house);
    }
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What statement should go inside the loop to skip the noisy house and continue to the next one?",
                                incompleteCode = """
                for (int street = 0; street < 5; street++) {
                    for (int house = 0; house < 10; house++) {
                        if (isNoisyHouse(street, house)) {
                            ___;  // What statement should go here to skip the noisy house?
                        }
                        collectCandy(house);
                    }
                }
            """.trimIndent(),
                                correctCode = "continue", // The correct code to complete the missing part
                                userInput = null, // Placeholder for user input
                                isCodeCorrect = false // Initially set to false, can be updated based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub7",
                        title = "Real-Life Examples",
                        description = "Check out practical examples of break and continue in loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you're in a zombie apocalypse. Use break to escape when you find a safe house and continue to skip areas full of zombies.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
while (true) {
    if (isSafeHouseFound()) {
        break;  // Escape to the safe house
    }
    moveToNextLocation();
}

for (int location = 0; location < 10; location++) {
    if (isZombieArea(location)) {
        continue;  // Skip zombie areas
    }
    loot(location);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the correct statement to exit the current loop and stop further iterations in a nested loop?",
                                options = listOf(
                                    "break",
                                    ";",
                                    "int",
                                    "0"
                                ),
                                correctAnswer = "break", // The correct answer option
                                userAnswer = null, // Placeholder for user input
                                isCorrect = false // Initially set to false, can be updated based on user input
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 8
            Lesson(
                id = "intermediate_c8",
                title = "C Arrays",
                description = "Master arrays in C for efficient data storage and access! 🗃️",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c8_sub1",
                        title = "Introduction to Arrays",
                        description = "Learn how arrays store similar data in sequence.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "An array is a data structure that stores multiple elements in a sequential order, and each element can be accessed using its index, which identifies its position in the array.",
                                    listOf("array")
                                )
                            ),
                            ContentBlock.Code("int sales[7];  // An array to track sales for 7 days.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub2",
                        title = "Array Declaration and Initialization",
                        description = "Learn how to create and fill arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In programming, you can declare an array by specifying its type and size without initializing its values, or you can initialize it by assigning values immediately. The array size is fixed once defined, but the values (elements) within can be modified.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int donuts[5] = {10, 20, 30, 40, 50};  // Declared and filled with numbers.
                int donuts[] = {10, 20};  // Size inferred: 2 boxes.
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub3",
                        title = "Accessing Array Elements",
                        description = "How to get or change array elements using their index.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In an array, elements are accessed using indices (0, 1, 2), which determine the position of each element in the data structure. The index allows direct retrieval or modification of the value stored at that position.",
                                    listOf("")
                                )

                            ),
                            ContentBlock.Code(
                                """
                int donuts[3] = {10, 20, 30};
                printf("%d", donuts[0]);  // Check Box 0: 10 donuts.
                donuts[1] = 25;  // Restock Box 1 with 25 donuts.
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct way to initialize an array with 5 elements?",
                                incompleteCode = "int donuts[___] = {10, 20, 30, 40, 50};  // Declared and filled with numbers.",
                                correctCode = "5"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub5",
                        title = "Array Size",
                        description = "Find out how many elements an array can hold.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The array size is determined by allocating a fixed amount of memory for a specific number of elements. By calculating the total memory available and dividing it by the memory required for each element, you can determine the array's capacity, just like calculating how many elements fit into a fixed memory space.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int boxes[6];
                int count = sizeof(boxes) / sizeof(boxes[0]);
                printf("Total boxes: %d", count);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub6",
                        title = "2D array",
                        description = "Organize data in rows and columns.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "An array of arrays (2D array) organizes data in a matrix-like structure. Rows represent one dimension (e.g., flavor), and columns represent another dimension (e.g., color). You can access a specific element by specifying its row and column indices, like 'array[1][0]!'",
                                    listOf("2D array")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int display[2][3] = {
                    {1, 2, 3},  // Chocolate donuts
                    {4, 5, 6}   // Vanilla donuts
                };
                printf("Donuts: %d", display[0][2]);  // Chocolate, column 2.
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub7",
                        title = "Array Operations",
                        description = "Sort or search elements in arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Sorting algorithms help organize data in a specific order, such as ascending or descending. Searching algorithms allow you to find specific elements in a sorted or unsorted data structure, like searching for a value in an array or list.",
                                )
                            ),
                            ContentBlock.Code(
                                """
                int donuts[5] = {5, 2, 4, 1, 3};
                // Bubble sort to organize boxes.
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4 - i; j++) {
                        if (donuts[j] > donuts[j + 1]) {
                            int temp = donuts[j];
                            donuts[j] = donuts[j + 1];
                            donuts[j + 1] = temp;
                        }
                    }
                }
                // Search for a box with 3 donuts.
                int target = 3;
                for (int i = 0; i < 5; i++) {
                    if (donuts[i] == target) printf("Found at index %d", i);
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "How do you access an element in a multidimensional array?",
                                incompleteCode = "int display[2][3] = {{1, 2, 3}, {4, 5, 6}};\nprintf(\"Donuts: %d\", display[___][2]);  // Access second row, third column",
                                correctCode = "0"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub9",
                        title = "Real-Life Example with Arrays",
                        description = "Track and analyze data using arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you’re tracking donut sales for a week. Each day, you record the total donuts sold. With an array, you can easily calculate the total or average sales for the week. It’s like being a donut shop data analyst!"
                                )
                            ),
                            ContentBlock.Code(
                                """
                float weeklySales[7] = {100.5, 110.2, 120.8, 130.1, 125.4, 115.6, 108.9};
                float total = 0;
                for (int i = 0; i < 7; i++) total += weeklySales[i];
                float avg = total / 7;
                printf("Average sales: %.2f", avg);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub9",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "How do you calculate the total number of elements in an array?",
                                options = listOf(
                                    "sizeof(array) / sizeof(array[0])",
                                    "array[0] * sizeof(array)",
                                    "sizeof(array)",
                                    "sizeof(array[0])"
                                ),
                                correctAnswer = "sizeof(array) / sizeof(array[0])"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            
            // lesson 9
            Lesson(
                id = "intermediate_c9",
                title = "C Strings",
                description = "Learn how to work with strings in C and perform string manipulations. 📝",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c9_sub1",
                        title = "Introduction to Strings in C",
                        description = "Understand the basics of strings in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A string in C is an array of characters, terminated by a null character (\\0). Strings in C are handled as arrays of characters with a special character (\\0) at the end. Example of a string:",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
    char name[] = "Hello";  // The string is "Hello" with an implicit null-terminator \0 at the end
    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c9_sub2",
                        title = "Declaring and Initializing Strings",
                        description = "Learn how to declare and initialize strings in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, a string is declared as a character array.",
                                    listOf("character array")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can initialize a string at the time of declaration:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[] = "John";  // Automatic null-termination
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Alternatively, you can declare an empty string and later assign a value:",
                                    listOf("")
                                )
                            ),
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
                        id = "intermediate_c9_sub3",
                        title = "Accessing String Elements",
                        description = "Learn how to access individual characters in a string.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To access individual characters of a string, use the array indexing method.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of accessing characters in a string:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[] = "Hello";
                    printf("%c", name[0]);  // Output: 'H'
                    printf("%c", name[4]);  // Output: 'o'
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Note that the first character is at index 0, and the last character is at length-1.",
                                    listOf("0", "length-1")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c9_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct declaration of a string in C?",
                                incompleteCode = """
            ___ name[5] = "Hello";  // Complete the code to declare a string "Hello"
        """.trimIndent(),
                                correctCode = "char"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c9_sub5",
                        title = "String Length and Size",
                        description = "Understand how to calculate the length of a string.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The length of a string can be calculated using the strlen function from string.h.",
                                    listOf("strlen", "string.h")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example to calculate the length of a string:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[] = "Hello";
                    int length = strlen(name);  // length = 5
                    printf("Length: %d", length);
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The sizeof operator returns the size of the array in bytes, including the null-terminator.",
                                    listOf("sizeof")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c9_sub6",
                        title = "Common String Functions",
                        description = "Explore commonly used functions for string manipulation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C provides several string functions, such as strlen(), strcpy(), strcat(), and strcmp().",
                                    listOf("strlen()", "strcpy()", "strcat()", "strcmp()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Some common functions are:",
                                    listOf("")
                                )
                            ),
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
                        id = "intermediate_c9_sub7",
                        title = "String Comparison",
                        description = "Learn how to compare strings.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The strcmp() function compares two strings lexicographically.",
                                    listOf("strcmp()")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = "intermediate_c9_sub8",
                        title = "String Copying and Concatenation",
                        description = "Learn how to copy and concatenate strings.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can be copied and concatenated using strcpy() and strcat().",
                                    listOf("strcpy()", "strcat()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of copying a string:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char src[] = "Hello";
                    char dest[10];
                    strcpy(dest, src);  // Copies "Hello" into dest
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of concatenating two strings:",
                                    listOf("")
                                )
                            ),
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
                        id = "intermediate_c9_sub9",
                        title = "String Input and Output",
                        description = "Understand how to handle input and output with strings.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can be input using scanf() and output using printf().",
                                    listOf("scanf()", "printf()")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = "intermediate_c9_sub10",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing parts of the following code to concatenate two strings and print them.",
                                incompleteCode = """
        char str1[] = "Hello, ";
        char str2[] = "world!";
        ___(str1, str2);  // Complete this line with the correct function to concatenate
        printf("%s", str1);  // Expected output: "Hello, world!"
    """.trimIndent(),
                                correctCode = "strcat",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c9_sub11",
                        title = "Real-Life Example with Strings",
                        description = "See how strings are used in real applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings are used in a wide variety of real-world applications, like user input, file reading, and string manipulation.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Prompting a user for input and greeting them:",
                                    listOf("")
                                )
                            ),
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
                    ),
                    LessonContent(
                        id = "intermediate_c9_sub12",
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which function is used to copy one string into another in C?",
                                options = listOf("strcpy", "strcat", "strcmp", "strlen"),
                                correctAnswer = "strcpy",
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
                id = "intermediate_c10",
                title = "Recap",
                description = "A brief recap of key programming concepts in C.",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c10_sub1",
                        title = "Introduction and Encouragement",
                        description = "Let's begin by revisiting some essential concepts in C programming. These foundations will help you grow your coding skills and tackle more complex problems.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Keep practicing and pushing forward. Each challenge you overcome brings you closer to mastering C programming. As you progress, these concepts will become more intuitive, and the complexity will feel less daunting. Keep embracing the challenges ahead—you’re capable of mastering them.",
                                    listOf("practice", "growth")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c10_sub2",
                        title = "Loops (For, While, Do-While)",
                        description = "Loops are essential for repeating tasks. The for, while, and do-while loops help execute code multiple times, making them crucial for handling repetitive tasks efficiently.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Loops let you repeat actions based on conditions. Mastering loops will make you more efficient in solving problems and help streamline your code. They’re used in nearly every program you write and are key to managing repetitive tasks effectively.",
                                    listOf("for", "while", "do-while")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c10_sub3",
                        title = "Arrays",
                        description = "Arrays are essential for storing multiple values of the same type. They’re crucial for managing large datasets and implementing efficient algorithms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays store multiple elements of the same type in consecutive memory locations. Understanding arrays allows you to handle large data more efficiently and supports building more complex algorithms.",
                                    listOf("arrays")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c10_sub4",
                        title = "Keep Going! Your Next Challenge Awaits",
                        description = "You’ve made excellent progress so far. Completing the sections on loops and arrays has built a strong foundation for you. These core concepts will support more advanced topics ahead. Keep practicing, and the clarity will come. Remember, learning programming is a journey, not a sprint. Stay focused, keep pushing forward, and the next challenge is yours to conquer!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Your foundation is solid. The next challenge is just ahead—keep the momentum going! With each step, you’ll improve and grow as a programmer. Trust the process and continue making progress.",
                                    listOf("momentum", "next challenge")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            Lesson(
                id = "intermediate_c11",
                title = "Quiz",
                description = "Test your knowledge of the topics covered in this stage! 🧠💻",
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c11_sub1",
                        title = "Quiz: Loops and Arrays",
                        description = "Answer questions about loops and arrays in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which loop guarantees that the loop body will execute at least once?",
                                options = listOf("for", "while", "do-while", "switch"),
                                correctAnswer = "do-while"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "intermediate_c11_sub2",
                        title = "Quiz: If-Else and Nested Statements",
                        description = "Test your knowledge of if-else and nested conditional statements.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is the correct syntax for an if-else statement in C?",
                                options = listOf(
                                    "if (condition) { // code } else { // code }",
                                    "if condition { // code } else { // code }",
                                    "if (condition) then { // code } else { // code }",
                                    "if condition: { // code } else { // code }"
                                ),
                                correctAnswer = "if (condition) { // code } else { // code }"
                            ),

                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "intermediate_c11_sub3",
                        title = "Quiz: Strings and Arrays",
                        description = "Answer questions about strings and arrays in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "How do you declare a string in C?",
                                options = listOf(
                                    "char string[];",
                                    "char string[10];",
                                    "string char[10];",
                                    "string[] char;"
                                ),
                                correctAnswer = "char string[10];"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "intermediate_c11_sub4",
                        title = "Quiz: Break and Continue",
                        description = "Test your understanding of break and continue in loops.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What does the 'break' statement do in a loop?",
                                options = listOf(
                                    "Exits the loop",
                                    "Continues the loop",
                                    "Does nothing",
                                    "Ends the program"
                                ),
                                correctAnswer = "Exits the loop"
                            ),


                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "intermediate_c11_sub5",
                        title = "Quiz: Input Handling",
                        description = "Quiz on handling user input in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which function is used to take user input in C?",
                                options = listOf(
                                    "scanf()",
                                    "printf()",
                                    "gets()",
                                    "input()"
                                ),
                                correctAnswer = "scanf()"
                            ),

                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = "intermediate_c11_sub6",
                        title = "Stage Completed",
                        description = "You’ve completed this stage, now prepare for the next one!",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Great job completing this stage! Keep practicing and move on to the next stage to further improve your C programming skills. 🚀"))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            )
            ,
            
            // continue to add here


        )
    )
}