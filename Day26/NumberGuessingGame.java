package Day26;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100)+1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while(true){
            System.out.println("Enter your guess: ");
            guess = scan.nextInt();

            if(guess < secretNumber)
                System.out.println("Too low! Try again.");
            else if(guess > secretNumber)
                System.out.println("Too high! Try again.");
            else{
                System.out.println("Congratulations! You guesses the correct number.");
                break;
            }
        }
        scan.close();
    }
}