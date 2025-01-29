package projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: Rock, Paper, or Scissors");
        System.out.println("To exit the game, type 'exit'.");

        while (true) {
            System.out.print("\nYour choice: ");
            String playerChoice = scanner.nextLine().toLowerCase();

            // Exit condition
            if (playerChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate player input
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            // Generate computer's choice
            int computerChoiceNum = random.nextInt(3); // 0, 1, or 2
            String computerChoice = switch (computerChoiceNum) {
                case 0 -> "rock";
                case 1 -> "paper";
                case 2 -> "scissors";
                default -> ""; // This won't happen
            };

            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}

