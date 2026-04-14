package com.trainconsist;

import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // 1. Create an ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("List after insertion: " + passengerBogies);

        // 4. Remove one bogie (for example AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("List after removing 'AC Chair': " + passengerBogies);

        // 5. Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the list contain 'Sleeper'? " + hasSleeper);

        // 6. Print final list state
        System.out.println("Final valid passenger bogies list state: " + passengerBogies);
    }
}
