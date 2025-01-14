package com.codemaster.codemasterapp.main.AllCourses.DSACourse


import com.codemaster.codemasterapp.main.AllCourses.DSACourse.courseIds.DSAAdvancedStageIds
import com.codemaster.codemasterapp.main.AllCourses.DSACourse.courseIds.DSAIntermediateStageIds
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.InteractiveInputBlock
import com.codemaster.codemasterapp.main.data.ContentBlock.QuizContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun DSAAdvancedCourse(): Stage {
    return Stage(
        id = DSAAdvancedStageIds.stageId,
        title = "Advanced",
        lessons = listOf(

            // lesson 1
            Lesson(
                id = DSAAdvancedStageIds.lesson1,
                title = "Welcome to Advanced DSA",
                description = "Take your programming skills to the next level by mastering advanced data structures like Trees and Graphs.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson1_subs[0],
                        title = "Overview",
                        description = "Explore the fundamental concepts of Trees and Graphs, essential for solving complex problems.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "In this lesson, you'll dive into the structure and implementation of Trees and Graphs. You will learn about traversal algorithms, shortest path techniques, graph representations, and more. Mastering these concepts will enhance your ability to solve advanced computational problems efficiently."
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson1_subs[1],
                        title = "Stay Inspired",
                        description = "Motivation to keep you focused as you tackle complex data structures.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Trees and Graphs are the backbone of many algorithms in computer science. By understanding these structures, you'll be able to design and implement solutions for real-world problems like networking, pathfinding, and hierarchical data representation. Remember, every challenge is a step closer to mastery."
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson1_subs[2],
                        title = "Effective Learning Strategies",
                        description = "Tips for mastering Trees and Graphs and becoming a better problem-solver.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Practice by implementing various tree and graph algorithms, such as Depth-First Search (DFS), Breadth-First Search (BFS), and Dijkstra's algorithm. Visualize these structures to better understand their behavior and break down complex problems into smaller steps. Revisiting the basics and testing edge cases is crucial for deep comprehension."
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson1_subs[3],
                        title = "Ready to Begin",
                        description = "Prepare yourself to explore advanced data structures and algorithms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "In the upcoming lessons, you’ll work on constructing and traversing trees, implementing graph algorithms, and solving problems involving connectivity and shortest paths. Sharpen your analytical skills and get ready to tackle some of the most challenging topics in computer science!"
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // lesson 2
            Lesson(
                id = DSAAdvancedStageIds.lesson2,
                title = "Trees",
                description = "Dive into the concept of Trees, their structure, types, and operations, and understand their importance in advanced data structures. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson2_subs[0],
                        title = "Introduction to Trees",
                        description = "Learn about the structure and components of Trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A Tree is a hierarchical data structure consisting of nodes, where each node has a value and pointers to its child nodes. Trees are widely used in various applications such as searching, sorting, and representing hierarchical data.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key Components:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Root: The topmost node in a tree, serving as the starting point.",
                                    listOf("Root:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Child: Nodes directly connected to a node via edges.",
                                    listOf("Child:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Parent: A node with a child.",
                                    listOf("Parent:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Leaf: A node with no children.",
                                    listOf("Leaf:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Node {
                        int data;
                        struct Node* left;
                        struct Node* right;
                    };
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson2_subs[1],
                        title = "Types of Trees",
                        description = "Understand the different types of trees and their use cases.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Trees come in various forms depending on their structure and properties:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Binary Tree: A tree where each node has at most two children, referred to as left and right.",
                                    listOf("Binary Tree:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Node {
                        int data; 
                        struct Node* left; // Left child
                        struct Node* right; // Right child
                    };

                    // Example usage:
                    struct Node* root = NULL;
                    root = (struct Node*)malloc(sizeof(struct Node));
                    root->data = 10;
                    root->left = NULL;
                    root->right = NULL;
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Binary Search Tree (BST): A binary tree with the property that for each node, values in the left subtree are smaller, and values in the right subtree are larger.",
                                    listOf("Binary Search Tree (BST):")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "AVL Tree: A self-balancing binary search tree where the height difference between left and right subtrees of any node is at most one.",
                                    listOf("AVL Tree:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Heap: A tree-based structure where the parent node is either greater (Max-Heap) or smaller (Min-Heap) than its children.",
                                    listOf("Heap:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson2_subs[2],
                        title = "Tree Traversals",
                        description = "Learn common traversal methods used in trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Tree traversals help visit each node in a systematic way. Common traversal methods are:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Inorder: Visit the left subtree, root node, and then the right subtree.",
                                    listOf("Inorder:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Preorder: Visit the root node, then the left and right subtrees.",
                                    listOf("Preorder:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Postorder: Visit the left and right subtrees, then the root node.",
                                    listOf("Postorder:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void inorderTraversal(struct Node* root) {
                        if (root != NULL) {
                            inorderTraversal(root->left);  // Visit left subtree
                            printf("%d ", root->data);    // Visit root
                            inorderTraversal(root->right); // Visit right subtree
                        }
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson2_subs[3],
                        title = "Applications of Trees",
                        description = "Explore how trees are used in real-world scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Trees are fundamental in various applications, such as:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "File Systems: Representing hierarchical file and folder structures.",
                                    listOf("File Systems:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Databases: Indexing and searching using Binary Search Trees (BST) and B-trees.",
                                    listOf("Databases:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Networking: Representing routing paths in hierarchical networks.",
                                    listOf("Networking:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson2_subs[4],
                        title = "Advantages and Limitations",
                        description = "Understand why and when to use trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Advantages:\nEfficient searching and sorting algorithms.\nNatural representation of hierarchical data.",
                                    listOf("Advantages:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Limitations:\nComplex to implement compared to arrays and linked lists.\nMore memory usage due to pointers.",
                                    listOf("Limitations:")
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
                id = DSAAdvancedStageIds.lesson3,
                title = "Binary Trees",
                description = "Dive into the concept of binary trees, their structure, operations, and how they differ from other tree data structures. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson3_subs[0],
                        title = "Introduction to Binary Trees",
                        description = "Learn about the structure and components of binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A Binary Tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child. This structure is widely used in applications such as searching, sorting, and hierarchical data representation.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key Components:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Node: The fundamental unit of the tree containing data.",
                                    listOf("Node:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Left Child: A pointer/reference to the left subtree of the node.",
                                    listOf("Left Child:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Right Child: A pointer/reference to the right subtree of the node.",
                                    listOf("Right Child:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    struct Node {
                        int data;
                        struct Node* left;
                        struct Node* right;
                    };
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson3_subs[1],
                        title = "Manual Walkthrough: Creation and Traversal",
                        description = "Manually create and traverse a binary tree.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating and traversing a binary tree step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure that holds data and pointers to the left and right child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by assigning the 'left' and 'right' pointers of a parent node to its respective child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Traverse the tree using one of the traversal methods (Inorder, Preorder, Postorder, or Level Order). Print the data of each node during traversal.")),

                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Text(createSimpleText("Tree Structure:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
          1
         / \
        2   3
       / \
      4   5
        """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Example Traversal:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
        Inorder: 4 -> 2 -> 5 -> 1 -> 3
        Preorder: 1 -> 2 -> 4 -> 5 -> 3
        Postorder: 4 -> 5 -> 2 -> 3 -> 1
        Level Order: 1 -> 2 -> 3 -> 4 -> 5
        """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how nodes in a binary tree are linked and traversed to represent hierarchical data structures."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson3_subs[2],
                        title = "Operations on Binary Trees",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and traversal on binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:\n" +
                                            "Adding a new node to a binary tree involves finding the appropriate position and updating the parent node's left or right pointer.",
                                    listOf("Insertion:", "left", "right")
                                )
                            ),
                            ContentBlock.Code(
                                """
            struct Node {
                int data;
                Node* left;
                Node* right;
                Node(int value) : data(value), left(nullptr), right(nullptr) {}
            };

            Node* insert(Node* root, int value) {
                if (root == nullptr) {
                    return new Node(value);
                }
                if (value < root->data) {
                    root->left = insert(root->left, value);
                } else {
                    root->right = insert(root->right, value);
                }
                return root;
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:\n" +
                                            "Deleting a node involves finding the node and handling three cases: no children, one child, or two children.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            Node* findMin(Node* root) {
                while (root->left != nullptr) root = root->left;
                return root;
            }

            Node* deleteNode(Node* root, int value) {
                if (root == nullptr) return root;
                if (value < root->data) {
                    root->left = deleteNode(root->left, value);
                } else if (value > root->data) {
                    root->right = deleteNode(root->right, value);
                } else {
                    if (root->left == nullptr) {
                        Node* temp = root->right;
                        delete root;
                        return temp;
                    } else if (root->right == nullptr) {
                        Node* temp = root->left;
                        delete root;
                        return temp;
                    }
                    Node* temp = findMin(root->right);
                    root->data = temp->data;
                    root->right = deleteNode(root->right, temp->data);
                }
                return root;
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Traversal and Searching:\n" +
                                            "Traversal involves visiting all nodes in a specific order. Searching finds whether a value exists in the tree.",
                                    listOf("Traversal and Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void inorder(Node* root) {
                if (root == nullptr) return;
                inorder(root->left);
                cout << root->data << " ";
                inorder(root->right);
            }

            bool search(Node* root, int value) {
                if (root == nullptr) return false;
                if (root->data == value) return true;
                if (value < root->data) return search(root->left, value);
                return search(root->right, value);
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson3_subs[3],
                        title = "How Binary Tree Operations Work",
                        description = "Detailed step-by-step breakdown of insertion, deletion, traversal, and searching operations in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on binary trees step-by-step to understand their mechanics."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Start at the root of the tree.
                2. Compare the value with the current node's data.
                3. If the value is smaller, move to the left child; if larger, move to the right child.
                4. Repeat until a NULL position is found.
                5. Create a new node at the NULL position.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Locate the node to be deleted.
                2. Handle cases:
                   a. No children: Remove the node.
                   b. One child: Replace the node with its child.
                   c. Two children: Replace the node with its in-order successor (smallest in the right subtree).
                3. Update the tree structure accordingly.
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
                1. Choose a traversal method (Inorder, Preorder, Postorder, Level Order).
                2. Visit nodes in the specified order and perform an action (e.g., print data).
                3. Recursively or iteratively traverse the tree.
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
                1. Start at the root node.
                2. Compare the value with the current node's data.
                3. If equal, return true.
                4. If smaller, search in the left subtree; if larger, search in the right subtree.
                5. Repeat until the value is found or a NULL node is reached.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson3_subs[4],
                        title = "How to Display Binary Trees",
                        description = "Understand the basics of binary trees and how to display them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child.")
                            ),
                            ContentBlock.Text(
                                createSimpleText("To display, traverse the tree using methods like Inorder, Preorder, or Postorder traversal to access all nodes.")
                            ),
                            ContentBlock.Code(
                                """
            void inorderTraversal(Node* root) {
                if (root == nullptr) return;
                inorderTraversal(root->left);   // Visit left subtree
                cout << root->data << " ";     // Print data
                inorderTraversal(root->right); // Visit right subtree
            }
            
            void preorderTraversal(Node* root) {
                if (root == nullptr) return;
                cout << root->data << " ";     // Print data
                preorderTraversal(root->left); // Visit left subtree
                preorderTraversal(root->right); // Visit right subtree
            }
            
            void postorderTraversal(Node* root) {
                if (root == nullptr) return;
                postorderTraversal(root->left);  // Visit left subtree
                postorderTraversal(root->right); // Visit right subtree
                cout << root->data << " ";       // Print data
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson3_subs[5],
                        title = "Importance of Binary Trees",
                        description = "Understand why binary trees are important and their applications.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Binary trees are a fundamental data structure used in a wide range of applications due to their hierarchical nature. They support efficient searching, insertion, and deletion operations. Common applications include binary search trees for fast lookup, heaps for priority queues, syntax trees for compilers, and decision trees for machine learning algorithms. Their recursive structure makes them suitable for solving complex computational problems in data structures and algorithms.",
                                    listOf(
                                        "Binary trees",
                                        "Binary search trees",
                                        "heaps",
                                        "decision trees"
                                    )
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
                id = DSAAdvancedStageIds.lesson4,
                title = "Preorder Traversal",
                description = "Dive into the concept of preorder traversal, its process, and applications in hierarchical data structures. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson4_subs[0],
                        title = "Introduction to Preorder Traversal",
                        description = "Learn about the process of visiting nodes in preorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Preorder traversal is a tree traversal method where the nodes are visited in the following order:\n1. Visit the root node.\n2. Traverse the left subtree in preorder.\n3. Traverse the right subtree in preorder.",
                                    listOf(
                                        "Preorder traversal",
                                        "root",
                                        "left subtree",
                                        "right subtree"
                                    )
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key Characteristics:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Recursive Nature: The process naturally lends itself to recursive implementation.",
                                    listOf("Recursive Nature:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Iterative Implementation: Stack data structures can be used for an iterative approach.",
                                    listOf("Iterative Implementation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    void preorderTraversal(Node* root) {
                        if (root == nullptr) return;
                        cout << root->data << " ";    // Visit the root
                        preorderTraversal(root->left); // Traverse the left subtree
                        preorderTraversal(root->right); // Traverse the right subtree
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson4_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually create a binary tree and perform a preorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating a binary tree and performing a preorder traversal step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure that holds data and pointers to the left and right child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by assigning the 'left' and 'right' pointers of a parent node to its respective child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Perform a preorder traversal on the binary tree:")),
                            ContentBlock.Text(createSimpleText("1. Visit the root node first.")),
                            ContentBlock.Text(createSimpleText("2. Recursively traverse the left subtree.")),
                            ContentBlock.Text(createSimpleText("3. Recursively traverse the right subtree.")),

                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Text(createSimpleText("Tree Structure:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
          1
         / \
        2   3
       / \
      4   5
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Example Preorder Traversal:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
        Preorder: 1 -> 2 -> 4 -> 5 -> 3
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how to create and traverse a binary tree using the preorder traversal method to process nodes in a hierarchical structure."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson4_subs[2],
                        title = "Operations on Binary Trees: Preorder Traversal",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and specifically preorder traversal on binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:\n" +
                                            "Adding a new node to a binary tree involves finding the appropriate position and updating the parent node's left or right pointer.",
                                    listOf("Insertion:", "left", "right")
                                )
                            ),
                            ContentBlock.Code(
                                """
        struct Node {
            int data;
            Node* left;
            Node* right;
            Node(int value) : data(value), left(nullptr), right(nullptr) {}
        };

        Node* insert(Node* root, int value) {
            if (root == nullptr) {
                return new Node(value);
            }
            if (value < root->data) {
                root->left = insert(root->left, value);
            } else {
                root->right = insert(root->right, value);
            }
            return root;
        }
        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:\n" +
                                            "Deleting a node involves finding the node and handling three cases: no children, one child, or two children.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Code(
                                """
        Node* findMin(Node* root) {
            while (root->left != nullptr) root = root->left;
            return root;
        }

        Node* deleteNode(Node* root, int value) {
            if (root == nullptr) return root;
            if (value < root->data) {
                root->left = deleteNode(root->left, value);
            } else if (value > root->data) {
                root->right = deleteNode(root->right, value);
            } else {
                if (root->left == nullptr) {
                    Node* temp = root->right;
                    delete root;
                    return temp;
                } else if (root->right == nullptr) {
                    Node* temp = root->left;
                    delete root;
                    return temp;
                }
                Node* temp = findMin(root->right);
                root->data = temp->data;
                root->right = deleteNode(root->right, temp->data);
            }
            return root;
        }
        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Preorder Traversal and Searching:\n" +
                                            "Preorder traversal visits nodes in the order: root, left subtree, right subtree. Searching finds whether a value exists in the tree.",
                                    listOf("Preorder Traversal", "Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
        void preorder(Node* root) {
            if (root == nullptr) return;
            cout << root->data << " ";  // Visit root
            preorder(root->left);      // Traverse left subtree
            preorder(root->right);     // Traverse right subtree
        }

        bool search(Node* root, int value) {
            if (root == nullptr) return false;
            if (root->data == value) return true;
            if (value < root->data) return search(root->left, value);
            return search(root->right, value);
        }
        """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson4_subs[3],
                        title = "How Binary Tree Operations Work: Preorder Focus",
                        description = "Detailed step-by-step breakdown of insertion, deletion, preorder traversal, and searching operations in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on binary trees step-by-step to understand their mechanics, with a focus on preorder traversal."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
            1. Start at the root of the tree.
            2. Compare the value with the current node's data.
            3. If the value is smaller, move to the left child; if larger, move to the right child.
            4. Repeat until a NULL position is found.
            5. Create a new node at the NULL position.
            """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
            1. Locate the node to be deleted.
            2. Handle cases:
               a. No children: Remove the node.
               b. One child: Replace the node with its child.
               c. Two children: Replace the node with its in-order successor (smallest in the right subtree).
            3. Update the tree structure accordingly.
            """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Preorder Traversal:",
                                    listOf("Preorder Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
            1. Preorder traversal visits nodes in the following order:
               a. Visit the root node.
               b. Traverse the left subtree.
               c. Traverse the right subtree.
            2. The sequence is Root -> Left -> Right.
            3. Perform an action (e.g., print node data) when visiting each node.
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
            1. Start at the root node.
            2. Compare the value with the current node's data.
            3. If equal, return true.
            4. If smaller, search in the left subtree; if larger, search in the right subtree.
            5. Repeat until the value is found or a NULL node is reached.
            """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson4_subs[4],
                        title = "How to Display Binary Trees: Traversal Methods",
                        description = "Understand the basics of binary trees and how to display them using various traversal methods.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child.")
                            ),
                            ContentBlock.Text(
                                createSimpleText("To display a binary tree, traverse it using methods like Preorder, Inorder, or Postorder traversal to access all nodes.")
                            ),
                            ContentBlock.Code(
                                """
        void preorderTraversal(Node* root) {
            if (root == nullptr) return;
            cout << root->data << " ";     // Print data
            preorderTraversal(root->left); // Visit left subtree
            preorderTraversal(root->right); // Visit right subtree
        }

        void inorderTraversal(Node* root) {
            if (root == nullptr) return;
            inorderTraversal(root->left);   // Visit left subtree
            cout << root->data << " ";     // Print data
            inorderTraversal(root->right); // Visit right subtree
        }

        void postorderTraversal(Node* root) {
            if (root == nullptr) return;
            postorderTraversal(root->left);  // Visit left subtree
            postorderTraversal(root->right); // Visit right subtree
            cout << root->data << " ";       // Print data
        }
        """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson4_subs[5],
                        title = "Importance of Preorder Traversal",
                        description = "Understand why preorder traversal is important and its applications in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Preorder traversal is a fundamental technique in binary trees where nodes are visited in the order: root, left subtree, and right subtree. It is crucial for applications like tree serialization and deserialization, prefix notation in expression trees, cloning binary trees, and serving as the foundation for depth-first search algorithms."
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
                id = DSAAdvancedStageIds.lesson5,
                title = "Inorder Traversal",
                description = "Dive into the concept of inorder traversal, its process, and applications in hierarchical data structures. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson5_subs[0],
                        title = "Introduction to Inorder Traversal",
                        description = "Learn about the process of visiting nodes in inorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Inorder traversal is a tree traversal method where the nodes are visited in the following order:\n1. Traverse the left subtree in inorder.\n2. Visit the root node.\n3. Traverse the right subtree in inorder.",
                                    listOf(
                                        "Inorder traversal",
                                        "root",
                                        "left subtree",
                                        "right subtree"
                                    )
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key Characteristics:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Recursive Nature: The process naturally lends itself to recursive implementation.",
                                    listOf("Recursive Nature:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Iterative Implementation: Stack data structures can be used for an iterative approach.",
                                    listOf("Iterative Implementation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void inorderTraversal(Node* root) {
                if (root == nullptr) return;
                inorderTraversal(root->left);  // Traverse the left subtree
                cout << root->data << " ";     // Visit the root
                inorderTraversal(root->right); // Traverse the right subtree
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson5_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually create a binary tree and perform an inorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating a binary tree and performing an inorder traversal step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure that holds data and pointers to the left and right child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by assigning the 'left' and 'right' pointers of a parent node to its respective child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Perform an inorder traversal on the binary tree:")),
                            ContentBlock.Text(createSimpleText("1. Traverse the left subtree first.")),
                            ContentBlock.Text(createSimpleText("2. Visit the root node.")),
                            ContentBlock.Text(createSimpleText("3. Recursively traverse the right subtree.")),

                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Text(createSimpleText("Tree Structure:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
      1
     / \
    2   3
   / \
  4   5
            """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Example Inorder Traversal:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Inorder: 4 -> 2 -> 5 -> 1 -> 3
            """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how to create and traverse a binary tree using the inorder traversal method to process nodes in a hierarchical structure."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson5_subs[2],
                        title = "Operations on Binary Trees: Inorder Traversal",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and specifically inorder traversal on binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:\n" +
                                            "Adding a new node to a binary tree involves finding the appropriate position and updating the parent node's left or right pointer.",
                                    listOf("Insertion:", "left", "right")
                                )
                            ),
                            ContentBlock.Code(
                                """
        struct Node {
            int data;
            Node* left;
            Node* right;
            Node(int value) : data(value), left(nullptr), right(nullptr) {}
        };

        Node* insert(Node* root, int value) {
            if (root == nullptr) {
                return new Node(value);
            }
            if (value < root->data) {
                root->left = insert(root->left, value);
            } else {
                root->right = insert(root->right, value);
            }
            return root;
        }
        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:\n" +
                                            "Deleting a node involves finding the node and handling three cases: no children, one child, or two children.",
                                    listOf("Deletion:")
                                )
                            ),
                            ContentBlock.Code(
                                """
        Node* findMin(Node* root) {
            while (root->left != nullptr) root = root->left;
            return root;
        }

        Node* deleteNode(Node* root, int value) {
            if (root == nullptr) return root;
            if (value < root->data) {
                root->left = deleteNode(root->left, value);
            } else if (value > root->data) {
                root->right = deleteNode(root->right, value);
            } else {
                if (root->left == nullptr) {
                    Node* temp = root->right;
                    delete root;
                    return temp;
                } else if (root->right == nullptr) {
                    Node* temp = root->left;
                    delete root;
                    return temp;
                }
                Node* temp = findMin(root->right);
                root->data = temp->data;
                root->right = deleteNode(root->right, temp->data);
            }
            return root;
        }
        """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Inorder Traversal and Searching:\n" +
                                            "Inorder traversal visits nodes in the order: left subtree, root, right subtree. Searching finds whether a value exists in the tree.",
                                    listOf("Inorder Traversal", "Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
        void inorder(Node* root) {
            if (root == nullptr) return;
            inorder(root->left);  // Traverse left subtree
            cout << root->data << " ";  // Visit root
            inorder(root->right);  // Traverse right subtree
        }

        bool search(Node* root, int value) {
            if (root == nullptr) return false;
            if (root->data == value) return true;
            if (value < root->data) return search(root->left, value);
            return search(root->right, value);
        }
        """.trimIndent()
                            )

                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson5_subs[3],
                        title = "How Binary Tree Operations Work: Inorder Focus",
                        description = "Detailed step-by-step breakdown of insertion, deletion, inorder traversal, and searching operations in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on binary trees step-by-step to understand their mechanics, with a focus on inorder traversal."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
        1. Start at the root of the tree.
        2. Compare the value with the current node's data.
        3. If the value is smaller, move to the left child; if larger, move to the right child.
        4. Repeat until a NULL position is found.
        5. Create a new node at the NULL position.
                        """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
        1. Locate the node to be deleted.
        2. Handle cases:
           a. No children: Remove the node.
           b. One child: Replace the node with its child.
           c. Two children: Replace the node with its in-order successor (smallest in the right subtree).
        3. Update the tree structure accordingly.
                        """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Inorder Traversal:",
                                    listOf("Inorder Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
        1. Start at the root node.
        2. Traverse the left subtree first.
        3. Visit the root node.
        4. Traverse the right subtree last.
        5. Repeat the process recursively for all subtrees.
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
                                    "Searching follows a similar pattern to insertion but returns true or false based on whether the value is found."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson5_subs[4],
                        title = "How to Display Binary Trees: Traversal Methods",
                        description = "Understand the basics of binary trees and how to display them using various traversal methods, focusing on inorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child.")
                            ),
                            ContentBlock.Text(
                                createSimpleText("To display a binary tree, traverse it using methods like Preorder, Inorder, or Postorder traversal to access all nodes. For this lesson, we'll focus on inorder traversal.")
                            ),
                            ContentBlock.Code(
                                """
        void preorderTraversal(Node* root) {
            if (root == nullptr) return;
            cout << root->data << " ";     // Print data
            preorderTraversal(root->left); // Visit left subtree
            preorderTraversal(root->right); // Visit right subtree
        }

        void inorderTraversal(Node* root) {
            if (root == nullptr) return;
            inorderTraversal(root->left);   // Visit left subtree
            cout << root->data << " ";     // Print data
            inorderTraversal(root->right); // Visit right subtree
        }

        void postorderTraversal(Node* root) {
            if (root == nullptr) return;
            postorderTraversal(root->left);  // Visit left subtree
            postorderTraversal(root->right); // Visit right subtree
            cout << root->data << " ";       // Print data
        }
        """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson5_subs[5],
                        title = "Importance of Inorder Traversal",
                        description = "Understand why inorder traversal is important and its applications in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Inorder traversal is a critical technique for processing binary trees. It processes nodes in the order: left subtree, root, right subtree. This traversal is especially useful in applications like Binary Search Trees (BST), where inorder traversal of a BST yields nodes in sorted order, Expression Trees, where it helps evaluate arithmetic expressions by ensuring operands are processed in the correct order, and Tree Traversal Algorithms, as it serves as the foundation for several depth-first search (DFS) algorithms and tree-related algorithms."
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
                id = DSAAdvancedStageIds.lesson6,
                title = "Postorder Traversal",
                description = "Dive into the concept of postorder traversal, its process, and applications in hierarchical data structures. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson6_subs[0],
                        title = "Introduction to Postorder Traversal",
                        description = "Learn about the process of visiting nodes in postorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Postorder traversal is a tree traversal method where the nodes are visited in the following order:\n1. Traverse the left subtree in postorder.\n2. Traverse the right subtree in postorder.\n3. Visit the root node.",
                                    listOf(
                                        "Postorder traversal",
                                        "root",
                                        "left subtree",
                                        "right subtree"
                                    )
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Key Characteristics:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Recursive Nature: The process naturally lends itself to recursive implementation.",
                                    listOf("Recursive Nature:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Iterative Implementation: Stack data structures can be used for an iterative approach.",
                                    listOf("Iterative Implementation:")
                                )
                            ),
                            ContentBlock.Code(
                                """
            void postorderTraversal(Node* root) {
                if (root == nullptr) return;
                postorderTraversal(root->left);  // Traverse the left subtree
                postorderTraversal(root->right); // Traverse the right subtree
                cout << root->data << " ";      // Visit the root
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson6_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually create a binary tree and perform a postorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's walk through the process of creating a binary tree and performing a postorder traversal step-by-step.")),

                            ContentBlock.Text(createAnnotatedText("Pass 1:", listOf("Pass 1:"))),
                            ContentBlock.Text(createSimpleText("Define a 'Node' structure that holds data and pointers to the left and right child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 2:", listOf("Pass 2:"))),
                            ContentBlock.Text(createSimpleText("Dynamically allocate memory for nodes using 'new' and assign data to each node.")),

                            ContentBlock.Text(createAnnotatedText("Pass 3:", listOf("Pass 3:"))),
                            ContentBlock.Text(createSimpleText("Link the nodes by assigning the 'left' and 'right' pointers of a parent node to its respective child nodes.")),

                            ContentBlock.Text(createAnnotatedText("Pass 4:", listOf("Pass 4:"))),
                            ContentBlock.Text(createSimpleText("Perform a postorder traversal on the binary tree:")),
                            ContentBlock.Text(createSimpleText("1. Traverse the left subtree first.")),
                            ContentBlock.Text(createSimpleText("2. Traverse the right subtree next.")),
                            ContentBlock.Text(createSimpleText("3. Visit the root node last.")),

                            ContentBlock.Text(createSimpleText("Example:")),
                            ContentBlock.Text(createSimpleText("Tree Structure:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
      1
     / \
    2   3
   / \
  4   5
                        """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Example Postorder Traversal:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Postorder: 4 -> 5 -> 2 -> 3 -> 1
                        """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("This walkthrough demonstrates how to create and traverse a binary tree using the postorder traversal method to process nodes in a hierarchical structure."))
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson6_subs[2],
                        title = "Operations on Binary Trees: Postorder Traversal",
                        description = "Learn how to perform basic operations like insertion, deletion, searching, and specifically postorder traversal on binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Postorder Traversal and Searching:\n" +
                                            "Postorder traversal visits nodes in the order: left subtree, right subtree, root node. Searching finds whether a value exists in the tree.",
                                    listOf("Postorder Traversal", "Searching:")
                                )
                            ),
                            ContentBlock.Code(
                                """
        void postorder(Node* root) {
            if (root == nullptr) return;
            postorder(root->left);  // Traverse left subtree
            postorder(root->right); // Traverse right subtree
            cout << root->data << " ";  // Visit root
        }

        bool search(Node* root, int value) {
            if (root == nullptr) return false;
            if (root->data == value) return true;
            if (value < root->data) return search(root->left, value);
            return search(root->right, value);
        }
        """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson6_subs[3],
                        title = "How Binary Tree Operations Work: Postorder Focus",
                        description = "Detailed step-by-step breakdown of insertion, deletion, postorder traversal, and searching operations in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on binary trees step-by-step to understand their mechanics, with a focus on postorder traversal."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Start at the root of the tree.
    2. Compare the value with the current node's data.
    3. If the value is smaller, move to the left child; if larger, move to the right child.
    4. Repeat until a NULL position is found.
    5. Create a new node at the NULL position.
                    """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Locate the node to be deleted.
    2. Handle cases:
       a. No children: Remove the node.
       b. One child: Replace the node with its child.
       c. Two children: Replace the node with its in-order successor (smallest in the right subtree).
    3. Update the tree structure accordingly.
                    """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Postorder Traversal:",
                                    listOf("Postorder Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Start at the root node.
    2. Traverse the left subtree first.
    3. Traverse the right subtree next.
    4. Visit the root node last.
    5. Repeat the process recursively for all subtrees.
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
                                    "Searching follows a similar pattern to insertion but returns true or false based on whether the value is found."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson6_subs[4],
                        title = "How to Display Binary Trees: Traversal Methods",
                        description = "Understand the basics of binary trees and how to display them using various traversal methods, focusing on postorder traversal.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText("A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child.")
                            ),
                            ContentBlock.Text(
                                createSimpleText("To display a binary tree, traverse it using methods like Preorder, Inorder, or Postorder traversal to access all nodes. For this lesson, we'll focus on postorder traversal.")
                            ),
                            ContentBlock.Code(
                                """
    void preorderTraversal(Node* root) {
        if (root == nullptr) return;
        cout << root->data << " ";     // Print data
        preorderTraversal(root->left); // Visit left subtree
        preorderTraversal(root->right); // Visit right subtree
    }

    void inorderTraversal(Node* root) {
        if (root == nullptr) return;
        inorderTraversal(root->left);   // Visit left subtree
        cout << root->data << " ";     // Print data
        inorderTraversal(root->right); // Visit right subtree
    }

    void postorderTraversal(Node* root) {
        if (root == nullptr) return;
        postorderTraversal(root->left);  // Visit left subtree
        postorderTraversal(root->right); // Visit right subtree
        cout << root->data << " ";       // Print data
    }
    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
        Example Postorder Traversal:
        
        Tree:

            1
           / \
          2   3
         / \
        4   5

        Postorder Sequence: 4 -> 5 -> 2 -> 3 -> 1
        """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson6_subs[5],
                        title = "Importance of Postorder Traversal",
                        description = "Understand why postorder traversal is important and its applications in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Postorder traversal is a critical technique for processing binary trees. It processes nodes in the order: left subtree, right subtree, root. This traversal is especially useful in applications like tree deletion (processing child nodes before the root ensures safe deletion), Expression Trees (where postorder helps evaluate expressions by ensuring operations are executed in the correct order), and Tree Traversal Algorithms, as it serves as the foundation for depth-first search (DFS) algorithms and other tree-related operations."
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
                id = DSAAdvancedStageIds.lesson7,
                title = "Array Representation of Binary Trees",
                description = "Learn about representing binary trees using arrays, their structure, and efficient implementations. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson7_subs[0],
                        title = "Introduction to Array Representation",
                        description = "Understand how binary trees can be represented using arrays.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In the array representation of a binary tree:\n" +
                                            "1. The root is stored at index 0.\n" +
                                            "2. For a node at index i:\n" +
                                            "   a. The left child is stored at index 2*i + 1.\n" +
                                            "   b. The right child is stored at index 2*i + 2.\n" +
                                            "3. If a node has no child, the corresponding array element is left empty or set to null.",
                                    listOf(
                                        "array representation",
                                        "root",
                                        "left child",
                                        "right child"
                                    )
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Advantages:")),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Efficient Memory Usage: No need for pointers, reducing memory overhead.",
                                    listOf("Efficient Memory Usage")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Random Access: Easy access to parent and child nodes using index arithmetic.",
                                    listOf("Random Access")
                                )
                            ),
                            ContentBlock.Code(
                                """
        // Example of array representation
        int[] tree = {1, 2, 3, 4, 5}; // Binary tree representation
        
        // Accessing nodes
        int root = tree[0];           // Root node
        int leftChild = tree[2 * 0 + 1]; // Left child of root
        int rightChild = tree[2 * 0 + 2]; // Right child of root
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson7_subs[1],
                        title = "Manual Walkthrough",
                        description = "Manually create and understand the array representation of a binary tree.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's manually create a binary tree and represent it using an array.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1"))),
                            ContentBlock.Text(createSimpleText("Define the binary tree structure.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2"))),
                            ContentBlock.Text(createSimpleText("List the nodes level by level from top to bottom and left to right.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3"))),
                            ContentBlock.Text(createSimpleText("Fill an array where index 0 represents the root, index 1 is the left child, and index 2 is the right child.")),

                            ContentBlock.Text(createSimpleText("Example Tree:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
          1
         / \
        2   3
       / \
      4   5
                        """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Array Representation: [1, 2, 3, 4, 5]")),

                            ContentBlock.Text(createSimpleText("This representation simplifies node access and operations.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson7_subs[2],
                        title = "Basic Operations on Binary Trees (Array Implementation)",
                        description = "Learn how to perform insertion, deletion, and search operations using an array-based binary tree representation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Array-based Operations:\n" +
                                            "1. Insertion: Add a node to the next available index.\n" +
                                            "2. Deletion: Remove a node by replacing it with the last node and adjusting the array.\n" +
                                            "3. Searching: Traverse the array to find a specific value.",
                                    listOf(
                                        "Array-based Operations",
                                        "Insertion",
                                        "Deletion",
                                        "Searching"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
        // Example: Array operations
        int[] tree = new int[7]; // Binary tree array
        
        // Insertion
        tree[0] = 1; // Root
        tree[1] = 2; // Left child of root
        tree[2] = 3; // Right child of root

        // Deletion (replace with last node)
        tree[1] = tree[2];
        tree[2] = 0; // Set last node to null/0

        // Searching
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == 3) {
                System.out.println("Found at index: " + i);
            }
        }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson7_subs[3],
                        title = "How Binary Tree Operations Work: Array Implementation Focus",
                        description = "Detailed step-by-step breakdown of insertion, deletion, and traversal operations in binary trees using array representation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on binary trees step-by-step to understand their mechanics, with a focus on array implementation."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Array Representation of Binary Trees:",
                                    listOf("Array Representation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    A binary tree can be represented as an array where:
    1. The root node is stored at index 0.
    2. For a node at index `i`:
       a. Left child is at index `2*i + 1`.
       b. Right child is at index `2*i + 2`.
    3. Parent of a node at index `i` is at index `(i-1)/2` (integer division).
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Insert the element at the first available position in the array.
    2. Maintain the tree's completeness property by filling the levels from left to right.
    3. Update the array size if needed.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Replace the node to be deleted with the last element in the array.
    2. Remove the last element from the array.
    3. Reorganize the tree if necessary to maintain its structure.
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
    Traversal in array representation follows the same order as the logical tree structure:
    1. Preorder: Access the current node, then traverse left and right subtrees.
    2. Inorder: Traverse the left subtree, access the current node, then traverse the right subtree.
    3. Postorder: Traverse left and right subtrees, then access the current node.
    Use the array indices to guide the traversal.
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
                                    "Search for a value by iterating through the array. Return true if found, else return false."
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example Code for Traversal (Preorder)
void preorderTraversal(int[] tree, int index) {
    if (index >= tree.length || tree[index] == -1) return;
    System.out.print(tree[index] + " ");  // Access the current node
    preorderTraversal(tree, 2 * index + 1);  // Traverse left subtree
    preorderTraversal(tree, 2 * index + 2);  // Traverse right subtree
}
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson7_subs[4],
                        title = "How to Represent Binary Trees: Array Implementation",
                        description = "Understand the basics of binary trees and how to represent them using an array-based approach.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    In an array representation of binary trees:
    1. The root node is stored at index 0.
    2. For a node at index `i`:
       a. The left child is stored at index `2*i + 1`.
       b. The right child is stored at index `2*i + 2`.
    3. The parent of a node at index `i` is located at index `(i-1)/2` (integer division).
    This representation simplifies binary tree operations and allows efficient traversal.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example of Array Representation:
    // Tree:
    //        1
    //       / \
    //      2   3
    //     / \
    //    4   5
    //
    // Array: [1, 2, 3, 4, 5]

    // Index Relations:
    // Root (1) - Index 0
    // Left Child of 1 (2) - Index 1
    // Right Child of 1 (3) - Index 2
    // Left Child of 2 (4) - Index 3
    // Right Child of 2 (5) - Index 4
    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Traversal in Array Representation:
    1. Preorder: Start from the root and use indices to traverse left and right subtrees recursively.
    2. Inorder: Traverse left subtree, then visit the root, followed by the right subtree.
    3. Postorder: Traverse left and right subtrees first, then visit the root.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example Code for Preorder Traversal:
    void preorderTraversal(int[] tree, int index) {
        if (index >= tree.length || tree[index] == -1) return; // Check boundary and null
        System.out.print(tree[index] + " ");  // Visit the current node
        preorderTraversal(tree, 2 * index + 1);  // Traverse left subtree
        preorderTraversal(tree, 2 * index + 2);  // Traverse right subtree
    }
    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Example Traversals:
    
    Tree: 
        1
       / \
      2   3
     / \
    4   5

    Array: [1, 2, 3, 4, 5]

    Preorder Sequence: 1 -> 2 -> 4 -> 5 -> 3
    Inorder Sequence: 4 -> 2 -> 5 -> 1 -> 3
    Postorder Sequence: 4 -> 5 -> 2 -> 3 -> 1
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson7_subs[5],
                        title = "Importance of Array Representation",
                        description = "Understand why array representation is important and its applications in binary trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Array representation of binary trees is crucial for simplifying tree operations and reducing memory overhead. It minimizes memory usage by avoiding extra pointers for child and parent links, allows instantaneous access to any node or its children/parent using index calculations, and simplifies traversal algorithms due to predictable index relationships. This approach is widely used in implementing heaps, tree-based search algorithms, and compact data storage techniques."
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
                id = DSAAdvancedStageIds.lesson8,
                title = "Binary Search Trees (BSTs)",
                description = "Dive deep into binary search trees, their properties, and efficient operations for data management. 🌲",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[0],
                        title = "Introduction to Binary Search Trees",
                        description = "Understand the basics of binary search trees and their unique properties.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        A Binary Search Tree (BST) is a special type of binary tree where:
                        1. Each node contains a key.
                        2. The left subtree of a node contains keys smaller than the node's key.
                        3. The right subtree of a node contains keys larger than the node's key.
                        4. Both subtrees must also be BSTs.
                        """,
                                    listOf(
                                        "Binary Search Tree",
                                        "key",
                                        "left subtree",
                                        "right subtree"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Advantages:
                        - Allows efficient searching, insertion, and deletion.
                        - Inorder traversal gives a sorted sequence of keys.
                        """,
                                    listOf("efficient searching", "inorder traversal")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Example Structure:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                            Example BST:
                                  10
                                 /  \
                                5   20
                               / \
                              2   8
                        """
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[1],
                        title = "Manual Walkthrough of a Binary Search Tree (BST)",
                        description = "Manually create and understand the array representation of a Binary Search Tree (BST).",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's manually create a Binary Search Tree (BST) and represent it using an array.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1"))),
                            ContentBlock.Text(createSimpleText("Define the Binary Search Tree (BST) structure. A BST is a binary tree where each node satisfies the property:")),
                            ContentBlock.Text(createSimpleText("For a node with value `X`, all values in the left subtree are less than `X` and all values in the right subtree are greater than `X`.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2"))),
                            ContentBlock.Text(createSimpleText("Insert values into the BST by comparing each value to the current node and deciding whether to go left or right.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3"))),
                            ContentBlock.Text(createSimpleText("List the nodes level by level (from top to bottom and left to right), ensuring the BST structure is preserved.")),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4"))),
                            ContentBlock.Text(createSimpleText("Fill an array where index 0 represents the root, index 1 is the left child, and index 2 is the right child, and so on. This array representation is not always ideal for BSTs, but it's useful for understanding structure.")),

                            ContentBlock.Text(createSimpleText("Example BST:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
          10
         /  \
        5    15
       / \     \
      2   7     20
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Array Representation: [10, 5, 15, 2, 7, null, 20]")),
                            ContentBlock.Text(createSimpleText("Note: `null` is used to represent absent nodes to preserve the structure in the array representation.")),

                            ContentBlock.Text(createSimpleText("This representation simplifies visualization but is less practical for dynamic operations like insertions and deletions in a BST. Understanding this can help bridge concepts between BSTs and heaps.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[2],
                        title = "Basic Operations on Binary Search Trees (Array Implementation)",
                        description = "Learn how to perform insertion, deletion, and search operations using an array-based Binary Search Tree (BST) representation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Array-based BST Operations:\n" +
                                            "1. Insertion: Place the new value in the appropriate position following BST properties.\n" +
                                            "2. Deletion: Remove a value while preserving BST properties.\n" +
                                            "3. Searching: Traverse the array to find a specific value, considering BST rules.",
                                    listOf(
                                        "Array-based BST Operations",
                                        "Insertion",
                                        "Deletion",
                                        "Searching"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
        // Example: Array-based BST Operations
        int[] bst = new int[7]; // Binary Search Tree array
        
        // Insertion
        bst[0] = 10; // Root
        bst[1] = 5;  // Left child of root
        bst[2] = 15; // Right child of root
        
        // Deletion (simple example: replacing with the last element)
        bst[1] = bst[2];
        bst[2] = -1; // Set last node to null/-1
        
        // Searching
        for (int i = 0; i < bst.length; i++) {
            if (bst[i] == 15) {
                System.out.println("Found at index: " + i);
            }
        }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[3],
                        title = "How Binary Search Tree Operations Work: Array Implementation Focus",
                        description = "Detailed step-by-step breakdown of insertion, deletion, and traversal operations in Binary Search Trees (BSTs) using array representation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the operations on Binary Search Trees (BSTs) step-by-step to understand their mechanics, focusing on array implementation."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Array Representation of Binary Search Trees:",
                                    listOf("Array Representation")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    A Binary Search Tree (BST) can be represented as an array where:
    1. The root node is stored at index 0.
    2. For a node at index `i`:
       a. Left child is at index `2*i + 1`.
       b. Right child is at index `2*i + 2`.
    3. Parent of a node at index `i` is at index `(i-1)/2` (integer division).
    4. Values follow BST rules: left < parent < right.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Compare the new value with the current node.
    2. If the new value is smaller, move to the left child; otherwise, move to the right child.
    3. Repeat until an empty position is found.
    4. Insert the value at the first available position while maintaining BST properties.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    1. Locate the node to be deleted.
    2. Replace the node:
       a. If it has no children, simply remove it.
       b. If it has one child, replace it with its child.
       c. If it has two children, replace it with its in-order successor or predecessor.
    3. Adjust the tree to maintain BST properties.
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
    Traversal in BSTs follows the array indices and BST rules:
    1. Preorder: Access the current node, then traverse left and right subtrees.
    2. Inorder: Traverse the left subtree, access the current node, then traverse the right subtree.
    3. Postorder: Traverse left and right subtrees, then access the current node.
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
                                    "Search for a value by starting at the root. Compare the value with the current node, and move left or right based on the BST property until the value is found or the tree is exhausted."
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example Code for Inorder Traversal
void inorderTraversal(int[] bst, int index) {
    if (index >= bst.length || bst[index] == -1) return;
    inorderTraversal(bst, 2 * index + 1);  // Traverse left subtree
    System.out.print(bst[index] + " ");   // Access the current node
    inorderTraversal(bst, 2 * index + 2);  // Traverse right subtree
}
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[4],
                        title = "How to Represent Binary Search Trees: Array Implementation",
                        description = "Understand the basics of Binary Search Trees (BSTs) and how to represent them using an array-based approach.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "A Binary Search Tree (BST) is a hierarchical data structure where each node has at most two children. The left subtree contains nodes with values smaller than the parent, and the right subtree contains nodes with values larger than the parent."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    In an array representation of BSTs:
    1. The root node is stored at index 0.
    2. For a node at index `i`:
       a. The left child is stored at index `2*i + 1`.
       b. The right child is stored at index `2*i + 2`.
    3. The parent of a node at index `i` is located at index `(i-1)/2` (integer division).
    This representation simplifies BST operations like insertion and traversal, especially when the tree is complete.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example of Array Representation of a BST:
    // BST:
    //        4
    //       / \
    //      2   6
    //     / \   \
    //    1   3   7
    //
    // Array: [4, 2, 6, 1, 3, -1, 7]

    // Index Relations:
    // Root (4) - Index 0
    // Left Child of 4 (2) - Index 1
    // Right Child of 4 (6) - Index 2
    // Left Child of 2 (1) - Index 3
    // Right Child of 2 (3) - Index 4
    // Right Child of 6 (7) - Index 6
    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Traversal in BST (Array Representation):
    1. Preorder: Start from the root and recursively traverse left and right subtrees.
    2. Inorder: Traverse the left subtree, then visit the root, followed by the right subtree (yields sorted order in BST).
    3. Postorder: Traverse the left and right subtrees first, then visit the root.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example Code for Inorder Traversal:
    void inorderTraversal(int[] bst, int index) {
        if (index >= bst.length || bst[index] == -1) return; // Check boundary and null
        inorderTraversal(bst, 2 * index + 1);  // Traverse left subtree
        System.out.print(bst[index] + " ");  // Visit the current node
        inorderTraversal(bst, 2 * index + 2);  // Traverse right subtree
    }
    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Example Traversals:
    
    BST: 
        4
       / \
      2   6
     / \   \
    1   3   7

    Array: [4, 2, 6, 1, 3, -1, 7]

    Preorder Sequence: 4 -> 2 -> 1 -> 3 -> 6 -> 7
    Inorder Sequence: 1 -> 2 -> 3 -> 4 -> 6 -> 7 (sorted)
    Postorder Sequence: 1 -> 3 -> 2 -> 7 -> 6 -> 4
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[5],
                        title = "Importance of Array Representation in Binary Search Trees",
                        description = "Understand why array representation is important and its applications in Binary Search Trees (BSTs).",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Array representation of Binary Search Trees (BSTs) simplifies operations like traversal, searching, and insertion. It leverages the ordered nature of BSTs to enable efficient data access and manipulation. By avoiding extra pointers for child and parent links, this approach reduces memory overhead. It is particularly useful in applications like heaps, search optimization, and compact data storage techniques where maintaining order is crucial."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 9
            Lesson(
                id = DSAAdvancedStageIds.lesson9,
                title = "AVL Trees",
                description = "Explore AVL Trees, their properties, and how they maintain balance for efficient data management. 🌲",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[0],
                        title = "Introduction to AVL Trees",
                        description = "Learn the fundamentals of AVL Trees and their balancing mechanism.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        An AVL Tree is a self-balancing Binary Search Tree (BST) where:
                        1. The height difference (balance factor) between the left and right subtrees of any node is at most 1.
                        2. Balancing is achieved through rotations during insertions and deletions.
                        """,
                                    listOf("AVL Tree", "balance factor", "rotations")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Advantages:
                        - Ensures O(log N) height, making operations like search, insertion, and deletion consistently efficient.
                        - Prevents worst-case scenarios of skewed BSTs.
                        """,
                                    listOf("O(log N)", "search", "insertion", "deletion")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Example Structure:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                        Example AVL Tree:
                                  30
                                 /  \
                               20    40
                              /        \
                            10         50
                        """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[1],
                        title = "Manual Walkthrough of an AVL Tree",
                        description = "Manually create and understand the balance property and array representation of an AVL Tree.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's manually create an AVL Tree and understand its balance property.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1"))),
                            ContentBlock.Text(createSimpleText("Define the AVL Tree structure. An AVL Tree is a self-balancing Binary Search Tree (BST) where the height difference between the left and right subtrees of any node (the balance factor) is at most 1.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2"))),
                            ContentBlock.Text(createSimpleText("Insert values into the AVL Tree while maintaining the BST property. After each insertion, check the balance factor of every node.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3"))),
                            ContentBlock.Text(createSimpleText("If the balance factor of a node exceeds 1 or falls below -1, apply rotations to restore balance. Types of rotations: LL, RR, LR, RL.")),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4"))),
                            ContentBlock.Text(createSimpleText("List the nodes level by level (from top to bottom and left to right), ensuring the AVL Tree remains balanced.")),

                            ContentBlock.Text(createAnnotatedText("Step 5:", listOf("Step 5"))),
                            ContentBlock.Text(createSimpleText("Optionally, represent the tree using an array where index 0 represents the root, index 1 is the left child, and index 2 is the right child, and so on. This is not commonly used for AVL Trees but can help visualize the structure.")),

                            ContentBlock.Text(createSimpleText("Example AVL Tree:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
          10
         /  \
        5    20
       / \   / \
      2   7 15  25
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Array Representation: [10, 5, 20, 2, 7, 15, 25]")),

                            ContentBlock.Text(createSimpleText("Let's demonstrate insertion and rotations to maintain balance in an AVL Tree:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Example:
                Insert values: [10, 20, 30]
                
                Step 1: Insert 10:
                Tree:
                      10
                
                Step 2: Insert 20:
                Tree:
                      10
                        \
                        20
                
                Step 3: Insert 30 (Unbalanced: Balance Factor of root = -2):
                Apply RR Rotation:
                      20
                     /  \
                    10   30
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("This representation helps understand how AVL Trees maintain balance during insertions and deletions while ensuring efficient operations.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[2],
                        title = "Balancing AVL Trees with Rotations",
                        description = "Understand how AVL Trees maintain balance using rotations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Rotations are used to restore balance in AVL Trees when nodes are added or removed. Types of rotations:"
                                )
                            ),
                            ContentBlock.Text(createSimpleText("1. Single Right Rotation (LL Rotation)")),
                            ContentBlock.Code(
                                """
                    // Example of LL Rotation:
                    // Before Rotation:
                          30
                         /
                        20
                       /
                      10
                    
                    // After Rotation:
                          20
                         /  \
                        10   30
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("2. Single Left Rotation (RR Rotation)")),
                            ContentBlock.Code(
                                """
                    // Example of RR Rotation:
                    // Before Rotation:
                          10
                            \
                            20
                              \
                              30
                    
                    // After Rotation:
                          20
                         /  \
                        10   30
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("3. Left-Right Rotation (LR Rotation)")),
                            ContentBlock.Code(
                                """
                    // Example of LR Rotation:
                    // Before Rotation:
                          30
                         /
                        10
                          \
                          20
                    
                    // After Rotation:
                          20
                         /  \
                        10   30
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("4. Right-Left Rotation (RL Rotation)")),
                            ContentBlock.Code(
                                """
                    // Example of RL Rotation:
                    // Before Rotation:
                          10
                            \
                            30
                           /
                          20
                    
                    // After Rotation:
                          20
                         /  \
                        10   30
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[3],
                        title = "Basic Operations on AVL Trees",
                        description = "Learn how to perform insertion, deletion, and search operations in AVL Trees, ensuring balanced tree structures.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "AVL Tree Operations:\n" +
                                            "1. Insertion: Add nodes while maintaining the balance property.\n" +
                                            "2. Deletion: Remove nodes and rebalance the tree if necessary.\n" +
                                            "3. Searching: Traverse the tree to find specific values efficiently.",
                                    listOf(
                                        "AVL Tree Operations",
                                        "Insertion",
                                        "Deletion",
                                        "Searching"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: AVL Tree Node Structure and Operations
            class AVLNode {
                int key, height;
                AVLNode left, right;
                AVLNode(int key) {
                    this.key = key;
                    this.height = 1;
                }
            }
            
            // Get the height of a node
            int height(AVLNode node) {
                return node == null ? 0 : node.height;
            }
            
            // Rotate operations
            AVLNode rightRotate(AVLNode y) {
                AVLNode x = y.left;
                AVLNode T2 = x.right;
                
                // Perform rotation
                x.right = y;
                y.left = T2;
                
                // Update heights
                y.height = Math.max(height(y.left), height(y.right)) + 1;
                x.height = Math.max(height(x.left), height(x.right)) + 1;
                
                return x; // Return new root
            }
            
            AVLNode leftRotate(AVLNode x) {
                AVLNode y = x.right;
                AVLNode T2 = y.left;
                
                // Perform rotation
                y.left = x;
                x.right = T2;
                
                // Update heights
                x.height = Math.max(height(x.left), height(x.right)) + 1;
                y.height = Math.max(height(y.left), height(y.right)) + 1;
                
                return y; // Return new root
            }
            
            // Balance factor
            int getBalance(AVLNode node) {
                return node == null ? 0 : height(node.left) - height(node.right);
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[4],
                        title = "How AVL Tree Operations Work",
                        description = "Detailed step-by-step breakdown of insertion, deletion, rotation, and traversal operations in AVL Trees.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down AVL Tree operations step-by-step to understand how balancing and rotations ensure efficient performance."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "AVL Tree Basics:",
                                    listOf("AVL Tree Basics")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. AVL Trees are height-balanced binary search trees.
                2. For every node, the difference in height between its left and right subtrees is at most 1.
                3. Rotations (left, right, left-right, right-left) are used to restore balance.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Insertion:",
                                    listOf("Insertion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Insert a new node using standard BST insertion.
                2. Calculate the balance factor of each ancestor node.
                3. Apply rotations to maintain balance:
                   a. Left-Left (LL) case: Perform a single right rotation.
                   b. Right-Right (RR) case: Perform a single left rotation.
                   c. Left-Right (LR) case: Perform a left rotation, followed by a right rotation.
                   d. Right-Left (RL) case: Perform a right rotation, followed by a left rotation.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Deletion:",
                                    listOf("Deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Locate and remove the node using standard BST deletion.
                2. Update the height of affected nodes.
                3. Rebalance the tree by applying rotations as needed.
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
                Traversal methods in AVL Trees are the same as in BSTs:
                1. Preorder: Access the current node, then traverse left and right subtrees.
                2. Inorder: Traverse the left subtree, access the current node, then traverse the right subtree.
                3. Postorder: Traverse left and right subtrees, then access the current node.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example Code: AVL Tree Insertion with Rotations
            AVLNode insert(AVLNode node, int key) {
                // Standard BST insertion
                if (node == null) return new AVLNode(key);
                if (key < node.key) node.left = insert(node.left, key);
                else if (key > node.key) node.right = insert(node.right, key);
                else return node; // Duplicate keys not allowed
                
                // Update height
                node.height = 1 + Math.max(height(node.left), height(node.right));
                
                // Get balance factor
                int balance = getBalance(node);
                
                // Perform rotations
                if (balance > 1 && key < node.left.key) return rightRotate(node);
                if (balance < -1 && key > node.right.key) return leftRotate(node);
                if (balance > 1 && key > node.left.key) {
                    node.left = leftRotate(node.left);
                    return rightRotate(node);
                }
                if (balance < -1 && key < node.right.key) {
                    node.right = rightRotate(node.right);
                    return leftRotate(node);
                }
                
                return node; // Return unchanged node if balanced
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[5],
                        title = "How to Represent AVL Trees",
                        description = "Understand the structure of AVL Trees and their unique properties that ensure balanced binary search operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "An AVL Tree is a self-balancing binary search tree where the difference between the heights of the left and right subtrees of any node is at most one. This property ensures that AVL Trees remain balanced, leading to efficient search, insertion, and deletion operations."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Key Properties of AVL Trees:
    1. Each node stores an additional piece of information: its height.
    2. The balance factor of a node is calculated as the height of the left subtree minus the height of the right subtree.
    3. If the balance factor is not in the range [-1, 0, 1], rotations are performed to restore balance.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example: AVL Tree Rotations and Balance
    class AVLNode {
        int value;
        int height;
        AVLNode left, right;

        AVLNode(int value) {
            this.value = value;
            this.height = 1;
        }
    }

    int getHeight(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    int getBalanceFactor(AVLNode node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    // Update height of a node
    void updateHeight(AVLNode node) {
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Example:
        Insert nodes 10, 20, 30 into an empty AVL Tree.
        1. Insert 10: No imbalance.
        2. Insert 20: No imbalance.
        3. Insert 30: Balance factor of node 10 becomes -2, triggering a left rotation.
        The AVL Tree balances itself automatically after each insertion or deletion.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[6],
                        title = "Importance of AVL Trees",
                        description = "Learn why AVL Trees are critical for maintaining efficient operations in dynamic datasets.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "AVL Trees ensure that the height of the tree remains logarithmic in the number of nodes. This guarantees efficient operations like searching, insertion, and deletion with a time complexity of O(log n)."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Applications of AVL Trees:
    1. Database Indexing: AVL Trees provide fast data retrieval by maintaining a balanced structure.
    2. Memory Management: Used in dynamic memory allocation to quickly find free memory blocks.
    3. Networking: In routing algorithms where balanced data structures optimize pathfinding.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 10
            Lesson(
                id = DSAAdvancedStageIds.lesson10,
                title = "Graphs: Concepts and Traversals",
                description = "Explore graph theory, its types, and algorithms for traversal like BFS and DFS. 🌐",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[0],
                        title = "Introduction to Graphs",
                        description = "Learn the basics of graph theory, including terminology and common types of graphs.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                A graph is a data structure consisting of:
                1. Nodes (or vertices) that represent entities.
                2. Edges that represent connections or relationships between the nodes.
                """,
                                    listOf("graph", "nodes", "edges")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Types of Graphs:
                - Undirected: Edges have no direction.
                - Directed (Digraph): Edges have a specific direction.
                - Weighted: Edges have weights representing cost or distance.
                - Unweighted: All edges are considered equal.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Graph Representation
            // Adjacency List for an undirected graph:
            // 0 - 1 - 2
            //     |
            //     3
            
            val graph = mutableMapOf(
                0 to listOf(1),
                1 to listOf(0, 2, 3),
                2 to listOf(1),
                3 to listOf(1)
            )
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[1],
                        title = "Manual Walkthrough of a Graph",
                        description = "Manually create and understand the structure and representation of a Graph.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("Let's manually create a Graph and understand its structure and different representations.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1"))),
                            ContentBlock.Text(createSimpleText("Define the Graph structure. A Graph consists of vertices (nodes) and edges (connections between nodes). Graphs can be directed or undirected, and weighted or unweighted.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2"))),
                            ContentBlock.Text(createSimpleText("Create a Graph by adding vertices and connecting them with edges. Specify whether the edges are directed or undirected and whether they have weights.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3"))),
                            ContentBlock.Text(createSimpleText("Choose a representation for the Graph. Common representations include:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                - Adjacency Matrix: A 2D array where the value at [i][j] indicates the presence and weight of an edge between vertex i and vertex j.
                - Adjacency List: A collection where each vertex stores a list of its connected vertices and their edge weights.
                - Edge List: A list of all edges, where each edge is represented as a tuple (start_vertex, end_vertex, weight).
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4"))),
                            ContentBlock.Text(createSimpleText("Visualize the Graph. Draw the vertices and edges to understand the structure and relationships between nodes.")),

                            ContentBlock.Text(createAnnotatedText("Step 5:", listOf("Step 5"))),
                            ContentBlock.Text(createSimpleText("Example of creating and representing a Graph:")),

                            ContentBlock.Text(createSimpleText("Graph:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Vertices: [A, B, C, D]
                Edges:
                - A -> B (Weight: 1)
                - A -> C (Weight: 3)
                - B -> D (Weight: 4)
                - C -> D (Weight: 2)
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Adjacency Matrix:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                  A  B  C  D
                A  0  1  3  0
                B  0  0  0  4
                C  0  0  0  2
                D  0  0  0  0
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Adjacency List:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                A: [(B, 1), (C, 3)]
                B: [(D, 4)]
                C: [(D, 2)]
                D: []
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Edge List:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                [(A, B, 1), (A, C, 3), (B, D, 4), (C, D, 2)]
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Understanding these representations helps analyze the Graph's properties and apply algorithms like BFS, DFS, Dijkstra's, and more.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[2],
                        title = "Basic Operations on Graphs",
                        description = "Learn how to perform essential operations like adding vertices, adding edges, and traversing a Graph using BFS and DFS.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Operations:\n" +
                                            "1. Add Vertex: Introduce a new node into the graph.\n" +
                                            "2. Add Edge: Connect two vertices with an edge (directed or undirected).\n" +
                                            "3. BFS Traversal: Explore the graph level by level starting from a given vertex.\n" +
                                            "4. DFS Traversal: Explore as deep as possible in the graph starting from a given vertex.",
                                    listOf(
                                        "Graph Operations",
                                        "Add Vertex",
                                        "Add Edge",
                                        "BFS Traversal",
                                        "DFS Traversal"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Graph Representation and Operations
            import java.util.*;

            class Graph {
                private int vertices; // Number of vertices
                private LinkedList<Integer>[] adjList; // Adjacency list

                // Constructor
                Graph(int vertices) {
                    this.vertices = vertices;
                    adjList = new LinkedList[vertices];
                    for (int i = 0; i < vertices; i++) {
                        adjList[i] = new LinkedList<>();
                    }
                }

                // Add an edge
                void addEdge(int src, int dest) {
                    adjList[src].add(dest); // For directed graph
                    // Uncomment the next line for undirected graph
                    // adjList[dest].add(src);
                }

                // BFS Traversal
                void bfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    Queue<Integer> queue = new LinkedList<>();
                    
                    visited[start] = true;
                    queue.add(start);
                    
                    while (!queue.isEmpty()) {
                        int vertex = queue.poll();
                        System.out.print(vertex + " ");
                        
                        for (int neighbor : adjList[vertex]) {
                            if (!visited[neighbor]) {
                                visited[neighbor] = true;
                                queue.add(neighbor);
                            }
                        }
                    }
                }

                // DFS Traversal
                void dfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    dfsUtil(start, visited);
                }

                private void dfsUtil(int vertex, boolean[] visited) {
                    visited[vertex] = true;
                    System.out.print(vertex + " ");
                    
                    for (int neighbor : adjList[vertex]) {
                        if (!visited[neighbor]) {
                            dfsUtil(neighbor, visited);
                        }
                    }
                }
            }

            // Example Usage:
            public static void main(String[] args) {
                Graph graph = new Graph(5); // 5 vertices: 0, 1, 2, 3, 4
                graph.addEdge(0, 1);
                graph.addEdge(0, 2);
                graph.addEdge(1, 3);
                graph.addEdge(2, 4);

                System.out.println("BFS starting from vertex 0:");
                graph.bfs(0);

                System.out.println("\nDFS starting from vertex 0:");
                graph.dfs(0);
            }
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[3],
                        title = "How Graph Operations Work",
                        description = "Detailed step-by-step breakdown of graph operations like adding vertices, adding edges, and performing graph traversals using BFS and DFS.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the essential graph operations step-by-step to understand how graph traversal techniques like BFS and DFS help explore graphs."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Basics:",
                                    listOf("Graph Basics")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. A graph consists of vertices (nodes) and edges (connections between nodes).
                2. Graphs can be either directed or undirected.
                3. The adjacency list or adjacency matrix is used to represent graphs.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Adding Vertices and Edges:",
                                    listOf("Adding Vertices", "Adding Edges")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Adding a vertex: A new node is introduced into the graph.
                2. Adding an edge: A connection (edge) is established between two vertices.
                3. For directed graphs, edges have a direction from one vertex to another.
                4. For undirected graphs, edges connect two vertices without a direction.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Traversal:",
                                    listOf("Graph Traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Graph traversal involves visiting all vertices and edges in a specific manner. The most common traversal techniques are:
                1. **BFS (Breadth-First Search):** Explores level by level, visiting all nodes at the current level before moving to the next.
                2. **DFS (Depth-First Search):** Explores as deeply as possible along each branch before backtracking.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example Code: Graph Traversal Using BFS and DFS
            import java.util.*;

            class Graph {
                private int vertices; // Number of vertices
                private LinkedList<Integer>[] adjList; // Adjacency list

                // Constructor
                Graph(int vertices) {
                    this.vertices = vertices;
                    adjList = new LinkedList[vertices];
                    for (int i = 0; i < vertices; i++) {
                        adjList[i] = new LinkedList<>();
                    }
                }

                // Add an edge
                void addEdge(int src, int dest) {
                    adjList[src].add(dest); // For directed graph
                    // Uncomment the next line for undirected graph
                    // adjList[dest].add(src);
                }

                // BFS Traversal
                void bfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    Queue<Integer> queue = new LinkedList<>();
                    
                    visited[start] = true;
                    queue.add(start);
                    
                    while (!queue.isEmpty()) {
                        int vertex = queue.poll();
                        System.out.print(vertex + " ");
                        
                        for (int neighbor : adjList[vertex]) {
                            if (!visited[neighbor]) {
                                visited[neighbor] = true;
                                queue.add(neighbor);
                            }
                        }
                    }
                }

                // DFS Traversal
                void dfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    dfsUtil(start, visited);
                }

                private void dfsUtil(int vertex, boolean[] visited) {
                    visited[vertex] = true;
                    System.out.print(vertex + " ");
                    
                    for (int neighbor : adjList[vertex]) {
                        if (!visited[neighbor]) {
                            dfsUtil(neighbor, visited);
                        }
                    }
                }
            }

            // Example Usage:
            public static void main(String[] args) {
                Graph graph = new Graph(5); // 5 vertices: 0, 1, 2, 3, 4
                graph.addEdge(0, 1);
                graph.addEdge(0, 2);
                graph.addEdge(1, 3);
                graph.addEdge(2, 4);

                System.out.println("BFS starting from vertex 0:");
                graph.bfs(0);

                System.out.println("\nDFS starting from vertex 0:");
                graph.dfs(0);
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this example, we first create a graph with 5 vertices and add some edges. Then, we perform BFS and DFS starting from vertex 0.")),

                            ContentBlock.Text(createSimpleText("### BFS Traversal:")),
                            ContentBlock.Text(createSimpleText("BFS explores the graph level by level, visiting all nodes at the current level before moving to the next.")),
                            ContentBlock.Text(createSimpleText("For example, in BFS starting from vertex 0, the traversal order will be: 0, 1, 2, 3, 4.")),

                            ContentBlock.Text(createSimpleText("### DFS Traversal:")),
                            ContentBlock.Text(createSimpleText("DFS explores as deeply as possible along each branch before backtracking.")),
                            ContentBlock.Text(createSimpleText("For example, in DFS starting from vertex 0, the traversal order will be: 0, 1, 3, 2, 4.")),

                            ContentBlock.Text(createSimpleText("Both BFS and DFS are essential graph traversal algorithms used for exploring graphs and solving various graph problems.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[4],
                        title = "How to Represent Graphs",
                        description = "Understand the different ways to represent graphs and their properties, enabling efficient traversal and operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Graphs can be represented in multiple ways depending on the type of graph (directed, undirected, weighted, unweighted). Common representations include adjacency matrix and adjacency list, each having its unique advantages and trade-offs."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Key Properties of Graph Representations:
    1. **Adjacency Matrix**: A 2D array where each cell indicates the presence (or weight) of an edge between two vertices.
    2. **Adjacency List**: A list where each index represents a vertex and contains a list of all adjacent vertices.
    3. The choice of representation depends on the graph's density and the operations you need to perform.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example: Graph Representation
    import java.util.*;

    // Adjacency Matrix Representation
    class AdjacencyMatrixGraph {
        int[][] matrix;
        int vertices;

        AdjacencyMatrixGraph(int vertices) {
            this.vertices = vertices;
            this.matrix = new int[vertices][vertices];
        }

        void addEdge(int src, int dest) {
            matrix[src][dest] = 1; // For weighted graph, set weight instead of 1
            // Uncomment for undirected graph
            // matrix[dest][src] = 1;
        }

        void printMatrix() {
            for (int i = 0; i < vertices; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }
    }

    // Adjacency List Representation
    class AdjacencyListGraph {
        LinkedList<Integer>[] adjList;
        int vertices;

        AdjacencyListGraph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjList[src].add(dest);
            // Uncomment for undirected graph
            // adjList[dest].add(src);
        }

        void printList() {
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + ": ");
                for (int neighbor : adjList[i]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    // Example Usage:
    public static void main(String[] args) {
        // Adjacency Matrix
        AdjacencyMatrixGraph matrixGraph = new AdjacencyMatrixGraph(5);
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 4);
        matrixGraph.addEdge(1, 2);
        matrixGraph.printMatrix();

        // Adjacency List
        AdjacencyListGraph listGraph = new AdjacencyListGraph(5);
        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 4);
        listGraph.addEdge(1, 2);
        listGraph.printList();
    }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Example:
        Represent a graph with 5 vertices and edges:
        - 0 → 1
        - 0 → 4
        - 1 → 2
        
        Using Adjacency Matrix:
        [
            [0, 1, 0, 0, 1],
            [0, 0, 1, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0]
        ]
        
        Using Adjacency List:
        0: 1 4
        1: 2
        2:
        3:
        4:
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[5],
                        title = "Importance of Graphs",
                        description = "Understand the critical role graphs play in representing and solving complex real-world problems across various domains.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Graphs are fundamental data structures that model relationships between entities, making them versatile tools for solving real-world problems in networking, navigation, and data organization. They are used in applications like social networks to represent connections between users, GPS systems for route optimization, web crawling for search engine indexing, and dependency management for build systems or package managers. Graphs also play a crucial role in designing and optimizing communication networks and understanding biological relationships like protein-protein interactions. The key benefits of graphs include their ability to efficiently represent complex relationships, the availability of optimized algorithms like Dijkstra's and Kruskal's for solving critical problems, and their flexibility to model directed and undirected relationships with weighted and unweighted edges."
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
                id = DSAAdvancedStageIds.lesson11,
                title = "Graphs Traversals",
                description = "Learn the core graph traversal techniques, including BFS and DFS, and how to apply them to explore graphs. 🌐",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[0],
                        title = "Introduction to Graph Traversals",
                        description = "Explore the importance of graph traversals and the basic algorithms: BFS (Breadth-First Search) and DFS (Depth-First Search).",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
A graph traversal refers to visiting all the vertices or nodes in a graph. There are two main types of graph traversals:
1. **Breadth-First Search (BFS)**: Explores all vertices at the present depth level before moving on to vertices at the next depth level.
2. **Depth-First Search (DFS)**: Explores as far as possible along each branch before backing up.
                    """,
                                    listOf("BFS", "DFS", "graph traversal")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
BFS is implemented using a queue, where vertices are visited in levels. DFS is typically implemented using recursion or a stack, exploring deeper into the graph before moving to the next branch.
                    """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
// Graph Representation for BFS and DFS
// Adjacency List for an undirected graph:
// 0 - 1 - 2
//     |
//     3

val graph = mutableMapOf(
    0 to listOf(1),
    1 to listOf(0, 2, 3),
    2 to listOf(1),
    3 to listOf(1)
)
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[1],
                        title = "Manual Walkthrough of Graph Traversal",
                        description = "Understand and manually implement Graph Traversal techniques like BFS and DFS.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In this lesson, we will explore Graph Traversal techniques and understand how algorithms like Depth-First Search (DFS) and Breadth-First Search (BFS) work.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1"))),
                            ContentBlock.Text(createSimpleText("Define the Graph structure. A Graph consists of vertices (nodes) and edges (connections between nodes). Graphs can be directed or undirected, and weighted or unweighted.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2"))),
                            ContentBlock.Text(createSimpleText("Create a Graph by adding vertices and connecting them with edges. Specify whether the edges are directed or undirected and whether they have weights.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3"))),
                            ContentBlock.Text(createSimpleText("Choose a representation for the Graph. Common representations include:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                - Adjacency Matrix: A 2D array where the value at [i][j] indicates the presence and weight of an edge between vertex i and vertex j.
                - Adjacency List: A collection where each vertex stores a list of its connected vertices and their edge weights.
                - Edge List: A list of all edges, where each edge is represented as a tuple (start_vertex, end_vertex, weight).
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4"))),
                            ContentBlock.Text(createSimpleText("Visualize the Graph. Draw the vertices and edges to understand the structure and relationships between nodes.")),

                            ContentBlock.Text(createAnnotatedText("Step 5:", listOf("Step 5"))),
                            ContentBlock.Text(createSimpleText("Example of creating and representing a Graph:")),

                            ContentBlock.Text(createSimpleText("Graph:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Vertices: [A, B, C, D]
                Edges:
                - A -> B (Weight: 1)
                - A -> C (Weight: 3)
                - B -> D (Weight: 4)
                - C -> D (Weight: 2)
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Adjacency Matrix:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                  A  B  C  D
                A  0  1  3  0
                B  0  0  0  4
                C  0  0  0  2
                D  0  0  0  0
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Adjacency List:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                A: [(B, 1), (C, 3)]
                B: [(D, 4)]
                C: [(D, 2)]
                D: []
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Edge List:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                [(A, B, 1), (A, C, 3), (B, D, 4), (C, D, 2)]
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Understanding these representations helps analyze the Graph's properties and apply algorithms like BFS, DFS, Dijkstra's, and more.")),

                            // New section for graph traversal algorithms

                            ContentBlock.Text(createAnnotatedText("Step 6:", listOf("Step 6"))),
                            ContentBlock.Text(createSimpleText("Now, let's explore graph traversal techniques. The two most common are Depth-First Search (DFS) and Breadth-First Search (BFS).")),

                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Depth-First Search (DFS):",
                                    listOf("DFS")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("DFS is a traversal algorithm where you start at a node and explore as far as possible along each branch before backtracking.")),
                            ContentBlock.Text(createSimpleText("DFS can be implemented recursively or using a stack.")),
                            ContentBlock.Text(createSimpleText("Example DFS traversal from node A:")),
                            ContentBlock.Text(createSimpleText("DFS: A -> B -> D -> C")),

                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Breadth-First Search (BFS):",
                                    listOf("BFS")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("BFS is a traversal algorithm where you start at a node and explore all its neighbors first, before moving to the next level.")),
                            ContentBlock.Text(createSimpleText("BFS is implemented using a queue.")),
                            ContentBlock.Text(createSimpleText("Example BFS traversal from node A:")),
                            ContentBlock.Text(createSimpleText("BFS: A -> B -> C -> D")),

                            ContentBlock.Text(createSimpleText("Both DFS and BFS are fundamental for exploring graphs and can be applied in various algorithms, such as finding the shortest path or detecting cycles.")),

                            ContentBlock.Text(createSimpleText("Understanding how to traverse a graph helps in solving problems efficiently and is crucial for algorithms like Dijkstra’s, Prim’s, and more.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[2],
                        title = "Basic Graph Traversal Operations",
                        description = "Learn how to perform essential graph traversal operations using BFS and DFS algorithms.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Traversal Operations:\n" +
                                            "1. BFS Traversal: Explore the graph level by level starting from a given vertex.\n" +
                                            "2. DFS Traversal: Explore as deep as possible in the graph starting from a given vertex.",
                                    listOf(
                                        "Graph Traversal Operations",
                                        "BFS Traversal",
                                        "DFS Traversal"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Graph Traversal Using BFS and DFS
            import java.util.*;

            class Graph {
                private int vertices; // Number of vertices
                private LinkedList<Integer>[] adjList; // Adjacency list

                // Constructor
                Graph(int vertices) {
                    this.vertices = vertices;
                    adjList = new LinkedList[vertices];
                    for (int i = 0; i < vertices; i++) {
                        adjList[i] = new LinkedList<>();
                    }
                }

                // Add an edge
                void addEdge(int src, int dest) {
                    adjList[src].add(dest); // For directed graph
                    // Uncomment the next line for undirected graph
                    // adjList[dest].add(src);
                }

                // BFS Traversal
                void bfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    Queue<Integer> queue = new LinkedList<>();
                    
                    visited[start] = true;
                    queue.add(start);
                    
                    while (!queue.isEmpty()) {
                        int vertex = queue.poll();
                        System.out.print(vertex + " ");
                        
                        for (int neighbor : adjList[vertex]) {
                            if (!visited[neighbor]) {
                                visited[neighbor] = true;
                                queue.add(neighbor);
                            }
                        }
                    }
                }

                // DFS Traversal
                void dfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    dfsUtil(start, visited);
                }

                private void dfsUtil(int vertex, boolean[] visited) {
                    visited[vertex] = true;
                    System.out.print(vertex + " ");
                    
                    for (int neighbor : adjList[vertex]) {
                        if (!visited[neighbor]) {
                            dfsUtil(neighbor, visited);
                        }
                    }
                }
            }

            // Example Usage:
            public static void main(String[] args) {
                Graph graph = new Graph(5); // 5 vertices: 0, 1, 2, 3, 4
                graph.addEdge(0, 1);
                graph.addEdge(0, 2);
                graph.addEdge(1, 3);
                graph.addEdge(2, 4);

                System.out.println("BFS starting from vertex 0:");
                graph.bfs(0);

                System.out.println("\nDFS starting from vertex 0:");
                graph.dfs(0);
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this example, we first create a graph with 5 vertices and add some edges. Then, we perform BFS and DFS starting from vertex 0.")),

                            ContentBlock.Text(createSimpleText("### BFS Traversal:")),
                            ContentBlock.Text(createSimpleText("BFS explores the graph level by level, visiting all nodes at the current level before moving to the next.")),
                            ContentBlock.Text(createSimpleText("For example, in BFS starting from vertex 0, the traversal order will be: 0, 1, 2, 3, 4.")),

                            ContentBlock.Text(createSimpleText("### DFS Traversal:")),
                            ContentBlock.Text(createSimpleText("DFS explores as deeply as possible along each branch before backtracking.")),
                            ContentBlock.Text(createSimpleText("For example, in DFS starting from vertex 0, the traversal order will be: 0, 1, 3, 2, 4.")),

                            ContentBlock.Text(createSimpleText("Both BFS and DFS are fundamental traversal algorithms used for exploring graphs and solving problems like finding the shortest path or detecting cycles.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[3],
                        title = "How Graph Traversal Works",
                        description = "Detailed step-by-step breakdown of graph traversal techniques such as BFS and DFS, including graph construction and traversal examples.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the essential graph traversal techniques step-by-step to understand how BFS and DFS help explore graphs."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Basics:",
                                    listOf("Graph Basics")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. A graph consists of vertices (nodes) and edges (connections between nodes).
                2. Graphs can be either directed or undirected.
                3. The adjacency list or adjacency matrix is used to represent graphs.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Construction:",
                                    listOf("Adding Vertices", "Adding Edges")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Adding a vertex: A new node is introduced into the graph.
                2. Adding an edge: A connection (edge) is established between two vertices.
                3. For directed graphs, edges have a direction from one vertex to another.
                4. For undirected graphs, edges connect two vertices without a direction.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Traversal Techniques:",
                                    listOf("Graph Traversal", "BFS", "DFS")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Graph traversal involves visiting all vertices and edges in a specific manner. The most common traversal techniques are:
                1. **BFS (Breadth-First Search):** Explores level by level, visiting all nodes at the current level before moving to the next.
                2. **DFS (Depth-First Search):** Explores as deeply as possible along each branch before backtracking.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example Code: Graph Traversal Using BFS and DFS
            import java.util.*;

            class Graph {
                private int vertices; // Number of vertices
                private LinkedList<Integer>[] adjList; // Adjacency list

                // Constructor
                Graph(int vertices) {
                    this.vertices = vertices;
                    adjList = new LinkedList[vertices];
                    for (int i = 0; i < vertices; i++) {
                        adjList[i] = new LinkedList<>();
                    }
                }

                // Add an edge
                void addEdge(int src, int dest) {
                    adjList[src].add(dest); // For directed graph
                    // Uncomment the next line for undirected graph
                    // adjList[dest].add(src);
                }

                // BFS Traversal
                void bfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    Queue<Integer> queue = new LinkedList<>();
                    
                    visited[start] = true;
                    queue.add(start);
                    
                    while (!queue.isEmpty()) {
                        int vertex = queue.poll();
                        System.out.print(vertex + " ");
                        
                        for (int neighbor : adjList[vertex]) {
                            if (!visited[neighbor]) {
                                visited[neighbor] = true;
                                queue.add(neighbor);
                            }
                        }
                    }
                }

                // DFS Traversal
                void dfs(int start) {
                    boolean[] visited = new boolean[vertices];
                    dfsUtil(start, visited);
                }

                private void dfsUtil(int vertex, boolean[] visited) {
                    visited[vertex] = true;
                    System.out.print(vertex + " ");
                    
                    for (int neighbor : adjList[vertex]) {
                        if (!visited[neighbor]) {
                            dfsUtil(neighbor, visited);
                        }
                    }
                }
            }

            // Example Usage:
            public static void main(String[] args) {
                Graph graph = new Graph(5); // 5 vertices: 0, 1, 2, 3, 4
                graph.addEdge(0, 1);
                graph.addEdge(0, 2);
                graph.addEdge(1, 3);
                graph.addEdge(2, 4);

                System.out.println("BFS starting from vertex 0:");
                graph.bfs(0);

                System.out.println("\nDFS starting from vertex 0:");
                graph.dfs(0);
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this example, we first create a graph with 5 vertices and add some edges. Then, we perform BFS and DFS starting from vertex 0.")),

                            ContentBlock.Text(createSimpleText("### BFS Traversal:")),
                            ContentBlock.Text(createSimpleText("BFS explores the graph level by level, visiting all nodes at the current level before moving to the next.")),
                            ContentBlock.Text(createSimpleText("For example, in BFS starting from vertex 0, the traversal order will be: 0, 1, 2, 3, 4.")),

                            ContentBlock.Text(createSimpleText("### DFS Traversal:")),
                            ContentBlock.Text(createSimpleText("DFS explores as deeply as possible along each branch before backtracking.")),
                            ContentBlock.Text(createSimpleText("For example, in DFS starting from vertex 0, the traversal order will be: 0, 1, 3, 2, 4.")),

                            ContentBlock.Text(createSimpleText("Both BFS and DFS are essential graph traversal algorithms used for exploring graphs and solving various graph problems.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[4],
                        title = "How to Represent Graphs",
                        description = "Understand the different ways to represent graphs and their properties, enabling efficient traversal and operations.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Graphs can be represented in multiple ways depending on the type of graph (directed, undirected, weighted, unweighted). Common representations include adjacency matrix and adjacency list, each having its unique advantages and trade-offs."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Key Properties of Graph Representations:
    1. **Adjacency Matrix**: A 2D array where each cell indicates the presence (or weight) of an edge between two vertices.
    2. **Adjacency List**: A list where each index represents a vertex and contains a list of all adjacent vertices.
    3. The choice of representation depends on the graph's density and the operations you need to perform.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
    // Example: Graph Representation
    import java.util.*;

    // Adjacency Matrix Representation
    class AdjacencyMatrixGraph {
        int[][] matrix;
        int vertices;

        AdjacencyMatrixGraph(int vertices) {
            this.vertices = vertices;
            this.matrix = new int[vertices][vertices];
        }

        void addEdge(int src, int dest) {
            matrix[src][dest] = 1; // For weighted graph, set weight instead of 1
            // Uncomment for undirected graph
            // matrix[dest][src] = 1;
        }

        void printMatrix() {
            for (int i = 0; i < vertices; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }
    }

    // Adjacency List Representation
    class AdjacencyListGraph {
        LinkedList<Integer>[] adjList;
        int vertices;

        AdjacencyListGraph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjList[src].add(dest);
            // Uncomment for undirected graph
            // adjList[dest].add(src);
        }

        void printList() {
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + ": ");
                for (int neighbor : adjList[i]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    // Example Usage:
    public static void main(String[] args) {
        // Adjacency Matrix
        AdjacencyMatrixGraph matrixGraph = new AdjacencyMatrixGraph(5);
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 4);
        matrixGraph.addEdge(1, 2);
        matrixGraph.printMatrix();

        // Adjacency List
        AdjacencyListGraph listGraph = new AdjacencyListGraph(5);
        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 4);
        listGraph.addEdge(1, 2);
        listGraph.printList();
    }
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Example:
        Represent a graph with 5 vertices and edges:
        - 0 → 1
        - 0 → 4
        - 1 → 2
        
        Using Adjacency Matrix:
        [
            [0, 1, 0, 0, 1],
            [0, 0, 1, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0]
        ]
        
        Using Adjacency List:
        0: 1 4
        1: 2
        2:
        3:
        4:
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[5],
                        title = "Importance of Graphs",
                        description = "Understand the critical role graphs play in representing and solving complex real-world problems across various domains.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Graphs are fundamental data structures that model relationships between entities, making them versatile tools for solving real-world problems in networking, navigation, and data organization. They are used in applications like social networks to represent connections between users, GPS systems for route optimization, web crawling for search engine indexing, and dependency management for build systems or package managers. Graphs also play a crucial role in designing and optimizing communication networks and understanding biological relationships like protein-protein interactions. The key benefits of graphs include their ability to efficiently represent complex relationships, the availability of optimized algorithms like Dijkstra's and Kruskal's for solving critical problems, and their flexibility to model directed and undirected relationships with weighted and unweighted edges."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // Lesson 12
            Lesson(
                id = DSAAdvancedStageIds.lesson12,
                title = "Graph Detection",
                description = "Learn how to detect graphs and their properties, including cycle detection and connected components. 🌐",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[0],
                        title = "Introduction to Graph Detection",
                        description = "Explore the importance of detecting graphs and identifying their properties, such as cycles and connectivity.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
Graph detection refers to the process of identifying the existence of specific structures or patterns within a graph. In graph detection, we focus on detecting cycles, connectivity, and other important properties. The key concepts we will cover include:
1. **Cycle Detection**: Identifying if a graph contains cycles (circular paths).
2. **Connected Components**: Identifying if a graph is connected or if it consists of multiple disconnected subgraphs.
                    """,
                                    listOf(
                                        "graph detection",
                                        "cycle detection",
                                        "connected components"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
Graph detection is crucial in understanding the nature of a graph and can be applied to solve problems such as detecting loops in a network, identifying isolated nodes, or checking if a graph is fully connected.
                    """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
// Graph Representation for Cycle Detection and Connected Components
// Adjacency List for an undirected graph:
// 0 - 1 - 2
//     |
//     3

val graph = mutableMapOf(
    0 to listOf(1),
    1 to listOf(0, 2, 3),
    2 to listOf(1),
    3 to listOf(1)
)

// Function to check if a graph has a cycle using DFS
fun hasCycle(graph: Map<Int, List<Int>>): Boolean {
    val visited = mutableSetOf<Int>()
    val recStack = mutableSetOf<Int>()

    fun dfs(v: Int): Boolean {
        if (v in recStack) return true
        if (v in visited) return false

        visited.add(v)
        recStack.add(v)

        for (neighbor in graph[v] ?: emptyList()) {
            if (dfs(neighbor)) return true
        }

        recStack.remove(v)
        return false
    }

    for (vertex in graph.keys) {
        if (dfs(vertex)) return true
    }
    return false
}

// Function to find connected components using DFS
fun findConnectedComponents(graph: Map<Int, List<Int>>): List<List<Int>> {
    val visited = mutableSetOf<Int>()
    val components = mutableListOf<List<Int>>()

    fun dfs(v: Int, component: MutableList<Int>) {
        visited.add(v)
        component.add(v)
        for (neighbor in graph[v] ?: emptyList()) {
            if (neighbor !in visited) dfs(neighbor, component)
        }
    }

    for (vertex in graph.keys) {
        if (vertex !in visited) {
            val component = mutableListOf<Int>()
            dfs(vertex, component)
            components.add(component)
        }
    }

    return components
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this example, we use a graph represented by an adjacency list to detect cycles and find connected components.")),

                            ContentBlock.Text(createSimpleText("### Cycle Detection:")),
                            ContentBlock.Text(createSimpleText("Cycle detection is important for identifying loops in a graph. In the provided example, the `hasCycle` function uses DFS to check for cycles in the graph.")),
                            ContentBlock.Text(createSimpleText("For example, in the graph above, there is no cycle, so the function will return `false`.")),

                            ContentBlock.Text(createSimpleText("### Connected Components:")),
                            ContentBlock.Text(createSimpleText("Connected components are subgraphs in which there is a path between every pair of vertices. The `findConnectedComponents` function helps identify these components in the graph.")),
                            ContentBlock.Text(createSimpleText("For the given graph, it would return a single connected component containing all the vertices.")),

                            ContentBlock.Text(createSimpleText("Both cycle detection and connected component analysis are vital tools for detecting properties within graphs, such as network loops or disconnected subgraphs.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[1],
                        title = "Manual Walkthrough of Graph Detection",
                        description = "Understand and manually implement Graph Detection techniques like Cycle Detection and Connected Components.",
                        contentBlocks = listOf(
                            ContentBlock.Text(createSimpleText("In this lesson, we will explore Graph Detection techniques and understand how algorithms for detecting properties like cycles and connected components work.")),

                            ContentBlock.Text(createAnnotatedText("Step 1:", listOf("Step 1"))),
                            ContentBlock.Text(createSimpleText("Define the Graph structure. A Graph consists of vertices (nodes) and edges (connections between nodes). Graphs can be directed or undirected, and weighted or unweighted.")),

                            ContentBlock.Text(createAnnotatedText("Step 2:", listOf("Step 2"))),
                            ContentBlock.Text(createSimpleText("Create a Graph by adding vertices and connecting them with edges. Specify whether the edges are directed or undirected and whether they have weights.")),

                            ContentBlock.Text(createAnnotatedText("Step 3:", listOf("Step 3"))),
                            ContentBlock.Text(createSimpleText("Choose a representation for the Graph. Common representations include:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                - Adjacency Matrix: A 2D array where the value at [i][j] indicates the presence and weight of an edge between vertex i and vertex j.
                - Adjacency List: A collection where each vertex stores a list of its connected vertices and their edge weights.
                - Edge List: A list of all edges, where each edge is represented as a tuple (start_vertex, end_vertex, weight).
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createAnnotatedText("Step 4:", listOf("Step 4"))),
                            ContentBlock.Text(createSimpleText("Visualize the Graph. Draw the vertices and edges to understand the structure and relationships between nodes.")),

                            ContentBlock.Text(createAnnotatedText("Step 5:", listOf("Step 5"))),
                            ContentBlock.Text(createSimpleText("Example of creating and representing a Graph:")),

                            ContentBlock.Text(createSimpleText("Graph:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Vertices: [A, B, C, D]
                Edges:
                - A -> B (Weight: 1)
                - A -> C (Weight: 3)
                - B -> D (Weight: 4)
                - C -> D (Weight: 2)
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Adjacency Matrix:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                  A  B  C  D
                A  0  1  3  0
                B  0  0  0  4
                C  0  0  0  2
                D  0  0  0  0
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Adjacency List:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                A: [(B, 1), (C, 3)]
                B: [(D, 4)]
                C: [(D, 2)]
                D: []
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Edge List:")),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                [(A, B, 1), (A, C, 3), (B, D, 4), (C, D, 2)]
                """.trimIndent()
                                )
                            ),

                            ContentBlock.Text(createSimpleText("Understanding these representations helps analyze the Graph's properties and apply algorithms like Cycle Detection, Connected Components, and more.")),

                            // New section for graph detection algorithms

                            ContentBlock.Text(createAnnotatedText("Step 6:", listOf("Step 6"))),
                            ContentBlock.Text(createSimpleText("Now, let's explore graph detection techniques. The two most common are Cycle Detection and Finding Connected Components.")),

                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Cycle Detection:",
                                    listOf("Cycle Detection")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Cycle detection is an algorithm used to identify if a graph contains any cycles (circular paths). A cycle occurs when a node is revisited after traversing through other nodes.")),
                            ContentBlock.Text(createSimpleText("Cycle detection can be implemented using Depth-First Search (DFS) or Union-Find algorithms.")),
                            ContentBlock.Text(createSimpleText("Example of cycle detection in a graph:")),
                            ContentBlock.Text(createSimpleText("Graph: A -> B -> C -> D -> A (Cycle detected)")),

                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Connected Components:",
                                    listOf("Connected Components")
                                )
                            ),
                            ContentBlock.Text(createSimpleText("Connected components refer to subgraphs in which there is a path between every pair of vertices. If the graph is disconnected, it will have multiple connected components.")),
                            ContentBlock.Text(createSimpleText("Connected component detection is typically done using DFS or BFS.")),
                            ContentBlock.Text(createSimpleText("Example of finding connected components:")),
                            ContentBlock.Text(createSimpleText("Graph: Components: [A, B, C], [D]")),

                            ContentBlock.Text(createSimpleText("Both cycle detection and connected component detection are essential techniques for analyzing graphs, especially in network analysis and graph theory.")),

                            ContentBlock.Text(createSimpleText("Understanding graph properties like cycles and connectivity is fundamental for solving problems such as detecting deadlocks in systems, finding isolated subgraphs, or determining if a network is fully connected.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[2],
                        title = "Basic Graph Detection Operations",
                        description = "Learn how to perform essential graph detection operations to identify key graph properties like cycles, connectivity, and bipartiteness.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Detection Operations:\n" +
                                            "1. Cycle Detection: Identify whether a graph contains any cycles.\n" +
                                            "2. Connectivity Detection: Check if all vertices are connected in the graph.\n" +
                                            "3. Bipartiteness Detection: Check if a graph can be colored using two colors without any two adjacent vertices sharing the same color.",
                                    listOf(
                                        "Graph Detection Operations",
                                        "Cycle Detection",
                                        "Connectivity Detection",
                                        "Bipartiteness Detection"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                """
            // Example: Graph Detection Operations (Cycle, Connectivity, and Bipartiteness)
            import java.util.*;

            class Graph {
                private int vertices; // Number of vertices
                private LinkedList<Integer>[] adjList; // Adjacency list

                // Constructor
                Graph(int vertices) {
                    this.vertices = vertices;
                    adjList = new LinkedList[vertices];
                    for (int i = 0; i < vertices; i++) {
                        adjList[i] = new LinkedList<>();
                    }
                }

                // Add an edge
                void addEdge(int src, int dest) {
                    adjList[src].add(dest); // For directed graph
                    adjList[dest].add(src); // For undirected graph
                }

                // Detect if the graph has a cycle
                boolean hasCycle() {
                    boolean[] visited = new boolean[vertices];
                    for (int i = 0; i < vertices; i++) {
                        if (!visited[i] && dfsCycle(i, -1, visited)) {
                            return true;
                        }
                    }
                    return false;
                }

                private boolean dfsCycle(int vertex, int parent, boolean[] visited) {
                    visited[vertex] = true;
                    for (int neighbor : adjList[vertex]) {
                        if (!visited[neighbor]) {
                            if (dfsCycle(neighbor, vertex, visited)) {
                                return true;
                            }
                        } else if (neighbor != parent) {
                            return true;
                        }
                    }
                    return false;
                }

                // Check if the graph is connected
                boolean isConnected() {
                    boolean[] visited = new boolean[vertices];
                    dfsConnected(0, visited);
                    for (boolean v : visited) {
                        if (!v) return false;
                    }
                    return true;
                }

                private void dfsConnected(int vertex, boolean[] visited) {
                    visited[vertex] = true;
                    for (int neighbor : adjList[vertex]) {
                        if (!visited[neighbor]) {
                            dfsConnected(neighbor, visited);
                        }
                    }
                }

                // Check if the graph is bipartite
                boolean isBipartite() {
                    int[] color = new int[vertices];
                    Arrays.fill(color, -1);

                    for (int i = 0; i < vertices; i++) {
                        if (color[i] == -1 && !bfsBipartite(i, color)) {
                            return false;
                        }
                    }
                    return true;
                }

                private boolean bfsBipartite(int start, int[] color) {
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(start);
                    color[start] = 0;

                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        for (int neighbor : adjList[node]) {
                            if (color[neighbor] == -1) {
                                color[neighbor] = 1 - color[node];
                                queue.add(neighbor);
                            } else if (color[neighbor] == color[node]) {
                                return false; // Found a conflict
                            }
                        }
                    }
                    return true;
                }
            }

            // Example Usage:
            public static void main(String[] args) {
                Graph graph = new Graph(5); // 5 vertices: 0, 1, 2, 3, 4
                graph.addEdge(0, 1);
                graph.addEdge(1, 2);
                graph.addEdge(2, 0); // Adds a cycle
                graph.addEdge(3, 4);

                System.out.println("Cycle detected: " + graph.hasCycle());
                System.out.println("Graph is connected: " + graph.isConnected());
                System.out.println("Graph is bipartite: " + graph.isBipartite());
            }
            """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this example, we perform operations to detect cycles, connectivity, and bipartiteness in a graph with 5 vertices.")),

                            ContentBlock.Text(createSimpleText("### Cycle Detection:")),
                            ContentBlock.Text(createSimpleText("Cycle detection helps identify whether the graph contains any cycles (i.e., paths that start and end at the same vertex).")),
                            ContentBlock.Text(createSimpleText("For example, in the graph above, there is a cycle between vertices 0, 1, and 2.")),

                            ContentBlock.Text(createSimpleText("### Connectivity Detection:")),
                            ContentBlock.Text(createSimpleText("Connectivity detection checks if all vertices in the graph are reachable from each other.")),
                            ContentBlock.Text(createSimpleText("In the graph above, vertices 0, 1, 2 form one connected component, while 3 and 4 form another.")),

                            ContentBlock.Text(createSimpleText("### Bipartiteness Detection:")),
                            ContentBlock.Text(createSimpleText("Bipartiteness detection checks whether the graph can be colored using two colors such that no two adjacent vertices share the same color.")),
                            ContentBlock.Text(createSimpleText("In the example graph, if we can color the vertices without conflicts, the graph is bipartite.")),

                            ContentBlock.Text(createSimpleText("These graph detection operations are foundational for identifying key properties and solving problems such as cycle detection in network design, graph connectivity, and graph coloring for scheduling problems.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[3],
                        title = "How Graph Detection Works",
                        description = "Detailed step-by-step breakdown of graph detection techniques such as cycle detection, bipartite graph detection, and detecting connected components.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Let's break down the essential graph detection techniques step-by-step to understand how BFS and DFS help detect key properties in graphs."
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Basics:",
                                    listOf("Graph Basics")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. A graph consists of vertices (nodes) and edges (connections between nodes).
                2. Graphs can be either directed or undirected.
                3. The adjacency list or adjacency matrix is used to represent graphs.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Construction:",
                                    listOf("Adding Vertices", "Adding Edges")
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                1. Adding a vertex: A new node is introduced into the graph.
                2. Adding an edge: A connection (edge) is established between two vertices.
                3. For directed graphs, edges have a direction from one vertex to another.
                4. For undirected graphs, edges connect two vertices without a direction.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Graph Detection Techniques:",
                                    listOf(
                                        "Cycle Detection",
                                        "Bipartite Graph Detection",
                                        "Connected Components"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
                Graph detection involves finding important properties of the graph, such as:
                1. **Cycle Detection:** Detect if a graph contains cycles (a path that starts and ends at the same vertex).
                2. **Bipartite Graph Detection:** Detect if a graph can be divided into two disjoint sets where each edge connects a vertex from one set to the other.
                3. **Connected Components Detection:** Detect the distinct subgraphs in an undirected graph where there is a path between every pair of vertices.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example Code: Graph Detection Techniques
import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge
    void addEdge(int src, int dest) {
        adjList[src].add(dest); // For directed graph
        // Uncomment the next line for undirected graph
        // adjList[dest].add(src);
    }

    // Cycle Detection using DFS
    boolean isCyclic() {
        boolean[] visited = new boolean[vertices];
        boolean[] recursionStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (isCyclicUtil(i, visited, recursionStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] recursionStack) {
        if (recursionStack[vertex]) return true;
        if (visited[vertex]) return false;

        visited[vertex] = true;
        recursionStack[vertex] = true;

        for (int neighbor : adjList[vertex]) {
            if (isCyclicUtil(neighbor, visited, recursionStack)) {
                return true;
            }
        }

        recursionStack[vertex] = false;
        return false;
    }

    // Bipartite Graph Detection using BFS
    boolean isBipartite() {
        int[] colors = new int[vertices];
        Arrays.fill(colors, -1); // -1 indicates no color assigned

        for (int i = 0; i < vertices; i++) {
            if (colors[i] == -1 && !bfsCheckBipartite(i, colors)) {
                return false;
            }
        }
        return true;
    }

    private boolean bfsCheckBipartite(int start, int[] colors) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        colors[start] = 0; // Assign initial color

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int neighbor : adjList[vertex]) {
                if (colors[neighbor] == -1) {
                    colors[neighbor] = 1 - colors[vertex]; // Alternate color
                    queue.add(neighbor);
                } else if (colors[neighbor] == colors[vertex]) {
                    return false; // Same color on both ends of an edge
                }
            }
        }
        return true;
    }

    // Connected Components using DFS
    void findConnectedComponents() {
        boolean[] visited = new boolean[vertices];
        int componentCount = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfsConnectedComponent(i, visited);
                componentCount++;
            }
        }

        System.out.println("Number of connected components: " + componentCount);
    }

    private void dfsConnectedComponent(int vertex, boolean[] visited) {
        visited[vertex] = true;

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsConnectedComponent(neighbor, visited);
            }
        }
    }
}

// Example Usage:
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5); // 5 vertices: 0, 1, 2, 3, 4
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        // Detect if graph contains a cycle
        System.out.println("Graph contains cycle: " + graph.isCyclic());

        // Detect if graph is bipartite
        System.out.println("Graph is bipartite: " + graph.isBipartite());

        // Find connected components
        graph.findConnectedComponents();
    }
}
            """.trimIndent()
                            ),
                            ContentBlock.Text(createSimpleText("In this example, we first create a graph with 5 vertices and add some edges. Then, we detect cycles, check if the graph is bipartite, and find connected components.")),

                            ContentBlock.Text(createSimpleText("### Cycle Detection:")),
                            ContentBlock.Text(createSimpleText("Cycle detection identifies if a graph contains a cycle, which is a path that starts and ends at the same vertex.")),
                            ContentBlock.Text(createSimpleText("For example, if a cycle is detected, the graph has a cycle, otherwise, it doesn't.")),

                            ContentBlock.Text(createSimpleText("### Bipartite Graph Detection:")),
                            ContentBlock.Text(createSimpleText("Bipartite graph detection checks if a graph can be divided into two sets such that every edge connects vertices from different sets.")),
                            ContentBlock.Text(createSimpleText("For example, if the graph is bipartite, it means we can color the graph using two colors such that no two adjacent vertices share the same color.")),

                            ContentBlock.Text(createSimpleText("### Connected Components Detection:")),
                            ContentBlock.Text(createSimpleText("Connected components detection finds distinct subgraphs where each subgraph is connected within itself.")),
                            ContentBlock.Text(createSimpleText("For example, if the graph is disconnected, it will have multiple connected components.")),

                            ContentBlock.Text(createSimpleText("These graph detection techniques are essential for solving problems like cycle detection, bipartite graph identification, and finding connected components in a graph.")),
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[4],
                        title = "How to Detect Graph Properties",
                        description = "Understand how to detect various graph properties such as cycles, connected components, and bipartiteness, enabling efficient graph analysis.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Detecting graph properties is crucial for understanding the structure of a graph. In this lesson, we'll cover how to detect properties like cycles, connected components, and whether a graph is bipartite."
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Key Properties to Detect in Graphs:
    1. **Cycles**: A cycle exists if there is a path from a vertex back to itself.
    2. **Connected Components**: A graph is fully connected if there is a path between every pair of vertices.
    3. **Bipartiteness**: A graph is bipartite if its vertices can be divided into two disjoint sets such that no two vertices within the same set are adjacent.
                """.trimIndent()
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example: Graph Detection
import java.util.*;

// Detecting Cycles in a Directed Graph using DFS
class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    // Detect cycle using DFS
    boolean detectCycle() {
        boolean[] visited = new boolean[vertices];
        boolean[] inStack = new boolean[vertices]; // Keeps track of recursion stack

        for (int i = 0; i < vertices; i++) {
            if (detectCycleUtil(i, visited, inStack)) {
                return true;
            }
        }
        return false;
    }

    private boolean detectCycleUtil(int vertex, boolean[] visited, boolean[] inStack) {
        if (inStack[vertex]) return true;
        if (visited[vertex]) return false;

        visited[vertex] = true;
        inStack[vertex] = true;

        for (int neighbor : adjList[vertex]) {
            if (detectCycleUtil(neighbor, visited, inStack)) {
                return true;
            }
        }

        inStack[vertex] = false; // Remove from recursion stack
        return false;
    }

    // Detect connected components (for undirected graph)
    void detectConnectedComponents() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                bfs(i, visited);
                System.out.println();
            }
        }
    }

    private void bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Detect if the graph is bipartite
    boolean isBipartite() {
        int[] colors = new int[vertices];
        Arrays.fill(colors, -1); // -1 means no color assigned

        for (int i = 0; i < vertices; i++) {
            if (colors[i] == -1 && !bfsBipartite(i, colors)) {
                return false;
            }
        }
        return true;
    }

    private boolean bfsBipartite(int start, int[] colors) {
        Queue<Integer> queue = new LinkedList<>();
        colors[start] = 1; // Assign a color

        queue.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int neighbor : adjList[vertex]) {
                if (colors[neighbor] == -1) {
                    // Assign alternate color
                    colors[neighbor] = 1 - colors[vertex];
                    queue.add(neighbor);
                } else if (colors[neighbor] == colors[vertex]) {
                    return false; // Same color, not bipartite
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5); // Create a graph with 5 vertices
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0); // Creating a cycle

        System.out.println("Cycle detected: " + graph.detectCycle());

        graph.detectConnectedComponents();

        System.out.println("Graph is bipartite: " + graph.isBipartite());
    }
}
            """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
    Example Usage:
        In this example, we create a graph with 5 vertices and edges:
        - 0 → 1
        - 1 → 2
        - 2 → 0 (creating a cycle)
        
        The graph will detect if there is a cycle, detect the connected components, and determine if the graph is bipartite.
        
    Cycle Detection:
        The graph contains a cycle since vertex 0, 1, and 2 form a cycle (0 → 1 → 2 → 0).
        
    Connected Components:
        The graph may be split into different components if there are disconnected vertices.

    Bipartiteness:
        The graph is bipartite if it is possible to color it with two colors such that no two adjacent vertices share the same color. In this example, the graph will determine whether the graph can be split into two sets without conflict.
                """.trimIndent()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[5],
                        title = "Importance of Graph Detection",
                        description = "Learn how detecting key properties in graphs, like cycles and connected components, helps optimize solutions in real-world problems.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createSimpleText(
                                    "Graph detection is crucial for identifying key properties such as cycles, connected components, and bipartiteness. These properties help solve real-world problems in networking, routing, social networks, and logistics by optimizing paths, detecting redundant routes, and improving matching tasks like resource allocation. Applications include preventing loops in communication networks, optimizing network performance, identifying groups of related users in social networks, and ensuring efficient resource distribution in logistics."
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    )
                ),
                status = LessonStatus.LOCKED
            ),


            // continue from here


        )
    )
}