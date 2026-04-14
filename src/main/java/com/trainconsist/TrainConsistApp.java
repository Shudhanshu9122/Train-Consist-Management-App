package com.trainconsist;

import java.util.ArrayList;
import java.util.List;

/**
 * UC10: Count Total Seats in Train (reduce)
 * 
 * Goal: Aggregate seating capacities into a single total value using Stream reduction.
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

        System.out.println("Train Consist Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nCalculating total seating capacity...");

        // 2 & 3 & 4. Convert list to stream, use map to get capacities, use reduce to sum
        int totalSeatingCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 5. Display the total seating capacity
        System.out.println("\nTotal Seating Capacity of the Train: " + totalSeatingCapacity + " seats");
        
        System.out.println("==============================================");
    }
}
