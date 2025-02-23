/** File: DomesticDivision.java
This class extends the Division class for divisions that operate domestically.
It adds a field for the state where the division is located.
The display() method is overridden to print out the domestic division's details.
Jacob Cannamela
CSD402 - Assignment 10
Date: 2025-02-22
**/
public class DomesticDivision extends Division {
    // Field for the state where this domestic division is located.
    private String state;

    // Constructor that requires the division name, account number, and state.
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // Call the superclass constructor to set divisionName and accountNumber.
        this.state = state; // Set the state based on the argument provided.
    }

    // Overridden display method to print out details of the Domestic Division.
    @Override
    public void display() {
        // Print out all the information about the domestic division.
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println(); // Extra line for spacing between outputs.
    }
}
