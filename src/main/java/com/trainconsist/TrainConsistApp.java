package com.trainconsist;

import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 *
 * Key Concepts:
 * - Class: A Java class acts as a container to hold program data and logic.
 * - Main Method: Entry point of the Java application.
 * - Static Keyword: Allows JVM to invoke main() without creating an object.
 * - ArrayList: A resizable list from the Java Collections Framework.
 * - List Interface: Provides abstraction over different List implementations.
 * - Console Output: Using System.out.println() to display messages.
 * - Dynamic Initialization: Creating an empty collection for later population.
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Print welcome message
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println();

        // Step 2: Initialize the train consist using an ArrayList
        // ArrayList is chosen because:
        // - It provides dynamic resizing (unlike fixed-size arrays)
        // - It maintains insertion order
        // - It allows indexed access to elements
        List<String> consist = new ArrayList<>();

        // Step 3: Display initial bogie count
        System.out.println("Train Consist Initialized.");
        System.out.println("Current number of bogies: " + consist.size());
        System.out.println();
        System.out.println("The train is ready for bogie attachment.");
        System.out.println("==============================================");
    }
}
