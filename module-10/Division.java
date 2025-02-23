/** File: Division.java
This is the abstract superclass for different divisions in our company.
It contains two fields: the division name and the account number.
We also define an abstract method called display() which every subclass must implement.
Jacob Cannamela
CSD402 - Assignment 10
Date: 2025-02-22
**/
public abstract class Division {
    // Field for the division name
    protected String divisionName;
    // Field for the account number
    protected int accountNumber;

    // Constructor that initializes the division name and account number.
    // The "super" keyword is not needed here because this is the base class.
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName; // Set the division name based on the argument provided.
        this.accountNumber = accountNumber; // Set the account number based on the argument provided.
    }

    // Abstract method to display division details.
    // This method does not have a body because it will be implemented in the subclasses.
    public abstract void display();
}
