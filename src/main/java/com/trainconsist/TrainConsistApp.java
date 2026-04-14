package com.trainconsist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sort Bogies by Capacity (Comparator)
 * 
 * Goal: Sort passenger bogies based on their seating capacity using a custom Comparator.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create a List<Bogie> to store passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSorting bogies by capacity (ascending)...");

        // 3. Use Comparator.comparingInt() to define sorting based on capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 4. Display the sorted bogies
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        
        System.out.println("==============================================");
    }
}
