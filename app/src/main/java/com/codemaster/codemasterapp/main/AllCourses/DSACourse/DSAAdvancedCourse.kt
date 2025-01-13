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
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
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
                status = LessonStatus.ACTIVE
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
                status = LessonStatus.ACTIVE
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
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Example Preorder Traversal:\n" +
                                            "Consider the binary tree:\n\n" +
                                            """
                1
               / \
              2   3
             / \
            4   5
                        """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Preorder Traversal Sequence:\n" +
                                            "1 -> 2 -> 4 -> 5 -> 3"
                                )
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
                                createSimpleText(
                                    "Example Preorder Traversal:\n" +
                                            """
                Consider the binary tree:

                    1
                   / \
                  2   3
                 / \
                4   5

                Preorder Traversal Sequence:
                1 -> 2 -> 4 -> 5 -> 3
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
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
            Example Preorder Traversal:
            
            Tree:

                1
               / \
              2   3
             / \
            4   5

            Preorder Sequence: 1 -> 2 -> 4 -> 5 -> 3
            """.trimIndent()
                                )
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
                status = LessonStatus.ACTIVE
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
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Example Inorder Traversal:\n" +
                                            "Consider the binary tree:\n\n" +
                                            """
            1
           / \
          2   3
         / \
        4   5
                    """.trimIndent()
                                )
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    "Inorder Traversal Sequence:\n" +
                                            "4 -> 2 -> 5 -> 1 -> 3"
                                )
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
                            ),
                            ContentBlock.Text(
                                createSimpleText(
                                    """
            Example Inorder Traversal:
            
            Tree:

                1
               / \
              2   3
             / \
            4   5

            Inorder Sequence: 4 -> 2 -> 5 -> 1 -> 3
            """.trimIndent()
                                )
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
                                    listOf("array representation", "root", "left child", "right child")
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
                                    listOf("Array-based Operations", "Insertion", "Deletion", "Searching")
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
                title = "Array Representation of Binary Trees",
                description = "Learn about representing binary trees using arrays, their structure, and efficient implementations. 🌳",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson8_subs[0],
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
                                    listOf("array representation", "root", "left child", "right child")
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
                        id = DSAAdvancedStageIds.lesson8_subs[1],
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
                        id = DSAAdvancedStageIds.lesson8_subs[2],
                        title = "Basic Operations on Binary Trees (Array Implementation)",
                        description = "Learn how to perform insertion, deletion, and search operations using an array-based binary tree representation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Array-based Operations:\n" +
                                            "1. Insertion: Add a node to the next available index.\n" +
                                            "2. Deletion: Remove a node by replacing it with the last node and adjusting the array.\n" +
                                            "3. Searching: Traverse the array to find a specific value.",
                                    listOf("Array-based Operations", "Insertion", "Deletion", "Searching")
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

            // Lesson 9
            Lesson(
                id = DSAAdvancedStageIds.lesson9,
                title = "C Pointers",
                description = "Master pointers in C, including creating pointers and their relationship with arrays! 🔑",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[0],
                        title = "Introduction to Pointers",
                        description = "An introduction to what pointers are and why they are important in C programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In C, a pointer is a variable that stores the memory address of another variable.",
                                    listOf("pointer", "memory address")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointers are essential in C programming as they allow direct manipulation of memory, efficient function calls, and dynamic memory allocation.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Understanding pointers helps you better manage memory and work with complex data structures.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example: Basic pointer declaration
int num = 10;
int* ptr;  // Pointer to an integer
ptr = &num;  // 'ptr' now holds the address of 'num'
printf("Value of num using pointer: %d\n", *ptr);
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),

                    // Creating Pointers
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[1],
                        title = "Creating Pointers",
                        description = "Learn how to create pointers and assign them to variables. This is the fundamental step in understanding pointers.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To create a pointer in C, you use the * symbol. A pointer stores the memory address of a variable.",
                                    listOf("pointer", "*")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can assign a pointer the address of a variable using the & operator.",
                                    listOf("&")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A pointer is typically declared as: type* pointerName; .",
                                    listOf("type* pointerName;")
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example: Creating a pointer
int num = 20;
int* ptr;  // Declaring a pointer to an integer
ptr = &num;  // Assign the address of num to ptr

// Display the address and the value stored at that address
printf("Address of num: %p\n", (void*)ptr);  // Prints address
printf("Value at the address: %d\n", *ptr);  // Dereferencing the pointer to get the value
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[2],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What operator is used to get the address of a variable and assign it to a pointer?",
                                incompleteCode = "ptr = ___num;",
                                correctCode = "&",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[3],
                        title = "Pointers & Arrays",
                        description = "Learn how pointers and arrays are closely related in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Arrays and pointers are closely related in C. The name of an array is a constant pointer to its first element.",
                                    listOf("array", "pointer", "constant")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can use pointers to access array elements by incrementing the pointer.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
int arr[] = {1, 2, 3};
int* ptr = arr;  // Pointer to the first element of arr
printf("%d\n", *(ptr + 1));  // Prints the second element of the array
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[4],
                        title = "Pointer Arithmetic",
                        description = "Explore pointer arithmetic and how to manipulate pointer values.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointers in C allow arithmetic operations like addition or subtraction.",
                                    listOf("pointer arithmetic")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "When you increment or decrement a pointer, it moves by the size of the type it points to.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
int arr[] = {1, 2, 3};
int* ptr = arr;
ptr++;  // Moves to the next element of the array
printf("%d\n", *ptr);  // Prints the second element of the array
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[5],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing code to print the third element of the array using pointer arithmetic.",
                                incompleteCode = """
int arr[] = {1, 2, 3};
int* ptr = arr;
printf("%d\n", *(ptr + ___));  // Fill in the blank
                """.trimIndent(),
                                correctCode = "2", // The correct answer is 2 to print the third element (index 2)
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[6],
                        title = "Pointers to Pointers",
                        description = "Understand pointers that point to other pointers and how to work with them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A pointer to a pointer is a pointer that stores the address of another pointer.",
                                    listOf("pointer to pointer", "address", "dereferencing")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can access the value of a pointer to a pointer by dereferencing it twice.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
int num = 10;
int* ptr = &num;
int** ptr2 = &ptr;  // Pointer to pointer
printf("%d\n", **ptr2);  // Dereferencing twice to access num's value
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[7],
                        title = "Pointer & Function Arguments",
                        description = "Learn how to pass pointers to functions and manipulate data through them.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointers are commonly used to pass large structures or arrays to functions, as they allow modification of data directly.",
                                    listOf("pass by pointer")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Passing a pointer to a function allows that function to modify the original data.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
void updateValue(int* ptr) {
    *ptr = 20;  // Changes the value of the variable pointed to
}

int main() {
    int num = 10;
    updateValue(&num);
    printf("Updated value: %d\n", num);  // Prints 20
}
                """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[8],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Fill in the missing part to correctly dereference the pointer to pointer and print the value of 'num'.",
                                incompleteCode = """
int num = 10;
int* ptr = &num;
int** ptr2 = &ptr;  // Pointer to pointer
printf("%d\n", ___);  // Fill in the blank to access 'num' using pointer to pointer
                """.trimIndent(),
                                correctCode = "**ptr2", // Correct answer is dereferencing ptr2 twice
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[9],
                        title = "Real-Life Example of Pointers",
                        description = "Learn how pointers can be used in real-world applications, such as dynamic memory management or handling large data.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointers are used for efficient memory management, especially with large data that shouldn't be copied.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In games or simulations, pointers pass large structures like player data without copying them, improving efficiency.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "For example, passing a player's game state via pointers avoids the overhead of copying data.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """
// Example: Game with player's data
typedef struct {
    int health;
    int score;
    char name[50];
} Player;

void updatePlayerStats(Player* p) {
    p->health -= 10;  // Update health directly
    p->score += 100;   // Update score directly
}

int main() {
    Player player1 = {100, 0, "Alice"};
    updatePlayerStats(&player1);  // Pass pointer
    printf("Updated stats - Health: %d, Score: %d\n", player1.health, player1.score);
}
            """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson9_subs[10],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What does a pointer in C store?",
                                options = listOf(
                                    "The value of a variable",
                                    "The memory address of a variable",
                                    "The size of a variable",
                                    "The name of a variable"
                                ),
                                correctAnswer = "The memory address of a variable",
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
                id = DSAAdvancedStageIds.lesson10,
                title = "C Structures",
                description = "Learn how to use structures (structs) in C to group different types of data.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[0],
                        title = "Introduction to Structures",
                        description = "Understand the basics of structures in C.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Structures allow grouping of different data types into a single unit. It's useful when you need to represent real-world entities.",
                                    listOf("Structures")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """struct StructureName {
    dataType member1;
    dataType member2;
    // more members
};"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[1],
                        title = "Creating a Structure",
                        description = "Learn how to define and initialize a structure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "To create a structure, you define it with the struct keyword and then create an instance of it.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """struct Person {
    char name[50];
    int age;
}; 

int main() {
    struct Person p1;
    p1.age = 25;
    strcpy(p1.name, "Alice");
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[2],
                        title = "Accessing Structure Members",
                        description = "Learn how to access and modify structure members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Structure members can be accessed using the dot operator(.).",
                                    listOf("dot operator", ".")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """struct Person {
    char name[50];
    int age;
}; 

int main() {
    struct Person p1 = {"Alice", 25};
    printf("Name: %s, Age: %d", p1.name, p1.age);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[3],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What keyword is used to define a structure in C?",
                                incompleteCode = """___ Person {
    char name[50];
    int age;
};""",
                                correctCode = "struct",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[4],
                        title = "Nested Structures",
                        description = "Learn how to define structures within structures.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can define a structure inside another structure.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """struct Address {
    char street[100];
    char city[50];
}; 

struct Person {
    char name[50];
    int age;
    struct Address address;
};

int main() {
    struct Person p1;
    strcpy(p1.name, "Alice");
    p1.age = 25;
    strcpy(p1.address.street, "123 Main St");
    strcpy(p1.address.city, "Wonderland");
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[5],
                        title = "Pointers to Structures",
                        description = "Understand how to use pointers with structures.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Pointers can be used to reference structures. To access members via pointers, use the arrow operator (->).",
                                    listOf("Pointers", "->", "arrow operator")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """struct Person {
    char name[50];
    int age;
}; 

int main() {
    struct Person p1 = {"Alice", 25};
    struct Person *ptr = &p1;
    printf("Name: %s, Age: %d", ptr->name, ptr->age);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[6],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What type should the address member in the Person structure be?",
                                incompleteCode = """
struct Person {
    char name[50];
    int age;
   struct ___;
};""",
                                correctCode = "address",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[7],
                        title = "Real-Life Example of Structures",
                        description = "An advanced example of structures with arrays and functions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this example, we'll use structures with arrays and pass them to functions.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>

struct Student {
    char name[50];
    int marks[5];
};

void printStudent(struct Student s) {
    printf("Name: %s\n", s.name);
    printf("Marks: ");
    for(int i = 0; i < 5; i++) {
        printf("%d ", s.marks[i]);
    }
    printf("\\n");
}

int main() {
    struct Student s1 = {"Alice", {80, 90, 85, 70, 95}};
    printStudent(s1);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson10_subs[8],
                        title = "Quiz",
                        description = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Why do we use 'struct' in C programming?",
                                options = listOf(
                                    "To group related data together",
                                    "To create dynamic memory allocation",
                                    "To define classes",
                                    "To handle memory addresses"
                                ),
                                correctAnswer = "To group related data together",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 11
            Lesson(
                id = DSAAdvancedStageIds.lesson11,
                title = "C Files",
                description = "Learn advanced file handling techniques in C, including creating, reading, writing, and closing files.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[0],
                        title = "Introduction to File Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "File handling in C allows programs to perform operations like reading and writing files using file pointers. File handling is crucial for data persistence.",
                                    listOf("file handling", "file pointers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The stdio.h header provides necessary functions for file operations.",
                                    listOf("stdio.h")
                                )
                            ),
                            ContentBlock.Code("#include <stdio.h>")
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[1],
                        title = "Creating a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "The fopen() function is used to create and open files. Mode w writes to a text file, and wb writes to a binary file.",
                                    listOf("fopen()", "writes", "binary")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here’s how you can create a file and write to it.",
                                    listOf()
                                )
                            ),
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
                        id = DSAAdvancedStageIds.lesson11_subs[2],
                        title = "Reading from a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use fopen() in r mode to open files for reading. Functions like fscanf(), fgets(), or fgetc() can retrieve file content.",
                                    listOf("fopen()", "fscanf()", "fgets()", "fgetc()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of reading a file line-by-line:",
                                    listOf()
                                )
                            ),
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
                        id = DSAAdvancedStageIds.lesson11_subs[3],
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the code to create and write to a file using fopen() with write mode.",
                                incompleteCode = """
FILE *file = fopen("example.txt", ___);
if (file == NULL) {
    printf("Error opening file.\n");
    return 1;
}
""",
                                correctCode = "w",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[4],
                        title = "Writing to a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use modes like w (overwrite) or a (append) with fopen() for writing. Functions like fprintf(), fputs(), or fwrite() handle file writing.",
                                    listOf("fopen()", "fprintf()", "fputs()", "fwrite()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Here’s an example of writing to a file:",
                                    listOf()
                                )
                            ),
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
                        id = DSAAdvancedStageIds.lesson11_subs[5],
                        title = "Closing a File",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Use fclose() to close a file and ensure data integrity by flushing buffers.",
                                    listOf("fclose()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example demonstrating file closure:",
                                    listOf()
                                )
                            ),
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
                        id = DSAAdvancedStageIds.lesson11_subs[6],
                        title = "File Error Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Always check file operations for errors. Use functions like ferror() to identify issues.",
                                    listOf("ferror()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example demonstrating error handling during file access:",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>

int main() {
    FILE *file = fopen("nonexistent.txt", "r");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }
    fclose(file);
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[7],
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What mode should be used with fopen() to append content to an existing file?",
                                incompleteCode = "FILE *file = fopen(\"example.txt\", ___);",
                                correctCode = "a",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[8],
                        title = "Real-Life Example of File Handling",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "A real-world application demonstrates managing student records using file handling in C.",
                                    listOf()
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

struct Student {
    char name[50];
    int rollNumber;
    float marks;
};

void addStudent(FILE *file) {
    struct Student s;
    printf("Enter name: ");
    scanf("%s", s.name);
    printf("Enter roll number: ");
    scanf("%d", &s.rollNumber);
    printf("Enter marks: ");
    scanf("%f", &s.marks);
    fwrite(&s, sizeof(struct Student), 1, file);
    printf("Student added successfully.\n");
}

void viewStudents(FILE *file) {
    struct Student s;
    rewind(file);
    while (fread(&s, sizeof(struct Student), 1, file)) {
        printf("Name: %s, Roll Number: %d, Marks: %.2f\n", s.name, s.rollNumber, s.marks);
    }
}

int main() {
    FILE *file = fopen("students.dat", "wb+");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    int choice;
    do {
        printf("1. Add Student\n2. View Students\n3. Exit\nEnter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                addStudent(file);
                break;
            case 2:
                viewStudents(file);
                break;
            case 3:
                fclose(file);
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice.\n");
        }
    } while (choice != 3);

    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson11_subs[9],
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is a file in the context of C programming?",
                                options = listOf(
                                    "A temporary storage used by the program",
                                    "A collection of instructions executed by the CPU",
                                    "A collection of data stored on a storage device",
                                    "A program that helps manage memory"
                                ),
                                correctAnswer = "A collection of data stored on a storage device",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
                status = LessonStatus.ACTIVE
            ),

            // Lesson 12
            Lesson(
                id = DSAAdvancedStageIds.lesson12,
                title = "C Enumeration (enum)",
                description = "Learn advanced techniques for using enums in C, including defining enums, changing their values, and using them in switch statements.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[0],
                        title = "Introduction to Enums",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enums in C are used to define a set of named integer constants. They improve code readability and provide better organization.",
                                    listOf("Enums")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Syntax:", listOf(""))),
                            ContentBlock.Code(
                                """enum EnumName {
    CONSTANT_1,
    CONSTANT_2,
    CONSTANT_3
};"""
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = DSAAdvancedStageIds.lesson12_subs[1],
                        title = "Changing Enum Values",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can change the underlying integer values of an enum. By default, the first value is 0, and each subsequent value increments by 1.",
                                    listOf("0", "1")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>

enum Day { Sunday = 1, Monday = 2, Tuesday = 4, Wednesday = 8, Thursday = 16 };

int main() {
    enum Day today = Tuesday;
    printf("Today is %d\\n", today);
    return 0;
}"""
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In the above code, Sunday starts at 1, Monday at 2, Tuesday at 4, etc.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[2],
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the missing part in code.",
                                incompleteCode = """___ Day {
    Sunday, 
    Monday, 
    Tuesday, 
    Wednesday, 
    Thursday, 
    Friday, 
    Saturday
};""",
                                correctCode = "enum"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[3],
                        title = "Enum in Switch Statement",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Enums work well with switch statements, as you can match specific enum values to execute corresponding code.",
                                    listOf("statements")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = DSAAdvancedStageIds.lesson12_subs[4],
                        title = "Enum with Bit Flags",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You can use enums with bit flags for efficient storage and checking multiple conditions.",
                                    listOf("bit flags")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Bitwise OR | and AND & operations are used to combine or check flags.",
                                    listOf("|", "&")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[5],
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "Complete the switch statement to print the correct message for today (assuming today = Wednesday):",
                                incompleteCode = """enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };

int main() {
    enum ___ today = Wednesday;
    
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
}""",
                                correctCode = "Day"
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[6],
                        title = "Real-life Example of Enums",
                        contentBlocks = listOf(
                            ContentBlock.Text(createAnnotatedText("Enums can represent user roles in a system, improving clarity and managing permissions efficiently.")),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
                            ContentBlock.Code(
                                """#include <stdio.h>

// Enum for user roles
enum UserRole {
    ADMIN,
    MODERATOR,
    USER,
    GUEST
};

void printUserRole(enum UserRole role) {
    switch(role) {
        case ADMIN: printf("Admin privileges\\n"); break;
        case MODERATOR: printf("Moderator privileges\\n"); break;
        case USER: printf("User privileges\\n"); break;
        case GUEST: printf("Guest privileges\\n"); break;
        default: printf("Unknown role\\n");
    }
}

int main() {
    printUserRole(ADMIN);
    printUserRole(GUEST);
    return 0;
}"""
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This example shows how enums make role management and code readability simpler.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson12_subs[7],
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "Which of the following is an example of enum declaration?",
                                options = listOf(
                                    "int days = 7;",
                                    "enum Day { Sunday, Monday, Tuesday };",
                                    "const Day = { Sunday, Monday, Tuesday };",
                                    "Day[] days = { Sunday, Monday, Tuesday };"
                                ),
                                correctAnswer = "enum Day { Sunday, Monday, Tuesday };"
                            )
                        ),
                        type = LessonContentType.QUIZ
                    ),
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 13
            Lesson(
                id = DSAAdvancedStageIds.lesson13,
                title = "C Memory Management",
                description = "Master memory management in C, including dynamic memory allocation, deallocation, and handling memory efficiently.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson13_subs[0],
                        title = "Introduction to Memory Management",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory management in C is a crucial concept that involves managing the allocation, use, and deallocation of memory resources. Efficient memory management ensures optimal performance, prevents memory leaks, and avoids issues like fragmentation.",
                                    listOf("Memory management")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory in C is divided into three sections: the stack, heap, and data segment.",
                                    listOf("stack", "heap")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Stack: Used for local variables, automatically managed, limited size.",
                                    listOf(
                                        "Stack",
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Heap: Used for dynamic memory allocation, manually managed.",
                                    listOf("Heap")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Data Segment: Used for global and static variables.",
                                    listOf("Data Segment")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson13_subs[1],
                        title = "Dynamic Memory Allocation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "C provides functions for dynamic memory allocation, allowing memory to be allocated at runtime.",
                                    listOf("dynamic memory allocation")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Functions:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.malloc(): Allocates uninitialized memory.",
                                    listOf("malloc()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.calloc(): Allocates zero-initialized memory.",
                                    listOf("calloc()")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.realloc(): Resizes previously allocated memory.",
                                    listOf("realloc()")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = DSAAdvancedStageIds.lesson13_subs[2],
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "What is the function used for dynamic memory allocation in C that allocates uninitialized memory?",
                                incompleteCode = """int *arr = (int*)___(5 * sizeof(int));""",
                                correctCode = "malloc",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson13_subs[3],
                        title = "Memory Deallocation",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory allocated dynamically using malloc, calloc, or realloc should be deallocated using free().",
                                    listOf(
                                        "free()",
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Failure to free memory can cause memory leaks, leading to resource wastage.",
                                    listOf("memory leaks")
                                )
                            ),
                            ContentBlock.Text(createAnnotatedText("Example:", listOf(""))),
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
                        id = DSAAdvancedStageIds.lesson13_subs[4],
                        title = "Memory Leaks and Optimization",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Memory leaks occur when dynamically allocated memory is not freed, causing wasted resources and possible application crashes.",
                                    listOf(
                                        "application crashes"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Best Practices:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Always pair malloc/calloc/realloc with free.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Use tools like Valgrind to detect memory leaks.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Consider using smart pointers in C++ to automate memory management.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example of a memory leak:",
                                    listOf("")
                                )
                            ),
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
                        id = DSAAdvancedStageIds.lesson13_subs[5],
                        title = "Quiz",
                        contentBlocks = listOf(
                            InteractiveInputBlock(
                                question = "In the following code, what is the missing step after malloc to avoid a memory leak?",
                                incompleteCode = """int *ptr = (int*)malloc(sizeof(int));  ___(ptr);""",
                                correctCode = "free",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson13_subs[6],
                        title = "Real-Life Memory Management Examples",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Efficient memory management is crucial in large apps like games and browsers.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Memory Pools: Pre-allocate memory for reuse to reduce allocation overhead.",
                                    listOf(
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Games: Memory pools manage textures, reusing memory instead of reallocating it frequently.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Browsers: Allocate memory for tabs, freeing it when closed to ensure smooth performance.",
                                    listOf(
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example: Memory pool for game textures:",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """#include <stdio.h>
#include <stdlib.h>

#define POOL_SIZE 1024
char texture_pool[POOL_SIZE];

void* allocate_texture(size_t size) {
    static size_t offset = 0;
    if (offset + size > POOL_SIZE) return NULL;
    void* ptr = texture_pool + offset;
    offset += size;
    return ptr;
}

int main() {
    char* texture = (char*)allocate_texture(100);
    if (texture == NULL) {
        printf("Texture pool exhausted\\n");
    }
    return 0;
}"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAAdvancedStageIds.lesson13_subs[7],
                        title = "Quiz",
                        contentBlocks = listOf(
                            QuizContentBlock(
                                question = "What is the consequence of failing to free dynamically allocated memory?",
                                options = listOf(
                                    "Memory leaks",
                                    "Segmentation fault",
                                    "Memory fragmentation",
                                    "Out of memory error"
                                ),
                                correctAnswer = "Memory leaks",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE
                    ),
                ),
                status = LessonStatus.LOCKED
            ),

            // continue from here


        )
    )
}