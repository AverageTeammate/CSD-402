/**
 * AutoService.java
 * This file demonstrates the use of method overloading in Java.
 * It defines an AutoService class with methods to calculate yearly service charges
 * based on different combinations of services and coupon discounts.
 * Jacob Cannamela
 * CSD402 - Module 12
 * Date: 2025-03-16
 */

public class AutoService {
    
    // Constants for service charges
    private static final double STANDARD_SERVICE_CHARGE = 650.0;
    private static final double OIL_CHANGE_FEE = 44.0;
    private static final double TIRE_ROTATION_FEE = 66.0;
    
    // Method 1: No parameters
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }
    
    // Method 2: One parameter (oil change fee)
    public static double yearlyService(boolean oilChange) {
        return oilChange ? STANDARD_SERVICE_CHARGE + OIL_CHANGE_FEE : STANDARD_SERVICE_CHARGE;
    }
    
    // Method 3: Two parameters (oil change fee and tire rotation fee)
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) total += OIL_CHANGE_FEE;
        if (tireRotation) total += TIRE_ROTATION_FEE;
        return total;
    }
    
    // Method 4: Three parameters (oil change, tire rotation, and coupon discount)
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) total += OIL_CHANGE_FEE;
        if (tireRotation) total += TIRE_ROTATION_FEE;
        total -= coupon; // Apply coupon discount
        return total < 0 ? 0 : total; // Ensure total is not negative
    }
    
    public static void main(String[] args) {
        // Testing each method twice
        System.out.println("Yearly Service (No additional services): $" + yearlyService());
        System.out.println("Yearly Service (No additional services): $" + yearlyService());

        System.out.println("Yearly Service (With Oil Change): $" + yearlyService(true));
        System.out.println("Yearly Service (With Oil Change): $" + yearlyService(false));
        
        System.out.println("Yearly Service (With Oil Change & Tire Rotation): $" + yearlyService(true, true));
        System.out.println("Yearly Service (With Oil Change & Tire Rotation): $" + yearlyService(true, false));
        
        System.out.println("Yearly Service (With All Services & $30 Coupon): $" + yearlyService(true, true, 30.0));
        System.out.println("Yearly Service (With All Services & $400 Coupon - The best deal!): $" + yearlyService(true, true, 400.0));
    }
}
