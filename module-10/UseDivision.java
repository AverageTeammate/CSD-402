/** File: UseDivision.java
This is the main application class that tests our division classes.
It creates two instances of InternationalDivision and two instances of DomesticDivision.
Then it calls the display() method on each object to show their details.
Jacob Cannamela
CSD402 - Assignment 10
Date: 2025-02-22
**/
public class UseDivision {
    public static void main(String[] args) {
        // Creating two instances of InternationalDivision with sample data.
        InternationalDivision intDiv1 = new InternationalDivision("International Sales", 2342, "Canada", "English");
        InternationalDivision intDiv2 = new InternationalDivision("International Marketing", 6678, "France", "French");

        // Creating two instances of DomesticDivision with sample data.
        DomesticDivision domDiv1 = new DomesticDivision("Domestic Sales", 4, "Texas");
        DomesticDivision domDiv2 = new DomesticDivision("Domestic Marketing", 5, "North Carolina");

        // Calling the display method on each object to print the division details.
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
