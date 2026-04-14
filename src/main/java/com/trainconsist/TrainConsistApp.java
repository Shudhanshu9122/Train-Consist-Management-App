package com.trainconsist;

import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create a HashSet for bogie IDs.
        Set<String> bogieIds = new HashSet<>();

        // 2. Add duplicate values intentionally
        System.out.println("Adding Bogie: BG101");
        bogieIds.add("BG101");
        
        System.out.println("Adding Bogie: BG102");
        bogieIds.add("BG102");
        
        System.out.println("Adding Bogie: BG101 (Duplicate)");
        bogieIds.add("BG101"); // This will be ignored

        System.out.println("Adding Bogie: BG103");
        bogieIds.add("BG103");

        // 3. Print the final set. Observe duplicates removed.
        System.out.println("\nFinal Unique Bogie IDs in Train Consist:");
        System.out.println(bogieIds);
        
        System.out.println("\nNotice that BG101 appears only once. The size of the set is: " + bogieIds.size());
    }
}
