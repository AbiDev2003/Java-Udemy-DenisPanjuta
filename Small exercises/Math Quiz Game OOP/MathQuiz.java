import java.util.Scanner;

// This class is used to run a 5 question series with random questions coming from Question class and track a score. 
public class MathQuiz {
    private int score;

    public MathQuiz() {
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            askQuestion(scanner);
        }
        System.out.println("Your final score is: " + score + "/5");
        scanner.close();
    }

    private void askQuestion(Scanner scanner) {
        Question question = new Question();
        question.generateQuestions();
        System.out.println("your answer: ");
        double userAnswer = scanner.nextDouble();
        if (question.checkAnswer(userAnswer)) {
            score++;
        } else {
            System.out.println("incorrect !");
        }

    }
}