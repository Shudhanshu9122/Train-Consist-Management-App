package com.trainconsist;

import java.util.Arrays;

/**
 * UC18: Search Bogie ID using Linear Search
 * 
 * Goal: Search and identify a specific bogie ID from an unsorted list using Linear Search.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC18: Linear Search (O(n))");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create an array of bogie IDs
        String[] bogieIds = {"BG-101", "BG-203", "BG-505", "BG-102", "BG-808", "BG-304"};
        System.out.println("Bogie IDs: " + Arrays.toString(bogieIds));

        // 2. Search key
        String searchKey = "BG-102";
        System.out.println("\nSearching for: " + searchKey);

        // 3 & 4. Sequence traversal and comparison
        boolean found = false;
        int position = -1;
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                position = i;
                break; // 5. Stop when match found
            }
        }

        // 6. Display result
        if (found) {
            System.out.println("\n[FOUND] " + searchKey + " exists at index " + position);
        } else {
            System.out.println("\n[NOT FOUND] " + searchKey + " is not in the list.");
        }

        System.out.println("\nLinear Search visits each element sequentially to find a match.");
        System.out.println("==============================================");
    }
}
