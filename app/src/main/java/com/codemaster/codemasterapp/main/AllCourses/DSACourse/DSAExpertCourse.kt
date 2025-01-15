package com.codemaster.codemasterapp.main.AllCourses.DSACourse


import com.codemaster.codemasterapp.main.AllCourses.DSACourse.courseIds.DSAExpertStageIds
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun DSAExpertCourse(): Stage {
    return Stage(
        id = DSAExpertStageIds.stageId,
        title = "Expert",
        lessons = listOf(

            // lesson 1
            Lesson(
                id = DSAExpertStageIds.lesson1,
                title = "Welcome to Expert DSA Problem Solving",
                description = "Learn how to solve complex problems systematically using advanced DSA concepts, while building projects that challenge your logic and creativity.",
                lessonContents = listOf(
                    LessonContent(
                        id = DSAExpertStageIds.lesson1_subs[0],
                        title = "Introduction to the Expert Stage",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Welcome to the Expert Stage! This is where you'll learn how to systematically break down and solve any problem using advanced data structures and algorithms.",
                                    listOf("Expert Stage", "data structures", "algorithms")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "In this stage, we’ll focus on leveraging DSA concepts to build scalable solutions for real-world problems, honing your problem-solving mindset, and mastering advanced programming techniques.",
                                    listOf(
                                        "DSA concepts",
                                        "problem-solving mindset",
                                        "advanced programming"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Remember, every problem has a solution. The goal is to analyze, strategize, and implement using the right tools and techniques.",
                                    listOf("analyze", "strategize", "implement")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),
                    LessonContent(
                        id = DSAExpertStageIds.lesson1_subs[1],
                        title = "Overview of Projects and Goals",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "This course offers hands-on experience through projects at beginner, intermediate, advanced, and expert levels. Each project focuses on improving your DSA knowledge and its practical applications.",
                                    listOf(
                                        "hands-on experience",
                                        "DSA knowledge",
                                        "practical applications"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Projects you'll tackle include implementing dynamic programming solutions, designing efficient graph algorithms, building real-time processing tools, and creating optimized data management systems.",
                                    listOf(
                                        "dynamic programming solutions",
                                        "graph algorithms",
                                        "real-time processing tools",
                                        "optimized data management systems"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "By the end of this course, you'll have the confidence and skills to approach and solve even the most challenging problems in the field of software development.",
                                    listOf("confidence", "skills", "challenging problems")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE
                    ),
                    LessonContent(
                        id = DSAExpertStageIds.lesson1_subs[2],
                        title = "Why Problem Solving with DSA?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Problem-solving using DSA is about more than just coding—it’s about understanding the underlying principles that make algorithms efficient and data structures powerful.",
                                    listOf(
                                        "problem-solving",
                                        "efficient algorithms",
                                        "powerful data structures"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "With DSA, you can deconstruct complex problems into manageable parts, devise effective strategies, and implement solutions that work seamlessly even with large datasets.",
                                    listOf(
                                        "deconstruct problems",
                                        "effective strategies",
                                        "large datasets"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Whether you’re preparing for interviews, working on cutting-edge projects, or solving everyday coding challenges, DSA will always be your greatest asset.",
                                    listOf(
                                        "interviews",
                                        "cutting-edge projects",
                                        "coding challenges"
                                    )
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
                id = DSAExpertStageIds.lesson2,
                title = "Two Sum Problem",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on the Two Sum problem, providing a walkthrough, solution, and motivation to enhance your problem-solving skills.",
                lessonContents = listOf(
                    // Question
                    LessonContent(
                        id = DSAExpertStageIds.lesson2_subs[0],
                        title = "Problem Statement - Two Sum",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Given an array of integers 'nums' and an integer 'target', return the indices of the two numbers such that they add up to the target.",
                                    listOf("nums", "target")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Example:\nInput: 'nums = [2, 7, 11, 15], target = 9'\nOutput: [0, 1]\nExplanation: Because 'nums[0] + nums[1] == 9'.",
                                    listOf("example", "indices")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson2_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "1.Understand the Problem:\nInput: Array of integers 'nums' and an integer 'target'.\nOutput: Indices of two numbers in the array that add up to 'target'.",
                                    listOf("1.Understand the Problem:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "2.Plan the Approach:\n Iterate through the array while keeping track of visited numbers using a hash map.\nFor each number, calculate the difference 'target - nums[i]'.\nCheck if the difference is already in the hash map. If yes, return the indices. If no, add the current number to the map.",
                                    listOf("2.Plan the Approach:")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "3.Edge Cases:\nWhat if the array has fewer than two elements?\nWhat if no such pair exists?\nHandle cases with duplicate numbers.",
                                    listOf("3.Edge Cases:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson2_subs[2],
                        title = "Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText("""
        Below is the optimized C++ solution for the Two Sum problem. It uses a hash map to achieve O(n) time complexity by storing each element with its index while traversing the array. For every element, its complement (target minus the element) is checked in the hash map. If found, the indices of the pair are returned, making this approach both efficient and straightforward.
        """.trimIndent(),
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    #include <unordered_map>
                    using namespace std;

                    vector<int> twoSum(vector<int>& nums, int target) {
                        unordered_map<int, int> numMap;
                        for (int i = 0; i < nums.size(); ++i) {
                            int complement = target - nums[i];
                            if (numMap.find(complement) != numMap.end()) {
                                return {numMap[complement], i};
                            }
                            numMap[nums[i]] = i;
                        }
                        return {}; // Return empty if no solution exists.
                    }

                    int main() {
                        vector<int> nums = {2, 7, 11, 15};
                        int target = 9;
                        vector<int> result = twoSum(nums, target);
                        if (!result.empty()) {
                            cout << "Indices: " << result[0] << ", " << result[1] << endl;
                        } else {
                            cout << "No solution found!" << endl;
                        }
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson2_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "Congratulations on solving the Two Sum problem! 🎉\n\nHere’s why this is important:\nFoundation for Hashing: You’ve learned to use hash maps for constant-time lookups.\nReal-World Applications: Similar approaches are used in search engines, databases, and more.\n\nKeep going! Each problem you solve builds confidence and mastery. Tackle the next problem to sharpen your skills further.",
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 3
            Lesson(
                id = DSAExpertStageIds.lesson3,
                title = "Merge Two Sorted Arrays",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on merging two sorted arrays without extra space, using the two-pointer technique.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson3_subs[0],
                        title = "Problem Statement - Merge Two Sorted Arrays",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You are given two sorted arrays. Your task is to merge them into a single sorted array without using extra space.",
                                    listOf("")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Example:  
                        Input: arr1 = [1, 3, 5], arr2 = [2, 4, 6] 
                        Output: [1, 2, 3, 4, 5, 6]' 
                        """.trimIndent(),
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson3_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 1: Understand the Problem
                        Input: Two sorted arrays 'arr1' and 'arr2'.  
                        Output: A single merged sorted array.  
                        Constraint: Merge without using extra space.  
                        """.trimIndent(),
                                    listOf("Step 1: Understand the Problem")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 2: Plan the Approach (Two-Pointer Technique)
                        Use two pointers, one for each array.  
                        Compare the elements at the pointers.  
                        Append the smaller element to the result and move the corresponding pointer forward.  
                        If one array is exhausted, append the remaining elements from the other array.  
                        """.trimIndent(),
                                    listOf("Step 2: Plan the Approach (Two-Pointer Technique)")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 3: Edge Cases 
                        One or both arrays are empty.  
                        Arrays of different lengths.  
                        Arrays with duplicate elements.  
                        """.trimIndent(),
                                    listOf("Step 3: Edge Cases ")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                    ),

                    // Optimized Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson3_subs[2],
                        title = "Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText("""
                Below is the C++ code for merging two sorted arrays into a single sorted array. This approach uses two pointers to efficiently compare elements from both arrays, ensuring a linear time complexity of O(n1 + n2). It outputs the merged array directly.
                """.trimIndent(),
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    using namespace std;

                    void mergeArrays(vector<int>& arr1, vector<int>& arr2) {
                        int n1 = arr1.size(), n2 = arr2.size();
                        int i = 0, j = 0;

                        cout << "Merged Array: ";
                        while (i < n1 && j < n2) {
                            if (arr1[i] < arr2[j]) {
                                cout << arr1[i] << " ";
                                i++;
                            } else {
                                cout << arr2[j] << " ";
                                j++;
                            }
                        }
                        
                        // Append remaining elements
                        while (i < n1) cout << arr1[i++] << " ";
                        while (j < n2) cout << arr2[j++] << " ";
                        cout << endl;
                    }

                    int main() {
                        vector<int> arr1 = {1, 3, 5};
                        vector<int> arr2 = {2, 4, 6};
                        mergeArrays(arr1, arr2);
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson3_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Well done on mastering the Merge Two Sorted Arrays problem! 🎉  

                        Why this matters:  
                        Two-Pointer Technique: You’ve learned a fundamental approach for efficient merging.  
                        Memory Optimization: Practicing solutions that avoid extra space is a critical skill for advanced problem-solving.  

                        Keep pushing yourself to solve more challenging problems. Each step brings you closer to becoming a DSA expert! 🚀  
                        """.trimIndent(),
                                    listOf("")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 4
            Lesson(
                id = DSAExpertStageIds.lesson4,
                title = "Middle of Linked List",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on finding the middle node of a singly linked list using the fast and slow pointer approach.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson4_subs[0],
                        title = "Problem Statement - Middle of Linked List",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You are given a singly linked list. Your task is to find the middle node of the list. If there are two middle nodes, return the second one.",
                                    listOf("singly linked list", "middle node")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Example:  
                        Input: '1 -> 2 -> 3 -> 4 -> 5'  
                        Output: '3'  
                        """.trimIndent(),
                                    listOf("example", "input", "output")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson4_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 1: Understand the Problem 
                        Input: A singly linked list.  
                        Output: The middle node of the list.  
                        Note: If there are two middle nodes, return the second one.  
                        """.trimIndent(),
                                    listOf("Step 1: Understand the Problem")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 2: Plan the Approach (Fast and Slow Pointer Technique) 
                        Initialize two pointers: 'slow' and 'fast', both starting at the head of the linked list.  
                        Move the 'fast' pointer two steps at a time and the 'slow' pointer one step at a time.  
                        When the 'fast' pointer reaches the end of the list, the 'slow' pointer will be at the middle.  
                        """.trimIndent(),
                                    listOf("Step 2: Plan the Approach (Fast and Slow Pointer Technique) ")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 3: Edge Cases
                        List has only one node.  
                        List has two nodes (return the second one).  
                        Handle odd and even length lists.  
                        """.trimIndent(),
                                    listOf("Step 3: Edge Cases")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson4_subs[2],
                        title = "Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText("""
                This C++ code demonstrates how to find the middle node of a singly linked list using the two-pointer approach. The `slow` pointer advances one step while the `fast` pointer advances two steps, ensuring the `slow` pointer is at the middle when `fast` reaches the end.
                """.trimIndent(),
                                    listOf("linked list", "middle node", "two-pointer approach")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    using namespace std;

                    struct ListNode {
                        int val;
                        ListNode* next;
                        ListNode(int x) : val(x), next(nullptr) {}
                    };

                    ListNode* findMiddle(ListNode* head) {
                        ListNode* slow = head;
                        ListNode* fast = head;

                        while (fast != nullptr && fast->next != nullptr) {
                            slow = slow->next;
                            fast = fast->next->next;
                        }
                        return slow;
                    }

                    int main() {
                        // Example: 1 -> 2 -> 3 -> 4 -> 5
                        ListNode* head = new ListNode(1);
                        head->next = new ListNode(2);
                        head->next->next = new ListNode(3);
                        head->next->next->next = new ListNode(4);
                        head->next->next->next->next = new ListNode(5);

                        ListNode* middle = findMiddle(head);
                        if (middle != nullptr) {
                            cout << "Middle Node: " << middle->val << endl;
                        } else {
                            cout << "The list is empty!" << endl;
                        }
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson4_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the Middle of Linked List problem! 🎉  

                        Why this matters:  
                        Pointer Manipulation: You've mastered a common linked list technique.  
                        Efficiency: The fast and slow pointer approach ensures an O(n) solution with minimal space usage.  

                        Keep practicing to enhance your DSA expertise. Tackle more problems to build confidence and mastery over linked lists! 🚀  
                        """.trimIndent(),
                                    listOf("pointer manipulation", "problem-solving", "confidence")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 5
            Lesson(
                id = DSAExpertStageIds.lesson5,
                title = "Valid Parentheses",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on checking the validity of parentheses using a stack-based approach.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson5_subs[0],
                        title = "Problem Statement - Valid Parentheses",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You are given a string containing just the characters '(', ')', '{', '}', '[', and ']'. Your task is to determine if the input string is valid.",
                                    listOf("valid parentheses", "matching brackets")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        A valid string must:  
                        Have matching opening and closing brackets of the same type.  
                        Ensure brackets are closed in the correct order.  

                        Example:  
                        Input: '\"()[]{}\"'  
                        Output: 'true'  
                        
                        Input: '\"(]\"'  
                        Output: 'false'  
                        """.trimIndent(),
                                    listOf("A valid string must:")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson5_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 1: Understand the Problem  
                        Input: A string containing parentheses and brackets.  
                        Output: A boolean indicating if the string is valid.  
                        """.trimIndent(),
                                    listOf("Step 1: Understand the Problem")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 2: Plan the Approach (Stack for Matching Brackets)
                        Use a stack to track opening brackets.  
                        For each character in the string:  
                        If it’s an opening bracket, push it onto the stack.  
                        If it’s a closing bracket, check if the stack is not empty and matches the top element.  
                        If not, return 'false'.  
                        After processing all characters, ensure the stack is empty.  
                        """.trimIndent(),
                                    listOf("Step 2: Plan the Approach (Stack for Matching Brackets)")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 3: Edge Cases
                        Empty string (valid).  
                        String with unmatched brackets.  
                        String with only opening or only closing brackets.  
                        """.trimIndent(),
                                    listOf("Step 3: Edge Cases")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson5_subs[2],
                        title = "Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText("""
                This C++ code checks whether a string containing parentheses, brackets, and braces is valid. It uses a stack to ensure every opening bracket has a corresponding and correctly ordered closing bracket.
                """.trimIndent(),
                                    listOf("")
                                )
                            ),
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <stack>
                    using namespace std;

                    bool isValid(string s) {
                        stack<char> st;
                        for (char ch : s) {
                            if (ch == '(' || ch == '[' || ch == '{') {
                                st.push(ch);
                            } else {
                                if (st.empty()) return false;
                                char top = st.top();
                                if ((ch == ')' && top != '(') ||
                                    (ch == ']' && top != '[') ||
                                    (ch == '}' && top != '{')) {
                                    return false;
                                }
                                st.pop();
                            }
                        }
                        return st.empty();
                    }

                    int main() {
                        string s = "()[]{}";
                        cout << "Is the string valid? " << (isValid(s) ? "True" : "False") << endl;

                        s = "(]";
                        cout << "Is the string valid? " << (isValid(s) ? "True" : "False") << endl;

                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson5_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Well done on solving the Valid Parentheses problem! 🎉  

                        Why this matters:  
                        Stack Mastery: You've learned how to effectively use a stack for problem-solving.  
                        Real-world Relevance: Bracket matching is essential in compilers, parsers, and more.  

                        Keep challenging yourself with problems to enhance your confidence and skill in data structure-based solutions! 🚀  
                        """.trimIndent(),
                                    listOf("stack mastery", "problem-solving", "confidence")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 6
            Lesson(
                id = DSAExpertStageIds.lesson6,
                title = "Longest Substring Without Repeating Characters",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on finding the length of the longest substring without repeating characters using the sliding window technique.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson6_subs[0],
                        title = "Problem Statement - Longest Substring Without Repeating Characters",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    "You are given a string 's'. Your task is to find the length of the longest substring that contains no repeating characters.",
                                    listOf("longest substring", "repeating characters")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Example: 
                        Input: 'abcabcbb'  
                        Output: '3'  
                        Explanation: The answer is 'abc', with a length of '3'.  
                        """.trimIndent(),
                                    listOf("example", "input", "output", "substring")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson6_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 1: Understand the Problem  
                        Input: A string 's'.  
                        Output: The length of the longest substring with no repeating characters.  
                        """.trimIndent(),
                                    listOf("Step 1: Understand the Problem")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 2: Plan the Approach (Sliding Window Technique) 
                        Use two pointers, 'start' and 'end', to define the current window in the string.  
                        Use a set or map to track the characters in the current window.  
                        Expand the window by moving the 'end' pointer and check for duplicates:  
                          If a duplicate exists, shrink the window from the 'start' until it's valid.  
                          Keep track of the maximum length.  
                        """.trimIndent(),
                                    listOf("Step 2: Plan the Approach (Sliding Window Technique)")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Step 3: Edge Cases
                        Empty string (output is '0').  
                        String with all unique characters.  
                        String with all repeating characters.  
                        """.trimIndent(),
                                    listOf("Step 3: Edge Cases")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson6_subs[2],
                        title = "Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <unordered_set>
                    using namespace std;

                    int lengthOfLongestSubstring(string s) {
                        unordered_set<char> charSet;
                        int maxLength = 0, start = 0;

                        for (int end = 0; end < s.size(); ++end) {
                            while (charSet.find(s[end]) != charSet.end()) {
                                charSet.erase(s[start]);
                                start++;
                            }
                            charSet.insert(s[end]);
                            maxLength = max(maxLength, end - start + 1);
                        }
                        return maxLength;
                    }

                    int main() {
                        string s = "abcabcbb";
                        cout << "Length of the longest substring: " << lengthOfLongestSubstring(s) << endl;

                        s = "bbbbb";
                        cout << "Length of the longest substring: " << lengthOfLongestSubstring(s) << endl;

                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson6_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the **Longest Substring Without Repeating Characters** problem! 🎉  

                        Why this matters:  
                        - **Sliding Window Mastery:** You've mastered an efficient approach for substring problems.  
                        - **Real-world Applications:** This technique is widely used in string parsing and text processing tasks.  

                        Keep practicing and challenge yourself with more string manipulation problems to sharpen your problem-solving skills! 🚀  
                        """.trimIndent(),
                                    listOf(
                                        "sliding window",
                                        "problem-solving",
                                        "string manipulation"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 7
            Lesson(
                id = DSAExpertStageIds.lesson7,
                title = "Mastering Logic Building with DSA - Word Ladder",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on finding the shortest transformation sequence from the begin word to the end word using the graph BFS approach.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson7_subs[0],
                        title = "Problem Statement - Word Ladder",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        You are given two words, 'beginWord' and 'endWord', and a dictionary. You need to find the shortest transformation sequence from 'beginWord' to 'endWord', such that each transformed word must exist in the dictionary.  
                        Only one letter can be changed at a time, and each transformed word must be a valid word in the dictionary.
                        """,
                                    listOf("word ladder", "transformation", "dictionary")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Example:**  
                        **Input:** 'beginWord = "hit"', 'endWord = "cog"', 'dictionary = ["hot", "dot", "dog", "lot", "log", "cog"]'  
                        **Output:** '5'  
                        **Explanation:** The shortest transformation sequence is: 'hit -> hot -> dot -> dog -> cog'.  
                        """.trimIndent(),
                                    listOf("example", "input", "output", "transformation sequence")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson7_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 1: Understand the Problem**  
                        - Input: A 'beginWord', an 'endWord', and a dictionary.  
                        - Output: The length of the shortest transformation sequence from 'beginWord' to 'endWord'.  
                        """.trimIndent(),
                                    listOf("input", "output", "transformation sequence")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 2: Plan the Approach (Graph BFS)**  
                        - Treat each word as a node in a graph and each valid transformation as an edge.  
                        - Perform a Breadth-First Search (BFS) starting from 'beginWord'.  
                        - For each word, try to change one letter at a time and check if the new word exists in the dictionary.  
                        - Keep track of visited words to avoid cycles and unnecessary reprocessing.  
                        - The BFS guarantees the shortest path to reach 'endWord'.
                        """.trimIndent(),
                                    listOf("BFS", "graph", "word transformation")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 3: Edge Cases**  
                        - If 'endWord' is not in the dictionary, return '0'.  
                        - If 'beginWord' is the same as 'endWord', the result is '1' (no transformation needed).  
                        - If there are no valid transformations, return '0'.  
                        """.trimIndent(),
                                    listOf("edge cases", "no transformations", "dictionary")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson7_subs[2],
                        title = "Optimized C++ Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <queue>
                    #include <unordered_set>
                    #include <vector>
                    using namespace std;

                    int ladderLength(string beginWord, string endWord, unordered_set<string>& wordList) {
                        if (wordList.find(endWord) == wordList.end()) return 0;
                        
                        queue<string> q;
                        q.push(beginWord);
                        int level = 1;
                        
                        while (!q.empty()) {
                            int size = q.size();
                            for (int i = 0; i < size; ++i) {
                                string word = q.front();
                                q.pop();
                                
                                for (int j = 0; j < word.size(); ++j) {
                                    char original = word[j];
                                    for (char ch = 'a'; ch <= 'z'; ++ch) {
                                        word[j] = ch;
                                        if (word == endWord) return level + 1;
                                        if (wordList.find(word) != wordList.end()) {
                                            q.push(word);
                                            wordList.erase(word);
                                        }
                                    }
                                    word[j] = original;
                                }
                            }
                            ++level;
                        }
                        return 0;
                    }

                    int main() {
                        unordered_set<string> wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
                        string beginWord = "hit", endWord = "cog";
                        cout << "Length of the shortest transformation sequence: " << ladderLength(beginWord, endWord, wordList) << endl;
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson7_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the **Word Ladder** problem! 🎉  

                        Why this matters:  
                        - **Graph Algorithms Mastery:** You've learned how to apply BFS to solve graph traversal problems.  
                        - **Real-world Relevance:** Word ladder transformations are an important concept in natural language processing and word games.  

                        Keep practicing and challenge yourself with more graph-related problems to sharpen your problem-solving skills! 🚀  
                        """.trimIndent(),
                                    listOf("graph algorithms", "problem-solving", "BFS")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 8
            Lesson(
                id = DSAExpertStageIds.lesson8,
                title = "Mastering Backtracking with DSA - N-Queens Problem",
                description = "Learn to solve problems step-by-step with DSA techniques using C++. This lesson focuses on solving the N-Queens problem using the backtracking approach.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson8_subs[0],
                        title = "Problem Statement - N-Queens Problem",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        You are given an 'N x N' chessboard and must place 'N' queens on the board such that no two queens threaten each other.  
                        A queen can attack another queen if they are placed on the same row, column, or diagonal.
                        """,
                                    listOf("N-Queens", "chessboard", "backtracking")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Example:**  
                        **Input:** 'N = 4'  
                        **Output:**  
                        [
                          [".Q..",  // Solution 1
                           "...Q",
                           "Q...",
                           "..Q."],
                          ["..Q.",  // Solution 2
                           "Q...",
                           "...Q",
                           ".Q.."]
                        ]  
                        **Explanation:** There are two distinct solutions to place 4 queens on a 4x4 board where no two queens threaten each other.  
                        """.trimIndent(),
                                    listOf("example", "input", "output", "solution")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson8_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 1: Understand the Problem**  
                        - Input: An integer 'N' representing the size of the chessboard and the number of queens.  
                        - Output: All possible solutions where 'N' queens can be placed on the board such that no two queens threaten each other.  
                        """.trimIndent(),
                                    listOf("input", "output", "chessboard")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 2: Plan the Approach (Backtracking)**  
                        - The backtracking approach will help generate all possible board configurations and prune invalid ones.  
                        - We can use three arrays to track threatened columns and diagonals:  
                          - 'cols': Tracks if a column is under attack.  
                          - 'diag1': Tracks if a diagonal (top-left to bottom-right) is under attack.  
                          - 'diag2': Tracks if a diagonal (top-right to bottom-left) is under attack.  
                        - For each row, try placing a queen in each column and check if the current position is valid.  
                        - Recursively place queens on the next row and backtrack if a solution is not found.  
                        """.trimIndent(),
                                    listOf("backtracking", "diagonals", "columns")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 3: Edge Cases**  
                        - If 'N = 1', the solution is a single queen on a 1x1 board.  
                        - If 'N = 2' or 'N = 3', there is no solution because queens cannot be placed without threatening each other.  
                        - For larger values of 'N', there may be multiple solutions.  
                        """.trimIndent(),
                                    listOf("edge cases", "N=1", "no solution")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson8_subs[2],
                        title = "Optimized C++ Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    using namespace std;

                    void solveNQueensUtil(int row, int n, vector<string>& board, vector<bool>& cols, vector<bool>& diag1, vector<bool>& diag2, vector<vector<string>>& solutions) {
                        if (row == n) {
                            solutions.push_back(board);
                            return;
                        }
                        
                        for (int col = 0; col < n; ++col) {
                            if (cols[col] || diag1[row - col + n - 1] || diag2[row + col]) {
                                continue;
                            }
                            board[row][col] = 'Q';
                            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = true;
                            solveNQueensUtil(row + 1, n, board, cols, diag1, diag2, solutions);
                            board[row][col] = '.';
                            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = false;
                        }
                    }

                    vector<vector<string>> solveNQueens(int n) {
                        vector<vector<string>> solutions;
                        vector<string> board(n, string(n, '.'));
                        vector<bool> cols(n, false), diag1(2 * n - 1, false), diag2(2 * n - 1, false);
                        solveNQueensUtil(0, n, board, cols, diag1, diag2, solutions);
                        return solutions;
                    }

                    int main() {
                        int n = 4;
                        vector<vector<string>> solutions = solveNQueens(n);
                        cout << "Number of solutions for " << n << "-Queens problem: " << solutions.size() << endl;
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson8_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the **N-Queens** problem! 🎉  

                        Why this matters:  
                        - **Backtracking Mastery:** You've learned how to approach complex constraint satisfaction problems using backtracking.  
                        - **Real-world Relevance:** N-Queens is a classic problem that helps you understand optimization techniques and constraint handling, commonly used in AI and game theory.  

                        Keep practicing and challenge yourself with more backtracking problems to sharpen your problem-solving skills! 🚀  
                        """.trimIndent(),
                                    listOf("backtracking", "constraint satisfaction", "problem-solving")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 9
            Lesson(
                id = DSAExpertStageIds.lesson9,
                title = "Kth Smallest Element in a Binary Search Tree",
                description = "Learn how to find the kth smallest element in a Binary Search Tree (BST) using Inorder Traversal. This lesson provides the techniques to implement an efficient solution.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson9_subs[0],
                        title = "Problem Statement - Kth Smallest Element in a BST",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        You are given a Binary Search Tree (BST) and a positive integer 'k'. Your task is to find the 'k'th smallest element in the BST.
                        
                        **Example:**  
                        **Input:**  
                        BST = [3, 1, 4, null, 2], k = 1  
                        **Output:** 1  
                        **Explanation:** The inorder traversal of the BST is [1, 2, 3, 4], so the 1st smallest element is '1'.  
                        """.trimIndent(),
                                    listOf("BST", "kth smallest", "inorder traversal", "tree traversal")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson9_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 1: Understand the Problem**  
                        - Input: A Binary Search Tree and an integer 'k' which is the position of the smallest element to find.
                        - Output: The 'k'th smallest element in the BST, which can be found by performing an inorder traversal.
                        
                        **Step 2: Approach**  
                        - In a BST, the elements are arranged such that the left subtree of a node contains smaller elements and the right subtree contains larger elements. This makes inorder traversal naturally sorted.
                        - Perform an inorder traversal to visit each node in ascending order and count nodes until you reach the 'k'th element.
                        
                        **Step 3: Approach in Detail**  
                        - Initialize a counter 'count' to track how many nodes have been visited.
                        - Use a recursive approach to traverse the tree. On visiting each node, increment the counter.
                        - Once the counter reaches 'k', return the current node’s value as the 'k'th smallest element.
                        """.trimIndent(),
                                    listOf("inorder traversal", "recursive", "binary search tree")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 4: Edge Cases**  
                        - If 'k' is larger than the total number of nodes in the tree, return an error or handle it appropriately.
                        - An empty BST should be handled as an invalid case.
                        """.trimIndent(),
                                    listOf("edge cases", "error handling", "invalid input")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson9_subs[2],
                        title = "Optimized C++ Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <stack>
                    using namespace std;

                    struct TreeNode {
                        int val;
                        TreeNode* left;
                        TreeNode* right;
                        TreeNode(int x) : val(x), left(NULL), right(NULL) {}
                    };

                    int kthSmallest(TreeNode* root, int k) {
                        stack<TreeNode*> s;
                        TreeNode* node = root;
                        int count = 0;

                        while (node != NULL || !s.empty()) {
                            while (node != NULL) {
                                s.push(node);
                                node = node->left;
                            }

                            node = s.top();
                            s.pop();
                            count++;
                            
                            if (count == k) {
                                return node->val;
                            }
                            
                            node = node->right;
                        }

                        return -1; // If k is greater than the number of nodes in the BST
                    }

                    int main() {
                        // Constructing the tree: [3, 1, 4, null, 2]
                        TreeNode* root = new TreeNode(3);
                        root->left = new TreeNode(1);
                        root->right = new TreeNode(4);
                        root->left->right = new TreeNode(2);

                        int k = 1;
                        cout << "The " << k << "th smallest element is " << kthSmallest(root, k) << endl;
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson9_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the **Kth Smallest Element in a BST** problem! 🎉  

                        Why this matters:  
                        - **Efficient Searching:** You now know how to efficiently search for the 'k'th smallest element in a binary search tree using inorder traversal.  
                        - **Real-world Applications:** This technique is widely used in problems involving sorted data structures and searching, such as finding the median or determining range queries.  

                        Keep practicing and challenge yourself with more tree traversal and BST problems to enhance your problem-solving skills! 🚀  
                        """.trimIndent(),
                                    listOf("binary search tree", "inorder traversal", "tree problems")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 10
            Lesson(
                id = DSAExpertStageIds.lesson10,
                title = "Maximum Subarray Sum with One Deletion",
                description = "Learn how to find the maximum subarray sum by deleting at most one element using Dynamic Programming. This lesson will guide you through solving the problem efficiently.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson10_subs[0],
                        title = "Problem Statement - Maximum Subarray Sum with One Deletion",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        You are given an array of integers. Your task is to find the maximum subarray sum you can achieve by deleting at most one element.
                        
                        **Example:**  
                        **Input:** 'arr = [1, -2, 0, 3]'  
                        **Output:** '4'  
                        **Explanation:** The maximum sum after deleting one element is achieved by deleting '-2', resulting in the subarray '[1, 0, 3]' which sums to '4'.
                        """.trimIndent(),
                                    listOf("maximum subarray", "deletion", "dynamic programming")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson10_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 1: Understand the Problem**  
                        - Input: An array of integers where we need to find the maximum subarray sum after deleting at most one element.  
                        - Output: The maximum sum achievable with one deletion or no deletion at all.  
                        
                        **Step 2: Approach (Dynamic Programming)**  
                        - Let 'dp[i]' represent the maximum subarray sum ending at index 'i' without any deletions.  
                        - Let 'dp1[i]' represent the maximum subarray sum ending at index 'i' after deleting one element.  
                        - For each element in the array, compute the maximum sum that can be achieved by either deleting the current element or keeping it.
                        - We update the values of 'dp' and 'dp1' for every element in the array.
                        - The final answer is the maximum of the last elements of 'dp' and 'dp1'.
                        
                        **Step 3: Approach in Detail**  
                        - For each index 'i', calculate 'dp[i]' as the maximum of 'arr[i]' and 'arr[i] + dp[i-1]' (the maximum sum ending at 'i' without deletion).  
                        - Calculate 'dp1[i]' as the maximum of 'arr[i]', 'arr[i] + dp[i-1]', and 'arr[i] + dp1[i-1]' (the maximum sum if we delete the current element).
                        - Return the maximum of 'dp[n-1]' and 'dp1[n-1]', where 'n' is the length of the array.
                        """.trimIndent(),
                                    listOf("dynamic programming", "subarray sum", "deletion")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 4: Edge Cases**  
                        - If the array has only one element, the result is the element itself.  
                        - If all elements are negative, the maximum subarray sum might be the largest single element, even with deletion.
                        """.trimIndent(),
                                    listOf("edge cases", "negative elements", "single element")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson10_subs[2],
                        title = "Optimized C++ Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    using namespace std;

                    int maximumSum(vector<int>& arr) {
                        int n = arr.size();
                        vector<int> dp(n), dp1(n);
                        dp[0] = arr[0];
                        dp1[0] = arr[0];

                        for (int i = 1; i < n; ++i) {
                            dp[i] = max(arr[i], arr[i] + dp[i-1]);
                            dp1[i] = max(arr[i], max(arr[i] + dp[i-1], arr[i] + dp1[i-1]));
                        }

                        return max(dp[n-1], dp1[n-1]);
                    }

                    int main() {
                        vector<int> arr = {1, -2, 0, 3};
                        cout << "The maximum subarray sum with one deletion is " << maximumSum(arr) << endl;
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson10_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the **Maximum Subarray Sum with One Deletion** problem! 🎉  

                        Why this matters:  
                        - **Dynamic Programming Mastery:** You've learned how to use dynamic programming to solve complex problems involving subarrays and deletions.  
                        - **Real-world Applications:** This technique is widely used in optimization problems, such as finding maximum subsequences with constraints or handling missing data in time series.

                        Keep practicing and challenge yourself with more dynamic programming problems to improve your problem-solving skills! 🚀
                        """.trimIndent(),
                                    listOf("dynamic programming", "subarrays", "optimization")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            ),

            // lesson 11
            Lesson(
                id = DSAExpertStageIds.lesson11,
                title = "Traveling Salesman Problem (TSP)",
                description = "Learn how to solve the Traveling Salesman Problem (TSP) using Dynamic Programming and Bitmasking. This lesson will guide you through solving the problem efficiently for finding the shortest possible route that visits all cities exactly once and returns to the starting city.",
                lessonContents = listOf(
                    // Problem Statement
                    LessonContent(
                        id = DSAExpertStageIds.lesson11_subs[0],
                        title = "Problem Statement - Traveling Salesman Problem (TSP)",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        You are given a list of cities and the distances between each pair. Your task is to find the shortest possible route that visits each city exactly once and returns to the starting city.

                        **Example:**  
                        **Input:** Distance matrix:
                        [[0, 10, 15, 20],
                         [10, 0, 35, 25],
                         [15, 35, 0, 30],
                         [20, 25, 30, 0]]

                        **Output:** 80  
                        **Explanation:** The shortest possible route is [0 -> 1 -> 3 -> 2 -> 0] with a total distance of 80.
                        """.trimIndent(),
                                    listOf("traveling salesman", "bitmasking", "dynamic programming", "route optimization")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Manual Walkthrough
                    LessonContent(
                        id = DSAExpertStageIds.lesson11_subs[1],
                        title = "Manual Walkthrough",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 1: Understand the Problem**  
                        - Input: A distance matrix representing distances between cities.
                        - Output: The shortest possible route that visits every city once and returns to the starting city.
                        
                        **Step 2: Approach (Dynamic Programming with Bitmasking)**  
                        - Use dynamic programming (DP) to keep track of the shortest path to each city with a bitmask representing the set of visited cities.
                        - Let 'dp[mask][i]' represent the shortest path to visit all cities in the 'mask' set, ending at city 'i'.
                        - Initially, 'dp[1][0] = 0', meaning starting at city 0 with just city 0 visited.
                        - For each set of cities (bitmask), calculate the shortest path to all unvisited cities, and update the DP table accordingly.

                        **Step 3: Approach in Detail**  
                        - Iterate over all possible subsets of cities (bitmask) and compute the shortest path by considering each possible next city.
                        - Use a recursive approach to explore all possible city orders and compute the minimum total distance.
                        - The final result is the minimum distance to visit all cities and return to the starting city.
                        """.trimIndent(),
                                    listOf("dynamic programming", "bitmasking", "route optimization", "traveling salesman")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        **Step 4: Edge Cases**  
                        - If the distance matrix contains only one city, the result is trivially 0.
                        - If the cities are disconnected or unreachable, it’s important to handle such cases by checking for valid connections between cities.
                        """.trimIndent(),
                                    listOf("edge cases", "distance matrix", "disconnected cities")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Optimized C++ Code Solution
                    LessonContent(
                        id = DSAExpertStageIds.lesson11_subs[2],
                        title = "Optimized C++ Code Solution",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                """
                    #include <iostream>
                    #include <vector>
                    #include <climits>
                    using namespace std;

                    int travelingSalesman(vector<vector<int>>& dist) {
                        int n = dist.size();
                        vector<vector<int>> dp(1 << n, vector<int>(n, INT_MAX));

                        dp[1][0] = 0;  // Start from city 0

                        for (int mask = 1; mask < (1 << n); ++mask) {
                            for (int u = 0; u < n; ++u) {
                                if (mask & (1 << u)) {
                                    for (int v = 0; v < n; ++v) {
                                        if ((mask & (1 << v)) == 0) {
                                            dp[mask | (1 << v)][v] = min(dp[mask | (1 << v)][v], dp[mask][u] + dist[u][v]);
                                        }
                                    }
                                }
                            }
                        }

                        int result = INT_MAX;
                        for (int u = 1; u < n; ++u) {
                            result = min(result, dp[(1 << n) - 1][u] + dist[u][0]);
                        }
                        
                        return result;
                    }

                    int main() {
                        vector<vector<int>> dist = {{0, 10, 15, 20},
                                                     {10, 0, 35, 25},
                                                     {15, 35, 0, 30},
                                                     {20, 25, 30, 0}};
                        cout << "The shortest path length is " << travelingSalesman(dist) << endl;
                        return 0;
                    }
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    ),

                    // Motivation
                    LessonContent(
                        id = DSAExpertStageIds.lesson11_subs[3],
                        title = "Motivation to Solve More Problems",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    """
                        Congratulations on solving the **Traveling Salesman Problem (TSP)**! 🎉

                        Why this matters:  
                        - **Optimization Challenges:** You've learned how to tackle one of the most famous optimization problems using dynamic programming and bitmasking.
                        - **Real-world Applications:** This problem is widely used in logistics, route planning, and various other fields where optimization and efficiency are crucial.

                        Keep practicing and challenge yourself with more complex graph and DP problems to further enhance your problem-solving skills! 🚀
                        """.trimIndent(),
                                    listOf("dynamic programming", "bitmasking", "optimization", "traveling salesman")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,

                    )
                ),
                status = LessonStatus.LOCKED
            )


        )
    )
}