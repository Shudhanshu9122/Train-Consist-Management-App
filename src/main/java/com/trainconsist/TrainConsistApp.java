package com.trainconsist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC11: Validate Train ID and Cargo Code formats using Regular Expressions.
 *
 * Key Concepts:
 * - Regular Expressions (Regex): Pattern language for text format validation.
 * - Pattern Class: Represents a compiled regex for reuse.
 * - Matcher Class: Applies a Pattern to an input string.
 * - matches() Method: Verifies entire input string against the pattern.
 * - Format Enforcement: Ensures data follows strict business rules.
 * - Data Integrity Validation: Prevents malformed data from entering the system.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC11: Regex-Based Format Validation");
        System.out.println("==============================================");
        System.out.println();

        // --- Train ID Validation ---
        // Valid format: TRN-XXXX (where X is a digit)
        String trainIdPattern = "TRN-\\d{4}";
        Pattern compiledTrainPattern = Pattern.compile(trainIdPattern);

        String[] trainIdInputs = {"TRN-1234", "TRN-99", "TRN-ABCD", "TRN-5678", "XYZ-1234"};

        System.out.println("Train ID Validation (Pattern: TRN-XXXX):");
        System.out.println("----------------------------------------------");
        for (String input : trainIdInputs) {
            Matcher matcher = compiledTrainPattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("[VALID]   Train ID: " + input);
            } else {
                System.out.println("[INVALID] Train ID: " + input + " -> Does not match format TRN-XXXX");
            }
        }

        System.out.println();

        // --- Cargo Code Validation ---
        // Valid format: PET-XX (where X is an uppercase letter)
        String cargoCodePattern = "PET-[A-Z]{2}";
        Pattern compiledCargoPattern = Pattern.compile(cargoCodePattern);

        String[] cargoCodeInputs = {"PET-AB", "PET-xy", "PET-123", "PET-ZZ", "OIL-AB"};

        System.out.println("Cargo Code Validation (Pattern: PET-XX):");
        System.out.println("----------------------------------------------");
        for (String input : cargoCodeInputs) {
            Matcher matcher = compiledCargoPattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("[VALID]   Cargo Code: " + input);
            } else {
                System.out.println("[INVALID] Cargo Code: " + input + " -> Does not match format PET-XX");
            }
        }

        System.out.println("==============================================");
    }
}
