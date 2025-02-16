/**
 * This program demonstrates the use of an ArrayList to store and retrieve user-selected elements.
 * It prompts the user to enter an index, then retrieves the corresponding element if it exists.
 * The program handles exceptions for out-of-bounds and invalid inputs gracefully.
 * Jacob Cannamela
 * CSD402 - Assignment 9.1
 * Date: 2025-02-15
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Program1 {
    
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();
        
        // Adding 10 sample car brands to the ArrayList
        carBrands.add("Toyota");
        carBrands.add("Honda");
        carBrands.add("Ford");
        carBrands.add("Chevrolet");
        carBrands.add("BMW");
        carBrands.add("Mercedes");
        carBrands.add("Tesla");
        carBrands.add("Audi");
        carBrands.add("Nissan");
        carBrands.add("Hyundai");
        
        // Display the list to the user
        System.out.println("List of Car Brands:");
        for (String brand : carBrands) {
            System.out.println(brand);
        }
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the car brand you want to see again (0-9): ");
        
        try {
            int index = Integer.valueOf(scanner.next()); // Convert user input to an integer
            System.out.println("You selected: " + carBrands.get(index)); // Retrieve and display selected car brand
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Index out of bounds. Please enter a valid index between 0 and 9.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number between 0 and 9.");
        }
        
        scanner.close(); // Close the scanner
    }
}