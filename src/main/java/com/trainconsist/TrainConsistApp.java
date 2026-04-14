package com.trainconsist;

/**
 * UC14: Prevent Invalid Passenger Bogies
 *
 * Key Concepts:
 * - Custom Checked Exception for domain rules.
 * - throw keyword.
 * - fail-fast validation.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC14: Custom Exception (InvalidCapacityException)");
        System.out.println("==============================================");
        System.out.println();

        System.out.println("Attempting to create valid bogie:");
        try {
            Bogie validBogie = new Bogie("Sleeper", 72);
            System.out.println("[SUCCESS] Created: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        System.out.println("\nAttempting to create invalid bogie:");
        try {
            Bogie invalidBogie = new Bogie("Broken", -10);
            System.out.println("[SUCCESS] Created: " + invalidBogie); // This should not print
        } catch (InvalidCapacityException e) {
            System.out.println("[CAUGHT EXCEPTION] Registration failed!");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("\nProgram execution resumed safely.");
        System.out.println("==============================================");
    }
}
