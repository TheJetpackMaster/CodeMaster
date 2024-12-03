package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.InteractiveInputBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.QuizContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun CExpertCourse(): Stage {
    return Stage(
        id = "c_expert_stage",
        title = "Expert",
        lessons = listOf(

            // lesson 1
            Lesson(
                id = "expert_c1",
                title = "Introduction to Expert Projects",
                description = "Get an overview of what you'll learn in the expert-level projects, focusing on logic building and advanced programming concepts.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c1_sub1",
                        title = "Introduction to the Expert Stage",
                        description = "Understand what the expert-level projects entail and what you'll achieve by the end.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c1_sub2",
                        title = "Overview of Projects and Goals",
                        description = "Explore the structure of projects, categories, and the skills you'll gain.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c1_sub1",
                        title = "Introduction to the Expert Stage",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Welcome to the Expert Stage! Here, you'll tackle advanced projects designed to sharpen your programming skills and enhance your problem-solving abilities.",
                                    listOf("Expert Stage", "advanced projects", "problem-solving")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Throughout this stage, you'll build practical and impactful projects, focusing on logic building and mastering advanced programming concepts.",
                                    listOf(
                                        "practical projects",
                                        "logic building",
                                        "advanced programming"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c1_sub2",
                        title = "Overview of Projects and Goals",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this expert-level course, you'll work on projects categorized into beginner, intermediate, advanced, and expert levels. Each project is tailored to improve specific skills.",
                                    listOf("beginner", "intermediate", "advanced", "expert levels")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here's a quick glimpse of the projects you can expect to work on: personalized calculators, management systems, compression tools, and multi-threaded applications.",
                                    listOf(
                                        "personalized calculators",
                                        "management systems",
                                        "compression tools",
                                        "multi-threaded applications"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "By the end of this course, you'll have built a solid foundation to tackle real-world problems using programming.",
                                    listOf("real-world problems", "programming foundation")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // lesson 2
            Lesson(
                id = "advance_c2",
                title = "Mastering Logic Building and Project Execution",
                description = "Learn the essential strategies to build projects, solve problems, escape tutorial hell, and become a great programmer using the tools provided in this app.",
                subLessons = listOf(
                    Lesson(
                        id = "advance_c2_sub1",
                        title = "Key Strategies for Logic Building",
                        description = "Discover the essential techniques to enhance your logic-building skills for advanced programming tasks.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advance_c2_sub2",
                        title = "Project Execution Framework",
                        description = "Understand how to approach, plan, and execute projects effectively for optimal learning and problem-solving.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advance_c2_sub3",
                        title = "Escaping Tutorial Hell",
                        description = "Learn how to break free from relying solely on tutorials and transition to independent problem-solving.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advance_c2_sub4",
                        title = "Becoming a Great Programmer",
                        description = "Leverage the resources in this app to build expertise and confidence as a programmer.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "advance_c2_sub5",
                        title = "Problem-Solving Techniques",
                        description = "Master the art of breaking down, analyzing, and solving complex programming problems efficiently.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "advance_c2_sub1",
                        title = "Key Strategies for Logic Building",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Logic building is the foundation of programming. Start by breaking problems into smaller parts and solving them step by step.",
                                    listOf("")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advance_c2_sub2",
                        title = "Project Execution Framework",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To execute projects effectively, start by defining clear goals and breaking them into smaller milestones.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Focus on implementing a minimum viable product (MVP) first, then enhance features iteratively.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use this app's guided lessons and templates to plan and structure your projects.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advance_c2_sub3",
                        title = "Escaping Tutorial Hell",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Tutorial hell occurs when you rely solely on following tutorials without applying knowledge to independent projects.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To escape it, start small: replicate features from tutorials in your unique projects, then build new features.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This app provides challenge-based tasks to ensure hands-on learning and independent problem-solving.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advance_c2_sub4",
                        title = "Becoming a Great Programmer",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Becoming a great programmer involves consistency, practice, and learning from mistakes.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use this app's curated lessons, projects, and tips to enhance your knowledge and skills step by step.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Participate in coding challenges, debug code independently, and always seek to understand 'why' something works.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "advance_c2_sub5",
                        title = "Problem-Solving Techniques",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Solving problems efficiently starts with understanding the problem thoroughly. Break it into smaller parts and analyze each part individually.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Apply patterns like divide and conquer, brute force, or greedy algorithms as applicable. Identify which strategy fits best.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Iteratively refine solutions by testing with edge cases and incorporating feedback from debugging or code reviews.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Leverage tools and resources provided in this app to practice and master problem-solving techniques.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                )
            ),
            // lesson 3
            Lesson(
                id = "expert_c3",
                title = "Personalized Calculator",
                description = "Build a personalized calculator with custom functions, UI, and logic.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c3_sub1",
                        title = "Introduction to Personalized Calculator",
                        description = "Learn how to create a personalized calculator with custom operations and design.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub2",
                        title = "Basic Operations",
                        description = "Implement basic operations like addition, subtraction, multiplication, and division.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub3",
                        title = "Custom Functions",
                        description = "Add custom mathematical functions like square root, power, and logarithms.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub4",
                        title = "User Interface Design",
                        description = "Design the user interface with buttons, text fields, and a display area.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub5",
                        title = "Handling User Input",
                        description = "Handle user input, including numeric values and operator buttons.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub6",
                        title = "Error Handling",
                        description = "Implement error handling for invalid inputs, division by zero, and other edge cases.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub7",
                        title = "Complete Project Code",
                        description = "Integrate all previous lessons into one complete personalized calculator project.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c3_sub1",
                        title = "Introduction to Personalized Calculator",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A personalized calculator allows for custom operations and functions based on the user's needs. In this lesson, we'll guide you through building your own calculator with unique features.",
                                    listOf("personalized calculator")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The application will support basic operations, custom functions, and error handling.",
                                    listOf("basic operations", "custom functions", "error handling")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub2",
                        title = "Basic Operations",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "We will begin by implementing basic operations like addition, subtraction, multiplication, and division.",
                                    listOf("addition", "subtraction", "multiplication", "division")
                                )
                            ),
                            ContentBlock.Code(
                                """
double add(double a, double b) {
    return a + b;
}

double subtract(double a, double b) {
    return a - b;
}

double multiply(double a, double b) {
    return a * b;
}

double divide(double a, double b) {
    if (b == 0) {
        printf("Error: Division by zero!\n");
        return 0;  // Handle division by zero
    }
    return a / b;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub3",
                        title = "Custom Functions",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Next, we will add custom functions like square root, power, and logarithmic calculations.",
                                    listOf("square root", "power", "logarithms")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <math.h>

double squareRoot(double a) {
    if (a < 0) {
        printf("Error: Negative number for square root!\n");
        return 0;  // Handle negative square root
    }
    return sqrt(a);
}

double power(double a, double b) {
    return pow(a, b);
}

double logarithm(double a, double base) {
    if (a <= 0 || base <= 0 || base == 1) {
        printf("Error: Invalid logarithm parameters!\n");
        return 0;  // Handle invalid logarithm input
    }
    return log(a) / log(base);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub4",
                        title = "User Interface Design",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The user interface (UI) should have buttons for numbers and operators, along with a display area to show results.",
                                    listOf("user interface", "buttons", "display area")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can use a layout manager to arrange buttons and a text view for displaying results.",
                                    listOf("layout manager", "buttons", "text view")
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>

void displayCalculator() {
    printf("Simple Calculator: \n");
    printf("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Square Root\n6. Power\n7. Logarithm\n");
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub5",
                        title = "Handling User Input",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Handle the input values for operations and update the display dynamically as the user interacts with the buttons.",
                                    listOf("user input", "update display")
                                )
                            ),
                            ContentBlock.Code(
                                """

double getUserInput() {
    int choice;
    double num1, num2;
    double result = 0;

    displayCalculator();
    printf("Enter operation choice: ");
    scanf("%d", &choice);
    
    if (choice >= 1 && choice <= 4) {
        printf("Enter two numbers: ");
        scanf("%lf %lf", &num1, &num2);
        if (choice == 1) {
            result = add(num1, num2);
        } else if (choice == 2) {
            result = subtract(num1, num2);
        } else if (choice == 3) {
            result = multiply(num1, num2);
        } else if (choice == 4) {
            result = divide(num1, num2);
        }
    } else if (choice == 5) {
        printf("Enter number for square root: ");
        scanf("%lf", &num1);
        result = squareRoot(num1);
    } else if (choice == 6) {
        printf("Enter base and exponent: ");
        scanf("%lf %lf", &num1, &num2);
        result = power(num1, num2);
    } else if (choice == 7) {
        printf("Enter number and base for log: ");
        scanf("%lf %lf", &num1, &num2);
        result = logarithm(num1, num2);
    } else {
        printf("Invalid choice!\n");
        return 0;
    }

    return result;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub6",
                        title = "Error Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Handle errors like division by zero and invalid inputs to ensure smooth user experience.",
                                    listOf("error handling", "division by zero")
                                )
                            ),
                            ContentBlock.Code(
                                """
double divide(double a, double b) {
    if (b == 0) {
        printf("Error: Division by zero!\n");
        return 0;  // Handle division by zero
    }
    return a / b;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub7",
                        title = "Complete Project Code",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Below is the complete code for the personalized calculator integrating all the features discussed in the previous lessons.",
                                    listOf("complete code", "calculator", "project")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <math.h>

// Function declarations
double add(double a, double b);
double subtract(double a, double b);
double multiply(double a, double b);
double divide(double a, double b);
double squareRoot(double a);
double power(double a, double b);
double logarithm(double a, double base);
void displayCalculator();
double getUserInput();

int main() {
    double result = getUserInput();  // Get user input and calculate the result
    printf("Result: %.2f\n", result);
    return 0;
}

// Function definitions
double add(double a, double b) {
    return a + b;
}

double subtract(double a, double b) {
    return a - b;
}

double multiply(double a, double b) {
    return a * b;
}

double divide(double a, double b) {
    if (b == 0) {
        printf("Error: Division by zero!\n");
        return 0;  // Handle division by zero
    }
    return a / b;
}

double squareRoot(double a) {
    if (a < 0) {
        printf("Error: Negative number for square root!\n");
        return 0;  // Handle negative square root
    }
    return sqrt(a);
}

double power(double a, double b) {
    return pow(a, b);
}

double logarithm(double a, double base) {
    if (a <= 0 || base <= 0 || base == 1) {
        printf("Error: Invalid logarithm parameters!\n");
        return 0;  // Handle invalid logarithm input
    }
    return log(a) / log(base);
}

void displayCalculator() {
    printf("Simple Calculator: \n");
    printf("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Square Root\n6. Power\n7. Logarithm\n");
}

double getUserInput() {
    int choice;
    double num1, num2;
    double result = 0;

    displayCalculator();
    printf("Enter operation choice: ");
    scanf("%d", &choice);
    
    if (choice >= 1 && choice <= 4) {
        printf("Enter two numbers: ");
        scanf("%lf %lf", &num1, &num2);
        if (choice == 1) {
            result = add(num1, num2);
        } else if (choice == 2) {
            result = subtract(num1, num2);
        } else if (choice == 3) {
            result = multiply(num1, num2);
        } else if (choice == 4) {
            result = divide(num1, num2);
        }
    } else if (choice == 5) {
        printf("Enter number for square root: ");
        scanf("%lf", &num1);
        result = squareRoot(num1);
    } else if (choice == 6) {
        printf("Enter base and exponent: ");
        scanf("%lf %lf", &num1, &num2);
        result = power(num1, num2);
    } else if (choice == 7) {
        printf("Enter number and base for log: ");
        scanf("%lf %lf", &num1, &num2);
        result = logarithm(num1, num2);
    } else {
        printf("Invalid choice!\n");
        return 0;
    }

    return result;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            // Lesson: Advanced Contact Management System

            Lesson(
                id = "expert_c4",
                title = "Contact Management System",
                description = "Create an advanced contact management system with features like adding, viewing, searching, updating, and deleting contacts.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c4_sub1",
                        title = "Introduction to Contact Management System",
                        description = "Learn how to create a contact management system in Kotlin with add, view, search, update, and delete functionalities.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub2",
                        title = "Defining the Contact Structure",
                        description = "Learn to define a Contact structure to store name and phone details, using constants for limits on contacts and field lengths.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub3",
                        title = "Adding a Contact",
                        description = "Implement the functionality to add a new contact to the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub4",
                        title = "Viewing Contacts",
                        description = "Display the list of all contacts stored in the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub5",
                        title = "Searching for a Contact",
                        description = "Search for a contact by name in the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub6",
                        title = "Updating a Contact",
                        description = "Allow the user to update the contact information, like phone number.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub7",
                        title = "Deleting a Contact",
                        description = "Implement the functionality to delete a contact from the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub8",
                        title = "Complete Project Code",
                        description = "Integrate all previous lessons into one complete advanced contact management system.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(

                    LessonContent(
                        id = "expert_c4_sub1",
                        title = "Introduction to Contact Management System",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This project will help you build an advanced contact management system in Kotlin. The system will allow users to add, view, search, update, and delete contacts from the contact book.",
                                    listOf("contact management system")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this project, we will use basic Kotlin concepts like arrays, strings, and loops, and we will also learn how to use Jetpack Compose for building the UI.",
                                    listOf("Jetpack Compose", "arrays", "strings", "loops")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c4_sub2",
                        title = "Defining the Contact Structure",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson defines the Contact structure with name and phone fields and sets constants for the maximum number of contacts and the length limits for names and phone numbers.",
                                    listOf("structure", "contact", "constants")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <string.h>

#define MAX_CONTACTS 100
#define NAME_LENGTH 50
#define PHONE_LENGTH 15

typedef struct {
    char name[NAME_LENGTH];
    char phone[PHONE_LENGTH];
} Contact;
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The Contact structure holds name and phone, while constants manage the maximum contacts and field lengths.",
                                    listOf(
                                        "MAX_CONTACTS",
                                        "NAME_LENGTH",
                                        "PHONE_LENGTH",
                                        "structure"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Sublesson: Adding a Contact
                    LessonContent(
                        id = "expert_c4_sub3",
                        title = "Adding a Contact",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this lesson, we will implement the functionality to add new contacts to the system. The contacts will have a name and phone number.",
                                    listOf("adding contacts", "name", "phone number")
                                )
                            ),
                            ContentBlock.Code(
                                """
void addContact() {
    if (contactCount >= MAX_CONTACTS) {
        printf("Contact book is full! Cannot add more contacts.\n");
        return;
    }

    Contact newContact;
    printf("Enter name: ");
    scanf(" %[^\n]", newContact.name); // Read string with spaces
    printf("Enter phone: ");
    scanf(" %[^\n]", newContact.phone);

    contactBook[contactCount++] = newContact;
    printf("Contact added successfully!\n");
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Sublesson: Viewing Contacts
                    LessonContent(
                        id = "expert_c4_sub4",
                        title = "Viewing Contacts",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this lesson, we will implement the functionality to display all the contacts in the contact book.",
                                    listOf("viewing contacts", "display")
                                )
                            ),
                            ContentBlock.Code(
                                """
void viewContacts() {
    if (contactCount == 0) {
        printf("No contacts available.\n");
        return;
    }

    printf("All Contacts:\n");
    for (int i = 0; i < contactCount; i++) {
        printf("%d. Name: %s, Phone: %s\n", i + 1, contactBook[i].name, contactBook[i].phone);
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Sublesson: Searching for a Contact
                    LessonContent(
                        id = "expert_c4_sub5",
                        title = "Searching for a Contact",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Now, we will implement the search functionality. The user will be able to search for a contact by name.",
                                    listOf("searching", "contact", "name")
                                )
                            ),
                            ContentBlock.Code(
                                """
void searchContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to search: ");
    scanf(" %[^\n]", searchName);

    int found = 0;
    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(contactBook[i].name, searchName) == 0) {
            printf("Found Contact: Name: %s, Phone: %s\n", contactBook[i].name, contactBook[i].phone);
            found = 1;
        }
    }

    if (!found) {
        printf("No contact found with the name \"%s\".\n", searchName);
    }
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Sublesson: Updating a Contact
                    LessonContent(
                        id = "expert_c4_sub6",
                        title = "Updating a Contact",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson covers updating the details of a contact. The user can modify the phone number of an existing contact.",
                                    listOf("updating contacts", "phone number")
                                )
                            ),
                            ContentBlock.Code(
                                """
void updateContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to update: ");
    scanf(" %[^\n]", searchName);

    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(contactBook[i].name, searchName) == 0) {
            printf("Enter new phone number: ");
            scanf(" %[^\n]", contactBook[i].phone);
            printf("Contact updated successfully!\n");
            return;
        }
    }

    printf("No contact found with the name \"%s\".\n", searchName);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Sublesson: Deleting a Contact
                    LessonContent(
                        id = "expert_c4_sub7",
                        title = "Deleting a Contact",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this lesson, we will implement the functionality to delete a contact from the contact book.",
                                    listOf("deleting contacts")
                                )
                            ),
                            ContentBlock.Code(
                                """
void deleteContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to delete: ");
    scanf(" %[^\n]", searchName);

    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(contactBook[i].name, searchName) == 0) {
            for (int j = i; j < contactCount - 1; j++) {
                contactBook[j] = contactBook[j + 1];
            }
            contactCount--;
            printf("Contact deleted successfully!\n");
            return;
        }
    }

    printf("No contact found with the name \"%s\".\n", searchName);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c4_sub8",
                        title = "Complete Project Code",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Below is the complete code for the Contact Management System, integrating all features like add, view, search, update, and delete.",
                                    listOf("complete project", "contact management system")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <string.h>

#define MAX_CONTACTS 100
#define NAME_LENGTH 50
#define PHONE_LENGTH 15

typedef struct {
    char name[NAME_LENGTH];
    char phone[PHONE_LENGTH];
} Contact;

Contact contactBook[MAX_CONTACTS];
int contactCount = 0;

// Function to add a contact
void addContact() {
    if (contactCount >= MAX_CONTACTS) {
        printf("Contact book is full! Cannot add more contacts.\n");
        return;
    }

    Contact newContact;
    printf("Enter name: ");
    scanf(" %[^\n]", newContact.name); // Read string with spaces
    printf("Enter phone: ");
    scanf(" %[^\n]", newContact.phone);

    contactBook[contactCount++] = newContact;
    printf("Contact added successfully!\n");
}

// Function to view all contacts
void viewContacts() {
    if (contactCount == 0) {
        printf("No contacts available.\n");
        return;
    }

    printf("All Contacts:\n");
    for (int i = 0; i < contactCount; i++) {
        printf("%d. Name: %s, Phone: %s\n", i + 1, contactBook[i].name, contactBook[i].phone);
    }
}

// Function to search for a contact
void searchContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to search: ");
    scanf(" %[^\n]", searchName);

    int found = 0;
    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(contactBook[i].name, searchName) == 0) {
            printf("Found Contact: Name: %s, Phone: %s\n", contactBook[i].name, contactBook[i].phone);
            found = 1;
        }
    }

    if (!found) {
        printf("No contact found with the name \"%s\".\n", searchName);
    }
}

// Function to update a contact
void updateContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to update: ");
    scanf(" %[^\n]", searchName);

    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(contactBook[i].name, searchName) == 0) {
            printf("Enter new phone number: ");
            scanf(" %[^\n]", contactBook[i].phone);
            printf("Contact updated successfully!\n");
            return;
        }
    }

    printf("No contact found with the name \"%s\".\n", searchName);
}

