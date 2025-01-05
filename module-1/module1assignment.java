import java.util.Scanner;

public class module1assignment {
    public static void main(String[] args) {
        // Scanner class to gather user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the initial ammount of water
        System.out.print("Enter the amount of water in kilograms: ");
        double massofwater = scanner.nextDouble();

        // Prompt user for the initial temperature in Celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialtemp = scanner.nextDouble();

        // Prompt user for the final temperature in Celsius
        System.out.print("Enter the final temperature in Celsius: ");
        double finaltemp = scanner.nextDouble();

        // Use formula from module 1 assignment
        double neededengery = massofwater * (finaltemp - initialtemp) * 4184;

        // Print the results
        System.out.println("The energy needed to heat the water is: " + neededengery + " Joules");

        // Close the scanner
        scanner.close();
    }
}
