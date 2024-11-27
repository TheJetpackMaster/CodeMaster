package com.codemaster.codemasterapp.main.AllCourses

import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

class CPPCourseProvider {


    fun getCompleteCPPCourse(): Course {
        return Course(
            id = "cpp_course",
            language = "C++",
            stages = listOf(
                CPPBeginnerCourse(),
//                CPPIntermediateCourse(),
//                CPPAdvancedCourse(),
//                CPPExpertCourse()
            )
        )
    }

    fun CPPBeginnerCourse(): Stage {
        return Stage(
            id = "cpp_beginner_stage",
            title = "Beginner",
            lessons = listOf(

                // Lesson 1: Introduction to C++ Programming
                Lesson(
                    id = "beginner_cpp1",
                    title = "Introduction to C++ Programming",
                    description = "In this lesson, we will cover the basics of C++ programming. Don't worry, no complicated stuff yet!",
                    subLessons = listOf(
                        // Sub-lesson 1: What is C++?
                        Lesson(
                            id = "beginner_c1_sub1",
                            title = "What is C++?",
                            description = "In this lesson, we'll briefly talk about the C++ programming language, where it came from, and why it's still awesome today.",
                            status = LessonStatus.ACTIVE
                        ),
                        // Sub-lesson 2: Why C++?
                        Lesson(
                            id = "beginner_c1_sub2",
                            title = "Why C++?",
                            description = "C++ isn't just any language. Let's explore why it's so powerful, and why you should care.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 3: History of C++
                        Lesson(
                            id = "beginner_c1_sub3",
                            title = "History of C++",
                            description = "We’ll look back to the early 1980s when C++ was born and how it grew up to be the language it is today.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 4: What's Next in C++?
                        Lesson(
                            id = "beginner_c1_sub4",
                            title = "What's Next in Course?",
                            description = "Now that you've got the basics, we will move on to variables, data types, and how to manipulate them in upcoming lessons!",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 5: Get Ready for Action!
                        Lesson(
                            id = "beginner_c1_sub5",
                            title = "Get Ready for Action!",
                            description = "Get ready to start coding! In the next lesson, you'll create your first interactive program and learn how to handle user input.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 6: QUIZ!
                        Lesson(
                            id = "beginner_c1_sub6",
                            title = "Quiz!",
                            description = "Basic quiz to test your simple knowledge about what is c++.",
                            status = LessonStatus.LOCKED
                        )
                    ),

                    lessonContents = listOf(
                        // Content 1: What is C++?
                        LessonContent(
                            id = "beginner_c1_sub1_content",
                            title = "What is C++?",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "C++ is a powerful, high-performance programming language that is widely used in software development." +
                                            " It was created by Bjarne Stroustrup in 1979 and has evolved to support both object-oriented and procedural programming."
                                ),
                                ContentBlock.Text(
                                    "Its ability to give programmers fine control over system resources is one of the reasons it’s still popular today."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 2: Why C++?
                        LessonContent(
                            id = "beginner_c1_sub2_content",
                            title = "Why C++?",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "C++ is not just about writing code. It's about writing efficient, powerful code that can do anything from games to operating systems." +
                                            " The language's versatility, performance, and wide usage in high-performance applications make it a must-learn for programmers."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 3: History of C++
                        LessonContent(
                            id = "beginner_c1_sub3_content",
                            title = "History of C++",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "C++ originated as an extension of the C programming language in the early 1980s. C++, as its name suggests, is 'C with classes,' " +
                                            "introducing object-oriented concepts to the language."
                                ),
                                ContentBlock.Text(
                                    "Since then, C++ has evolved and remained a go-to language for applications where performance and efficiency are crucial."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 4: What's Next in C++?
                        LessonContent(
                            id = "beginner_c1_sub4_content",
                            title = "What's Next in Course?",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In the next lessons, we will dive into variables, data types, and how to use them effectively in your programs. The real fun starts here!"
                                ),
                                ContentBlock.Text(
                                    "We’ll explore how to work with numbers, strings, and different data structures, preparing you to write more complex programs."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 5: Get Ready for Action!
                        LessonContent(
                            id = "beginner_c1_sub5_content",
                            title = "Get Ready for Action!",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Now it's time to roll up your sleeves! In upcoming lessons, you'll create a fully interactive program and learn how to take user input."
                                ),
                                ContentBlock.Text(
                                    "We'll also introduce you to loops and conditions, which will allow you to make your programs more dynamic and responsive!"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 6: Quiz
                        LessonContent(
                            id = "beginner_cpp_sub6",
                            title = "Quiz!",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What is C++ used for?",
                                    options = listOf(
                                        "System Programming",
                                        "Web Development",
                                        "Mobile App Development"
                                    ),
                                    correctAnswer = "System Programming",
                                    userAnswer = null, // Initially, no answer is selected
                                    isCorrect = false // Initially, answer is incorrect until the user answers
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),


                // Lesson 2: Getting Started with C++
                Lesson(
                    id = "beginner_cpp2",
                    title = "Getting Started with C++",
                    description = "In this lesson, we'll guide you through setting up the C++ development environment, installing IDEs and compilers, and writing your first C++ program.",
                    subLessons = listOf(
                        // Sub-lesson 1: Setting Up an IDE
                        Lesson(
                            id = "beginner_c2_sub1",
                            title = "Setting Up an IDE",
                            description = "In this lesson, you'll learn how to install an IDE (Integrated Development Environment) to start writing C++ code. We’ll walk you through popular choices like Visual Studio (Windows), Code::Blocks (Cross-platform), or CLion (Cross-platform).",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 2: Installing a C++ Compiler
                        Lesson(
                            id = "beginner_c2_sub2",
                            title = "Installing a C++ Compiler",
                            description = "A C++ compiler is essential to compile and run your C++ programs. We will show you how to install GCC, MinGW, or Clang, depending on your operating system.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 3: Your First C++ Program
                        Lesson(
                            id = "beginner_c2_sub3",
                            title = "Your First C++ Program",
                            description = "Now that your environment is set up, let’s write your first C++ program: a simple 'Hello, World!' that you can compile and run.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 4: Setting Up Debugging Tools
                        Lesson(
                            id = "beginner_c2_sub4",
                            title = "Setting Up Debugging Tools",
                            description = "Debugging is an essential part of programming. In this sub-lesson, you’ll learn how to use debugging tools within your IDE to step through your code and catch bugs early.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 5: Quiz
                        Lesson(
                            id = "beginner_c2_sub5",
                            title = "Quiz!",
                            description = "At the end of this lesson, test your knowledge with a quiz about IDEs, compilers, and your first program.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content 1: Setting Up an IDE
                        LessonContent(
                            id = "beginner_c2_sub1_content",
                            title = "Setting Up an IDE",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "To start writing C++ code, you need an IDE (Integrated Development Environment) where you can write, compile, and run your programs. There are several popular IDEs for C++ programming, such as:"
                                ),
                                ContentBlock.Text(
                                    "For Android :Coding C++ (PlayStore)\n" +
                                            "For IOS: C++ Compiler"
                                ),
                                ContentBlock.Text(
                                    "Visual Studio (Windows)\n" +
                                            "Code::Blocks (Cross-platform)\n" +
                                            "CLion (Cross-platform, paid)"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 2: Installing a C++ Compiler
                        LessonContent(
                            id = "beginner_c2_sub2_content",
                            title = "Installing a C++ Compiler",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A C++ compiler is necessary for converting the C++ code you write into an executable program. On Windows, we recommend installing MinGW or the Cygwin environment to get GCC (GNU Compiler Collection)."
                                ),
                                ContentBlock.Text(
                                    "If you are on macOS or Linux, you likely already have Clang or GCC installed, but if not, we’ll show you how to install it using a package manager."
                                ),
                                ContentBlock.Text(
                                    "To install MinGW on Windows, download and install it from the official website, then add it to your system’s PATH variable to allow the compiler to be accessed from the command line."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 3: Your First C++ Program
                        LessonContent(
                            id = "beginner_c2_sub3_content",
                            title = "Your First C++ Program",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Now that you have your IDE and compiler set up, let’s write your first program. This simple program will display the message 'Hello, World!' on the screen."
                                ),
                                ContentBlock.Code(
                                    code = "# include < iostream > \n int main () { \n cout < < 'Hello, World!' <<endl; \nreturn 0; \n}",
                                ),
                                ContentBlock.Text(
                                    "Once you’ve written the code, click 'Build' or 'Run' in your IDE to compile and execute it. You should see 'Hello, World!' printed on the screen."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 4: Setting Up Debugging Tools
                        LessonContent(
                            id = "beginner_c2_sub4_content",
                            title = "Setting Up Debugging Tools",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Debugging is essential for finding and fixing errors in your programs. IDEs like Visual Studio, Code::Blocks, and CLion come with built-in debuggers."
                                ),
                                ContentBlock.Text(
                                    "You can use breakpoints to pause your program’s execution at specific points, allowing you to examine the state of variables and track down bugs."
                                ),
                                ContentBlock.Text(
                                    "In this sub-lesson, you’ll learn how to set breakpoints in your IDE and step through your code to understand how it executes."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 5: Quiz
                        LessonContent(
                            id = "beginner_c2_sub5",
                            title = "Quiz!",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What does an IDE do?",
                                    options = listOf(
                                        "Compiles code",
                                        "Runs code",
                                        "Both of the above"
                                    ),
                                    correctAnswer = "Both of the above",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),

                // Lesson3 : Basic Syntax
                Lesson(
                    id = "beginner_cpp3",
                    title = "C++ Basic Syntax",
                    description = "In this lesson, we will cover the fundamental syntax of C++. You'll learn about directives like '#include', the 'main()' function, basic code structure, and other essential syntax rules in C++.",
                    subLessons = listOf(
                        // Sub-lesson 1: The '#include' Directive
                        Lesson(
                            id = "beginner_c3_sub1",
                            title = "The Libraries",
                            description = "In this sub-lesson, we'll explain the '#include' directive, which is used to include external libraries and headers into your C++ program.",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 2: Understanding the 'main()' Function
                        Lesson(
                            id = "beginner_c3_sub2",
                            title = """Understanding the "main()" Function""",
                            description = "The 'main()' function is the starting point of any C++ program. In this sub-lesson, we'll explain the syntax and importance of 'main()' and how your program begins execution from here.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: C++Statements
                        Lesson(
                            id = "beginner_c3_sub3",
                            title = "C++ Statements",
                            description = "Understanding statements in C++ Programming language.",
                            status = LessonStatus.LOCKED

                        ),

                        // Sub-lesson 4: C++Statements
                        Lesson(
                            id = "beginner_c3_sub4",
                            title = "C++ Single Statement",
                            description = "Understanding statements in C++ Programming language.",
                            status = LessonStatus.LOCKED

                        ),

                        // Sub-lesson 5: C++Statements
                        Lesson(
                            id = "beginner_c3_sub5",
                            title = "C++ Multiple Statement",
                            description = "Understanding statements in C++ Programming language.",
                            status = LessonStatus.LOCKED

                        ),

                        // Sub-lesson 6: C++Statements
                        Lesson(
                            id = "beginner_c3_sub6",
                            title = "More on Statements!",
                            description = "Extra Content for Statements",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 7 Quiz_statement
                        Lesson(
                            id = "beginner_c3_sub7",
                            title = "Quiz!",
                            description = "C++ Statements quiz!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 8: Code Block Structure
                        Lesson(
                            id = "beginner_c3_sub8",
                            title = "Code Block Structure",
                            description = "This sub-lesson covers the syntax of code blocks in C++, including how curly braces '{}' are used to define code blocks and the importance of proper indentation.",
                            status = LessonStatus.LOCKED
                        ),


                        // Sub-lesson 9: Quiz
                        Lesson(
                            id = "beginner_c3_sub9",
                            title = "Quiz",
                            description = "Test your understanding of C++ syntax with this quiz. You'll answer questions about '#include', 'main()', code block structure, and comments.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content 1: The '#include' Directive
                        LessonContent(
                            id = "beginner_c3_sub1",
                            title = "The '#include' Directive",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C++, the '#include' directive is used to include libraries or header files in your program. This allows you to use predefined functions and classes provided by the standard C++ library or third-party libraries."
                                ),
                                ContentBlock.Text(
                                    """"For example, "#include <iostream>" includes the input/output stream library that allows you to use "cout" for printing text to the console."""
                                ),
                                ContentBlock.Text(
                                    "There are two types of includes:\n" +
                                            "1. '#include <library>' for standard libraries like iostream.\n" +
                                            "2. '#include \"filename\"' for user-defined header files."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 2: Understanding the 'main()' Function
                        LessonContent(
                            id = "beginner_c3_sub2",
                            title = "Understanding the 'main()' Function",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "The 'main()' function is the entry point of any C++ program. It is where the execution of the program begins."
                                ),
                                ContentBlock.Text(
                                    "Example Code here you see:"
                                ),
                                ContentBlock.Code(
                                    code = "int main() { \n cout << 'Hello, World!' <<endl; \n return 0; \n }"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 3: C++ Statements
                        LessonContent(
                            id = "beginner_c3_sub3",
                            title = "What Are Statements?",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A statement is a single instruction that a computer can execute. It's like giving a single step of an order to the computer."
                                ),
                                ContentBlock.Text(
                                    "For example, if you want your program to say something, you'd write a statement like this:"
                                ),
                                ContentBlock.Code(
                                    "cout << \"Hello, World!\";"
                                ),
                                ContentBlock.Text(
                                    "That's it! One command, one action. Statements are the building blocks of a program."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 4: C++ Statements
                        LessonContent(
                            id = "beginner_c3_sub4",
                            title = "Single Statements",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A single statement does one thing at a time. It must end with a semicolon (';') in C++."
                                ),
                                ContentBlock.Text(
                                    "For example, this is a single statement that outputs text:"
                                ),
                                ContentBlock.Code(
                                    "cout << \"I love coding!\";"
                                ),
                                ContentBlock.Text(
                                    "Always remember the semicolon! Forgetting it is like forgetting to end a sentence in English—it just won’t work."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 5: C++ Statements
                        LessonContent(
                            id = "beginner_c3_sub5",
                            title = "Multiple Statements",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A program usually contains multiple statements to perform a series of tasks. For example:"
                                ),
                                ContentBlock.Code(
                                    """
#include <iostream>
using namespace std;

int main() {
    cout << "Hello, ";
    cout << "World!";
    return 0;
}
"""
                                ),
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Content 6: C++ Statements
                        LessonContent(
                            id = "beginner_c3_sub6",
                            title = "More on Statements!",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Each statement does a small part of the work. Together, they make your program accomplish more complex tasks."
                                ),
                                ContentBlock.Text(
                                    "Think of statements like bricks. One brick alone doesn't make a wall, but many bricks together can build something great!"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),


                        // Content 7: Quiz1
                        LessonContent(
                            id = "beginner_c3_sub7",
                            title = "Quiz!",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "In C++ each code statement must end with?",
                                    options = listOf(
                                        ":",
                                        ";",
                                        "#"
                                    ),
                                    correctAnswer = ";",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        ),

                        // Content 8: Code Block Structure
                        LessonContent(
                            id = "beginner_c3_sub8",
                            title = "Code Block Structure",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C++, code blocks are enclosed by curly braces '{}'. These blocks are used to group statements together, such as inside functions or loops."
                                ),
                                ContentBlock.Text(
                                    "Each code block in C++ must be properly opened and closed with curly braces. Improperly closed blocks can lead to syntax errors."
                                ),
                                ContentBlock.Code(
                                    code = """
#include <iostream>

int main() {
    cout << "Hello, World!" << std::endl;
    return 0;
}
                    """
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 9: Quiz
                        LessonContent(
                            id = "beginner_c3_sub9",
                            title = "Quiz!",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What is the purpose of the '#include' directive?",
                                    options = listOf(
                                        "To declare variables",
                                        "To include external libraries",
                                        "To define functions"
                                    ),
                                    correctAnswer = "To include external libraries",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.LOCKED
                ),

                // Lesson 4: C++ Comments
                Lesson(
                    id = "beginner_cpp4",
                    title = "C++ Comments",
                    description = "In this lesson, you will learn what comments are, why they are important, and how to write both single-line and multi-line comments in C++.",
                    subLessons = listOf(
                        // Sub-lesson 1: What Are Comments?
                        Lesson(
                            id = "beginner_cpp4_sub1",
                            title = "What Are Comments? 📝",
                            description = "Learn the concept of comments and how they help make your code understandable to others (and your future self).",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 2: Single-Line Comments
                        Lesson(
                            id = "beginner_cpp4_sub2",
                            title = "Single-Line Comments 🖊️",
                            description = "Explore how to use '//' for quick notes and explanations in your code.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: Multi-Line Comments
                        Lesson(
                            id = "beginner_cpp4_sub3",
                            title = "Multi-Line Comments 📜",
                            description = "Discover how to write longer comments spanning multiple lines with '/* */'.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 4: Why Use Comments?
                        Lesson(
                            id = "beginner_cpp4_sub4",
                            title = "Why Use Comments? 🤷‍♂️",
                            description = "Understand the importance of comments and how they make your code easier to read and maintain.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: Commenting Best Practices
                        Lesson(
                            id = "beginner_cpp4_sub5",
                            title = "Commenting Best Practices 🧹",
                            description = "Learn tips and tricks for writing clear, concise, and helpful comments.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: Quiz!
                        Lesson(
                            id = "beginner_cpp4_sub6",
                            title = "Quiz! 📝",
                            description = "Test your knowledge of comments in C++ with a fun quiz.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content 1: What Are Comments?
                        LessonContent(
                            id = "beginner_cpp4_sub1",
                            title = "What Are Comments? 📝",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Ever wanted to leave a secret note in your code? 🤫 That’s what comments are for!"
                                ),
                                ContentBlock.Text(
                                    "Comments are messages for *humans*, not computers. 💻 They explain what’s going on, but the computer skips them while running the code. 🚀"
                                ),
                                ContentBlock.Text(
                                    "Think of them as sticky notes for your future self or teammates. 🧠💡"
                                ),
                                ContentBlock.Code(
                                    code = """// This is a comment. It won't run, but it's super helpful."""
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 2: Single-Line Comments
                        LessonContent(
                            id = "beginner_cpp4_sub2",
                            title = "Single-Line Comments 🖊️",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Need to leave a quick reminder? 🏷️ Use a single-line comment by starting with '//'. It's like writing a tweet for your code! 🐦"
                                ),
                                ContentBlock.Code(
                                    code = """// This tells the computer to say hello!
cout << "Hello, World!";"""
                                ),
                                ContentBlock.Text(
                                    "See? Short and sweet. 🍭 Just add '//' before your note!"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 3: Multi-Line Comments
                        LessonContent(
                            id = "beginner_cpp4_sub3",
                            title = "Multi-Line Comments 📜",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Sometimes, a single line just isn’t enough. 😅 Enter multi-line comments! Start with '/*' and end with '*/'."
                                ),
                                ContentBlock.Code(
                                    code = """/*
This is a multi-line comment.
It’s perfect for longer explanations.
You can use it to write a whole essay (but don’t do that). 😂
*/
cout << "C++ is cool!";"""
                                ),
                                ContentBlock.Text(
                                    "Great for explaining *why* you wrote that complicated piece of code. 🤔💡"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 4: Why Use Comments?
                        LessonContent(
                            id = "beginner_cpp4_sub4",
                            title = "Why Use Comments? 🤷‍♂️",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Why bother with comments? Here’s why: 🧐"
                                ),
                                ContentBlock.Text(
                                    "- They help others understand your code (and future-you will thank you too!). 🤝\n" +
                                            "- They’re lifesavers when debugging. 🛟\n" +
                                            "- Code without comments is like a book without chapter titles. Confusing! 📖❓"
                                ),
                                ContentBlock.Text(
                                    "In short: Comments = clarity. 🕶️✨"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 5: Commenting Best Practices
                        LessonContent(
                            id = "beginner_cpp4_sub5",
                            title = "Commenting Best Practices 🧹",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Here’s how to write comments like a pro: 🌟"
                                ),
                                ContentBlock.Text(
                                    "- **Be concise.** 📝 No one likes essays in code!\n" +
                                            "- **Don’t state the obvious.** (e.g., '// Adds 2 and 2' for '2 + 2'). 🙄\n" +
                                            "- **Keep them updated.** Old comments are like expired milk—useless and smelly. 🥛💀"
                                ),
                                ContentBlock.Text(
                                    "Great comments make great programmers. 💪"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 6: Quiz
                        LessonContent(
                            id = "beginner_cpp4_sub6",
                            title = "Quiz! 📝",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which symbol is used to start a single-line comment in C++?",
                                    options = listOf(
                                        "//",
                                        "/*",
                                        "##",
                                        "#"
                                    ),
                                    correctAnswer = "//",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),

                // Lesson 5 : C++ Output
                Lesson(
                    id = "beginner_cpp5",
                    title = "C++ Output",
                    description = "Learn to make your program talk! From printing text to using new lines and formatting outputs with escape sequences.",
                    subLessons = listOf(
                        // Sub-lesson 1: What is Output?
                        Lesson(
                            id = "beginner_cpp5_sub1",
                            title = "What is Output?",
                            description = "Think of output as your program’s voice – without it, your code is like a ninja: silent and sneaky. Let’s make it loud and clear! 🔊",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 2: Introducing cout
                        Lesson(
                            id = "beginner_cpp5_sub2",
                            title = "Introducing cout",
                            description = "Say hello to 'cout', your program's loudspeaker. Get ready to print 'Hello, World!' like a pro!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: Printing Text
                        Lesson(
                            id = "beginner_cpp5_sub3",
                            title = "Printing Text",
                            description = "Text is easy to print! Just put it inside quotes and let 'cout' handle the rest. It's that simple.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 4: Printing Numbers
                        Lesson(
                            id = "beginner_cpp5_sub4",
                            title = "Printing Numbers",
                            description = "Numbers don't need quotes. Print them freely and see how your code handles them.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: Adding New Lines
                        Lesson(
                            id = "beginner_cpp5_sub5",
                            title = "Adding New Lines with \\n",
                            description = "Give your output some space! Use '\\n' to break the line. You deserve more room in life (and your output)!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: Using endl for New Lines
                        Lesson(
                            id = "beginner_cpp5_sub6",
                            title = "Using endl",
                            description = "Want to add a new line? Try 'endl'! It's like a more polite way of saying 'Move on, please!'",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 7: Quiz
                        Lesson(
                            id = "beginner_cpp5_sub7",
                            title = "Quiz Time! 🧠",
                            description = "Test your output skills with some fun questions. Let's see if you're ready for the next level!",
                            status = LessonStatus.LOCKED
                        ),
                        // Sub-lesson 8: Quiz2
                        Lesson(
                            id = "beginner_cpp5_sub8",
                            title = "Quiz Time! 🧠",
                            description = "Test your new line skills with some fun questions. Let's see if you're ready for the next level!",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Lesson Content for "What is Output?"
                        LessonContent(
                            id = "beginner_cpp5_sub1",
                            title = "What is Output?",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "Imagine you’re at a party 🎉, rocking out 🎧, but no one can hear you. That’s your program without output – it’s working, but silent! 🤫"
                                ),
                                ContentBlock.Text(
                                    "Output is your program's way of speaking up 🔊. It lets the world know what’s happening inside. Without it, your program’s just a ninja. 👻"
                                ),
                                ContentBlock.Text(
                                    "Next, we’ll make your program shout its results to the world. Ready to turn the volume up? 🎶"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 2: Introducing cout
                        LessonContent(
                            id = "beginner_cpp5_sub2",
                            title = "Introducing cout",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here’s your program’s loudspeaker – 'cout'. It prints text to the screen."),
                                ContentBlock.Code(code = "cout << \"Hello, World!\";"),
                                ContentBlock.Text("Run this and you’ll see 'Hello, World!' popping up. 🎉 Now you’re talking!")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 3: Printing Text
                        LessonContent(
                            id = "beginner_cpp5_sub3",
                            title = "Printing Text",
                            contentBlocks = listOf(
                                ContentBlock.Text("To print text, just wrap it in double quotes. No quotes? Your code will get confused! 😅"),
                                ContentBlock.Code(code = "cout << \"Coding is fun!\";"),
                                ContentBlock.Text("This prints: 'Coding is fun!'. Now, tell the world! 🌍")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 4: Printing Numbers
                        LessonContent(
                            id = "beginner_cpp5_sub4",
                            title = "Printing Numbers",
                            contentBlocks = listOf(
                                ContentBlock.Text("Numbers? No problem. Just type them without quotes, and let them flow."),
                                ContentBlock.Code(code = "cout << 42;"),
                                ContentBlock.Text("This prints: '42'. The answer to everything... almost! 🤔")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 5: Adding New Lines with \n
                        LessonContent(
                            id = "beginner_cpp5_sub5",
                            title = "Adding New Lines with \\n",
                            contentBlocks = listOf(
                                ContentBlock.Text("Need some space? '\\n' gives your output some breathing room."),
                                ContentBlock.Code(code = "cout << \"First line\\n\";\ncout << \"Second line\";"),
                                ContentBlock.Text("You’ll get: 'First line\nSecond line'. Clean, right? 🙌")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 6: Using endl for New Lines
                        LessonContent(
                            id = "beginner_cpp5_sub6",
                            title = "Using endl",
                            contentBlocks = listOf(
                                ContentBlock.Text("'endl' is another way to create new lines. It's a bit fancier and does some extra work."),
                                ContentBlock.Code(code = "cout << \"First line\" << endl;\ncout << \"Second line\";"),
                                ContentBlock.Text("It’s the same as '\\n', but 'endl' also flushes the output buffer. 🎉")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content 7: Quiz Time! 🧠
                        LessonContent(
                            id = "beginner_cpp5_sub7",
                            title = "Quiz Time! 🧠",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which object is used to print output in C++?",
                                    options = listOf("printf", "cout", "println", "output"),
                                    correctAnswer = "cout",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        ),
                        // Content 8: Quiz Time! 🧠
                        LessonContent(
                            id = "beginner_cpp5_sub8",
                            title = "Quiz Time! 🧠",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which escape sequence is used for a new line?",
                                    options = listOf("\\n", "\\t", "\\a", "\\x"),
                                    correctAnswer = "\\n",
                                    userAnswer = null,
                                    isCorrect = false
                                ),
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),

// Lesson 6 : Variables
                Lesson(
                    id = "beginner_cpp6",
                    title = "Variables in C++",
                    description = "Learn about variables – the containers of your program’s data. From declaring to initializing and using them, let’s dive into the world of variables! 🛠️📦",
                    subLessons = listOf(
                        // Sub-lesson 1: Practice Previous Lessons
                        Lesson(
                            id = "beginner_cpp6_sub1",
                            title = "Practice Previous Lessons! 🔄",
                            description = "Before diving into variables, take a moment to practice what you've learned in the previous lessons! 📝 This will help you build a strong foundation for the next concepts.",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: What Are Variables?
                        Lesson(
                            id = "beginner_cpp6_sub2",
                            title = "What Are Variables?",
                            description = "Variables are like storage boxes in your code. You put data inside them, and later on, you can retrieve it. 🎁 Let’s explore how to declare them!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: Declaring Variables
                        Lesson(
                            id = "beginner_cpp6_sub3",
                            title = "Declaring Variables",
                            description = "Before you can use a variable, you need to declare it. 🏷️ This tells the program what type of data the variable will hold.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 4: Initializing Variables
                        Lesson(
                            id = "beginner_cpp6_sub4",
                            title = "Initializing Variables",
                            description = "Once declared, you can initialize variables with values. You can assign data right away, or leave them empty. 📥 Let's see how!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: Declaring Multiple Variables
                        Lesson(
                            id = "beginner_cpp6_sub5",
                            title = "Declaring Multiple Variables",
                            description = "You can declare multiple variables of the same type in one line. 🖊️ Let's see how to make the most of this shortcut!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: Variable Types
                        Lesson(
                            id = "beginner_cpp6_sub6",
                            title = "Variable Types",
                            description = "C++ offers different data types for variables like 'int', 'float', and 'char'. 🧮 Let’s learn how to choose the right type!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 7: Quiz
                        Lesson(
                            id = "beginner_cpp6_sub7",
                            title = "Quiz Time! 🧠",
                            description = "Test your knowledge of variables and their declaration in C++! 🏆 Let’s see if you’re ready to move forward.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "Practice Previous Lessons"
                        LessonContent(
                            id = "beginner_cpp6_sub1",
                            title = "Practice Previous Lessons! 🔄",
                            contentBlocks = listOf(
                                ContentBlock.Text("Before jumping into variables, take time to practice what you've learned in the previous lessons. Make sure you’re comfortable with the basics to get the most out of this lesson! 💡")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "What Are Variables?"
                        LessonContent(
                            id = "beginner_cpp6_sub2",
                            title = "What Are Variables?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Variables are like storage containers in your program. You store data in them, and later you can use that data to perform operations or make decisions. 🗂️"),
                                ContentBlock.Text("Think of a variable like a labeled box. You put something inside it (data), and you can retrieve it later by referring to the label (the variable's name). 📦"),
                                ContentBlock.Text("In C++, we can declare a variable by specifying its type and giving it a name. Let's see how this works in code! 🖥️")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Declaring Variables"
                        LessonContent(
                            id = "beginner_cpp6_sub3",
                            title = "Declaring Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("To declare a variable, we need to specify its type first, followed by its name. The type determines what kind of data the variable can hold. 🎯"),
                                ContentBlock.Code(code = "int age; // Declares an integer variable called 'age'"),
                                ContentBlock.Text("This declares an integer variable named 'age'. But wait – it's not yet holding any value! 🤔")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Initializing Variables"
                        LessonContent(
                            id = "beginner_cpp6_sub4",
                            title = "Initializing Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can initialize a variable by giving it a value right when you declare it. This is like filling the box with something! 🎁"),
                                ContentBlock.Code(code = "int age = 25; // Declares and initializes 'age' with a value of 25"),
                                ContentBlock.Text("Now the variable 'age' holds the value '25'. You can use it in calculations or display it. 💪")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Declaring Multiple Variables"
                        LessonContent(
                            id = "beginner_cpp6_sub5",
                            title = "Declaring Multiple Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can also declare multiple variables of the same type in a single line. This is a great way to keep your code neat and efficient. 🎯"),
                                ContentBlock.Code(code = "int x = 5, y = 10, z = 15; // Declares and initializes three integer variables"),
                                ContentBlock.Text("In this case, 'x', 'y', and 'z' are all integer variables, each initialized with a value. 🧮")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Variable Types"
                        LessonContent(
                            id = "beginner_cpp6_sub6",
                            title = "Variable Types",
                            contentBlocks = listOf(
                                ContentBlock.Text("Variables in C++ can hold different types of data, like integers ('int'), floating-point numbers ('float'), characters ('char'), and more. 💭"),
                                ContentBlock.Code(code = "float height = 5.9; // Declares a float variable"),
                                ContentBlock.Text("This declares a variable 'height' that holds a floating-point number (a decimal). It's important to choose the correct type based on what kind of data you need to store. 🧠"),
                                ContentBlock.Text("Here’s a breakdown of common C++ variable types and how they work:")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Data Types Overview
                        LessonContent(
                            id = "beginner_cpp6_sub6_data_types",
                            title = "Data Types in C++",
                            contentBlocks = listOf(
                                ContentBlock.Text("In C++, variables are containers for storing different types of data. Here's a look at common data types: 🎉"),

                                ContentBlock.Text("**'int'**: Stores integers (whole numbers), without decimals, such as 123 or -123."),
                                ContentBlock.Text("**'double'**: Stores floating-point numbers, with decimals, such as 19.99 or -19.99."),
                                ContentBlock.Text("**'char'**: Stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes. 🅰️"),
                                ContentBlock.Text("**'string'**: Stores text, such as \"Hello World\". String values are surrounded by double quotes. 💬"),
                                ContentBlock.Text("**'bool'**: Stores values with two states: true or false. ✅❌")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Quiz Time!"
                        LessonContent(
                            id = "beginner_cpp6_sub7",
                            title = "Quiz Time! 🧠",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which of these is the correct syntax to declare a variable in C++? 🧐",
                                    options = listOf("int age;", "age int;", "declare int age;", "variable age int;"),
                                    correctAnswer = "int age;",
                                    userAnswer = null,
                                    isCorrect = false
                                ),
//                                ContentBlock.QuizContentBlock(
//                                    question = "What type of variable would you use to store a decimal number? 🤔",
//                                    options = listOf("int", "float", "char", "double"),
//                                    correctAnswer = "float",
//                                    userAnswer = null,
//                                    isCorrect = false
//                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),


                // Lesson 7 : More on Variables
                Lesson(
                    id = "beginner_cpp7",
                    title = "More on Variables 🚀",
                    description = "Now that you know the basics, let’s dive deeper into the world of variables! 🏊‍♂️ In this lesson, we’ll talk about naming conventions and constants. Trust me, it’s going to be a wild ride! 😜",
                    subLessons = listOf(
                        // Sub-lesson 1: Practice Previous Lessons
                        Lesson(
                            id = "beginner_cpp7_sub1",
                            title = "Practice Your Variables! 🔄",
                            description = "Before we jump into more complex stuff, take a moment to review your previous lessons. Because hey, a strong foundation makes everything else easier! 💪",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: Naming Variables
                        Lesson(
                            id = "beginner_cpp7_sub2",
                            title = "Naming Variables: The Fun Part! 🤔",
                            description = "Naming your variables can be tricky, but with the right rules, it can be fun! Let’s talk about what makes a good variable name in C++. No more boring names like 'x' or 'y'! 😆",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: Constants - Hold On Tight! 🔒
                        Lesson(
                            id = "beginner_cpp7_sub3",
                            title = "Constants: The Unchangeable Heroes 🦸‍♂️",
                            description = "Variables are great, but constants are the true MVPs of C++! Learn how to use them and why they’re the unsung heroes of your code. They’ll never change on you (unlike that one friend 😜).",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 4: The Importance of Naming Conventions 📚
                        Lesson(
                            id = "beginner_cpp7_sub4",
                            title = "Why Naming Conventions Matter 🧐",
                            description = "So you’ve got your variables and constants. But did you know that the way you name them can make or break your code? Let’s get into some best practices for naming conventions.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: Naming Variables with Style ✨
                        Lesson(
                            id = "beginner_cpp7_sub5",
                            title = "Naming Variables with Style ✌️",
                            description = "If you name your variables like you name your pets, your code will thank you. Let’s explore some creative ways to name your variables like a pro. 🐱🐶",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: Quiz Time! 🧠
                        Lesson(
                            id = "beginner_cpp7_sub6",
                            title = "Quiz Time: Naming & Constants! 🧑‍🏫",
                            description = "Think you’ve mastered naming and constants? Let’s find out! Test your knowledge with this quiz. Don’t worry, no pressure, we’re all friends here. 😉",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "Practice Your Variables"
                        LessonContent(
                            id = "beginner_cpp7_sub1",
                            title = "Practice Your Variables! 🔄",
                            contentBlocks = listOf(
                                ContentBlock.Text("Before we dive into advanced topics, take a moment to review what you’ve learned so far. Trust me, you’ll feel way more confident moving forward! 😎")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Naming Variables"
                        LessonContent(
                            id = "beginner_cpp7_sub2",
                            title = "Naming Variables: The Fun Part! 🤔",
                            contentBlocks = listOf(
                                ContentBlock.Text("So, naming your variables. It’s like naming your pets! But instead of 'Fluffy', you should go for something meaningful. 🐱"),
                                ContentBlock.Text("Some rules: No spaces, start with a letter or underscore, and don’t start with a number. And no, ‘123abc’ is not a valid name! 😂"),
                                ContentBlock.Text("Here are some good examples:"),
                                ContentBlock.Code(code = "int userAge; // This is a good name!"),
                                ContentBlock.Text("But please, for the love of code, avoid names like 'int temp1' – let’s be creative, folks! 🧑‍🎨")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Constants"
                        LessonContent(
                            id = "beginner_cpp7_sub3",
                            title = "Constants: The Unchangeable Heroes 🦸‍♂️",
                            contentBlocks = listOf(
                                ContentBlock.Text("Constants are like that one friend who never changes their mind. They’re set in stone, unmovable. Once a constant is declared, it stays the same throughout your program. No changes allowed! 🙅‍♂️"),
                                ContentBlock.Code(code = "const int MAX_USERS = 100; // This value cannot be changed!"),
                                ContentBlock.Text("So, why use constants? They make your code safer by preventing accidental changes to important values. Plus, they make your code more readable. Win-win! 😁")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Naming Conventions"
                        LessonContent(
                            id = "beginner_cpp7_sub4",
                            title = "Why Naming Conventions Matter 🧐",
                            contentBlocks = listOf(
                                ContentBlock.Text("Good naming conventions are like good manners. They help others (and future-you) understand your code better."),
                                ContentBlock.Text("In C++, we often use camelCase or snake_case, depending on your team’s preference. But the most important thing is consistency! 🧐"),
                                ContentBlock.Code(code = "int totalAmount; // camelCase"),
                                ContentBlock.Code(code = "int total_amount; // snake_case"),
                                ContentBlock.Text("Pick one style and stick with it. Your future self will thank you. 😉")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Naming Variables with Style"
                        LessonContent(
                            id = "beginner_cpp7_sub5",
                            title = "Naming Variables with Style ✌️",
                            contentBlocks = listOf(
                                ContentBlock.Text("Naming variables can be an art. So why not add a little flair? 🖌️"),
                                ContentBlock.Text("For example:"),
                                ContentBlock.Code(code = "int superCoolUserAge; // A stylish name!"),
                                ContentBlock.Text("Now, don't go overboard, but a bit of creativity never hurt anyone. Naming variables with style makes your code stand out like a work of art. 🎨")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Quiz Time"
                        LessonContent(
                            id = "beginner_cpp7_sub6",
                            title = "Quiz Time: Naming & Constants! 🧑‍🏫",
                            contentBlocks = listOf(
//                                ContentBlock.QuizContentBlock(
//                                    question = "Which of these is the correct way to declare a constant in C++?",
//                                    options = listOf("const int MAX_USERS = 100;", "int const MAX_USERS = 100;", "MAX_USERS = 100;"),
//                                    correctAnswer = "const int MAX_USERS = 100;",
//                                    userAnswer = null,
//                                    isCorrect = false
//                                ),
                                ContentBlock.QuizContentBlock(
                                    question = "Which variable name is considered a good practice?",
                                    options = listOf("int age123;", "int Age123;", "int userAge;"),
                                    correctAnswer = "int userAge;",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),

                // Lesson 8 : C++ User Input 🖥️✍️
                Lesson(
                    id = "beginner_cpp8",
                    title = "C++ User Input",
                    description = "We’re moving from showing things on the screen to interacting with the user. Ready to let the user speak to your program? Let’s do this! 💬",
                    subLessons = listOf(
                        // Sub-lesson 1: Fun Introduction to User Input
                        Lesson(
                            id = "beginner_cpp8_sub1",
                            title = "User Input: Let’s Hear It! 🎤",
                            description = "Welcome to the world of User Input! 🥳 Instead of just talking at the user (with cout), now you’ll let them talk back using cin. Let’s explore how we can get the user’s input with ease. 🎙️",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: Getting Simple Input with cin 🎮
                        Lesson(
                            id = "beginner_cpp8_sub2",
                            title = "Getting Input with cin: Ready, Set, Go! 🏁",
                            description = "So, you've learned how to display things. But can your program listen? That’s where cin comes in. It’s like inviting the user to the party and letting them choose the playlist! 🎶",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: Example - Get a Number from the User 🎲
                        Lesson(
                            id = "beginner_cpp8_sub3",
                            title = "Get a Number: Your First Input 📲",
                            description = "Here’s where we’ll ask the user for a number. They type it in, and voilà, you’ve got their answer! 👏 Let’s make it happen!",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 4: Creating a Simple Calculator 🧮
                        Lesson(
                            id = "beginner_cpp8_sub4",
                            title = "Creating a Simple Calculator: Math Magic! 🧙‍♂️",
                            description = "Are you ready to make math fun? Now, let’s build a simple calculator where the user gives you two numbers and you perform the magic (or math) to get the sum. 🎩✨",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: Fun with Multiple Inputs 🧑‍🏫
                        Lesson(
                            id = "beginner_cpp8_sub5",
                            title = "Multiple Inputs: Getting Fancy 💁‍♂️",
                            description = "Why settle for one input when you can have more? Let’s spice things up and get multiple inputs from the user. You’re the DJ now, let’s create a party! 🎧💃",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: Quiz Block – Testing Your Input Skills 📝
                        Lesson(
                            id = "beginner_cpp8_sub6",
                            title = "Quiz Time: Test Your User Input Knowledge! 🧠",
                            description = "You’ve learned a lot about user input, so let's see if you can remember what you’ve learned. Ready to put your thinking cap on? 🎩",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "Fun Introduction to User Input"
                        LessonContent(
                            id = "beginner_cpp8_sub1",
                            title = "User Input: Let’s Hear It! 🎤",
                            contentBlocks = listOf(
                                ContentBlock.Text("Okay, we’ve been talking to the screen with 'cout' like it’s our best friend. But now, it's time to invite the user to the conversation! Enter 'cin', your new best friend in the world of user input. 🌍"),
                                ContentBlock.Text("In C++, 'cin' stands for 'Character Input' but you can think of it like 'Chat Input'. It lets you receive data from the keyboard. 🎹 Let’s dive into it! 👇")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Getting Input with cin"
                        LessonContent(
                            id = "beginner_cpp8_sub2",
                            title = "Getting Input with cin: Ready, Set, Go! 🏁",
                            contentBlocks = listOf(
                                ContentBlock.Text("So, you’ve learned how to output data with 'cout'. Now let’s see how we can take some input with 'cin'. It’s like when your friend says, ‘Hey, tell me a joke!’ You reply, and they laugh. 😂"),
                                ContentBlock.Text("Here’s how it works:"),
                                ContentBlock.Code(
                                    code = """
int x; // Declare a variable
cout << 'Type a number: '; // Prompt the user
cin >> x; // Capture input from the user
cout << 'Your number is: ' << x; // Print the value
                """
                                ),
                                ContentBlock.Text("Now, your program is waiting for the user to type something. Just like how you wait for a pizza delivery. 🍕")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Get a Number from the User"
                        LessonContent(
                            id = "beginner_cpp8_sub3",
                            title = "Get a Number: Your First Input 📲",
                            contentBlocks = listOf(
                                ContentBlock.Text("In this lesson, let’s get the user’s number. Simple, right? Here’s an example:"),
                                ContentBlock.Code(
                                    code = """
int x;
cout << 'Type a number: ';
cin >> x;
cout << 'Your number is: ' << x;
                """
                                ),
                                ContentBlock.Text("Now your program can talk back! It’s like magic, but real! 🎩✨")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Creating a Simple Calculator"
                        LessonContent(
                            id = "beginner_cpp8_sub4",
                            title = "Creating a Simple Calculator: Math Magic! 🧙‍♂️",
                            contentBlocks = listOf(
                                ContentBlock.Text("Let’s build a simple calculator. The user will give us two numbers, and we’ll sum them up. Easy, right? Let’s make it happen! 🧮"),
                                ContentBlock.Code(
                                    code = """
int x, y, sum;
cout << 'Type a number: ';
cin >> x;
cout << 'Type another number: ';
cin >> y;
sum = x + y;
cout << 'Sum is: ' << sum;
                """
                                ),
                                ContentBlock.Text("You’ve just built your first calculator! You’re officially a programmer! 🎉")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Multiple Inputs"
                        LessonContent(
                            id = "beginner_cpp8_sub5",
                            title = "Multiple Inputs: Getting Fancy 💁‍♂️",
                            contentBlocks = listOf(
                                ContentBlock.Text("Now, let’s get fancy with multiple inputs. Who said we can’t handle more than one request at a time? 🧑‍🎤"),
                                ContentBlock.Text("You can ask the user for multiple inputs at once. Here’s how:"),
                                ContentBlock.Code(
                                    code = """
int x, y, z;
cout << 'Enter three numbers: ';
cin >> x >> y >> z;
cout << 'You entered: ' << x << ', ' << y << ', ' << z;
                """
                                ),
                                ContentBlock.Text("Boom! You just handled multiple inputs like a pro! 💁‍♂️")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for Quiz Block
                        LessonContent(
                            id = "beginner_cpp8_sub6",
                            title = "Quiz Time: Test Your User Input Knowledge! 🧠",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which keyword is used to get user input in C++?",
                                    options = listOf("cin", "cout", "get", "input"),
                                    correctAnswer = "cin",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),

                // Lesson 9: C++ Data types
                Lesson(
                    id = "beginner_cpp9",
                    title = "C++ Data Types",
                    description = "We’ve learned how to get input from the user, but now it’s time to store that data in the right container! Ready to choose the right data type for the job? 🛠️",
                    subLessons = listOf(
                        // Sub-lesson 1: Fun Introduction to Data Types
                        Lesson(
                            id = "beginner_cpp9_sub1",
                            title = "The Right Container for Your Data!",
                            description = "In the world of programming, there are many types of data, and just like we pack things in different bags, we store data in different types. Let's get to know them! 🎒",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: Working with Numbers ('int', 'float', 'double') 🔢
                        Lesson(
                            id = "beginner_cpp9_sub2",
                            title = "Counting on 'int', 'float', and 'double'!",
                            description = "When you need to store numbers, you have several choices. Use 'int' for whole numbers, 'float' for numbers with decimals, and 'double' when you need more precision. It’s like choosing between a pencil, a marker, and a fine-tipped pen! 🖊️",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 3: Booleans ('bool') – True or False?
                        Lesson(
                            id = "beginner_cpp9_sub3",
                            title = "Booleans ('bool'): True or False? ",
                            description = "Booleans can store only two values: 'true' or 'false'. It's like flipping a coin! 🪙 Will it be heads or tails? You decide.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 4: Characters ('char') – The Alphabet's Little Helper! 🅰️
                        Lesson(
                            id = "beginner_cpp9_sub4",
                            title = "Characters ('char'): The Alphabet's Little Helper!",
                            description = "Need to store a single letter? Use 'char'! It’s like putting one letter into a tiny pocket. Need more letters? Use 'string' for the whole word! ✨",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: Strings ('string') – Words Are Important! 📝
                        Lesson(
                            id = "beginner_cpp9_sub5",
                            title = "Strings ('string'): Words Are Important!📝",
                            description = "When you need to store more than one letter, use 'string'. It’s like writing a sentence in your notebook! 🖋️",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: Quiz Block – Testing Your Data Types Knowledge 📝
                        Lesson(
                            id = "beginner_cpp9_sub6",
                            title = "Quiz Time: Test Your Data Types Knowledge! 🧠",
                            description = "Now that you’ve learned the data types, let’s test your knowledge. Ready to show what you’ve got?",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "Fun Introduction to Data Types"
                        LessonContent(
                            id = "beginner_cpp9_sub1",
                            title = "The Right Container for Your Data!",
                            contentBlocks = listOf(
                                ContentBlock.Text("Just like packing your clothes into different bags for a trip, C++ requires you to store data in different types. You can store whole numbers in 'int', decimals in 'float' or 'double', and even characters or words in 'char' and 'string'. Each has its purpose! 🛠️")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Working with Numbers ('int', 'float', 'double')"
                        LessonContent(
                            id = "beginner_cpp9_sub2",
                            title = "Counting on 'int', 'float', and 'double'!",
                            contentBlocks = listOf(
                                ContentBlock.Text("Numbers come in all shapes and sizes, and C++ has the perfect containers for them: 'int' for whole numbers, 'float' for decimal numbers, and 'double' for high-precision numbers."),
                                ContentBlock.Code(
                                    code = """
int age = 25;
float height = 5.9;
double pi = 3.1415926535;
            """
                                ),
                                ContentBlock.Text("In this example, we use 'int' for the age, 'float' for the height, and 'double' for Pi's precise value.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Booleans ('bool')"
                        LessonContent(
                            id = "beginner_cpp9_sub3",
                            title = "Booleans ('bool'): True or False?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Booleans store one of two values: 'true' or 'false'. They are perfect for making decisions. Let’s use a 'bool' to check if it's sunny! 🌞"),
                                ContentBlock.Code(
                                    code = """
bool isSunny = true;
cout << 'Is it sunny? ' << isSunny;
        """
                                ),
                                ContentBlock.Text("In this example, 'isSunny' is set to 'true', so the program will print 'Is it sunny? 1'. In C++, 'true' is represented by 1, and 'false' is represented by 0.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Characters ('char')"
                        LessonContent(
                            id = "beginner_cpp9_sub4",
                            title = "Characters ('char'): The Alphabet's Little Helper!",
                            contentBlocks = listOf(
                                ContentBlock.Text("Need to store a single letter or character? Use 'char'! It's perfect for representing things like grades, initials, or even emoji!"),
                                ContentBlock.Code(
                                    code = """
char grade = 'A';
char symbol = '#';
cout << 'Grade: ' << grade << ', Symbol: ' << symbol;
            """
                                ),
                                ContentBlock.Text("In this example, 'grade' stores a single character ('A'), and 'symbol' stores the '#' symbol.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Strings ('string')"
                        LessonContent(
                            id = "beginner_cpp9_sub5",
                            title = "Strings ('string'): Words Are Important!📝",
                            contentBlocks = listOf(
                                ContentBlock.Text("When you need to store a sequence of characters (like a name or sentence), use 'string'."),
                                ContentBlock.Code(
                                    code = """
string greeting = 'Hello, world!';
cout << 'Greeting: ' << greeting;
            """
                                ),
                                ContentBlock.Text("In this example, we store a full sentence in 'string'. It's like having a word processor for your program!")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Quiz Block"
                        LessonContent(
                            id = "beginner_cpp9_sub6",
                            title = "Quiz Time: Test Your Data Types Knowledge! 🧠",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which data type would you use to store the number 3.14?",
                                    options = listOf("int", "float", "bool", "string"),
                                    correctAnswer = "float",
                                    userAnswer = null,
                                    isCorrect = false
                                )
                            ),
                            type = LessonContentType.QUIZ
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),


                // Lesson 10: String in C++
                Lesson(
                    id = "beginner_cpp10",
                    title = "C++ Strings: The Word Wizards! 💬",
                    description = "Time to play with strings! Let's learn how to handle words, numbers, and user input in C++! 🧙‍♂️",
                    subLessons = listOf(
                        // Sub-lesson 1: Introduction to Strings
                        Lesson(
                            id = "beginner_cpp10_sub1",
                            title = "Strings: The Basics 💬",
                            description = "Strings hold words and sentences! Let’s create a simple string and display it.",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: String Concatenation
                        Lesson(
                            id = "beginner_cpp10_sub2",
                            title = "String Concatenation 🎭",
                            description = "Combine strings and numbers together with concatenation. It’s like making a message!",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 3: String Input
                        Lesson(
                            id = "beginner_cpp10_sub3",
                            title = "User Input with Strings 🧑‍💻",
                            description = "Take input from the user and store it in a string.",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 4: String Length
                        Lesson(
                            id = "beginner_cpp10_sub4",
                            title = "Measuring String Length 📏",
                            description = "Find out how many characters are in your string.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 5: String Functions
                        Lesson(
                            id = "beginner_cpp10_sub5",
                            title = "Using String Functions 🧪",
                            description = "Learn some fun functions like 'substr()' and 'find()' to manipulate strings.",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 6: String Quiz
                        Lesson(
                            id = "beginner_cpp10_sub6",
                            title = "String Quiz 🎓",
                            description = "Test your string knowledge with a fun quiz!",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "Strings: The Basics 💬"
                        LessonContent(
                            id = "beginner_cpp10_sub1",
                            title = "Strings: The Basics 💬",
                            contentBlocks = listOf(
                                ContentBlock.Text("Strings are used to store text. Here's how we can store and display a simple string:"),

                                ContentBlock.Code(
                                    code = """
string greeting = "Hello, World!";
cout << greeting;
            """
                                ),

                                ContentBlock.Text("This prints: 'Hello, World!'")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "String Concatenation 🎭"
                        LessonContent(
                            id = "beginner_cpp10_sub2",
                            title = "String Concatenation 🎭",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can combine strings and numbers using concatenation:"),

                                ContentBlock.Code(
                                    code = """
string name = "Alice";
int age = 30;
cout << "Hello, " << name << ". You are " << age << " years old.";
            """
                                ),

                                ContentBlock.Text("This will output: 'Hello, Alice. You are 30 years old.'")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "User Input with Strings 🧑‍💻"
                        LessonContent(
                            id = "beginner_cpp10_sub3",
                            title = "User Input with Strings 🧑‍💻",
                            contentBlocks = listOf(
                                ContentBlock.Text("Get user input and store it in a string:"),

                                ContentBlock.Code(
                                    code = """
string name;
getline(cin, name);
cout << "Hello, " << name << "!";
            """
                                ),

                                ContentBlock.Text("This asks for a name, and when you enter it, it prints: 'Hello, [your name]!'")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Measuring String Length 📏"
                        LessonContent(
                            id = "beginner_cpp10_sub4",
                            title = "Measuring String Length 📏",
                            contentBlocks = listOf(
                                ContentBlock.Text("To find the length of a string, use the 'length()' function:"),

                                ContentBlock.Code(
                                    code = """
string message = "C++ is awesome!";
cout << message.length();
            """
                                ),

                                ContentBlock.Text("This will print '15', the number of characters in the string.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Using String Functions 🧪"
                        LessonContent(
                            id = "beginner_cpp10_sub5",
                            title = "Using String Functions 🧪",
                            contentBlocks = listOf(
                                ContentBlock.Text("You can use various functions to manipulate strings. For example, 'substr()' extracts a part of the string:"),

                                ContentBlock.Code(
                                    code = """
string message = "Hello, World!";
string part = message.substr(0, 5);
cout << part;
            """
                                ),

                                ContentBlock.Text("This will print 'Hello'.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "String Quiz 🎓"
                        LessonContent(
                            id = "beginner_cpp10_sub6",
                            title = "String Quiz 🎓",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What function is used to get the length of a string?",
                                    options = listOf("size()", "length()", "getLength()"),
                                    correctAnswer = "length()"
                                ),
                            ),
                            type = LessonContentType.INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),




                // Lesson 11: Booleans
                Lesson(
                    id = "beginner_cpp11",
                    title = "Booleans: True or False?",
                    description = "Time to learn about Booleans in C++! Let’s play with true or false!",
                    subLessons = listOf(
                        // Sub-lesson 1: Introduction to Booleans
                        Lesson(
                            id = "beginner_cpp11_sub1",
                            title = "Booleans: Yes or No?",
                            description = "Let's start with a boolean variable that checks if something is true or false.",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: Using Booleans in Decisions
                        Lesson(
                            id = "beginner_cpp11_sub2",
                            title = "Booleans for Decisions",
                            description = "Booleans help make decisions. We’ll see how to use 'true' or 'false' for making choices.",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 3: Boolean Variables in Action
                        Lesson(
                            id = "beginner_cpp11_sub3",
                            title = "Boolean Variables in Action",
                            description = "In this lesson, we’ll use boolean variables in different scenarios. Don’t worry about using 'if-else' for now, we’ll cover that in the next lesson! 😄",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 4: Boolean Quiz
                        Lesson(
                            id = "beginner_cpp11_sub4",
                            title = "Boolean Quiz",
                            description = "Test your knowledge with a fun quiz about booleans!",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "Booleans: Yes or No?"
                        LessonContent(
                            id = "beginner_cpp11_sub1",
                            title = "Booleans: Yes or No?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Ever been asked if you want to go to school and you said 'no'? But your mother said 'Yes!'"),
                                ContentBlock.Text("\uD83D\uDE44 That's how it feels when we deal with booleans in C++. A boolean can be either 'true' or 'false', and that's all!"),

                                ContentBlock.Code(code = """
bool isSchoolToday = false;
cout << isSchoolToday;
                """),

                                ContentBlock.Text("This will output: '0' because 'false' is represented as 0' in C++. If it were 'true', it would output '1'!")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Booleans for Decisions"
                        LessonContent(
                            id = "beginner_cpp11_sub2",
                            title = "Booleans for Decisions",
                            contentBlocks = listOf(
                                ContentBlock.Text("Let’s use booleans to make decisions. You might want to check if it’s the weekend and whether to relax or do homework. 😂"),

                                ContentBlock.Code(code = """
bool isWeekend = true;
cout << "Is it the weekend? " << isWeekend;
                """),

                                ContentBlock.Text("This will output '1' because 'true' is represented as '1' in C++, and if it were 'false', it would print '0'.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Boolean Variables in Action"
                        LessonContent(
                            id = "beginner_cpp11_sub3",
                            title = "Boolean Variables in Action",
                            contentBlocks = listOf(
                                ContentBlock.Text("Booleans can be used to check conditions and represent different states. Let’s try a scenario where we check if a student has passed their exam."),

                                ContentBlock.Code(code = """
bool hasPassedExam = true;
cout << "Has the student passed the exam? " << hasPassedExam;
                """),

                                ContentBlock.Text("Here, if 'hasPassedExam' is 'true', it will print '1' (passed), and 'false' will print '0' (not passed). This helps us track true or false scenarios! 😎")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Boolean Quiz"
                        LessonContent(
                            id = "beginner_cpp11_sub4",
                            title = "Boolean Quiz",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What is the value of a boolean 'false' in C++?",
                                    options = listOf("1", "0", "true"),
                                    correctAnswer = "0"
                                ),
                            ),
                            type = LessonContentType.INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),

                // Lesson 12: Conditionals if-else
                Lesson(
                    id = "beginner_cpp12",
                    title = "If-Else – Make Choices!",
                    description = "Time to make decisions in your code! With If-Else, you can choose what happens next in your program. It’s like choosing between pizza and salad – let's get started! 🍕🥗",
                    subLessons = listOf(
                        // Sub-lesson 1: Introduction to If-Else
                        Lesson(
                            id = "beginner_cpp12_sub1",
                            title = "What is If-Else?",
                            description = "Let’s explore what If-Else does in the world of code. It’s like making decisions every day: should I stay in bed or get up? We’ll figure that out with If-Else! 🛏️🚶‍♂️",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: Humor about If-Else Decisions
                        Lesson(
                            id = "beginner_cpp12_sub2",
                            title = "The Ultimate Decision: Should I Eat or Not?",
                            description = "Imagine deciding whether to eat lunch. Should I eat pizza, or am I okay without food? That’s what If-Else is about – making choices based on a condition. 🍕🤔",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 3: Introduction to Code with If-Else
                        Lesson(
                            id = "beginner_cpp12_sub3",
                            title = "If-Else: The Code Behind the Decision",
                            description = "Now let’s turn our decision-making into code. If you’re hungry, you eat pizza. If not, maybe salad. Let's see it in action! 🍕💻",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 4: Simple Decision Before Else-If
                        Lesson(
                            id = "beginner_cpp12_sub4",
                            title = "A Simple Decision: Should I Get Up or Not?",
                            description = "Let’s make a simple decision before we dive deeper. Imagine you’re lying in bed, and the big question is: Should I get up or not? If you’re lazy, you stay in bed; otherwise, you get up and conquer the day! 🛏️🙌",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 5: Else-If and Else: More Choices!
                        Lesson(
                            id = "beginner_cpp12_sub5",
                            title = "Else-If and Else: More Choices!",
                            description = "Now, let’s level up! With `else if`, we can check multiple conditions, and with `else`, we have a default choice. Think of it like deciding if you want pizza, burger, or salad – the options just keep getting better! 🍕🍔🥗",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 6: Else-If Quiz
                        Lesson(
                            id = "beginner_cpp12_sub6",
                            title = "Else-If Quiz",
                            description = "Test your knowledge of `else if` and `else` with a fun quiz! 📝🎉",
                            status = LessonStatus.LOCKED
                        ),

                        // Sub-lesson 7: Final Quiz
                        Lesson(
                            id = "beginner_cpp12_sub7",
                            title = "Final Quiz: Conditionals Recap!",
                            description = "Let's test everything we've learned so far about `if`, `else`, and `else if` in one big quiz! 🎉",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "What is If-Else?"
                        LessonContent(
                            id = "beginner_cpp12_sub1",
                            title = "What is If-Else?",
                            contentBlocks = listOf(
                                ContentBlock.Text("If-Else is like making a choice: if something is true, do one thing; if not, do something else. It’s all about making decisions. 💭"),
                                ContentBlock.Text("Think about it like deciding whether to stay in bed or get up. If you’re feeling lazy, you stay in bed. If you’re energetic, you get up! That’s the power of If-Else. 😴➡️🏃‍♂️")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "The Ultimate Decision: Should I Eat or Not?"
                        LessonContent(
                            id = "beginner_cpp12_sub2",
                            title = "The Ultimate Decision: Should I Eat or Not?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Imagine you’ve just woken up. The big question: should I eat pizza or not? The answer depends on one condition – are you hungry? 🍕🤤"),
                                ContentBlock.Text("If you’re hungry, you get pizza. If not, maybe salad or nothing. That’s the magic of If-Else decisions! 🤔🥗")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "If-Else: The Code Behind the Decision"
                        LessonContent(
                            id = "beginner_cpp12_sub3",
                            title = "If-Else: The Code Behind the Decision",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here’s how you can express this decision in code:"),
                                ContentBlock.Code(code = """
bool isHungry = true;
if (isHungry) {
    cout << "Pizza time!";
} else {
    cout << "Maybe salad or nothing!";
}
                """),
                                ContentBlock.Text("This code checks if you're hungry. If `true`, you get pizza. If `false`, you get salad or nothing. Simple, right? 🍕🥗")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "A Simple Decision: Should I Get Up or Not?"
                        LessonContent(
                            id = "beginner_cpp12_sub4",
                            title = "A Simple Decision: Should I Get Up or Not?",
                            contentBlocks = listOf(
                                ContentBlock.Text("You’ve woken up and the question is: should I get up or stay in bed? 🛏️😴"),
                                ContentBlock.Text("If you’re feeling lazy, you stay in bed. If you’re feeling productive, you get up and make coffee. ☕️"),
                                ContentBlock.Text("Let’s put this into code! 🖥️")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Else-If and Else: More Choices!"
                        LessonContent(
                            id = "beginner_cpp12_sub5",
                            title = "Else-If and Else: More Choices!",
                            contentBlocks = listOf(
                                ContentBlock.Text("Here’s where we level up! With `else if`, we can handle more conditions. It’s like saying:"),
                                ContentBlock.Code(code = """
bool isHungry = false;
bool isCravingPizza = true;
if (isHungry) {
    cout << "Let’s eat!";
} else if (isCravingPizza) {
    cout << "Pizza time!";
} else {
    cout << "Maybe a snack later!";
}
                """),
                                ContentBlock.Text("This code checks if you’re hungry. If not, it checks if you’re craving pizza. If neither is true, the `else` statement takes over. 🎉")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Else-If Quiz"
                        LessonContent(
                            id = "beginner_cpp12_sub6",
                            title = "Else-If Quiz",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What will this code print?\n\n`bool isHungry = false;\nbool isCravingPizza = true;\nif (isHungry) {\n    cout << \"Let’s eat!\";\n} else if (isCravingPizza) {\n    cout << \"Pizza time!\";\n} else {\n    cout << \"Maybe a snack later!\";\n}`",
                                    options = listOf("Let’s eat!", "Pizza time!", "Maybe a snack later!"),
                                    correctAnswer = "Pizza time!"
                                )
                            ),
                            type = LessonContentType.INTERACTIVE
                        ),

                        // Content for "Final Quiz"
                        LessonContent(
                            id = "beginner_cpp12_sub7",
                            title = "Final Quiz: Conditionals Recap!",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "Which of the following is true about `else if` statements?\n\n1. `else if` checks an additional condition if the previous condition was false.\n2. `else if` is the last choice after all other conditions.\n3. You should use `else` instead of `else if` if you have multiple conditions.",
                                    options = listOf("Option 1", "Option 2", "Option 3"),
                                    correctAnswer = "Option 1"
                                )
                            ),
                            type = LessonContentType.INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),


                // Lesson 13: Nested If else
                // Lesson 13: Nested If else
                Lesson(
                    id = "beginner_cpp13",
                    title = "Nested if-else: Decisions!",
                    description = "Ready to level up your decision-making skills? In this lesson, we’ll explore Nested If-Else and Logical Operators like `&&` (AND) and `||` (OR). It's like deciding what to eat based on your hunger, time, and mood! 🍕🤔",
                    subLessons = listOf(
                        // Sub-lesson 1: What is Nested If-Else?
                        Lesson(
                            id = "beginner_cpp13_sub1",
                            title = "What is Nested If-Else?",
                            description = "Nested if-else is like making multiple decisions one after another. For example, if it's sunny, check if you have time for a walk! 🌞🚶‍♂️",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 2: Humor about Nested If-Else
                        Lesson(
                            id = "beginner_cpp13_sub2",
                            title = "Nested Decisions: Should I Go Outside or Stay In?",
                            description = "Imagine deciding whether to go outside or not. First, you check if it's sunny, then you check if you have time. If both are true, you go outside! 🌞⏰",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 3: Introduction to AND Operator (`&&`)
                        Lesson(
                            id = "beginner_cpp13_sub3",
                            title = "The AND Operator (&&)",
                            description = "With `&&`, both conditions must be true for the decision to be made. Think of it like saying, 'I’ll go to the party if it's my birthday AND I have time!' 🎉⏰",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 4: Introduction to OR Operator (`||`)
                        Lesson(
                            id = "beginner_cpp13_sub4",
                            title = "The OR Operator (||)",
                            description = "With `||`, only one condition needs to be true. It's like saying, 'I’ll go to the party if it’s my birthday OR if I feel like it!' 🎉😄",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 5: Nested If-Else with AND Operator
                        Lesson(
                            id = "beginner_cpp13_sub5",
                            title = "Nested If-Else with AND (&&)",
                            description = "Let’s combine nested if-else with the AND operator. First, check if it’s sunny, then check if you have time. If both are true, go outside! 🌞⏰",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 6: Nested If-Else with OR Operator
                        Lesson(
                            id = "beginner_cpp13_sub6",
                            title = "Nested If-Else with OR (||)",
                            description = "Now, let's try with the OR operator. If it's sunny OR if you have time, go outside! ☀️ OR ⏰",
                            status = LessonStatus.ACTIVE
                        ),

                        // Sub-lesson 7: Quiz on Nested If-Else and Logical Operators
                        Lesson(
                            id = "beginner_cpp13_sub7",
                            title = "Simple Quiz",
                            description = "Test your knowledge of nested if-else and logical operators with a fun quiz! 📝🎉",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Content for "What is Nested If-Else?"
                        LessonContent(
                            id = "beginner_cpp13_sub1",
                            title = "What is Nested If-Else?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Nested if-else is like asking a series of questions. For example, if it's sunny, then check if you have time to go outside. If both are true, you go outside! 🌞🚶‍♂️"),
                                ContentBlock.Text("It’s like a chain of decisions, where each condition can depend on the result of the previous one.")
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Nested Decisions: Should I Go Outside or Stay In?"
                        LessonContent(
                            id = "beginner_cpp13_sub2",
                            title = "Should I Go Outside or Stay In?",
                            contentBlocks = listOf(
                                ContentBlock.Text("Let’s say you want to decide whether to go outside or not. First, check if it’s sunny. If yes, check if you have time. If both are true, you go outside!"),
                                ContentBlock.Text("Here’s the code that makes this decision:"),
                                ContentBlock.Code(code = """
int isSunny = 1;  // 1 means it's sunny
int hasTime = 0;  // 0 means you don't have time

if (isSunny) {
    if (hasTime) {
        printf("Go outside!");
    } else {
        printf("Stay inside and relax.");
    }
} else {
    printf("Stay inside.");
}
                """)
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "The AND Operator (&&): Both Conditions Must Be True!"
                        LessonContent(
                            id = "beginner_cpp13_sub3",
                            title = "The AND Operator (&&)",
                            contentBlocks = listOf(
                                ContentBlock.Text("With the AND operator (`&&`), both conditions must be true for the action to happen."),
                                ContentBlock.Text("For example, 'I’ll go to the park if it’s sunny AND I have time.' If one of these is false, you stay in!"),
                                ContentBlock.Code(code = """
int isSunny = 1;
int hasTime = 1;

if (isSunny && hasTime) {
    printf("Go to the park!");
} else {
    printf("Stay inside.");
}
                """)
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "The OR Operator (||): Only One Condition Needs to Be True!"
                        LessonContent(
                            id = "beginner_cpp13_sub4",
                            title = "The OR Operator (||)",
                            contentBlocks = listOf(
                                ContentBlock.Text("With the OR operator (`||`), only one condition needs to be true for the action to happen."),
                                ContentBlock.Text("For example, 'I’ll go outside if it’s sunny OR if I have time.' Either one is enough to make the decision."),
                                ContentBlock.Code(code = """
int isSunny = 0;
int hasTime = 1;

if (isSunny || hasTime) {
    printf("Go outside!");
} else {
    printf("Stay inside.");
}
                """)
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Nested If-Else with AND Operator"
                        LessonContent(
                            id = "beginner_cpp13_sub5",
                            title = "Nested If-Else with AND (&&)",
                            contentBlocks = listOf(
                                ContentBlock.Text("Let’s put the AND operator into nested if-else. First, check if it’s sunny. Then check if you have time. Both must be true to go outside."),
                                ContentBlock.Code(code = """
int isSunny = 1; 
int hasTime = 1; 

if (isSunny) {
    if (hasTime) {
        printf("Let’s go for a walk!");
    } else {
        printf("No time to walk today.");
    }
} else {
    printf("Stay inside.");
}
                """)
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Nested If-Else with OR Operator"
                        LessonContent(
                            id = "beginner_cpp13_sub6",
                            title = "Nested If-Else with OR (||)",
                            contentBlocks = listOf(
                                ContentBlock.Text("Now, let’s use OR to check if it’s sunny OR if you have time to go outside."),
                                ContentBlock.Code(code = """
int isSunny = 0;
int hasTime = 1;

if (isSunny || hasTime) {
    printf("Time to go outside!");
} else {
    printf("Stay inside.");
}
                """)
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),

                        // Content for "Nested If-Else and Logical Operators Quiz"
                        LessonContent(
                            id = "beginner_cpp13_sub7",
                            title = "Nested If-Else and Logical Operators Quiz",
                            contentBlocks = listOf(
                                ContentBlock.QuizContentBlock(
                                    question = "What will this code print?\n\n`int isSunny = 1;\nint hasTime = 0;\nif (isSunny) {\n    if (hasTime) {\n        printf(\"Go outside!\");\n    } else {\n        printf(\"Stay inside.\");\n    }\n} else {\n    printf(\"Stay inside.\");\n}`",
                                    options = listOf("Go outside!", "Stay inside.", "It depends on the weather."),
                                    correctAnswer = "Stay inside."
                                )
                            ),
                            type = LessonContentType.INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                )

            )
        )
    }


    fun CPPIntermediateCourse(): Stage {
        return Stage(
            id = "beginner_stage",
            title = "Beginner",
            lessons = listOf(
                Lesson(
                    id = "beginner_c1",
                    title = "Introduction to C Programming",
                    description = "In this lesson, we will cover the basics of C programming, including syntax, structure, and variables.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c1_sub1",
                            title = "Overview of C Programming",
                            description = "Introduction to C programming and its key features. Discuss the history of C, its popularity, and where it is used.",
                            status = LessonStatus.ACTIVE
                        ),
                        Lesson(
                            id = "beginner_c1_sub2",
                            title = "Basic Syntax",
                            description = "Understanding the structure of a C program, including functions, libraries, and statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub3",
                            title = "Printing Output in C",
                            description = "How to print output in C using the 'printf' function, including printing strings and variables.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Lesson Content 1: Overview of C Programming
                        LessonContent(
                            id = "beginner_c1_sub1",
                            title = "Overview of C Programming",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "C is one of the most popular and widely used programming languages, " +
                                            "especially for system-level programming. Developed in the 1970s by Dennis Ritchie, C has influenced" +
                                            " many modern programming languages. It is fast, efficient, and allows direct manipulation of memory, " +
                                            "making it ideal for writing operating systems, embedded systems, and more."
                                ),
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Lesson Content 2: Basic Syntax
                        LessonContent(
                            id = "beginner_c1_sub2",
                            title = "Basic Syntax",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A basic C program has a clear structure: it includes functions, declarations, and statements." +
                                            " All C programs start execution from the 'main()' function. The structure is simple but powerful."
                                ),
                                ContentBlock.Code(
                                    "/* Simple C syntax example */\n#include <stdio.h>\nint main() {\n    printf(\"Welcome to C programming!\");\n    return 0;\n}"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Lesson Content 3: Printing Output
                        LessonContent(
                            id = "beginner_c1_sub3",
                            title = "Printing Output in C",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C, we use the 'printf()' function to display output. The 'printf' function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the '\\n' is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like '%d' for integers or '%s' for strings."
                                ),
                                ContentBlock.Code(
                                    "/* Printing variables example */\n#include <stdio.h>\nint main() {\n    int number = 10;\n    printf(\"The value of number is: %d\\n\", number);\n    return 0;\n}"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                )
            )
        )
    }

    fun CPPAdvancedCourse(): Stage {
        return Stage(
            id = "beginner_stage",
            title = "Beginner",
            lessons = listOf(
                Lesson(
                    id = "beginner_c1",
                    title = "Introduction to C Programming",
                    description = "In this lesson, we will cover the basics of C programming, including syntax, structure, and variables.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c1_sub1",
                            title = "Overview of C Programming",
                            description = "Introduction to C programming and its key features. Discuss the history of C, its popularity, and where it is used.",
                            status = LessonStatus.ACTIVE
                        ),
                        Lesson(
                            id = "beginner_c1_sub2",
                            title = "Basic Syntax",
                            description = "Understanding the structure of a C program, including functions, libraries, and statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub3",
                            title = "Printing Output in C",
                            description = "How to print output in C using the 'printf' function, including printing strings and variables.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Lesson Content 1: Overview of C Programming
                        LessonContent(
                            id = "beginner_c1_sub1",
                            title = "Overview of C Programming",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "C is one of the most popular and widely used programming languages, " +
                                            "especially for system-level programming. Developed in the 1970s by Dennis Ritchie, C has influenced" +
                                            " many modern programming languages. It is fast, efficient, and allows direct manipulation of memory, " +
                                            "making it ideal for writing operating systems, embedded systems, and more."
                                ),
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Lesson Content 2: Basic Syntax
                        LessonContent(
                            id = "beginner_c1_sub2",
                            title = "Basic Syntax",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A basic C program has a clear structure: it includes functions, declarations, and statements." +
                                            " All C programs start execution from the 'main()' function. The structure is simple but powerful."
                                ),
                                ContentBlock.Code(
                                    "/* Simple C syntax example */\n#include <stdio.h>\nint main() {\n    printf(\"Welcome to C programming!\");\n    return 0;\n}"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Lesson Content 3: Printing Output
                        LessonContent(
                            id = "beginner_c1_sub3",
                            title = "Printing Output in C",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C, we use the 'printf()' function to display output. The 'printf' function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the '\\n' is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like '%d' for integers or '%s' for strings."
                                ),
                                ContentBlock.Code(
                                    "/* Printing variables example */\n#include <stdio.h>\nint main() {\n    int number = 10;\n    printf(\"The value of number is: %d\\n\", number);\n    return 0;\n}"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),
                // Lesson 2: Data Types and Variables
                Lesson(
                    id = "beginner_c2",
                    title = "Data Types and Variables",
                    description = "In this lesson, we will learn about different data types in C and how to declare and use variables.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c2_sub1",
                            title = "Understanding Data Types",
                            description = "Introduction to basic data types like int, char, float, and double.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c2_sub2",
                            title = "Declaring and Using Variables",
                            description = "Learn how to declare variables and assign values in C.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c2_sub1",
                            title = "Understanding Data Types",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C, you use different data types to store values of different kinds, such as integers, floating-point numbers, or characters. Here are some of the most commonly used data types:"
                                ),
                                ContentBlock.Text(
                                    "1. 'int': Stores integers (whole numbers). Example: 'int a = 5;'\n" +
                                            "2. 'char': Stores a single character. Example: 'char letter = 'A';'\n" +
                                            "3. 'float': Stores floating-point numbers (numbers with decimals). Example: 'float pi = 3.14f;'\n" +
                                            "4. 'double': Stores larger floating-point numbers. Example: 'double e = 2.71828;'"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c2_sub2",
                            title = "Declaring and Using Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "To declare a variable in C, you specify the data type, followed by the variable name. You can also assign a value when declaring it."
                                ),
                                ContentBlock.Code(
                                    "/* Declaring and using variables example */\n#include <stdio.h>\nint main() {\n    int age = 25;  // Declaring an integer variable\n    char grade = 'A';  // Declaring a character variable\n    printf(\"Age: %d, Grade: %c\\n\", age, grade);\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In this example, we declare two variables: 'age' of type 'int', and 'grade' of type 'char'. We then print them using 'printf'."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                )
            )
        )
    }

    fun CPPExpertCourse(): Stage {
        return Stage(
            id = "beginner_stage",
            title = "Beginner",
            lessons = listOf(
                Lesson(
                    id = "beginner_c1",
                    title = "Introduction to C Programming",
                    description = "In this lesson, we will cover the basics of C programming, including syntax, structure, and variables.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c1_sub1",
                            title = "Overview of C Programming",
                            description = "Introduction to C programming and its key features. Discuss the history of C, its popularity, and where it is used.",
                            status = LessonStatus.ACTIVE
                        ),
                        Lesson(
                            id = "beginner_c1_sub2",
                            title = "Basic Syntax",
                            description = "Understanding the structure of a C program, including functions, libraries, and statements.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c1_sub3",
                            title = "Printing Output in C",
                            description = "How to print output in C using the 'printf' function, including printing strings and variables.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        // Lesson Content 1: Overview of C Programming
                        LessonContent(
                            id = "beginner_c1_sub1",
                            title = "Overview of C Programming",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "C is one of the most popular and widely used programming languages, " +
                                            "especially for system-level programming. Developed in the 1970s by Dennis Ritchie, C has influenced" +
                                            " many modern programming languages. It is fast, efficient, and allows direct manipulation of memory, " +
                                            "making it ideal for writing operating systems, embedded systems, and more."
                                ),
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Lesson Content 2: Basic Syntax
                        LessonContent(
                            id = "beginner_c1_sub2",
                            title = "Basic Syntax",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "A basic C program has a clear structure: it includes functions, declarations, and statements." +
                                            " All C programs start execution from the 'main()' function. The structure is simple but powerful."
                                ),
                                ContentBlock.Code(
                                    "/* Simple C syntax example */\n#include <stdio.h>\nint main() {\n    printf(\"Welcome to C programming!\");\n    return 0;\n}"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        // Lesson Content 3: Printing Output
                        LessonContent(
                            id = "beginner_c1_sub3",
                            title = "Printing Output in C",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C, we use the 'printf()' function to display output. The 'printf' function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the '\\n' is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like '%d' for integers or '%s' for strings."
                                ),
                                ContentBlock.Code(
                                    "/* Printing variables example */\n#include <stdio.h>\nint main() {\n    int number = 10;\n    printf(\"The value of number is: %d\\n\", number);\n    return 0;\n}"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.ACTIVE
                ),
                // Lesson 2: Data Types and Variables
                Lesson(
                    id = "beginner_c2",
                    title = "Data Types and Variables",
                    description = "In this lesson, we will learn about different data types in C and how to declare and use variables.",
                    subLessons = listOf(
                        Lesson(
                            id = "beginner_c2_sub1",
                            title = "Understanding Data Types",
                            description = "Introduction to basic data types like int, char, float, and double.",
                            status = LessonStatus.LOCKED
                        ),
                        Lesson(
                            id = "beginner_c2_sub2",
                            title = "Declaring and Using Variables",
                            description = "Learn how to declare variables and assign values in C.",
                            status = LessonStatus.LOCKED
                        )
                    ),
                    lessonContents = listOf(
                        LessonContent(
                            id = "beginner_c2_sub1",
                            title = "Understanding Data Types",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "In C, you use different data types to store values of different kinds, such as integers, floating-point numbers, or characters. Here are some of the most commonly used data types:"
                                ),
                                ContentBlock.Text(
                                    "1. 'int': Stores integers (whole numbers). Example: 'int a = 5;'\n" +
                                            "2. 'char': Stores a single character. Example: 'char letter = 'A';'\n" +
                                            "3. 'float': Stores floating-point numbers (numbers with decimals). Example: 'float pi = 3.14f;'\n" +
                                            "4. 'double': Stores larger floating-point numbers. Example: 'double e = 2.71828;'"
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        ),
                        LessonContent(
                            id = "beginner_c2_sub2",
                            title = "Declaring and Using Variables",
                            contentBlocks = listOf(
                                ContentBlock.Text(
                                    "To declare a variable in C, you specify the data type, followed by the variable name. You can also assign a value when declaring it."
                                ),
                                ContentBlock.Code(
                                    "/* Declaring and using variables example */\n#include <stdio.h>\nint main() {\n    int age = 25;  // Declaring an integer variable\n    char grade = 'A';  // Declaring a character variable\n    printf(\"Age: %d, Grade: %c\\n\", age, grade);\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In this example, we declare two variables: 'age' of type 'int', and 'grade' of type 'char'. We then print them using 'printf'."
                                )
                            ),
                            type = LessonContentType.NON_INTERACTIVE
                        )
                    ),
                    status = LessonStatus.LOCKED
                )
            )
        )
    }

}