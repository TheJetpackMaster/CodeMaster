package com.codemaster.codemasterapp.main.AllCourses

import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage


class CLangCourseProvider() {


    fun getCompleteCLangCourse(): Course {
        return Course(
            id = "c_course",
            language = "C",
            stages = listOf(
                CBeginnerCourse(),
                CIntermediateCourse(),
                CAdvancedCourse(),
                CExpertCourse()
            )
        )
    }

    fun CBeginnerCourse(): Stage {
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
                            description = "How to print output in C using the `printf` function, including printing strings and variables.",
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
                                            " All C programs start execution from the `main()` function. The structure is simple but powerful."
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
                                    "In C, we use the `printf()` function to display output. The `printf` function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the `\\n` is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like `%d` for integers or `%s` for strings."
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
                                    "1. `int`: Stores integers (whole numbers). Example: `int a = 5;`\n" +
                                            "2. `char`: Stores a single character. Example: `char letter = 'A';`\n" +
                                            "3. `float`: Stores floating-point numbers (numbers with decimals). Example: `float pi = 3.14f;`\n" +
                                            "4. `double`: Stores larger floating-point numbers. Example: `double e = 2.71828;`"
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
                                    "In this example, we declare two variables: `age` of type `int`, and `grade` of type `char`. We then print them using `printf`."
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

    fun CIntermediateCourse(): Stage {
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
                            description = "How to print output in C using the `printf` function, including printing strings and variables.",
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
                                            " All C programs start execution from the `main()` function. The structure is simple but powerful."
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
                                    "In C, we use the `printf()` function to display output. The `printf` function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the `\\n` is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like `%d` for integers or `%s` for strings."
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
                                    "1. `int`: Stores integers (whole numbers). Example: `int a = 5;`\n" +
                                            "2. `char`: Stores a single character. Example: `char letter = 'A';`\n" +
                                            "3. `float`: Stores floating-point numbers (numbers with decimals). Example: `float pi = 3.14f;`\n" +
                                            "4. `double`: Stores larger floating-point numbers. Example: `double e = 2.71828;`"
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
                                    "In this example, we declare two variables: `age` of type `int`, and `grade` of type `char`. We then print them using `printf`."
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

    fun CAdvancedCourse(): Stage {
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
                            description = "How to print output in C using the `printf` function, including printing strings and variables.",
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
                                            " All C programs start execution from the `main()` function. The structure is simple but powerful."
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
                                    "In C, we use the `printf()` function to display output. The `printf` function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the `\\n` is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like `%d` for integers or `%s` for strings."
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
                                    "1. `int`: Stores integers (whole numbers). Example: `int a = 5;`\n" +
                                            "2. `char`: Stores a single character. Example: `char letter = 'A';`\n" +
                                            "3. `float`: Stores floating-point numbers (numbers with decimals). Example: `float pi = 3.14f;`\n" +
                                            "4. `double`: Stores larger floating-point numbers. Example: `double e = 2.71828;`"
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
                                    "In this example, we declare two variables: `age` of type `int`, and `grade` of type `char`. We then print them using `printf`."
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

    fun CExpertCourse(): Stage {
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
                            description = "How to print output in C using the `printf` function, including printing strings and variables.",
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
                                            " All C programs start execution from the `main()` function. The structure is simple but powerful."
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
                                    "In C, we use the `printf()` function to display output. The `printf` function prints text or other data types to the console."
                                ),
                                ContentBlock.Code(
                                    "/* Simple printing example */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\\n\");\n    return 0;\n}"
                                ),
                                ContentBlock.Text(
                                    "In the example above, the `\\n` is used to add a newline after the printed message."
                                ),
                                ContentBlock.Text(
                                    "To print variables, we use placeholders (format specifiers) like `%d` for integers or `%s` for strings."
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
                                    "1. `int`: Stores integers (whole numbers). Example: `int a = 5;`\n" +
                                            "2. `char`: Stores a single character. Example: `char letter = 'A';`\n" +
                                            "3. `float`: Stores floating-point numbers (numbers with decimals). Example: `float pi = 3.14f;`\n" +
                                            "4. `double`: Stores larger floating-point numbers. Example: `double e = 2.71828;`"
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
                                    "In this example, we declare two variables: `age` of type `int`, and `grade` of type `char`. We then print them using `printf`."
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