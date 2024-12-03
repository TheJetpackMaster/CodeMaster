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
        id = "cpp_advanced_stage",
        title = "Advanced",
        lessons = listOf(

            // Lesson 1: Welcome to the Advanced Stage
            Lesson(
                id = "advanced_cpp1",
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
                                    text = "Now, it's time to level up and dive into the advanced stage.",
                                    styledText = listOf("level up")
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Keep practicing what you've learned to reinforce your foundation.",
                                    styledText = listOf()
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),

            // Lesson 2: Introduction to OOP
            Lesson(
                id = "advanced_cpp2",
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
                        status = LessonStatus.COMPLETED
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
                                    text = "In code, a class groups related properties (data) and methods (actions). For example, a class ' Car ' might have properties like ' color ' and ' speed ', and methods like ' drive() ' or ' brake() '.",
                                    styledText = listOf("properties", "methods")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
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
                                    text = "In code, an object is created from a class. For example, you can create multiple `Car` objects from the `Car` class, each with its unique `color` or `speed`.",
                                    styledText = listOf("Car", "objects")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
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
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),


            //Lesson 3: Classes & Objects in C++
            Lesson(
                id = "cpp_classes_1",
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
                                    styledText = listOf("class", "blueprint", "properties", "behaviors")
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
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 2: Creating a Class
                    LessonContent(
                        id = "cpp_classes_1_sub2",
                        title = "Creating a Class",
                        description = "Learn how to define a basic class in C++.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "To create a class in C++, use the `class` keyword followed by the class name and curly braces `{}`. The class definition ends with a semicolon `;`.",
                                    styledText = listOf("class", "curly braces", "semicolon")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
class MyClass {
  public:
    int myNum;
    string myString;
};
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
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
  MyClass myObj;  // Creating an object of the class
  return 0;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 4: Accessing and Assigning Values to Class Members
                    LessonContent(
                        id = "cpp_classes_1_sub4",
                        title = "Accessing and Assigning Values to Class Members",
                        description = "Learn how to access and assign values to class members using an object.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You can access and assign values to a class's members using an object. The object is followed by the dot (`.`) operator to access members.",
                                    styledText = listOf("object", "dot operator")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
int main() {
  MyClass myObj;
  myObj.myNum = 10;  // Accessing and assigning value to myNum
  myObj.myString = "Hello, C++";  // Accessing and assigning value to myString
  return 0;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
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
class Car {
  public:
    string brand;
    string model;
    int year;
};

int main() {
  Car car1, car2;  // Creating two objects
  return 0;
}
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Sub-lesson 6: Printing Class Values
                    LessonContent(
                        id = "cpp_classes_1_sub6",
                        title = "Printing Class Values",
                        description = "Learn how to print the values of class members.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Once you've created objects and assigned values to them, you can print the values of class members using the `cout` statement.",
                                    styledText = listOf("cout", "class members")
                                )
                            ),
                            ContentBlock.Code(
                                code = """
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
"""
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    ),

                    // Fun Practice Lesson: Let's Code!
                    LessonContent(
                        id = "cpp_classes_1_practice",
                        title = "Let's Code! (Practice)",
                        description = "Now that you've learned the basics, it's time to put it all together! Go ahead and create your own classes and objects. Have fun with it!",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "You've got this! Define a class, create some objects, and experiment with different attributes. The sky's the limit!",
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
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            )


        )
    )
}

