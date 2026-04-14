package com.trainconsist;

import java.util.ArrayList;
import java.util.List;

/**
 * UC20: Prevent Search on Empty Train
 * 
 * Goal: Prevent search operations on an empty train by throwing an exception early.
 */
public class TrainConsistApp {

    /**
     * Searches for a bogie in the list. Throws IllegalStateException if the list is empty.
     */
    public static boolean searchBogie(List<String> bogies, String searchKey) {
        // 1 & 2. Check whether the bogie collection is empty before searching.
        if (bogies.isEmpty()) {
            // 3 & 4. Throw IllegalStateException if no bogies exist with a meaningful message.
            throw new IllegalStateException("FAIL-FAST: Cannot perform search operation on an empty train consist.");
        }

        // 5. Proceed with search if not empty.
        return bogies.contains(searchKey);
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC20: Defensive Programming (Empty State)");
        System.out.println("==============================================");
        System.out.println();

        // Testing with an empty train
        List<String> emptyTrain = new ArrayList<>();
        System.out.println("Attempting to search on an EMPTY train...");
        
        try {
            searchBogie(emptyTrain, "BG-101");
        } catch (IllegalStateException e) {
            System.out.println("[CAUGHT] " + e.getMessage());
        }

        System.out.println("\nTesting with a populated train:");
        List<String> activeTrain = new ArrayList<>();
        activeTrain.add("BG-101");
        activeTrain.add("BG-102");
        
        try {
            boolean found = searchBogie(activeTrain, "BG-101");
            System.out.println("Search Result for 'BG-101': " + (found ? "FOUND" : "NOT FOUND"));
        } catch (IllegalStateException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        System.out.println("\nDefensive programming ensures the system state is valid before execution.");
        System.out.println("==============================================");
    }
}
