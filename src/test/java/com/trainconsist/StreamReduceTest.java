package com.trainconsist;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StreamReduceTest {

    @Test
    public void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        int totalSeats = bogies.stream()
            .map(b -> b.capacity)
            .reduce(0, Integer::sum);
            
        assertEquals(128, totalSeats);
    }

    @Test
    public void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        
        int totalSeats = bogies.stream()
            .map(b -> b.capacity)
            .reduce(0, Integer::sum);
            
        assertEquals(224, totalSeats);
    }

    @Test
    public void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        
        int totalSeats = bogies.stream()
            .map(b -> b.capacity)
            .reduce(0, Integer::sum);
            
        assertEquals(72, totalSeats);
    }

    @Test
    public void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        
        int totalSeats = bogies.stream()
            .map(b -> b.capacity)
            .reduce(0, Integer::sum);
            
        assertEquals(0, totalSeats);
    }

    @Test
    public void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Custom Bogie", 100));
        bogies.add(new Bogie("Another Bogie", 50));
        
        List<Integer> extractedCapacities = bogies.stream()
            .map(b -> b.capacity)
            .toList();
            
        assertEquals(2, extractedCapacities.size());
        assertEquals(Integer.valueOf(100), extractedCapacities.get(0));
        assertEquals(Integer.valueOf(50), extractedCapacities.get(1));
        
        int totalSeats = extractedCapacities.stream()
            .reduce(0, Integer::sum);
            
        assertEquals(150, totalSeats);
    }

    @Test
    public void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        List<Bogie> copy = new ArrayList<>(bogies);
        
        bogies.stream()
            .map(b -> b.capacity)
            .reduce(0, Integer::sum);
            
        assertEquals(2, bogies.size());
        assertEquals(bogies, copy);
    }
}
