/** File: InternationalDivision.java
This class extends the Division class for divisions that operate internationally.
It adds extra fields for the country and the language spoken.
The display() method is overridden to show all the details of an international division.
Jacob Cannamela
CSD402 - Assignment 10
Date: 2025-02-22
**/
public class InternationalDivision extends Division {
    // Field for the country where this division is located.
    private String country;
    // Field for the language spoken in this division.
    private String language;

    // Constructor that requires all fields: division name, account number, country, and language.
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Call the superclass constructor to set divisionName and accountNumber.
        this.country = country; // Set the country based on the argument provided.
        this.language = language; // Set the language based on the argument provided.
    }

    // Overridden display method to print out details of the International Division.
    @Override
    public void display() {
        // Print out all the information about the international division.
        System.out.println("International Division:");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println(); // Extra line for spacing between outputs.
    }
}
