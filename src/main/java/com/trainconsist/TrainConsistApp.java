package com.trainconsist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC8: Filter Passenger Bogies Using Streams
 * 
 * Goal: Filter passenger bogies using Stream pipelines based on seating capacity.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create a List<Bogie> to store passenger bogies (Reused from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Passenger Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nFiltering bogies with capacity > 60 using Stream API...");

        // 2 & 3 & 4. Create a stream, apply filter, and collect the result
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList()); // or .toList() in modern Java

        // 5. Display the filtered bogies
        System.out.println("\nFiltered High-Capacity Bogies:");
        highCapacityBogies.forEach(System.out::println);
        
        System.out.println("==============================================");
    }
}
