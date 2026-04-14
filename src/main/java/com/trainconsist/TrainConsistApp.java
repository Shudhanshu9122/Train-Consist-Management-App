package com.trainconsist;

/**
 * UC15: Handle Unsafe Cargo Assignment (try-catch-finally)
 *
 * Key Concepts:
 * - try-catch-finally structured exception handling.
 * - Custom Runtime Exception (CargoSafetyException).
 * - Graceful failure without crashing the app.
 * - finally block for mandatory cleanup/logging.
 */
public class TrainConsistApp {

    /**
     * Assigns cargo to a goods bogie. Throws CargoSafetyException if unsafe.
     */
    static void assignCargo(GoodsBogie bogie, String cargo) {
        if (bogie.shape.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException(
                "UNSAFE! Petroleum cannot be assigned to a Rectangular bogie. Bogie: " + bogie
            );
        }
        bogie.cargo = cargo;
        System.out.println("[ASSIGNED] Cargo '" + cargo + "' assigned to: " + bogie);
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC15: Unsafe Cargo Exception Handling");
        System.out.println("==============================================");
        System.out.println();

        // Case 1: Safe assignment
        System.out.println("Case 1: Assigning Coal to Rectangular bogie");
        try {
            GoodsBogie bogie1 = new GoodsBogie("Rectangular", "");
            assignCargo(bogie1, "Coal");
        } catch (CargoSafetyException e) {
            System.out.println("[CAUGHT] " + e.getMessage());
        } finally {
            System.out.println("[FINALLY] Cargo assignment attempt #1 completed.\n");
        }

        // Case 2: Unsafe assignment - Petroleum to Rectangular
        System.out.println("Case 2: Assigning Petroleum to Rectangular bogie (UNSAFE)");
        try {
            GoodsBogie bogie2 = new GoodsBogie("Rectangular", "");
            assignCargo(bogie2, "Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("[CAUGHT] " + e.getMessage());
        } finally {
            System.out.println("[FINALLY] Cargo assignment attempt #2 completed.\n");
        }

        // Case 3: Safe assignment - Petroleum to Cylindrical
        System.out.println("Case 3: Assigning Petroleum to Cylindrical bogie (SAFE)");
        try {
            GoodsBogie bogie3 = new GoodsBogie("Cylindrical", "");
            assignCargo(bogie3, "Petroleum");
        } catch (CargoSafetyException e) {
            System.out.println("[CAUGHT] " + e.getMessage());
        } finally {
            System.out.println("[FINALLY] Cargo assignment attempt #3 completed.\n");
        }

        System.out.println("Application running safely after all exceptions.");
        System.out.println("==============================================");
    }
}
