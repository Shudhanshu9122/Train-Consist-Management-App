package com.trainconsist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 * 
 * Goal: Group bogies into categories using Stream collectors.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Original List of Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nGrouping bogies by type...");

        // 2 & 3 & 4. Convert list to stream and apply groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 5. Display the grouped bogie structure
        System.out.println("\nGrouped Bogies Structure:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  -> " + b);
            }
        }
        
        System.out.println("==============================================");
    }
}
