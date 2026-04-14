package com.trainconsist;

import java.util.Arrays;

/**
 * UC17: Sort Bogie Type Names Alphabetically (Arrays.sort())
 * 
 * Goal: Sort bogie type names alphabetically using Java’s built-in Arrays.sort() method.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC17: Built-in Sorting (Arrays.sort)");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create an array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Pantry Car", "Guard Coach", "General"};
        
        System.out.println("Original Bogie Types: " + Arrays.toString(bogieTypes));

        // 2 & 3. Use Arrays.sort() for alphabetical ordering
        System.out.println("\nSorting bogie names alphabetically using Arrays.sort()...");
        Arrays.sort(bogieTypes);

        // 4 & 5. Display the sorted result
        System.out.println("\nSorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));
        
        System.out.println("\nArrays.sort() uses an optimized Dual-Pivot Quicksort / TimSort for efficiency.");
        System.out.println("==============================================");
    }
}
