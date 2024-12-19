package com.codemaster.codemasterapp.main.AllCourses.CppCourse

import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun cppExpertCourse(): Stage {

    return Stage(
        id = "cpp_expert_stage",
        title = "Expert",
        lessons = listOf(

            // Lesson 1 : Welcome to the Expert Stage
            Lesson(
                id = "expert_cpp1",
                title = "Welcome to Expert Stage",
                description = "Congrats on leveling up! Ready for advanced coding challenges?",
                lessonContents = listOf(

                    // Sub-lesson 1: Welcome to the Expert Stage!
                    LessonContent(
                        id = "expert_cpp1_sub1",
                        title = "Welcome to the Expert Stage!",
                        description = "You've mastered the basics—now it's time for advanced challenges.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Welcome to the Expert Stage! You've completed the beginner and intermediate levels and are now ready for advanced challenges.",
                                    styledText = listOf("Expert Stage")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This stage will help you improve your problem-solving skills and write better code.",
                                    styledText = listOf("problem-solving skills")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 2: What is Problem-Solving?
                    LessonContent(
                        id = "expert_cpp1_sub2",
                        title = "What is Problem-Solving?",
                        description = "An introduction to problem-solving in programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Problem-solving in programming means breaking down complex problems into smaller, manageable tasks and solving them step by step.",
                                    styledText = listOf("breaking down complex problems")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this stage, you’ll learn techniques to handle coding challenges with confidence.",
                                    styledText = listOf("coding challenges")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Tips for Problem-Solving
                    LessonContent(
                        id = "expert_cpp1_sub3",
                        title = "Tips for Problem-Solving",
                        description = "How to approach coding problems effectively.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Follow these tips to solve coding problems effectively:",
                                    styledText = listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "1. Understand the problem: Identify what is being asked.\n" +
                                            "2. Break it down: Divide the problem into smaller steps.\n" +
                                            "3. Think of edge cases: Handle unusual inputs.\n" +
                                            "4. Test frequently: Catch errors early.\n" +
                                            "5. Stay persistent: Practice improves problem-solving.",
                                    styledText = listOf(
                                        "1. Understand the problem:",
                                        "2. Break it down:",
                                        "3. Think of edge cases:",
                                        "4. Test frequently:",
                                        "5. Stay persistent:"

                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: What to Expect in the Expert Stage
                    LessonContent(
                        id = "expert_cpp1_sub4",
                        title = "What to Expect?",
                        description = "A preview of the exciting challenges ahead.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You’ll explore advanced topics like pattern printing, nested loops, and optimization techniques. Each lesson will challenge your coding skills.",
                                    styledText = listOf("advanced topics")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Prepare to write smarter, more efficient code as you dive deeper into C++ programming!",
                                    styledText = listOf("efficient code")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "expert_cpp1_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of problem-solving basics.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the first step in solving a programming problem?",
                                options = listOf(
                                    "Start coding immediately",
                                    "Understand the problem",
                                    "Search for similar problems online",
                                    "Run the program to see the output"
                                ),
                                correctAnswer = "Understand the problem",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
               status = LessonStatus.ACTIVE
            ),

            // Lesson 2 : Easy Peasy - Problems
            Lesson(
                id = "expert_cpp2",
                title = "Easy Peasy - Problems",
                description = "Let's practice basic math problems! We will start with simple addition and percentage calculation.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem 1 - Add Two Numbers and Print the Sum
                    LessonContent(
                        id = "expert_cpp2_sub1",
                        title = "Add Two Numbers and Print the Sum",
                        description = "Create a program that adds two numbers and prints the result.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: Create a program that adds two numbers and prints their sum. We'll take two numbers as input and print their sum.",
                                    styledText = listOf("add two numbers", "print the sum")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "First, you'll need to take input from the user for the two numbers. Then, you'll calculate the sum using the addition operator and print the result.",
                                    styledText = listOf("take input", "calculate the sum")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving Problem 1
                    LessonContent(
                        id = "expert_cpp2_sub2",
                        title = "Hint",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, you'll need to declare two int variables for the numbers, get input from the user using cin>>, perform the addition operation, and print the result using cout<<.",
                                    styledText = listOf("cin>>", "cout<<")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for Problem 1
                    LessonContent(
                        id = "expert_cpp2_sub3",
                        title = "Solution",
                        description = "Here’s the solution for adding two numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                        #include <iostream>
                        using namespace std;

                        int main() {
                            int num1, num2;
                            cout << "Enter the first number: ";
                            cin >> num1;
                            cout << "Enter the second number: ";
                            cin >> num2;
                            
                            int sum = num1 + num2;
                            
                            cout << "The sum of " << num1 << " and " << num2 << " is: " << sum << endl;
                            return 0;
                        }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code for Problem
                    LessonContent(
                        id = "expert_cpp2_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s understand the solution code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The solution, we declare two integer variables, 'num1' and 'num2', and prompt the user to input values for both. Then, we calculate the sum using the '+' operator and print the result using cout.",
                                    styledText = listOf("cout")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This is a basic example of using input, performing arithmetic, and displaying the output in C++.",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "expert_cpp2_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which function is used in C++ to get user input?",
                                options = listOf(
                                    "cout",
                                    "scanf()",
                                    "cin",
                                    "main()"
                                ),
                                correctAnswer = "cin",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),


                    // Sub-lesson 5: Problem 2 - Calculate Percentage
                    LessonContent(
                        id = "expert_cpp2_sub6",
                        title = "Calculate Percentage",
                        description = "Now, let’s calculate the percentage of a number.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The Problem: Create a program that calculates the percentage. You’ll take the total marks and obtained marks as input and calculate the percentage.",
                                    styledText = listOf("calculate the percentage")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The formula to calculate percentage is: \n" +
                                            "(Obtained Marks / Total Marks) * 100",
                                    styledText = listOf("percentage formula")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: Hint for Solving Problem 2
                    LessonContent(
                        id = "expert_cpp2_sub7",
                        title = "Hint",
                        description = "Approach to calculate the percentage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, declare three float variables: 'totalMarks', 'obtainedMarks', and 'percentage'. Use the formula to calculate the percentage and then display it using cout function.",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 8: Solution for Problem 2
                    LessonContent(
                        id = "expert_cpp2_sub8",
                        title = "Solution",
                        description = "Here’s the solution for calculating the percentage.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                        #include <iostream>
                        using namespace std;

                        int main() {
                            float totalMarks, obtainedMarks, percentage;
                            
                            cout << "Enter the total marks: ";
                            cin >> totalMarks;
                            cout << "Enter the obtained marks: ";
                            cin >> obtainedMarks;
                            
                            percentage = (obtainedMarks / totalMarks) * 100;
                            
                            cout << "Your percentage is: " << percentage << "%" << endl;
                            return 0;
                        }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 9: Explanation of the Code for Problem 2
                    LessonContent(
                        id = "expert_cpp2_sub9",
                        title = "Explanation of the Code",
                        description = "Let’s break down the code for calculating the percentage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, we declared three variables: 'totalMarks', 'obtainedMarks', and 'percentage'. We take the total and obtained marks as input from the user. Then, we used the formula to calculate the percentage and print the result.",
                                    styledText = listOf(
                                        "declare variables",
                                        "calculate the percentage"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This approach makes use of basic arithmetic and is a great example of how to work with floating-point numbers and user input.",
                                    styledText = listOf("floating-point")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),


                    // Sub-lesson 10: Quiz Time!
                    LessonContent(
                        id = "expert_cpp2_sub10",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of the problems.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the formula for calculating percentage?",
                                options = listOf(
                                    "(Obtained Marks * 100) / Total Marks",
                                    "(Obtained Marks / Total Marks) * 100",
                                    "(Total Marks / Obtained Marks) * 100",
                                    "Obtained Marks + Total Marks"
                                ),
                                correctAnswer = "(Obtained Marks / Total Marks) * 100",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),


                    LessonContent(
                        id = "expert_cpp2_sub11",
                        title = "Practice Time!",
                        description = "Now it’s time to practice! The more you solve, the better you get!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Practice basic operations like addition, subtraction, multiplication, and division. Try solving them on your own first.",
                                    styledText = listOf("practice", "solve")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Consistency is key. Keep practicing and improve your skills!",
                                    styledText = listOf("Consistency", "improve")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Great job! Keep going and keep getting better.",
                                    styledText = listOf("Great job", "better")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 3 : THE MATH
            Lesson(
                id = "expert_cpp3",
                title = "THE MATH",
                description = "Let’s work on some more math problems! In this lesson, you’ll learn how to check if a number is even or odd, and calculate the average of three numbers.",
                lessonContents = listOf(
                    // Sub-lesson 1: Problem 1 - Check if a Number is Even or Odd
                    LessonContent(
                        id = "expert_cpp3_sub1",
                        title = "is Even or Odd",
                        description = "Write a program to check whether a given number is even or odd.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: Write a program to check if a number is even or odd. The number is even if it's divisible by 2, and odd if it’s not.",
                                    styledText = listOf("even", "odd", "divisible by 2")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, you will take an input number and use the modulus operator '%' to check if the number is divisible by 2.",
                                    styledText = listOf("modulus operator", "%")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving Problem 1
                    LessonContent(
                        id = "expert_cpp3_sub2",
                        title = "Hint",
                        description = "Here’s a hint for solving the even/odd problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To check if a number is even or odd, use the modulus operator '%'. If the result of the number % 2 is 0, it’s even; otherwise, it’s odd.",
                                    styledText = listOf("%", "even", "odd")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for Problem 1
                    LessonContent(
                        id = "expert_cpp3_sub3",
                        title = "Solution",
                        description = "Here’s the solution for checking even or odd.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                    #include <iostream>
                    using namespace std;

                    int main() {
                        int number;
                        cout << "Enter a number: ";
                        cin >> number;
                        
                        if (number % 2 == 0) {
                            cout << "The number " << number << " is even." << endl;
                        } else {
                            cout << "The number " << number << " is odd." << endl;
                        }
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code for Problem 1
                    LessonContent(
                        id = "expert_cpp3_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution for checking even or odd.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the code, we ask the user to input a number and check if it’s divisible by 2 using the modulus operator. If the remainder is 0, it’s even. Otherwise, it’s odd.",
                                    styledText = listOf("modulus operator")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This is a basic example of using conditional statements to solve a problem.",
                                    styledText = listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "expert_cpp3_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge about checking even or odd.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which operator checks divisibility in C++?",
                                options = listOf(
                                    "==",
                                    "%",
                                    "/",
                                    "+"
                                ),
                                correctAnswer = "%",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Problem 2 - Calculate the Average of Three Numbers
                    LessonContent(
                        id = "expert_cpp3_sub6",
                        title = "Calculate the Average of Three Numbers",
                        description = "Create a program that calculates the average of three numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: Write a program to calculate the average of three numbers. The formula for average is: (num1 + num2 + num3) / 3.",
                                    styledText = listOf(
                                        "average",
                                        "formula",
                                        "(num1 + num2 + num3) / 3"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You’ll take three numbers as input from the user and calculate their average using the formula.",
                                    styledText = listOf("input", "calculate average")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: Hint for Solving Problem 2
                    LessonContent(
                        id = "expert_cpp3_sub7",
                        title = "Hint",
                        description = "Here’s a hint for calculating the average.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To calculate the average, declare three float variables for the numbers. Use the formula to sum them and divide by 3 to get the average.",
                                    styledText = listOf("sum", "divide by 3")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 8: Solution for Problem 2
                    LessonContent(
                        id = "expert_cpp3_sub8",
                        title = "Solution",
                        description = "Here’s the solution for calculating the average.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                    #include <iostream>
                    using namespace std;

                    int main() {
                        float num1, num2, num3, average;
                        
                        cout << "Enter three numbers: ";
                        cin >> num1 >> num2 >> num3;
                        
                        average = (num1 + num2 + num3) / 3;
                        
                        cout << "The average of " << num1 << ", " << num2 << ", " << num3 << " is: " << average << endl;
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 9: Explanation of the Code for Problem 2
                    LessonContent(
                        id = "expert_cpp3_sub9",
                        title = "Explanation of the Code",
                        description = "Let’s understand how the average is calculated in the solution.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "We declare four float variables to store the three numbers and the calculated average. The program takes input for the three numbers, calculates the sum, and then divides by 3 to get the average.",
                                    styledText = listOf("sum", "divide")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This is a great example of how to use basic arithmetic and take multiple inputs.",
                                    styledText = listOf("basic arithmetic", "inputs")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 10: Quiz Time!
                    LessonContent(
                        id = "expert_cpp3_sub10",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of calculating averages.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the formula for calculating the average?",
                                options = listOf(
                                    "(num1 + num2 + num3) / 3",
                                    "(num1 * num2 * num3) / 3",
                                    "(num1 + num2) / 2",
                                    "num1 + num2 + num3"
                                ),
                                correctAnswer = "(num1 + num2 + num3) / 3",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 11: Practice Time!
                    LessonContent(
                        id = "expert_cpp3_sub11",
                        title = "Practice Time!",
                        description = "Practice solving problems to solidify your skills!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now it's time to practice! Try solving more problems to get comfortable with even/odd checks and calculating averages.",
                                    styledText = listOf("practice", "comfortable")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Keep practicing and improving your problem-solving skills!",
                                    styledText = listOf("Keep practicing", "improving")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            ),


            // Lesson 4 : Voting Eligibility
            Lesson(
                id = "expert_cpp4",
                title = "Voting Eligibility",
                description = "Learn how to use conditional statements to check if a person is eligible to vote based on their age.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem - Check Voting Eligibility
                    LessonContent(
                        id = "expert_cpp3_sub1",
                        title = "Check Voting Eligibility",
                        description = "Create a program that checks if a person is eligible to vote based on their age. If the person’s age is 18 or older, print 'Eligible to Vote'. If not, print 'Not Eligible to Vote'.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: Create a program that checks if a person is eligible to vote. The program should take the user's age as input and print whether the person is eligible to vote or not.",
                                    styledText = listOf("eligible", "vote")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving Problem
                    LessonContent(
                        id = "expert_cpp3_sub2",
                        title = "Hint",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, declare an integer variable for age.Use an if-else statement to compare the input age with the threshold value of 18. If the age is greater than or equal to 18, the person is eligible to vote. Otherwise, they are not.",
                                    styledText = listOf("if-else statement", "threshold value")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for Problem
                    LessonContent(
                        id = "expert_cpp3_sub3",
                        title = "Solution",
                        description = "Here’s the solution for checking voting eligibility.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
                        #include <iostream>
                        using namespace std;

                        int main() {
                            int age;
                            cout << "Enter your age: ";
                            cin >> age;

                            if (age >= 18) {
                                cout << "Eligible to Vote" << endl;
                            } else {
                                cout << "Not Eligible to Vote" << endl;
                            }

                            return 0;
                        }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "expert_cpp3_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The program declares an integer variable for the user's age. It then takes input using cin and compares it with the value 18 using an if-else statement. If the age is 18 or older, it prints 'Eligible to Vote'. Otherwise, it prints 'Not Eligible to Vote'.",
                                    styledText = listOf("cin", "if-else statement", "age")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This is a simple example of how we can use conditional statements to make decisions based on user input.",
                                    styledText = listOf("conditional statements", "user input")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "expert_cpp3_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of the lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What keyword is used to start a conditional statement in C++?",
                                options = listOf(
                                    "for",
                                    "if",
                                    "while",
                                    "switch"
                                ),
                                correctAnswer = "if",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Practice Time!
                    LessonContent(
                        id = "expert_cpp3_sub6",
                        title = "Practice Time!",
                        description = "Now it's time to practice! The more you solve, the better you get!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try changing the age threshold and experimenting with different conditions. See if you can implement more complex voting eligibility checks, like considering the user's citizenship.",
                                    styledText = listOf("experiment", "complex conditions")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Great job! Keep practicing and improving your skills!",
                                    styledText = listOf("Great job", "practice")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 5 : Grade Evaluation
            Lesson(
                id = "nested_if_else_grade_evaluation",
                title = "Grade Evaluation",
                description = "Learn how to evaluate a student's grade using nested if-else statements based on their marks.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem 1 - Grade Evaluation
                    LessonContent(
                        id = "nested_if_else_grade_evaluation_sub1",
                        title = "Grade Evaluation Problem",
                        description = "Create a program that evaluates a student's grade based on their marks.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: You need to create a program that takes the student's marks as input and evaluates their grade using nested if-else statements. The grade should be categorized as follows:\n\n" +
                                            "A: 90 and above\n" +
                                            "B: 70 to 89\n" +
                                            "C: 50 to 69\n" +
                                            "D: Below 50",
                                    styledText = listOf("A:", "B:", "C:", "D:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving the Problem
                    LessonContent(
                        id = "nested_if_else_grade_evaluation_sub2",
                        title = "Hint for Solving Problem",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, you can start by declaring an integer variable for the marks. Use `if-else` statements to check the marks in a sequential manner. First, check if the marks are above 90 for grade A, then for B, and so on.",
                                    styledText = listOf("if-else", "check marks")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "nested_if_else_grade_evaluation_sub3",
                        title = "Solution for Grade Evaluation",
                        description = "Here’s the solution to the grade evaluation problem using nested if-else statements.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    int marks;

    cout << "Enter the marks: ";
    cin >> marks;

    if (marks >= 90) {
        cout << "Grade: A" << endl;
    } else {
        if (marks >= 70) {
            cout << "Grade: B" << endl;
        } else {
            if (marks >= 50) {
                cout << "Grade: C" << endl;
            } else {
                cout << "Grade: D" << endl;
            }
        }
    }

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "nested_if_else_grade_evaluation_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution for grade evaluation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this solution, we start by taking input for the student's marks. We then use nested if-else statements to check the conditions for each grade category. If the marks are 90 or more, the grade is A. If not, we check if the marks are between 70 and 89 for grade B, and so on.",
                                    styledText = listOf("if-else", "nested conditions")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The nested if-else structure allows us to evaluate multiple conditions in a sequential manner, ensuring that the appropriate grade is printed based on the student's marks.",
                                    styledText = listOf("nested", "conditions")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "nested_if_else_grade_evaluation_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of grade evaluation using if-else statements.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does nested if-else mean?",
                                options = listOf(
                                    "loop inside an if else statement",
                                    "an if else statement inside an if else statement",
                                    "to check multiple conditions",
                                    "i will ask my friend"
                                ),
                                correctAnswer = "an if else statement inside an if else statement",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Practice Time
                    LessonContent(
                        id = "nested_if_else_grade_evaluation_sub6",
                        title = "Practice Time!",
                        description = "It’s time to practice grade evaluation with different marks and conditions!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try experimenting with different ranges of marks and see how the grade changes. Practice the nested if-else logic to strengthen your understanding.",
                                    styledText = listOf("experiment", "practice")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember to check the boundary conditions: marks equal to 90, 70, and 50.",
                                    styledText = listOf("boundary conditions")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            ),


            // Lesson 6 : Calculator with Switch-Case
            Lesson(
                id = "switch_case_simple_calculator",
                title = "Calculator With Switch-Csae",
                description = "Learn how to implement a simple calculator using the `switch-case` statement in C++.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem - Simple Calculator
                    LessonContent(
                        id = "switch_case_simple_calculator_sub1",
                        title = "Simple Calculator Problem",
                        description = "Create a program that performs basic arithmetic operations (+, -, *, /) based on user input using a `switch-case` statement.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: You need to create a simple calculator that takes two numbers and an operator as input and outputs the result of the operation,but using switch case not if-else.\n\n" +
                                            "Supported operations: Addition (+), Subtraction (-), Multiplication (*), and Division (/).",
                                    styledText = listOf(
                                        "Addition",
                                        "Subtraction",
                                        "Multiplication",
                                        "Division"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving the Problem
                    LessonContent(
                        id = "switch_case_simple_calculator_sub2",
                        title = "Hint for Solving Problem",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, declare two double(data type) variables for the numbers and a char type variable for the operator. Then, use a 'switch-case' statement to check the operator and perform the corresponding arithmetic operation.",
                                    styledText = listOf(
                                        "switch-case",
                                        "check operator",
                                        "arithmetic operation"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "switch_case_simple_calculator_sub3",
                        title = "Solution for Simple Calculator",
                        description = "Here’s the solution to the simple calculator problem using the `switch-case` statement.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    double num1, num2;
    char operator;

    // Take input from the user
    cout << "Enter first number: ";
    cin >> num1;

    cout << "Enter an operator (+, -, *, /): ";
    cin >> operator;

    cout << "Enter second number: ";
    cin >> num2;

    // Use switch-case to perform the operation
    switch (operator) {
        case '+':
            cout << "Result: " << num1 + num2 << endl;
            break;
        case '-':
            cout << "Result: " << num1 - num2 << endl;
            break;
        case '*':
            cout << "Result: " << num1 * num2 << endl;
            break;
        case '/':
            if (num2 != 0) {
                cout << "Result: " << num1 / num2 << endl;
            } else {
                cout << "Error: Division by zero!" << endl;
            }
            break;
        default:
            cout << "Invalid operator!" << endl;
            break;
    }

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "switch_case_simple_calculator_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution for the simple calculator.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this solution, we start by taking input for two numbers and the operator. We then use the `switch-case` statement to check which operator was entered and perform the corresponding arithmetic operation.",
                                    styledText = listOf("switch-case", "arithmetic operation")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Each case checks for a different operator (+, -, *, /) and executes the corresponding operation. If the operator is not valid, the default case handles it by showing an error message.",
                                    styledText = listOf("default case", "error handling")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "switch_case_simple_calculator_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of the `switch-case` structure used in the calculator program.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does the `switch-case` statement do in C++?",
                                options = listOf(
                                    "Handles multiple conditions",
                                    "Loops through statements",
                                    "Performs arithmetic operations",
                                    "Is used for error handling"
                                ),
                                correctAnswer = "Handles multiple conditions",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Practice Time
                    LessonContent(
                        id = "switch_case_simple_calculator_sub6",
                        title = "Practice Time!",
                        description = "It’s time to practice the simple calculator with different operators and numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try experimenting with different ranges of numbers and operators. Practice the `switch-case` logic to strengthen your understanding.",
                                    styledText = listOf("experimenting")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember to handle edge cases, such as division by zero, and test with different operators.",
                                    styledText = listOf("edge cases", "division by zero")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 7 : Multiplication Table
            Lesson(
                id = "for_loop_table_of_2",
                title = "Multiplication Table",
                description = "Learn how to use a for loop to print the table of 2 in C++.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem - Print Table of 2
                    LessonContent(
                        id = "for_loop_table_of_2_sub1",
                        title = "Print Table of 2",
                        description = "Create a program that prints the table of 2 (2 x 1, 2 x 2, ..., 2 x 10) using a for loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: You need to create a program that will print the multiplication table of 2. The output should display the results of multiplying 2 by the numbers 1 to 10, one result per line.\n\n" +
                                            "For example, the output should look like this:\n" +
                                            "2 x 1 = 2\n" +
                                            "2 x 2 = 4\n" +
                                            "2 x 3 = 6\n" +
                                            "...\n" +
                                            "The goal is to use a 'for loop' to repeat the multiplication and print the result for each number from 1 to 10.",
                                    styledText = listOf("for loop", "multiplication", "table of 2")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving the Problem
                    LessonContent(
                        id = "for_loop_table_of_2_sub2",
                        title = "Hint for Solving Problem",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this, you need to use a 'for loop' to iterate through numbers from 1 to 10. In each iteration, multiply 2 by the current number and print the result. This will give you the multiplication table of 2.",
                                    styledText = listOf("for loop", "iteration", "multiplication")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "for_loop_table_of_2_sub3",
                        title = "Solution for Table of 2",
                        description = "Here’s the solution to the table of 2 problem using the for loop in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    // Using a for loop to print the table of 2
    for (int i = 1; i <= 10; i++) {
        cout << "2 x " << i << " = " << 2 * i << endl;
    }
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "for_loop_table_of_2_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution for printing the table of 2.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this solution, we are using a 'for loop' to iterate through the numbers from 1 to 10. In each iteration, we multiply 2 by the current number (i) and print the result.\n\n" +
                                            "The loop runs 10 times. Each time it runs, the current value of 'i' is multiplied by 2, and the result is displayed in the format '2 x i = result'.",
                                    styledText = listOf("for loop", "multiplication", "iteration")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "At the end of the loop, all 10 results are printed one by one. The use of the 'cout' statement helps us print the result in C++.",
                                    styledText = listOf("loop", "10 times", "iteration", "cout")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "for_loop_table_of_2_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of using loops in C++ to print the table of 2.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does the for loop in C++ do?",
                                options = listOf(
                                    "Iterates over a range of values",
                                    "Prints a single number",
                                    "Multiplies two numbers",
                                    "Performs addition"
                                ),
                                correctAnswer = "Iterates over a range of values",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 8: Sum of First 10 Numbers
            Lesson(
                id = "sum_of_first_10_numbers",
                title = "Sum of First 10 Numbers",
                description = "Learn how to use a loop to calculate the sum of the first 10 numbers in C++.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem - Find Sum of First 10 Numbers
                    LessonContent(
                        id = "sum_of_first_10_numbers_sub1",
                        title = "Find Sum of First 10 Numbers",
                        description = "Create a program that calculates the sum of the first 10 numbers (1 + 2 + 3 + ... + 10) using a loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem: You need to create a program that calculates the sum of the first 10 numbers. This means you should add 1 + 2 + 3 + ... up to 10. The result of this sum is 55.\n\n" +
                                            "The goal is to use a loop (such as a 'for loop') to repeat the process of adding these numbers together.",
                                    styledText = listOf("loop", "sum", "first 10 numbers")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving the Problem
                    LessonContent(
                        id = "sum_of_first_10_numbers_sub2",
                        title = "Hint for Solving Problem",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this problem, first we declare a int variable and initialize it with 0 (int sum = 0;), than you can use a 'for loop' that runs from 1 to 10. In each iteration, you add the current number to a running total, which will eventually give you the sum.",
                                    styledText = listOf("for loop", "running total", "sum")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "sum_of_first_10_numbers_sub3",
                        title = "Solution for Sum of First 10 Numbers",
                        description = "Here’s the solution to the sum of the first 10 numbers problem using a for loop in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    int sum = 0; // Initialize sum to 0

    // Using a for loop to add numbers from 1 to 10
    for (int i = 1; i <= 10; i++) {
        sum += i; // Add i to sum
    }

    // Output the result
    cout << "The sum of the first 10 numbers is: " << sum << endl;
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "sum_of_first_10_numbers_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution for calculating the sum of the first 10 numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this solution, we use a 'for loop' that starts at 1 and runs until it reaches 10. Each time the loop runs, we add the current value of 'i' to the 'sum' variable. This is done using the statement 'sum += i', which adds the current number (i) to the total sum.",
                                    styledText = listOf("for loop", "sum += i", "running total")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The loop executes 10 times, once for each number from 1 to 10. After the loop ends, the variable 'sum' contains the total sum of these numbers, which is then printed using 'cout'. The output is 'The sum of the first 10 numbers is: 55'.",
                                    styledText = listOf("loop", "cout", "final sum")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "sum_of_first_10_numbers_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of calculating the sum of the first 10 numbers using a loop.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does the 'sum += i' statement do in the loop?",
                                options = listOf(
                                    "It multiplies 'i' by the sum",
                                    "It adds the value of 'i' to the sum",
                                    "It prints the sum to the console",
                                    "It initializes the sum variable"
                                ),
                                correctAnswer = "It adds the value of 'i' to the sum",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Practice Time
                    LessonContent(
                        id = "sum_of_first_10_numbers_sub6",
                        title = "Practice Time!",
                        description = "Practice calculating the sum of different ranges of numbers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try modifying the program to calculate the sum of the first 20 numbers, or the sum of the first N numbers. This will help you practice using loops with different ranges and values.",
                                    styledText = listOf("modifying", "range", "sum")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can change the loop to run from 1 to any number you choose, such as 20 or 100, and calculate the sum accordingly. Experimenting with different ranges will help you get comfortable with using loops.",
                                    styledText = listOf("experimenting", "loops", "ranges")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 9 : Triangle Star Pattern in C++
            Lesson(
                id = "right_angle_triangle_star_pattern",
                title = "Triangle Star Pattern in C++",
                description = "Learn how to create a program in C++ to display a right-angle triangle pattern with stars.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem - Display Right Angle Triangle with Stars
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub1",
                        title = "Problem: Triangle with Stars",
                        description = "Create a program that displays a right-angle triangle pattern made up of stars, where the number of rows is fixed to 5.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem is to display a right-angle triangle using stars. For example, with 5 rows, the output should look like this:\n\n" +
                                            "*\n" +
                                            "**\n" +
                                            "***\n" +
                                            "****\n" +
                                            "*****\n\n" +
                                            "The program should print this pattern without taking any user input.",
                                    styledText = listOf("right-angle triangle", "stars", "pattern")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving the Problem
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub2",
                        title = "Hint for Solving the Problem",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this problem, use a nested loop. The outer loop controls the rows (fixed to 5), and the inner loop prints the stars for each row. The number of stars in each row increases as the row number increases.",
                                    styledText = listOf("nested loop", "rows", "inner loop")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub3",
                        title = "Solution for Right Angle Triangle Star Pattern",
                        description = "Here’s the solution to the problem of displaying a right-angle triangle pattern with stars in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    // Outer loop for number of rows
    for (int i = 1; i <= 5; i++) {
        // Inner loop for printing stars in each row
        for (int j = 1; j <= i; j++) {
            cout << "*"; // Print star in the row
        }
        cout << endl; // Move to the next line
    }

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution to understand how the code works.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The program starts with a fixed value of 5 for the number of rows.\n\n" +
                                            "We then use an outer loop that runs from 1 to 5 (since n = 5). In each iteration, the outer loop controls the row number.\n\n" +
                                            "Inside the outer loop, there’s an inner loop that prints '*' for the current row number. For example, when i = 3, the inner loop prints '***'. After the inner loop completes, we print a newline character to move to the next row.",
                                    styledText = listOf("outer loop", "inner loop", "newline")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The outer loop increases with each iteration, which ensures that the number of printed stars in each row also increases.\n\n" +
                                            "The result is a right-angle triangle pattern made up of stars.",
                                    styledText = listOf("outer loop", "stars", "pattern")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem2
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub3",
                        title = "Solution 2: for Numbers Pattern",
                        description = "Here’s the solution to the problem of displaying a right-angle triangle pattern with numbers in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here we just change '*' with 'j' of the inner loop to create same pattern with numbers.\n" +
                                            "1\n" +
                                            "12\n" +
                                            "123\n" +
                                            "1234\n" +
                                            "12345"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    // Outer loop for number of rows
    for (int i = 1; i <= 5; i++) {
        // Inner loop for printing in each row
        for (int j = 1; j <= i; j++) {
            cout << j; 
        }
        cout << endl; // Move to the next line
    }
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem2
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub3",
                        title = "Solution 3: Different Num Pattern",
                        description = "Here’s the solution to the problem of displaying a right-angle triangle pattern with numbers in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here we just change 'j' with 'i' to create same pattern with numbers the below pattern way..\n" +
                                            "1\n" +
                                            "22\n" +
                                            "333\n" +
                                            "4444\n" +
                                            "55555"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    // Outer loop for number of rows
    for (int i = 1; i <= 5; i++) {
        // Inner loop for printing in each row
        for (int j = 1; j <= i; j++) {
            cout << i; 
        }
        cout << endl; // Move to the next line
    }
    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),


                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your understanding of the right-angle triangle pattern code.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does the inner loop do in this program?",
                                options = listOf(
                                    "Prints stars or numbers in each row",
                                    "Controls the number of rows",
                                    "Moves to the next line",
                                    "Displays the number of rows"
                                ),
                                correctAnswer = "Prints stars in each row",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Practice Time
                    LessonContent(
                        id = "right_angle_triangle_star_pattern_sub6",
                        title = "Practice Time!",
                        description = "It’s time to practice printing similar star patterns in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try modifying the program to print patterns with different numbers of rows. For example, experiment with printing a 4-row or 6-row triangle.",
                                    styledText = listOf("modifying", "experimenting", "patterns")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Experimenting with different values for the number of rows will help you practice and solidify your understanding of loops in C++.",
                                    styledText = listOf("loops", "practice", "patterns")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 10 : Pyramid Star Pattern in C++
            Lesson(
                id = "pyramid_star_pattern",
                title = "Pyramid Star Pattern in C++",
                description = "Learn how to create a program in C++ to display a pyramid pattern made up of stars.",
                lessonContents = listOf(

                    // Sub-lesson 1: Problem - Display Pyramid with Stars
                    LessonContent(
                        id = "pyramid_star_pattern_sub1",
                        title = "Problem: Display Pyramid with Stars",
                        description = "Create a program that displays a pyramid pattern made up of stars. The number of rows is fixed to 5, and the stars should be centered.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The problem is to display a pyramid pattern using stars. For example, with 5 rows, the output should look like this:\n\n" +
                                            "    *\n" +
                                            "   ***\n" +
                                            "  *****\n" +
                                            " *******\n" +
                                            "*********\n\n" +
                                            "The program should print this pattern without taking any user input.",
                                    styledText = listOf("pyramid pattern", "stars", "centered")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Hint for Solving the Problem
                    LessonContent(
                        id = "pyramid_star_pattern_sub2",
                        title = "Hint for Solving the Problem",
                        description = "How to approach the problem.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To solve this problem, we need to print stars in each row with spaces before them to center-align the pattern. The number of spaces in each row is calculated based on the total number of rows.",
                                    styledText = listOf("spaces", "rows", "center-align")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "pyramid_star_pattern_sub3",
                        title = "Solution for Pyramid Star Pattern",
                        description = "Here’s the solution to the problem of displaying a pyramid pattern with stars in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    // Outer loop for number of rows
    for (int i = 1; i <= 5; i++) {
        // Print spaces before stars in each row
        for (int j = i; j < 5; j++) {
            cout << " "; // Print space
        }

        // Inner loop for printing stars in each row
        for (int j = 1; j <= (2 * i - 1); j++) {
            cout << "*"; // Print star
        }
        
        // Move to the next line after each row
        cout << endl;
    }

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Explanation of the Code
                    LessonContent(
                        id = "pyramid_star_pattern_sub4",
                        title = "Explanation of the Code",
                        description = "Let’s break down the solution to understand how the code works.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The program starts with a fixed value of 5 for the number of rows.\n\n" +
                                            "We use an outer loop to print the rows, and for each row, there are two inner loops:\n\n" +
                                            "1. The first inner loop prints spaces to center the stars in each row. The number of spaces decreases as we move down the rows.\n" +
                                            "2. The second inner loop prints the stars. The number of stars increases as we move down the rows.",
                                    styledText = listOf("outer loop", "inner loop", "spaces", "stars")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, in the 1st row, there are 4 spaces and 1 star. In the 2nd row, there are 3 spaces and 3 stars, and so on. This creates the pyramid pattern.",
                                    styledText = listOf("spaces", "stars", "pyramid")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),


                    // Sub-lesson 3: Solution for the Problem
                    LessonContent(
                        id = "pyramid_star_pattern_sub3",
                        title = "Solution: Slight Changed Pattern",
                        description = "Here’s the solution to the problem of displaying a pyramid pattern with stars in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This solution is to display a pyramid pattern using stars. For example, with 5 rows, the output should look like this:\n\n" +
                                            "    *\n" +
                                            "   * *\n" +
                                            "  * * *\n" +
                                            " * * * *\n" +
                                            "* * * * * *"
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

int main() {
    // Outer loop for number of rows
    for (int i = 1; i <= 5; i++) {
        // Print spaces before stars in each row
        for (int j = i; j < 5; j++) {
            cout << " "; // Print space
        }

        // Inner loop for printing stars in each row
        for (int j = 1; j <= i; j++) {
            cout << "* "; // Print star with space after it
        }

        // Move to the next line after each row
        cout << endl;
    }
    return 0;
}

                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Quiz Time!
                    LessonContent(
                        id = "pyramid_star_pattern_sub5",
                        title = "Quiz Time! 🧠",
                        description = "Test your understanding of the pyramid star pattern code.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the purpose of the first inner loop in this program?",
                                options = listOf(
                                    "Prints stars in each row",
                                    "Prints spaces before stars",
                                    "Moves to the next line",
                                    "Calculates the total number of stars"
                                ),
                                correctAnswer = "Prints spaces before stars",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Practice Time
                    LessonContent(
                        id = "pyramid_star_pattern_sub6",
                        title = "Practice Time!",
                        description = "It’s time to practice printing similar star patterns in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try modifying the program to print patterns with different numbers of rows. For example, experiment with printing a 3-row or 6-row pyramid.",
                                    styledText = listOf("modifying", "experimenting", "patterns")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Experimenting with different values for the number of rows will help you practice and solidify your understanding of loops in C++.",
                                    styledText = listOf("loops", "practice", "patterns")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),
                ),
               status = LessonStatus.LOCKED
            )

        )
    )
}