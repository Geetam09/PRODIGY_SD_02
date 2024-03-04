import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(10) + 1; // Generate a random number between 1 and 10
        int attempts = 0;
        
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 10. Can you guess it?");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the num ber correctly in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        scanner.close();
    }
}
