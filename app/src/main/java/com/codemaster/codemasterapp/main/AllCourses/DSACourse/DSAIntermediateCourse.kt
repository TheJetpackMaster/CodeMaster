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
                        id = DSAIntermediateStageIds.lesson5_subs[1],
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
                        id = DSAIntermediateStageIds.lesson5_subs[2],
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
                        id = DSAIntermediateStageIds.lesson5_subs[3],
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
                        id = DSAIntermediateStageIds.lesson5_subs[4],
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
                        id = DSAIntermediateStageIds.lesson5_subs[5],
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

            // lesson 6
            Lesson(
                id = DSAIntermediateStageIds.lesson6,
                title = "C Nested Loops",
                description = "Learn how to use nested loops in C for complex tasks and control flows! 🔄🔄",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[0],
                        title = "Nested For Loops",
                        description = "Learn how to use a for loop inside another for loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nested for loops involve an outer loop iterating through elements, and an inner loop iterating through a subset of elements, allowing for multi-level iteration over a collection or data structure.",
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """
for (int i = 0; i < tables; i++) {
    for (int j = 0; j < seats; j++) {
        // Perform action for seat at table
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[1],
                        title = "Nested While Loops",
                        description = "Learn how to use a while loop inside another while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Nested while loops involve an outer loop controlling the higher-level iteration, and an inner loop performing repetitive tasks for each iteration of the outer loop, allowing for multi-level iteration and task execution.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """
while (level < maxLevel) {
    while (task < maxTasks) {
        // Perform action for task in level
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[2],
                        title = "For in While Loops",
                        description = "Learn how to nest a for loop inside a while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A while loop executes as long as a condition is true, whereas a for loop iterates a fixed number of times. The while loop is used for indefinite iteration, while the for loop is used for definite iteration, like incrementing a counter or iterating over a range.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf())),
                            ContentBlock.Code(
                                """
while (gameOn) {
    for (int i = 0; i < players; i++) {
        // Update score for player
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[3],
                        title = "While in For Loops",
                        description = "Learn how to nest a while loop inside a for loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A for loop iterates over a collection or range, while a while loop continues execution as long as a condition is true. The for loop handles predefined iterations, and the while loop manages ongoing conditions within each iteration.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf())),
                            ContentBlock.Code(
                                """
for (int i = 0; i < rooms; i++) {
    while (notClean) {
        // Clean the room
    }
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[4],
                        title = "Nested Do-While Loops",
                        description = "Learn how to use a do-while loop inside another do-while loop.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Do-while loops guarantee that a block of code runs at least once, as the condition is checked after the first iteration. It ensures the task executes before the condition is evaluated for further iterations.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf())),
                            ContentBlock.Code(
                                """
do {
    do {
        // Perform action
    } while (innerCondition);
} while (outerCondition);
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[5],
                        title = "Real-Life Examples",
                        description = "See practical examples of nested loops in action.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Practical applications of nested loops include:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Nested for loops: Serve dishes to every table at a banquet.",
                                    listOf("Nested for loops")
                                )
                            ),
                            ContentBlock.Code(
                                """
for (int i = 0; i < tables; i++) {
    for (int j = 0; j < dishes; j++) {
        // Serve dish to table
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Nested while loops: Park cars in a multi-floor garage.",
                                    listOf("Nested while loops")
                                )
                            ),
                            ContentBlock.Code(
                                """
int floor = 0;
while (floor < totalFloors) {
    int spot = 0;
    while (spot < spotsPerFloor) {
        // Park car in spot
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.For in while loop: Manage tasks for multiple projects.",
                                    listOf("For", "while loop")
                                )
                            ),
                            ContentBlock.Code(
                                """
int project = 0;
while (project < totalProjects) {
    for (int task = 0; task < tasksPerProject; task++) {
        // Complete task for project
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "4.While in for loop: Fill boxes with items until they're full.",
                                    listOf("While", "for loop")
                                )
                            ),
                            ContentBlock.Code(
                                """
for (int box = 0; box < totalBoxes; box++) {
    while (notFull) {
        // Add item to box
    }
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "5.Nested do-while loops: Clean each table in a café.",
                                    listOf("Nested do-while loops")
                                )
                            ),
                            ContentBlock.Code(
                                """
int table = 0;
do {
    int chair = 0;
    do {
        // Clean chair
    } while (chair < chairsPerTable);
    table++;
} while (table < totalTables);
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson6_subs[6],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why would you use nested loops in programming?",
                                options = listOf(
                                    "To handle multiple levels of iteration where each level performs a task within the other.",
                                    "To avoid the need for conditions in loops.",
                                    "To improve the performance of a single loop.",
                                    "To simplify the logic of a single loop."
                                ),
                                correctAnswer = "To handle multiple levels of iteration where each level performs a task within the other."
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    )

                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 7
            Lesson(
                id = DSAIntermediateStageIds.lesson7,
                title = "C Break and Continue",
                description = "Master the break and continue statements to control loop flow in C! 🛑➡️",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[0],
                        title = "Basic Break Statement",
                        description = "Learn the simple use of the break statement in loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The break statement terminates the current loop or switch statement, similar to exiting a loop early when a certain condition is met, such as encountering a specific case.",
                                    listOf("break")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
while (isPartyOn) {
    if (bossStartsDancing) {
        break;  // Leave the party (exit loop) right away
    }
    enjoySnacks();
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[1],
                        title = "Basic Continue Statement",
                        description = "Understand the basic usage of continue to skip loop iterations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The continue statement skips the current iteration of a loop and moves to the next iteration, similar to skipping a step in a sequence when a condition is met.",
                                    listOf("continue")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
for (int dish = 0; dish < buffetSize; dish++) {
    if (dish == spicyCurry) {
        continue;  // Skip the spicy curry and go to the next dish
    }
    eat(dish);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[2],
                        title = "Break in Nested Loops",
                        description = "Learn how to use break in nested loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In nested loops, the break statement terminates the innermost loop, similar to exiting a loop when a specific condition is met, such as finding the target element.",
                                    listOf("break")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
for (int section = 0; section < 5; section++) {
    for (int spot = 0; spot < 10; spot++) {
        if (foundKey(section, spot)) {
            break;  // Stop searching this section
        }
    }
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[3],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct statement to exit the current loop and stop further iterations in a nested loop?",
                                incompleteCode = """
                for (int section = 0; section < 5; section++) {
                    for (int spot = 0; spot < 10; spot++) {
                        if (foundKey(section, spot)) {
                            ___;  // What statement should go here to exit the loop?
                        }
                    }
                }
            """.trimIndent(),
                                correctCode = "break", // The correct code to complete the missing part
                                userInput = null, // Placeholder for user input
                                isCodeCorrect = false // Initially set to false, can be updated based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[4],
                        title = "Continue in Nested Loops",
                        description = "See how to use continue in nested loops to skip iterations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In nested loops, the continue statement skips the current iteration of the innermost loop and proceeds to the next iteration, similar to skipping a condition and continuing the loop.",
                                    listOf("continue")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
for (int street = 0; street < 5; street++) {
    for (int house = 0; house < 10; house++) {
        if (isNoisyHouse(street, house)) {
            continue;  // Skip noisy house and move to next
        }
        collectCandy(house);
    }
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[5],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What statement should go inside the loop to skip the noisy house and continue to the next one?",
                                incompleteCode = """
                for (int street = 0; street < 5; street++) {
                    for (int house = 0; house < 10; house++) {
                        if (isNoisyHouse(street, house)) {
                            ___;  // What statement should go here to skip the noisy house?
                        }
                        collectCandy(house);
                    }
                }
            """.trimIndent(),
                                correctCode = "continue", // The correct code to complete the missing part
                                userInput = null, // Placeholder for user input
                                isCodeCorrect = false // Initially set to false, can be updated based on user input
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[6],
                        title = "Real-Life Examples",
                        description = "Check out practical examples of break and continue in loops.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you're in a zombie apocalypse. Use break to escape when you find a safe house and continue to skip areas full of zombies.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """ 
while (true) {
    if (isSafeHouseFound()) {
        break;  // Escape to the safe house
    }
    moveToNextLocation();
}

for (int location = 0; location < 10; location++) {
    if (isZombieArea(location)) {
        continue;  // Skip zombie areas
    }
    loot(location);
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson7_subs[7],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the correct statement to exit the current loop and stop further iterations in a nested loop?",
                                options = listOf(
                                    "break",
                                    ";",
                                    "int",
                                    "0"
                                ),
                                correctAnswer = "break", // The correct answer option
                                userAnswer = null, // Placeholder for user input
                                isCorrect = false // Initially set to false, can be updated based on user input
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 8
            Lesson(
                id = DSAIntermediateStageIds.lesson8,
                title = "C Arrays",
                description = "Master arrays in C for efficient data storage and access! 🗃️",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[0],
                        title = "Introduction to Arrays",
                        description = "Learn how arrays store similar data in sequence.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "An array is a data structure that stores multiple elements in a sequential order, and each element can be accessed using its index, which identifies its position in the array.",
                                    listOf("array")
                                )
                            ),
                            ContentBlock.Code("int sales[7];  // An array to track sales for 7 days.")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[1],
                        title = "Array Declaration and Initialization",
                        description = "Learn how to create and fill arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In programming, you can declare an array by specifying its type and size without initializing its values, or you can initialize it by assigning values immediately. The array size is fixed once defined, but the values (elements) within can be modified.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int donuts[5] = {10, 20, 30, 40, 50};  // Declared and filled with numbers.
                int donuts[] = {10, 20};  // Size inferred: 2 boxes.
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[2],
                        title = "Accessing Array Elements",
                        description = "How to get or change array elements using their index.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In an array, elements are accessed using indices (0, 1, 2), which determine the position of each element in the data structure. The index allows direct retrieval or modification of the value stored at that position.",
                                    listOf("")
                                )

                            ),
                            ContentBlock.Code(
                                """
                int donuts[3] = {10, 20, 30};
                printf("%d", donuts[0]);  // Check Box 0: 10 donuts.
                donuts[1] = 25;  // Restock Box 1 with 25 donuts.
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[3],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct way to initialize an array with 5 elements?",
                                incompleteCode = "int donuts[___] = {10, 20, 30, 40, 50};  // Declared and filled with numbers.",
                                correctCode = "5"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[4],
                        title = "Array Size",
                        description = "Find out how many elements an array can hold.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The array size is determined by allocating a fixed amount of memory for a specific number of elements. By calculating the total memory available and dividing it by the memory required for each element, you can determine the array's capacity, just like calculating how many elements fit into a fixed memory space.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int boxes[6];
                int count = sizeof(boxes) / sizeof(boxes[0]);
                printf("Total boxes: %d", count);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[5],
                        title = "2D array",
                        description = "Organize data in rows and columns.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "An array of arrays (2D array) organizes data in a matrix-like structure. Rows represent one dimension (e.g., flavor), and columns represent another dimension (e.g., color). You can access a specific element by specifying its row and column indices, like 'array[1][0]!'",
                                    listOf("2D array")
                                )
                            ),
                            ContentBlock.Code(
                                """
                int display[2][3] = {
                    {1, 2, 3},  // Chocolate donuts
                    {4, 5, 6}   // Vanilla donuts
                };
                printf("Donuts: %d", display[0][2]);  // Chocolate, column 2.
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[6],
                        title = "Array Operations",
                        description = "Sort or search elements in arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Sorting algorithms help organize data in a specific order, such as ascending or descending. Searching algorithms allow you to find specific elements in a sorted or unsorted data structure, like searching for a value in an array or list.",
                                )
                            ),
                            ContentBlock.Code(
                                """
                int donuts[5] = {5, 2, 4, 1, 3};
                // Bubble sort to organize boxes.
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4 - i; j++) {
                        if (donuts[j] > donuts[j + 1]) {
                            int temp = donuts[j];
                            donuts[j] = donuts[j + 1];
                            donuts[j + 1] = temp;
                        }
                    }
                }
                // Search for a box with 3 donuts.
                int target = 3;
                for (int i = 0; i < 5; i++) {
                    if (donuts[i] == target) printf("Found at index %d", i);
                }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[7],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "How do you access an element in a multidimensional array?",
                                incompleteCode = "int display[2][3] = {{1, 2, 3}, {4, 5, 6}};\nprintf(\"Donuts: %d\", display[___][2]);  // Access second row, third column",
                                correctCode = "0"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = "intermediate_c8_sub9",
                        title = "Real-Life Example with Arrays",
                        description = "Track and analyze data using arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Imagine you’re tracking donut sales for a week. Each day, you record the total donuts sold. With an array, you can easily calculate the total or average sales for the week. It’s like being a donut shop data analyst!"
                                )
                            ),
                            ContentBlock.Code(
                                """
                float weeklySales[7] = {100.5, 110.2, 120.8, 130.1, 125.4, 115.6, 108.9};
                float total = 0;
                for (int i = 0; i < 7; i++) total += weeklySales[i];
                float avg = total / 7;
                printf("Average sales: %.2f", avg);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson8_subs[8],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "How do you calculate the total number of elements in an array?",
                                options = listOf(
                                    "sizeof(array) / sizeof(array[0])",
                                    "array[0] * sizeof(array)",
                                    "sizeof(array)",
                                    "sizeof(array[0])"
                                ),
                                correctAnswer = "sizeof(array) / sizeof(array[0])"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 9
            Lesson(
                id = DSAIntermediateStageIds.lesson9,
                title = "C Strings",
                description = "Learn how to work with strings in C and perform string manipulations. 📝",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[0],
                        title = "Introduction to Strings in C",
                        description = "Understand the basics of strings in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A string in C is an array of characters, terminated by a null character (\\0). Strings in C are handled as arrays of characters with a special character (\\0) at the end. Example of a string:",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
    char name[] = "Hello";  // The string is "Hello" with an implicit null-terminator \0 at the end
    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[1],
                        title = "Declaring and Initializing Strings",
                        description = "Learn how to declare and initialize strings in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, a string is declared as a character array.",
                                    listOf("character array")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can initialize a string at the time of declaration:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[] = "John";  // Automatic null-termination
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Alternatively, you can declare an empty string and later assign a value:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[10];  // A string of size 10
                    strcpy(name, "John");  // Assigning a value using strcpy
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[2],
                        title = "Accessing String Elements",
                        description = "Learn how to access individual characters in a string.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To access individual characters of a string, use the array indexing method.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of accessing characters in a string:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[] = "Hello";
                    printf("%c", name[0]);  // Output: 'H'
                    printf("%c", name[4]);  // Output: 'o'
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Note that the first character is at index 0, and the last character is at length-1.",
                                    listOf("0", "length-1")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[3],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the correct declaration of a string in C?",
                                incompleteCode = """
            ___ name[5] = "Hello";  // Complete the code to declare a string "Hello"
        """.trimIndent(),
                                correctCode = "char"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[4],
                        title = "String Length and Size",
                        description = "Understand how to calculate the length of a string.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The length of a string can be calculated using the strlen function from string.h.",
                                    listOf("strlen", "string.h")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example to calculate the length of a string:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[] = "Hello";
                    int length = strlen(name);  // length = 5
                    printf("Length: %d", length);
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The sizeof operator returns the size of the array in bytes, including the null-terminator.",
                                    listOf("sizeof")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[5],
                        title = "Common String Functions",
                        description = "Explore commonly used functions for string manipulation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C provides several string functions, such as strlen(), strcpy(), strcat(), and strcmp().",
                                    listOf("strlen()", "strcpy()", "strcat()", "strcmp()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Some common functions are:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    // Copying a string
                    char src[] = "Hello";
                    char dest[10];
                    strcpy(dest, src);
                    
                    // Concatenating two strings
                    char str1[] = "Hello, ";
                    char str2[] = "world!";
                    strcat(str1, str2);  // str1 becomes "Hello, world!"
                    
                    // Comparing two strings
                    if (strcmp(str1, str2) == 0) {
                        printf("Strings are equal");
                    } else {
                        printf("Strings are different");
                    }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[6],
                        title = "String Comparison",
                        description = "Learn how to compare strings.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The strcmp() function compares two strings lexicographically.",
                                    listOf("strcmp()")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """
                    char str1[] = "apple";
                    char str2[] = "orange";
                    if (strcmp(str1, str2) < 0) {
                        printf("apple is less than orange");
                    }
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[7],
                        title = "String Copying and Concatenation",
                        description = "Learn how to copy and concatenate strings.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can be copied and concatenated using strcpy() and strcat().",
                                    listOf("strcpy()", "strcat()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of copying a string:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char src[] = "Hello";
                    char dest[10];
                    strcpy(dest, src);  // Copies "Hello" into dest
                """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of concatenating two strings:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char str1[20] = "Hello, ";
                    char str2[] = "world!";
                    strcat(str1, str2);  // str1 becomes "Hello, world!"
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[8],
                        title = "String Input and Output",
                        description = "Understand how to handle input and output with strings.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings can be input using scanf() and output using printf().",
                                    listOf("scanf()", "printf()")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """
                    char name[20];
                    printf("Enter your name: ");
                    scanf("%s", name);  // Reads a string
                    printf("Hello, %s!", name);  // Outputs the string
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[9],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing parts of the following code to concatenate two strings and print them.",
                                incompleteCode = """
        char str1[] = "Hello, ";
        char str2[] = "world!";
        ___(str1, str2);  // Complete this line with the correct function to concatenate
        printf("%s", str1);  // Expected output: "Hello, world!"
    """.trimIndent(),
                                correctCode = "strcat",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[10],
                        title = "Real-Life Example with Strings",
                        description = "See how strings are used in real applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Strings are used in a wide variety of real-world applications, like user input, file reading, and string manipulation.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Prompting a user for input and greeting them:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    char name[50];
                    printf("Enter your name: ");
                    fgets(name, sizeof(name), stdin);
                    printf("Welcome, %s!", name);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson9_subs[11],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which function is used to copy one string into another in C?",
                                options = listOf("strcpy", "strcat", "strcmp", "strlen"),
                                correctAnswer = "strcpy",
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
                id = DSAIntermediateStageIds.lesson10,
                title = "Recap",
                description = "A brief recap of key programming concepts in C.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson10_subs[0],
                        title = "Introduction and Encouragement",
                        description = "Let's begin by revisiting some essential concepts in C programming. These foundations will help you grow your coding skills and tackle more complex problems.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Keep practicing and pushing forward. Each challenge you overcome brings you closer to mastering C programming. As you progress, these concepts will become more intuitive, and the complexity will feel less daunting. Keep embracing the challenges ahead—you’re capable of mastering them.",
                                    listOf("practice", "growth")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson10_subs[1],
                        title = "Loops (For, While, Do-While)",
                        description = "Loops are essential for repeating tasks. The for, while, and do-while loops help execute code multiple times, making them crucial for handling repetitive tasks efficiently.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Loops let you repeat actions based on conditions. Mastering loops will make you more efficient in solving problems and help streamline your code. They’re used in nearly every program you write and are key to managing repetitive tasks effectively.",
                                    listOf("for", "while", "do-while")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson10_subs[2],
                        title = "Arrays",
                        description = "Arrays are essential for storing multiple values of the same type. They’re crucial for managing large datasets and implementing efficient algorithms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays store multiple elements of the same type in consecutive memory locations. Understanding arrays allows you to handle large data more efficiently and supports building more complex algorithms.",
                                    listOf("arrays")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson10_subs[3],
                        title = "Keep Going! Your Next Challenge Awaits",
                        description = "You’ve made excellent progress so far. Completing the sections on loops and arrays has built a strong foundation for you. These core concepts will support more advanced topics ahead. Keep practicing, and the clarity will come. Remember, learning programming is a journey, not a sprint. Stay focused, keep pushing forward, and the next challenge is yours to conquer!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Your foundation is solid. The next challenge is just ahead—keep the momentum going! With each step, you’ll improve and grow as a programmer. Trust the process and continue making progress.",
                                    listOf("momentum", "next challenge")
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
                id = DSAIntermediateStageIds.lesson11,
                title = "Quiz",
                description = "Test your knowledge of the topics covered in this stage! 🧠💻",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson11_subs[0],
                        title = "Quiz: Loops and Arrays",
                        description = "Answer questions about loops and arrays in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which loop guarantees that the loop body will execute at least once?",
                                options = listOf("for", "while", "do-while", "switch"),
                                correctAnswer = "do-while"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson11_subs[1],
                        title = "Quiz: If-Else and Nested Statements",
                        description = "Test your knowledge of if-else and nested conditional statements.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is the correct syntax for an if-else statement in C?",
                                options = listOf(
                                    "if (condition) { // code } else { // code }",
                                    "if condition { // code } else { // code }",
                                    "if (condition) then { // code } else { // code }",
                                    "if condition: { // code } else { // code }"
                                ),
                                correctAnswer = "if (condition) { // code } else { // code }"
                            ),

                            ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson11_subs[2],
                        title = "Quiz: Strings and Arrays",
                        description = "Answer questions about strings and arrays in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "How do you declare a string in C?",
                                options = listOf(
                                    "char string[];",
                                    "char string[10];",
                                    "string char[10];",
                                    "string[] char;"
                                ),
                                correctAnswer = "char string[10];"
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson11_subs[3],
                        title = "Quiz: Break and Continue",
                        description = "Test your understanding of break and continue in loops.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What does the 'break' statement do in a loop?",
                                options = listOf(
                                    "Exits the loop",
                                    "Continues the loop",
                                    "Does nothing",
                                    "Ends the program"
                                ),
                                correctAnswer = "Exits the loop"
                            ),


                            ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson11_subs[4],
                        title = "Quiz: Input Handling",
                        description = "Quiz on handling user input in C.",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which function is used to take user input in C?",
                                options = listOf(
                                    "scanf()",
                                    "printf()",
                                    "gets()",
                                    "input()"
                                ),
                                correctAnswer = "scanf()"
                            ),

                            ),
                        type = LessonContentType.QUIZ
                    ),
                    LessonContent(
                        id = DSAIntermediateStageIds.lesson11_subs[5],
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

            // continue to add here


        )
    )
}