import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int tryCount = 0;

        while (true) {
            System.out.print("Enter your guess (1 - 100) , 0 to exit : ");
            int playerGuess = scan.nextInt();
            tryCount++;

            if (playerGuess == 0) break;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("It took you " + tryCount + " tries.");
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher , guess again.");
            } else {
                System.out.println("Nope! The number is lower , guess again.");
            }
        }

        scan.close();
    }
}
