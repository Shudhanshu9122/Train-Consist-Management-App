package com.trainconsist;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * 
 * Goal: Maintain insertion order while enforcing uniqueness.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create a LinkedHashSet for the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies: Engine, Sleeper, Cargo, Guard
        System.out.println("Attaching bogies: Engine, Sleeper, Cargo, Guard");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to attach a duplicate bogie intentionally (Sleeper)
        System.out.println("Attempting to attach duplicate bogie: Sleeper");
        boolean isAdded = trainFormation.add("Sleeper");
        System.out.println("Was 'Sleeper' added again? " + isAdded);

        // 4. Display the final formation order
        System.out.println("\nFinal Train Formation (Order Preserved & Unique):");
        System.out.println(trainFormation);

        System.out.println("\nLinkedHashSet allows us to keep the physical order of attachment while ensuring no duplicates.");
    }
}
