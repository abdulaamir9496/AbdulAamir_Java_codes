package Project_Games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a random object for computer choice
        Random random = new Random();

        // Create an array of strings for the possible choices
        String[] choices = {"rock", "paper", "scissors"};

        // Create variables to store the scores of the user and the computer
        int userScore = 0;
        int computerScore = 0;

        // Create a boolean variable to control the game loop
        boolean playing = true;

        // Print a welcome message
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice or type 'quit' to end the game.");

        // Start the game loop
        while (playing) {
            // Prompt the user for their choice
            System.out.print("Your choice: ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Check if the user wants to quit the game
            if (userChoice.equals("quit")) {
                playing = false;
                break;
            }

            // Check if the user entered a valid choice
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Generate a random choice for the computer
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            // Print the computer's choice
            System.out.println("Computer's choice: " + computerChoice);

            // Compare the choices and determine the winner
            if (userChoice.equals(computerChoice)) {
                // It's a tie
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("paper") && computerChoice.equals("rock") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper")) {
                // The user wins
                System.out.println("You win!");
                userScore++;
            } else {
                // The computer wins
                System.out.println("You lose!");
                computerScore++;
            }

            // Print the current scores
            System.out.println("Your score: " + userScore);
            System.out.println("Computer's score: " + computerScore);
        }

        // Print a farewell message and the final scores
        System.out.println("Thanks for playing Rock-Paper-Scissors!");
        System.out.println("Your final score: " + userScore);
        System.out.println("Computer's final score: " + computerScore);

        // Close the scanner object
        scanner.close();
    }
}
