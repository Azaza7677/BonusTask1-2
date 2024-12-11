import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 1;
        int maxScore = 15;
        int minScore = 0;

        System.out.println("***           Welcome to the Math Game!            ***");
        System.out.println("***  If you answer incorrectly, you lose 1 point.  ***");
        System.out.println("***        You lose if your score reaches 0.       ***");
        System.out.println("***   You win if you reach 15 points. Good luck!   ***");

        while (true) {
            int num1, num2;
            char operator = getRanOperator(random);

            if (operator == '/') {
                num2 = random.nextInt(9) + 1;
                int result = random.nextInt(10) + 1;
                num1 = num2 * result;
            } else {
                num1 = random.nextInt(10) + 1;
                num2 = random.nextInt(10) + 1;
            }

            int correctAnswer = calculateAnswer(num1, num2, operator);

            System.out.printf("What is %d %c %d?%n", num1, operator, num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + correctAnswer);
                score--;
            }

            System.out.println("Your score: " + score);

            if (score == minScore) {
                System.out.println("You lost! Your score reached 0.");
                break;
            } else if (score == maxScore) {
                System.out.println("Congratulations! You reached 15 points and won!");
                break;
            }
        }

        scanner.close();
    }

    private static char getRanOperator(Random random) {
        char[] operators = {'+', '-', '*', '/'};
        return operators[random.nextInt(operators.length)];
    }

    private static int calculateAnswer(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}