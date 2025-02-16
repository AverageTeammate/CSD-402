/**
 * This program creates a file named "data.file" if it does not already exist.
 * It writes 10 random numbers to the file, appending to previous content if the file already exists.
 * After writing, the program reads the file and displays its contents.
 * Jacob Cannamela
 * CSD402 - Assignment 9.1
 * Date: 2025-02-15
 */

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;


public class Program2 {
    
    public static void main(String[] args) {
        File file = new File("data.file"); // Create a File object
        Random random = new Random(); // Random object to generate random numbers
        
        try {
            // Create a FileWriter in append mode so previous data is not overwritten
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            
            // Write 10 random numbers separated by spaces
            for (int i = 0; i < 10; i++) {
                bufferWriter.write(random.nextInt(100) + " ");
            }
            bufferWriter.newLine(); // Move to the next line after writing numbers
            bufferWriter.close(); // Close the BufferedWriter
            
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Reading and displaying the file content
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // Close the BufferedReader
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
