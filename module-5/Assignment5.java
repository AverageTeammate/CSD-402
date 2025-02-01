/*
 * Jacob Cannamela
 * CSD402 - Assignment 5
 * Date: 2025-02-01
 * 
 * This program contains methods to locate the largest and smallest elements in 
 * both double and int two-dimensional arrays. The methods return the indices 
 * of the elements in a one-dimensional array.
 */

 public class Assignment5 {

    // Method to find the position of the largest element in a double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] position = new int[2]; // To store row and column indices
        double largest = Double.NEGATIVE_INFINITY; // Initialize to the smallest possible value

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    // Method to find the position of the largest element in an int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] position = new int[2]; // To store row and column indices
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    // Method to find the position of the smallest element in a double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] position = new int[2]; // To store row and column indices
        double smallest = Double.POSITIVE_INFINITY; // Initialize to the largest possible value

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    // Method to find the position of the smallest element in an int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] position = new int[2]; // To store row and column indices
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible integer

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        double[][] doubleArray = {
            {5.2, 1.8, 3.6},
            {4.1, 9.9, 2.4},
            {0.5, 7.7, 8.8}
        };

        int[][] intArray = {
            {12, 15, 7},
            {8, 19, 3},
            {14, 2, 11}
        };

        // Test for locating largest element in double array
        int[] largestDouble = locateLargest(doubleArray);
        System.out.println("Largest double element at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");

        // Test for locating largest element in int array
        int[] largestInt = locateLargest(intArray);
        System.out.println("Largest int element at: [" + largestInt[0] + ", " + largestInt[1] + "]");

        // Test for locating smallest element in double array
        int[] smallestDouble = locateSmallest(doubleArray);
        System.out.println("Smallest double element at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");

        // Test for locating smallest element in int array
        int[] smallestInt = locateSmallest(intArray);
        System.out.println("Smallest int element at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}
