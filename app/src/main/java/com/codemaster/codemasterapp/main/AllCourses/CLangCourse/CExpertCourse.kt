package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun CExpertCourse(): Stage {
    return Stage(
        id = "c_expert_stage",
        title = "expert",
        lessons = listOf(
            Lesson(
                id = "expert_c1",
                title = "C Files",
                description = "Learn advanced file handling techniques in C, including creating, reading, writing, and closing files.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c1_sub1",
                        title = "Introduction to File Handling",
                        description = "Understand the basics of file handling in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c1_sub2",
                        title = "Creating a File",
                        description = "Learn how to create and open files in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c1_sub3",
                        title = "Reading from a File",
                        description = "Learn how to read data from a file.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c1_sub4",
                        title = "Writing to a File",
                        description = "Learn how to write data to a file.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c1_sub5",
                        title = "Closing a File",
                        description = "Learn how to close a file safely.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c1_sub6",
                        title = "File Error Handling",
                        description = "Understand how to handle file errors in C.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c1_sub1",
                        title = "Introduction to File Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("File handling in C allows programs to read from and write to files. You'll use file pointers to access files."),
                            ContentBlock.Text.fromString("To work with files, you need to include the `stdio.h` header."),
                            ContentBlock.Code("""#include <stdio.h>""")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c1_sub2",
                        title = "Creating a File",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("To create and open a file in C, use the `fopen()` function with mode `w` (write) or `wb` (binary)."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(file, "Hello, world!");
    fclose(file);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c1_sub3",
                        title = "Reading from a File",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("To read from a file, use `fopen()` in `r` (read) mode, and use functions like `fscanf()`, `fgets()`, or `fgetc()` to read data."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "r");
    char str[100];
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fgets(str, sizeof(str), file);
    printf("%s", str);
    fclose(file);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c1_sub4",
                        title = "Writing to a File",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("To write to a file, use `fopen()` in `w` or `a` (append) mode, and use functions like `fprintf()`, `fputs()`, or `fwrite()`."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(file, "Hello, world!");
    fclose(file);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c1_sub5",
                        title = "Closing a File",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("To safely close a file, use the `fclose()` function. This ensures all data is written and the file is properly closed."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fprintf(file, "Hello, world!");
    fclose(file);  // Closing the file
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c1_sub6",
                        title = "File Error Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Always check if file operations succeed. Use `ferror()` to check for errors during file operations."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("nonexistent.txt", "r");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    // Further file operations
    fclose(file);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),
            // Lesson 2
            Lesson(
                id = "expert_c2",
                title = "C Enumeration (enum)",
                description = "Learn advanced techniques for using enums in C, including defining enums, changing their values, and using them in switch statements.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c2_sub1",
                        title = "Introduction to Enums",
                        description = "Learn the basics of defining and using enums in C.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c2_sub2",
                        title = "Changing Enum Values",
                        description = "Understand how to assign and change values of enums.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c2_sub3",
                        title = "Enum in Switch Statement",
                        description = "Learn how to use enums with switch-case statements.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c2_sub4",
                        title = "Enum with Bit Flags",
                        description = "Learn how to use enums with bit flags for more efficient storage.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c2_sub1",
                        title = "Introduction to Enums",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Enums in C are used to define a set of named integer constants. They improve code readability and provide better organization."),
                            ContentBlock.Text.fromString("Syntax:"),
                            ContentBlock.Code(
                                """enum EnumName {
    CONSTANT_1,
    CONSTANT_2,
    CONSTANT_3
};"""
                            ),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };

int main() {
    enum Day today = Wednesday;
    printf("Today is %d\\n", today);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c2_sub2",
                        title = "Changing Enum Values",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("You can change the underlying integer values of an enum. By default, the first value is 0, and each subsequent value increments by 1."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

enum Day { Sunday = 1, Monday = 2, Tuesday = 4, Wednesday = 8, Thursday = 16 };

int main() {
    enum Day today = Tuesday;
    printf("Today is %d\\n", today);
    return 0;
}"""
                            ),
                            ContentBlock.Text.fromString("In the above code, Sunday starts at 1, Monday at 2, Tuesday at 4, etc.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c2_sub3",
                        title = "Enum in Switch Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Enums work well with switch statements, as you can match specific enum values to execute corresponding code."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };

int main() {
    enum Day today = Wednesday;
    
    switch(today) {
        case Sunday:
            printf("It's Sunday\\n");
            break;
        case Wednesday:
            printf("It's Wednesday\\n");
            break;
        default:
            printf("It's a weekday\\n");
    }
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c2_sub4",
                        title = "Enum with Bit Flags",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("You can use enums with bit flags for efficient storage and checking multiple conditions."),
                            ContentBlock.Text.fromString("Bitwise OR (`|`) and AND (`&`) operations are used to combine or check flags."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

enum Permissions {
    READ = 1 << 0,    // 0001
    WRITE = 1 << 1,   // 0010
    EXECUTE = 1 << 2  // 0100
};

int main() {
    int userPermissions = READ | WRITE;  // User has read and write permissions
    if (userPermissions & READ) {
        printf("User has read permissions\\n");
    }
    if (userPermissions & EXECUTE) {
        printf("User has execute permissions\\n");
    } else {
        printf("User does not have execute permissions\\n");
    }
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),
            // lesson 3
            Lesson(
                id = "expert_c3",
                title = "C Memory Management",
                description = "Master memory management in C, including dynamic memory allocation, deallocation, and handling memory efficiently.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c3_sub1",
                        title = "Memory in C",
                        description = "Understand the concept of memory in C, including stack and heap memory.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub2",
                        title = "Dynamic Memory Allocation",
                        description = "Learn how to allocate memory dynamically using malloc, calloc, and realloc.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub3",
                        title = "Memory Deallocation",
                        description = "Learn the importance of deallocating memory using free.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub4",
                        title = "Memory Leaks and Optimization",
                        description = "Understand how to prevent memory leaks and optimize memory usage.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c3_sub5",
                        title = "Advanced Memory Management Techniques",
                        description = "Explore advanced techniques like memory pools and garbage collection.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c3_sub1",
                        title = "Memory in C",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Memory in C is divided into three sections: the stack, heap, and data segment."),
                            ContentBlock.Text.fromString("1. **Stack**: Used for local variables, automatically managed, limited size."),
                            ContentBlock.Text.fromString("2. **Heap**: Used for dynamic memory allocation, manually managed."),
                            ContentBlock.Text.fromString("3. **Data Segment**: Used for global and static variables.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub2",
                        title = "Dynamic Memory Allocation",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("C provides functions for dynamic memory allocation, allowing memory to be allocated at runtime."),
                            ContentBlock.Text.fromString("Functions:"),
                            ContentBlock.Text.fromString("1. **malloc()**: Allocates uninitialized memory."),
                            ContentBlock.Text.fromString("2. **calloc()**: Allocates zero-initialized memory."),
                            ContentBlock.Text.fromString("3. **realloc()**: Resizes previously allocated memory."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // malloc allocates 5 integers
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }
    arr[0] = 10;
    arr[1] = 20;
    printf("arr[0]: %d, arr[1]: %d\\n", arr[0], arr[1]);

    // Reallocate memory
    arr = (int*)realloc(arr, 10 * sizeof(int));  // realloc resizes the array
    if (arr == NULL) {
        printf("Memory reallocation failed\\n");
        return 1;
    }
    arr[5] = 50;
    printf("arr[5]: %d\\n", arr[5]);

    free(arr);  // Free memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub3",
                        title = "Memory Deallocation",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Memory allocated dynamically using malloc, calloc, or realloc should be deallocated using **free()**."),
                            ContentBlock.Text.fromString("Failure to free memory can cause memory leaks, leading to resource wastage."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int*)malloc(sizeof(int));
    *ptr = 100;
    printf("Value: %d\\n", *ptr);
    
    free(ptr);  // Always free dynamically allocated memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub4",
                        title = "Memory Leaks and Optimization",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Memory leaks occur when dynamically allocated memory is not freed, causing wasted resources and possible application crashes."),
                            ContentBlock.Text.fromString("Best Practices:"),
                            ContentBlock.Text.fromString("1. Always pair malloc/calloc/realloc with free."),
                            ContentBlock.Text.fromString("2. Use tools like **Valgrind** to detect memory leaks."),
                            ContentBlock.Text.fromString("3. Consider using **smart pointers** in C++ to automate memory management."),
                            ContentBlock.Text.fromString("Example of a memory leak:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));
    // Memory is not freed, causing a memory leak
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c3_sub5",
                        title = "Advanced Memory Management Techniques",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Advanced memory management techniques can help optimize memory usage in larger applications."),
                            ContentBlock.Text.fromString("1. **Memory Pools**: Pre-allocate a fixed amount of memory and distribute it to components as needed."),
                            ContentBlock.Text.fromString("2. **Garbage Collection**: Though C doesn't have built-in garbage collection, you can implement custom memory management strategies."),
                            ContentBlock.Text.fromString("Example of a basic memory pool (conceptual):"),
                            ContentBlock.Code(
                                """// A simple memory pool would allocate a chunk of memory and return pointers to sections of it.
#include <stdio.h>
#include <stdlib.h>

#define POOL_SIZE 1024
char memory_pool[POOL_SIZE];  // Pre-allocated memory pool

void* allocate_from_pool(size_t size) {
    static size_t offset = 0;
    if (offset + size > POOL_SIZE) return NULL;  // Not enough space
    void* ptr = memory_pool + offset;
    offset += size;
    return ptr;
}

int main() {
    int* p = (int*)allocate_from_pool(sizeof(int));
    if (p == NULL) {
        printf("Memory pool exhausted\\n");
    }
    return 0;
}"""
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
                title = "C Allocate Memory",
                description = "Learn how to allocate memory in C, both statically and dynamically, and understand their differences and use cases.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c4_sub1",
                        title = "Static Memory Allocation",
                        description = "Learn how memory is allocated at compile-time using static memory allocation.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub2",
                        title = "Dynamic Memory Allocation",
                        description = "Understand how to allocate memory at runtime using dynamic memory allocation.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c4_sub3",
                        title = "Differences Between Static and Dynamic Memory",
                        description = "Compare static and dynamic memory allocation in C.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c4_sub1",
                        title = "Static Memory Allocation",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Static memory allocation is done at compile time, and the memory is reserved for the entire lifetime of the program."),
                            ContentBlock.Text.fromString("Variables allocated statically have a fixed size and are stored on the stack or in the data segment."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    int arr[5];  // Static array with 5 integers
    arr[0] = 10;
    printf("arr[0]: %d\\n", arr[0]);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c4_sub2",
                        title = "Dynamic Memory Allocation",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Dynamic memory allocation is done at runtime using functions like `malloc()`, `calloc()`, and `realloc()`."),
                            ContentBlock.Text.fromString("Memory is allocated on the heap and can be resized, deallocated, and managed manually."),
                            ContentBlock.Text.fromString("Functions:"),
                            ContentBlock.Text.fromString("1. **malloc()**: Allocates memory but does not initialize it."),
                            ContentBlock.Text.fromString("2. **calloc()**: Allocates memory and initializes it to zero."),
                            ContentBlock.Text.fromString("3. **realloc()**: Changes the size of previously allocated memory."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }
    arr[0] = 10;
    printf("arr[0]: %d\\n", arr[0]);

    arr = (int*)realloc(arr, 10 * sizeof(int));  // Resize memory
    if (arr == NULL) {
        printf("Reallocation failed\\n");
        return 1;
    }
    free(arr);  // Free dynamically allocated memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c4_sub3",
                        title = "Differences Between Static and Dynamic Memory",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("1. **Static Memory**: Allocated at compile time, fixed size, faster access, limited flexibility."),
                            ContentBlock.Text.fromString("2. **Dynamic Memory**: Allocated at runtime, flexible size, can be resized, requires manual management (using `malloc()`, `realloc()`, `free()`)."),
                            ContentBlock.Text.fromString("Use Case:"),
                            ContentBlock.Text.fromString("1. **Static Memory**: Use when the size of the data is known and constant throughout the program."),
                            ContentBlock.Text.fromString("2. **Dynamic Memory**: Use when the size of the data can change at runtime or when memory requirements are not known upfront.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            // lesson 5
            Lesson(
                id = "expert_c5",
                title = "C Access Memory",
                description = "Learn how to access and manage dynamic memory in C after allocation.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c5_sub1",
                        title = "Accessing Dynamically Allocated Memory",
                        description = "Learn how to access elements in dynamically allocated memory.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c5_sub2",
                        title = "Using Pointers with Dynamic Memory",
                        description = "Understand the role of pointers when working with dynamic memory.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c5_sub3",
                        title = "Freeing Dynamically Allocated Memory",
                        description = "Learn the importance of freeing dynamically allocated memory to avoid memory leaks.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c5_sub1",
                        title = "Accessing Dynamically Allocated Memory",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Once memory is allocated dynamically, you access it just like static memory, using pointers and array indexing."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Accessing dynamically allocated memory using array indexing
    arr[0] = 10;
    arr[1] = 20;

    printf("arr[0]: %d\\n", arr[0]);
    printf("arr[1]: %d\\n", arr[1]);

    free(arr);  // Free memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c5_sub2",
                        title = "Using Pointers with Dynamic Memory",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("Dynamic memory allocation returns a pointer to the allocated memory block."),
                            ContentBlock.Text.fromString("You can access memory using the pointer directly or through pointer arithmetic."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Accessing memory through pointer arithmetic
    *(arr + 0) = 10;
    *(arr + 1) = 20;

    printf("arr[0]: %d\\n", *(arr + 0));
    printf("arr[1]: %d\\n", *(arr + 1));

    free(arr);  // Free memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c5_sub3",
                        title = "Freeing Dynamically Allocated Memory",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("It's important to free dynamically allocated memory using `free()` to prevent memory leaks."),
                            ContentBlock.Text.fromString("Once you free the memory, the pointer still holds the address, but it's no longer valid."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Dynamically allocate memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Using memory
    arr[0] = 10;
    printf("arr[0]: %d\\n", arr[0]);

    // Free memory when done
    free(arr);
    // Accessing after free may lead to undefined behavior
    // printf("arr[0]: %d\\n", arr[0]);  // Dangerous

    return 0;
}"""
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
                title = "C Reallocate Memory",
                description = "Learn how to reallocate memory dynamically and handle NULL pointers and error checking in C.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c6_sub1",
                        title = "Reallocating Memory in C",
                        description = "Learn how to change the size of dynamically allocated memory.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c6_sub2",
                        title = "NULL Pointer & Error Checking",
                        description = "Understand how to handle NULL pointers and check for allocation errors.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c6_sub1",
                        title = "Reallocating Memory in C",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("In C, you can use `realloc()` to change the size of a previously allocated memory block."),
                            ContentBlock.Text.fromString("Syntax: `ptr = realloc(ptr, new_size);`"),
                            ContentBlock.Text.fromString("If `realloc()` fails, it returns `NULL` and the original memory is untouched."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(3 * sizeof(int));  // Initial allocation
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    // Reallocate memory to hold 5 integers
    arr = realloc(arr, 5 * sizeof(int));
    if (arr == NULL) {
        printf("Reallocation failed\\n");
        return 1;
    }

    arr[3] = 40;
    arr[4] = 50;

    // Print values
    for (int i = 0; i < 5; i++) {
        printf("arr[%d]: %d\\n", i, arr[i]);
    }

    free(arr);  // Free memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c6_sub2",
                        title = "NULL Pointer & Error Checking",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("When reallocating memory, it's crucial to check for `NULL` to prevent memory corruption or loss."),
                            ContentBlock.Text.fromString("If `realloc()` fails, it returns `NULL`. Always assign the result to a temporary pointer to avoid memory leaks."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(3 * sizeof(int));  // Initial allocation
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    // Reallocation with error checking
    int *temp = realloc(arr, 5 * sizeof(int));
    if (temp == NULL) {
        printf("Reallocation failed\\n");
        free(arr);  // Free original memory to avoid leak
        return 1;
    }
    arr = temp;  // Assign the new memory block to the original pointer

    arr[3] = 40;
    arr[4] = 50;

    // Print values
    for (int i = 0; i < 5; i++) {
        printf("arr[%d]: %d\\n", i, arr[i]);
    }

    free(arr);  // Free memory
    return 0;
}"""
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
                title = "C Deallocate Memory",
                description = "Learn how to deallocate memory using `free()` and prevent memory leaks in C.",
                subLessons = listOf(
                    Lesson(
                        id = "expert_c7_sub1",
                        title = "Deallocate (Free) Memory",
                        description = "Learn how to use `free()` to release dynamically allocated memory.",
                        status = LessonStatus.LOCKED
                    ),
                    Lesson(
                        id = "expert_c7_sub2",
                        title = "Memory Leaks",
                        description = "Understand the importance of proper memory deallocation to avoid memory leaks.",
                        status = LessonStatus.LOCKED
                    )
                ),
                lessonContents = listOf(
                    LessonContent(
                        id = "expert_c7_sub1",
                        title = "Deallocate (Free) Memory",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("In C, memory that is dynamically allocated using `malloc()`, `calloc()`, or `realloc()` must be manually freed using `free()` when it's no longer needed."),
                            ContentBlock.Text.fromString("Syntax: `free(ptr);`"),
                            ContentBlock.Text.fromString("Always ensure that you deallocate memory after you’re done using it to prevent memory leaks."),
                            ContentBlock.Text.fromString("Example:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Allocating memory
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    for (int i = 0; i < 5; i++) {
        arr[i] = i * 10;  // Initializing array
    }

    // Use memory for operations
    for (int i = 0; i < 5; i++) {
        printf("arr[%d] = %d\\n", i, arr[i]);
    }

    // Free memory when done
    free(arr);  // Deallocating memory
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = "expert_c7_sub2",
                        title = "Memory Leaks",
                        contentBlocks = listOf(
                            ContentBlock.Text.fromString("A memory leak occurs when memory is allocated dynamically but not freed after use, leading to unused memory consuming system resources."),
                            ContentBlock.Text.fromString("Memory leaks can slow down or crash programs, especially when dealing with large amounts of data."),
                            ContentBlock.Text.fromString("To avoid memory leaks, always ensure that every `malloc()`, `calloc()`, or `realloc()` has a corresponding `free()` call."),
                            ContentBlock.Text.fromString("Example of memory leak:"),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(5 * sizeof(int));  // Memory allocated but never freed
    if (arr == NULL) {
        printf("Memory allocation failed\\n");
        return 1;
    }

    // Memory is used, but never freed
    for (int i = 0; i < 5; i++) {
        arr[i] = i * 10;
    }

    // Program exits without freeing memory (memory leak)
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),
            // lesson 8


        )
    )
}