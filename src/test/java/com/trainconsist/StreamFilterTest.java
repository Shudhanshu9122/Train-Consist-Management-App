package com.trainconsist;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterTest {

    @Test
    public void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertEquals(1, filtered.size());
        assertEquals("Sleeper", filtered.get(0).name);
    }

    @Test
    public void testFilter_CapacityEqualToThreshold() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Custom Bogie", 60));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertEquals(1, filtered.size());
        assertEquals("Sleeper", filtered.get(0).name);
    }

    @Test
    public void testFilter_CapacityLessThanThreshold() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity < 60)
            .collect(Collectors.toList());
            
        assertEquals(1, filtered.size());
        assertEquals("AC Chair", filtered.get(0).name);
    }

    @Test
    public void testFilter_MultipleBogiesMatching() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper Premium", 75));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertEquals(2, filtered.size());
    }

    @Test
    public void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertTrue(filtered.isEmpty());
    }

    @Test
    public void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper Premium", 75));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertEquals(2, filtered.size());
    }

    @Test
    public void testFilter_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertTrue(filtered.isEmpty());
    }

    @Test
    public void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        List<Bogie> filtered = bogies.stream()
            .filter(b -> b.capacity > 60)
            .collect(Collectors.toList());
            
        assertEquals(2, bogies.size());
    }
}
