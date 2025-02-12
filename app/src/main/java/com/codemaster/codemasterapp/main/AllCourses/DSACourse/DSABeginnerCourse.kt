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
                        title = "Manual Walkthrough",
                        description = "Step-by-step guide to manually compute Fibonacci numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "To manually calculate Fibonacci numbers:\n\n" +
                                            "1. Start with 0 and 1.\n" +
                                            "2. Add the last two numbers: 0 + 1 = 1 (Sequence: 0, 1, 1).\n" +
                                            "3. Repeat: 1 + 1 = 2, 1 + 2 = 3 (Sequence: 0, 1, 1, 2, 3).\n" +
                                            "4. Continue this process to generate the sequence.\n\n" +
                                            "Try calculating the first 10 Fibonacci numbers yourself!"
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson3_subs[2],
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
                        id = DSABeginnerStageIds.lesson3_subs[3],
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
                        id = DSABeginnerStageIds.lesson3_subs[4],
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
                        id = DSABeginnerStageIds.lesson3_subs[5],
                        title = "Importance of Fibonacci Numbers",
                        description = "Explore the significance of Fibonacci numbers across various domains.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Fibonacci numbers appear in nature (e.g., leaf arrangements, shells), art and architecture (golden ratio), computer science (algorithms, dynamic programming), and finance (trend analysis). They also influence music, astronomy, and other fields, showcasing their widespread impact."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 4
            Lesson(
                id = DSABeginnerStageIds.lesson4,
                title = "Array",
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
                        title = "Manual Walkthrough",
                        description = "Learn to manually process elements in an array step-by-step.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "To manually process elements in an array:\n\n" +
                                            "1. Start by initializing the array with some elements.\n" +
                                            "2. Loop through the array one element at a time.\n" +
                                            "3. Perform operations on each element as needed (e.g., summing up values, finding the largest element).\n" +
                                            "4. Update variables (like a sum or a maximum value) as you go.\n\n" +
                                            "Example: Consider the array [5, 3, 8, 1, 2]. Walk through the elements to find their sum:\n\n" +
                                            "   - Start with sum = 0.\n" +
                                            "   - Add each element to the sum (5 + 3 + 8 + 1 + 2 = 19).\n\n" +
                                            "Try manually summing the values of an array yourself!"
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

int main() {
    int arr[] = {5, 3, 8, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate array size
    int sum = 0;

    // Walkthrough to calculate the sum of elements in the array
    for (int i = 0; i < n; i++) {
        sum += arr[i];
        printf("Current sum after adding %d: %d\\n", arr[i], sum);
    }

    printf("Total sum: %d\\n", sum);
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
                        id = DSABeginnerStageIds.lesson4_subs[3],
                        title = "Implementation Details",
                        description = "Break down the algorithm into step-by-step implementation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "1. Initialize the minimum value with the first element.\n" +
                                            "2. Traverse the array from the second element.\n" +
                                            "3. Compare each element with the current minimum.\n" +
                                            "4. Update the minimum if a smaller value is found."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.LOCKED
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[4],
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
                        id = DSABeginnerStageIds.lesson4_subs[5],
                        title = "Optimizations and Best Practices",
                        description = "Explore ways to optimize the algorithm and common pitfalls to avoid.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "1. Use a function to modularize the implementation.\n" +
                                            "2. Handle edge cases, such as an empty array.\n" +
                                            "3. Avoid unnecessary comparisons to improve efficiency."
                                )
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
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson4_subs[6],
                        title = "Importance of Arrays",
                        description = "Understand why arrays are a fundamental data structure in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Arrays are one of the most essential data structures in programming. They allow for efficient element access by index, as well as optimized memory storage. Arrays form the foundation for many other data structures like stacks and queues. Their simplicity and versatility make them ideal for tasks like sorting, searching, and storing collections of data efficiently."
                                )
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
                title = "Bubble Sort",
                description = "Learn the Bubble Sort algorithm, its implementation, and its time complexity.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[0],
                        title = "Introduction to Bubble Sort",
                        description = "What is Bubble Sort, and how does it work?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Bubble Sort is a simple algorithm that sorts an array by repeatedly comparing and swapping adjacent elements to place higher values in their correct position. This process continues until the array is fully sorted. Learning Bubble Sort builds a foundation for understanding sorting concepts and prepares you for more advanced algorithms."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually understand how Bubble Sort works by stepping through an example.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Consider an unsorted array: [7, 12, 9, 11, 3]. We will sort it step by step using Bubble Sort.")),
                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Compare the first two values (7 and 12). No swap is needed, as 7 < 12.")),
                            ContentBlock.Text(createSimpleText("Step 2: Compare 12 and 9. Swap them to make [7, 9, 12, 11, 3].")),
                            ContentBlock.Text(createSimpleText("Step 3: Compare 12 and 11. Swap them to make [7, 9, 11, 12, 3].")),
                            ContentBlock.Text(createSimpleText("Step 4: Compare 12 and 3. Swap them to make [7, 9, 11, 3, 12].")),
                            ContentBlock.Text(createSimpleText("At the end of Pass 1, the largest value (12) is placed in its correct position.")),
                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Compare 7 and 9. No swap is needed.")),
                            ContentBlock.Text(createSimpleText("Step 2: Compare 9 and 11. No swap is needed.")),
                            ContentBlock.Text(createSimpleText("Step 3: Compare 11 and 3. Swap them to make [7, 9, 3, 11, 12].")),
                            ContentBlock.Text(createSimpleText("At the end of Pass 2, the second largest value (11) is placed in its correct position.")),
                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Compare 7 and 9. No swap is needed.")),
                            ContentBlock.Text(createSimpleText("Step 2: Compare 9 and 3. Swap them to make [7, 3, 9, 11, 12].")),
                            ContentBlock.Text(createSimpleText("At the end of Pass 3, the third largest value (9) is in its correct position.")),
                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Compare 7 and 3. Swap them to make [3, 7, 9, 11, 12].")),
                            ContentBlock.Text(createSimpleText("At the end of Pass 4, the array is fully sorted: [3, 7, 9, 11, 12].")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Final Array:",
                                    listOf("Final Array:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("[3, 7, 9, 11, 12].")),
                            ContentBlock.Text(createSimpleText("Notice that with each pass, the largest unsorted value 'bubbles up' to its correct position."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[2],
                        title = "Bubble Sort Implementation",
                        description = "Implement Bubble Sort in code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s the code for a basic implementation of Bubble Sort in C++:")),
                            ContentBlock.Code(
                                """
#include <iostream>
using namespace std;

int main() {
    int my_array[] = {64, 34, 25, 12, 22, 11, 90, 5};
    int n = sizeof(my_array) / sizeof(my_array[0]);

    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (my_array[j] > my_array[j+1]) {
                swap(my_array[j], my_array[j+1]);
            }
        }
    }

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << my_array[i] << " ";
    }
    cout << endl;
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("The outer loop runs n-1 times, where n is the number of elements in the array.")),
                            ContentBlock.Text(createSimpleText("The inner loop compares and swaps adjacent elements."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[3],
                        title = "Bubble Sort Optimization",
                        description = "Improve the Bubble Sort algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("If no swaps are made during a pass, the array is already sorted, and we can stop early.")),
                            ContentBlock.Code(
                                """
#include <iostream>
using namespace std;

int main() {
    int my_array[] = {7, 3, 9, 12, 11};
    int n = sizeof(my_array) / sizeof(my_array[0]);

    for (int i = 0; i < n-1; i++) {
        bool swapped = false;
        for (int j = 0; j < n-i-1; j++) {
            if (my_array[j] > my_array[j+1]) {
                swap(my_array[j], my_array[j+1]);
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << my_array[i] << " ";
    }
    cout << endl;
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("This optimization can significantly reduce unnecessary iterations."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[4],
                        title = "Bubble Sort Time Complexity",
                        description = "Understand the time complexity of Bubble Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Bubble Sort has a worst-case and average-case time complexity of O(n^2).")),
                            ContentBlock.Text(createSimpleText("The best-case time complexity is O(n), which occurs when the array is already sorted.")),
                            ContentBlock.Text(createSimpleText("Bubble Sort is not suitable for large datasets as it is inefficient compared to other algorithms like Quick Sort or Merge Sort."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[5],
                        title = "Importance of Bubble Sort",
                        description = "Why learning Bubble Sort is important.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Bubble Sort is a simple algorithm that teaches sorting, element comparison, and swapping. It lays the groundwork for more advanced algorithms and helps in understanding loops, conditionals, and algorithmic trade-offs. Despite its inefficiency, it’s useful for debugging and learning basic algorithm design."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )

                ),
                status = LessonStatus.LOCKED
            ),


            // lesson 6
            Lesson(
                id = DSABeginnerStageIds.lesson6,
                title = "Selection Sort",
                description = "Understand how Selection Sort works: its process, implementation, and optimization! 🔄",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[0],
                        title = "Introduction to Selection Sort",
                        description = "Get an introduction to the Selection Sort algorithm and its key concepts.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Selection Sort is a fundamental sorting algorithm that works by repeatedly selecting the smallest element from the unsorted portion of the array and swapping it with the element at the beginning of the unsorted section."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Although simple to implement, Selection Sort has a time complexity of O(n²), making it less efficient for large datasets compared to algorithms like Merge Sort or Quick Sort."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[1],
                        title = "Manual Walkthrough",
                        description = "Understand Selection Sort step-by-step with a practical example.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Consider an unsorted array: [7, 12, 9, 11, 3]. We will sort it step by step using Selection Sort.")),
                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Find the smallest element in the array (3).")),
                            ContentBlock.Text(createSimpleText("Step 2: Swap 3 with the first element (7).")),
                            ContentBlock.Text(createSimpleText("Array after Pass 1: [3, 12, 9, 11, 7].")),
                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Look at the unsorted portion [12, 9, 11, 7].")),
                            ContentBlock.Text(createSimpleText("Step 2: Find the smallest element (7).")),
                            ContentBlock.Text(createSimpleText("Step 3: Swap 7 with the first element of the unsorted portion (12).")),
                            ContentBlock.Text(createSimpleText("Array after Pass 2: [3, 7, 9, 11, 12].")),
                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Look at the unsorted portion [9, 11, 12].")),
                            ContentBlock.Text(createSimpleText("Step 2: Find the smallest element (9). No swap is needed as it’s already in the correct position.")),
                            ContentBlock.Text(createSimpleText("Array after Pass 3: [3, 7, 9, 11, 12].")),
                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Look at the unsorted portion [11, 12].")),
                            ContentBlock.Text(createSimpleText("Step 2: Find the smallest element (11). No swap is needed.")),
                            ContentBlock.Text(createSimpleText("Array after Pass 4: [3, 7, 9, 11, 12].")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Final Array:",
                                    listOf("Final Array:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("[3, 7, 9, 11, 12].")),
                            ContentBlock.Text(createSimpleText("Notice that with each pass, the smallest unsorted value is placed in its correct position, reducing the size of the unsorted portion."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[2],
                        title = "Selection Sort Implementation",
                        description = "Learn how to implement Selection Sort in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
#include <iostream>
using namespace std;

int main() {
    int my_array[] = {64, 25, 12, 22, 11};
    int n = sizeof(my_array)/sizeof(my_array[0]);
    
    for (int i = 0; i < n; i++) {
        int min_index = i;
        for (int j = i+1; j < n; j++) {
            if (my_array[j] < my_array[min_index]) {
                min_index = j;
            }
        }
        swap(my_array[i], my_array[min_index]);
    }

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << my_array[i] << " ";
    }
    cout << endl;

    return 0;
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "This code swaps elements instead of shifting them, making the implementation more efficient."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[3],
                        title = "Optimizations",
                        description = "Understand how to optimize Selection Sort using swapping.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Instead of removing and inserting elements (which causes shifting), swap the smallest element with the first unsorted element."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This reduces unnecessary operations and improves the algorithm's efficiency in practice.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[4],
                        title = "Selection Sort Time Complexity",
                        description = "Analyze the time complexity of Selection Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Selection Sort runs in O(n²) time because it compares each element to every other element.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "This makes it less efficient than other algorithms like Merge Sort or Quick Sort for larger datasets."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[5],
                        title = "Importance of Selection Sort",
                        description = "Explore where and why Selection Sort is used in practical scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Selection Sort is valued for its simplicity, making it ideal for educational purposes and small datasets. It sorts in place, requiring no extra memory, and minimizes unnecessary swaps. While not efficient for large datasets, it helps build foundational knowledge for understanding advanced algorithms like Merge Sort and Quick Sort."
                                )
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
                title = "Insertion Sort",
                description = "Learn about the Insertion Sort algorithm: how it works, its implementation, and how to improve it. 🔄📊",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[0],
                        title = "Introduction to Insertion Sort",
                        description = "Get an introduction to the Insertion Sort algorithm and its basics.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Insertion Sort is a simple and intuitive sorting algorithm that processes the array one element at a time, inserting each into its proper position in the sorted part of the array."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "While it has a time complexity of O(n²), making it less suitable for large datasets, its simplicity and effectiveness on small or nearly sorted arrays make it a valuable tool."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually walk through the steps of Insertion Sort to understand its process.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Consider an unsorted array: [7, 12, 9, 11, 3]. We will sort it step by step using Insertion Sort.")),
                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Treat the first value (7) as sorted.")),
                            ContentBlock.Text(createSimpleText("Sorted array after Step 1: [7].")),
                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Compare and insert 12 into the correct position in the sorted portion.")),
                            ContentBlock.Text(createSimpleText("Sorted array after Step 2: [7, 12].")),
                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Compare and insert 9 into the correct position in the sorted portion.")),
                            ContentBlock.Text(createSimpleText("Sorted array after Step 3: [7, 9, 12].")),
                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Compare and insert 11 into the correct position in the sorted portion.")),
                            ContentBlock.Text(createSimpleText("Sorted array after Step 4: [7, 9, 11, 12].")),
                            ContentBlock.Text(createAnnotatedText("Pass 5:", listOf("Pass 5:"))),
                            ContentBlock.Text(createSimpleText("Compare and insert 3 into the correct position in the sorted portion.")),
                            ContentBlock.Text(createSimpleText("Sorted array after Step 5: [3, 7, 9, 11, 12].")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Final Array:",
                                    listOf("Final Array:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("[3, 7, 9, 11, 12].")),
                            ContentBlock.Text(
                                createSimpleText(
                                    "With each step, the next element from the unsorted portion is inserted into the correct position in the sorted portion, gradually forming the fully sorted array."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[2],
                        title = "Insertion Sort Code Implementation",
                        description = "Learn to implement Insertion Sort in code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s how you can implement Insertion Sort in C++:")),
                            ContentBlock.Code(
                                """
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> my_array = {64, 34, 25, 12, 22, 11, 90, 5};
    int n = my_array.size();

    for (int i = 1; i < n; i++) {
        int current_value = my_array[i];
        int j = i - 1;
        while (j >= 0 && my_array[j] > current_value) {
            my_array[j + 1] = my_array[j];
            j--;
        }
        my_array[j + 1] = current_value;
    }

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << my_array[i] << " ";
    }
    cout << endl;

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[3],
                        title = "Insertion Sort Improvement",
                        description = "Improve the efficiency of Insertion Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "One inefficiency in the previous implementation is removing and inserting elements repeatedly, causing unnecessary shifts. Instead, you can directly swap elements to improve efficiency."
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> my_array = {64, 34, 25, 12, 22, 11, 90, 5};
    int n = my_array.size();

    for (int i = 1; i < n; i++) {
        int current_value = my_array[i];
        int j = i - 1;
        while (j >= 0 && my_array[j] > current_value) {
            my_array[j + 1] = my_array[j];
            j--;
        }
        my_array[j + 1] = current_value;
    }

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << my_array[i] << " ";
    }
    cout << endl;

    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "This version eliminates the need to pop and insert elements by shifting the values and directly placing the current value in the correct position."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[4],
                        title = "Importance of Insertion Sort",
                        description = "Understand the significance of learning Insertion Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Insertion Sort is a foundational algorithm that helps learners understand key concepts like iterative sorting and in-place operations. It’s simple to grasp, making it a great starting point for learning more advanced sorting techniques."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Although not efficient for large datasets, it shines when working with small or nearly sorted arrays and is often used in introductory programming courses."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 8
            Lesson(
                id = DSABeginnerStageIds.lesson8,
                title = "Quick Sort",
                description = "Learn the Quicksort algorithm, one of the fastest sorting algorithms, and understand how it works through recursion! 🚀",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[0],
                        title = "Introduction to Quicksort",
                        description = "Understand the fundamentals of the Quicksort algorithm and why it’s efficient.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Quicksort is a divide-and-conquer algorithm that is often one of the fastest sorting algorithms.")),
                            ContentBlock.Text(createSimpleText("The algorithm selects a pivot element, then rearranges the other elements so that values smaller than the pivot are to its left, and larger values are to its right.")),
                            ContentBlock.Text(createSimpleText("It’s efficient due to its divide-and-conquer approach, making it a popular choice for sorting.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[1],
                        title = "Quicksort Algorithm Steps",
                        description = "Learn the step-by-step process of how Quicksort works, including recursion and partitioning.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here are the steps involved in the Quicksort algorithm:")),
                            ContentBlock.Text(createSimpleText("1. Choose a pivot element from the array.")),
                            ContentBlock.Text(createSimpleText("2. Partition the array into two sub-arrays: values less than the pivot on the left, and values greater than the pivot on the right.")),
                            ContentBlock.Text(createSimpleText("3. Recursively apply the same process to the sub-arrays.")),
                            ContentBlock.Text(createSimpleText("4. Continue until the array is sorted.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[2],
                        title = "Manual Walkthrough",
                        description = "Walk through an example array to understand Quicksort step by step.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Consider an unsorted array: [10, 7, 8, 9, 1, 5]. We will sort it using Quicksort step-by-step.")),
                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1:"))),
                            ContentBlock.Text(createSimpleText("Choose the pivot element (5) and partition the array into [1] and [10, 7, 8, 9].")),
                            ContentBlock.Text(createSimpleText("After partitioning, the array looks like: [1, 5, 10, 7, 8, 9].")),
                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2:"))),
                            ContentBlock.Text(createSimpleText("Recursively apply Quicksort to the left sub-array [1], which is already sorted.")),
                            ContentBlock.Text(createSimpleText("Apply Quicksort to the right sub-array [10, 7, 8, 9].")),
                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3:"))),
                            ContentBlock.Text(createSimpleText("Choose the pivot element (9) and partition the array into [7, 8] and [10].")),
                            ContentBlock.Text(createSimpleText("After partitioning, the array looks like: [1, 5, 7, 8, 9, 10].")),
                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4:"))),
                            ContentBlock.Text(createSimpleText("Recursively apply Quicksort to [7, 8], which is already sorted.")),
                            ContentBlock.Text(createSimpleText("Now, the entire array is sorted: [1, 5, 7, 8, 9, 10].")),
                            ContentBlock.Text(createSimpleText("Quicksort completes the sorting by recursively sorting smaller sub-arrays efficiently.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[3],
                        title = "Recursion in Quicksort",
                        description = "Understand how recursion is used in the Quicksort algorithm to divide the array into smaller sub-arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Quicksort works by repeatedly calling itself on smaller sub-arrays until they are of length 1 or 0, at which point they are considered sorted.")),
                            ContentBlock.Text(createSimpleText("Recursion helps split the array into smaller and smaller pieces, allowing the algorithm to efficiently sort the entire array.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[4],
                        title = "Quicksort Code Implementation",
                        description = "Learn how to implement the Quicksort algorithm in code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Here’s how you can implement the Quicksort algorithm in C++:")),
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    using namespace std;

                    int partition(int array[], int low, int high) {
                        int pivot = array[high];
                        int i = low - 1;
                        for (int j = low; j < high; j++) {
                            if (array[j] <= pivot) {
                                i++;
                                swap(array[i], array[j]);
                            }
                        }
                        swap(array[i + 1], array[high]);
                        return i + 1;
                    }

                    void quicksort(int array[], int low, int high) {
                        if (low < high) {
                            int pivotIndex = partition(array, low, high);
                            quicksort(array, low, pivotIndex - 1);
                            quicksort(array, pivotIndex + 1, high);
                        }
                    }

                    int main() {
                        int array[] = {64, 34, 25, 12, 22, 11, 90, 5};
                        int size = sizeof(array) / sizeof(array[0]);

                        quicksort(array, 0, size - 1);

                        cout << "Sorted array: ";
                        for (int i = 0; i < size; i++) {
                            cout << array[i] << " ";
                        }
                        return 0;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this C++ implementation, the partition function selects a pivot and rearranges elements accordingly. The quicksort function is recursively called on the sub-arrays.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[5],
                        title = "Time Complexity of Quicksort",
                        description = "Understand the time complexity of the Quicksort algorithm in different scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Quicksort has an average-case time complexity of O(n log n), which is much faster than algorithms like Bubble Sort, which have a time complexity of O(n^2).")),
                            ContentBlock.Text(createSimpleText("However, in the worst case (when the pivot is always the smallest or largest element), the time complexity can degrade to O(n^2).")),
                            ContentBlock.Text(createSimpleText("But on average, Quicksort is one of the fastest sorting algorithms, especially for large datasets.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson8_subs[6],
                        title = "Importance of Quicksort",
                        description = "Learn why Quicksort is an important and widely used sorting algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Quicksort is important because of its efficiency and flexibility. It is widely used in system-level applications and libraries.")),
                            ContentBlock.Text(createSimpleText("It performs exceptionally well for large datasets due to its O(n log n) average-case time complexity.")),
                            ContentBlock.Text(createSimpleText("Quicksort is also versatile and can be adapted to different data types and structures.")),
                            ContentBlock.Text(createSimpleText("Many built-in sorting functions in programming languages use variations of Quicksort due to its practical performance.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 9
            Lesson(
                id = DSABeginnerStageIds.lesson9,
                title = "Counting Sort",
                description = "Learn how Counting Sort works to efficiently sort arrays of integers! 🔧",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[0],
                        title = "Introduction to Counting Sort",
                        description = "Understand the basics of Counting Sort and its use cases.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Counting Sort is an efficient algorithm for sorting integers by counting occurrences.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Counting Sort does not compare values like other sorting algorithms. Instead, it works by counting occurrences of each value in an array.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Conditions for Counting Sort: values must be non-negative integers, and the range of possible values 'k' should be smaller than the number of elements 'n'.",
                                    listOf("Conditions for Counting Sort", "'k'", "'n'")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[1],
                        title = "Manual Walkthrough",
                        description = "Walk through an example array to understand Counting Sort step by step.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's sort the array {2, 3, 0, 2, 3, 2} step-by-step.")),
                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Count the occurrences of each value in the array.")),
                            ContentBlock.Text(createSimpleText("Initial array: [2, 3, 0, 2, 3, 2].")),
                            ContentBlock.Text(createSimpleText("Count array after counting occurrences: [1, 0, 3, 2].")),
                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Modify the count array to store cumulative counts.")),
                            ContentBlock.Text(createSimpleText("Cumulative count array: [1, 1, 4, 6].")),
                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Place each element from the original array into its sorted position.")),
                            ContentBlock.Text(createSimpleText("Sorted array after placing elements: [0, 2, 2, 2, 3, 3].")),
                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Counting Sort is complete, and the array is sorted: [0, 2, 2, 2, 3, 3].")),
                            ContentBlock.Text(createSimpleText("Counting Sort efficiently sorts the array by counting occurrences and leveraging cumulative counts.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[2],
                        title = "How Counting Sort Works",
                        description = "Learn step-by-step how Counting Sort sorts arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Counting Sort sorts an array in three main steps: counting, modifying, and sorting. Here's how:",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
                    // Step 1: Count occurrences of each value
                    int[] arr = {2, 3, 0, 2, 3, 2};
                    int[] countArray = new int[4]; // Range: 0-3
                    
                    for (int num : arr) {
                        countArray[num]++;
                    }
                    
                    // Step 2: Modify countArray to store cumulative counts
                    for (int i = 1; i < countArray.length; i++) {
                        countArray[i] += countArray[i - 1];
                    }
                    
                    // Step 3: Sort the array
                    int[] sortedArray = new int[arr.length];
                    for (int i = arr.length - 1; i >= 0; i--) {
                        int num = arr[i];
                        sortedArray[countArray[num] - 1] = num;
                        countArray[num]--;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[3],
                        title = "Advantages and Limitations of Counting Sort",
                        description = "Explore the pros and cons of Counting Sort and understand when to use it.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Advantages:",
                                    listOf("Advantages:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("1. Works efficiently for small ranges of integers.")),
                            ContentBlock.Text(createSimpleText("2. Stable sort: maintains relative order of elements with equal keys.")),
                            ContentBlock.Text(createSimpleText("3. Has a linear time complexity, O(n + k), in most cases.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Limitations:",
                                    listOf("Limitations:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("1. Not suitable for non-integer or negative values without modifications.")),
                            ContentBlock.Text(createSimpleText("2. Inefficient for large ranges (k >> n) due to memory consumption.")),
                            ContentBlock.Text(createSimpleText("3. Cannot handle complex data structures without additional processing."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[4],
                        title = "Importance of Counting Sort",
                        description = "Understand why Counting Sort is significant in certain scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Counting Sort is crucial in scenarios requiring high efficiency and stability for sorting small, non-negative integers.")),
                            ContentBlock.Text(createSimpleText("Examples include sorting exam scores, categorizing data, or preprocessing for algorithms like Radix Sort.")),
                            ContentBlock.Text(createSimpleText("Its simplicity and speed make it a valuable tool in competitive programming and specialized applications."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 10
            Lesson(
                id = DSABeginnerStageIds.lesson10,
                title = "Radix Sort",
                description = "Learn how the Radix Sort algorithm works and understand the importance of stable sorting!",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson10_subs[0],
                        title = "Introduction to Radix Sort",
                        description = "Understand the basics of the Radix Sort algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The Radix Sort algorithm sorts an array by processing individual digits of the numbers. It starts with the least significant digit (rightmost digit) and progresses to the most significant digit.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Radix Sort is a non-comparative sorting algorithm that only works with non-negative integers. It groups numbers into buckets based on their digits, sorts them, and merges them back in sequence.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson10_subs[1],
                        title = "Manual Walkthrough",
                        description = "Step through an example to understand how Radix Sort works in practice.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's sort the array {170, 45, 75, 90, 802, 24, 2, 66} step-by-step.")),
                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Process the least significant digit (units place).")),
                            ContentBlock.Text(createSimpleText("Initial array: [170, 45, 75, 90, 802, 24, 2, 66].")),
                            ContentBlock.Text(createSimpleText("Buckets after sorting by units place: [170, 90, 802] | [2] | [24] | [45, 75, 66].")),
                            ContentBlock.Text(createSimpleText("Merged array after Pass 1: [802, 2, 24, 45, 66, 75, 170, 90].")),
                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Process the tens place.")),
                            ContentBlock.Text(createSimpleText("Buckets after sorting by tens place: [802, 2] | [24] | [45] | [66] | [75] | [170, 90].")),
                            ContentBlock.Text(createSimpleText("Merged array after Pass 2: [802, 2, 24, 45, 66, 75, 170, 90].")),
                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Process the hundreds place.")),
                            ContentBlock.Text(createSimpleText("Buckets after sorting by hundreds place: [2, 24, 45, 66, 75, 90] | [170] | [802].")),
                            ContentBlock.Text(createSimpleText("Merged array after Pass 3: [2, 24, 45, 66, 75, 90, 170, 802].")),
                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Radix Sort is complete, and the array is sorted: [2, 24, 45, 66, 75, 90, 170, 802].")),
                            ContentBlock.Text(createSimpleText("Radix Sort works by processing digits from the least significant to the most significant, sorting the array step-by-step.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson10_subs[2],
                        title = "Implementation of Radix Sort",
                        description = "Code example of Radix Sort in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    using namespace std;

                    // Function to get the maximum value in the array
                    int getMax(vector<int>& arr) {
                        int maxVal = arr[0];
                        for (int num : arr) {
                            if (num > maxVal) maxVal = num;
                        }
                        return maxVal;
                    }

                    // Counting sort based on the digit represented by exp
                    void countingSort(vector<int>& arr, int exp) {
                        int n = arr.size();
                        vector<int> output(n); // Output array
                        int count[10] = {0};

                        // Count occurrences of each digit
                        for (int i = 0; i < n; i++) {
                            int index = (arr[i] / exp) % 10;
                            count[index]++;
                        }

                        // Update count[i] to store actual positions
                        for (int i = 1; i < 10; i++) {
                            count[i] += count[i - 1];
                        }

                        // Build the output array
                        for (int i = n - 1; i >= 0; i--) {
                            int index = (arr[i] / exp) % 10;
                            output[count[index] - 1] = arr[i];
                            count[index]--;
                        }

                        // Copy the sorted values back to the original array
                        for (int i = 0; i < n; i++) {
                            arr[i] = output[i];
                        }
                    }

                    // Radix Sort function
                    void radixSort(vector<int>& arr) {
                        int maxVal = getMax(arr);

                        // Perform counting sort for each digit
                        for (int exp = 1; maxVal / exp > 0; exp *= 10) {
                            countingSort(arr, exp);
                        }
                    }

                    int main() {
                        vector<int> arr = {170, 45, 75, 90, 802, 24, 2, 66};
                        radixSort(arr);

                        cout << "Sorted array: ";
                        for (int num : arr) {
                            cout << num << " ";
                        }
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson10_subs[3],
                        title = "Importance of Stable Sorting",
                        description = "Understand why stability is crucial in Radix Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Radix Sort relies on stable sorting to maintain the relative order of elements with the same value. This ensures that previously sorted digits are preserved while processing the next digit.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Importance of Radix Sort: It is a highly efficient algorithm for sorting integers and performs better than comparison-based algorithms in certain scenarios. Understanding it gives you insights into the utility of stable sorting techniques.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 11
            Lesson(
                id = DSABeginnerStageIds.lesson11,
                title = "Merge Sort",
                description = "Learn how the Merge Sort algorithm works and explore its divide-and-conquer approach to sorting!",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[0],
                        title = "Introduction to Merge Sort",
                        description = "Understand the basics of the Merge Sort algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Merge Sort is a divide-and-conquer sorting algorithm that breaks down an array into smaller arrays, sorts them, and merges them back to produce the final sorted array. It is known for its efficiency and stability.
                        """.trimIndent(),
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        The algorithm works in two main stages:
                        Divide: Recursively split the array into halves until each sub-array has only one element.
                        Conquer: Merge the sub-arrays back together, comparing and sorting elements as they are merged.
                        """.trimIndent(),
                                    listOf("Divide", "Conquer")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually walk through an example to understand how Merge Sort works.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's manually sort the array [38, 27, 43, 3, 9, 82, 10] step-by-step.")),
                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Split the array into two halves: [38, 27, 43] and [3, 9, 82, 10].")),
                            ContentBlock.Text(createSimpleText("Further split [38, 27, 43] into [38], [27], and [43].")),
                            ContentBlock.Text(createSimpleText("Further split [3, 9, 82, 10] into [3, 9] and [82, 10].")),
                            ContentBlock.Text(createSimpleText("Continue dividing until each sub-array has one element.")),
                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Start merging the divided sub-arrays step-by-step:")),
                            ContentBlock.Text(createSimpleText("Merge [38] and [27] into [27, 38].")),
                            ContentBlock.Text(createSimpleText("Merge [27, 38] and [43] into [27, 38, 43].")),
                            ContentBlock.Text(createSimpleText("Merge [3] and [9] into [3, 9].")),
                            ContentBlock.Text(createSimpleText("Merge [82] and [10] into [10, 82].")),
                            ContentBlock.Text(createSimpleText("Merge [3, 9] and [10, 82] into [3, 9, 10, 82].")),
                            ContentBlock.Text(createSimpleText("Finally, merge [27, 38, 43] and [3, 9, 10, 82] into [3, 9, 10, 27, 38, 43, 82].")),
                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("The array is now fully sorted: [3, 9, 10, 27, 38, 43, 82].")),
                            ContentBlock.Text(createSimpleText("Merge Sort works by repeatedly dividing the array into halves and then merging them back together in sorted order."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[2],
                        title = "Implementation of Merge Sort",
                        description = "Code example of Merge Sort in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    using namespace std;

                    // Function to merge two sub-arrays
                    void merge(vector<int>& arr, int left, int mid, int right) {
                        int n1 = mid - left + 1;
                        int n2 = right - mid;

                        vector<int> L(n1), R(n2);

                        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
                        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

                        int i = 0, j = 0, k = left;
                        while (i < n1 && j < n2) {
                            if (L[i] <= R[j]) {
                                arr[k] = L[i];
                                i++;
                            } else {
                                arr[k] = R[j];
                                j++;
                            }
                            k++;
                        }

                        while (i < n1) arr[k++] = L[i++];
                        while (j < n2) arr[k++] = R[j++];
                    }

                    // Recursive Merge Sort function
                    void mergeSort(vector<int>& arr, int left, int right) {
                        if (left >= right) return;

                        int mid = left + (right - left) / 2;
                        mergeSort(arr, left, mid);
                        mergeSort(arr, mid + 1, right);
                        merge(arr, left, mid, right);
                    }

                    int main() {
                        vector<int> arr = {12, 8, 9, 3, 11, 5, 4};
                        mergeSort(arr, 0, arr.size() - 1);

                        cout << "Sorted array: ";
                        for (int num : arr) cout << num << " ";
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[4],
                        title = "Advantages of Merge Sort",
                        description = "Learn why Merge Sort is widely used.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Merge Sort is known for:
                        Efficiency: It has a predictable O(n log n) time complexity for all cases.
                        Stability: It preserves the relative order of equal elements, which is crucial for certain applications.
                        Simplicity: Its recursive nature makes it conceptually easy to understand.
                        """.trimIndent(),
                                    listOf("Efficiency", "Stability", "Simplicity")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson11_subs[5],
                        title = "Importance of Merge Sort",
                        description = "Understand why Merge Sort is essential in computer science.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Merge Sort is an essential algorithm for understanding divide-and-conquer techniques. It demonstrates how complex problems can be broken down into smaller, manageable tasks and solved efficiently through recursion.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The stability of Merge Sort makes it ideal for sorting linked lists and external data storage systems, where maintaining the relative order of equal elements is critical. It is widely used in applications requiring reliable and predictable sorting performance.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "By learning Merge Sort, you gain a foundation for understanding advanced algorithms in data processing, database management, and scientific computing. Its efficiency and versatility make it a cornerstone in the study of sorting algorithms.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 12
            Lesson(
                id = DSABeginnerStageIds.lesson12,
                title = "Linear Search",
                description = "Learn the fundamentals of Linear Search and understand how to implement it.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson12_subs[0],
                        title = "Introduction to Linear Search",
                        description = "Understand the basics of the Linear Search algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The Linear Search algorithm searches through an array and returns the index of the value it searches for. It is one of the simplest and easiest search algorithms to understand and implement.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Linear Search works on both sorted and unsorted arrays. However, it is less efficient than other search algorithms, such as Binary Search, especially for large datasets.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson12_subs[1],
                        title = "How Linear Search Works",
                        description = "Learn step-by-step how Linear Search operates.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Steps for Linear Search:
                        1. Start from the first element of the array.
                        2. Compare the current element with the target value.
                        3. If a match is found, return the index of the element.
                        4. If no match is found after checking all elements, return -1.
                        """.trimIndent(),
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
                    Example:
                    Array: [12, 8, 9, 11, 5, 11]
                    Target: 11
                    
                    Step 1: Check element at index 0 → 12 (Not a match)
                    Step 2: Check element at index 1 → 8 (Not a match)
                    Step 3: Check element at index 2 → 9 (Not a match)
                    Step 4: Check element at index 3 → 11 (Match found!)
                    
                    Result: Target found at index 3.
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson12_subs[2],
                        title = "Manual Walkthrough",
                        description = "Manually walk through an example to understand how Merge Sort works step-by-step.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's manually sort the array [38, 27, 43, 3, 9, 82, 10] step-by-step.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pass 1:",
                                    listOf("Pass 1:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Step 1: Split the array into two halves: [38, 27, 43] and [3, 9, 82, 10].")),
                            ContentBlock.Text(createSimpleText("Step 2: Further split [38, 27, 43] into [38], [27], and [43].")),
                            ContentBlock.Text(createSimpleText("Step 3: Further split [3, 9, 82, 10] into [3, 9] and [82, 10].")),
                            ContentBlock.Text(createSimpleText("Step 4: Continue dividing until each sub-array has one element.")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pass 2:",
                                    listOf("Pass 2:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Step 1: Start merging the smallest divided sub-arrays step-by-step.")),
                            ContentBlock.Text(createSimpleText("Merge [38] and [27] into [27, 38].")),
                            ContentBlock.Text(createSimpleText("Merge [27, 38] and [43] into [27, 38, 43].")),
                            ContentBlock.Text(createSimpleText("Merge [3] and [9] into [3, 9].")),
                            ContentBlock.Text(createSimpleText("Merge [82] and [10] into [10, 82].")),
                            ContentBlock.Text(createSimpleText("Merge [3, 9] and [10, 82] into [3, 9, 10, 82].")),
                            ContentBlock.Text(createSimpleText("Finally, merge [27, 38, 43] and [3, 9, 10, 82] into [3, 9, 10, 27, 38, 43, 82].")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pass 3:",
                                    listOf("Pass 3:")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("The array is now fully sorted: [3, 9, 10, 27, 38, 43, 82].")),
                            ContentBlock.Text(createSimpleText("Merge Sort works by repeatedly dividing the array into halves and then merging them back together in sorted order."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson12_subs[3],
                        title = "Implementation of Linear Search",
                        description = "Code example of Linear Search in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    // Linear Search Implementation in C++
                    #include <iostream>
                    using namespace std;

                    int linearSearch(int arr[], int size, int targetVal) {
                        for (int i = 0; i < size; i++) {
                            if (arr[i] == targetVal) {
                                return i;  // Return index if match found
                            }
                        }
                        return -1;  // Return -1 if target value is not found
                    }

                    int main() {
                        int arr[] = {3, 7, 2, 9, 5};
                        int size = sizeof(arr) / sizeof(arr[0]);
                        int targetVal = 9;

                        int result = linearSearch(arr, size, targetVal);

                        if (result != -1) {
                            cout << "Value " << targetVal << " found at index " << result << endl;
                        } else {
                            cout << "Value " << targetVal << " not found" << endl;
                        }
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson12_subs[4],
                        title = "Importance of Linear Search",
                        description = "Understand why Linear Search is a fundamental algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Linear Search is an essential algorithm for understanding the basics of search techniques. It introduces the concept of sequential search, where each element is checked one by one, making it straightforward to grasp.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Its simplicity and applicability to both sorted and unsorted datasets make Linear Search versatile for smaller datasets or when other search methods are not feasible. It provides a clear demonstration of algorithmic problem-solving and iterative logic.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "By learning Linear Search, you build a strong foundation for exploring more complex algorithms like Binary Search and Hashing. Its step-by-step approach helps reinforce the importance of understanding fundamental algorithms in computer science.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 13
            Lesson(
                id = DSABeginnerStageIds.lesson13,
                title = "Binary Search",
                description = "Learn how the Binary Search algorithm works and why it is faster than linear search for sorted arrays.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson13_subs[0],
                        title = "Introduction to Binary Search",
                        description = "Understand the basics of the Binary Search algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Binary Search is an efficient algorithm for finding a target value within a sorted array. It reduces the search area by half at each step, resulting in a logarithmic time complexity.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Unlike linear search, Binary Search requires the input array to be sorted. It uses a divide-and-conquer approach to locate the target value.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson13_subs[1],
                        title = "Manual Walkthrough",
                        description = "A step-by-step manual walkthrough of the Binary Search algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through an example to understand how Binary Search works.")),
                            ContentBlock.Text(createSimpleText("Array: [1, 3, 5, 7, 9, 11, 13]")),
                            ContentBlock.Text(createSimpleText("Target: 9")),

                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Step 1: Initialize two pointers. Left pointer = 0, Right pointer = 6.")),
                            ContentBlock.Text(createSimpleText("Step 2: Calculate the middle index: mid = (0 + 6) // 2 = 3. The value at index 3 is 7.")),
                            ContentBlock.Text(createSimpleText("Step 3: Since 7 < 9, adjust the left pointer to mid + 1. Left pointer = 4.")),

                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Step 4: Recalculate the middle index: mid = (4 + 6) // 2 = 5. The value at index 5 is 11.")),
                            ContentBlock.Text(createSimpleText("Step 5: Since 11 > 9, adjust the right pointer to mid - 1. Right pointer = 4.")),

                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Step 6: Now, Left pointer = 4 and Right pointer = 4. Check the middle value at index 4, which is 9. This is a match!")),
                            ContentBlock.Text(createSimpleText("Step 7: Return index 4 as the target value has been found.")),

                            ContentBlock.Text(createSimpleText("Binary Search efficiently narrows down the search range and finds the target value in logarithmic time.")),
                            ContentBlock.Text(createSimpleText("The array is sorted, and we use the divide-and-conquer method to reduce the search space at each step."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson13_subs[2],
                        title = "Implementation of Binary Search",
                        description = "Code example of Binary Search in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
            #include <iostream>
            #include <vector>

            int binary_search(const std::vector<int>& arr, int target) {
                int left = 0, right = arr.size() - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] == target) {
                        return mid;
                    }
                    else if (arr[mid] < target) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
                return -1;
            }

            int main() {
                std::vector<int> my_array = {1, 3, 5, 7, 9, 11, 13};
                int target = 9;
                int result = binary_search(my_array, target);
                if (result != -1) {
                    std::cout << "Target found at index " << result << std::endl;
                } else {
                    std::cout << "Target not found." << std::endl;
                }
                return 0;
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson13_subs[3],
                        title = "Binary Search: Time Complexity",
                        description = "Understand why Binary Search is efficient.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Binary Search is efficient due to its logarithmic time complexity:
                        At each step, it reduces the search area by half.
                        Even in the worst-case scenario, it only performs log₂(n) comparisons.
                        This makes it faster than linear search (O(n)), especially for large datasets.
                        """.trimIndent(),
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson13_subs[4],
                        title = "Importance of Binary Search",
                        description = "Understand why Binary Search is essential in computer science.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Binary Search is a key algorithm that demonstrates the efficiency of divide-and-conquer strategies. It forms the foundation for understanding more advanced algorithms in various areas of computer science, such as searching in databases and file systems.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "By learning Binary Search, you gain insight into efficient data search techniques, crucial for optimizing algorithms in large-scale applications. It is one of the most commonly used search algorithms and forms the basis for more complex searching strategies.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Mastering Binary Search is essential for building more complex algorithms and is a stepping stone toward understanding other crucial algorithms, like Hashing and Graph Search algorithms.",
                                    listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            )
    )
}