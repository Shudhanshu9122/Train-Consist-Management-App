package com.trainconsist;

import java.util.Arrays;

/**
 * UC16: Sort Passenger Bogie Capacities (Bubble Sort)
 * 
 * Goal: Sort passenger bogie capacities using a basic algorithm (Bubble Sort) instead of library methods.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC16: Manual Sorting (Bubble Sort)");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create an array of passenger bogie capacities
        int[] capacities = {72, 24, 56, 90, 18, 44};
        
        System.out.println("Original Capacities: " + Arrays.toString(capacities));

        // 2 & 3 & 4. Bubble Sort logic
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // 5. Swap values when left element is greater than right element
                if (capacities[j] > capacities[j+1]) {
                    // Swapping using a temporary variable
                    int temp = capacities[j];
                    capacities[j] = capacities[j+1];
                    capacities[j+1] = temp;
                }
            }
        }

        // 6. Display the sorted result
        System.out.println("\nSorted Capacities (Ascending):");
        System.out.println(Arrays.toString(capacities));
        
        System.out.println("\nBubble Sort completed manually without library help.");
        System.out.println("==============================================");
    }
}
