/*
 * Jacob Cannamela
 * CSD402 - Assignment 7
 * Date: 2025-02-08
 */

import java.util.ArrayList;

public class UseFans {

    public static void main(String[] args) {
        // Create a list of Fan objects
        ArrayList<Fan> fans = new ArrayList<>();

        // Add some Fan objects to the list with different settings
        fans.add(new Fan(Fan.FAST, true, 10.0, "red"));
        fans.add(new Fan(Fan.SLOW, false, 8.0, "blue"));
        fans.add(new Fan(Fan.MEDIUM, true, 6.0, "green"));

        // Show details for all the fans in the list
        displayFans(fans);

        // Create and display a single fan with different settings
        Fan singleFan = new Fan(Fan.FAST, true, 12.0, "yellow");
        displayFan(singleFan);
    }

    // Method to display all the fans in the list
    public static void displayFans(ArrayList<Fan> fans) {
        // Go through the list and show info for each fan
        for (int i = 0; i < fans.size(); i++) {
            Fan fan = fans.get(i);  // Get each fan from the list
            // Print out the fan details without using the toString method
            System.out.println("Fan " + (i + 1) + ": Speed: " + fan.getSpeedDescription() +
                               ", On: " + fan.getIsOn() +
                               ", Radius: " + fan.getRadius() +
                               ", Color: " + fan.getColor());
        }
    }

    // Method to display details for a single fan
    public static void displayFan(Fan fan) {
        // Show the details of the single fan
        System.out.println("Single Fan: Speed: " + fan.getSpeedDescription() +
                           ", On: " + fan.getIsOn() +
                           ", Radius: " + fan.getRadius() +
                           ", Color: " + fan.getColor());
    }
}

class Fan {
    // Constants for the fan's speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables for the fan's properties
    private int speed = STOPPED;
    private boolean isOn = false;
    private double radius = 6.0;
    private String color = "white";

    // Constructor with no parameters, sets the fan to default values
    public Fan() {}

    // Constructor to set the fan's settings when creating it
    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed, returns the fan's speed
    public int getSpeed() {
        return this.speed;
    }

    // Getter for isOn, returns whether the fan is on or off
    public boolean getIsOn() {
        return this.isOn;
    }

    // Getter for radius, returns the fan's radius
    public double getRadius() {
        return this.radius;
    }

    // Getter for color, returns the fan's color
    public String getColor() {
        return this.color;
    }

    // Method to describe the fan's speed in words
    public String getSpeedDescription() {
        if (this.speed == FAST) {
            return "FAST";
        } else if (this.speed == MEDIUM) {
            return "MEDIUM";
        } else if (this.speed == SLOW) {
            return "SLOW";
        } else {
            return "STOPPED";
        }
    }
}
