package com.codemaster.codemasterapp.main.AllCourses.CppCourse

import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage


fun cppIntermediateCourse(): Stage {
    return Stage(
        id = "cpp_intermediate_stage",
        title = "Intermediate",
        lessons = listOf(

            // Lesson 1 : Welcome to the Intermediate Stage
            Lesson(
                id = "intermediate_cpp1",
                title = "Welcome to the Intermediate Stage",
                description = "Congrats on leveling up! Ready for some coding magic and fun challenges?",
                lessonContents = listOf(
                    // Sub-lesson 1: A Fun Start!
                    LessonContent(
                        id = "intermediate_cpp1_sub1",
                        title = "A Fun Start!",
                        description = "Let’s start with something fun before we dive in.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Welcome to the Intermediate stage! You’ve graduated from C++ newbie to C++ wizard in training. Celebrate by giving yourself a high five. Go ahead, we’ll wait! 🙌",
                                    styledText = listOf("C++ newbie", "C++ wizard ")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now that you’re feeling pumped, let’s see what new tricks we’ll be adding to your programming spellbook. 🧙‍♂️",
                                    styledText = listOf("programming spellbook")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Reflecting on the Journey So Far
                    LessonContent(
                        id = "intermediate_cpp1_sub2",
                        title = "Reflecting on Your Journey",
                        description = "Look at how far you’ve come!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember when you didn’t know what a switch-case was? Now, you’re a pro at making decisions (at least in code 😉).",
                                    styledText = listOf("switch-case")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You’ve mastered the basics, and now it’s time to unlock the next level: intermediate concepts like loops, arrays, and structures!",
                                    styledText = listOf("loops", "arrays", "structures")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: What to Expect in Intermediate
                    LessonContent(
                        id = "intermediate_cpp1_sub3",
                        title = "What’s Next?",
                        description = "Sneak peek into the exciting topics ahead.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "This stage will teach you advanced tools to write smarter, faster, and cooler programs. Think of it as upgrading from a bicycle to a sports car. 🚗💨"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Get ready for topics like arrays, functions, and structures. Yes, it sounds fancy, and yes, you’ll love it!",
                                    styledText = listOf(
                                        "arrays",
                                        "functions",
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Are You Ready for the Challenge?
                    LessonContent(
                        id = "intermediate_cpp1_sub4",
                        title = "Ready for the Challenge?",
                        description = "Time to level up your skills!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Intermediate lessons will push your limits, but don’t worry—it’s all about having fun while learning. Just like solving a puzzle. 🧩",
                                    styledText = listOf("Intermediate")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Coding isn’t just about learning new tricks. It’s about thinking creatively and solving problems in clever ways. Let’s do this!",
                                    styledText = listOf("thinking creatively")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: What’s Coming Up?
                    LessonContent(
                        id = "intermediate_cpp1_sub5",
                        title = "What’s Coming Up?",
                        description = "A preview of the adventure ahead.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Next up: loops , arrays , pointers and structures. These are like the Swiss Army knives of C++. Handy, versatile, and super cool!",
                                    styledText = listOf("knives of C++")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "We’ll also dive into functions and recursions, preparing you to build programs that are elegant and efficient. Let’s begin the adventure!",
                                    styledText = listOf("functions","recursions")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 2 : Loops in C++
            Lesson(
                id = "intermediate_cpp2",
                title = "Loops in C++",
                description = "Loops: Because sometimes, you just want to repeat yourself... smartly!",
                lessonContents = listOf(
                    // Sub-lesson 1: What is a Loop? (Let’s loop around)
                    LessonContent(
                        id = "intermediate_cpp2_sub1",
                        title = "What is a Loop?",
                        description = "Let’s break it down, no code needed yet!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Think of loops like a treadmill. You walk, and the treadmill keeps you moving. No need to say 'I’m walking!' every step. Loops do the repeating for you! 🏃‍♂️",
                                    styledText = listOf("repeating", "loops")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Loops repeat actions automatically. You tell them once, they take care of the rest! 🎉",
                                    styledText = listOf("repeat actions")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: The Purpose of Loops (Why loop, though?)
                    LessonContent(
                        id = "intermediate_cpp2_sub2",
                        title = "The Purpose of Loops",
                        description = "Why bother looping? Let's talk about it.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine copying and pasting the same thing 100 times. Exhausting, right? Loops spare you that pain by repeating tasks for you. 🧑‍💻",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Loops let you do things again and again, without you doing it again and again. Genius! 💡",
                                    styledText = listOf("again and again", "genius")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: How Loops Make Life Easier (No more copying and pasting!)
                    LessonContent(
                        id = "intermediate_cpp2_sub3",
                        title = "How Loops Make Life Easier",
                        description = "Loops: Your personal assistant.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Loops are like the best personal assistant. They handle the boring stuff for you, so you can focus on the fun parts. 🤖",
                                    styledText = listOf("Loops ")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Loops automate repetitive tasks, making life (and coding) so much easier!",
                                    styledText = listOf("automate")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Types of Loops (The loop family!)
                    LessonContent(
                        id = "intermediate_cpp2_sub4",
                        title = "Types of Loops",
                        description = "A loop for every occasion!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "There are three main loops: For loop, While loop, and Do-While loop. Each loop has its own special ability, like superheroes! 🦸‍♂️",
                                    styledText = listOf("For loop", "While loop", "Do-While loop")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For loops: are perfect when you know exactly how many times to repeat. It's like planning a road trip.",
                                    styledText = listOf("For loops:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "While loops: are more unpredictable. They keep going while a condition is true. It's like waiting for your friend to stop talking.",
                                    styledText = listOf("While loops:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Do-While loops: are always at least one step ahead. They run the task once before checking the condition. Like your dog who greets you, even if you're just walking in!",
                                    styledText = listOf("Do-While loops:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Which Loop to Use? (Loop decision-making!)
                    LessonContent(
                        id = "intermediate_cpp2_sub5",
                        title = "Which Loop to Use?",
                        description = "Let’s pick the right tool for the job.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If you know how many times to repeat, use a For loop. If you're not sure, While loops got your back. And if you want to be extra sure, go with Do-While. 💪",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The right loop depends on your needs. Think of it as choosing your weapon in a video game.",
                                    styledText = listOf("right loop", "weapon")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Bored Yet? (Spoiler: We’ll code it all soon!)
                    LessonContent(
                        id = "intermediate_cpp2_sub6",
                        title = "Bored Yet?",
                        description = "Don’t worry, we’ll make it exciting with code soon!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Feeling sleepy? Don’t worry, we’re just getting started. We’ll put all this theory into code, and things will get way more exciting! 💻⚡",
                                    styledText = listOf("Feeling sleepy?")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 3: For Loops in C++
            Lesson(
                id = "intermediate_cpp3",
                title = "Mastering For Loops in C++",
                description = "For Loops: Because repetition doesn't have to be painful!",
                lessonContents = listOf(

                    // Sub-lesson 1: What If You Had to Apologize 1000 Times?
                    LessonContent(
                        id = "intermediate_cpp3_sub1",
                        title = "What If You Had to Apologize 1000 Times?",
                        description = "Let’s get some humor in and see how loops save us from repetitive madness.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine your girlfriend is angry and asks you to say sorry 1000 times. Now, you’re not a robot, but you keep writing sorry again and again. What if I told you there’s a way (For loop) to do this in 'one line' without losing your mind?🙌",
                                    styledText = listOf("sorry", "For loops")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For loops are perfect for this! You tell them, 'Hey, say sorry 1000 times,' and they’ll handle the rest. You don’t need to repeat the same thing a thousand times manually! 🎉",
                                    styledText = listOf("1000 times", "say sorry")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Understanding For Loop Syntax
                    LessonContent(
                        id = "intermediate_cpp3_sub2",
                        title = "Understanding For Loop Syntax",
                        description = "Let’s dive into the syntax of a For loop!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A For loop is your personal helper for repetition. Here’s the basic syntax:",
                                    styledText = listOf("For loop")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                            for (int i = 0; i < 10; i++) {
                                                cout << "Sorry, I messed up! :(" << endl;
                                            }
                                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Breaking it down:",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "1. int i = 0: You set up your starting point, here it's '0'.\n" +
                                            "2. i < 10: This is the condition that keeps the loop running. As long as `i` is less than 10, it will keep going.\n" +
                                            "3. i++: This increases `i` by 1 after each loop.",
                                    styledText = listOf("int i = 0:", "i < 10:", "i++:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This loop will print 'Sorry, I messed up! :(' \n10 times. You can adjust the number to fit your needs. 🎯",
                                    styledText = listOf("10 times")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Running the Loop 🤖
                    LessonContent(
                        id = "intermediate_cpp3_sub3",
                        title = "Running the For Loop",
                        description = "Let’s see how the For loop works in action.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now let’s imagine you're writing code to apologize a thousand times. Here’s what it looks like in action:",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                            for (int i = 0; i < 1000; i++) {
                                                cout << "Sorry, I messed up! :(" << endl;
                                            }
                                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, the loop will print 'Sorry, I messed up! : ('1000 times. That’s what a loop does — it automates the repetition for you! 🎉",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Practical Use of For Loops (Not Just Apologies!) 💡
                    LessonContent(
                        id = "intermediate_cpp3_sub4",
                        title = "Practical Use of For Loops",
                        description = "You can use For loops for much more than just apologizing!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For loops are handy in many real-world coding situations. For example, if you wanted to print numbers 1 to 10, you could do this:",
                                    styledText = listOf("real-world coding situations")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                            for (int i = 1; i <= 10; i++) {
                                                cout << i << endl;
                                            }
                                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This will print the numbers from 1 to 10, one by one, on each line. Loops make tasks like this super easy and clean! 🌟",
                                    styledText = listOf("1 to 10")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Infinite Loops (Don’t Get Stuck!) ⚠️
                    LessonContent(
                        id = "intermediate_cpp3_sub5",
                        title = "Infinite Loops",
                        description = "Be careful, some loops can go on forever if you're not careful!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A For loop can become an infinite loop if the condition is always true. For example:",
                                    styledText = listOf("infinite loop")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                            for (int i = 0; i < 10; ) {
                                                cout << "Oops, I forgot condition!" << endl;
                                            }
                                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This loop will run forever because the condition 'i < 10' is always true. Be careful with your conditions!",
                                    styledText = listOf("run forever")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Optimizing Loops for Speed ⚡
                    LessonContent(
                        id = "intermediate_cpp3_sub6",
                        title = "Optimizing Loops for Speed",
                        description = "You can make your loops faster with a few tricks.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When working with large loops, it’s important to optimize them for speed. For example, you can reduce unnecessary operations inside the loop body. Take this example:",
                                    styledText = listOf("optimize")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                            // Bad: This does the same thing, but inefficiently.
                                            for (int i = 0; i < 1000000; i++) {
                                                cout << i * 2 << endl;
                                            }
                                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A better way to optimize the loop is by removing unnecessary operations inside the loop. Speed matters when working with large datasets! 🚀",
                                    styledText = listOf("better way")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: Looping Through Arrays 🌐
                    LessonContent(
                        id = "intermediate_cpp3_sub7",
                        title = "Looping Through Arrays",
                        description = "For loops are great for iterating over arrays!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For loops are amazing when you need to loop through arrays. Here’s how you can loop through an array and print each value:",
                                    styledText = listOf("loop through arrays")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                            int numbers[] = {1, 2, 3, 4, 5};
                                            for (int i = 0; i < 5; i++) {
                                                cout << numbers[i] << endl;
                                            }
                                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This loop will print each number in the array, from '1' to '5'. Arrays + loops = perfection! 🌟",
                                    styledText = listOf("1 to 5")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Worried about what is array? don't worry we will cover arrays in coming lessons.",
                                    styledText = listOf("array?")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 4 : While loops
            Lesson(
                id = "intermediate_cpp_while",
                title = "Mastering While Loops in C++",
                description = "While Loops: The ultimate tool for endless repetition, without losing your mind!",
                lessonContents = listOf(

                    // Sub-lesson 1: What is a While Loop?
                    LessonContent(
                        id = "intermediate_cpp_while_sub1",
                        title = "What is a While Loop?",
                        description = "Let’s introduce you to the While loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine you need to check a condition over and over again until it's false. That’s the job of a while loop. It repeats an action as long as a condition is true.",
                                    styledText = listOf("While loop", "condition")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, you want to print 'Learning C++' until you feel confident. A while loop does that for you.",
                                    styledText = listOf("Learning C++")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Basic Syntax of a While Loop
                    LessonContent(
                        id = "intermediate_cpp_while_sub2",
                        title = "Basic Syntax of a While Loop",
                        description = "Here’s how to write a while loop in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                int i = 0;
                                while (i < 5) {
                                    cout << "Learning C++" << endl;
                                    i++;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This loop will print 'Learning C++' 5 times. It's simple: as long as the condition (i < 5) is true, the code inside the loop will keep running.",
                                    styledText = listOf("5 times")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Simple Practice Challenge!
                    LessonContent(
                        id = "intermediate_cpp_while_sub_practice",
                        title = "Time to Get Your Hands Dirty!",
                        description = "Don’t just scroll! Try writing a while loop that counts down from 10 to 1. Go on, it’s fun!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This is where you start coding, not just reading! Don’t skip ahead. Write your own while loop and make it count down from 10!",
                                    styledText = listOf("count down", "while loop")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: The Infinite Loop Problem
                    LessonContent(
                        id = "intermediate_cpp_while_sub4",
                        title = "The Infinite Loop Problem",
                        description = "Watch out! A while loop can run forever if you don’t update the condition.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine you forget to update the value inside the loop. If the condition is always true, you end up with an infinite loop. Example:",
                                    styledText = listOf("infinite loop")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int i = 0;
                                while (i < 5) {
                                    cout << "Oops, I'm stuck!" << endl;
                                }
                               """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This will keep printing 'Oops, I'm stuck!' forever. Avoid this by updating the condition inside the loop.",
                                    styledText = listOf("forever")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Using While Loop for User Input
                    LessonContent(
                        id = "intermediate_cpp_while_sub5",
                        title = "Using While Loop for User Input",
                        description = "While loops can be used for continuous user input.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "What if you want to ask the user for input repeatedly until they enter a valid response? A while loop is perfect!",
                                    styledText = listOf("ask the user")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                string response;
                                while (response != "yes") {
                                    cout << "Do you want to continue? (yes/no): ";
                                    cin >> response;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This loop keeps asking for user input until they type 'yes'. Perfect for scenarios like confirming actions!",
                                    styledText = listOf("'yes'")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Using While Loop for Validation
                    LessonContent(
                        id = "intermediate_cpp_while_sub6",
                        title = "Using While Loop for Validation",
                        description = "Let’s validate some user input using while loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can use a while loop to make sure the user enters a valid age (for example, positive integers). Here's how:",
                                    styledText = listOf("valid input")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int age;
                                cout << "Enter your age: ";
                                cin >> age;
                                while (age <= 0) {
                                    cout << "Please enter a valid age (greater than 0): ";
                                    cin >> age;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This will keep asking the user for a valid age if they enter a non-positive value. This ensures your program gets usable data!",
                                    styledText = listOf("valid age")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: Exit Condition in While Loops
                    LessonContent(
                        id = "intermediate_cpp_while_sub7",
                        title = "Exit Condition in While Loops",
                        description = "While loops depend on a condition, and you can make that condition depend on multiple factors.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "What if the user enters 'quit' to exit? You can use a while loop for this too.",
                                    styledText = listOf("quit")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                string input;
                                while (input != "quit") {
                                    cout << "Type 'quit' to exit: ";
                                    cin >> input;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This loop keeps running until the user types 'quit'. It’s a simple exit condition that uses user input to stop the loop.",
                                    styledText = listOf("quit")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 5: Understanding Do-While Loops
            Lesson(
                id = "intermediate_cpp_do_while",
                title = "Mastering Do-While Loops in C++",
                description = "Do-While Loops: The loop that always runs at least once!",
                lessonContents = listOf(

                    // Sub-lesson 1: What Does a Do-While Loop Do?
                    LessonContent(
                        id = "intermediate_cpp_do_while_sub1",
                        title = "What Does a Do-While Loop Do?",
                        description = "Let’s dive into how do-while works and where it can be super useful.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A do-while loop is like that friend who always invites you out, even when you say you're too tired. It will always run at least once before checking if the condition is true.",
                                    styledText = listOf("do-while loop", "at least once")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "It's great for situations where you need to perform an action at least once, like asking a user for input or showing a prompt at the start.",
                                    styledText = listOf("prompt")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Funny Example of Do-While Loop
                    LessonContent(
                        id = "intermediate_cpp_do_while_sub2",
                        title = "Funny Example of Do-While Loop",
                        description = "Here's a fun way to understand how a do-while loop works.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine your mom asking, Did you eat your vegetables? You’ll say, 'No.' She says, 'Eat them!' That’s a do-while loop: You eat the veggies at least once before she checks again.",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                        string response;
                        do {
                            cout << "Did you eat your vegetables? (yes/no): ";
                            cin >> response;
                        } while (response != "yes");
                        cout << "Good job!" << endl;
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This code keeps asking, 'Did you eat your vegetables?' until you say 'yes'. Even if you say 'no' the first time, it asks you again. That's the do-while loop in action.",
                                    styledText = listOf("'yes'", "'no'")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Basic Syntax of a Do-While Loop
                    LessonContent(
                        id = "intermediate_cpp_do_while_sub3",
                        title = "Basic Syntax of a Do-While Loop",
                        description = "Let’s break down the syntax of a do-while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                        do {
                            // Code to be executed at least once
                        } while (condition);
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In a do-while loop, the code inside the loop runs once before the condition is checked. If the condition is still true, the loop repeats.",
                                    styledText = listOf("runs once")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Common Use Cases for Do-While Loops
                    LessonContent(
                        id = "intermediate_cpp_do_while_sub4",
                        title = "Common Use Cases for Do-While Loops",
                        description = "Where can you use a do-while loop?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You use do-while loops when you want to prompt the user for input at least once and continue prompting if the input is invalid.",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, asking a user to enter their age until they type a valid number. A do-while loop guarantees the user is asked at least once!",
                                    styledText = listOf("guarantees")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Do-While vs. While Loop (Quick Comparison)
                    LessonContent(
                        id = "intermediate_cpp_do_while_sub5",
                        title = "Do-While vs. While Loop",
                        description = "Let’s compare the do-while loop with a regular while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A do-while loop guarantees at least one run of the loop, whereas a while loop might not run at all if the condition is false initially.",
                                    styledText = listOf("at least one run")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If you need to perform an action at least once (like prompting for user input), the do-while loop is perfect!",
                                    styledText = listOf("perform an action")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Another Practical Example
                    LessonContent(
                        id = "intermediate_cpp_do_while_sub6",
                        title = "Another Practical Example",
                        description = "Here’s a practical use case for a do-while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Let’s say you want to continuously show a menu until the user chooses to exit. You can use a do-while loop to show the menu, and check for the exit condition afterward.",
                                    styledText = listOf("exit condition")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                        int choice;
                        do {
                            cout << "Menu: 1. Start 2. Exit";
                            cin >> choice;
                        } while (choice != 2);
                        cout << "Goodbye!" << endl;
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This keeps showing the menu until the user chooses Exit (option 2). The loop ensures the menu is shown at least once!",
                                    styledText = listOf("Exit")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Final Comparison: Do-While, While, and For Loops (2 Lines Each)
                    LessonContent(
                        id = "intermediate_cpp_loops_final_comparison",
                        title = "Do-While, While, and For Loops",
                        description = "Let’s summarize the differences in a quick comparison.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A while loop checks the condition first and might not run if the condition is false initially.",
                                    styledText = listOf("while loop")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A do-while loop runs at least once before checking the condition, making it great for initial prompts like asking for input.",
                                    styledText = listOf("do-while loop")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A for loop is ideal for repeating a task a specific number of times, such as iterating over a list or range of values.",
                                    styledText = listOf("for loop")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Additional Lesson 6: Practice Makes Perfect - Mastering Loops
            Lesson(
                id = "master_loops",
                title = "Practice Makes Perfect!",
                description = "You're ready to level up your loop game. Before you rush ahead, let’s make sure loops are your best friend!",
                lessonContents = listOf(
                    // Sub-lesson 1: Why Practice Loops?
                    LessonContent(
                        id = "why_practice_loops",
                        title = "Why Practice Loops?",
                        description = "Loops: the secret sauce of programming. Skip them, and you'll regret it. Master them, and you'll feel like a programming ninja!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Think of loops as your best programming buddy. Ignore them, and you’re basically asking for trouble later. Get them right, and you'll make any problem look like a walk in the park!",
                                    styledText = listOf("trouble later")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If you're breezing through basic code but struggling with more complex stuff, it's probably because loops haven't fully clicked. So, grab your practice hat, because loops are here to stay!",
                                    styledText = listOf("practice hat")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Keep It Going!
                    LessonContent(
                        id = "practice_while_you_can",
                        title = "Keep Looping!",
                        description = "Once you get into the loop groove, there's no turning back. The more you loop, the less you'll want to stop!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The trick? More loops, more confidence! You’ll loop so hard, you'll wish everything in life was as predictable as a for loop.",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Feel free to experiment. The more you loop, the easier it gets, and soon, you'll be thinking: 'Who needs a break? I just want to loop all day!'",
                                    styledText = listOf("experiment")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Don't Rush It!
                    LessonContent(
                        id = "no_rushing_loops",
                        title = "Take Your Time",
                        description = "Slow down! Loops need love too. The more you practice, the smoother they'll become, and you'll start looping like a pro.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Everyone wants to rush through learning loops, but guess what? The best loopers take their time. Mastery is a journey, not a race.",
                                    styledText = listOf("Mastery is a journey")

                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Don’t just use loops, feel them. Practice until you can loop in your sleep (but don’t actually sleep, that’s cheating)."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 7: Understanding Break and Continue in Loops
            Lesson(
                id = "intermediate_cpp_break_continue",
                title = "Break and Continue in Loops",
                description = "Learn how to control your loops effectively with 'break' and 'continue'!",
                lessonContents = listOf(

                    // Sub-lesson 1: Starting with Humor and Importance
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub1",
                        title = "Why Loops Need Break and Continue?",
                        description = "Let’s kick things off with some humor and dive into why loops need 'break' and 'continue'.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine you’re on a treasure hunt,\nYou stop searching when you find the treasure. That’s break!\n- You skip over the trash on the way. That’s continue!",
                                    styledText = listOf("break", "continue")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "break and continue are essential tools for controlling the flow of loops in C++. Without them, your loops may become uncontrollable!",
                                    styledText = listOf("break", "continue")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: What are Break and Continue?
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub2",
                        title = "What are Break and Continue?",
                        description = "Understand the basics of 'break' and 'continue'.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "break: Exits the loop entirely.\ncontinue: Skips the current iteration and moves to the next one.",
                                    styledText = listOf("break:", "continue:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Using Break in For Loops
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub3",
                        title = "Using Break in For Loops",
                        description = "Learn how to exit a for loop early using 'break'.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    for (int i = 1; i <= 10; i++) {
                                        if (i == 5) break;  // Exit the loop when i is 5
                                        cout << i << endl;  // Prints 1 to 4
                                    }
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this loop, break terminates the loop when the condition i == 5 is met, ending the loop early.",
                                    styledText = listOf("break")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Using Break in While Loops
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub4",
                        title = "Using Break in While Loops",
                        description = "Learn how to exit a while loop early using 'break'.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    int i = 1;
                                    while (i <= 10) {
                                        if (i == 6) break;  // Exit the loop when i is 6
                                        cout << i << endl;
                                        i++;
                                    }
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, break stops the while loop entirely when i equals 6.",
                                    styledText = listOf("break", "stops")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Using Continue in For Loops
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub5",
                        title = "Using Continue in For Loops",
                        description = "Learn how to skip specific iterations in a for loop using 'continue'.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    for (int i = 1; i <= 10; i++) {
                                        if (i % 2 == 0) continue;  // Skip even numbers
                                        cout << i << endl;  // Prints odd numbers
                                    }
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this loop, continue skips even numbers by jumping directly to the next iteration.",
                                    styledText = listOf("continue", "skips")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Using Continue in While Loops
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub6",
                        title = "Using Continue in While Loops",
                        description = "Learn how to skip iterations in a while loop using 'continue'.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    int i = 0;
                                    while (i < 10) {
                                        i++;
                                        if (i % 3 == 0) continue;  // Skip multiples of 3
                                        cout << i << endl;
                                    }
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, continue skips numbers that are multiples of 3.",
                                    styledText = listOf("continue")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: When to Use Break and Continue
                    LessonContent(
                        id = "intermediate_cpp_break_continue_sub7",
                        title = "When to Use Break and Continue",
                        description = "Learn best practices for using 'break' and 'continue' effectively.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "break is useful when you need to terminate a loop once a condition is met.",
                                    styledText = listOf("break")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "continue helps when you need to skip certain iterations without ending the loop.",
                                    styledText = listOf("continue")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Use these statements carefully to keep your code readable and logical.",
                                    styledText = listOf("logical")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 8: Arrays
            Lesson(
                id = "beginner_cpp_arrays",
                title = "Arrays in C++",
                description = "Master arrays and make your life easier by storing multiple items in one variable! 🎉",
                lessonContents = listOf(

                    // Sub-lesson 1: What are Arrays?
                    LessonContent(
                        id = "beginner_cpp_arrays_sub1",
                        title = "What are Arrays?",
                        description = "Let's start by understanding what arrays are and how they help you organize data like a boss!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "An array is a collection of elements, all of the same type, stored in consecutive memory locations. Think of it like a row of identical lockers, each holding one item, and you can access them using an index (starting from 0, of course).",
                                    styledText = listOf("array", "collection", "index")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Arrays help you avoid chaos by allowing you to store multiple items in one place. You can think of it as your personal storage system for similar items, all neatly lined up!",
                                    styledText = listOf("store", "chaos")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Why Are Arrays Important?
                    LessonContent(
                        id = "beginner_cpp_arrays_sub2",
                        title = "Why Are Arrays Important?",
                        description = "Why would you use arrays? Well, let's find out why arrays are the unsung heroes of programming!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Without arrays, you'd have to create hundreds of variables to hold similar items, like a crazy person. Arrays save your sanity and reduce the clutter.",
                                    styledText = listOf("variables", "sanity")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Arrays are widely used in sorting, searching, and organizing data. Without them, you'd be stuck in an infinite loop of managing individual variables. Yikes!",
                                    styledText = listOf("sorting", "searching", "organizing")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Declaring an Array
                    LessonContent(
                        id = "beginner_cpp_arrays_sub3",
                        title = "Declaring an Array",
                        description = "Let's get our hands dirty by declaring an array in C++. It's like saying, 'I need a bunch of stuff to store!'",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To declare an array in C++, you specify the data type (like int for integers), followed by the array's name (here, numbers). Then, you define the size of the array ([5] in this case) inside square brackets. Finally, you assign values to the array inside curly braces.",
                                    styledText = listOf("int", "numbers", "[5]", "curly braces")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                // way of declaring arrays

                                int numbers[5] = {1, 2, 3, 4, 5};
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can only store elements of the same type in an array, so in this case, only integers. Arrays don't mix and match types, like 'ints' with 'chars' or 'floats'. They play by the same rule: only one type per array!",
                                    styledText = listOf(
                                        "same type",
                                        "mix and match",
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Accessing Elements in an Array
                    LessonContent(
                        id = "beginner_cpp_arrays_sub4",
                        title = "Accessing Elements in an Array",
                        description = "Let's access some array elements. Spoiler: It involves an index (and not the magical kind).",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Arrays are zero-indexed, meaning the first element is at index 0. In this case, numbers[0] gives us the first element, which is 1.",
                                    styledText = listOf(
                                        "index 0"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int numbers[5] = {1, 2, 3, 4, 5};
                            int firstNumber = numbers[0];
                            cout << firstNumber;
                            """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code =
                                "Outputs: 1"
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Modifying Array Elements
                    LessonContent(
                        id = "beginner_cpp_arrays_sub5",
                        title = "Modifying Array Elements",
                        description = "What if you want to change an element? No problem! Here's how you do it.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To modify an element, just assign a new value to a specific index. For example, ' numbers[2] = 10; ' changes the third element to 10.",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int numbers[5] = {4, 8, 16 , 32 , 64};
                            numbers[2] = 10;
                            cout << numbers[2];
                            """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code =
                                "Output: 10"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here when we created array our 3rd element( 2nd index ) was 8 but we modified the index to add value ' 10 '! easy right?",
                                    styledText = listOf("")
                                )
                            ),
                        ),

                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Array Length and Iteration
                    LessonContent(
                        id = "beginner_cpp_arrays_sub6",
                        title = "Array Length and Iteration",
                        description = "Let's learn how to get the length of an array and loop through it. Arrays love loops!",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                            int length = sizeof(numbers) / sizeof(numbers[0]);
                            for (int i = 0; i < length; i++) {
                                cout << numbers[i] << " ";
                            }
                            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The 'sizeof' operator helps you determine the size of an array. Then, we loop through the array using 'for (int i = 0; i < length; i++)'.",
                                    styledText = listOf(
                                        "sizeof",
                                        "'for (int i = 0; i < length; i++)'"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: Common Array Operations
                    LessonContent(
                        id = "beginner_cpp_arrays_sub7",
                        title = "Common Array Operations",
                        description = "Let's talk about some useful array operations, like sorting and searching. It's like having an array Swiss Army knife.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, we can use algorithms like 'sort()' to sort an array and 'find()' to search for elements. It's like being a wizard with arrays.",
                                    styledText = listOf("'sort()'", "'find()'")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            sort(numbers, numbers + 5);
                            cout << numbers[0]; // Outputs: 1 (sorted array)
                            cout << (find(numbers, numbers + 5, 3) != numbers + 5); // Outputs: 1 (true)
                            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 9: Multi dimensional Arrays
            Lesson(
                id = "beginner_cpp_multidimensional_arrays",
                title = "Multi-dimensional Arrays",
                description = "Congratulations, you’ve mastered arrays! Now it’s time to level up.",
                lessonContents = listOf(

                    // Sub - lesson 1: Intro
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub1",
                        title = "Get Ready!",
                        description = "",
                        contentBlocks = listOf(

                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Bingoooooo! You just learned arrays! one of the core concepts of c++ programming language.",
                                    styledText = listOf("Bingoooooo!")

                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You thought one array was cool? Well, multi-dimensional arrays are like having cupboards inside cupboards –" +
                                            " a whole new level of organization!",
                                    styledText = listOf("multi-dimensional arrays")

                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: What Are Multi-dimensional Arrays?
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub2",
                        title = "What Are Multi-dimensional Arrays?",
                        description = "",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A multi-dimensional array is an array of arrays. Just like you store items in a box, you can store boxes inside a bigger box (or array) to create a multi-dimensional structure. It's like an array inception!",
                                    styledText = listOf(
                                        "inception"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, you declare a multi-dimensional array by specifying multiple sizes inside square brackets. For example, ' int arr[3][3] ' is a 2D array with 3 rows and 3 columns. Imagine a grid or a matrix!",
                                    styledText = listOf(
                                        "2D"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Declaring a 2D Array
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub3",
                        title = "Declaring a 2D Array",
                        description = "Let’s declare a 2D array. It’s like creating a grid where you can store numbers in rows and columns.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, ' grid ' is a 2D array. It has 2 rows and 3 columns. We assign values to the array by nesting arrays inside the main array. Each array inside corresponds to a row.",
                                    styledText = listOf("nesting arrays")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int grid[2][3] = {{1, 2, 3}, {4, 5, 6}};
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Feeling confused? No worries! Just keep practicing arrays, and soon you'll be the coolest person in town with an ' Array Master ' cap!",
                                    styledText = listOf("practicing")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Accessing Elements in a 2D Array
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub4",
                        title = "Accessing Elements in a 2D Array",
                        description = "How to access elements ina  2d array by index/",
                        contentBlocks = listOf(

                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now let’s open our cupboard and grab something! Let’s learn how to access elements inside our 2D array."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int grid[2][3] = {{1, 2, 3}, {4, 5, 6}};
                                cout << grid[0][1];  // Outputs: 2
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To access elements in a multi-dimensional array, you specify the row and the column index. Here, ' grid[0][1] ' gives us the element in the first row and second column. Remember, it’s zero-indexed!",
                                    styledText = listOf("zero-indexed")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Modifying Elements in a 2D Array
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub5",
                        title = "Modifying Elements in a 2D Array",
                        description = "Let's play around with the elements in our array. Imagine swapping stuff around in our cupboard. Let’s modify an element!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To modify an element, simply assign a new value to a specific position.\nHere, ' grid[1][2] = 10; ' changes the element in the second row, third column to 10.",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int grid[2][3] = {{1, 2, 3}, {4, 5, 6}};
                                grid[1][2] = 10;
                                cout << grid[1][2];  // Outputs: 10
                                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Iterating Through a 2D Array
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub6",
                        title = "Iterating Through a 2D Array",
                        description = "You’ve got a whole cupboard full of boxes. Now, let's go through each box and check out what's inside!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You’ve got a whole cupboard full of boxes. Now, let's go through each box and check out what's inside!",
                                    styledText = listOf("inside")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int grid[2][3] = {{1, 2, 3}, {4, 5, 6}};
                                for (int i = 0; i < 2; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        cout << grid[i][j] << " ";
                                    }
                                    cout << endl;
                                }
                                // Outputs:
                                // 1 2 3
                                // 4 5 10
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To loop through a 2D array, you need two loops: one for rows and one for columns. The outer loop goes through the rows, and the inner loop goes through the columns.",
                                    styledText = listOf("2D array")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: Multi-dimensional Arrays with More Dimensions
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub7",
                        title = "Multi-dimensional Arrays with More Dimensions",
                        description = "What if one cupboard just isn’t enough? What if you need a cupboard inside a cupboard inside a cupboard? Let's go deeper into multi-dimensional arrays!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can create arrays with more than two dimensions.\nFor example, ' int arr[2][3][4] ' is a 3D array, where the third dimension adds layers to the cupboard, like a shelf inside the cupboard!",
                                    styledText = listOf(
                                        "3D array",
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 8: Keep Practicing
                    LessonContent(
                        id = "beginner_cpp_multidimensional_arrays_sub8",
                        title = "Mastering Arrays: Practice Makes Perfect!",
                        description = "Arrays might seem confusing at first, but with practice, you'll get the hang of it!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "At first, arrays can feel like a confusing mess, but don’t worry. With practice, you’ll be handling arrays like a pro! Keep using loops, accessing elements, and soon it’ll feel like second nature.",
                                    styledText = listOf("arrays", "practice")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Think of arrays as a big cupboard. At first, it’s hard to know where everything is, but with practice, you’ll be the one who knows exactly where each item is stored. Stick with it!",
                                    styledText = listOf("practice")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You might feel like a mess at first, but trust me, after some practice, you’ll be the array expert everyone turns to. Keep going, and soon you’ll be the ' Array Master '!",
                                    styledText = listOf("mess" ,"Array Master")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )

                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 10: Structures in c++
            Lesson(
                id = "beginner_cpp_structures",
                title = "Structures in c++",
                description = "Level up your skills by creating your own data types with structures!",
                lessonContents = listOf(

                    // Sub-lesson 1: What are Structures?
                    LessonContent(
                        id = "beginner_cpp_structures_sub1",
                        title = "What are Structures?",
                        description = "Let’s dive into structures! They’re like blueprints for creating custom data types that group different variables together!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A structure in C++ is a way to group related variables of different types under a single name. Think of it like a family: each family member (variable) can have different characteristics (data types), but they all belong to the same family (structure).",
                                    styledText = listOf("structure","family")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, you can create a structure called 'Person' to store the name, age, and height of someone. It's like putting all their details in one family photo album!",
                                    styledText = listOf(
                                        "family photo album",
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Declaring and Using Structures
                    LessonContent(
                        id = "beginner_cpp_structures_sub2",
                        title = "Declaring and Using Structures",
                        description = "Ready to make your own custom data type? Let’s declare a structure and use it in C++!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To declare a structure, use the 'struct' keyword followed by the name of your structure (like 'Person'). Inside the curly braces, you define the variables that make up the structure (e.g., 'name', 'age', 'height').",
                                    styledText = listOf(
                                        "'struct'",
                                        "curly braces",
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                code = """
            #include <iostream>

            // Declaring a structure
            struct Person {
                string name;
                int age;
                float height;
            };
            // Main function
            int main() {
                return 0;
            }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the above code, we declared a structure 'Person', created a variable 'person1', and set its properties. Structures allow you to organize your data in a clean and structured way.",
                                    styledText = listOf(
                                        "structure",
                                        "organize"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Accessing and Modifying Structure Members
                    LessonContent(
                        id = "beginner_cpp_structures_sub3",
                        title = "Accessing and Modifying Structure Members",
                        description = "Let’s access and modify the members of our structures. It's like having the keys to each room in your data house!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To access a member of a structure, use the dot operator ('.') followed by the member name.\nFor example, person1.name gives you the 'name' of the person stored in 'person1'.",
                                    styledText = listOf("dot operator", "person1.name")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
            Person person1;
            person1.name = "John";
            person1.age = 30;
            person1.height = 5.9;

            // Accessing and modifying
            cout << person1.name; // John
            person1.age = 31;  // Modifying age
            cout << person1.age; // 31
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the code above, we accessed and modified the members of ' person1 ' using the dot operator. Easy, right? This way, you can handle your custom data like a pro!",
                                    styledText = listOf("custom data")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Structures in Action
                    LessonContent(
                        id = "beginner_cpp_structures_sub4",
                        title = "Structures in Action",
                        description = "Now let’s see structures in action with a fun example. Let's make a structure for a 'Book' and use it to store some information!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Let’s create a structure for a 'Book'. A book has a title, an author, and a price. With structures, we can group all these details together!",
                                    styledText = listOf("Book")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
            struct Book {
                string title;
                string author;
                float price;
            };
            // Main function
            int main() {
                Book book1;
                book1.title = "C++ Programming";
                book1.author = "John Doe";
                book1.price = 29.99;

                cout << "Book: " << book1.title << ", Author: " << book1.author << ", Price: $" << book1.price;
                return 0;
            }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here we declared a Book structure and created a book1 object. We then accessed and displayed its members. Cool, right? Now you have a personal library right in your code!",
                                    styledText = listOf("book1 object", "library")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Why Structures are Awesome
                    LessonContent(
                        id = "beginner_cpp_structures_sub5",
                        title = "Why Structures are Awesome",
                        description = "Why bother with structures? Because they help you organize your data better, reduce chaos, and make your code look neat and tidy!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Without structures, you'd be drowning in a sea of variables. Structures help you group related information together, making your code easier to understand and maintain. They're the unsung heroes of code organization!",
                                    styledText = listOf("group","maintain")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember, just like the family analogy, structures bring together different data types in one place. They’re your toolkit for organizing complex data in a manageable way!",
                                    styledText = listOf("toolkit", "complex data")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Transition to Functions
                    LessonContent(
                        id = "beginner_cpp_structures_sub6",
                        title = "A Fun Transition to Functions",
                        description = "We’ve learned how to structure our data like pros, but guess what? There’s more to come! Don’t worry, we’ll get into functions soon. I know, I know, you’re dying to know what those are. Stay tuned and keep the fun going!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You might be wondering, 'What are functions, and why are they so awesome?' Well, don’t worry, we’ll dive into that in the next lesson! But trust me, they’re like the Swiss Army knife of programming. Functions will make your life a whole lot easier! 😎",
                                    styledText = listOf("functions", "Swiss Army knife", "easier")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 11: Diving Deeper into Structures
            Lesson(
                id = "beginner_cpp_structures_advanced",
                title = "Level Up: Structures",
                description = "Structures just got even more exciting! Let’s dive into nested structures and additional features.",
                lessonContents = listOf(

                    // Sub-lesson 1: A Quick Recap
                    LessonContent(
                        id = "beginner_cpp_structures_advanced_sub1",
                        title = "Quick Recap: Structures",
                        description = "",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Structures are like blueprints that help you group related data together. You’ve already learned how to define and use them!",
                                    styledText = listOf("blueprints")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                struct Student {
                                    string name;
                                    int age;
                                };

                                int main() {
                                    Student s1 = {"Alice", 20, 85.5};
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember: a structure groups multiple data types into a single logical entity. Now, let’s take things to the next level!",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Nested Structures
                    LessonContent(
                        id = "beginner_cpp_structures_advanced_sub2",
                        title = "Nested Structures: A Structure Inside a Structure",
                        description = "",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Did you know you can put one structure inside another? It’s like having a nested cupboard – organization within organization!",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                struct Address {
                                    string city;
                                    string state;
                                    int zip;
                                };
                                struct Student {
                                    string name;
                                    int age;
                                    Address addr;
                                };

                                int main() {
                                    Student s1 = {"Alice", 20, {"Springfield", "IL", 62704}};
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, ' Address ' is a structure inside 'Student'. You can access nested fields like this: ' s1.addr.city '.",
                                    styledText = listOf("s1.addr.city")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Arrays of Structures
                    LessonContent(
                        id = "beginner_cpp_structures_advanced_sub3",
                        title = "Arrays of Structures",
                        description = "",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can also have arrays of structures to store multiple entities of the same type. It’s like having a class roster!"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                struct Student {
                                    string name;
                                    int age;
                                };

                                int main() {
                                    Student students[3] = {
                                        {"Alice", 20},
                                        {"Bob", 22},
                                        {"Charlie", 19}
                                    };

                                    cout << students[1].name; // Outputs: Bob
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Use an array to store multiple structures. Access specific elements with array indexing and dot notation."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Time to Practice and Prep for Enums!
                    LessonContent(
                        id = "beginner_cpp_structures_advanced_sub4",
                        title = "Practice Makes Perfect!",
                        description = "",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Alright, before we move on to enums (yes, they're coming soon!), make sure you've got a solid grip on structures. " +
                                            "Trust me, you’ll want to be a structure expert before we dive into the world of enums – they go hand-in-hand like ice cream and sprinkles. 🍦✨",
                                    styledText = listOf("enums")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "So, take a moment to practice those structures! You don’t want to be caught off guard when enums come knocking at your door. " +
                                            "Get comfortable, and when you're ready, we’ll jump into the next level! 😎",
                                    styledText = listOf("practice")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )


                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 12: Enums - The Power of Constant Values
            Lesson(
                id = "beginner_cpp_enums",
                title = "Enums in C++",
                description = "Enums help group related constants together, making your code cleaner and more readable.",
                lessonContents = listOf(

                    // Sub-lesson 1: What Are Enums?
                    LessonContent(
                        id = "beginner_cpp_enums_sub1",
                        title = "What Are Enums?",
                        description = "Learn what enums are and why they're useful!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Enums group related constants. Instead of using raw numbers, you can name things like ' Low ', ' Medium ', ' High ' for clarity. " +
                                            "They make your code easier to understand. 🏆",
                                    styledText = listOf("Enums","code easier")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Enums improve readability and help avoid errors by giving meaningful names to values. It's like organizing constants into categories! 📦",
                                    styledText = listOf("categories")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Why Use Enums?
                    LessonContent(
                        id = "beginner_cpp_enums_sub2",
                        title = "Why Use Enums?",
                        description = "Find out why enums are essential in your code!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Enums are useful for fixed sets of values, like game levels or days of the week. They replace vague numbers with meaningful names. 🎮",
                                    styledText = listOf("meaningful names")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "With enums, your code becomes clearer, less error-prone, and more maintainable."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Declaring Enums
                    LessonContent(
                        id = "beginner_cpp_enums_sub3",
                        title = "How to Declare an Enum",
                        description = "Let’s declare our first enum!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Declaring an enum is simple. Just use the enum keyword and list your constants:",
                                    styledText = listOf("enum keyword")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                enum Level {
                                    LOW,
                                    MEDIUM,
                                    HIGH
                                };

                                int main() {
                                    enum Level myVar = MEDIUM;
                                    cout << myVar;  // Outputs: 1 (representing MEDIUM)
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, ' Level ' is the enum, and we assigned ' MEDIUM ' to 'myVar'. By default, ' MEDIUM ' gets the value 1.",
                                    styledText = listOf("Level")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Using Enums
                    LessonContent(
                        id = "beginner_cpp_enums_sub4",
                        title = "Using Enums in Your Code",
                        description = "Let’s use enums in your code!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Using enums is simple. Just reference the value you want to use:"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                enum Level {
                                    LOW = 10,
                                    MEDIUM = 20,
                                    HIGH = 30
                                };

                                int main() {
                                    enum Level myVar = HIGH;
                                    cout << myVar;  // Outputs: 30
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, 'HIGH' is assigned a custom value of 30. Now ' myVar ' outputs 30."

                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Enums in Switch Statements
                    LessonContent(
                        id = "beginner_cpp_enums_sub5",
                        title = "Using Enums in a Switch Statement",
                        description = "Switch statements and enums go hand in hand. Let’s see why!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Enums are great in switch statements! They help decide what to do based on the value of the enum. Here’s an example:"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                enum Level {
                                    LOW = 1,
                                    MEDIUM,
                                    HIGH
                                };

                                int main() {
                                    enum Level myVar = MEDIUM;

                                    switch (myVar) {
                                        case 1:
                                            cout << "Low Level";
                                            break;
                                        case 2:
                                            cout << "Medium level";
                                            break;
                                        case 3:
                                            cout << "High level";
                                            break;
                                    }
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, 'myVar' is set to 'MEDIUM' (2), so the program prints 'Medium level'."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Practice Time!
                    LessonContent(
                        id = "beginner_cpp_enums_sub6",
                        title = "Practice Makes Perfect with Enums!",
                        description = "Your turn to practice and become an enum pro!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now it’s your turn! Try declaring enums, using them in switch statements, and assigning custom values. The more you practice, the more you'll love enums!",
                                    styledText = listOf("The more you practice")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember, enums make your code cleaner and easier to maintain. Keep practicing! 🏆",
                                    styledText = listOf("Keep practicing")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 13: Reference in C++
            Lesson(
                id = "beginner_cpp_references",
                title = "Understanding C++ References",
                description = "References are like giving a variable a nickname. Let’s see how they work!",
                lessonContents = listOf(

                    // Sub-lesson 1: What Are References?
                    LessonContent(
                        id = "beginner_cpp_references_sub1",
                        title = "What Are References?",
                        description = "Think of references as giving your variable a cool alias!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Imagine your friend's name is Bob. Instead of calling him 'Bob' all the time, you just say ' Bob's house ' and everyone knows who you mean. In C++, references work the same way. A reference is like an alias to your original variable!",
                                    styledText = listOf("references")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Why References Matter
                    LessonContent(
                        id = "beginner_cpp_references_sub2",
                        title = "Why References Matter",
                        description = "References make your code cleaner, faster, and more efficient!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The magic behind references is that they let you work with the original data without making unnecessary copies. It’s like having a shortcut to your data. No extra baggage!",
                                    styledText = listOf("shortcut")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: How to Create References
                    LessonContent(
                        id = "beginner_cpp_references_sub3",
                        title = "How to Create References",
                        description = "Creating references is easy! You just need to use the '&' symbol.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To create a reference, just add an ' & ' before your variable name. Think of it like giving your variable a cool new nickname. Here's how you do it!",
                                    styledText = listOf("&")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    int main() {
                                        string food = "Pizza";
                                        string &meal = food;
                                        cout << food << "\n"; //Outputs: Pizza
                                        cout << meal << "\n"; //Outputs: Pizza
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this code, ' meal ' is now a reference to 'food'. They both point to the same ' Pizza '. No matter which one you use, you're still talking about the same thing!",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Changing Data Through References
                    LessonContent(
                        id = "beginner_cpp_references_sub4",
                        title = "Changing Data Through References",
                        description = "When you change the reference, the original variable changes too!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The cool thing about references is that if you change the data through the reference, it also changes the original variable. They’re connected! So if you update one, the other will change too.",
                                    styledText = listOf("connected!")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    int main() {
                                        string food = "Pizza";
                                        string &meal = food;

                                        meal = "Burger";
                                        cout <<food<<endl; //Output:Burger
                                        cout <<meal<<endl; //Output:Burger
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, when we change 'meal' to 'Burger', 'food' also becomes 'Burger'! Because 'meal' is just another name for 'food'."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: What is a Memory Address?
                    LessonContent(
                        id = "beginner_cpp_references_sub5",
                        title = "What is a Memory Address?",
                        description = "Memory addresses are where data is stored in your computer’s memory.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, every variable is stored at a specific memory location in your computer. This location is called its memory address. When you use the address, you're pointing directly to where the data is stored.",
                                    styledText = listOf("memory location")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Think of it like an apartment number: each apartment (variable) has a unique address that helps you find it easily in the building (memory).",
                                    styledText = listOf("unique address")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Code Example (Showing Memory Address)
                    LessonContent(
                        id = "beginner_cpp_references_sub6",
                        title = "Code Example: Showing Memory Address",
                        description = "Let's see how to print a memory address.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                    int main() {
                                        int number = 10;
                                        cout << &number <<endl;
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code =
                                "Output: 0x6dfed4"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the code above, '&number' gives us the memory address where 'number' is stored. Using the '&' symbol, we can access the address of any variable." +
                                            " A memory address can be something like (0x6dfed4).",
                                    styledText = listOf("(0x6dfed4)")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Final Sub-lesson 7: Pointers Are Coming!
                    LessonContent(
                        id = "beginner_cpp_references_sub7",
                        title = "Pointers Are Coming!",
                        description = "Ready to level up? We’re about to meet pointers!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You’ve learned references, but now get ready for pointers! Pointers are like references on steroids. They let you point to memory locations directly and give you more control over data.",
                                    styledText = listOf("Pointers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Why learn references first? Well, pointers will make a lot more sense once you understand references. So stay tuned – pointers are coming next!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 14: Pointers in C++
            Lesson(
                id = "beginner_cpp_pointers",
                title = "C++ Pointers",
                description = "Pointers are one of the most powerful tools in C++! Let’s dive into how they work and why they make your code more efficient.",
                lessonContents = listOf(

                    // Sub-lesson 1: What Are Pointers?
                    LessonContent(
                        id = "beginner_cpp_pointers_sub1",
                        title = "What Are Pointers?",
                        description = "Pointers are variables that store memory addresses instead of actual data.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A pointer is like a signpost that tells you the location of something. Instead of holding the actual value, it holds the address where the value is stored!",
                                    styledText = listOf("pointer","address")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, instead of storing the number 5 in a variable, a pointer can store the address where 5 is stored in memory."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Pointers are declared using the ' * ' symbol, and you access the value using the ' * ' symbol when dereferencing the pointer.",
                                    styledText = listOf("*","*")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Declaring and Using Pointers
                    LessonContent(
                        id = "beginner_cpp_pointers_sub2",
                        title = "Declaring and Using Pointers",
                        description = "Let’s see how to declare pointers and use them to store memory addresses.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To declare a pointer, you use the '*' symbol. Here’s an example:"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int number = 10;
                            int *ptr = &number;

                            // Prints the address of 'number'
                            cout << ptr << endl;
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this code, 'ptr' is a pointer to the memory address of 'number'. Using '&' gets the address of 'number', and '*' is used to declare 'ptr' as a pointer."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Dereferencing Pointers
                    LessonContent(
                        id = "beginner_cpp_pointers_sub3",
                        title = "Dereferencing Pointers",
                        description = "Dereferencing allows you to access the value stored at the memory address the pointer is pointing to.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Dereferencing is done using the '*' symbol. It gives you the value at the memory address that the pointer is holding."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int number = 10;
                            int *ptr = &number;
                            cout << *ptr << "\n"; // Dereference the pointer to get value: 10
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, '*ptr' gets the value stored at the address 'ptr' is pointing to, which is 10 in this case."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Benefits of Pointers
                    LessonContent(
                        id = "beginner_cpp_pointers_sub4",
                        title = "Why Use Pointers?",
                        description = "Pointers can save memory and improve the efficiency of your program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Pointers allow you to work directly with memory. This makes your program more efficient because you don’t need to copy data. Instead, you can pass around the memory address, which is much faster!",
                                    styledText = listOf("memory")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Using pointers, you can also dynamically allocate memory for variables, arrays, and even functions.",
                                    styledText = listOf("dynamically")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Another great advantage is that pointers allow you to modify variables in different places of the code by pointing to their memory address.",
                                    styledText = listOf("memory addressy")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Pointers and Arrays
                    LessonContent(
                        id = "beginner_cpp_pointers_sub5",
                        title = "Pointers and Arrays",
                        description = "Pointers work hand-in-hand with arrays. Let’s see how they can be used together.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, arrays are essentially pointers to their first element. You can use pointers to iterate through arrays!",
                                    styledText = listOf("arrays")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int arr[] = {10, 20, 30};

                            // Point to the first element of the array
                            int *ptr = arr;
                            cout << *ptr <<endl;
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, ' arr ' is a pointer to the first element of the array. By dereferencing the pointer, you can access array elements!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Modifying Pointer Values
                    LessonContent(
                        id = "beginner_cpp_pointers_sub6",
                        title = "Modifying Pointer Values",
                        description = "You can modify the value that a pointer points to by dereferencing and assigning a new value.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can change the value at the memory address a pointer is pointing to. This is done by dereferencing the pointer and assigning a new value.",
                                    styledText = listOf("dereferencing")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int number = 10;
                            int *ptr = &number;

                            // Modify the value pointed to by 'ptr'
                            *ptr = 20;
                            cout << number << endl;
                        """.trimIndent()
                            ),

                            ContentBlock.Code(
                                code =
                                "Output: 20"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, ' *ptr ' is dereferencing the pointer and changing the value at the address it is pointing to. The value of ' number ' is now modified to 20.",
                                    styledText = listOf("modified to 20")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: Pointers and Dynamic Memory Management
                    LessonContent(
                        id = "beginner_cpp_pointers_sub7",
                        title = "Pointers and Dynamic Memory Management",
                        description = "Pointers also allow you to manage memory dynamically, but with great power comes great responsibility!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Using pointers, you can allocate memory during runtime using ' new ' and free memory with ' delete '. This gives you control over how much memory your program uses!",
                                    styledText = listOf("new","delete")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "However, improper use of pointers can lead to memory leaks, so always make sure to free memory when you're done!",
                                    styledText = listOf("memory leaks")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            int *ptr = new int;  // Dynamically allocated memory
                            *ptr = 5;
                            cout << *ptr << endl; // Prints: 5
                            delete ptr; // Free the allocated memory
                        """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 8: Explore More and Practice
                    LessonContent(
                        id = "beginner_cpp_pointers_sub7",
                        title = "Explore More and Practice",
                        description = "Learning is fun, but practice makes perfect!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You’ve learned a lot about pointers and more, but remember: just reading isn’t enough! Get your hands dirty with code. The more you practice, the better you’ll get!",
                                    styledText = listOf("just reading isn’t enough!")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "So, practice using pointers, try different concepts, write some code, break things, and fix them. That’s how the real learning happens!",
                                    styledText = listOf("write some code")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 15: Functions in C++
            Lesson(
                id = "beginner_cpp_functions",
                title = "Understanding C++ Functions",
                description = "Functions are like your own little helpers in the code! Let’s explore how they work.",
                lessonContents = listOf(

                    // Sub-lesson 1: What is a Function?
                    LessonContent(
                        id = "beginner_cpp_functions_sub1",
                        title = "What is a Function?",
                        description = "A function is like a mini-program inside your program that does something special.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A function is a block of code that performs a specific task. Once created, you can call it anytime you need it!"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A function is like that friend who always does you a solid when you need them. Once you set it up, you can call them anytime – no questions asked!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Declaring a Simple Function
                    LessonContent(
                        id = "beginner_cpp_functions_sub2",
                        title = "Declaring a Simple Function",
                        description = "Let’s create a function! It’s like giving your helper a name and telling them what to do.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To declare a function, you use a name, followed by parentheses, and then curly braces to define what it does. Here’s a simple one!"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    // Declaring a function
                                    void sayHello() {
                                        cout << "Hello, world!" << endl;
                                    }

                                    int main() { return 0; }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The function ‘sayHello’ does one job: it prints ‘Hello, world!’ when we call it."
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Calling Your Function
                    LessonContent(
                        id = "beginner_cpp_functions_sub3",
                        title = "Calling Your Function",
                        description = "Once you’ve got a function, you can call it anytime you need to perform that task!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To call your function, you just write its name followed by parentheses. It’s like pressing a button to make it do its thing."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    int main() {
                                        sayHello();  //Calling the function
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When you call ‘sayHello()’, it prints ‘Hello, world!’ to the screen. It’s simple but powerful!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),


                    // Sub-lesson 4: Avoid Declaring Functions Below Main
                    LessonContent(
                        id = "beginner_cpp_functions_sub4",
                        title = "Avoid Declaring Functions Below Main()",
                        description = "It’s best practice to declare your functions above ‘main()’, not below it.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If you declare a function below ‘main()’, your program won’t know about it when you try to call it. So always declare your functions at the top, above ‘main()’!"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Always declare functions above main():"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                                void yourFunction(){
                                                    cout<< "i am funtions" <<endl;
                                                }

                                                int main(){
                                                    return 0;
                                                }
                                                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),


                    // Sub-lesson 5: Simple Function Calls
                    LessonContent(
                        id = "beginner_cpp_functions_sub5",
                        title = "Simple Function Calls",
                        description = "Functions can be called multiple times to repeat an action!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can call the same function multiple times, and it will perform the same task each time. It's like having a tool you can use as many times as you need!"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                        void myFunction() {
                            cout << "I love coding!" << endl;
                        }

                        int main() {
                            myFunction();  // Call 1
                            myFunction();  // Call 2
                            myFunction();  // Call 3
                            return 0;
                        }
                        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, we call the 'myFunction' three times. Each time it prints 'I love coding!'"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Note: Function is always called inside main()"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),


                    // Sub-lesson 6: Why Use Functions?
                    LessonContent(
                        id = "beginner_cpp_functions_sub6",
                        title = "Why Use Functions?",
                        description = "Functions make your life easier by letting you reuse code without repeating yourself.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Functions save you time! Instead of writing the same code over and over again, you can write it once inside a function and call it whenever you need it."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = """Imagine you want to say ‘Hello’ 10 times. Without a function, you’d write ‘cout << "Hello, world!"" << endl;’ 10 times! But with a function, you only call it once!"""
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),


                    // Final Sub-lesson: Keep It Fun and Keep It Simple
                    LessonContent(
                        id = "beginner_cpp_functions_sub7",
                        title = "Keep It Fun and Keep It Simple!",
                        description = "Remember: functions are here to make your life easier. They help you keep your code neat and avoid repetition.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "As you keep coding, think about how functions can help you make your code cleaner and more efficient."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The more you practice, the easier it becomes. So, keep coding, have fun, and don’t be afraid to experiment!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )

                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 16: Function Parameters in C++
            Lesson(
                id = "beginner_cpp_function_parameters",
                title = "Function Parameters in C++",
                description = "Let’s dive into how functions can take input through parameters and how to work with them effectively.",
                lessonContents = listOf(

                    // Sub-lesson 1: What Are Function Parameters?
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub1",
                        title = "What Are Function Parameters?",
                        description = "Parameters act as placeholders in functions, where you can pass data for the function to work with.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A parameter is a variable defined in the function definition that holds data passed to the function when called."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Think of parameters like ingredients in a recipe. They allow you to make the recipe (function) work with different ingredients (data) each time you use it!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Basic Syntax of Function Parameters
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub2",
                        title = "Basic Syntax of Function Parameters",
                        description = "Here’s how you add parameters to your functions in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To define a function with parameters, specify the parameters inside the parentheses after the function name. You can add multiple parameters separated by commas."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                void myFunction(string fname, int age) {

                                }

                                int main() {
                                    return 0;
                                }
                            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the code above, the function 'myFunction' takes two parameters: a string `fname` and an integer `age`. These values are passed when the function is called."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Parameters vs Arguments
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub3",
                        title = "Parameters vs Arguments",
                        description = "Understanding the difference between parameters (the placeholders) and arguments (the actual values passed).",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A parameter is a variable in the function definition, while an argument is the actual value you pass into the function when you call it."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example:"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    myFunction("zain","20");
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = """In the function call 'myFunction("zain", 20);', 'zain' and '20' are arguments, while 'fname' and 'age' are parameters."""
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Calling Functions with Multiple Parameters
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub4",
                        title = "Calling Functions with Multiple Parameters",
                        description = "Let’s call a function that takes more than one parameter and pass the required arguments.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When you call a function with multiple parameters, make sure you provide a value for each parameter in the correct order."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                void greetPerson(string fname, int age) {
                                    cout << "Hello " << fname << ", Age: " << age << endl;
                                }

                                int main() {
                                    greetPerson("Zain", 20);
                                    greetPerson("Saif", 24);
                                    return 0;
                                }
                            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = """Here, we call 'greetPerson' twice. First with the arguments '"zain", 20', and second with '"saif", 24'.
                                    | The function will use these values as 'fname' and 'age' inside the function.""".trimMargin()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Using Parameters to Perform Tasks
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub5",
                        title = "Using Parameters to Perform Tasks",
                        description = "Function parameters allow you to create flexible functions that can handle different data each time they are called.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Parameters make your functions more powerful by letting them handle different input each time you call them."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                void addNumbers(int num1, int num2) {
                                    cout << "Sum: " << num1 + num2 << endl;
                                }

                                int main() {
                                    addNumbers(5, 7);
                                    addNumbers(10, 20);
                                    return 0;
                                }
                            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, the function 'addNumbers' takes two integers and adds them together. Each time we call the function, we pass in different arguments."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Using Default Parameters
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub6",
                        title = "Using Default Parameters",
                        description = "Learn how to set default values for parameters so that they can be optional when calling the function.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, you can assign default values to parameters. If you don't provide an argument for that parameter when calling the function, the default value will be used."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                void greetPerson(string fname, int age = 18) {
                                    cout << "Hello " << fname;
                                }

                                int main() {
                                    greetPerson("Zain");
                                    greetPerson("Saif", 24);
                                    return 0;
                                }
                            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, we set a default value for 'age' as 18. If no value is passed, it will use 18 as the default, but we can still pass a custom value, as shown in the second call to 'greetPerson'."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Final Sub-lesson 7: Keep It Clear and Simple!
                    LessonContent(
                        id = "beginner_cpp_function_parameters_sub7",
                        title = "Keep It Clear and Simple!",
                        description = "Remember, parameters allow your functions to be more dynamic and reusable. Use them wisely to keep your code clean and flexible!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Keep practicing functions with and without parameters. They’re one of the most powerful ways to make your functions versatile and efficient!"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "With a solid understanding of parameters, you're now ready to build more complex functions that can handle various data types and scenarios."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )

                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 17: function with return values
            Lesson(
                id = "beginner_cpp_return_keyword",
                title = "Function with return values",
                description = "Let’s talk about the return keyword – the superhero of functions. No more 'void' boringness. Time for some action!",
                lessonContents = listOf(

                    // Sub-lesson 1: Introduction to Return Keyword
                    LessonContent(
                        id = "beginner_cpp_return_keyword_sub1",
                        title = "The Return Keyword",
                        description = "We used 'void' before, but now we need something more exciting – functions that actually send something back!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "'Void' is like your function saying, 'I’m doing my thing, but I’m not sharing anything with you.' Now, 'return' is the opposite – your function says, 'I’m giving you something back!'"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When you use 'return', you’re telling your function, 'Go do your thing and bring me back something I can use!'"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Basic Syntax of Return Functions
                    LessonContent(
                        id = "beginner_cpp_return_keyword_sub2",
                        title = "Syntax of Return Functions",
                        description = "Here’s how you make your function do the real work – and give something back. No more excuses.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Instead of 'void', you use the type of thing you want back – like 'int', 'string', or even something fancy like 'float'."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    int myFunction(int x) {
                                        return 5 + x;
                                    }

                                    int main() {
                                        cout << myFunction(3);
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code =
                                "Output: 8"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, 'myFunction' adds 5 to whatever number you give it and returns the result. No magic, just math!"
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Storing Return Values in Variables
                    LessonContent(
                        id = "beginner_cpp_return_keyword_sub3",
                        title = "Keep the Goods: Storing Return Values",
                        description = "You don’t just want to receive a value and forget about it, right? Store it, use it, make it work for you.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Once your function returns something, store it in a variable. Don’t just let it go to waste!"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    int myFunction(int x, int y) {
                                        return x + y;
                                    }

                                    int main() {
                                        int z = myFunction(5, 3);
                                        cout << z;
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, 'myFunction' returns the sum of two numbers, and we store it in 'z'. Now, 'z' has the power of 8. Use wisely!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Using Return Functions with Multiple Parameters
                    LessonContent(
                        id = "beginner_cpp_return_keyword_sub4",
                        title = "Return Functions with Multiple Parameters",
                        description = "Want more complexity? Use multiple parameters and make your functions even more useful!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can throw as many parameters as you want into a function, and it'll return something based on all of them!"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                    int addNumbers(int x, int y) {
                                        return x + y;
                                    }

                                    int main() {
                                        cout << addNumbers(5, 3);
                                        return 0;
                                    }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, 'addNumbers' is simply returning the sum of 'x' and 'y'. Easy, right? But you can make it as complicated as you like."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-Lesson 5:
                    LessonContent(
                        id = "beginner_cpp_return_keyword_sub5",
                        title = "Returning Strings: When Functions Speak Back",
                        description = "Numbers are cool, but what about words? Let’s make your functions talk by returning strings!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Sometimes, numbers aren’t enough – maybe your function needs to return something more conversational, like a string!"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                            string greetUser(string name) {
                                return "Hello, " + name + "!";
                            }

                            int main() {
                                cout << greetUser("Alice");
                                return 0;
                            }
                        """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code = "Output: Hello, Alice!"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "String functions can do so much more – like constructing messages, generating responses, or formatting output. Get creative!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Return Keyword Recap
                    LessonContent(
                        id = "beginner_cpp_return_keyword_sub6",
                        title = "Return Keyword Recap",
                        description = "You’ve unlocked the secret of 'return'. Now go forth and use it like a pro!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In summary, the return keyword makes your functions powerful, sending back useful stuff instead of just saying 'void'."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember, return can give you any type you need, whether it’s numbers, strings, or something else. The power is in your hands!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )

                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 18: Pass Array to a Function
            Lesson(
                id = "beginner_cpp_passing_arrays_with_params",
                title = "Passing Arrays to Function",
                description = "Let’s see how to pass arrays and other parameters to functions without the confusion of big code blocks.",
                lessonContents = listOf(

                    // Sub-lesson 1: Create a Function to Accept an Array
                    LessonContent(
                        id = "beginner_cpp_passing_arrays_sub1",
                        title = "Create a Function for Arrays",
                        description = "Start by writing a function that accepts only an array.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When you pass an array to a function, you’re giving it the entire lineup. Let’s see how to set it up."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                void printArray(int arr[], int size) {
                                    for (int i = 0; i < size; i++) {
                                        cout << arr[i] << " ";
                                    }
                                    cout << endl;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This function takes an array and its size, then prints the array elements."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Call the Function with an Array
                    LessonContent(
                        id = "beginner_cpp_passing_arrays_sub2",
                        title = "Call the Function with an Array",
                        description = "Now, let’s call the function from the main program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, we pass 'myArray' and its size (5) to the 'printArray' function."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    int myArray[] = {10, 20, 30, 40, 50};
                                    printArray(myArray, 5);
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code = "Output: 10 20 30 40 50"
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Return a Specific Index from an Array
                    LessonContent(
                        id = "beginner_cpp_passing_arrays_sub3",
                        title = "Return a Specific Index from an Array",
                        description = "Let’s modify the function to return the value at a specific index in the array.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This function accepts an array and an index, then returns the element at that index."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                                int getArrayElement(int arr[], int index) {
                                    return arr[index];
                                }
                                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Call the Function and Get the Returned Value
                    LessonContent(
                        id = "beginner_cpp_passing_arrays_sub4",
                        title = "Get the Returned Value",
                        description = "Call the updated function to fetch and print a value from the array.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                                int main() {
                                    int myArray[] = {5, 15, 25, 35};
                                    int element = getArrayElement(myArray, 2);
                                    cout << "Element at index 2: " << element;
                                    return 0;
                                }
                                """.trimIndent()
                            ),
                            ContentBlock.Code(
                                code = " Output: Element at index 2: 25"
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This demonstrates how to pass an array to a function and retrieve a specific value by index."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Closing Thoughts
                    LessonContent(
                        id = "beginner_cpp_passing_arrays_sub5",
                        title = "Closing Thoughts",
                        description = "Passing arrays and other parameters gives you flexibility to make your functions dynamic and powerful.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Start small with simple functions. As you get comfortable, try adding more parameters or making the functions more complex!"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember: clean code is happy code. Keep your functions clear and concise!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),


            // Lesson 19: C++ Variable Scope
            Lesson(
                id = "beginner_cpp_variable_scope",
                title = "C++ Variable Scope",
                description = "Learn how variables in C++ decide their reach and manage their accessibility effectively.",
                lessonContents = listOf(

                    // Sub-lesson 1: Introduction to Scope
                    LessonContent(
                        id = "beginner_cpp_scope_intro",
                        title = "What is Scope?",
                        description = "Understand what variable scope is and why it matters in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, scope defines the area in which a variable is accessible. Think of it as a VIP pass—some variables roam freely (global), while others stay within boundaries (local)."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Knowing scope helps you avoid bugs, such as trying to use a local variable outside its valid context."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Local Scope
                    LessonContent(
                        id = "beginner_cpp_scope_local",
                        title = "Local Scope: Restricted Access",
                        description = "Learn about variables confined to the function they’re declared in.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Local variables are declared inside functions or blocks and exist only while the function runs. Once the function ends, they disappear—like temporary notes."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                    void myFunction() {
                        int x = 5; // Local variable
                        cout << x;
                    }

                    int main() {
                        myFunction(); 
                        // cout << x; // Error: x is not accessible here
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, 'x' is a local variable inside 'myFunction'. It cannot be accessed outside the function."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: Global Scope
                    LessonContent(
                        id = "beginner_cpp_scope_global",
                        title = "Global Scope: Always Available",
                        description = "Discover variables that are accessible from anywhere in your program.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Global variables are declared outside all functions. They are accessible throughout the program—useful but should be managed with care."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                    int x = 10; // Global variable

                    void myFunction() {
                        cout << x << endl; // Accessing global
                    }

                    int main() {
                        myFunction();
                        cout << x << endl; // Also accessing
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, 'x' is declared globally, so it can be used in both 'myFunction' and 'main'. However, overusing global variables can make your program harder to debug."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Local vs Global Name Conflicts
                    LessonContent(
                        id = "beginner_cpp_scope_name_clash",
                        title = "Local vs Global: Name Conflicts",
                        description = "What happens when a local and global variable share the same name?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When a local and global variable have the same name, the local variable takes precedence within its scope. Outside the function, the global variable is used."
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                    int x = 10; // Global variable

                    void myFunction() {
                        int x = 20; // Local variable
                        cout << x << endl; // Prints local x (20)
                    }

                    int main() {
                        myFunction();
                        cout << x << endl; // Prints global x (10)
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The output will be '20' for the local variable in 'myFunction' and '10' for the global variable in 'main'. To avoid confusion, use unique variable names."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Best Practices for Scope
                    LessonContent(
                        id = "beginner_cpp_scope_best_practices",
                        title = "Best Practices for Variable Scope",
                        description = "Tips to effectively manage variable scope in your programs.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = """
                        - Use local variables as much as possible for better encapsulation and easier debugging.
                        - Minimize the use of global variables to avoid unintended side effects.
                        - Avoid naming conflicts by giving meaningful and distinct variable names.
                        - Keep your code organized and readable.
                        """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                    void calculateSum() {
                        int sum = 0; // Local variable
                        for (int i = 1; i <= 5; i++) {
                            sum += i;
                        }
                        cout << "Sum: " << sum << endl;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "By following these practices, you can write clear and bug-free programs."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),


            // Lesson 20: C++ Recursion
            Lesson(
                id = "beginner_cpp_recursion",
                title = "C++ Recursion",
                description = "Learn how recursion works: functions calling themselves to solve problems step by step.",
                lessonContents = listOf(

                    // Sub-lesson 1: What is Recursion?
                    LessonContent(
                        id = "beginner_cpp_recursion_intro",
                        title = "What is Recursion?",
                        description = "Understand the concept of recursion.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Recursion is when a function calls itself to solve a smaller problem. It repeats until a base case is reached, similar to a loop but using function calls.",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.",
                                    styledText = listOf("")
                                )
                            ),

                            ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Basic Example of Recursion
                    LessonContent(
                        id = "beginner_cpp_recursion_basic_example",
                        title = "Basic Recursion Example",
                        description = "See how recursion works in action with a simple countdown example.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("A function can call itself with a smaller value until a condition is met (base case). For example, counting down to 0.")),
                            ContentBlock.Code(
                                code = """
                    void countDown(int n) {
                        if (n == 0) {
                            cout << "Blastoff!";
                            return; // Base case
                        }
                        cout << n << endl;
                        countDown(n - 1); // Recursive call
                    }

                    int main() {
                        countDown(5); // Starts the countdown
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Copy above function and try it in your compiler and see the output. \n" +
                                            "Output: 5,4,3,2,1,Blastoff!",
                                    styledText = listOf("")

                                )
                            ),
                        ),

                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 3: How Does Recursion Work?
                    LessonContent(
                        id = "beginner_cpp_recursion_steps",
                        title = "How Recursion Works",
                        description = "Breaking down the recursion process.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Recursion works like this: \n" +
                                            "1. Start with a problem.\n" +
                                            "2. Break it into smaller parts.\n" +
                                            "3. Solve the smallest part (base case).\n" +
                                            "4. Build the solution step by step as you return from the function calls.",
                                    styledText = listOf("")

                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: When to Use Recursion
                    LessonContent(
                        id = "beginner_cpp_recursion_use_cases",
                        title = "When to Use Recursion",
                        description = "Learn when recursion is appropriate.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("""Use recursion for problems that can be divided into smaller sub-problems, like calculating factorials or generating Fibonacci numbers.""")),
                            ContentBlock.Code(
                                code = """
                    int factorial(int n) {
                        if (n == 1) {
                            return 1; // Base case
                        }
                        return n * factorial(n - 1); // Recursive call
                    }

                    int main() {
                        cout << factorial(5); // Outputs 120
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 5: Common Pitfalls of Recursion
                    LessonContent(
                        id = "beginner_cpp_recursion_pitfalls",
                        title = "Common Recursion Pitfalls",
                        description = "Avoid errors like infinite loops or performance issues.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Forgetting the base case: leads to infinite recursion.\n" +
                                            " Using recursion where loops would be simpler. \n" +
                                            "Recursive calls can use a lot of memory if not optimized.",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
                    void infiniteRecursion() {
                        cout << "Uh oh!" << endl;
                        infiniteRecursion(); // No base case
                    }

                    int main() {
                        // Uncomment to crash the program!
                        // infiniteRecursion();
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Debugging Recursion
                    LessonContent(
                        id = "beginner_cpp_recursion_debugging",
                        title = "Debugging Recursive Functions",
                        description = "Tips for troubleshooting recursive functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Use print statements to trace function calls.\n" +
                                            "Visualize the call stack to understand function execution order.",
                                    styledText = listOf()

                                )
                            ),
                            ContentBlock.Code(
                                code = """
                    int factorial(int n) {
                        cout << "Called factorial(" << n << ")" << endl; // Debugging
                        if (n == 1) {
                            return 1;
                        }
                        return n * factorial(n - 1);
                    }

                    int main() {
                        cout << factorial(4); // Check debug output
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 7: The Importance of Practice (And Not Just Scrolling)
                    LessonContent(
                        id = "beginner_cpp_recursion_practice",
                        title = "The Importance of Practice",
                        description = "You won’t learn anything just by scrolling through lessons.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Just a reminder: scrolling through lessons won't help you learn. Practice is key! 📝 Don't skip over stuff you don't get – ask questions or search for answers. Trust me, you'll thank yourself later! 💪"
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "And remember: the light bulb was invented by someone who didn’t give up after burning their fingers on the first few tries. Keep going!",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )

                ),
                status = LessonStatus.COMPLETED
            ),


        )
    )
}