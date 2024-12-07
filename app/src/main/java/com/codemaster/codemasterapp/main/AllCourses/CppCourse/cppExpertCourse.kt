package com.codemaster.codemasterapp.main.AllCourses.CppCourse

import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createAnnotatedText
import com.codemaster.codemasterapp.main.AllCourses.helperFuntions.createSimpleText
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

fun cppExpertCourse(): Stage {

    return Stage(
        id = "cpp_expert_stage",
        title = "Expert",
        lessons = listOf(

            // Lesson 1 : Welcome to the ExpertStage Stage
            Lesson(
                id = "expert_cpp1",
                title = "Welcome to Expert Stage",
                description = "Congrats on leveling up! Ready for some coding magic and fun challenges?",
                lessonContents = listOf(

                    // Sub-lesson 1: Welcome to the Expert Stage!
                    LessonContent(
                        id = "expert_cpp1_sub1",
                        title = "Welcome to the Expert Stage!!",
                        description = "Get ready to level up your C++ skills with some fun challenges and advanced problem-solving.",
                        contentBlocks = listOf(
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Welcome to the Expert Stage! You've mastered the basics and intermediate levels of C++ – now it's time to tackle more complex challenges. 🎉",
                                    styledText = listOf(
                                        "Expert Stage",
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "In this stage, you'll sharpen your problem-solving skills with pattern printing, loops, and fun programming puzzles. It's time to take your coding to the next level! 💪",
                                    styledText = listOf(
                                        "problem-solving skills",
                                    )
                                )
                            ),
                            ContentBlock.Text(
                                createAnnotatedText(
                                    text = "Are you ready to tackle your first challenge? Let's get started!",
                                    styledText = listOf("first challenge")
                                )
                            )
                        ),
                        type = LessonContentType.NON_INTERACTIVE,
                        status = LessonStatus.COMPLETED
                    )
                ),
                status = LessonStatus.COMPLETED
            ),
        )
    )
}