package com.trainconsist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC13: Benchmark Loop vs Stream Performance
 *
 * Key Concepts:
 * - System.nanoTime() for high-resolution timing.
 * - Loop-Based Processing vs Stream-Based Processing.
 * - Micro-Measurement Awareness.
 * - Evidence-Driven Optimization.
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==============================================");
        System.out.println("  UC13: Performance Benchmark");
        System.out.println("==============================================");
        System.out.println();

        // 1. Prepare a large collection of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (i % 100) + 10));
        }
        System.out.println("Total bogies created: " + bogies.size());
        System.out.println();

        // --- Loop-Based Filtering ---
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopElapsed = loopEnd - loopStart;

        System.out.println("Loop-Based Filtering:");
        System.out.println("  Filtered count: " + loopFiltered.size());
        System.out.println("  Time taken: " + loopElapsed + " ns (" + (loopElapsed / 1_000_000.0) + " ms)");
        System.out.println();

        // --- Stream-Based Filtering ---
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamElapsed = streamEnd - streamStart;

        System.out.println("Stream-Based Filtering:");
        System.out.println("  Filtered count: " + streamFiltered.size());
        System.out.println("  Time taken: " + streamElapsed + " ns (" + (streamElapsed / 1_000_000.0) + " ms)");
        System.out.println();

        // --- Comparison ---
        System.out.println("----------------------------------------------");
        System.out.println("Performance Comparison:");
        if (loopElapsed < streamElapsed) {
            System.out.println("  Loop was faster by " + (streamElapsed - loopElapsed) + " ns");
        } else {
            System.out.println("  Stream was faster by " + (loopElapsed - streamElapsed) + " ns");
        }
        System.out.println("----------------------------------------------");
        System.out.println("Note: Results may vary. Always measure before optimizing!");
        System.out.println("==============================================");
    }
}
