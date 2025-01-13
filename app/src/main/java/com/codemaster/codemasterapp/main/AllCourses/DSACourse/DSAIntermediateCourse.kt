package com.codemaster.codemasterapp.main.AllCourses.DSACourse

import com.codemaster.codemasterapp.main.AllCourses.DSACourse.courseIds.DSAIntermediateStageIds
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
import com.codemaster.codemasterapp.R

fun DSAIntermediateCourse(): Stage {
    return Stage(
        id = DSAIntermediateStageIds.stageId,
        title = "Intermediate",
        lessons = listOf(

            // lesson 1
            Lesson(
                id = DSAIntermediateStageIds.lesson1,
                title = "Welcome to DSA Intermediate",
                description = "Begin your journey into mastering core Data Structures and Algorithms essential for solving complex problems.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[0],
                        title = "Overview",
                        description = "Understand the scope and objectives of this stage.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In this stage, you'll learn fundamental data structures like Linked Lists, Stacks, Queues, and Hash Tables. These concepts are the building blocks of efficient algorithms and problem-solving techniques, forming the backbone of competitive programming and technical interviews."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[1],
                        title = "Stay Inspired",
                        description = "Motivational words to fuel your learning journey.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Every data structure you master opens up new ways to approach problems. Stay consistent and celebrate small wins—each step takes you closer to becoming a skilled problem-solver and an efficient programmer."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[2],
                        title = "Learning Strategies for DSA",
                        description = "Tips to master data structures and algorithms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Break down each data structure into its core operations—creation, insertion, deletion, traversal, and search. Practice implementing these operations from scratch, understand their time complexities, and apply them in solving real-world problems. Regularly revisit topics and challenge yourself with problems of increasing difficulty."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[3],
                        title = "Introduction to Linked Lists",
                        description = "Dive into the fundamentals of Linked Lists.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Linked Lists are a dynamic data structure that stores elements in nodes connected via pointers. Learn how to create, traverse, and manipulate Linked Lists for scenarios where dynamic memory allocation is essential."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[4],
                        title = "Stacks: The LIFO Structure",
                        description = "Learn how stacks work and where they are used.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Stacks operate on the Last In, First Out (LIFO) principle, making them ideal for problems like reversing strings, parsing expressions, and backtracking algorithms. Master the push, pop, and peek operations to efficiently use stacks in problem-solving."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[5],
                        title = "Queues: The FIFO Structure",
                        description = "Understand the structure and applications of Queues.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Queues follow the First In, First Out (FIFO) principle and are widely used in scheduling, buffering, and breadth-first search (BFS) algorithms. Learn how to implement and optimize enqueue and dequeue operations in different types of queues, such as circular and priority queues."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[6],
                        title = "Hash Tables: Efficient Key-Value Storage",
                        description = "Explore Hash Tables and their real-world applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Hash Tables provide efficient key-value storage and retrieval using hash functions. Dive into collision handling techniques like chaining and open addressing, and explore their applications in tasks like caching, indexing, and dictionary implementations."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson1_subs[7],
                        title = "Ready to Begin",
                        description = "Your journey into DSA starts here.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Start with Linked Lists and progress through Stacks, Queues, and Hash Tables. Write code for each data structure, debug your implementations, and practice using them in problem-solving. Build your confidence step by step and keep challenging yourself to think critically and code efficiently."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // lesson 2
            Lesson(
                id = DSAIntermediateStageIds.lesson2,
                title = "Linked Lists",
                description = "Dive into the concept of linked lists, their structure, operations, and how they differ from arrays. 🧩",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson2_subs[0],
                        title = "Introduction to Linked Lists",
                        description = "Learn about the structure and components of linked lists.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A Linked List is a dynamic data structure where each element (called a node) contains data and a pointer to the next node. Unlike arrays, elements in a linked list are not stored contiguously in memory.",
                                    listOf("")
                                )
                            ),
                            //ContentBlock.Image(R.drawable.link_list),
                            ContentBlock.Text(createSimpleText("Key Components:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Data: The actual value or information stored in the node.",
                                    listOf("Data:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointer/Link: A reference to the next node in the sequence.",
                                    listOf("Pointer/Link")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Node {
                        int data;
                        struct Node* next;
                    };
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson2_subs[1],
                        title = "Types of Linked Lists",
                        description = "Understand the different types of linked lists and their use cases.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Linked lists come in various forms depending on how nodes are linked. The three main types are:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Singly Linked List: Each node points to the next node.",
                                    listOf("Singly Linked List:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Singly Linked List
            struct Node {
                int data; // Data stored in the node
                struct Node* next; // Pointer to the next node
            };

            // Example usage:
            struct Node* head = NULL;
            head = (struct Node*)malloc(sizeof(struct Node));
            head->data = 10;
            head->next = NULL; // Points to NULL as it's the last node
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Doubly Linked List: Each node points to both the next and the previous node.",
                                    listOf("Doubly Linked List:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Doubly Linked List
            struct Node {
                int data; // Data stored in the node
                struct Node* next; // Pointer to the next node
                struct Node* prev; // Pointer to the previous node
            };

            // Example usage:
            struct Node* head = NULL;
            head = (struct Node*)malloc(sizeof(struct Node));
            head->data = 10;
            head->next = NULL;
            head->prev = NULL; // Points to NULL as it's the first node
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Circular Linked List: The last node points back to the first node, forming a loop.",
                                    listOf("Circular Linked List:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Circular Linked List
            struct Node {
                int data; // Data stored in the node
                struct Node* next; // Pointer to the next node
            };

            // Example usage:
            struct Node* head = NULL;
            struct Node* temp = NULL;
            head = (struct Node*)malloc(sizeof(struct Node));
            temp = (struct Node*)malloc(sizeof(struct Node));
            
            head->data = 10;
            temp->data = 20;

            head->next = temp;
            temp->next = head; // Last node points back to the first node
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson2_subs[2],
                        title = "Linked Lists vs Arrays",
                        description = "Explore the differences between linked lists and arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Arrays have a fixed size and allow fast random access but are less flexible for resizing. Linked lists dynamically allocate memory, making them better for frequent insertions and deletions but slower to access elements since traversal is required."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson2_subs[3],
                        title = "Basic Operations on Linked Lists",
                        description = "Learn common operations like insertion, deletion, search, and traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Linked lists support several basic operations:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion: Add a node at the beginning, end, or a specific position.",
                                    listOf("Insertion:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion: Remove a node by value or position.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Search: Locate a node with a specific value by traversing the list.",
                                    listOf("Search")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal: Visit each node to access or modify data.",
                                    listOf("Traversal:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson2_subs[4],
                        title = "Advantages and Limitations",
                        description = "Understand why and when to use linked lists.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Advantages:\nDynamic size: No need to define the size beforehand.\nEfficient insertion and deletion.",
                                    listOf("Advantages:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Limitations:\nHigher memory usage (extra pointers).\nSequential access: No direct access to elements.",
                                    listOf("Limitations")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 3
            Lesson(
                id = DSAIntermediateStageIds.lesson3,
                title = "Singly Linked Lists",
                description = "Explore how singly linked lists work in memory and their key characteristics. 📚",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[0],
                        title = "Introduction to Singly Linked Lists",
                        description = "Understand what singly linked lists are and their fundamental structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A singly linked list is a dynamic data structure composed of nodes where:",
                                    listOf("singly linked list")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Each node contains data and a pointer to the next node.",
                                    listOf("data", "pointer")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The first node is called the head, and the last node has a pointer to NULL, indicating the end of the list.",
                                    listOf("head", "NULL")
                                )
                            ),
                            ContentBlock.Code(
                                """
            struct Node {
                int data;           // Data in the node
                Node* next;         // Pointer to the next node
            };

            // Example: A singly linked list with three nodes
            // Node 1 -> Node 2 -> Node 3 -> NULL
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[1],
                        title = "Manual Walkthrough: Creation and Traversal",
                        description = "Manually create and traverse a singly linked list.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating and traversing a singly linked list step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure that holds data and a pointer to the next node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by assigning the 'next' pointer of one node to the address of the next node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Traverse the list starting from the head. Print the data of each node until you reach the end of the list (where 'next' is 'NULL').")),

                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Text(createSimpleText("1 -> 2 -> 3 -> NULL")),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how nodes are linked and traversed to represent a dynamic list structure."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[2],
                        title = "Operations on Singly Linked Lists",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:\n" +
                                            "Adding a new node at the end of the list involves traversing to the last node and updating its 'next' pointer.",
                                    listOf("Insertion:", "next")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void insertAtEnd(Node*& head, int value) {
                        Node* newNode = new Node{value, nullptr};
                        if (head == nullptr) {
                            head = newNode;
                            return;
                        }
                        Node* current = head;
                        while (current->next != nullptr) {
                            current = current->next;
                        }
                        current->next = newNode;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:\n" +
                                            "Deleting a node involves finding the node to be removed and updating the pointer of the previous node.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void deleteByValue(Node*& head, int value) {
                        if (head == nullptr) return;
                        if (head->data == value) {
                            Node* temp = head;
                            head = head->next;
                            delete temp;
                            return;
                        }
                        Node* current = head;
                        while (current->next != nullptr && current->next->data != value) {
                            current = current->next;
                        }
                        if (current->next == nullptr) return;
                        Node* temp = current->next;
                        current->next = current->next->next;
                        delete temp;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal and Searching:\n" +
                                            "Traversal involves visiting all nodes sequentially to search or display data.",
                                    listOf("Traversal and Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void traverse(Node* head) {
                        Node* current = head;
                        while (current != nullptr) {
                            cout << current->data << " -> ";
                            current = current->next;
                        }
                        cout << "NULL" << endl;
                    }
                    
                    bool search(Node* head, int value) {
                        Node* current = head;
                        while (current != nullptr) {
                            if (current->data == value) return true;
                            current = current->next;
                        }
                        return false;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[3],
                        title = "How Singly Linked List Operations Work",
                        description = "Detailed step-by-step breakdown of insertion, deletion, traversal, and searching operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on singly linked lists step-by-step to understand their mechanics."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion at the End:",
                                    listOf("Insertion at the End")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head of the list.
                2. Traverse to the last node where 'next' is NULL.
                3. Create a new node and set its 'next' to NULL.
                4. Update the 'next' of the last node to point to the new node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion by Value:",
                                    listOf("Deletion by Value")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the head node contains the value.
                2. If yes, update the head to the next node and delete the original head.
                3. If not, traverse the list to find the node containing the value.
                4. Update the 'next' of the previous node to skip the node being deleted.
                5. Free the memory of the deleted node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:",
                                    listOf("Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head node.
                2. Print the data of the current node.
                3. Move to the next node.
                4. Repeat until 'next' is NULL.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Searching:",
                                    listOf("Searching")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head node.
                2. Compare the data of the current node with the target value.
                3. If found, return true.
                4. If not, move to the next node.
                5. Repeat until 'next' is NULL or the value is found.
                """.trimIndent()
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[4],
                        title = " How to display Singly Linked Lists",
                        description = "Understand the basics of singly linked lists and how to display them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("A singly linked list has nodes with data and a next pointer to the next node or NULL.")
                            ),
                            ContentBlock.Text(
                                createSimpleText("To display, start at the head and print each node until NULL.")
                            ),
                            ContentBlock.Code(
                                """
            void display(Node* head) {
                while (head != nullptr) {
                    cout << head->data << " -> ";
                    head = head->next;
                }
                cout << "NULL";
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[5],
                        title = "Importance of Singly Linked Lists",
                        description = "Understand why singly linked lists are important and their applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Singly linked lists are a fundamental data structure that allow dynamic memory management and efficient insertions and deletions compared to arrays. They are widely used in real-world applications such as implementing stacks, queues, adjacency lists for graph representations, and memory-efficient dynamic systems. Their simplicity and adaptability make them essential for solving complex problems in data structures and algorithms.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 4
            Lesson(
                id = DSAIntermediateStageIds.lesson4,
                title = "Doubly Linked Lists",
                description = "Explore how doubly linked lists work in memory and their key characteristics. 📚",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson4_subs[0],
                        title = "Introduction to Doubly Linked Lists",
                        description = "Understand what doubly linked lists are and their fundamental structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A doubly linked list is a dynamic data structure composed of nodes where:",
                                    listOf("doubly linked list")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Each node contains data, a pointer to the next node, and a pointer to the previous node.",
                                    listOf("data", "next", "previous")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The first node (head) has its 'previous' pointer set to NULL, and the last node (tail) has its 'next' pointer set to NULL.",
                                    listOf("head", "tail", "NULL")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Node {
                        int data;           // Data in the node
                        Node* next;         // Pointer to the next node
                        Node* prev;         // Pointer to the previous node
                    };

                    // Example: A doubly linked list with three nodes
                    // NULL <- Node 1 <-> Node 2 <-> Node 3 -> NULL
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson4_subs[1],
                        title = "Manual Walkthrough: Creation and Traversal",
                        description = "Manually create and traverse a doubly linked list.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating and traversing a doubly linked list step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure with data, 'next', and 'prev' pointers.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by updating the 'next' and 'prev' pointers to establish two-way connections.")),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4:"))),
                            ContentBlock.Text(createSimpleText("Traverse the list starting from the head, moving forward using 'next' pointers, or backward from the tail using 'prev' pointers.")),

                            ContentBlock.Text(createSimpleText("Example: Forward Traversal")),
                            ContentBlock.Text(createSimpleText("1 <-> 2 <-> 3 -> NULL")),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how nodes are linked and traversed in both directions for a dynamic list structure."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson4_subs[2],
                        title = "Operations on Doubly Linked Lists",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:\n" +
                                            "Adding a new node involves updating both 'next' and 'prev' pointers to maintain bidirectional links.",
                                    listOf("Insertion:", "next", "prev")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void insertAtEnd(Node*& head, int value) {
                        Node* newNode = new Node{value, nullptr, nullptr};
                        if (head == nullptr) {
                            head = newNode;
                            return;
                        }
                        Node* current = head;
                        while (current->next != nullptr) {
                            current = current->next;
                        }
                        current->next = newNode;
                        newNode->prev = current;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:\n" +
                                            "Deleting a node involves updating the 'next' pointer of the previous node and the 'prev' pointer of the next node.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void deleteByValue(Node*& head, int value) {
                        if (head == nullptr) return;
                        if (head->data == value) {
                            Node* temp = head;
                            head = head->next;
                            if (head != nullptr) head->prev = nullptr;
                            delete temp;
                            return;
                        }
                        Node* current = head;
                        while (current != nullptr && current->data != value) {
                            current = current->next;
                        }
                        if (current == nullptr) return;
                        current->prev->next = current->next;
                        if (current->next != nullptr) current->next->prev = current->prev;
                        delete current;
                    }
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal and Searching:\n" +
                                            "Traversal involves visiting nodes in both forward and backward directions to search or display data.",
                                    listOf("Traversal and Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void forwardTraverse(Node* head) {
                        Node* current = head;
                        while (current != nullptr) {
                            cout << current->data << " <-> ";
                            current = current->next;
                        }
                        cout << "NULL" << endl;
                    }
                    
                    void backwardTraverse(Node* tail) {
                        Node* current = tail;
                        while (current != nullptr) {
                            cout << current->data << " <-> ";
                            current = current->prev;
                        }
                        cout << "NULL" << endl;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson4_subs[3],
                        title = "How Doubly Linked List Operations Work",
                        description = "Detailed step-by-step breakdown of insertion, deletion, traversal, and searching operations in doubly linked lists.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on doubly linked lists step-by-step to understand their mechanics."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion at the End:",
                                    listOf("Insertion at the End")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head of the list.
                2. Traverse to the last node where 'next' is NULL.
                3. Create a new node, set its 'next' to NULL, and 'prev' to the last node.
                4. Update the 'next' of the last node to point to the new node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion by Value:",
                                    listOf("Deletion by Value")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the head node contains the value.
                2. If yes, update the head to the next node, set its 'prev' to NULL, and delete the original head.
                3. If not, traverse the list to find the node containing the value.
                4. Update the 'next' of the previous node and the 'prev' of the next node to skip the node being deleted.
                5. Free the memory of the deleted node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:",
                                    listOf("Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head node.
                2. Print the data of the current node.
                3. Move to the next node using 'next'.
                4. Repeat until 'next' is NULL.
                5. Optionally, traverse backward using 'prev' from the last node to the head.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Searching:",
                                    listOf("Searching")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head node.
                2. Compare the data of the current node with the target value.
                3. If found, return true.
                4. If not, move to the next node using 'next'.
                5. Repeat until 'next' is NULL or the value is found.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson3_subs[4],
                        title = "How to Display Doubly Linked Lists",
                        description = "Understand the basics of doubly linked lists and how to display them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "A doubly linked list has nodes with data, a 'next' pointer to the next node, and a 'prev' pointer to the previous node."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "To display, you can start at the head and traverse using the 'next' pointer until NULL. Optionally, you can traverse backward from the tail using the 'prev' pointer."
                                )
                            ),
                            ContentBlock.Code(
                                """
            void displayForward(Node* head) {
                while (head != nullptr) {
                    cout << head->data << " <-> ";
                    head = head->next;
                }
                cout << "NULL";
            }

            void displayBackward(Node* tail) {
                while (tail != nullptr) {
                    cout << tail->data << " <-> ";
                    tail = tail->prev;
                }
                cout << "NULL";
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = DSAIntermediateStageIds.lesson4_subs[5],
                        title = "Importance of Doubly Linked Lists",
                        description = "Understand why doubly linked lists are important and their applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Doubly linked lists offer improved flexibility over singly linked lists by enabling bidirectional traversal. They are widely used in real-world applications such as implementing navigation systems (e.g., web browsers' forward and back buttons), memory management, and as building blocks for advanced data structures like trees and graphs. Their ability to insert or delete nodes efficiently in both directions makes them invaluable for many algorithms.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 5
            Lesson(
                id = DSAIntermediateStageIds.lesson5,
                title = "Doubly Linked Lists",
                description = "Explore how doubly linked lists work in memory and their key characteristics. 📚",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson5_subs[0],
                        title = "Introduction to Circular Linked Lists",
                        description = "Understand what circular linked lists are and their fundamental structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A circular linked list is a dynamic data structure composed of nodes where:",
                                    listOf("circular linked list")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Each node contains data and a pointer to the next node. Unlike linear linked lists, the last node points back to the head, forming a circle.",
                                    listOf("data", "next", "head", "circle")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In a circular linked list, there is no NULL at the end. Traversal can continue infinitely unless explicitly stopped.",
                                    listOf("circular linked list", "NULL")
                                )
                            ),
                            ContentBlock.Code(
                                """
                struct Node {
                    int data;       // Data in the node
                    Node* next;     // Pointer to the next node
                };

                // Example: A circular linked list with three nodes
                // Node 1 -> Node 2 -> Node 3 -> back to Node 1
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson5_subs[1],
                        title = "Manual Walkthrough: Creation and Traversal",
                        description = "Manually create and traverse a circular linked list.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating and traversing a circular linked list step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure with data and a 'next' pointer.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by updating the 'next' pointers. The 'next' pointer of the last node should point to the head node to form a circular structure.")),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4:"))),
                            ContentBlock.Text(createSimpleText("Traverse the list starting from the head. Continue moving through the 'next' pointers until you return to the head node.")),

                            ContentBlock.Text(createSimpleText("Example: Traversal in a Circular Linked List")),
                            ContentBlock.Text(createSimpleText("1 -> 2 -> 3 -> back to 1")),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how nodes are linked in a circular manner and how to traverse the list without encountering NULL."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson5_subs[2],
                        title = "Operations on Circular Linked Lists",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:\n" +
                                            "Adding a new node involves updating the 'next' pointers to form a circular structure.",
                                    listOf("Insertion:", "next")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void insertAtEnd(Node*& head, int value) {
                Node* newNode = new Node{value, nullptr};
                if (head == nullptr) {
                    head = newNode;
                    head->next = head; // Circular link
                    return;
                }
                Node* current = head;
                while (current->next != head) { // Traverse until the last node
                    current = current->next;
                }
                current->next = newNode;
                newNode->next = head; // Complete the circular link
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:\n" +
                                            "Deleting a node involves updating the 'next' pointer of the previous node to maintain the circular structure.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void deleteByValue(Node*& head, int value) {
                if (head == nullptr) return;
                if (head->data == value && head->next == head) {
                    delete head;
                    head = nullptr;
                    return;
                }
                Node* current = head;
                Node* prev = nullptr;
                do {
                    if (current->data == value) {
                        if (prev != nullptr) prev->next = current->next;
                        else {
                            // Deleting the head node
                            Node* temp = head;
                            while (current->next != head) current = current->next;
                            head = head->next;
                            current->next = head;
                            delete temp;
                            return;
                        }
                        delete current;
                        return;
                    }
                    prev = current;
                    current = current->next;
                } while (current != head);
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal and Searching:\n" +
                                            "Traversal involves visiting all nodes by following the 'next' pointers until returning to the head node.",
                                    listOf("Traversal and Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void traverse(Node* head) {
                if (head == nullptr) return;
                Node* current = head;
                do {
                    cout << current->data << " -> ";
                    current = current->next;
                } while (current != head);
                cout << "back to head" << endl;
            }
            
            bool search(Node* head, int value) {
                if (head == nullptr) return false;
                Node* current = head;
                do {
                    if (current->data == value) return true;
                    current = current->next;
                } while (current != head);
                return false;
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson5_subs[3],
                        title = "How Circular Linked List Operations Work",
                        description = "Detailed step-by-step breakdown of insertion, deletion, traversal, and searching operations in circular linked lists.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on circular linked lists step-by-step to understand their mechanics."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion at the End:",
                                    listOf("Insertion at the End")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head of the list.
                2. Traverse to the last node where 'next' points back to the head.
                3. Create a new node, set its 'next' to point to the head.
                4. Update the 'next' of the last node to point to the new node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion by Value:",
                                    listOf("Deletion by Value")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the head node contains the value.
                2. If yes and it's the only node, delete the node and set the head to NULL.
                3. If yes and there are more nodes, update the last node's 'next' to point to the next node, set the head to the next node, and delete the original head.
                4. If not, traverse the list to find the node containing the value.
                5. Update the 'next' of the previous node to skip the node being deleted.
                6. Free the memory of the deleted node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:",
                                    listOf("Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head node.
                2. Print the data of the current node.
                3. Move to the next node using 'next'.
                4. Repeat until you reach the head node again.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Searching:",
                                    listOf("Searching")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the head node.
                2. Compare the data of the current node with the target value.
                3. If found, return true.
                4. If not, move to the next node using 'next'.
                5. Repeat until you return to the head node or find the value.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson5_subs[4],
                        title = "How to Display Circular Linked Lists",
                        description = "Understand the basics of circular linked lists and how to display them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "A circular linked list has nodes with data and a 'next' pointer that connects to the next node. The last node's 'next' pointer links back to the head node, forming a circular structure."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "To display, you can start at the head and traverse using the 'next' pointer until you return to the head node, ensuring you don't fall into an infinite loop."
                                )
                            ),
                            ContentBlock.Code(
                                """
            void displayCircularList(Node* head) {
                if (head == nullptr) {
                    cout << "List is empty";
                    return;
                }
                Node* current = head;
                do {
                    cout << current->data << " -> ";
                    current = current->next;
                } while (current != head);
                cout << "(head)";
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson5_subs[5],
                        title = "Importance of Circular Linked Lists",
                        description = "Understand why circular linked lists are important and their applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Circular linked lists provide a seamless way to manage data where the end connects back to the start. This circular structure is ideal for scenarios requiring continuous traversal without reaching a null end, such as implementing task schedulers, managing buffers in real-time systems (e.g., multimedia streaming), or creating round-robin algorithms for resource allocation. The circular nature eliminates the need to reset pointers manually, improving efficiency and flexibility.",
                                    listOf("")
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
                id = DSAIntermediateStageIds.lesson6,
                title = "Stacks",
                description = "Dive into the world of stacks, understanding their properties, operations, and practical applications. 📚",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[0],
                        title = "Introduction to Stacks",
                        description = "Understand what stacks are and their fundamental structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A stack is a linear data structure that operates on the principle of Last In, First Out (LIFO):",
                                    listOf("stack", "linear data structure", "LIFO")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In a stack, elements are added (pushed) and removed (popped) only from the top. Think of a stack of plates where the top plate is always accessed first.",
                                    listOf("pushed", "popped", "top", "stack of plates")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Stack {
                        int arr[MAX_SIZE];   // Array to hold stack elements
                        int top;             // Index of the top element
                    };
                    
                    // Example: Stack operations
                    Stack s;
                    s.top = -1; // Initialize stack
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[1],
                        title = "Manual Walkthrough: Creation and Operations",
                        description = "Manually create and perform basic operations on a stack.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating and performing basic operations on a stack step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1:"))),
                            ContentBlock.Text(createSimpleText("Define a stack structure using an array or a linked list to store elements. Include a variable (e.g., 'top') to track the topmost element.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2:"))),
                            ContentBlock.Text(createSimpleText("Initialize the stack by setting the 'top' variable to -1 (for array-based implementation) or NULL (for linked list-based implementation).")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3:"))),
                            ContentBlock.Text(createSimpleText("Implement the Push operation to add an element to the top of the stack. For an array, increment 'top' and assign the new value. For a linked list, create a new node and update pointers.")),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4:"))),
                            ContentBlock.Text(createSimpleText("Implement the Pop operation to remove the top element. For an array, access the element at 'top' and decrement 'top'. For a linked list, remove the node at the top and update the head pointer.")),

                            ContentBlock.Text(createAnnotatedText("Step 5:", listOf("Step 5:"))),
                            ContentBlock.Text(createSimpleText("Implement the Peek operation to view the top element without removing it. Access the element at 'top' for an array or the head node for a linked list.")),

                            ContentBlock.Text(createAnnotatedText("Example: Operations on a Stack", listOf("Operations on a Stack"))),
                            ContentBlock.Code("""
            // Array-based stack implementation
            struct Stack {
                int arr[100];
                int top = -1;
            };

            void push(Stack& s, int value) {
                if (s.top == 99) {
                    cout << "Stack Overflow";
                    return;
                }
                s.arr[++s.top] = value;
            }

            int pop(Stack& s) {
                if (s.top == -1) {
                    cout << "Stack Underflow";
                    return -1;
                }
                return s.arr[s.top--];
            }

            int peek(const Stack& s) {
                if (s.top == -1) {
                    cout << "Stack is empty";
                    return -1;
                }
                return s.arr[s.top];
            }
        """.trimIndent()),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how elements are pushed, popped, and accessed in a stack using simple operations.")),

                            ContentBlock.Text(createAnnotatedText("Key Points to Remember:", listOf("Key Points"))),
                            ContentBlock.Text(createSimpleText("""
            1. A stack operates on the LIFO (Last In, First Out) principle.
            2. Push adds an element to the top.
            3. Pop removes the top element.
            4. Peek retrieves the top element without removing it.
        """.trimIndent()))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[2],
                        title = "Operations on Stack",
                        description = "Learn how to perform basic operations like Push, Pop, Peek, and Traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Push Operation:\n" +
                                            "Adding a new element to the top of the stack involves updating the 'top' pointer.",
                                    listOf("Push Operation:", "top")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void push(Stack& s, int value) {
                if (s.top == MAX_SIZE - 1) { // Stack overflow
                    cout << "Stack Overflow" << endl;
                    return;
                }
                s.arr[++s.top] = value; // Increment top and add value
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pop Operation:\n" +
                                            "Removing the top element involves accessing and decrementing the 'top' pointer.",
                                    listOf("Pop Operation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            int pop(Stack& s) {
                if (s.top == -1) { // Stack underflow
                    cout << "Stack Underflow" << endl;
                    return -1;
                }
                return s.arr[s.top--]; // Access and decrement top
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Peek Operation:\n" +
                                            "Retrieving the top element without removing it involves accessing the 'top' pointer.",
                                    listOf("Peek Operation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            int peek(const Stack& s) {
                if (s.top == -1) { // Stack is empty
                    cout << "Stack is empty" << endl;
                    return -1;
                }
                return s.arr[s.top]; // Access top
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:\n" +
                                            "Iterating over the stack involves visiting each element from the bottom to the top.",
                                    listOf("Traversal:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void traverse(const Stack& s) {
                if (s.top == -1) { // Stack is empty
                    cout << "Stack is empty" << endl;
                    return;
                }
                for (int i = 0; i <= s.top; ++i) {
                    cout << s.arr[i] << " ";
                }
                cout << endl;
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[3],
                        title = "How Stack Operations Work",
                        description = "Detailed step-by-step breakdown of Push, Pop, Peek, and Traversal operations in a stack.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on stacks step-by-step to understand their mechanics."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Push Operation:",
                                    listOf("Push Operation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the stack is full (overflow condition).
                2. If not full, increment the 'top' pointer.
                3. Insert the new element at the position pointed to by 'top'.
                4. Operation complete.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pop Operation:",
                                    listOf("Pop Operation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the stack is empty (underflow condition).
                2. If not empty, retrieve the element at the position pointed to by 'top'.
                3. Decrement the 'top' pointer to remove the element from the stack.
                4. Return the retrieved element.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Peek Operation:",
                                    listOf("Peek Operation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the stack is empty.
                2. If not empty, return the element at the position pointed to by 'top' without modifying the stack.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:",
                                    listOf("Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start from the bottom of the stack (index 0).
                2. Iterate through each element up to the 'top' pointer.
                3. Print each element during the traversal.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[4],
                        title = "How to Display Stacks",
                        description = "Understand how to display elements in a stack.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "To display a stack, iterate from the 'top' index to 0, printing each element. This way, the last added element is displayed first."
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void displayStack(Stack& s) {
                        if (s.top == -1) {
                            cout << "Stack is empty";
                            return;
                        }
                        for (int i = s.top; i >= 0; --i) {
                            cout << s.arr[i] << " ";
                        }
                        cout << endl;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[5],
                        title = "Importance of Stacks",
                        description = "Understand the significance of stacks and their role in computer science.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Stacks are fundamental to many algorithms and processes in computer science. Their LIFO nature is essential in tasks like function call management, expression evaluation, and backtracking algorithms. They enable efficient memory usage and provide simple yet powerful data management for linear tasks.",
                                    listOf("")
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
                id = DSAIntermediateStageIds.lesson7,
                title = "Queues",
                description = "Dive into the world of queues, understanding their properties, operations, and practical applications. 📚",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[0],
                        title = "Introduction to Queues",
                        description = "Understand what queues are and their fundamental structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A queue is a linear data structure that operates on the principle of First In, First Out (FIFO):",
                                    listOf("queue", "linear data structure", "FIFO")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In a queue, elements are added (enqueued) at the rear and removed (dequeued) from the front. Think of a line of people waiting to get into a movie theater where the first person in line is served first.",
                                    listOf("enqueued", "dequeued", "rear", "front", "line of people")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Queue {
                        int arr[MAX_SIZE];   // Array to hold queue elements
                        int front;           // Index of the front element
                        int rear;            // Index of the rear element
                    };
                    
                    // Example: Queue initialization
                    Queue q;
                    q.front = -1; // Initialize queue
                    q.rear = -1;
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[1],
                        title = "Manual Walkthrough: Creation and Operations",
                        description = "Manually create and perform basic operations on a queue.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating and performing basic operations on a queue step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1:"))),
                            ContentBlock.Text(createSimpleText("Define a queue structure using an array or a linked list to store elements. Include variables (e.g., 'front' and 'rear') to track the start and end of the queue.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2:"))),
                            ContentBlock.Text(createSimpleText("Initialize the queue by setting 'front' and 'rear' to -1 (for array-based implementation) or NULL (for linked list-based implementation).")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3:"))),
                            ContentBlock.Text(createSimpleText("Implement the Enqueue operation to add an element to the rear of the queue. For an array, increment 'rear' and assign the new value. For a linked list, create a new node and update pointers.")),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4:"))),
                            ContentBlock.Text(createSimpleText("Implement the Dequeue operation to remove the front element. For an array, access the element at 'front' and increment 'front'. For a linked list, remove the front node and update the head pointer.")),

                            ContentBlock.Text(createAnnotatedText("Step 5:", listOf("Step 5:"))),
                            ContentBlock.Text(createSimpleText("Implement the Peek operation to view the front element without removing it. Access the element at 'front' for an array or the head node for a linked list.")),

                            ContentBlock.Text(createAnnotatedText("Example: Operations on a Queue", listOf("Operations on a Queue"))),
                            ContentBlock.Code("""
            // Array-based queue implementation
            struct Queue {
                int arr[100];
                int front = -1, rear = -1;
            };

            void enqueue(Queue& q, int value) {
                if (q.rear == 99) {
                    cout << "Queue Overflow";
                    return;
                }
                if (q.front == -1) q.front = 0; // Initialize front if first element is added
                q.arr[++q.rear] = value;
            }

            int dequeue(Queue& q) {
                if (q.front == -1 || q.front > q.rear) {
                    cout << "Queue Underflow";
                    return -1;
                }
                return q.arr[q.front++];
            }

            int peek(const Queue& q) {
                if (q.front == -1 || q.front > q.rear) {
                    cout << "Queue is empty";
                    return -1;
                }
                return q.arr[q.front];
            }
        """.trimIndent()),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how elements are enqueued, dequeued, and accessed in a queue using simple operations.")),

                            ContentBlock.Text(createAnnotatedText("Key Points to Remember:", listOf("Key Points"))),
                            ContentBlock.Text(createSimpleText("""
            1. A queue operates on the FIFO (First In, First Out) principle.
            2. Enqueue adds an element to the rear.
            3. Dequeue removes the front element.
            4. Peek retrieves the front element without removing it.
        """.trimIndent()))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[2],
                        title = "Operations on Queue",
                        description = "Learn how to perform basic operations like Enqueue, Dequeue, Peek, and Traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enqueue Operation:\n" +
                                            "Adding a new element to the rear of the queue involves updating the 'rear' pointer.",
                                    listOf("Enqueue Operation:", "rear")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void enqueue(Queue& q, int value) {
                if (q.rear == MAX_SIZE - 1) { // Queue overflow
                    cout << "Queue Overflow" << endl;
                    return;
                }
                if (q.front == -1) q.front = 0; // Initialize front if first element
                q.arr[++q.rear] = value; // Increment rear and add value
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Dequeue Operation:\n" +
                                            "Removing the front element involves accessing and incrementing the 'front' pointer.",
                                    listOf("Dequeue Operation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            int dequeue(Queue& q) {
                if (q.front == -1 || q.front > q.rear) { // Queue underflow
                    cout << "Queue Underflow" << endl;
                    return -1;
                }
                return q.arr[q.front++]; // Access and increment front
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Peek Operation:\n" +
                                            "Retrieving the front element without removing it involves accessing the 'front' pointer.",
                                    listOf("Peek Operation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            int peek(const Queue& q) {
                if (q.front == -1 || q.front > q.rear) { // Queue is empty
                    cout << "Queue is empty" << endl;
                    return -1;
                }
                return q.arr[q.front]; // Access front
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:\n" +
                                            "Iterating over the queue involves visiting each element from the front to the rear.",
                                    listOf("Traversal:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void traverse(const Queue& q) {
                if (q.front == -1 || q.front > q.rear) { // Queue is empty
                    cout << "Queue is empty" << endl;
                    return;
                }
                for (int i = q.front; i <= q.rear; ++i) {
                    cout << q.arr[i] << " ";
                }
                cout << endl;
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[3],
                        title = "How Queue Operations Work",
                        description = "Detailed step-by-step breakdown of Enqueue, Dequeue, Peek, and Traversal operations in a queue.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on queues step-by-step to understand their mechanics."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enqueue Operation:",
                                    listOf("Enqueue Operation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the queue is full (overflow condition).
                2. If not full, increment the 'rear' pointer.
                3. Insert the new element at the position pointed to by 'rear'.
                4. If the queue was previously empty, initialize the 'front' pointer to the first element.
                5. Operation complete.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Dequeue Operation:",
                                    listOf("Dequeue Operation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the queue is empty (underflow condition).
                2. If not empty, retrieve the element at the position pointed to by 'front'.
                3. Increment the 'front' pointer to remove the element from the queue.
                4. If the queue becomes empty, reset 'front' and 'rear' pointers to -1.
                5. Return the retrieved element.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Peek Operation:",
                                    listOf("Peek Operation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Check if the queue is empty.
                2. If not empty, return the element at the position pointed to by 'front' without modifying the queue.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal:",
                                    listOf("Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start from the 'front' pointer.
                2. Iterate through each element up to the 'rear' pointer.
                3. Print each element during the traversal.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[4],
                        title = "How to Display Queues",
                        description = "Understand how to display elements in a queue.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "To display a queue, iterate from the 'front' index to the 'rear' index, printing each element in order. This way, elements are displayed in the order they were added."
                                )
                            ),
                            ContentBlock.Code(
                                """
            void displayQueue(Queue& q) {
                if (q.front == -1 || q.front > q.rear) {
                    cout << "Queue is empty";
                    return;
                }
                for (int i = q.front; i <= q.rear; ++i) {
                    cout << q.arr[i] << " ";
                }
                cout << endl;
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[5],
                        title = "Importance of Queues",
                        description = "Understand the significance of queues and their role in computer science.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                Queues are fundamental to many algorithms and processes in computer science. Their FIFO nature is essential in tasks like task scheduling, resource management, and breadth-first search (BFS) algorithms. They provide efficient data handling for linear tasks where order is crucial, such as print job management and process scheduling in operating systems.
                """.trimIndent(),
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )

                ),
                status = LessonStatus.LOCKED
            ),
            // continue to add here


        )
    )
}