import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int NumberToGuess = random.nextInt(100) + 1;
        int NumberOfTries = 0;
        boolean GuessedCorrectly = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!GuessedCorrectly) {
            int userGuess = scanner.nextInt();
            NumberOfTries++;
            if (userGuess < NumberToGuess) {
                System.out.println("Too low");
            } else if (userGuess > NumberToGuess) {
                System.out.println("Too high");
            } else {
                GuessedCorrectly = true;
                System.out.println("Correct ! You have guessed the number in " + NumberOfTries + " tries");
            }
        }
        scanner.close();
    }
}
