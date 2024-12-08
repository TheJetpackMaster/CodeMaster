package com.codemaster.codemasterapp.main.AllCourses.CppCourse

import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage


fun cppAdvancedCourse(): Stage {

    return Stage(
        id = cppAdvancedStageIds.stageId,
        title = "Advanced",
        lessons = listOf(

            // Lesson 1: Welcome to the Advanced Stage
            Lesson(
                id = cppAdvancedStageIds.lesson1,
                title = "Welcome to the Advanced Stage",
                description = "Congrats on leveling up! Ready for coding magic and challenges?",
                lessonContents = listOf(

                    // Sub-lesson 1: Congratulations on Completing Intermediate
                    LessonContent(
                        id = "advanced_cpp1_sub1",
                        title = "Congratulations on Completing Intermediate",
                        description = "Take a moment to pat yourself on the back before leveling up!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Congratulations! You’ve completed the intermediate lessons – one step closer to mastering programming.",
                                    styledText = listOf("Congratulations!")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now, its time to level up and dive into the advanced stage.",
                                    styledText = listOf("level up")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Keep practicing what youve learned to reinforce your foundation.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 2: The Importance of Practice
                    LessonContent(
                        id = "advanced_cpp1_sub2",
                        title = "The Importance of Practice",
                        description = "Practice the basics consistently,practice makes you perfect.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Practice the fundamentals consistently to build a solid foundation. Think of it like training for a sport – the more you practice, the stronger your skills will become.",
                                    styledText = listOf("consistently")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Before we jump into the world of OOP (Object-Oriented Programming), let’s hit the rewind button! Take a moment to revisit the past lessons and practice them again – because a solid foundation is key before we dive into the fun stuff!",
                                    styledText = listOf("(Object-Oriented Programming)")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: What’s Coming Up – A Glimpse of OOP
                    LessonContent(
                        id = "advanced_cpp1_sub3",
                        title = "What’s Coming Up – A Glimpse of OOP",
                        description = "Let’s dive into OOP.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "We’ll break down OOP to help you write clean, efficient, scalable code. It might sound overwhelming, but it’s just like building with Legos – start small, build big.",
                                    styledText = listOf("OOP")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Your Journey So Far
                    LessonContent(
                        id = "advanced_cpp1_sub4",
                        title = "Your Journey So Far",
                        description = "Look at how far you’ve come!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "From beginner concepts to now, you’ve built a solid foundation. Don’t worry about OOP – if you’ve come this far, you can master it.",
                                    styledText = listOf("foundation")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Stay Consistent – Practice Makes Perfect
                    LessonContent(
                        id = "advanced_cpp1_sub5",
                        title = "Stay Consistent – Practice Makes Perfect",
                        description = "Consistency is your greatest asset.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "With regular practice, OOP will feel less complex. Think of it like learning to ride a bike – at first, it’s awkward, but with time, it becomes second nature.",
                                    styledText = listOf("awkward")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: A Final Push – Your OOP Journey Begins
                    LessonContent(
                        id = "advanced_cpp1_sub6",
                        title = "A Final Push – Your OOP Journey Begins",
                        description = "Get ready to start your OOP adventure.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "OOP is a challenge, but you’re ready. Take your time and enjoy the process – it’s like learning to cook; once you do, the possibilities are endless.",
                                    styledText = listOf("possibilities")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.ACTIVE
            ),

            // Lesson 2: Introduction to OOP
            Lesson(
                id = cppAdvancedStageIds.lesson2,
                title = "Introduction to OOP",
                description = "Step into the world of OOP! Let’s unravel classes and objects.",
                lessonContents = listOf(

                    // Sub-lesson 1: Welcome to the World of OOP
                    LessonContent(
                        id = "advanced_cpp2_sub1",
                        title = "Welcome to the World of OOP",
                        description = "Why OOP? Let’s explore its magic!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "OOP stands for Object-Oriented Programming. It’s a programming style where we create objects that contain both data and functions to work with that data.",
                                    styledText = listOf("Object-Oriented Programming", "OOP")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Unlike procedural programming, where we write functions to operate on data, OOP allows us to model real-world concepts using objects.",
                                    styledText = listOf(
                                        "procedural programming",
                                        "real-world concepts"
                                    )
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: What is a Class?
                    LessonContent(
                        id = "advanced_cpp2_sub2",
                        title = "What is a Class?",
                        description = "Let’s meet the blueprint of OOP – the class!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A class is like a blueprint. It defines what an object will be like. Think of it as the recipe for a cake – it lists all the ingredients and steps to bake the cake, but it’s not the actual cake yet!",
                                    styledText = listOf("blueprint", "recipe for a cake")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In code, a class groups related properties (data) and methods (actions). For example, a class  Car  might have properties like  color  and  speed , and methods like  drive()  or  brake() .",
                                    styledText = listOf("properties", "methods")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: What is an Object?
                    LessonContent(
                        id = "advanced_cpp2_sub3",
                        title = "What is an Object?",
                        description = "Meet the hero of OOP – the object!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If a class is the blueprint, an object is the actual thing built from it. It’s like baking a cake using the recipe – the cake is the object!",
                                    styledText = listOf("blueprint", "object", "cake")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In code, an object is created from a class. For example, you can create multiple Car objects from the Car class, each with its unique color or speed.",
                                    styledText = listOf("Car", "objects")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Why Do We Need Classes and Objects?
                    LessonContent(
                        id = "advanced_cpp2_sub4",
                        title = "Why Do We Need Classes and Objects?",
                        description = "Here’s why OOP is a game-changer.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "OOP makes your code easier to understand, maintain, and reuse. Instead of writing the same code over and over, you can create a class and use it whenever needed. Neat, right?",
                                    styledText = listOf("understand", "maintain", "reuse")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Classes and objects let you model real-world things in your programs. A bank account, a game character, or a shopping cart – all can be represented using OOP!",
                                    styledText = listOf("real-world things")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Let’s Get Started with OOP!
                    LessonContent(
                        id = "advanced_cpp2_sub5",
                        title = "Let’s Get Started with OOP!",
                        description = "Time to dive into code!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Ready to create your first class and object? Let’s turn these concepts into reality. Grab your keyboard, and let’s build something amazing!",
                                    styledText = listOf("class", "object")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What does OOP stand for in C++?",
                                options = listOf(
                                    "Overloaded Operator Programming",
                                    "Maybe a sudden reaction",
                                    "Ordered Operation Procedure",
                                    "Object-Oriented Programming"
                                ),
                                correctAnswer = "Object-Oriented Programming",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            //Lesson 3: Classes & Objects in C++
            Lesson(
                id = cppAdvancedStageIds.lesson3,
                title = "Classes & Objects in C++",
                description = "Discover how classes are the building blocks of Object-Oriented Programming!",
                lessonContents = listOf(

                    // Sub-lesson 1: What is a Class?
                    LessonContent(
                        id = "cpp_classes_1_sub1",
                        title = "What is a Class?",
                        description = "Understand the concept of a class with real-life examples.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, a class is like a design blueprint. It defines the properties and behaviors of objects.",
                                    styledText = listOf(
                                        "class",
                                        "blueprint",
                                        "properties",
                                        "behaviors"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Classes are the foundation of object-oriented programming. They allow you to create objects with their own versions of properties and behaviors.",
                                    styledText = listOf("object-oriented programming", "objects")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the role of a class in C++?",
                                options = listOf(
                                    "To perform calculations within a program",
                                    "To handle file operations",
                                    "To define a template or blueprint for creating objects",
                                    "To act as an external library"
                                ),
                                correctAnswer = "To define a template or blueprint for creating objects",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),

                    // Sub-lesson 2: Creating a Class
                    LessonContent(
                        id = "cpp_classes_1_sub2",
                        title = "Creating a Class",
                        description = "Learn how to define a basic class in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To create a class in C++, use the  class keyword followed by the class name and curly braces  {} . The class definition ends with a semicolon  ; .",
                                    styledText = listOf("class", "curly braces", "semicolon")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
                                    
class MyClass {
  public:
    int myNum;
    string myString;
};
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Creating an Object
                    LessonContent(
                        id = "cpp_classes_1_sub3",
                        title = "Creating an Object",
                        description = "Learn how to create a single object from a class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To create an object of a class, simply define it using the class name followed by the object name.",
                                    styledText = listOf("object", "class", "class name")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
int main() {

 // Creating an object of the class
  MyClass myObj;
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the code",
                        description = "Ok so now try to complete the program.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the code create object of 'MyClass' ",
                                incompleteCode = """
#include <iostream>
                                    
class MyClass {
  public:
    int myNum;
    string myString;
};

int main() {

 // Creating an object of the class
  ___ myObj;
  return 0;
}
""".trimIndent(),
                                correctCode = "MyClass",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 4: Accessing and Assigning Values to Class Members
                    LessonContent(
                        id = "cpp_classes_1_sub4",
                        title = "Accessing and Assigning Values to Class Members",
                        description = "Learn how to access and assign values to class members using an object.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can access and assign values to a classs members using an object. The object is followed by the dot (.) operator to access members.",
                                    styledText = listOf("object", "dot operator")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
int main() {
  MyClass myObj;
  
  // Accessing and assigning value
  myObj.myNum = 10;  
  myObj.myString = "Hello, C++"; 
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Creating Multiple Objects
                    LessonContent(
                        id = "cpp_classes_1_sub5",
                        title = "Creating Multiple Objects",
                        description = "Learn how to create multiple objects from a class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can create multiple objects from the same class. Each object has its own set of attributes.",
                                    styledText = listOf("objects", "attributes")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
                                    
class Car {
  public:
    string brand;
    string model;
    int year;
};

int main() {

  // Creating two objects
  Car car1, car2;
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Printing Class Values
                    LessonContent(
                        id = "cpp_classes_1_sub6",
                        title = "Printing Class Values",
                        description = "Learn how to print the values of class members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Once youve created objects and assigned values to them, you can print the values of class members using the cout statement.",
                                    styledText = listOf("cout", "class members")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
                                    
class Car {
  public:
    string brand;
    string model;
    int year;
};

int main() {
  Car car1, car2;
  car1.brand = "BMW";
  car1.model = "X5";
  car1.year = 1999;
  car2.brand = "Ford";
  car2.model = "Mustang";
  car2.year = 1969;
  
  cout << "Car 1: " << car1.brand << " " << car1.model << " " << car1.year << endl;
  cout << "Car 2: " << car2.brand << " " << car2.model << " " << car2.year << endl;
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "How do you create an object of a class in C++?",
                                options = listOf(
                                    "By using the 'new' keyword",
                                    "I will ask my friend for help.",
                                    "By using the class name as the variable type",
                                    "By defining a function"
                                ),
                                correctAnswer = "int age;",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),

                    // Fun Practice Lesson: Lets Code!
                    LessonContent(
                        id = "cpp_classes_1_practice",
                        title = "Lets Code! (Practice)",
                        description = "Now that youve learned the basics, its time to put it all together! Go ahead and create your own classes and objects. Have fun with it!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Youve got this! Define a class, create some objects, and experiment with different attributes. The skys the limit!",
                                    styledText = listOf("class", "objects", "experiment")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Take your time and enjoy the process. Creating classes and objects is the first step toward building cool programs. Keep coding, keep experimenting!",
                                    styledText = listOf("creating", "cool programs", "keep coding")
                                )
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            //Lesson 4: Class Method in C++
            Lesson(
                id = cppAdvancedStageIds.lesson4,
                title = "C++ Class Methods",
                description = "Learn how to give your classes functionality using methods.",
                lessonContents = listOf(

                    // Sub-lesson 1: What are Class Methods?
                    LessonContent(
                        id = "cpp_class_methods_2_sub1",
                        title = "What are Class Methods?",
                        description = "Understand the basics of methods in classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A method is a function that is written inside a class. Methods define actions or behaviors that a class can perform. Think of it as a way to make your class do something useful or fun.",
                                    styledText = listOf("method", "function", "actions")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "While members hold data, methods allow us to interact with or manipulate that data. They add functionality to the class and make it more powerful.",
                                    styledText = listOf("members", "data", "functionality")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Difference between class members and class methods?",
                                options = listOf(
                                    "Members manipulate data",
                                    "Methods are useless",
                                    "Members hold data & methods manipulate data",
                                    "Methods store data"
                                ),
                                correctAnswer = "Members hold data & methods manipulate data",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),


                    // Sub-lesson 2: Creating a Class with Methods
                    LessonContent(
                        id = "cpp_class_methods_2_sub2",
                        title = "Creating a Class with Methods",
                        description = "Learn how to define methods in a class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To add methods to a class, define them inside the class. Methods are written just like regular functions, but they belong to the class.",
                                    styledText = listOf("methods", "functions", "class")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
  public:
    void greet() {
      cout << "Hello, world!" << endl;
    }
};
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Accessing Methods
                    LessonContent(
                        id = "cpp_class_methods_2_sub3",
                        title = "Accessing Methods",
                        description = "Learn how to call a method using an object.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To call a method, create an object of the class and use the dot operator (.) to access the method. Its like telling the object to perform the methods action.",
                                    styledText = listOf("call", "method", "dot operator")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
int main() {
  MyClass myObj;  // Create an object
  myObj.greet();  // Call the greet method
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Full Example with Main Function
                    LessonContent(
                        id = "cpp_class_methods_2_sub4",
                        title = "Complete Example",
                        description = "See how it all comes together.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Heres a complete example, including the class, its method, and the main function to call it.",
                                    styledText = listOf(
                                        "complete example",
                                        "class",
                                        "main function"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

class MyClass {
  public:
    void greet() {
      cout << "Hello, world!" << endl;
    }
};

int main() {
  MyClass myObj;
  myObj.greet();
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the code",
                        description = "Now, try completing the program by calling the 'sayHello' method.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the code to call the 'sayHello' method and print 'Hello, World'.",
                                incompleteCode = """
class MyClass {
  public:
    void sayHello() {
      cout << "Hello, World" << endl;
    }
};

int main() {
  MyClass myObj;
  myObj___sayHello();
  return 0;
}
""".trimIndent(),
                                correctCode = ".",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 5: Explore and Have Fun!
                    LessonContent(
                        id = "cpp_class_methods_2_sub5",
                        title = "Explore and Have Fun!",
                        description = "Use your creativity and experiment with methods.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try creating your own class with fun methods. For example, make a class Robot and give it methods like moveForward, turnLeft, or speak. Play around and see how much you can do!",
                                    styledText = listOf("class", "Robot", "methods")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The more you practice, the better you’ll get at creating powerful and interactive classes.",
                                    styledText = listOf("practice", "interactive classes")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 5: Constructors in C++
            Lesson(
                id = cppAdvancedStageIds.lesson5,
                title = "Constructors in C++",
                description = "Learn the magic of constructors that automatically set up your class objects!",
                lessonContents = listOf(

                    // Sub-lesson 1: What is a Constructor?
                    LessonContent(
                        id = "cpp_constructors_1_sub1",
                        title = "What is a Constructor?",
                        description = "Understand constructors as the auto-setup tools for your objects.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A constructor is like a personal assistant for your class. It automatically prepares your object when its created, setting initial values or running important setup steps.",
                                    styledText = listOf("constructor")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Key Points:\n" +
                                            "- Same name as the class.\n" +
                                            "- No return type (not even void).\n" +
                                            "- Automatically called when an object is created.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Creating a Constructor
                    LessonContent(
                        id = "cpp_constructors_1_sub2",
                        title = "Creating a Constructor",
                        description = "Learn how to define and use a simple constructor.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Define a constructor with the same name as the class and add your setup logic inside curly braces {}.",
                                    styledText = listOf("setup logic")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {       
  public:
    // Constructor
    MyClass() {       
      cout << "Object created!" << endl;
    }
};

int main() {
  MyClass myObj;      
  return 0;
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When myObj is created, the constructor runs automatically and prints: Object created!.",
                                    styledText = listOf("constructor")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Parameterized Constructors
                    LessonContent(
                        id = "cpp_constructors_1_sub3",
                        title = "Parameterized Constructors",
                        description = "Discover how to pass values to constructors during object creation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Constructors can take parameters to initialize object attributes during creation.",
                                    styledText = listOf("parameters", "initialize attributes")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
  public:
    MyClass(string name) {       
      cout << "Hello, " << name << "!" << endl;
    }
};

int main() {
  MyClass myObj("Alice");        
  return 0;
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This constructor takes a name as a parameter and prints a greeting.",
                                    styledText = listOf("constructor", "parameter")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the code",
                        description = "Ok so now try to complete the program.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the code to create constructor for class 'Luawms'",
                                incompleteCode = """
class Luawms {       
  public:
    // Constructor
    ___() {       
      cout << "Object created!" << endl;
    }
};

int main() {
  Luawms myObj;      
  return 0;
}
""".trimIndent(),
                                correctCode = "Luawms",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),


                    // Sub-lesson 4: Initializing Member Variables with Constructors
                    LessonContent(
                        id = "cpp_constructors_1_sub4",
                        title = "Initializing Member Variables with Constructors",
                        description = "Learn how to initialize member variables directly using constructors.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can initialize member variables directly within the constructor by using an initializer list or directly assigning values inside the constructor body.",
                                    styledText = listOf("initialize")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
  private:
    string name;
    int age;

  public:
    // Constructor with initializer list
    MyClass(string n, int a){       
        name = n;
        age = a;
    }
};

int main() {
 // Initializes name and age through constructor
  MyClass myObj("Alice", 25); 
  return 0;
}
""".trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Using Multiple Constructors
                    LessonContent(
                        id = "cpp_constructors_1_sub5",
                        title = "Using Multiple Constructors",
                        description = "Learn how to create multiple constructors to handle different object initialization scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, a class can have more than one constructor. This is called constructor overloading. Each constructor can have different parameters or none at all.",
                                    styledText = listOf("constructor overloading")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
  public:
    // Default constructor
    MyClass() {
      cout << "Default constructor called!" << endl;
    }

    // Constructor with 1 parameter
    MyClass(string name) {
      cout << "Hello, " << name << "!" << endl;
    }

    // Constructor with 2 parameters
    MyClass(string name, int age) {
      cout << name << "is" << age << "years old";
    }
};

int main() {
  MyClass obj1;                // Default constructor
  MyClass obj2("Bob");         // Constructor with 1 parameter
  MyClass obj3("Alice", 25);   // Constructor with 2 parameters
  return 0;
}
""".trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here we have three constructors, each handling different initialization needs: one with no parameters, one with a single parameter, and one with two parameters.",
                                    styledText = listOf("constructor overloading")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Why Use Multiple Constructors?
                    LessonContent(
                        id = "cpp_constructors_1_sub6",
                        title = "Why Use Multiple Constructors?",
                        description = "Understand why constructor overloading is useful in real-world scenarios.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Using multiple constructors allows for flexible object creation. For example, if you dont want to always specify a name or age, you can just use the default constructor.",
                                    styledText = listOf(
                                        "constructor overloading",
                                        "flexible object creation"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This flexibility can help in managing different cases when creating objects, making your code more adaptable and clean.",
                                    styledText = listOf("flexibility", "code adaptability")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub9",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of constructors in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "How do you define a constructor in C++?",
                                options = listOf(
                                    "By defining a function with the keyword 'constructor'",
                                    "By declaring it as 'public constructor'",
                                    "Using a function named 'init'",
                                    "Using the class name followed by parentheses"
                                ),
                                correctAnswer = "Using the class name followed by parentheses",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),


                    // Sub-lesson 7: Practice and Explore
                    LessonContent(
                        id = "cpp_constructors_1_sub7",
                        title = "Practice and Explore!",
                        description = "Experiment with constructors to understand them better!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try creating your own classes with multiple constructors. Add parameters, initialize attributes, and explore their behavior in different scenarios.",
                                    styledText = listOf("constructors", "attributes", "overloading")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 6: C++ Access Specifiers
            Lesson(
                id = cppAdvancedStageIds.lesson6,
                title = "C++ Access Specifiers",
                description = "Learn how to control access to the parts of your class with access specifiers!",
                lessonContents = listOf(

                    // Sub-lesson 1: Introduction to Access Specifiers
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub1",
                        title = "What Are Access Specifiers?",
                        description = "Access specifiers control who can access or modify your class members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, you might have seen the public: keyword. Its part of whats called access specifiers, which control how and where you can access your class members (attributes and methods).",
                                    styledText = listOf("access specifiers")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "" +
                                            "There are three main access specifiers:\n" +
                                            "1. public - Anyone can access these members.\n" +
                                            "2. private - Only the class itself can access these members.\n" +
                                            "3. protected - Like private, but accessible by classes that inherit from this class. In the next lessons, well break down each of these and see how they work in action.",
                                    styledText = listOf("access specifiers")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Public Access Specifier
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub2",
                        title = "Public Access Specifier",
                        description = "The public specifier allows anyone to access your class members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When you use the public keyword, it means anyone can access that part of your class.",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
    public:
    int x;   // Public attribute
};

int main () {
    MyClass myObj;
    myObj.x = 25;  // This is allowed because x is public
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the example, x is public, so it can be accessed directly from outside the class.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Private Access Specifier
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub3",
                        title = "Private Access Specifier",
                        description = "The private specifier keeps your class members hidden from the outside world.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "When you use the private keyword, it means only the class itself can access those members.",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
    public :
    int x; // Public attribute
    private :
    int y; // Private attribute
};

int main () {
    MyClass myObj;
    myObj.x = 25;  // This works because x is public
    
    // Error: y is private, cant access it directly!
    myObj.y = 50;
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this case, y is private, so trying to access it directly will result in an error.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Protected Access Specifier
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub4",
                        title = "Protected Access Specifier",
                        description = "The protected specifier allows access to derived classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "With the protected keyword, only the class and its derived classes can access these members.",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
    protected:
    int z;  // Protected attribute
};

int main () {
    MyClass myObj;
    // Error: z is protected, cant access it directly
    myObj.z = 30;
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, z is protected, meaning it cannot be accessed directly from outside the class. Well discuss derived classes later, but for now, remember that protected members are for use within the class and its child classes.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Default Access Specifier
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub5",
                        title = "Default Access Specifier",
                        description = "If you dont specify an access specifier, its treated as private by default.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If you forget to add an access specifier in a class, C++ assumes that everything is private by default.",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
    int x;  // Private by default
};

int main () {
    MyClass myObj;
    // Error: x is private by default
    myObj.x = 25;
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Since x doesnt have an access specifier, it is private by default, and cannot be accessed directly from outside the class.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the Code",
                        description = "Complete the class definition with appropriate access specifier.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete code with the correct access specifier to make the variables accessible outside the class.",
                                incompleteCode = """
class MyClass {
    ___:
    int x;
    int y;
};

int main() {
    MyClass obj;
    obj.x = 10; //Accessed Outside
    obj.y = 20; //Accessed Outside
    return 0;
}    
""".trimIndent(),
                                correctCode = "public",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 6: Accessing Private Members
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub6",
                        title = "Accessing Private Members",
                        description = "In the next lessons, we will discuss how to set and get values for private members and work with derived classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Alright, before you get all worried about accessing those sneaky private members and dealing with derived classes, dont worry! Well cover all of that in the next lessons. Stay tuned, and well make it fun!",
                                    styledText = listOf("private members")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),


                    // Sub-lesson 6: Quick Practice
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub6",
                        title = "Quick Practice!",
                        description = "Time to experiment with access specifiers! Can you mix public, private, and protected in one class?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try creating a class with different access specifiers. For example, make some members public, some private, and some protected. See how they behave when accessed outside or inside the class.",
                                    styledText = listOf("class")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 7: C++ Setters and Getters
            Lesson(
                id = cppAdvancedStageIds.lesson7,
                title = "C++ Setters and Getters",
                description = "Learn how to control access to private members using setters and getters!",
                lessonContents = listOf(

                    // Sub-lesson 1: Introduction to Setters and Getters
                    LessonContent(
                        id = "cpp_setters_getters_1_sub1",
                        title = "What Are Setters and Getters?",
                        description = "Setters and getters provide controlled access to private members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Setters and getters are methods used to control how you access and modify private class members.",
                                    styledText = listOf("setters", "getters")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Setters allow you to set values for private variables, while getters allow you to retrieve those values. These methods ensure encapsulation, a key principle of object-oriented programming.",
                                    styledText = listOf("encapsulation")
                                )
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Why setters and getters are used?",
                                options = listOf(
                                    "To manipulate private class members",
                                    "just for fun",
                                    "To manipulate public class members",
                                    "they are not used"
                                ),
                                correctAnswer = "To manipulate private class members",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),


                    // Sub-lesson 2: Using Setters and Getters
                    LessonContent(
                        id = "cpp_setters_getters_1_sub2",
                        title = "Using Setters and Getters in C++",
                        description = "Learn how to define and use setter and getter methods in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Heres how you define a setter and a getter method. Setters are typically used to set values, and getters retrieve them.",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
private:
    int age;  // Private member

public:
    // Setter method
    void setAge(int newAge) {
        age = newAge;
    }

    // Getter method
    int getAge() {
        return age;
    }
};

int main() {
    MyClass myObj;
    myObj.setAge(25);  // Set age using setter
    int currentAge = myObj.getAge();  // Get age using getter
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this example, the setAge method sets the value of age, and the getAge method retrieves it.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Why Use Setters and Getters?
                    LessonContent(
                        id = "cpp_setters_getters_1_sub3",
                        title = "Why Use Setters and Getters?",
                        description = "Understand why setters and getters are important for data validation and encapsulation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "By using setters and getters, we can add validation or extra logic before setting or getting data. This ensures that the internal state of the object remains consistent and valid.",
                                    styledText = listOf("validation", "logic")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, a setter can be used to check if a value is valid before assigning it to the private member, ensuring data integrity.",
                                    styledText = listOf("setter")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
private:
    int age;

public:
    // Setter with validation
    void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            std::cout << "Age must be positive!" << std::endl;
        }
    }

    // Getter
    int getAge() {
        return age;
    }
};

int main() {
    MyClass myObj;
    myObj.setAge(-5);  // Invalid input
    myObj.setAge(30);  // Valid input
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In the example, the setter ensures that only valid positive values are assigned to age.",
                                    styledText = listOf("setter", "validation")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the code",
                        description = "Ok so now try to complete the program.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Create setter method to setUser age.",
                                incompleteCode = """
class MyClass {
private:
    int age;  // Private member

public:
    // Setter method
    void setAge(int newAge) {
        age = ___;
    }
};
""".trimIndent(),
                                correctCode = "newAge",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),


                    // Sub-lesson 4: Best Practices for Setters and Getters
                    LessonContent(
                        id = "cpp_setters_getters_1_sub4",
                        title = "Best Practices for Setters and Getters",
                        description = "Learn the best practices when using setters and getters.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A best practice is to keep your setters and getters simple. Avoid putting too much logic in them, as they should be responsible for one task: setting or getting a value.",
                                    styledText = listOf("best practices")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Also, consider whether you need both a setter and a getter. For read-only members, you may only need a getter.",
                                    styledText = listOf("read-only")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Correct Structure with Access Specifiers
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub6",
                        title = "Correct Structure of Class",
                        description = "A good practice is to make data members private and methods public. This encapsulates the data and ensures it is accessed through the classs public interface.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To maintain a good class structure, always make your data members private and provide public methods to access or modify them. This follows the principle of encapsulation.",
                                    styledText = listOf("encapsulation")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
    private:
    // Private Members
    
    public:
    // Constructor If needed
    
    // Setters and Getters
};

int main() {
    MyClass obj;
      // Use public method to modify private data
    obj.setX(20);
    
      // Use public method to access private data
    int value = obj.getX();  
    return 0;
}
                    """.trimIndent()
                            ),
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: Quick Practice
                    LessonContent(
                        id = "cpp_access_specifiers_1_sub7",
                        title = "Quick Practice!",
                        description = "Time to experiment with access specifiers! Can you mix public, private, and protected in one class?",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try creating a class with different access specifiers. For example, make some members public, some private, and some protected. See how they behave when accessed outside or inside the class.",
                                    styledText = listOf("class")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 8: C++ Inheritance
            Lesson(
                id = cppAdvancedStageIds.lesson8,
                title = "C++ Inheritance",
                description = "Learn what inheritance is and why its super useful in C++.",
                lessonContents = listOf(

                    // Sub-lesson 1: What is Inheritance?
                    LessonContent(
                        id = "cpp_inheritance_intro_sub1",
                        title = "What is Inheritance?",
                        description = "Inheritance allows one class to inherit properties and behaviors (methods) from another class. Think of it like family: if youre born into a family, you inherit some of their traits.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, one class can inherit from another class. The child class gets all the properties and behaviors of the parent class. This is like a child inheriting characteristics from their parents!",
                                    styledText = listOf("inherit", "properties", "behaviors")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, if you have a Person class and a Student class, the Student class can inherit from Person and get all the general attributes (like name, age) and methods (like talk) from Person.",
                                    styledText = listOf("Person", "Student")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Why is Inheritance Important?
                    LessonContent(
                        id = "cpp_inheritance_intro_sub2",
                        title = "Why Inheritance is Important?",
                        description = "Inheritance helps to reuse code, reduce redundancy, and make code easier to maintain.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The biggest advantage of inheritance is code reuse. Instead of writing the same code multiple times, we can simply inherit it. This leads to cleaner, more maintainable code.",
                                    styledText = listOf("code reuse")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, if many different vehicle types share similar properties, we could create a base class Vehicle and have cars, trucks, and motorcycles inherit from it.",
                                    styledText = listOf("Vehicle", "cars", "trucks", "motorcycles")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What happens in inheritance?",
                                options = listOf(
                                    "child class gets only data members of parent class",
                                    "child class gets only methods of parent class",
                                    "inheritance is useless",
                                    "child class get all data members and methods of parent class",
                                ),
                                correctAnswer = "child class get all data members and methods of parent class",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),

                    // Sub-lesson 3: Basic Structure of Inheritance (without members yet)
                    LessonContent(
                        id = "cpp_inheritance_intro_sub3",
                        title = "Basic Structure of Inheritance",
                        description = "Let’s start with the basic structure of inheritance in C++. We’ll create two classes: a base class and a derived class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here’s how inheritance is set up in C++:",
                                    styledText = listOf()
                                )
                            ),
                            ContentBlock.Code(
                                code = """
// Base class (parent)
class Vehicle {
  public:
    void move() {
      cout << "The vehicle is moving!" << endl;
    }
};

// Derived class (child)
class Car : public Vehicle {
  // This can access all methods of Vehicle class
};
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To inherit from a class, use the : symbol." +
                                            "\n\nIn this example, the Car class inherits from the Vehicle class. It doesn’t have any extra attributes or methods yet, but it can use the method `move()` from the Vehicle class.",
                                    styledText = listOf("Car", "Vehicle", "move()", ":")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Inheritance with Members and Methods
                    LessonContent(
                        id = "cpp_inheritance_intro_sub4",
                        title = "Inheritance with Members and Methods",
                        description = "Now, let’s add some members and methods to the classes and see how inheritance works with attributes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Let’s give the Vehicle class an attribute (like brand) and see how the Car class can access it.",
                                    styledText = listOf("Vehicle", "Car", "brand")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
// Base class (parent)
class Vehicle {
  public:
    string brand = "Ford"; 
    void move() {
      cout << "The vehicle is moving!" << endl;
    }
};

// Derived class (child) inherits from Vehicle
class Car : public Vehicle {
  public:
    string model = "Mustang"; // Car has its own attribute
};

int main() {
  Car myCar;
  cout << "Car brand: " << myCar.brand << endl;  // Inherited attribute
  cout << "Car model: " << myCar.model << endl;  // Car-specific attribute
  myCar.move();  // Inherited method
  return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now, the Car class can use the brand attribute from the Vehicle class, and it also has its own model attribute. The move() method is inherited from Vehicle, too!",
                                    styledText = listOf("Car", "brand", "move()")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Constructors and Using Them in Inheritance
                    LessonContent(
                        id = "cpp_inheritance_intro_sub5",
                        title = "Constructors and Using Them in Inheritance",
                        description = "Lets learn how to use constructors with inheritance. Well create a constructor in the parent class and see how it affects the child class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, a constructor is a special function that is automatically called when an object is created. Let’s see how constructors work in inheritance.",
                                    styledText = listOf("constructor")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
// Base class (parent) with constructor
class Vehicle {
  public:
    string brand;
    
    // Constructor of Vehicle
    Vehicle(string b) {
      brand = b;
      cout << "Vehicle constructor called." << endl;
    }

    void move() {
      cout << "The vehicle is moving!" << endl;
    }
};

// Derived class (child) inherits from Vehicle
class Car : public Vehicle {
  public:
    string model;
    
      // Constructor of Car calls Vehicles constructor
    Car(string b, string m) : Vehicle(b) {
      model = m;
      cout << "Car constructor called." << endl;
    }
};

int main() {
  Car myCar("Ford", "Mustang");
  // Inherited attribute
  cout << "Car brand: " << myCar.brand << endl; 
  
  // Car-specific attribute
  cout << "Car model: " << myCar.model << endl;
  
  // Inherited method
  myCar.move();  
  return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Notice that the Car class uses a constructor to initialize both its own attributes and the inherited brand attribute by calling the constructor of the Vehicle class.",
                                    styledText = listOf("Car", "Vehicle", "constructor")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),


                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the code",
                        description = "Ok so now try to complete the program.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the code to let Car class inherit from Vehicle.",
                                incompleteCode = """
// Base class (parent)
class Vehicle {
  public:
    string brand = "Ford"; 
    void move() {
      cout << "The vehicle is moving!" << endl;
    }
};

// Derived class (child) inherits from Vehicle
class Car ___ public Vehicle {
  public:
    string model = "Mustang"; // Car has its own attribute
};

""".trimIndent(),
                                correctCode = ":",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),


                    // Sub-lesson 6: Practice
                    LessonContent(
                        id = "cpp_inheritance_intro_sub6",
                        title = "Practice",
                        description = "Try creating your own classes and use inheritance with constructors. Experiment with access modifiers and creating objects from derived classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For practice, try creating a Person class with a constructor, then create a Student class that inherits from Person. Experiment with constructors, attributes, and methods!",
                                    styledText = listOf("Person", "Student", "constructor")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember, to inherit from a class, we need to set its members as public or protected. By default, if a class is inherited as private, the members will not be accessible in the derived class.",
                                    styledText = listOf("public", "protected", "private")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 9 : C++ Multilevel Inheritance
            Lesson(
                id = cppAdvancedStageIds.lesson9,
                title = "Multilevel Inheritance in C++",
                description = "Learn about multilevel inheritance in C++ where a class can inherit from another class, which itself is inherited from a third class. Its like a family tree of classes!",
                lessonContents = listOf(

                    // Sub-lesson 1: What is Multilevel Inheritance?
                    LessonContent(
                        id = "cpp_multilevel_inheritance_sub1",
                        title = "What is Multilevel Inheritance?",
                        description = "Multilevel inheritance allows one class to inherit from another class, which has already inherited from a third class. Its like passing down traits from one generation to another.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, multilevel inheritance happens when a class inherits from another class, which itself inherits from a grandparent class.",
                                    styledText = listOf("multilevel inheritance", "inherits")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, the Dog class inherits from Mammal, and Mammal inherits from Animal. So, Dog has all the traits of both Mammal and Animal.",
                                    styledText = listOf("Dog", "Mammal", "Animal")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: How Multilevel Inheritance Works
                    LessonContent(
                        id = "cpp_multilevel_inheritance_sub2",
                        title = "How Multilevel Inheritance Works",
                        description = "Lets see how classes can inherit properties and behaviors from more than one class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The Dog class inherits not only from Mammal but also from the Animal class. So it gets all the properties and methods from both parent classes!",
                                    styledText = listOf("Dog", "Mammal", "Animal")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
// Grandparent class: Animal
class Animal {
public:
    void eat() {
        cout << "This animal eats!" << endl;
    }
};

// Parent class: Mammal (inherits from Animal)
class Mammal : public Animal {
public:
    void walk() {
        cout << "This mammal walks!" << endl;
    }
};

// Child class: Dog (inherits from Mammal, and Animal)
class Dog : public Mammal {
public:
    void bark() {
        cout << "This dog barks!" << endl;
    }
};

int main() {
    Dog myDog;
    myDog.eat();   // Inherited from Animal
    myDog.walk();  // Inherited from Mammal
    myDog.bark();   // Specific to Dog
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, the Dog class can call `eat()` from Animal, `walk()` from Mammal, and `bark()` from itself. This demonstrates multilevel inheritance in action!",
                                    styledText = listOf("Dog", "eat()", "walk()", "bark()")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Why Use Multilevel Inheritance?
                    LessonContent(
                        id = "cpp_multilevel_inheritance_sub3",
                        title = "Why Use Multilevel Inheritance?",
                        description = "Multilevel inheritance helps organize classes into a hierarchy, making code more manageable and easier to understand.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Multilevel inheritance is useful when you want to model a hierarchy. For example, animals can be grouped into different species (like dogs, cats, etc.).",
                                    styledText = listOf(
                                        "multilevel inheritance",
                                        "hierarchy",
                                        "animals"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "It helps avoid duplication of code, and makes your code more flexible and easier to maintain.",
                                    styledText = listOf("avoid duplication", "flexible", "maintain")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: When Not to Use Multilevel Inheritance
                    LessonContent(
                        id = "cpp_multilevel_inheritance_sub4",
                        title = "When Not to Use Multilevel Inheritance",
                        description = "While multilevel inheritance can be useful, there are cases when its better to avoid it. Lets explore those.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "If your hierarchy is too deep (like a chain of five or more classes), it can make the code harder to follow and maintain. Try to keep things simple!",
                                    styledText = listOf(
                                        "deep hierarchy",
                                        "harder to follow",
                                        "simple"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Instead of deep inheritance, consider using composition, where a class can contain objects of other classes.",
                                    styledText = listOf("composition", "contain objects")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp6_sub8",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of lesson.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is multilevel inheritance in C++?",
                                options = listOf(
                                    "A class inheriting from multiple classes",
                                    "A class that is derived from another derived class",
                                    "A way to create private members",
                                    "A method of accessing private data"
                                ),
                                correctAnswer = "A class that is derived from another derived class",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ
                    ),

                    // Sub-lesson 5: Practice Exercise
                    LessonContent(
                        id = "cpp_multilevel_inheritance_sub5",
                        title = "Practice Exercise",
                        description = "Now its your turn! Try creating a multilevel inheritance structure with your own classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Create a class hierarchy with at least three levels. For example, create a base class `Vehicle`, a parent class `Car`, and a child class `ElectricCar`.",
                                    styledText = listOf("Vehicle", "Car", "ElectricCar")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember to inherit properties and methods from each class as you go down the hierarchy!",
                                    styledText = listOf("inherit", "properties", "methods")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try adding specific methods to each class and see how inheritance works across multiple levels!",
                                    styledText = listOf("specific methods", "inheritance")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 10 : C++ Multiple Inheritance
            Lesson(
                id = cppAdvancedStageIds.lesson10,
                title = "Multiple Inheritance in C++",
                description = "Learn about multiple inheritance where a class can inherit from more than one class, getting properties and methods from all parent classes.",
                lessonContents = listOf(

                    // Sub-lesson 1: What is Multiple Inheritance?
                    LessonContent(
                        id = "cpp_multiple_inheritance_sub1",
                        title = "What is Multiple Inheritance?",
                        description = "Multiple inheritance is when a class can inherit from more than one class at the same time.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, a class can inherit from more than one base class. It's like your dog inheriting traits from both a 'Mammal' class and a 'Pet' class at the same time!",
                                    styledText = listOf(
                                        "multiple inheritance",
                                        "dog",
                                        "Mammal",
                                        "Pet"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Multiple inheritance helps combine different functionalities into one class. A 'FlyingCar' could inherit from both 'Car' and 'Aircraft'.",
                                    styledText = listOf("FlyingCar", "Car", "Aircraft")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: How Multiple Inheritance Works
                    LessonContent(
                        id = "cpp_multiple_inheritance_sub2",
                        title = "How Multiple Inheritance Works",
                        description = "Let's see how C++ allows a class to inherit from two classes, and how the compiler handles it.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In multiple inheritance, a class inherits from more than one base class. Here's how it works:",
                                    styledText = listOf(
                                        "multiple inheritance",
                                        "base class",
                                        "inherits"
                                    )
                                )
                            ),
                            ContentBlock.Code(
                                code = """
// Base class 1: Animal
class Animal {
public:
    void eat() {
        cout << "Animal eats!" << endl;
    }
};

// Base class 2: Pet
class Pet {
public:
    void play() {
        cout << "Pet plays!" << endl;
    }
};

// Derived class:Dog (inherits from Animal and Pet)
class Dog : public Animal, public Pet {
public:
    void bark() {
        cout << "Dog barks!" << endl;
    }
};

int main() {
    Dog myDog;
    myDog.eat();   // Inherited from Animal
    myDog.play();  // Inherited from Pet
    myDog.bark();  // Specific to Dog
    return 0;
}
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The 'Dog' class inherits both 'eat()' from 'Animal' and 'play()' from 'Pet'. This demonstrates how a class can inherit from multiple classes in C++.",
                                    styledText = listOf("Dog", "eat()", "play()")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Why Use Multiple Inheritance?
                    LessonContent(
                        id = "cpp_multiple_inheritance_sub3",
                        title = "Why Use Multiple Inheritance?",
                        description = "Multiple inheritance lets us combine functionalities from different classes into one. Let's look at why it's useful.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Multiple inheritance allows us to combine behaviors. For example, a 'FlyingCar' needs both car-like and aircraft-like behaviors.",
                                    styledText = listOf("FlyingCar", "car-like", "aircraft-like")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "It avoids duplication. For example, the 'Dog' class doesn't need to rewrite 'eat()' and 'play()' methods. It simply inherits them.",
                                    styledText = listOf("Dog", "eat()", "play()")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content 4: Interactive Input Block
                    LessonContent(
                        id = "beginner_cpp4_content4",
                        title = "Complete the code",
                        description = "Ok so now try to complete the program.",
                        contentBlocks = listOf(
                            ContentBlock.InteractiveInputBlock(
                                question = "Complete the class declaration to correctly inherit from both Animal and Pet classes.",
                                incompleteCode = """
// Base class 1: Animal
class Animal {
public:
    void eat() {
        cout << "Animal eats!" << endl;
    }
};

// Base class 2: Pet
class Pet {
public:
    void play() {
        cout << "Pet plays!" << endl;
    }
};

// Derived class:Dog 
class Dog : public Animal, public ___ {
public:
    void bark() {
        cout << "Dog barks!" << endl;
    }
};
""".trimIndent(),
                                correctCode = "Pet",
                                userInput = null,
                                isCodeCorrect = false
                            )
                        ),
                        type = LessonContentType.INTERACTIVE,
                        status = LessonStatus.ACTIVE
                    ),


                    // Sub-lesson 4: The Diamond Problem in Multiple Inheritance
                    LessonContent(
                        id = "cpp_multiple_inheritance_sub4",
                        title = "The Diamond Problem",
                        description = "Multiple inheritance can cause issues like the 'Diamond Problem' where a class inherits from two classes that have a common ancestor.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The Diamond Problem occurs when a class inherits from two classes that both inherit from a common base class, leading to ambiguity.",
                                    styledText = listOf("Diamond Problem", "ambiguity")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "For example, if both 'Class A' and 'Class B' inherit from 'Class C', and 'Class D' inherits from both 'Class A' and 'Class B', how should it call methods from 'Class C'?",
                                    styledText = listOf("Class A", "Class B", "Class C", "Class D")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class A {
public:
    void speak() {
        cout << "Speaking from A!" << endl;
    }
};

class B : public A {
public:
    void greet() {
        cout << "Hello from B!" << endl;
    }
};

class C : public A {
public:
    void shout() {
        cout << "Shouting from C!" << endl;
    }
};

// Diamond inheritance: Class D inherits from both B and C
class D : public B, public C {
public:
    void callAll() {
        greet();
        shout();
        speak(); // Ambiguity, because both B and C inherit from A
    }
};
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Here, Class D can potentially call `speak()` from both Class B and Class C. This causes ambiguity, which can be resolved using virtual inheritance in C++.",
                                    styledText = listOf("D", "speak()", "B", "C")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Virtual Inheritance to Solve the Diamond Problem
                    LessonContent(
                        id = "cpp_multiple_inheritance_sub5",
                        title = "Virtual Inheritance",
                        description = "To solve the Diamond Problem, we can use virtual inheritance. This ensures only one instance of the base class is inherited.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, we can resolve the Diamond Problem using virtual inheritance. This means only one instance of the common base class is inherited.",
                                    styledText = listOf("virtual inheritance", "Diamond Problem")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class A {
public:
    void speak() {
        cout << "Speaking from A!" << endl;
    }
};

// Using virtual inheritance
class B : virtual public A {
public:
    void greet() {
        cout << "Hello from B!" << endl;
    }
};

class C : virtual public A {
public:
    void shout() {
        cout << "Shouting from C!" << endl;
    }
};

class D : public B, public C {
public:
    void callAll() {
        greet();
        shout();
        speak(); // Now there's no ambiguity
    }
};
                    """.trimIndent()
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Now, Class D can call `speak()` without ambiguity because of virtual inheritance.",
                                    styledText = listOf("virtual inheritance", "speak()")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content: Simple Quiz on Multiple Inheritance
                    LessonContent(
                        id = "beginner_cpp_multiple_inheritance_quiz",
                        title = "Quiz: Multiple Inheritance 🧠",
                        description = "Test your understanding of multiple inheritance in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is multiple inheritance?",
                                options = listOf(
                                    "A class inheriting from a single base class",
                                    "A class inheriting from multiple base classes",
                                    "A single class having multiple methods",
                                    "Inheritance without a derived class"
                                ),
                                correctAnswer = "A class inheriting from multiple base classes",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        status = LessonStatus.ACTIVE
                    ),


                    // Sub-lesson 6: Practice Exercise
                    LessonContent(
                        id = "cpp_multiple_inheritance_sub6",
                        title = "Practice Exercise",
                        description = "Create your own example of multiple inheritance with at least two parent classes. Try solving the Diamond Problem with virtual inheritance!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try to create a hierarchy where one class inherits from two classes that share a common base class. Use virtual inheritance to resolve ambiguity.",
                                    styledText = listOf(
                                        "virtual inheritance",
                                        "ambiguity",
                                        "common base class"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Try to create different methods in each class and observe how inheritance and virtual inheritance work together.",
                                    styledText = listOf(
                                        "methods",
                                        "inheritance",
                                        "virtual inheritance"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 11: Encapsulation in C++
            Lesson(
                id = cppAdvancedStageIds.lesson11,
                title = "Encapsulation in C++",
                description = "Learn how encapsulation helps bundle data and methods in C++ to protect sensitive information.",
                lessonContents = listOf(

                    // Sub-lesson 1: Introduction to Encapsulation
                    LessonContent(
                        id = "cpp_encapsulation_sub1",
                        title = "Introduction to Encapsulation",
                        description = "Understand what encapsulation is and why it’s important in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Encapsulation is a way to bundle data (variables) and methods (functions) into a single unit, like a class. It restricts direct access to some components to protect sensitive data.",
                                    styledText = listOf("Encapsulation")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "By using access modifiers like `private`, `public`, and `protected`, encapsulation ensures that only the intended parts of a class are accessible from the outside.",
                                    styledText = listOf(
                                        "access modifiers",
                                        "`private`",
                                        "`public`",
                                        "`protected`"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Key Features of Encapsulation
                    LessonContent(
                        id = "cpp_encapsulation_sub2",
                        title = "Key Features of Encapsulation",
                        description = "Explore how access modifiers and getter/setter methods implement encapsulation.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "1. Access Modifiers control the visibility of class members: `private` hides them, `public` exposes them, and `protected` provides limited access.",
                                    styledText = listOf(
                                        "Access Modifiers",
                                        "`private`",
                                        "`public`",
                                        "`protected`"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "2. Getters and setters allow controlled access to private variables, ensuring data safety while maintaining usability.",
                                    styledText = listOf("Getters and setters", "private variables")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content: Simple Quiz on Encapsulation
                    LessonContent(
                        id = "beginner_cpp_encapsulation_quiz",
                        title = "Quiz: Encapsulation 🧠",
                        description = "Test your understanding of encapsulation in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is encapsulation in C++?",
                                options = listOf(
                                    "Binding data and methods into a single unit",
                                    "Dividing a program into multiple functions",
                                    "Inheriting properties from a parent class",
                                    "Executing multiple instructions simultaneously"
                                ),
                                correctAnswer = "Binding data and methods into a single unit",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 3: Encapsulation Code Example
                    LessonContent(
                        id = "cpp_encapsulation_sub3",
                        title = "Encapsulation Code Example",
                        description = "See encapsulation in action with a C++ code example.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

class Student {
private:
    string name; // Private variable
    int age;     // Private variable

public:
    // Constructor
    Student(string studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Getter for name
    string getName() {
        return name;
    }

    // Setter for name
    void setName(string newName) {
        name = newName;
    }

    // Getter for age
    int getAge() {
        return age;
    }

    // Setter for age
    void setAge(int newAge) {
        if (newAge > 0)
            age = newAge;
    }
};

int main() {
    Student student("John Doe", 20);
    cout << "Name: " << student.getName() << ", Age: " << student.getAge() << endl;

    student.setName("Jane Doe");
    student.setAge(22);
    cout << "Updated Name: " << student.getName() << ", Updated Age: " << student.getAge() << endl;

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Benefits of Encapsulation
                    LessonContent(
                        id = "cpp_encapsulation_sub4",
                        title = "Benefits of Encapsulation",
                        description = "Learn how encapsulation improves your code.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Encapsulation improves your code by: \n1. Protecting sensitive data from unauthorized access. \n2. Making your code modular and easier to maintain. \n3. Allowing changes in implementation without affecting external code.",
                                    styledText = listOf(
                                        "Protecting sensitive data",
                                        "modular",
                                        "easier to maintain"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp_encapsulation_quiz",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of encapsulation in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which access specifier is primarily used for encapsulation?",
                                options = listOf(
                                    "public",
                                    "private",
                                    "protected",
                                    "default"
                                ),
                                correctAnswer = "private",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        status = LessonStatus.ACTIVE
                    ),


                    // Sub-lesson 5: Encapsulation – A Simple Process
                    LessonContent(
                        id = "cpp_encapsulation_sub5",
                        title = "Encapsulation – A Simple Process",
                        description = "Understand why encapsulation isn’t as complicated as it sounds.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Encapsulation is just a fancy name for making variables private and controlling access to them. It's not something you need to overthink – it’s simply about organizing your code logically and securely.",
                                    styledText = listOf("fancy name", "private")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Don’t complicate it! Encapsulation is an easy concept that makes your programs cleaner and safer – no extra effort required!",
                                    styledText = listOf("Don’t complicate it!")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 12: Polymorphism in C++
            Lesson(
                id = cppAdvancedStageIds.lesson12,
                title = "Polymorphism in C++",
                description = "Learn how polymorphism allows objects to take on multiple forms and enables dynamic behavior in C++.",
                lessonContents = listOf(

                    // Sub-lesson 1: Introduction to Polymorphism
                    LessonContent(
                        id = "cpp_polymorphism_sub1",
                        title = "Introduction to Polymorphism",
                        description = "Understand what polymorphism is and its role in object-oriented programming.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Polymorphism is a key concept in object-oriented programming that allows objects to be treated as instances of their parent class while exhibiting behavior specific to their actual class.",
                                    styledText = listOf(
                                        "Polymorphism",
                                        "object-oriented programming"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "It enables the same function name to work differently based on the object calling it, either at compile-time or runtime.",
                                    styledText = listOf("compile-time", "runtime")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Types of Polymorphism
                    LessonContent(
                        id = "cpp_polymorphism_sub2",
                        title = "Types of Polymorphism",
                        description = "Explore compile-time and runtime polymorphism in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "1. Compile-time Polymorphism: Achieved using function overloading and operator overloading. Behavior is determined at compile-time.",
                                    styledText = listOf(
                                        "Compile-time Polymorphism",
                                        "function overloading",
                                        "operator overloading"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "2. Runtime Polymorphism: Achieved using virtual functions and inheritance. Behavior is determined at runtime.",
                                    styledText = listOf(
                                        "Runtime Polymorphism",
                                        "virtual functions",
                                        "inheritance"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp_polymorphism_quiz",
                        title = "Quiz Time! 🧠",
                        description = "Test your knowledge of polymorphism in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "How is runtime polymorphism implemented in C++?",
                                options = listOf(
                                    "Using function overloading",
                                    "Using constructors",
                                    "Using virtual functions",
                                    "Using friend functions"
                                ),
                                correctAnswer = "Using virtual functions",
                                userAnswer = null,
                                isCorrect = false
                            ),
                        ),
                        type = LessonContentType.QUIZ,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 3: Compile-time Polymorphism Example
                    LessonContent(
                        id = "cpp_polymorphism_sub3",
                        title = "Compile-time Polymorphism Example",
                        description = "Learn about compile-time polymorphism with function overloading.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

class Calculator {
public:
    // Function overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
};

int main() {
    Calculator calc;
    cout << "Addition of two integers: " << calc.add(5, 10) << endl;
    cout << "Addition of two doubles: " << calc.add(5.5, 10.5) << endl;
    cout << "Addition of three integers: " << calc.add(1, 2, 3) << endl;

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Runtime Polymorphism Example
                    LessonContent(
                        id = "cpp_polymorphism_sub4",
                        title = "Runtime Polymorphism Example",
                        description = "Learn about runtime polymorphism with virtual functions.",
                        contentBlocks = listOf(
                            ContentBlock.Code(
                                code = """
#include <iostream>
using namespace std;

class Animal {
public:

 // Virtual function    
    virtual void makeSound() {
        cout << "Animal makes a sound" << endl;
    }
};

class Dog : public Animal {
public:

    // Overriding base class function
    void makeSound() override { 
        cout << "Dog barks" << endl;
    }
};

class Cat : public Animal {
public:
    void makeSound() override {
        cout << "Cat meows" << endl;
    }
};

int main() {
    Animal* animal;
    Dog dog;
    Cat cat;

    animal = &dog;
    // Calls Dog's makeSound()
    animal->makeSound(); 

    animal = &cat;
     // Calls Cat's makeSound()
    animal->makeSound();

    return 0;
}
                    """.trimIndent()
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Benefits of Polymorphism
                    LessonContent(
                        id = "cpp_polymorphism_sub5",
                        title = "Benefits of Polymorphism",
                        description = "Understand how polymorphism simplifies code and enhances flexibility.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Polymorphism improves code by: \n1. Enabling code reusability and flexibility. \n2. Supporting dynamic behavior and late binding. \n3. Making code more modular and easier to maintain.",
                                    styledText = listOf(
                                        "code reusability",
                                        "flexibility",
                                        "dynamic behavior",
                                        "late binding"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Content for "Quiz Time!"
                    LessonContent(
                        id = "beginner_cpp_polymorphism_quiz2",
                        title = "Quiz Time! 🧠",
                        description = "Test your understanding of polymorphism in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which keyword is used to implement runtime polymorphism in C++?",
                                options = listOf(
                                    "static",
                                    "virtual",
                                    "override",
                                    "friend"
                                ),
                                correctAnswer = "virtual",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                        status = LessonStatus.ACTIVE
                    ),

                    // Sub-lesson 6: Polymorphism Simplified
                    LessonContent(
                        id = "cpp_polymorphism_sub6",
                        title = "Polymorphism Simplified",
                        description = "Demystify polymorphism with an easy-to-understand analogy.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Think of polymorphism as a performer who can play multiple roles. A base class is the script, and derived classes are the actors who bring different roles to life.",
                                    styledText = listOf(
                                        "performer",
                                        "roles",
                                        "base class",
                                        "derived classes"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "It’s not magic – just a flexible way to let objects act differently while sharing a common interface. It’s simpler than it sounds!",
                                    styledText = listOf("flexible", "simpler than it sounds")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 13: Practice C++ OOP
            Lesson(
                id = cppAdvancedStageIds.lesson13,
                title = "Best Way To Learn OOP",
                description = "A step-by-step guide to mastering classes, inheritance, and more in C++.",
                lessonContents = listOf(

                    // Sub-lesson 1: How to Learn and Approach This Guide
                    LessonContent(
                        id = "master_classes_inheritance_sub1_learn_cpp",
                        title = "How to Learn and Approach This Guide",
                        description = "Follow each step carefully and practice consistently to master C++ OOP concepts.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This guide is designed to help you learn C++ OOP step by step. Follow each section and practice regularly.",
                                    styledText = listOf(
                                        "learn C++ OOP",
                                        "follow each section",
                                        "practice regularly"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Apply what you learn through small projects and revisit sections if needed for better understanding.",
                                    styledText = listOf("small projects", "revisit sections")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Understanding Classes in C++
                    LessonContent(
                        id = "master_classes_inheritance_sub2_cpp",
                        title = "Understanding Classes",
                        description = "Learn the basics of creating and using classes in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, classes are blueprints for creating objects. Each class can have attributes (variables) and methods (functions).",
                                    styledText = listOf("classes", "blueprints")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Start by defining a simple class with member variables like integers and strings, and create objects based on this class.",
                                    styledText = listOf("simple class", "objects")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Members and Methods in C++ Classes
                    LessonContent(
                        id = "master_classes_inheritance_sub3_cpp",
                        title = "Adding Members and Methods",
                        description = "Learn how to add data members (attributes) and methods (functions) to your classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Members (attributes) are variables within a class that hold data. Methods are functions that define behavior for the class.",
                                    styledText = listOf("members", "methods")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Define methods like setters and getters to access and modify your class's attributes.",
                                    styledText = listOf("setters", "getters")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: Constructors and Destructors
                    LessonContent(
                        id = "master_classes_inheritance_sub4_cpp",
                        title = "Understanding Constructors and Destructors",
                        description = "Learn about constructors and destructors to manage object creation and destruction in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "A constructor initializes objects when they are created. A destructor cleans up when an object is destroyed.",
                                    styledText = listOf("constructor", "destructor")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Define both parameterized and default constructors, as well as destructors for cleanup tasks.",
                                    styledText = listOf(
                                        "parameterized constructor",
                                        "default constructor"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Introduction to Inheritance in C++
                    LessonContent(
                        id = "master_classes_inheritance_sub5_cpp",
                        title = "Introduction to Inheritance",
                        description = "Learn how to reuse code through inheritance, a key feature of OOP.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Inheritance allows a class to inherit the properties and behaviors (methods) of another class. This promotes code reuse.",
                                    styledText = listOf("inheritance", "code reuse")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Create a derived class from a base class and reuse the base class’s methods and variables.",
                                    styledText = listOf("derived class", "base class")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

//                    // Sub-lesson 5: Polymorphism and Overriding Methods
//                    LessonContent(
//                        id = "master_classes_inheritance_sub5_cpp",
//                        title = "Polymorphism and Method Overriding",
//                        description = "Learn how to override methods to achieve polymorphism in C++.",
//                        contentBlocks = listOf(
//                            ContentBlock.Text(
//                                createAnnotatedText(
//                                    text = "Polymorphism allows methods to have different behaviors depending on the object that calls them. You can achieve this through method overriding.",
//                                    styledText = listOf("polymorphism", "method overriding")
//                                )
//                            ),
//                            ContentBlock.Text(
//                                createAnnotatedText(
//                                    text = "Override methods from the base class in the derived class to customize behavior.",
//                                    styledText = listOf("override", "customize behavior")
//                                )
//                            )
//                        ),
//                        type = LessonContentType.NON_INTERACTIVE,
//                       status = LessonStatus.LOCKED
//                    ),

                    // Sub-lesson 6: Multi-Level Inheritance
                    LessonContent(
                        id = "master_classes_inheritance_sub6_cpp",
                        title = "Multi-Level Inheritance",
                        description = "Learn about multi-level inheritance where a class can inherit from a derived class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Multi-level inheritance is when a derived class becomes the base class for another class.",
                                    styledText = listOf("multi-level inheritance", "derived class")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Create a chain of inheritance where each class builds upon the previous one.",
                                    styledText = listOf("chain of inheritance")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: Multiple Inheritance and Virtual Inheritance
                    LessonContent(
                        id = "master_classes_inheritance_sub7_cpp",
                        title = "Multiple Inheritance and Virtual Inheritance",
                        description = "Learn about multiple inheritance and virtual inheritance to avoid ambiguity.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In C++, multiple inheritance allows a class to inherit from more than one class. However, it can create ambiguity if two base classes have the same method.",
                                    styledText = listOf("multiple inheritance", "ambiguity")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Use virtual inheritance to solve issues with ambiguity in multiple inheritance.",
                                    styledText = listOf("virtual inheritance", "ambiguity solution")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 8: Abstract Classes and Interfaces
                    LessonContent(
                        id = "master_classes_inheritance_sub8_cpp",
                        title = "Abstract Classes and Interfaces",
                        description = "Learn how abstract classes and interfaces provide a blueprint for derived classes.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Abstract classes provide a blueprint for derived classes to implement specific methods. Interfaces allow you to define pure virtual functions that must be overridden.",
                                    styledText = listOf("abstract classes", "interfaces")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Create abstract classes with pure virtual functions and implement them in derived classes.",
                                    styledText = listOf("pure virtual functions")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 9: Putting It All Together: Building a Project
                    LessonContent(
                        id = "master_classes_inheritance_sub9_cpp",
                        title = "Real-World Application – Putting It All Together",
                        description = "Apply your C++ OOP knowledge by building a real-world project.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "By now, you should understand how to use classes, inheritance, and methods in C++. Build a small project that incorporates all these concepts.",
                                    styledText = listOf("real-world project", "apply knowledge")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Start with a simple project, such as a system that uses inheritance to manage different types of objects.",
                                    styledText = listOf("simple project", "inheritance")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 10: Keep Practicing and Experimenting
                    LessonContent(
                        id = "master_classes_inheritance_sub10_cpp",
                        title = "Keep Practicing and Experimenting",
                        description = "The key to mastering C++ OOP is consistent practice and building projects.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The more you practice and build, the better you will understand C++ OOP concepts. Keep experimenting with inheritance, polymorphism, and virtual functions.",
                                    styledText = listOf("practice", "build projects")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember, the best way to learn is by doing. Keep applying what you've learned in real-world scenarios.",
                                    styledText = listOf("real-world scenarios")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            ),

            // Lesson 14: Advanced C++ Concepts Recap
            Lesson(
                id = cppAdvancedStageIds.lesson14,
                title = "Advanced Concepts Recap",
                description = "A comprehensive review of key C++ concepts that lay the foundation for advanced programming skills.",
                lessonContents = listOf(

                    // Sub-lesson 1: Review of Classes & Objects
                    LessonContent(
                        id = "advanced_cpp_recap_sub1",
                        title = "Review of Classes & Objects",
                        description = "Classes form the blueprint, and objects are instances that bring it to life.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Classes in C++ encapsulate data and functions. Objects are created from these classes, and they represent specific instances of the class.",
                                    styledText = listOf("Classes", "Objects")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "By using objects, we instantiate a class and interact with its members.",
                                    styledText = listOf("instantiate", "interact")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 2: Class Methods in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub2",
                        title = "Class Methods in C++",
                        description = "Methods define behaviors for objects, allowing you to perform actions.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Class methods are functions that define the behavior of an object. These methods operate on the class's data members and allow interaction with the object.",
                                    styledText = listOf("methods", "behavior", "interact")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Remember that class methods can be defined inside the class or outside using the scope resolution operator (::).",
                                    styledText = listOf("scope resolution operator")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 3: Constructors in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub3",
                        title = "Constructors in C++",
                        description = "Constructors initialize objects and set the starting state.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Constructors are special class methods that are called when an object is created. They ensure that the object starts with a valid state.",
                                    styledText = listOf("Constructors", "initialized")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Default constructors, parameterized constructors, and copy constructors allow different ways of initializing an object.",
                                    styledText = listOf(
                                        "Default",
                                        "parameterized",
                                        "copy constructors"
                                    )
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 4: C++ Access Specifiers
                    LessonContent(
                        id = "advanced_cpp_recap_sub4",
                        title = "C++ Access Specifiers",
                        description = "Access specifiers control the visibility of class members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Access specifiers in C++ determine the level of accessibility for class members. Public members are accessible everywhere, while private members are only accessible within the class itself.",
                                    styledText = listOf("public", "private")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The 'protected' specifier allows members to be accessible within the class and by derived classes.",
                                    styledText = listOf("protected")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 5: Setters and Getters in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub5",
                        title = "Setters and Getters in C++",
                        description = "Setters and getters provide controlled access to private members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Setters and getters allow you to set and get the value of private variables from outside the class while maintaining control over how the data is accessed and modified.",
                                    styledText = listOf("Setters", "Getters")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This is a core principle of encapsulation, ensuring the integrity of the class data.",
                                    styledText = listOf("encapsulation")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 6: Inheritance in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub6",
                        title = "Inheritance in C++",
                        description = "Inheritance allows classes to derive from other classes, reusing code and enhancing flexibility.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Inheritance allows a class (child class) to inherit properties and methods from another class (parent class). This promotes code reuse and extension of existing functionality.",
                                    styledText = listOf(
                                        "Inheritance",
                                        "child class",
                                        "parent class"
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "The child class can extend or override the inherited behavior, adding its own unique functionality.",
                                    styledText = listOf("extend", "override")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 7: Multilevel Inheritance in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub7",
                        title = "Multilevel Inheritance in C++",
                        description = "Multilevel inheritance builds on the idea of a chain of inheritance.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In multilevel inheritance, a class derives from another derived class, forming a hierarchy. This chain of inheritance allows more complex relationships between classes.",
                                    styledText = listOf("multilevel inheritance")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Be mindful of the potential complexities and conflicts that may arise in multilevel inheritance, especially when it comes to overriding functions.",
                                    styledText = listOf("complexities", "conflicts")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 8: Multiple Inheritance in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub8",
                        title = "Multiple Inheritance in C++",
                        description = "Multiple inheritance allows a class to inherit from more than one base class.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In multiple inheritance, a class can inherit from more than one parent class, combining their functionality. However, this can lead to ambiguity and complexity in certain cases.",
                                    styledText = listOf("multiple inheritance")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Use multiple inheritance carefully to avoid complications such as the diamond problem, where a class inherits from two classes that share a common ancestor.",
                                    styledText = listOf("diamond problem")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 9: Encapsulation in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub9",
                        title = "Encapsulation in C++",
                        description = "Encapsulation ensures the data inside a class is protected and only accessible through defined interfaces.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Encapsulation involves bundling data (variables) and methods that operate on that data into a single unit (class). It also restricts access to some of the object's components to safeguard its integrity.",
                                    styledText = listOf("Encapsulation")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "This concept is fundamental for writing clean and secure code.",
                                    styledText = listOf("secure")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-lesson 10: Polymorphism in C++
                    LessonContent(
                        id = "advanced_cpp_recap_sub10",
                        title = "Polymorphism in C++",
                        description = "Polymorphism allows one interface to be used for different data types, enhancing flexibility and scalability.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Polymorphism allows methods to behave differently based on the object’s type. This is achieved through method overriding or method overloading.",
                                    styledText = listOf("Polymorphism", "overriding", "overloading")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "It enhances flexibility and scalability, making it easier to extend and modify code.",
                                    styledText = listOf("flexibility", "scalability")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                       status = LessonStatus.LOCKED
                    )

                ),
               status = LessonStatus.LOCKED
            ),

            // Advanced Quiz Lesson for C++
            Lesson(
                id = cppAdvancedStageIds.lesson15,
                title = "C++ Advanced Quiz",
                description = "Test your knowledge of advanced C++ concepts and OOP principles with these quizzes!",
                lessonContents = listOf(
                    // Sub-Lesson 1: Introduction to OOP
                    LessonContent(
                        id = "quiz_intro_oop",
                        title = "Introduction to OOP in C++",
                        description = "Test your understanding of Object-Oriented Programming principles in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following is not one of the four main principles of OOP?",
                                options = listOf(
                                    "Encapsulation",
                                    "Inheritance",
                                    "Abstraction",
                                    "Polymorphism",
                                    "Optimization"
                                ),
                                correctAnswer = "Optimization",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 2: Classes & Objects in C++
                    LessonContent(
                        id = "quiz_classes_objects",
                        title = "Classes & Objects in C++",
                        description = "Test your understanding of classes and objects in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following is used to create an object of a class in C++?",
                                options = listOf(
                                    "class MyClass;",
                                    "MyClass obj;",
                                    "obj.MyClass;",
                                    "create MyClass obj;"
                                ),
                                correctAnswer = "MyClass obj;",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 3: Class Methods in C++
                    LessonContent(
                        id = "quiz_class_methods",
                        title = "Class Methods in C++",
                        description = "Test your knowledge of class methods in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the correct way to declare a class method in C++?",
                                options = listOf(
                                    "void method() { }",
                                    "method void() { }",
                                    "void method(): { }",
                                    "void { method(); }"
                                ),
                                correctAnswer = "void method() { }",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 4: Constructors in C++
                    LessonContent(
                        id = "quiz_constructors",
                        title = "Constructors in C++",
                        description = "Test your understanding of constructors in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the main purpose of a constructor in C++?",
                                options = listOf(
                                    "To initialize the object",
                                    "To clean up resources",
                                    "To define methods",
                                    "To declare the class"
                                ),
                                correctAnswer = "To initialize the object",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 5: C++ Access Specifiers
                    LessonContent(
                        id = "quiz_access_specifiers",
                        title = "C++ Access Specifiers",
                        description = "Test your knowledge of access specifiers in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which access specifier allows access to members within the same class and derived classes?",
                                options = listOf(
                                    "private",
                                    "protected",
                                    "public",
                                    "internal"
                                ),
                                correctAnswer = "protected",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 6: Setters and Getters in C++
                    LessonContent(
                        id = "quiz_setters_getters",
                        title = "Setters and Getters in C++",
                        description = "Test your knowledge of setter and getter methods in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the main purpose of setter and getter methods?",
                                options = listOf(
                                    "To encapsulate data and provide controlled access",
                                    "To modify the class's methods",
                                    "To handle memory allocation",
                                    "To create objects"
                                ),
                                correctAnswer = "To encapsulate data and provide controlled access",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 7: C++ Inheritance
                    LessonContent(
                        id = "quiz_inheritance",
                        title = "C++ Inheritance",
                        description = "Test your understanding of inheritance in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which keyword is used to implement inheritance in C++?",
                                options = listOf(
                                    "extends",
                                    "inherits",
                                    "base",
                                    "public"
                                ),
                                correctAnswer = "public",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 8: C++ Multilevel Inheritance
                    LessonContent(
                        id = "quiz_multilevel_inheritance",
                        title = "C++ Multilevel Inheritance",
                        description = "Test your understanding of multilevel inheritance in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "In multilevel inheritance, how many levels of inheritance are involved?",
                                options = listOf(
                                    "One",
                                    "Two",
                                    "Three or more",
                                    "No levels"
                                ),
                                correctAnswer = "Three or more",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 9: C++ Multiple Inheritance
                    LessonContent(
                        id = "quiz_multiple_inheritance",
                        title = "C++ Multiple Inheritance",
                        description = "Test your understanding of multiple inheritance in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is multiple inheritance in C++?",
                                options = listOf(
                                    "A class inheriting from more than one base class",
                                    "A class inheriting from a single class multiple times",
                                    "A class inheriting from another class with multiple levels",
                                    "A class inheriting data members only"
                                ),
                                correctAnswer = "A class inheriting from more than one base class",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 10: Encapsulation in C++
                    LessonContent(
                        id = "quiz_encapsulation",
                        title = "Encapsulation in C++",
                        description = "Test your knowledge of encapsulation in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is encapsulation in C++?",
                                options = listOf(
                                    "The concept of hiding implementation details",
                                    "The process of inheriting from a class",
                                    "The ability to call methods from another class",
                                    "The act of creating multiple classes"
                                ),
                                correctAnswer = "The concept of hiding implementation details",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 11: Polymorphism in C++
                    LessonContent(
                        id = "quiz_polymorphism",
                        title = "Polymorphism in C++",
                        description = "Test your understanding of polymorphism in C++.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the purpose of polymorphism in C++?",
                                options = listOf(
                                    "To allow objects to take multiple forms",
                                    "To make a class inherit from multiple classes",
                                    "To create methods with the same name",
                                    "To access class methods"
                                ),
                                correctAnswer = "To allow objects to take multiple forms",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 12: Practice C++ OOP
                    LessonContent(
                        id = "quiz_practice_oop",
                        title = "Practice C++ OOP",
                        description = "Test your overall OOP knowledge with practice questions.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "What is the output of the following code snippet?\n`class Base { public: virtual void display() { cout << 'Base'; } }; class Derived : public Base { public: void display() override { cout << 'Derived'; } }; Derived obj; obj.display();`",
                                options = listOf(
                                    "Base",
                                    "Derived",
                                    "Compilation Error",
                                    "Runtime Error"
                                ),
                                correctAnswer = "Derived",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    ),

                    // Sub-Lesson 13: Advanced C++ Concepts Recap
                    LessonContent(
                        id = "quiz_advanced_cpp",
                        title = "Advanced C++ Concepts Recap",
                        description = "Test your overall understanding of advanced C++ concepts.",
                        contentBlocks = listOf(
                            ContentBlock.QuizContentBlock(
                                question = "Which of the following C++ features is used to ensure that an object cannot be modified?",
                                options = listOf(
                                    "const keyword",
                                    "mutable keyword",
                                    "static keyword",
                                    "inline functions"
                                ),
                                correctAnswer = "const keyword",
                                userAnswer = null,
                                isCorrect = false
                            )
                        ),
                        type = LessonContentType.QUIZ,
                       status = LessonStatus.LOCKED
                    )
                ),
               status = LessonStatus.LOCKED
            )
        )
    )
}

