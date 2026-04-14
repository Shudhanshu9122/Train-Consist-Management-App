package com.trainconsist;

import java.util.Arrays;

/**
 * UC19: Find Bogie ID using Binary Search
 * 
 * Goal: Find a bogie ID efficiently using binary search on sorted data.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC19: Binary Search (O(log n))");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create and sort bogie IDs (Precondition for Binary Search)
        String[] bogieIds = {"BG-101", "BG-203", "BG-505", "BG-102", "BG-808", "BG-304"};
        Arrays.sort(bogieIds);
        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // 2. User provides search key
        String searchKey = "BG-505";
        System.out.println("\nSearching for: " + searchKey);

        // 3 & 4. Initialize low, high, and find mid
        int low = 0;
        int high = bogieIds.length - 1;
        int position = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // 5. Compare key with middle value using compareTo()
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                position = mid;
                break; // Found
            } else if (comparison < 0) {
                high = mid - 1; // 6. Search range is halved
            } else {
                low = mid + 1; // 6. Search range is halved
            }
        }

        // 7. Result is displayed
        if (position != -1) {
            System.out.println("\n[FOUND] " + searchKey + " exists at index " + position + " in the sorted array.");
        } else {
            System.out.println("\n[NOT FOUND] " + searchKey + " is not in the list.");
        }

        System.out.println("\nBinary Search uses a Divide-and-Conquer strategy for high efficiency.");
        System.out.println("==============================================");
    }
}
