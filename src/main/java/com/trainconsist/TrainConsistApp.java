package com.trainconsist;

import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create a LinkedList for the consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        
        System.out.println("Initial Train Consist: " + trainConsist);

        // 3. Insert a Pantry Car at position 2
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("Train Consist after insertion: " + trainConsist);

        // 4. Remove the first and last bogie
        System.out.println("\nRemoving the first & last bogie (Engine & Guard)...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist: " + trainConsist);
    }
}