// Function to delete a contact
void deleteContact() {
    char searchName[NAME_LENGTH];
    printf("Enter name to delete: ");
    scanf(" %[^\n]", searchName);

    for (int i = 0; i < contactCount; i++) {
        if (strcasecmp(contactBook[i].name, searchName) == 0) {
            for (int j = i; j < contactCount - 1; j++) {
                contactBook[j] = contactBook[j + 1];
            }
            contactCount--;
            printf("Contact deleted successfully!\n");
            return;
        }
    }

    printf("No contact found with the name \"%s\".\n", searchName);
}
int main() {
    int choice;

    do {
        printf("\nContact Book Menu:\n");
        printf("1. Add Contact\n");
        printf("2. View Contacts\n");
        printf("3. Search Contact\n");
        printf("4. Update Contact\n");
        printf("5. Delete Contact\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addContact();
                break;
            case 2:
                viewContacts();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                updateContact();
                break;
            case 5:
                deleteContact();
                break;
            case 6:
                printf("Exiting Contact Book. Goodbye!\\n");
                break;
            default:
                printf("Invalid choice. Please try again.\\n");
        }
    } while (choice != 6);

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
            Lesson(
                id = "expert_c5",
                title = "Unit Converter",
                description = "A comprehensive unit converter system for converting between different units such as length, weight, temperature, and more.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c5_sub1",
                        title = "Introduction to Contact Management System",
                        description = "Learn how to create a contact management system in Kotlin with add, view, search, update, and delete functionalities.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c5_sub2",
                        title = "Defining the Contact Structure",
                        description = "Learn to define a Contact structure to store name and phone details, using constants for limits on contacts and field lengths.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c5_sub3",
                        title = "Adding a Contact",
                        description = "Implement the functionality to add a new contact to the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c5_sub4",
                        title = "Viewing Contacts",
                        description = "Display the list of all contacts stored in the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c5_sub5",
                        title = "Searching for a Contact",
                        description = "Search for a contact by name in the contact book.",
                        status = LessonStatus.LOCKED
                    ),

                    ),
                lessonContents = listOf(

                    LessonContent(
                        id = "expert_c5_sub1",
                        title = "Introduction to Unit Converter Program",
                        description = "This project teaches how to create a unit converter program in C, allowing users to convert between categories like length, weight, and temperature using modularized functions and conditionals.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This project will help you build a unit converter program in C that allows users to convert between different categories like length, weight, and temperature. The program will offer users the ability to choose the category, input a value, and convert between various units.",
                                    listOf("length", "weight", "temperature")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c5_sub2",
                        title = "Converting Length Units with a Function",
                        description = "This lesson explains how to create a function that converts between various length units such as meters, kilometers, miles, and centimeters.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson shows how to define a function that converts between length units (meters, kilometers, miles, centimeters) using conversion factors.",
                                    listOf("unit conversion")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

float convertLength(float value, int fromUnit, int toUnit) {
    // Conversion factors
    if (fromUnit == 1) { // Meters
        if (toUnit == 2) return value / 1000; // Meters to Kilometers
        if (toUnit == 3) return value * 0.000621371; // Meters to Miles
        if (toUnit == 4) return value * 100; // Meters to Centimeters
    }
    if (fromUnit == 2) { // Kilometers
        if (toUnit == 1) return value * 1000; // Kilometers to Meters
        if (toUnit == 3) return value * 0.621371; // Kilometers to Miles
        if (toUnit == 4) return value * 100000; // Kilometers to Centimeters
    }
    if (fromUnit == 3) { // Miles
        if (toUnit == 1) return value / 0.000621371; // Miles to Meters
        if (toUnit == 2) return value / 0.621371; // Miles to Kilometers
        if (toUnit == 4) return value * 160934; // Miles to Centimeters
    }
    if (fromUnit == 4) { // Centimeters
        if (toUnit == 1) return value / 100; // Centimeters to Meters
        if (toUnit == 2) return value / 100000; // Centimeters to Kilometers
        if (toUnit == 3) return value / 160934; // Centimeters to Miles
    }
    return value; // Return original value if units are the same
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The convertLength function converts length units based on input and output units, using predefined conversion factors.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c5_sub3",
                        title = "Converting Weight Units with a Function",
                        description = "This lesson demonstrates how to create a function to convert between various weight units such as kilograms, pounds, grams, and ounces.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson shows how to define a function that converts between weight units (kilograms, pounds, grams, ounces) using conversion factors.",
                                    listOf("unit conversion")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

float convertWeight(float value, int fromUnit, int toUnit) {
    // Conversion factors
    if (fromUnit == 1) { // Kilograms
        if (toUnit == 2) return value * 2.20462; // Kilograms to Pounds
        if (toUnit == 3) return value * 1000; // Kilograms to Grams
        if (toUnit == 4) return value * 35.274; // Kilograms to Ounces
    }
    if (fromUnit == 2) { // Pounds
        if (toUnit == 1) return value / 2.20462; // Pounds to Kilograms
        if (toUnit == 3) return value * 453.592; // Pounds to Grams
        if (toUnit == 4) return value * 16; // Pounds to Ounces
    }
    if (fromUnit == 3) { // Grams
        if (toUnit == 1) return value / 1000; // Grams to Kilograms
        if (toUnit == 2) return value / 453.592; // Grams to Pounds
        if (toUnit == 4) return value / 28.3495; // Grams to Ounces
    }
    if (fromUnit == 4) { // Ounces
        if (toUnit == 1) return value / 35.274; // Ounces to Kilograms
        if (toUnit == 2) return value / 16; // Ounces to Pounds
        if (toUnit == 3) return value * 28.3495; // Ounces to Grams
    }
    return value; // Return original value if units are the same
}

""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The convertWeight function converts weight units based on input and output units, using predefined conversion factors.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Sublesson: Viewing Contacts
                    LessonContent(
                        id = "expert_c5_sub4",
                        title = "Converting Temperature Units",
                        description = "In this lesson, we will implement a function to convert between temperature units such as Celsius, Fahrenheit, and Kelvin.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson shows how to define a function that converts temperatures between Celsius, Fahrenheit, and Kelvin using appropriate formulas.",
                                    listOf("unit conversion")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

float convertTemperature(float value, int fromUnit, int toUnit) {
    if (fromUnit == 1) { // Celsius
        if (toUnit == 2) return (value * 9/5) + 32; // Celsius to Fahrenheit
        if (toUnit == 3) return value + 273.15; // Celsius to Kelvin
    }
    if (fromUnit == 2) { // Fahrenheit
        if (toUnit == 1) return (value - 32) * 5/9; // Fahrenheit to Celsius
        if (toUnit == 3) return (value - 32) * 5/9 + 273.15; // Fahrenheit to Kelvin
    }
    if (fromUnit == 3) { // Kelvin
        if (toUnit == 1) return value - 273.15; // Kelvin to Celsius
        if (toUnit == 2) return (value - 273.15) * 9/5 + 32; // Kelvin to Fahrenheit
    }
    return value; // Return original value if units are the same
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The convertTemperature function applies formulas to convert between Celsius, Fahrenheit, and Kelvin based on input and output units.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c5_sub5",
                        title = "Complete Project Code",
                        description = "Below is the complete code for the Unit Converter program, which supports converting between different units of length, weight, and temperature.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Below is the complete code for the Unit Converter program. This program allows users to convert between length, weight, and temperature units. The user selects the category (length, weight, or temperature) and then inputs the value along with the units to convert from and to. The temperature conversion supports Celsius, Fahrenheit, and Kelvin.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

// Function prototypes for conversion
float convertLength(float value, int fromUnit, int toUnit);
float convertWeight(float value, int fromUnit, int toUnit);
float convertTemperature(float value, int fromUnit, int toUnit);

int main() {
    int choice, fromUnit, toUnit;
    float value, result;

    printf("Unit Converter\n");
    printf("Choose the category:\n");
    printf("1. Length\n");
    printf("2. Weight\n");
    printf("3. Temperature\n");
    printf("Enter choice (1-3): ");
    scanf("%d", &choice);

    // Ask for input value
    printf("Enter value to convert: ");
    scanf("%f", &value);

    // Handle different categories
    switch (choice) {
        case 1: // Length
            printf("Choose the unit to convert from:\n");
            printf("1. Meters\n2. Kilometers\n3. Miles\n4. Centimeters\n");
            printf("Enter choice (1-4): ");
            scanf("%d", &fromUnit);

            printf("Choose the unit to convert to:\n");
            printf("1. Meters\n2. Kilometers\n3. Miles\n4. Centimeters\n");
            printf("Enter choice (1-4): ");
            scanf("%d", &toUnit);

            result = convertLength(value, fromUnit, toUnit);
            printf("Converted value: %.2f\n", result);
            break;

        case 2: // Weight
            printf("Choose the unit to convert from:\n");
            printf("1. Kilograms\n2. Pounds\n3. Grams\n4. Ounces\n");
            printf("Enter choice (1-4): ");
            scanf("%d", &fromUnit);

            printf("Choose the unit to convert to:\n");
            printf("1. Kilograms\n2. Pounds\n3. Grams\n4. Ounces\n");
            printf("Enter choice (1-4): ");
            scanf("%d", &toUnit);

            result = convertWeight(value, fromUnit, toUnit);
            printf("Converted value: %.2f\n", result);
            break;

        case 3: // Temperature
            printf("Choose the unit to convert from:\n");
            printf("1. Celsius\n2. Fahrenheit\n3. Kelvin\n");
            printf("Enter choice (1-3): ");
            scanf("%d", &fromUnit);

            printf("Choose the unit to convert to:\n");
            printf("1. Celsius\n2. Fahrenheit\n3. Kelvin\n");
            printf("Enter choice (1-3): ");
            scanf("%d", &toUnit);

            result = convertTemperature(value, fromUnit, toUnit);
            printf("Converted value: %.2f\n", result);
            break;

        default:
            printf("Invalid choice.\n");
    }

    return 0;
}

// Function to convert length
float convertLength(float value, int fromUnit, int toUnit) {
    // Conversion factors
    if (fromUnit == 1) { // Meters
        if (toUnit == 2) return value / 1000; // Meters to Kilometers
        if (toUnit == 3) return value * 0.000621371; // Meters to Miles
        if (toUnit == 4) return value * 100; // Meters to Centimeters
    }
    if (fromUnit == 2) { // Kilometers
        if (toUnit == 1) return value * 1000; // Kilometers to Meters
        if (toUnit == 3) return value * 0.621371; // Kilometers to Miles
        if (toUnit == 4) return value * 100000; // Kilometers to Centimeters
    }
    if (fromUnit == 3) { // Miles
        if (toUnit == 1) return value / 0.000621371; // Miles to Meters
        if (toUnit == 2) return value / 0.621371; // Miles to Kilometers
        if (toUnit == 4) return value * 160934; // Miles to Centimeters
    }
    if (fromUnit == 4) { // Centimeters
        if (toUnit == 1) return value / 100; // Centimeters to Meters
        if (toUnit == 2) return value / 100000; // Centimeters to Kilometers
        if (toUnit == 3) return value / 160934; // Centimeters to Miles
    }
    return value; // Return original value if units are the same
}

// Function to convert weight
float convertWeight(float value, int fromUnit, int toUnit) {
    // Conversion factors
    if (fromUnit == 1) { // Kilograms
        if (toUnit == 2) return value * 2.20462; // Kilograms to Pounds
        if (toUnit == 3) return value * 1000; // Kilograms to Grams
        if (toUnit == 4) return value * 35.274; // Kilograms to Ounces
    }
    if (fromUnit == 2) { // Pounds
        if (toUnit == 1) return value / 2.20462; // Pounds to Kilograms
        if (toUnit == 3) return value * 453.592; // Pounds to Grams
        if (toUnit == 4) return value * 16; // Pounds to Ounces
    }
    if (fromUnit == 3) { // Grams
        if (toUnit == 1) return value / 1000; // Grams to Kilograms
        if (toUnit == 2) return value / 453.592; // Grams to Pounds
        if (toUnit == 4) return value / 28.3495; // Grams to Ounces
    }
    if (fromUnit == 4) { // Ounces
        if (toUnit == 1) return value / 35.274; // Ounces to Kilograms
        if (toUnit == 2) return value / 16; // Ounces to Pounds
        if (toUnit == 3) return value * 28.3495; // Ounces to Grams
    }
    return value; // Return original value if units are the same
}

// Function to convert temperature
float convertTemperature(float value, int fromUnit, int toUnit) {
    if (fromUnit == 1) { // Celsius
        if (toUnit == 2) return (value * 9/5) + 32; // Celsius to Fahrenheit
        if (toUnit == 3) return value + 273.15; // Celsius to Kelvin
    }
    if (fromUnit == 2) { // Fahrenheit
        if (toUnit == 1) return (value - 32) * 5/9; // Fahrenheit to Celsius
        if (toUnit == 3) return (value - 32) * 5/9 + 273.15; // Fahrenheit to Kelvin
    }
    if (fromUnit == 3) { // Kelvin
        if (toUnit == 1) return value - 273.15; // Kelvin to Celsius
        if (toUnit == 2) return (value - 273.15) * 9/5 + 32; // Kelvin to Fahrenheit
    }
    return value; // Return original value if units are the same
}

"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            Lesson(
                id = "expert_c6",
                title = "Tic-Tac-Toe Game",
                description = "Create a text-based Tic-Tac-Toe game that allows two players to take turns marking spaces on a 3x3 grid. The game will check for winning conditions, handle user input, and display the board after each move.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c6_sub1",
                        title = "Introduction to Contact Management System",
                        description = "Learn how to create a contact management system in Kotlin with add, view, search, update, and delete functionalities.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c6_sub2",
                        title = "Defining the Contact Structure",
                        description = "Learn to define a Contact structure to store name and phone details, using constants for limits on contacts and field lengths.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c6_sub3",
                        title = "Adding a Contact",
                        description = "Implement the functionality to add a new contact to the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c6_sub4",
                        title = "Viewing Contacts",
                        description = "Display the list of all contacts stored in the contact book.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c6_sub5",
                        title = "Searching for a Contact",
                        description = "Search for a contact by name in the contact book.",
                        status = LessonStatus.LOCKED
                    ),

                    ),
                lessonContents = listOf(

                    LessonContent(
                        id = "expert_c6_sub1",
                        title = "Introduction to Tic-Tac-Toe Game",
                        description = "This project teaches how to create a text-based Tic-Tac-Toe game in C, where players can take turns to make moves and check for winning conditions or a draw using arrays, loops, and conditional statements.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this project, you will develop a simple Tic-Tac-Toe game in C, where two players take turns to place their marks ('X' or 'O') on a 3x3 grid. The game will check for a winner after each move, and will also handle situations where the game ends in a draw. The program will use arrays to represent the game board, loops for turns, and conditional statements to evaluate the win and draw conditions.",
                                    listOf("arrays", "loops", "conditional statements")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c6_sub2",
                        title = "Initializing a Tic-Tac-Toe Board in C",
                        description = "Learn how to initialize a 3x3 Tic-Tac-Toe board with numbers 1 to 9 in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to use a 3x3 array to initialize a Tic-Tac-Toe board with numbers 1 to 9, representing player move positions. The initializeBoard function employs nested loops to fill the array, incrementing the variable value from 1 to 9 for each cell.",
                                    listOf(
                                        "3x3",
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
char board[3][3];  // 3x3 Tic-Tac-Toe board

// Function to initialize the board with numbers
void initializeBoard() {
    char value = '1';
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = value++;
        }
    }
}
""".trimIndent()
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c6_sub3",
                        title = "Displaying the Tic-Tac-Toe Board in C",
                        description = "This lesson demonstrates how to create a function to display a Tic-Tac-Toe board in C using loops and conditional statements. The board is displayed with a grid format, and the cells are separated by pipes ('|') for clarity.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson shows how to create a function that displays the Tic-Tac-Toe board with values in a grid format. Pipes '|' separate the cells, and dashes ('---|---|---') separate rows for clarity.",
                                    listOf("display board","'|'","'---|---|---'")
                                )
                            ),
                            ContentBlock.Code(
                                """
// Function to display the board
void displayBoard() {
    printf("\nTic-Tac-Toe Board:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf(" %c ", board[i][j]);
            if (j < 2) printf("|");
        }
        printf("\n");
        if (i < 2) printf("---|---|---\n");
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The displayBoard function uses nested loops to iterate through the 3x3 array and print each cell. Pipes separate columns, and dashes between rows enhance the visual structure of the grid.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c6_sub4",
                        title = "Checking for a Winner in Tic-Tac-Toe",
                        description = "In this lesson, we will implement a function to check if a player has won the game in Tic-Tac-Toe by evaluating rows, columns, and diagonals for a winning condition.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to check if a player has won by evaluating the rows, columns, and diagonals of the game board.",
                                    listOf("",)
                                )
                            ),
                            ContentBlock.Code(
                                """
// Function to check if a player has won
int checkWin(char player) {
    // Check rows and columns
    for (int i = 0; i < 3; i++) {
        if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
            (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
            return 1;
        }
    }
    // Check diagonals
    if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
        (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
        return 1;
    }
    return 0;
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The checkWin function checks all rows, columns, and diagonals. It returns 1 if a win is detected, otherwise 0.",
                                    listOf("1,0")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c6_sub5",
                        title = "Checking for a Draw in Tic-Tac-Toe",
                        description = "In this lesson, we will implement a function to check if the game has ended in a draw, meaning all cells are filled without a winner.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to check for a draw by verifying if all board cells are filled with 'X' or 'O'.",
                                    listOf("'X'","'O'")
                                )
                            ),
                            ContentBlock.Code(
                                """
// Function to check if the game is a draw
int checkDraw() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] != 'X' && board[i][j] != 'O') {
                return 0;  // Not a draw yet
            }
        }
    }
    return 1;  // All cells are filled, it's a draw
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The checkDraw function returns 1 if all cells are filled with 'X' or 'O'; otherwise, it returns `0`.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c6_sub6",
                        title = "Handling Player Moves in Tic-Tac-Toe",
                        description = "In this lesson, we will implement a function to take input from the player and make their move on the Tic-Tac-Toe board.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson explains how to take player input and validate the move, ensuring the chosen cell is available.",
                                    listOf("player input ","validate")
                                )
                            ),
                            ContentBlock.Code(
                                """
// Function to take input from the player
void playerMove(char player) {
    int choice;
    int validMove = 0;

    // Loop until the player enters a valid move
    while (!validMove) {
        printf("Player %c, enter a number (1-9) to make your move: ", player);
        scanf("%d", &choice);

        if (choice >= 1 && choice <= 9) {
            int row = (choice - 1) / 3;
            int col = (choice - 1) % 3;

            if (board[row][col] != 'X' && board[row][col] != 'O') {
                board[row][col] = player;
                validMove = 1;  // Valid move
            } else {
                printf("Cell already taken! Try again.\n");
            }
        } else {
            printf("Invalid choice! Please enter a number between 1 and 9.\n");
        }
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The playerMove function prompts the player for a valid move, ensuring the chosen cell is not already occupied.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c6_sub7",
                        title = "Complete Project Code",
                        description = "Below is the complete code for the Tic-Tac-Toe game, which allows two players to take turns and play the game on a 3x3 grid.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Below is the complete code for the Tic-Tac-Toe game. This program allows two players, X and O, to take turns and make moves on a 3x3 grid. The game checks for a winner after every move and also checks for a draw when all the cells are filled. The user inputs a number between 1 and 9 to choose the cell for their move, and the game displays the updated board after each move.",
                                    listOf("X "," O")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>

char board[3][3];  // 3x3 Tic-Tac-Toe board

// Function to initialize the board with numbers
void initializeBoard() {
    char value = '1';
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = value++;
        }
    }
}

// Function to display the board
void displayBoard() {
    printf("\nTic-Tac-Toe Board:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf(" %c ", board[i][j]);
            if (j < 2) printf("|");
        }
        printf("\n");
        if (i < 2) printf("---|---|---\n");
    }
}

// Function to check if a player has won
int checkWin(char player) {
    // Check rows and columns
    for (int i = 0; i < 3; i++) {
        if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
            (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
            return 1;
        }
    }
    // Check diagonals
    if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
        (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
        return 1;
    }
    return 0;
}

// Function to check if the game is a draw
int checkDraw() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] != 'X' && board[i][j] != 'O') {
                return 0;  // Not a draw yet
            }
        }
    }
    return 1;  // All cells are filled, it's a draw
}

// Function to take input from the player
void playerMove(char player) {
    int choice;
    int validMove = 0;

    // Loop until the player enters a valid move
    while (!validMove) {
        printf("Player %c, enter a number (1-9) to make your move: ", player);
        scanf("%d", &choice);

        if (choice >= 1 && choice <= 9) {
            int row = (choice - 1) / 3;
            int col = (choice - 1) % 3;

            if (board[row][col] != 'X' && board[row][col] != 'O') {
                board[row][col] = player;
                validMove = 1;  // Valid move
            } else {
                printf("Cell already taken! Try again.\n");
            }
        } else {
            printf("Invalid choice! Please enter a number between 1 and 9.\n");
        }
    }
}

// Main function to run the game
int main() {
    int turn = 0;  // To track the turn (0 for Player X, 1 for Player O)
    char player = 'X';  // Start with Player X

    initializeBoard();  // Initialize the board
    displayBoard();  // Display the initial empty board

    while (1) {
        playerMove(player);  // Let the current player make a move
        displayBoard();  // Display the board after the move

        // Check if the current player won
        if (checkWin(player)) {
            printf("Player %c wins!\n", player);
            break;
        }

        // Check if it's a draw
        if (checkDraw()) {
            printf("It's a draw!\n");
            break;
        }

        // Switch player for the next turn
        player = (player == 'X') ? 'O' : 'X';
        turn++;
    }

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
        )
    )
}