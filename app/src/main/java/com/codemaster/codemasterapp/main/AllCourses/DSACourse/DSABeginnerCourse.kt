package com.codemaster.codemasterapp.main.AllCourses.DSACourse

import com.codemaster.codemasterapp.main.AllCourses.DSACourse.courseIds.DSABeginnerStageIds
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

fun DSABeginnerCourse(): Stage {
    return Stage(
        id = DSABeginnerStageIds.stageId,
        title = "Beginner",
        lessons = listOf(
            // Lesson 1
            Lesson(
                id = DSABeginnerStageIds.lesson1,
                title = "Introduction to Data Structures and Algorithms in C++",
                description = "In this lesson, we’ll explore the fundamentals of data structures and algorithms (DSA), their importance, and how they’re implemented in C++.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson1_subs[0],
                        title = "What is DSA?",
                        description = "Understand the significance of DSA and why it is a cornerstone of programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("DSA involves organizing and manipulating data efficiently to solve problems.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Data structures store and manage data, while algorithms provide the steps to process it.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Mastering DSA is key to building optimized and scalable software solutions."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson1_subs[1],
                        title = "Understanding C++ for DSA",
                        description = "Explore why C++ is a preferred language for implementing DSA.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C++ offers low-level control and high-level abstractions, making it ideal for DSA.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Its Standard Template Library (STL) simplifies working with common data structures and algorithms.",
                                    listOf("STL")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("From arrays to advanced algorithms, C++ has the tools you need for DSA."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson1_subs[2],
                        title = "Key Concepts in DSA",
                        description = "Learn the fundamental concepts of DSA and their role in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Data structures include arrays, linked lists, stacks, queues, trees, graphs, and more.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Algorithms include searching, sorting, recursion, dynamic programming, and greedy approaches.",
                                    listOf("searching", "sorting")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("C++ provides the flexibility to implement both simple and complex DSA solutions."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson1_subs[3],
                        title = "Applications of DSA in Real-World Problems",
                        description = "Discover how DSA solves problems across various domains.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("DSA powers search engines, social media platforms, and navigation systems.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "It is crucial in game development, robotics, and data analysis, where performance matters.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(createSimpleText("From AI to web applications, DSA ensures efficiency and reliability."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson1_subs[4],
                        title = "Why Learn DSA with C++?",
                        description = "Explore the benefits of learning DSA and why C++ is an excellent choice.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("DSA teaches you to think critically and solve complex problems effectively.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C++ enables efficient implementation with features like pointers, templates, and STL.",
                                    listOf("pointers", "templates")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("These skills are highly valued in competitive programming and software development."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson1_subs[5],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why is C++ widely used for DSA?",
                                options = listOf(
                                    "It provides low-level control and high-level abstractions.",
                                    "It includes the Standard Template Library (STL).",
                                    "It supports efficient memory management.",
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
                        id = DSABeginnerStageIds.lesson1_subs[6],
                        title = "What’s Next?",
                        description = "Preview the journey ahead as we dive into arrays, linked lists, and advanced DSA concepts.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Prepare to explore the building blocks of DSA with arrays and linked lists.")),
                            ContentBlock.Text(createSimpleText("You’ll learn about recursion, dynamic programming, and graph algorithms.")),
                            ContentBlock.Text(createSimpleText("Hands-on projects will solidify your understanding and skills in DSA."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // lesson 2
            Lesson(
                id = DSABeginnerStageIds.lesson2,
                title = "Building a Winning Mindset for Learning DSA",
                description = "In this lesson, we focus on cultivating the right mindset to excel in Data Structures and Algorithms (DSA). Mastering DSA requires persistence, critical thinking, and a problem-solving attitude. Let’s develop a growth mindset to tackle DSA challenges effectively.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson2_subs[0],
                        title = "The Power of Persistence in DSA",
                        description = "Persistence is vital when learning DSA. The concepts may seem tough initially, but consistent practice and a never-give-up attitude will help you master them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("DSA is a challenging but rewarding journey. Errors and roadblocks are common, but each challenge is a chance to learn and grow. With persistence, you will develop the skills to approach problems systematically and solve them efficiently."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson2_subs[1],
                        title = "Consistency in Practicing DSA",
                        description = "Consistent practice is the key to understanding and retaining DSA concepts. Dedicate time regularly to solve problems and learn algorithms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("DSA requires a steady effort. Commit to solving a few problems daily, even if they seem small. Over time, these small steps will lead to significant improvement in your problem-solving skills and confidence."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson2_subs[2],
                        title = "Setting Achievable DSA Goals",
                        description = "Break down DSA learning into smaller, manageable goals. Celebrate progress to stay motivated.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Set clear, measurable goals, such as 'Understand arrays this week' or 'Solve 10 problems on recursion.' Achievable goals help maintain focus and give you a sense of accomplishment as you progress through your DSA journey."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson2_subs[3],
                        title = "Embracing Challenges in DSA",
                        description = "Learning DSA involves solving challenging problems. Embrace these challenges as opportunities to grow your skills.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("When faced with a difficult problem, break it down into smaller parts, seek guidance, or research alternate approaches. Overcoming these challenges builds resilience and enhances your ability to tackle complex algorithms and data structures."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson2_subs[4],
                        title = "Staying Motivated While Learning DSA",
                        description = "Motivation is essential for mastering DSA. Stay inspired by setting milestones, joining a coding community, and reminding yourself of your goals.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("DSA can be daunting, but remember why you started—whether it's to excel in competitive programming, ace technical interviews, or build efficient solutions. Celebrate your milestones and find a community of like-minded learners to keep your enthusiasm alive."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 3
            Lesson(
                id = DSABeginnerStageIds.lesson3,
                title = "Fibonacci Numbers",
                description = "Understand the Fibonacci sequence and its implementations using loops and recursion.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson3_subs[0],
                        title = "What Are Fibonacci Numbers?",
                        description = "Learn about the Fibonacci sequence, a series of numbers where each number is the sum of the two preceding ones.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the two preceding numbers. The sequence looks like this:")),
                            ContentBlock.Code(
                                """
Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
                """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("The Fibonacci sequence has applications in mathematics, computer science, and nature.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson3_subs[1],
                        title = "Fibonacci Algorithm Using Loops",
                        description = "Implement the Fibonacci algorithm using a for loop.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
#include <stdio.h>

void printFibonacci(int n) {
    int a = 0, b = 1, next;
    printf("%d %d ", a, b);
    for (int i = 2; i < n; i++) {
        next = a + b;
        printf("%d ", next);
        a = b;
        b = next;
    }
    printf("\\n");
}

int main() {
    int n = 10; // Number of Fibonacci numbers to generate
    printFibonacci(n);
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("This approach uses iteration to generate the Fibonacci sequence efficiently.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson3_subs[2],
                        title = "Fibonacci Algorithm Using Recursion",
                        description = "Understand and implement the Fibonacci sequence using recursion.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
#include <stdio.h>

int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n = 10;
    for (int i = 0; i < n; i++) {
        printf("%d ", fibonacci(i));
    }
    printf("\\n");
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("Recursion simplifies the implementation but can be inefficient for large values of n.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson3_subs[3],
                        title = "Finding the nth Fibonacci Number Using Recursion",
                        description = "Learn how to calculate the nth Fibonacci number with recursion.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
#include <stdio.h>

int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n = 5; // Find the 5th Fibonacci number
    printf("The %dth Fibonacci number is: %d\\n", n, fibonacci(n));
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("This method can be optimized using techniques like memoization to store intermediate results.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson3_subs[4],
                        title = "Quiz",
                        description = "Test your knowledge of Fibonacci algorithms.",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the 6th number in the Fibonacci sequence?",
                                incompleteCode = """
Write your answer:___
                    """.trimIndent(),
                                correctCode = "8",
                                userInput = null, // User's input will be captured here
                                isCodeCorrect = false // Will be updated based on user input
                            ),
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 4
            Lesson(
                id = DSABeginnerStageIds.lesson4,
                title = "Find the Lowest Value in an Array",
                description = "Learn how to implement algorithms to find the smallest value in an array and understand their time complexity.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[0],
                        title = "Introduction to Arrays",
                        description = "Understand what arrays are and how they store data in contiguous memory.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "An array is a collection of elements, all of the same type, stored in contiguous memory locations.",
                                    listOf("array", "contiguous memory")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    int arr[] = {5, 3, 8, 1, 2};
    printf("First element: %d\\n", arr[0]); // Accessing the first element
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[1],
                        title = "Algorithm: Find the Lowest Value",
                        description = "Learn the algorithm to find the smallest value in an array using iteration.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To find the smallest value in an array, iterate through all elements and keep track of the minimum value.",
                                    listOf("iteration", "minimum value")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    int arr[] = {5, 3, 8, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate array size
    int min = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    printf("Lowest value: %d\\n", min);
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[2],
                        title = "Implementation Details",
                        description = "Break down the algorithm into step-by-step implementation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("1. Initialize the minimum value with the first element.\n" +
                                        "2. Traverse the array from the second element.\n" +
                                        "3. Compare each element with the current minimum.\n" +
                                        "4. Update the minimum if a smaller value is found.")
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[3],
                        title = "Algorithm Time Complexity",
                        description = "Understand the time complexity of the algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The algorithm iterates through all elements in the array once, making its time complexity O(n), where n is the number of elements in the array.",
                                    listOf("O(n)")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[4],
                        title = "Quiz",
                        description = "Test your understanding of finding the smallest value in an array.",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to find the smallest value in the array.",
                                incompleteCode = """
#include <stdio.h>

int main() {
    int arr[] = {5, 3, 8, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate array size
    int min = arr[0]; // Initialize min with the first element
    
    // Loop through the array to find the minimum value
    for (int i = 1; i < n; i++) {
        if (arr[i] < min) {
            min = ___; 
        }
    }

    printf("Lowest value: %d\\n", min); // Print the smallest value
    return 0;
}
            """.trimIndent(),
                                correctCode = "arr[i]",
                                userInput = null, // User's input will be captured here
                                isCodeCorrect = false // Will be updated based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[5],
                        title = "Optimizations and Best Practices",
                        description = "Explore ways to optimize the algorithm and common pitfalls to avoid.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("1. Use a function to modularize the implementation.\n" +
                                        "2. Handle edge cases, such as an empty array.\n" +
                                        "3. Avoid unnecessary comparisons to improve efficiency.")
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int findMin(int arr[], int n) {
    if (n == 0) {
        printf("Array is empty\\n");
        return -1; // Error code
    }

    int min = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

int main() {
    int arr[] = {5, 3, 8, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Lowest value: %d\\n", findMin(arr, n));
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 5
            Lesson(
                id = DSABeginnerStageIds.lesson5,
                title = "C Comments",
                description = "Master how to use comments in C for better code readability and documentation!",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[0],
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
                        id = DSABeginnerStageIds.lesson5_subs[1],
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
                        id = DSABeginnerStageIds.lesson5_subs[3],
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
                        id = DSABeginnerStageIds.lesson5_subs[4],
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
                        id = DSABeginnerStageIds.lesson5_subs[5],
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
                        id = DSABeginnerStageIds.lesson5_subs[6],
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
                        id = DSABeginnerStageIds.lesson5_subs[7],
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
                id = DSABeginnerStageIds.lesson6,
                title = "C Variables",
                description = "Learn how to work with variables in C: declaring, formatting, changing values, and naming! 🎯",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[0],
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
                        id = DSABeginnerStageIds.lesson6_subs[1],
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
                        id = DSABeginnerStageIds.lesson6_subs[3],
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
                        id = DSABeginnerStageIds.lesson6_subs[4],
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
                        id = DSABeginnerStageIds.lesson6_subs[5],
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
                        id = DSABeginnerStageIds.lesson6_subs[6],
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
                        id = DSABeginnerStageIds.lesson6_subs[7],
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
                        id = DSABeginnerStageIds.lesson6_subs[8],
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
                id = DSABeginnerStageIds.lesson7,
                title = "C Data Types",
                description = "Explore the different data types in C: what they are, how they work, and how to convert between them! 🧮🎯",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[0],
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
                        id = DSABeginnerStageIds.lesson7_subs[1],
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
                        id = DSABeginnerStageIds.lesson7_subs[2],
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
                        id = DSABeginnerStageIds.lesson7_subs[3],
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
                        id = DSABeginnerStageIds.lesson7_subs[4],
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
                        id = DSABeginnerStageIds.lesson7_subs[5],
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
                        id = DSABeginnerStageIds.lesson7_subs[6],
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
                        id = DSABeginnerStageIds.lesson7_subs[7],
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
                        id = DSABeginnerStageIds.lesson7_subs[8],
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
                id = DSABeginnerStageIds.lesson8,
                title = "C Constants",
                description = "Understand how constants are used in C programs for fixed values that do not change! 🔒",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[0],
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
                        id = DSABeginnerStageIds.lesson8_subs[1],
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
                        id = DSABeginnerStageIds.lesson8_subs[2],
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
                        id = DSABeginnerStageIds.lesson8_subs[3],
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
                        id = DSABeginnerStageIds.lesson8_subs[4],
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
                        id = DSABeginnerStageIds.lesson8_subs[5],
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
                id = DSABeginnerStageIds.lesson9,
                title = "C Operators",
                description = "Learn the different operators in C used for performing operations on variables and values! 🔧",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[0],
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
                        id = DSABeginnerStageIds.lesson9_subs[1],
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
                        id = DSABeginnerStageIds.lesson9_subs[2],
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
                        id = DSABeginnerStageIds.lesson9_subs[3],
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
                        id = DSABeginnerStageIds.lesson9_subs[4],
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
                        id = DSABeginnerStageIds.lesson9_subs[5],
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
                        id = DSABeginnerStageIds.lesson9_subs[6],
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
                        id = DSABeginnerStageIds.lesson9_subs[7],
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
                        id = DSABeginnerStageIds.lesson9_subs[8],
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
                id = DSABeginnerStageIds.lesson10,
                title = "C Booleans",
                description = "Learn how to use booleans in C for conditional statements and logical operations! ✅❌",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson10_subs[0],
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
                        id = DSABeginnerStageIds.lesson10_subs[1],
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
                        id = DSABeginnerStageIds.lesson10_subs[2],
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
                        id = DSABeginnerStageIds.lesson10_subs[3],
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
                        id = DSABeginnerStageIds.lesson10_subs[4],
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
                        id = DSABeginnerStageIds.lesson10_subs[5],
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
                        id = DSABeginnerStageIds.lesson10_subs[6],
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
                id = DSABeginnerStageIds.lesson11,
                title = "Recap",
                description = "Review important topics from this stage and prepare for the next stage in your C programming journey! 🧠💻",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[0],
                        title = "C Syntax Overview",
                        description = "Review the basic syntax of C programming. Remember to focus on semicolons, curly braces, and the structure of main().",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("C programs begin with the main function, and statements are terminated with a semicolon. Curly braces are used to define code blocks. In C, each function must be defined within these braces, and the program starts execution from the main function. The use of semicolons is essential to mark the end of statements, making the program syntactically correct.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[1],
                        title = "Understanding Statements",
                        description = "Statements are the building blocks of your program. Each statement performs a task, like declaring variables or performing operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In C, statements like variable declarations and expressions are used to perform tasks. Each statement can represent an action like assigning values, performing arithmetic operations, or calling functions. Statements must end with a semicolon to be syntactically correct. For example, declaring variables, performing assignments, or displaying results all count as statements in C.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[2],
                        title = "Working with Variables and Data Types",
                        description = "Variables store data values in a program. Review the common data types such as int, char, float, and double.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In C, variables are assigned specific data types, which determine the kind of data they can hold. For example, an int can store whole numbers, a char can store single characters, and float and double are used to store decimal numbers with varying precision. Properly choosing the data type ensures that data is stored efficiently and correctly.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[3],
                        title = "Using Operators in C",
                        description = "Operators are used to perform operations on variables and values. Refresh your knowledge on arithmetic, comparison, and logical operators.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Operators in C help perform operations such as addition, subtraction, comparison, and logical operations. Arithmetic operators like +, -, *, and / perform basic mathematical calculations. Comparison operators like ==, !=, >, <, >=, and <= allow for value comparisons. Logical operators like && (AND), || (OR), and ! (NOT) help evaluate multiple conditions together.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[4],
                        title = "Booleans and Logical Operations",
                        description = "Booleans represent true/false values. Logical operations help combine multiple conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Booleans can be used in logical operations like AND (&&), OR (||), and NOT (!) to combine multiple conditions. Logical operations help make decisions based on multiple criteria, for example, checking if both conditions are true or if at least one condition is true.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[5],
                        title = "Conditional Statements",
                        description = "Conditional statements such as if, else if, and while control program flow based on conditions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Conditional statements are used to control the flow of the program by executing code based on whether certain conditions are true or false. For example, if statements allow you to run code when a condition is true, while else lets you run alternative code when the condition is false. The while loop repeatedly executes code as long as the given condition is true.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[6],
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
                id = DSABeginnerStageIds.lesson12,
                title = "Quiz",
                description = "Test your knowledge of the topics covered in this stage! 🧠💻",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson12_subs[0],
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
                        id = DSABeginnerStageIds.lesson12_subs[1],
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
                        id = DSABeginnerStageIds.lesson12_subs[2],
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
                        id = DSABeginnerStageIds.lesson12_subs[3],
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
                        id = DSABeginnerStageIds.lesson12_subs[4],
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
                        id = DSABeginnerStageIds.lesson12_subs[5],
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
                        id = DSABeginnerStageIds.lesson12_subs[6],
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