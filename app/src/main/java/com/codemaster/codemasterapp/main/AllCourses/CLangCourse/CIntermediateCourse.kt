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
                title = "C If ... Else",
                description = "Learn how to use if, else, and else if statements in C to control program flow and make decisions! 💡",
                subLessons = listOf(
                    Lesson(
                        id = "intermediate_c1_sub1",
                        title = "If Statements",
                        description = "Learn how to use if statements to make decisions.",
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
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c1_sub5",
                        title = "Short Hand If...Else (Ternary Operator)",
                        description = "Learn how to use the ternary operator as a shorthand for `if...else` statements.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c1_sub6",
                        title = "Real-Life Examples",
                        description = "See how `if`, `else`, and `else if` statements are used in real-world scenarios.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c1_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c1_sub1",
                        title = "If Statements",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The if statement helps you make decisions, like deciding whether to take an umbrella if it’s raining. ☔",
                                    listOf("if")
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
                        id = "intermediate_c1_sub2",
                        title = "Else Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The else statement handles the 'what if not?' Like deciding to order pizza if there’s no leftover food. 🍕",
                                    listOf("else")
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
                        id = "intermediate_c1_sub3",
                        title = "Else If Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Else if handles multiple choices, like figuring out what to wear based on the weather. 🌞🌧️❄️",
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
                        id = "intermediate_c1_sub4",
                        title = "Quiz",
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
                        id = "intermediate_c1_sub5",
                        title = "Short Hand If...Else (Ternary Operator)",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The ternary operator is a quick decision-maker, like flipping a coin for heads or tails. 🪙",
                                    listOf("ternary operator")
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
                        id = "intermediate_c1_sub6",
                        title = "Real-Life Examples",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Let’s see if, else, and else if in real action:",
                                    listOf("if", "else", "else if")
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
                        id = "intermediate_c1_sub7",
                        title = "Quiz",
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
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c2_sub4",
                        title = "Real-Life Example",
                        description = "See how nested `if...else` statements are used in practical scenarios.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c2_sub5",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c2_sub1",
                        title = "Introduction to Nested If...Else",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A nested if...else statement is like deciding what to do if it’s raining and you forgot your umbrella. More decisions within decisions!",
                                    listOf("if...else")
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
                        id = "intermediate_c2_sub2",
                        title = "Nesting Multiple If...Else",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nesting multiple if...else is like figuring out your evening plans based on weather, mood, and money.",
                                    listOf("if...else")
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
                        id = "intermediate_c2_sub3",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveCodeBlock(
                                question = "What should replace the blank (____) to check nested condition?",
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
                        id = "intermediate_c2_sub4",
                        title = "Real-Life Example",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine using nested if...else to decide whether to let someone into a VIP party.",
                                    listOf("if...else")
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
                        id = "intermediate_c2_sub5",
                        title = "Quiz",
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
            // lesson 3
            Lesson(
                id = "intermediate_c3",
                title = "C Switch Statement",
                description = "Learn how to use the switch statement to simplify multiple conditional branches in C! 🔄",
                subLessons = listOf(
                    Lesson(
                        id = "intermediate_c3_sub1",
                        title = "Introduction to Switch Statement",
                        description = "Understand the syntax and purpose of the switch statement.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c3_sub2",
                        title = "Switch Case and Default",
                        description = "Learn how to use case and default in a switch statement.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c3_sub3",
                        title = "Switch Case and Break",
                        description = "Learn why the break keyword is used in a switch statement to prevent fall-through.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c3_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c3_sub5",
                        title = "Real-Life Example",
                        description = "See how the switch statement is used in practical applications.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c3_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    ),
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c3_sub1",
                        title = "Introduction to Switch Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you're deciding what to eat based on the day of the week. A switch statement helps you pick the right meal quickly based on conditions.",
                                    listOf("switch")
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
                        id = "intermediate_c3_sub2",
                        title = "Switch Case and Default",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Just like choosing food, if no match is found, you can have a default option, like 'Surprise me!'",
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
                        id = "intermediate_c3_sub3",
                        title = "Switch Case and Break",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The break keyword is essential to prevent the switch statement from continuing into the next case when a match is found.",
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
                                    "Without the break keyword, all case blocks below the matching case will execute, which is known as 'fall-through'. This may lead to unintended results.",
                                    listOf("break", "fall-through")
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
                        id = "intermediate_c3_sub4",
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing keyword to prevent 'fall-through' in the switch statement:",
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
                        id = "intermediate_c3_sub5",
                        title = "Real-Life Example",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Picture a menu with options. The switch statement helps you handle each choice. Pick a meal, any meal!",
                                    listOf("switch")
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
                                    listOf("switch")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c3_sub6",
                        title = "Quiz",
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
            // lesson 4
            Lesson(
                id = "intermediate_c4",
                title = "C Loops",
                description = "Master the while, do-while, and for loops to control repetitive tasks in C! 🔄",
                subLessons = listOf(
                    Lesson(
                        id = "intermediate_c4_sub1",
                        title = "While Loop",
                        description = "Learn how to use the while loop to repeat code as long as a condition is true.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c4_sub2",
                        title = "The Do/While Loop",
                        description = "Understand the do-while loop where the code runs at least once.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c4_sub3",
                        title = "The For Loop",
                        description = "Learn how the for loop provides a compact way to write loops with initialization, condition, and increment in a single line.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c4_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c4_sub5",
                        title = "Real-Life Examples",
                        description = "See practical applications of while, do-while, and for loops.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c4_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c4_sub1",
                        title = "While Loop",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you're trying to eat pizza, but you can only eat it while it's hot. A while loop lets you eat as long as the pizza is warm. Once it cools down, the loop stops!",
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
                        id = "intermediate_c4_sub2",
                        title = "The Do/While Loop",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Now, imagine you’re deciding if you want a second slice of pizza. Even if the pizza is cold, you decide to eat it at least once, then check if it’s still good enough for another bite. That's a do-while loop!",
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
                        id = "intermediate_c4_sub3",
                        title = "The For Loop",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you’re running a race. You know exactly how many laps you have to complete. A for loop is like setting up the race with a clear start, check for completion, and increment for each lap.",
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
                        id = "intermediate_c4_sub4",
                        title = "Quiz",
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
                        id = "intermediate_c4_sub5",
                        title = "Real-Life Examples",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here are practical examples of while, do-while, and for loops in C, but in a more real-world scenario!",
                                    listOf("while", "do-while", "for")
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
                        id = "intermediate_c4_sub6",
                        title = "Quiz",
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
            // lesson 5
            Lesson(
                id = "intermediate_c5",
                title = "C Nested Loops",
                description = "Learn how to use nested loops in C for complex tasks and control flows! 🔄🔄",
                subLessons = listOf(
                    Lesson(
                        id = "intermediate_c5_sub1",
                        title = "Nested For Loops",
                        description = "Learn how to use a for loop inside another for loop.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c5_sub2",
                        title = "Nested While Loops",
                        description = "Learn how to use a while loop inside another while loop.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c5_sub3",
                        title = "For in While Loops",
                        description = "Learn how to nest a for loop inside a while loop.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c5_sub4",
                        title = "While in For Loops",
                        description = "Learn how to nest a while loop inside a for loop.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c5_sub5",
                        title = "Nested Do-While Loops",
                        description = "Learn how to use a do-while loop inside another do-while loop.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c5_sub6",
                        title = "Real-Life Examples",
                        description = "See practical examples of nested loops in action.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c5_sub7",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c5_sub1",
                        title = "Nested For Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nested for loops are like checking every seat at multiple tables in a restaurant. The outer loop manages the tables, and the inner loop checks each seat.",
                                    listOf("Nested for loops")
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
                        id = "intermediate_c5_sub2",
                        title = "Nested While Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nested while loops are like managing a game with multiple levels. The outer loop ensures you're on the right level, and the inner loop completes the tasks within that level.",
                                    listOf("Nested while loops")
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
                        id = "intermediate_c5_sub3",
                        title = "For in While Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A while loop can manage ongoing conditions, while a for loop handles fixed tasks inside it. For example, a while loop keeps a game running, and a for loop updates players scores each round.",
                                    listOf("for loop", "while loop")
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
                        id = "intermediate_c5_sub4",
                        title = "While in For Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A for loop iterates through items, and a while loop handles tasks within each item. For example, a for loop can go through different rooms, and a while loop cleans each room until it's spotless.",
                                    listOf("while loop", "for loop")
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
                        id = "intermediate_c5_sub5",
                        title = "Nested Do-While Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Do-while loops ensure tasks happen at least once. For example, you check every coffee cup in a machine and refill them as needed.",
                                    listOf("Do-while loops")
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
                        id = "intermediate_c5_sub6",
                        title = "Real-Life Examples",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Practical applications of nested loops include:", listOf(""))),
                            ContentBlock.Text(createAnnotatedText("1.Nested for loops: Serve dishes to every table at a banquet.", listOf("Nested for loops",))),
                            ContentBlock.Code(
                                """
for (int i = 0; i < tables; i++) {
    for (int j = 0; j < dishes; j++) {
        // Serve dish to table
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(createAnnotatedText("2.Nested while loops: Park cars in a multi-floor garage.", listOf("Nested while loops"))),
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
                            ContentBlock.Text(createAnnotatedText("3.For in while loop: Manage tasks for multiple projects.", listOf("For","while loop"))),
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
                            ContentBlock.Text(createAnnotatedText("4.While in for loop: Fill boxes with items until they're full.", listOf("While","for loop"))),
                            ContentBlock.Code(
                                """
for (int box = 0; box < totalBoxes; box++) {
    while (notFull) {
        // Add item to box
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(createAnnotatedText("5.Nested do-while loops: Clean each table in a café.", listOf("Nested do-while loops"))),
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
                        id = "intermediate_c5_sub7",
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which loop combination can be used to clean rooms in a hotel?",
                                options = listOf(
                                    "while in for loop",
                                    "for in while loop",
                                    "nested for loop",
                                    "nested do-while loop"
                                ),
                                correctAnswer = "while in for loop"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            // lesson 6
            Lesson(
                id = "intermediate_c6",
                title = "C Break and Continue",
                description = "Master the break and continue statements to control loop flow in C! 🛑➡️",
                subLessons = listOf(
                    Lesson(
                        id = "intermediate_c6_sub1",
                        title = "Basic Break Statement",
                        description = "Learn the simple use of the break statement in loops.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub2",
                        title = "Basic Continue Statement",
                        description = "Understand the basic usage of continue to skip loop iterations.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub3",
                        title = "Break in Nested Loops",
                        description = "Learn how to use break in nested loops.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub4",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub5",
                        title = "Continue in Nested Loops",
                        description = "See how to use continue in nested loops to skip iterations.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub6",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub7",
                        title = "Real-Life Examples",
                        description = "Check out practical examples of break and continue in loops.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "intermediate_c6_sub8",
                        title = "Quiz",
                        description = "Quiz",
                        status = LessonStatus.LOCKED
                    ),
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "intermediate_c6_sub1",
                        title = "Basic Break Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The break statement is like leaving a party early. If something happens (like your boss dancing), you can leave right away.",
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
                        id = "intermediate_c6_sub2",
                        title = "Basic Continue Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The continue statement is like skipping a dish at a buffet. If you don’t like a dish, you move on to the next one.",
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
                        id = "intermediate_c6_sub3",
                        title = "Break in Nested Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In nested loops, break is like stopping your search when you find your car key in one part of the parking lot.",
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
                        id = "intermediate_c6_sub4",
                        title = "Quiz",
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
                        id = "intermediate_c6_sub5",
                        title = "Continue in Nested Loops",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In nested loops, continue is like skipping noisy houses during trick-or-treating.",
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
                        id = "intermediate_c6_sub6",
                        title = "Quiz",
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
                        id = "intermediate_c6_sub7",
                        title = "Real-Life Examples",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you're in a zombie apocalypse. Use break to escape when you find a safe house and continue to skip areas full of zombies.",
                                    listOf("break", "continue")
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
                        id = "intermediate_c6_sub8",
                        title = "Quiz",
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "An array is a collection of elements, all of the same type, stored in contiguous memory locations.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays allow you to store multiple values under a single variable name, indexed by integers.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, the elements in an array are of the same type, such as `int`, `char`, etc.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To declare an array, you need to specify the type and the size of the array.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays can be initialized at the time of declaration or after declaration.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of declaration and initialization:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int numbers[5] = {1, 2, 3, 4, 5};  // Initializes the array with values
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can also initialize an array without specifying the size:",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can access and modify elements of an array using the index, starting from 0.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of accessing array elements:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int numbers[5] = {1, 2, 3, 4, 5};
                    printf("%d", numbers[0]);  // Accesses the first element (output: 1)
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To modify an element in the array, assign a new value to it using its index:",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, the size of an array is fixed once it is declared. However, you can calculate the size of an array using `sizeof`.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To calculate the number of elements in an array:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int numbers[5] = {1, 2, 3, 4, 5};
                    int size = sizeof(numbers) / sizeof(numbers[0]);  // Size of the array
                    printf("Size: %d", size);  // Output: 5
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This gives the number of elements in the array. The `sizeof` operator returns the total size in bytes of the array.",
                                    listOf("")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub5",
                        title = "Multidimensional Arrays",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A multidimensional array is an array of arrays. The most common form is a 2D array.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Syntax for a 2D array:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    int matrix[3][3] = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Accessing elements of a 2D array:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    printf("%d", matrix[0][0]);  // Accesses the element at row 0, column 0 (output: 1)
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can also use loops to traverse through multidimensional arrays.",
                                    listOf("")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c7_sub6",
                        title = "Array Operations",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays can be used for various operations like searching, sorting, and modifying elements.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of sorting an array:",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of searching in an array (linear search):",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays are used in real-life applications such as storing temperatures, processing data, etc.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Store temperatures for a week in an array.",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A string in C is an array of characters, terminated by a null character (`'0'`).",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings in C are handled as arrays of characters with a special character (`'0'`) at the end.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of a string:",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, a string is declared as a character array.",
                                    listOf("")
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
                        id = "intermediate_c8_sub3",
                        title = "Accessing String Elements",
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
                                    "Note that the first character is at index 0, and the last character is at `length-1`.",
                                    listOf("")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub4",
                        title = "String Length and Size",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The length of a string can be calculated using the `strlen` function from `string.h`.",
                                    listOf("")
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
                                    "The `sizeof` operator returns the size of the array in bytes, including the null-terminator.",
                                    listOf("")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub5",
                        title = "String Special Characters",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can contain special characters, such as `\n` (new line), `\t` (tab), and `\'` (single quote).",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of a string with special characters:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char message[] = "Hello, world!\nWelcome to C programming.";
                    printf("%s", message);
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The `\n` inserts a new line when printed.",
                                    listOf("")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub6",
                        title = "Common String Functions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C provides several string functions, such as `strlen()`, `strcpy()`, `strcat()`, and `strcmp()`.",
                                    listOf("")
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
                        id = "intermediate_c8_sub7",
                        title = "String Comparison",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The `strcmp()` function compares two strings lexicographically.",
                                    listOf("")
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
                        id = "intermediate_c8_sub8",
                        title = "String Copying and Concatenation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can be copied and concatenated using `strcpy()` and `strcat()`.",
                                    listOf("")
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
                        id = "intermediate_c8_sub9",
                        title = "String Input and Output",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can be input using `scanf()` and output using `printf()`.",
                                    listOf("")
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
                        id = "intermediate_c8_sub10",
                        title = "Real-Life Example with Strings",
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "`scanf` is used to accept formatted input from the user.",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "`getchar` reads a single character entered by the user.",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "`fgets` allows reading a full line of input, including spaces.",
                                    listOf("")
                                )
                            ),
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "It's important to validate user input to ensure it's correct.",
                                    listOf("")
                                )
                            ),
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