/**
 * Name: Jacob Cannamela
 * Assignment: Module 3 Assignment
 * Date: 1/16/2025
 */

 public class mod3jcannamela {
    public static void main(String[] args) {
        int levels = 7; // Total number of rows

        for (int i = 1; i <= levels; i++) {
            // Print spaces before the numbers
            for (int j = levels; j > i; j--) {
                System.out.print("  "); // Add spaces for alignment
            }

            // Print numbers increasing
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + "   "); // Add extra spaces for alignment
                value = value * 2;
            }

            // Print numbers decreasing
            value = value / 2; // set value back to the last correct value
            for (int j = i - 1; j >= 1; j--) {
                value = value / 2;
                System.out.print(value + "   "); // extra spaces for alignment
            }

            // Print the @ symbol
            System.out.println("@"); // Move to the next line
        }
    }
}
