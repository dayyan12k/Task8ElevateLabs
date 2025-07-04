import java.util.*;

class Question {
    String questionText;
    String optionA, optionB, optionC, optionD;
    char correctOption;

    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, char correctOption) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctOption;
    }
}

public class Task8Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create list of questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", "A. Berlin", "B. London", "C. Paris", "D. Rome", 'C'));
        questions.add(new Question("Which language runs in a web browser?", "A. Java", "B. C", "C. Python", "D. JavaScript", 'D'));
        questions.add(new Question("What is 2 + 2?", "A. 3", "B. 4", "C. 5", "D. 22", 'B'));
        questions.add(new Question("Which company developed Java?", "A. Microsoft", "B. Sun Microsystems", "C. Apple", "D. Oracle", 'B'));
        questions.add(new Question("Which one is a loop in Java?", "A. if", "B. for", "C. class", "D. try", 'B'));

        int score = 0;

        // Step 2: Ask each question
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            if (q.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was: " + q.correctOption);
            }
        }

        // Step 3: Show result
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.size());

        scanner.close();
    }
}


