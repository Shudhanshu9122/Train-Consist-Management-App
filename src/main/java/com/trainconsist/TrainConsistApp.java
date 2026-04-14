package com.trainconsist;

import java.util.ArrayList;
import java.util.List;

/**
 * UC12: Safety Validation Using Streams allMatch()
 *
 * Key Concepts:
 * - Streams API for declarative collection processing.
 * - allMatch() terminal operation to check every element.
 * - Lambda Expressions for inline validation rules.
 * - Conditional Logic: Cylindrical bogies must carry only Petroleum.
 * - Short-Circuit Evaluation: stops as soon as a rule fails.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC12: Safety Validation (allMatch)");
        System.out.println("==============================================");
        System.out.println();

        // 1. Prepare a list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));

        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(System.out::println);
        System.out.println();

        // 2. Validate: Cylindrical bogies must carry only Petroleum
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.shape.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // Non-cylindrical bogies can carry anything
                });

        // 3. Display safety result
        System.out.println("Safety Compliance Check:");
        if (isSafe) {
            System.out.println("[PASS] All bogies are safety compliant. Train is marked SAFE.");
        } else {
            System.out.println("[FAIL] Safety violation detected! Train is NOT safe.");
        }

        System.out.println();

        // --- Demonstrate a failing case ---
        System.out.println("--- Adding an unsafe bogie ---");
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // UNSAFE!
        System.out.println("Added: " + goodsBogies.get(goodsBogies.size() - 1));

        boolean isSafeNow = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.shape.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        System.out.println("\nSafety Compliance Re-Check:");
        if (isSafeNow) {
            System.out.println("[PASS] All bogies are safety compliant.");
        } else {
            System.out.println("[FAIL] Safety violation detected! Cylindrical bogie carrying non-Petroleum cargo.");
        }

        System.out.println("==============================================");
    }
}
