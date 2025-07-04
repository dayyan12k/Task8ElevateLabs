# Task8ElevateLabs
This Java program is a console-based quiz application.

The application consists of two main parts:
1. A Question class to hold quiz question details.
2. A QuizApp class that contains the main method to run the quiz.

Explanation:

1. The Question class stores:
   - The question text
   - Four answer options (A, B, C, D)
   - The correct answer as a character (e.g., 'A', 'B', etc.)
   - A method isCorrect() to check if the user's answer matches the correct one.

2. The QuizApp class does the following:
   - Creates a list of Question objects with pre-defined questions and answers.
   - Uses a Scanner to take user input for each question.
   - Displays each question with its options and prompts the user to enter A, B, C, or D.
   - Checks if the answer is correct using the isCorrect() method.
   - Tracks the score based on correct answers.
   - At the end, displays the total score out of the number of questions.

Key Concepts Used:
- Object-Oriented Programming (OOP) via the Question class.
- Lists to manage a collection of questions.
- Scanner for console input.
- Loops and conditionals to drive the quiz logic.

This program provides a basic but complete quiz experience in the console.
