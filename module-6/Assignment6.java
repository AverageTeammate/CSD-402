/*
 * Jacob Cannamela
 * CSD402 - Assignment 6
 * Date: 2025-02-01
 * 
 * This program defines a Fan class with attributes and methods to simulate
 * the behavior of a fan. It includes test code to demonstrate the class functionality.
 */

 public class Assignment6 {

    // Main method to test Fan class functionality
    public static void main(String[] args) {
        // Fan object with default values
        Fan defaultFan = new Fan();
        System.out.println(defaultFan);

        // Fan object with custom values
        Fan customFan = new Fan(Fan.FAST, true, 14.5, "black");
        System.out.println(customFan);

        // Demonstrate changing default fan properties
        defaultFan.setSpeed(Fan.SLOW);
        defaultFan.setIsOn(true);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("green");

        System.out.println("Updated Default Fan: " + defaultFan);

        // Display individual properties of custom fan
        System.out.println("Custom Fan Speed: " + customFan.getSpeed());
        System.out.println("Custom Fan On: " + customFan.getIsOn());
        System.out.println("Custom Fan Radius: " + customFan.getRadius());
        System.out.println("Custom Fan Color: " + customFan.getColor());
    }
}

class Fan {
    // Constants representing fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields for fan properties
    private int speed = STOPPED;
    private boolean isOn = false;
    private double radius = 6.0;
    private String color = "white";

    // No-argument constructor initializing default values
    public Fan() {}

    // Constructor to initialize fan with specific values
    public Fan(int speed, boolean isOn, double radius, String color) {
        setSpeed(speed);
        this.isOn = isOn;
        setRadius(radius);
        this.color = color;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed. Setting to STOPPED.");
            this.speed = STOPPED;
        }
    }

    // Getter and Setter for isOn
    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. Setting to default 6.0.");
            this.radius = 6.0;
        }
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to provide fan state as a string
    @Override
    public String toString() {
        return "Fan Details: " +
               "[Speed: " + speedDescription(speed) + ", " +
               "On: " + isOn + ", " +
               "Radius: " + radius + ", " +
               "Color: '" + color + "']";
    }

    // Helper method to convert speed to readable text
    private String speedDescription(int speed) {
        switch (speed) {
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            default: return "STOPPED";
        }
    }
}