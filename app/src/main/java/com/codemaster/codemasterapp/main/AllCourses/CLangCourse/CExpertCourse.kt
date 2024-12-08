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
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
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
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 3
            Lesson(
                id = "expert_c3",
                title = "Personalized Calculator",
                description = "Build a personalized calculator with custom functions, UI, and logic.",
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

            // lesson 4
            Lesson(
                id = "expert_c4",
                title = "Contact Management System",
                description = "Create an advanced contact management system with features like adding, viewing, searching, updating, and deleting contacts.",
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

            // lesson 5
            Lesson(
                id = "expert_c5",
                title = "Unit Converter",
                description = "A comprehensive unit converter system for converting between different units such as length, weight, temperature, and more.",
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

            // lesson 6
            Lesson(
                id = "expert_c6",
                title = "Tic-Tac-Toe Game",
                description = "Create a text-based Tic-Tac-Toe game that allows two players to take turns marking spaces on a 3x3 grid. The game will check for winning conditions, handle user input, and display the board after each move.",
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
                                    listOf("display board", "'|'", "'---|---|---'")
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
                                    listOf("")
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
                                    listOf("'X'", "'O'")
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
                                    listOf("player input ", "validate")
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
                                    listOf("X ", " O")
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

            // lesson 7
            Lesson(
                id = "expert_c7",
                title = "Text Editor",
                description = "A simple text editor that allows the user to create, save, and open files. It will require handling file operations and memory management for dynamic text manipulation.",
                lessonContents = listOf(

                    LessonContent(
                        id = "expert_c7_sub1",
                        title = "Introduction to Text Editor Project",
                        description = "This project teaches how to create a simple text-based text editor in C, allowing users to create, edit, view, and manage text files dynamically using memory allocation, file handling, and string manipulation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this project, you will develop a text editor in C that enables users to create new files, edit existing files, and read file content. Users can input text dynamically, append or edit file content, and save changes as needed. The program makes use of dynamic memory allocation to handle variable-length content, file handling for managing text files, and string manipulation techniques to process user input and file data.",
                                    listOf(
                                        "memory allocation",
                                        "file handling",
                                        "string manipulation"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c7_sub2",
                        title = "Initializing the Text Editor in C",
                        description = "Learn to set up a text editor in C with dynamic memory and file handling.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates the initialization of a text editor in C, using key libraries like <stdio.h> for input/output, <stdlib.h> for dynamic memory allocation, and <string.h> for string manipulation. Constants such as MAX_LINE_LENGTH and INITIAL_BUFFER_SIZE are defined to manage input length and buffer size efficiently, enabling robust text and file handling.",
                                    listOf("dynamic memory", "file handling")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 256
#define INITIAL_BUFFER_SIZE 1024
""".trimIndent()
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c7_sub3",
                        title = "Creating and Saving a New File in C",
                        description = "Learn how to create, edit, and save a new file in C using dynamic memory and user input handling.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to create a function to manage file creation and editing in C. It uses dynamic memory allocation to handle content, checks for existing files to avoid overwrites, and allows users to input and save text. Key concepts include file handling, memory management, and user interaction.",
                                    listOf("dynamic memory", "file handling", "user input")
                                )
                            ),
                            ContentBlock.Code(
                                """
void createNewFile(char **buffer, size_t *bufferSize, char *filename) {
    FILE *file = fopen(filename, "r");
    if (file != NULL) {
        fclose(file);
        printf("Error: File with name '%s' already exists. Choose a different name.\n", filename);
        return;
    }

    free(*buffer); // Free any existing buffer
    *buffer = (char *)malloc(INITIAL_BUFFER_SIZE * sizeof(char));
    if (*buffer == NULL) {
        perror("Failed to allocate memory");
        exit(EXIT_FAILURE);
    }
    (*buffer)[0] = '\0'; // Start with an empty buffer
    *bufferSize = INITIAL_BUFFER_SIZE;

    printf("New file '%s' created.\n", filename);
    printf("Enter content for the file (type END on a new line to finish):\n");

    char input[MAX_LINE_LENGTH];
    while (1) {
        fgets(input, MAX_LINE_LENGTH, stdin);
        input[strcspn(input, "\n")] = '\0'; // Remove trailing newline

        if (strcmp(input, "END") == 0)
            break;

        size_t currentLength = strlen(*buffer);
        size_t additionalLength = strlen(input) + 1; // Include newline character

        if (currentLength + additionalLength >= *bufferSize) {
            *bufferSize = (currentLength + additionalLength) * 2;
            *buffer = realloc(*buffer, *bufferSize * sizeof(char));
            if (*buffer == NULL) {
                perror("Failed to reallocate memory");
                exit(EXIT_FAILURE);
            }
        }

        strcat(*buffer, input);
        strcat(*buffer, "\n");
    }

    printf("Do you want to save the file? (y/n): ");
    char choice;
    scanf(" %c", &choice);
    getchar(); // Consume newline
    if (choice == 'y' || choice == 'Y') {
        FILE *outFile = fopen(filename, "w");
        if (outFile == NULL) {
            perror("Failed to save file");
            return;
        }
        fprintf(outFile, "%s", *buffer);
        fclose(outFile);
        printf("File saved successfully as '%s'.\n", filename);
    } else {
        printf("File not saved.\n");
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The function ensures efficient memory usage and user-friendly file creation, making it easy to edit and save text content dynamically.",
                                    listOf("memory management", "file handling")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c7_sub4",
                        title = "Editing and Appending Content to a File in C",
                        description = "Learn how to edit and append content to an existing file in C using dynamic memory and file handling techniques.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson explains how to edit and append content to a file in C. The function dynamically allocates memory to read the file's current content and allows users to append new text interactively. Key operations include reading, resizing memory, and saving changes.",
                                    listOf("dynamic memory", "file handling", "append content")
                                )
                            ),
                            ContentBlock.Code(
                                """
void editFile(char **buffer, size_t *bufferSize, const char *filename) {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Error: File '%s' does not exist.\n", filename);
        return;
    }

    fseek(file, 0, SEEK_END);
    long fileSize = ftell(file);
    rewind(file);

    if (fileSize > *bufferSize) {
        *buffer = realloc(*buffer, (fileSize + 1) * sizeof(char));
        if (*buffer == NULL) {
            perror("Failed to allocate memory");
            fclose(file);
            exit(EXIT_FAILURE);
        }
        *bufferSize = fileSize + 1;
    }

    fread(*buffer, sizeof(char), fileSize, file);
    (*buffer)[fileSize] = '\0'; // Null-terminate the buffer
    fclose(file);

    printf("Current content of '%s':\n%s\n", filename, *buffer);
    printf("Enter new content to append (type END on a new line to finish):\n");

    char input[MAX_LINE_LENGTH];
    while (1) {
        fgets(input, MAX_LINE_LENGTH, stdin);
        input[strcspn(input, "\n")] = '\0'; // Remove trailing newline

        if (strcmp(input, "END") == 0)
            break;

        size_t currentLength = strlen(*buffer);
        size_t additionalLength = strlen(input) + 1; // Include newline character

        if (currentLength + additionalLength >= *bufferSize) {
            *bufferSize = (currentLength + additionalLength) * 2;
            *buffer = realloc(*buffer, *bufferSize * sizeof(char));
            if (*buffer == NULL) {
                perror("Failed to reallocate memory");
                exit(EXIT_FAILURE);
            }
        }

        strcat(*buffer, input);
        strcat(*buffer, "\n");
    }

    printf("Do you want to save the changes? (y/n): ");
    char choice;
    scanf(" %c", &choice);
    getchar(); // Consume newline
    if (choice == 'y' || choice == 'Y') {
        FILE *outFile = fopen(filename, "w");
        if (outFile == NULL) {
            perror("Failed to save file");
            return;
        }
        fprintf(outFile, "%s", *buffer);
        fclose(outFile);
        printf("Changes saved successfully to '%s'.\n", filename);
    } else {
        printf("Changes not saved.\n");
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The function dynamically adjusts buffer size to accommodate new content, ensuring smooth editing and appending operations.",
                                    listOf("buffer size", "dynamic allocation")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c7_sub5",
                        title = "Opening and Reading File Content in C",
                        description = "This lesson covers how to open and read the contents of a file line by line in C using file handling techniques.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson explains how to open a file and display its contents line by line. The function ensures the file exists and handles errors gracefully if it cannot be opened.",
                                    listOf("open a file", "display contents", "handle errors")
                                )
                            ),
                            ContentBlock.Code(
                                """
void openFile(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Error: File '%s' does not exist or cannot be opened.\n", filename);
        return;
    }

    printf("Contents of '%s':\n", filename);
    char line[MAX_LINE_LENGTH];
    while (fgets(line, MAX_LINE_LENGTH, file) != NULL) {
        printf("%s", line);
    }
    fclose(file);
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The openFile function reads the file line by line using fgets and prints each line to the console. If the file cannot be opened, an error message is displayed.",
                                    listOf("fgets", "console output")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c7_sub6",
                        title = "Complete Text Editor Project",
                        description = "Below is the complete code for a text editor program in C. This project allows users to create, edit, and view text files, showcasing essential file handling operations in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This is the full implementation of a text editor written in C. The program includes functionalities for creating a new file, editing an existing file, and viewing the content of a file. It ensures memory safety and handles various file operations like reading, writing, and appending content. The user interacts with a menu-driven interface to perform these actions.",
                                    listOf("text editor", "file operations", "memory safety")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 256
#define INITIAL_BUFFER_SIZE 1024

void createNewFile(char **buffer, size_t *bufferSize, char *filename) {
    FILE *file = fopen(filename, "r");
    if (file != NULL) {
        fclose(file);
        printf("Error: File with name '%s' already exists. Choose a different name.\n", filename);
        return;
    }

    free(*buffer); // Free any existing buffer
    *buffer = (char *)malloc(INITIAL_BUFFER_SIZE * sizeof(char));
    if (*buffer == NULL) {
        perror("Failed to allocate memory");
        exit(EXIT_FAILURE);
    }
    (*buffer)[0] = '\0'; // Start with an empty buffer
    *bufferSize = INITIAL_BUFFER_SIZE;

    printf("New file '%s' created.\n", filename);
    printf("Enter content for the file (type END on a new line to finish):\n");

    char input[MAX_LINE_LENGTH];
    while (1) {
        fgets(input, MAX_LINE_LENGTH, stdin);
        input[strcspn(input, "\n")] = '\0'; // Remove trailing newline

        if (strcmp(input, "END") == 0)
            break;

        size_t currentLength = strlen(*buffer);
        size_t additionalLength = strlen(input) + 1; // Include newline character

        if (currentLength + additionalLength >= *bufferSize) {
            *bufferSize = (currentLength + additionalLength) * 2;
            *buffer = realloc(*buffer, *bufferSize * sizeof(char));
            if (*buffer == NULL) {
                perror("Failed to reallocate memory");
                exit(EXIT_FAILURE);
            }
        }

        strcat(*buffer, input);
        strcat(*buffer, "\n");
    }

    printf("Do you want to save the file? (y/n): ");
    char choice;
    scanf(" %c", &choice);
    getchar(); // Consume newline
    if (choice == 'y' || choice == 'Y') {
        FILE *outFile = fopen(filename, "w");
        if (outFile == NULL) {
            perror("Failed to save file");
            return;
        }
        fprintf(outFile, "%s", *buffer);
        fclose(outFile);
        printf("File saved successfully as '%s'.\n", filename);
    } else {
        printf("File not saved.\n");
    }
}

void editFile(char **buffer, size_t *bufferSize, const char *filename) {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Error: File '%s' does not exist.\n", filename);
        return;
    }

    fseek(file, 0, SEEK_END);
    long fileSize = ftell(file);
    rewind(file);

    if (fileSize > *bufferSize) {
        *buffer = realloc(*buffer, (fileSize + 1) * sizeof(char));
        if (*buffer == NULL) {
            perror("Failed to allocate memory");
            fclose(file);
            exit(EXIT_FAILURE);
        }
        *bufferSize = fileSize + 1;
    }

    fread(*buffer, sizeof(char), fileSize, file);
    (*buffer)[fileSize] = '\0'; // Null-terminate the buffer
    fclose(file);

    printf("Current content of '%s':\n%s\n", filename, *buffer);
    printf("Enter new content to append (type END on a new line to finish):\n");

    char input[MAX_LINE_LENGTH];
    while (1) {
        fgets(input, MAX_LINE_LENGTH, stdin);
        input[strcspn(input, "\n")] = '\0'; // Remove trailing newline

        if (strcmp(input, "END") == 0)
            break;

        size_t currentLength = strlen(*buffer);
        size_t additionalLength = strlen(input) + 1; // Include newline character

        if (currentLength + additionalLength >= *bufferSize) {
            *bufferSize = (currentLength + additionalLength) * 2;
            *buffer = realloc(*buffer, *bufferSize * sizeof(char));
            if (*buffer == NULL) {
                perror("Failed to reallocate memory");
                exit(EXIT_FAILURE);
            }
        }

        strcat(*buffer, input);
        strcat(*buffer, "\n");
    }

    printf("Do you want to save the changes? (y/n): ");
    char choice;
    scanf(" %c", &choice);
    getchar(); // Consume newline
    if (choice == 'y' || choice == 'Y') {
        FILE *outFile = fopen(filename, "w");
        if (outFile == NULL) {
            perror("Failed to save file");
            return;
        }
        fprintf(outFile, "%s", *buffer);
        fclose(outFile);
        printf("Changes saved successfully to '%s'.\n", filename);
    } else {
        printf("Changes not saved.\n");
    }
}

void openFile(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Error: File '%s' does not exist or cannot be opened.\n", filename);
        return;
    }

    printf("Contents of '%s':\n", filename);
    char line[MAX_LINE_LENGTH];
    while (fgets(line, MAX_LINE_LENGTH, file) != NULL) {
        printf("%s", line);
    }
    fclose(file);
}

int main() {
    char *buffer = NULL;
    size_t bufferSize = 0;
    int command;
    char filename[100];

    printf("Welcome to the Text Editor!\n");

    while (1) {
        printf("\nMenu:\n");
        printf("1. Create New File\n");
        printf("2. Edit File\n");
        printf("3. Open File\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &command);
        getchar(); // Consume newline

        if (command == 1) {
            printf("Enter new file name: ");
            scanf("%s", filename);
            getchar(); // Consume newline
            createNewFile(&buffer, &bufferSize, filename);
        } else if (command == 2) {
            printf("Enter filename to edit: ");
            scanf("%s", filename);
            getchar(); // Consume newline
            editFile(&buffer, &bufferSize, filename);
        } else if (command == 3) {
            printf("Enter filename to open: ");
            scanf("%s", filename);
            getchar(); // Consume newline
            openFile(filename);
        } else if (command == 4) {
            printf("Exiting program.\n");
            break;
        } else {
            printf("Invalid choice. Try again.\n");
        }
    }

    free(buffer); // Free allocated memory
    return 0;
}
"""
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This project demonstrates practical use of file handling in C, including dynamic memory management and user interaction via a menu. It is a foundational project for learning C programming and understanding file I/O operations.",
                                    listOf(
                                        "file handling",
                                        "dynamic memory",
                                        "menu-driven interface"
                                    )
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
                id = "expert_c8",
                title = "Student Grading System",
                description = " Build a system to manage student grades, calculate averages, and display results. This project will involve basic data structures and file handling.",
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
                        id = "expert_c8_sub1",
                        title = "Student Grading System in C",
                        description = "This project teaches how to build a robust student grading system in C, allowing users to add, view, and manage student records. The system ensures uniqueness of roll numbers and includes features like grade computation, file storage, and record retrieval.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this project, you will develop a student grading system in C that allows users to add and manage student records. The system enforces unique roll numbers to maintain data integrity. It supports dynamic input of student names, roll numbers, and marks for multiple subjects, computes averages, assigns grades, and saves records to a file for persistence. The project demonstrates practical usage of concepts like array management, file handling, and logical validations to build a functional and user-friendly application.",
                                    listOf(
                                        "array management",
                                        "file handling",
                                        "logical validations"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c8_sub2",
                        title = "Building a Student Grading System in C",
                        description = "Learn how to build a student grading system in C with features like unique roll number validation, grade calculation, and persistent file storage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson guides you through the implementation of a student grading system in C. Key features include enforcing unique roll numbers, calculating averages and grades, and saving records to a file for persistence. You will use essential libraries like <stdio.h> for input/output, <stdlib.h> for memory management, and <string.h> for string operations. Constants such as MAX_STUDENTS and MAX_SUBJECTS are defined to manage data efficiently, ensuring robust record handling and validation.",
                                    listOf(
                                        "unique roll numbers",
                                        "file storage",
                                        "grade calculation"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STUDENTS 100
#define MAX_NAME_LENGTH 50
#define MAX_SUBJECTS 5

typedef struct {
    char name[MAX_NAME_LENGTH];
    int rollNumber;
    float numbers[MAX_SUBJECTS];
    float average;
    int isSaved;
} Student;

Student students[MAX_STUDENTS];
int studentCount = 0;
""".trimIndent()
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c8_sub3",
                        title = "Adding and Validating Student Records in C",
                        description = "Learn how to implement a function for adding student records in C while ensuring validation, accurate grade calculation, and options for saving the records persistently.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson covers a function that calculates grades based on averages and validates student records by ensuring unique roll numbers, making it easy to manage and save records effectively.",
                                    listOf("data validation", "grade calculation", "file handling")
                                )
                            ),
                            ContentBlock.Code(
                                """
char getGrade(float average) {
    if (average >= 90) return 'A';
    if (average >= 80) return 'B';
    if (average >= 70) return 'C';
    if (average >= 60) return 'D';
    return 'F';
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This implementation ensures records are accurate, prevents duplicates, and supports saving for future access.",
                                    listOf("data validation", "grade calculation", "file handling")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c8_sub4",
                        title = "Adding New Student Records with Validation in C",
                        description = "Learn how to add new student records with validation, calculate averages, and provide options to save records in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to add new student records while validating roll numbers to ensure uniqueness. Users can input scores for multiple subjects, calculate averages, and optionally save the record to persistent storage. The function prevents duplicates, manages data efficiently, and provides a seamless user experience.",
                                    listOf(
                                        "data validation",
                                        "average calculation",
                                        "file handling"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
void addStudent() {
    if (studentCount >= MAX_STUDENTS) {
        printf("Student limit reached!\n");
        return;
    }

    Student newStudent;
    printf("Enter student name: ");
    scanf(" %[^\n]s", newStudent.name);
    printf("Enter roll number: ");
    scanf("%d", &newStudent.rollNumber);

    // Check if the roll number already exists
    for (int i = 0; i < studentCount; i++) {
        if (students[i].rollNumber == newStudent.rollNumber) {
            printf("Error: A student with roll number %d already exists.\n", newStudent.rollNumber);
            return;
        }
    }

    printf("Enter numbers for %d subjects:\n", MAX_SUBJECTS);
    float total = 0;
    for (int i = 0; i < MAX_SUBJECTS; i++) {
        printf("Subject %d: ", i + 1);
        if (scanf("%f", &newStudent.numbers[i]) != 1) {
            printf("Invalid number input. Please enter a valid number.\n");
            return;
        }
        total += newStudent.numbers[i];
    }
    newStudent.average = total / MAX_SUBJECTS;
    newStudent.isSaved = 0;

    students[studentCount++] = newStudent;
    printf("Student record added successfully.\n");

    char saveChoice;
    printf("Do you want to save this record? (Y/N): ");
    scanf(" %c", &saveChoice);
    if (saveChoice == 'Y' || saveChoice == 'y') {
        saveRecord(studentCount - 1);
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The function ensures robust data management by dynamically allocating memory for new records, validating inputs, and allowing users to save data for persistent access.",
                                    listOf(
                                        "dynamic allocation",
                                        "data validation",
                                        "persistent storage"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c8_sub5",
                        title = "Viewing Student Records by Roll Number in C",
                        description = "Learn how to search and display student records by roll number in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates a function to search for and display a student's record by roll number. It validates input, checks if the record exists, and displays details like scores, averages, and grades, ensuring saved records are retrieved accurately.",
                                    listOf("search records", "validate input", "display details")
                                )
                            ),
                            ContentBlock.Code(
                                """
void viewRecordByRollNumber() {
    if (studentCount == 0) {
        printf("No student records available.\n");
        return;
    }

    int rollNumberToSearch;
    printf("Enter the roll number to search: ");
    scanf("%d", &rollNumberToSearch);

    int found = 0;
    for (int i = 0; i < studentCount; i++) {
        if (students[i].rollNumber == rollNumberToSearch && students[i].isSaved) {
            printf("\nStudent Record:\n");
            printf("Name: %s\n", students[i].name);
            printf("Roll Number: %d\n", students[i].rollNumber);
            printf("Subjects Scores: ");
            for (int j = 0; j < MAX_SUBJECTS; j++) {
                printf("%.2f ", students[i].numbers[j]);
            }
            printf("\nAverage: %.2f\n", students[i].average);
            printf("Grade: %c\n", getGrade(students[i].average));
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("No record found for roll number %d.\n", rollNumberToSearch);
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This function efficiently retrieves and displays student records by roll number, ensuring accurate data management and user-friendly output.",
                                    listOf(
                                        "search functionality",
                                        "data retrieval",
                                        "user-friendly output"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c8_sub6",
                        title = "Saving Student Records in C",
                        description = "Learn how to save student records to a file in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to save a student's record to a file. The function writes data in a structured format, including the name, roll number, subject scores, and average, ensuring successful file persistence.",
                                    listOf("save records", "file handling", "structured format")
                                )
                            ),
                            ContentBlock.Code(
                                """
void saveRecord(int studentIndex) {
    FILE *file = fopen("student_records.txt", "a");
    if (file == NULL) {
        printf("Error opening file for writing.\n");
        return;
    }

    // Write the student record in a consistent format
    fprintf(file, "%s\n", students[studentIndex].name);
    fprintf(file, "%d\n", students[studentIndex].rollNumber);
    for (int j = 0; j < MAX_SUBJECTS; j++) {
        fprintf(file, "%.2f ", students[studentIndex].numbers[j]);
    }
    fprintf(file, "\n%.2f\n", students[studentIndex].average); // Save average
    fclose(file);
    students[studentIndex].isSaved = 1;
    printf("Student record saved successfully.\n");
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This function writes student data to a file in an organized way, ensuring records are stored persistently and marked as saved.",
                                    listOf("file persistence", "organized storage", "data saving")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c8_sub7",
                        title = "Loading Student Records in C",
                        description = "Learn how to load student records from a file in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This lesson demonstrates how to load student records from a file. The function reads data line by line, calculates averages, and marks records as loaded successfully.",
                                    listOf("load records", "file reading", "data initialization")
                                )
                            ),
                            ContentBlock.Code(
                                """
void loadRecords() {
    FILE *file = fopen("student_records.txt", "r");
    if (file == NULL) {
        printf("No previous records found.\n");
        return;
    }

    // Read until the end of the file
    while (fscanf(file, " %[^\n]s", students[studentCount].name) != EOF) {
        fscanf(file, "%d", &students[studentCount].rollNumber);

        // Read the scores for each subject
        float total = 0;
        for (int i = 0; i < MAX_SUBJECTS; i++) {
            fscanf(file, "%f", &students[studentCount].numbers[i]);
            total += students[studentCount].numbers[i];
        }
        students[studentCount].average = total / MAX_SUBJECTS;

        // Set the record as saved
        students[studentCount].isSaved = 1;

        studentCount++;  // Increment the student count
    }

    fclose(file);
    printf("Records loaded successfully.\n");
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The function efficiently reads student records, calculates averages, and updates the system with previously saved data.",
                                    listOf("file reading", "data loading", "average calculation")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c8_sub8",
                        title = "Student Grading System in C",
                        description = "Complete implementation of a student grading system in C, showcasing file handling, data management, and a menu-driven interface.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This program allows users to add, save, and view student records. It demonstrates file handling, structured data storage, and user interaction through a menu-driven interface.",
                                    listOf("file handling", "data management", "menu interface")
                                )
                            ),
                            ContentBlock.Code(
                                """
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STUDENTS 100
#define MAX_NAME_LENGTH 50
#define MAX_SUBJECTS 5

typedef struct {
    char name[MAX_NAME_LENGTH];
    int rollNumber;
    float numbers[MAX_SUBJECTS];
    float average;
    int isSaved;
} Student;

Student students[MAX_STUDENTS];
int studentCount = 0;

// Function prototypes
void saveRecord(int studentIndex);
void addStudent();
void viewRecordByRollNumber();
char getGrade(float average);

char getGrade(float average) {
    if (average >= 90) return 'A';
    if (average >= 80) return 'B';
    if (average >= 70) return 'C';
    if (average >= 60) return 'D';
    return 'F';
}

void addStudent() {
    if (studentCount >= MAX_STUDENTS) {
        printf("Student limit reached!\n");
        return;
    }

    Student newStudent;
    printf("Enter student name: ");
    scanf(" %[^\n]s", newStudent.name);
    printf("Enter roll number: ");
    scanf("%d", &newStudent.rollNumber);

    // Check if the roll number already exists
    for (int i = 0; i < studentCount; i++) {
        if (students[i].rollNumber == newStudent.rollNumber) {
            printf("Error: A student with roll number %d already exists.\n", newStudent.rollNumber);
            return;
        }
    }

    printf("Enter numbers for %d subjects:\n", MAX_SUBJECTS);
    float total = 0;
    for (int i = 0; i < MAX_SUBJECTS; i++) {
        printf("Subject %d: ", i + 1);
        if (scanf("%f", &newStudent.numbers[i]) != 1) {
            printf("Invalid number input. Please enter a valid number.\n");
            return;
        }
        total += newStudent.numbers[i];
    }
    newStudent.average = total / MAX_SUBJECTS;
    newStudent.isSaved = 0;

    students[studentCount++] = newStudent;
    printf("Student record added successfully.\n");

    char saveChoice;
    printf("Do you want to save this record? (Y/N): ");
    scanf(" %c", &saveChoice);
    if (saveChoice == 'Y' || saveChoice == 'y') {
        saveRecord(studentCount - 1);
    }
}


void viewRecordByRollNumber() {
    if (studentCount == 0) {
        printf("No student records available.\n");
        return;
    }

    int rollNumberToSearch;
    printf("Enter the roll number to search: ");
    scanf("%d", &rollNumberToSearch);

    int found = 0;
    for (int i = 0; i < studentCount; i++) {
        if (students[i].rollNumber == rollNumberToSearch && students[i].isSaved) {
            printf("\nStudent Record:\n");
            printf("Name: %s\n", students[i].name);
            printf("Roll Number: %d\n", students[i].rollNumber);
            printf("Subjects Scores: ");
            for (int j = 0; j < MAX_SUBJECTS; j++) {
                printf("%.2f ", students[i].numbers[j]);
            }
            printf("\nAverage: %.2f\n", students[i].average);
            printf("Grade: %c\n", getGrade(students[i].average));
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("No record found for roll number %d.\n", rollNumberToSearch);
    }
}

void saveRecord(int studentIndex) {
    FILE *file = fopen("student_records.txt", "a");
    if (file == NULL) {
        printf("Error opening file for writing.\n");
        return;
    }

    // Write the student record in a consistent format
    fprintf(file, "%s\n", students[studentIndex].name);
    fprintf(file, "%d\n", students[studentIndex].rollNumber);
    for (int j = 0; j < MAX_SUBJECTS; j++) {
        fprintf(file, "%.2f ", students[studentIndex].numbers[j]);
    }
    fprintf(file, "\n%.2f\n", students[studentIndex].average); // Save average
    fclose(file);
    students[studentIndex].isSaved = 1;
    printf("Student record saved successfully.\n");
}

void loadRecords() {
    FILE *file = fopen("student_records.txt", "r");
    if (file == NULL) {
        printf("No previous records found.\n");
        return;
    }

    // Read until the end of the file
    while (fscanf(file, " %[^\n]s", students[studentCount].name) != EOF) {
        fscanf(file, "%d", &students[studentCount].rollNumber);

        // Read the scores for each subject
        float total = 0;
        for (int i = 0; i < MAX_SUBJECTS; i++) {
            fscanf(file, "%f", &students[studentCount].numbers[i]);
            total += students[studentCount].numbers[i];
        }
        students[studentCount].average = total / MAX_SUBJECTS;

        // Set the record as saved
        students[studentCount].isSaved = 1;

        studentCount++;  // Increment the student count
    }

    fclose(file);
    printf("Records loaded successfully.\n");
}

int main() {
    loadRecords();
    int choice;

    while (1) {
        printf("\nStudent Grading System Menu:\n");
        printf("1. Add Student Record\n");
        printf("2. View Record by Roll Number\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                viewRecordByRollNumber();
                break;
            case 3:
                printf("Exiting program.\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}

"""
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This project demonstrates practical file handling in C, focusing on saving and retrieving structured data with user-friendly functionality.",
                                    listOf("file handling", "menu interface", "data persistence")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 9
            Lesson(
                id = "expert_c9",
                title = "End of C Language Lessons",
                description = "Congratulations! You have completed the C programming lessons.",
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c9_sub1",
                        title = "Conclusion of C Language Learning",
                        description = "This marks the end of your C programming journey. You've covered the fundamentals and advanced topics in C, including control structures, functions, arrays, pointers, memory management, and more.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You have now learned the essential concepts in C programming, including syntax, control structures, functions, pointers, file handling, and memory management. These skills will help you solve real-world problems and form the foundation for learning more advanced programming topics in the future.",
                                    listOf(
                                        "C fundamentals",
                                        "memory management",
                                        "control structures"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c9_sub2",
                        title = "Farewell to C: Embracing New Beginnings",
                        description = "It's time to say goodbye to C programming. While it's bittersweet, you are now equipped with valuable skills for the next phase of your learning journey.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Though you're leaving the C language behind, the lessons and skills you've learned will continue to shape your growth as a programmer. As you step into real-world projects, remember that C has given you a solid foundation in understanding the inner workings of programming languages.",
                                    listOf(
                                        "programming foundation",
                                        "real-world applications"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c9_sub3",
                        title = "The Journey Ahead: Real-World Projects Await",
                        description = "You're ready to take on real-world projects now! With your C language skills, you have the tools to tackle complex challenges and build powerful applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "As you transition to building real-world projects, you'll find that the concepts you've learned in C are everywhere. Whether you're working on applications, embedded systems, or even starting with a new language, your understanding of C will be invaluable. Keep building, keep creating, and never stop learning!",
                                    listOf(
                                        "real-world projects",
                                        "continuous learning"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c9_sub4",
                        title = "Embrace the Challenge: You're Ready",
                        description = "With determination and the knowledge you've gained, you're more than ready for the next chapter in your programming journey.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Programming is an ongoing adventure, and you've just completed an important chapter. Take pride in how far you've come, and always remember that every new challenge is an opportunity to grow even more. The best is yet to come, and you're fully prepared for it!",
                                    listOf(
                                        "embracing challenges",
                                        "growth and learning"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = "expert_c9_sub5",
                        title = "Best Wishes for Your Future Projects",
                        description = "The road ahead is bright. Best of luck in your future programming endeavors!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You’ve come so far, and now you're ready to make a real impact in the programming world. Whether you're diving into app development, game design, or systems programming, the journey ahead is full of exciting possibilities. Best of luck with your future projects. May your code always compile successfully!",
                                    listOf(
                                        "future projects",
                                        "success and impact"
                                    )
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