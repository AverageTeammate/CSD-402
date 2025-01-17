/**
 * Name: Jacob Cannamela
 * Assignment: Module 2 Assignment
 * Date: 1/16/2025
 */

import java.util.Scanner;
import java.util.Random;

public class mod2jcannamela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate computer choice
        int computerChoice = rand.nextInt(3) + 1; // 1 = Rock, 2 = Paper, 3 = Scissors

        // Ask the user for their choice
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Type 1 for Rock, 2 for Paper, or 3 for Scissors:");
        int userChoice = input.nextInt();

        // Check if the user entered a valid number
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please restart the game and try again.");
        } else {
            // Print the choices
            String computerChoiceStr = "";
            if (computerChoice == 1) {
                computerChoiceStr = "Rock";
            } else if (computerChoice == 2) {
                computerChoiceStr = "Paper";
            } else {
                computerChoiceStr = "Scissors";
            }

            String userChoiceStr = "";
            if (userChoice == 1) {
                userChoiceStr = "Rock";
            } else if (userChoice == 2) {
                userChoiceStr = "Paper";
            } else {
                userChoiceStr = "Scissors";
            }

            System.out.println("Computer chose: " + computerChoiceStr);
            System.out.println("You chose: " + userChoiceStr);

            // Determine the winner
            if (computerChoice == userChoice) {
                System.out.println("It's a tie!");
            } else if (userChoice == 1 && computerChoice == 3 ||
                       userChoice == 2 && computerChoice == 1 ||
                       userChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        input.close();
    }
}
