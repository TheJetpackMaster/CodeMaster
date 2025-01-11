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
                                question = "What is the 6th number in the Fibonacci sequence on page one?",
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
                title = "Bubble Sort",
                description = "Learn the Bubble Sort algorithm, its implementation, and its time complexity.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[0],
                        title = "Introduction to Bubble Sort",
                        description = "What is Bubble Sort, and how does it work?",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Bubble Sort is an algorithm that sorts an array from the lowest value to the highest value.")),
                            ContentBlock.Text(createSimpleText("The name 'Bubble' comes from the way higher values 'bubble up' to their correct position.")),
                            ContentBlock.Text(createSimpleText("Bubble Sort repeatedly steps through the array, compares adjacent elements, and swaps them if they are in the wrong order.")),
                            ContentBlock.Text(createSimpleText("This process is repeated until the array is sorted."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson5_subs[1],
                        title = "Manual Run Through",
                        description = "Manually understand how Bubble Sort works.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's take an example of an unsorted array: [7, 12, 9, 11, 3].")),
                            ContentBlock.Text(createSimpleText("Step 1: Compare the first two values (7 and 12). No swap is needed.")),
                            ContentBlock.Text(createSimpleText("Step 2: Compare 12 and 9. Swap them to make [7, 9, 12, 11, 3].")),
                            ContentBlock.Text(createSimpleText("Step 3: Compare 12 and 11. Swap them to make [7, 9, 11, 12, 3].")),
                            ContentBlock.Text(createSimpleText("Step 4: Compare 12 and 3. Swap them to make [7, 9, 11, 3, 12].")),
                            ContentBlock.Text(createSimpleText("At the end of the first pass, the largest value (12) is at the correct position.")),
                            ContentBlock.Text(createSimpleText("This process is repeated until the entire array is sorted.")),
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
                        title = "Quiz",
                        description = "Test your understanding of Bubble Sort.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the best-case time complexity of Bubble Sort?",
                                options = listOf("O(n)", "O(n^2)", "O(log n)", "O(n log n)"),
                                correctAnswer = "O(n)",
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
                title = "Selection Sort",
                description = "Understand how Selection Sort works: its process, implementation, and optimization! 🔄",
                lessonContents = listOf(
                    LessonContent(
                        id = DSABeginnerStageIds.lesson6_subs[0],
                        title = "What is Selection Sort?",
                        description = "Learn the basics of the Selection Sort algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The Selection Sort algorithm repeatedly selects the smallest element and moves it to its correct position in the sorted portion of the array.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "It has a time complexity of O(n²) and is easy to understand but not the most efficient for larger datasets."
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
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Consider this array: [7, 12, 9, 11, 3].",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Step 1: Find the smallest value (3) and move it to the front.\n" +
                                            "Step 2: Look at the unsorted portion and repeat the process until the array is sorted."
                                )
                            ),
                            ContentBlock.Code(
                                """
Step 1: [3, 12, 9, 11, 7]
Step 2: [3, 7, 9, 11, 12]
Sorted array: [3, 7, 9, 11, 12]
""".trimIndent()
                            )
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
                        title = "Insertion Sort Overview",
                        description = "Introduction to the Insertion Sort algorithm.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion Sort works by gradually building a sorted part of the array, one element at a time. It compares each unsorted element with the sorted part and inserts it into the right position. This process continues until the entire array is sorted.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("The algorithm's complexity is O(n^2), making it slower for large arrays.")),
                            ContentBlock.Text(createSimpleText("Insertion Sort works best with small or partially sorted arrays."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson7_subs[1],
                        title = "Manual Run Through",
                        description = "Manually walk through the steps of Insertion Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let’s manually go through an unsorted array to see how Insertion Sort works:")),
                            ContentBlock.Text(createSimpleText("Start with an unsorted array: [7, 12, 9, 11, 3]")),
                            ContentBlock.Text(createSimpleText("Step 1: The first value (7) is considered the sorted part of the array.")),
                            ContentBlock.Text(createSimpleText("Step 2: The second value (12) is already in the correct place.")),
                            ContentBlock.Text(createSimpleText("Step 3: Insert the third value (9) into the sorted part, resulting in [7, 9, 12, 11, 3].")),
                            ContentBlock.Text(createSimpleText("Step 4: Insert 11 into the correct position, resulting in [7, 9, 11, 12, 3].")),
                            ContentBlock.Text(createSimpleText("Step 5: Insert the last value (3) in front of all values to get the sorted array: [3, 7, 9, 11, 12]."))
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
        int insert_index = i;
        for (int j = i - 1; j >= 0; j--) {
            if (my_array[j] > current_value) {
                insert_index = j;
            }
        }
        my_array.insert(my_array.begin() + insert_index, current_value);
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
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 8
            Lesson(
                id = DSABeginnerStageIds.lesson8,
                title = "Quicksort Algorithm",
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
                        title = "Manual Run Through",
                        description = "Walk through the algorithm with an example to better understand its steps.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let’s run Quicksort on an unsorted array: [11, 9, 12, 7, 3]")),

                            ContentBlock.Text(createSimpleText("1. Start with the array: [11, 9, 12, 7, 3]")),
                            ContentBlock.Text(createSimpleText("2. Choose the pivot element (last element, 3).")),
                            ContentBlock.Text(createSimpleText("3. Rearrange the elements to have values less than the pivot to its left: [3, 9, 12, 7, 11]")),
                            ContentBlock.Text(createSimpleText("4. Recursively apply the same process for the sub-arrays.")),
                            ContentBlock.Text(createSimpleText("After recursively sorting, the array becomes: [3, 7, 9, 11, 12]")),
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
                    #using namespace std;

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
                            ContentBlock.Text(createSimpleText("In this C++ implementation, the `partition` function selects a pivot and rearranges elements accordingly. The `quicksort` function is recursively called on the sub-arrays.")),
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
                        title = "Quiz: Quicksort Basics",
                        description = "Test your understanding of the Quicksort algorithm.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the time complexity of the Quicksort algorithm in the best case?",
                                options = listOf("O(n^2)", "O(n log n)", "O(n)", "O(log n)"),
                                correctAnswer = "O(n log n)",
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
                                    "Conditions for Counting Sort: values must be non-negative integers, and the range of possible values (k) should be smaller than the number of elements (n).",
                                    listOf("k", "n")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson9_subs[1],
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
                        id = DSABeginnerStageIds.lesson9_subs[2],
                        title = "Manual Walkthrough",
                        description = "Understand Counting Sort through a manual walkthrough.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's sort the array {2, 3, 0, 2, 3, 2} step-by-step.")),
                            ContentBlock.Code(
                                """
                    // Initial array
                    arr = [2, 3, 0, 2, 3, 2]
                    
                    // Step 1: Count occurrences
                    countArray = [1, 0, 3, 2]  // Count values 0, 1, 2, 3
                    
                    // Step 2: Cumulative counts
                    countArray = [1, 1, 4, 6]  // Modify to cumulative counts
                    
                    // Step 3: Sort the array
                    sortedArray = [0, 2, 2, 2, 3, 3]  // Final sorted result
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
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
                        title = "Step-by-Step Explanation",
                        description = "Learn how Radix Sort works step by step.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        How Radix Sort works:
                        1. Start with the least significant digit.
                        2. Sort numbers based on the digit in focus.
                        3. Move numbers to buckets, merge them back into the array.
                        4. Progress to the next digit and repeat until all digits are processed.
                        """.trimIndent(),
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
                    // Example:
                    Input: [170, 45, 75, 90, 802, 24, 2, 66]
                    Step 1: Sort by the least significant digit.
                    Step 2: Group numbers into buckets.
                    Step 3: Merge numbers from buckets back into the array.
                    Repeat until the most significant digit is sorted.
                    """.trimIndent()
                            )
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
                        title = "Quiz",
                        description = "Test your knowledge with a quiz.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which digit is processed first in Radix Sort?",
                                options = listOf("Most significant digit", "Least significant digit", "Random digit"),
                                correctAnswer = "Least significant digit",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = DSABeginnerStageIds.lesson10_subs[4],
                        title = "Importance of Stable Sorting",
                        description = "Understand why stability is crucial in Radix Sort.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Radix Sort relies on stable sorting to maintain the relative order of elements with the same value. This ensures that previously sorted digits are preserved while processing the next digit.",
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