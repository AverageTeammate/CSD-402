/**
 * JacobArrayListTest
 * 
 * This program accepts integer inputs from the user and stores them in an ArrayList.
 * The user enters numbers until they input a 0, which is also added to the list.
 * The list is then passed to a method that finds and returns the largest number in the list.
 * If the list is empty, the method returns 0.
 * 
 * Jacob Cannamela
 * CSD402 - Assignment 8
 * Date: 2025-02-15
 */

import java.util.ArrayList;
import java.util.Scanner;

public class JacobArrayListTest {
    
    /**
     * This method finds the maximum value in an ArrayList of Integers.
     * 
     * @param list An ArrayList of Integer values.
     * @return The largest integer in the list. If the list is empty, returns 0.
     */
    public static Integer max(ArrayList<Integer> list) {
        // Check if the list is empty; if so, return 0
        if (list.isEmpty()) {
            return 0;
        }
        
        // Assume the first number is the largest
        int maxVal = list.get(0);
        
        // Loop through the list to find the maximum value
        for (int num : list) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal; // Return the largest number found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Prompt the user for input
        System.out.println("Enter integers (0 to stop and include in list):");
        while (true) {
            int num = scanner.nextInt(); // Read an integer from the user
            numbers.add(num); // Add the number to the ArrayList
            if (num == 0) {
                break; // Stop taking input if the user enters 0
            }
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
        
        // Call the max method to find the largest number in the list
        int largest = max(numbers);
        
        // Display the largest number to the user
        System.out.println("The largest number in the list is: " + largest);
    }
}
