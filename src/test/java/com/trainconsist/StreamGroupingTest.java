package com.trainconsist;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingTest {

    @Test
    public void testGrouping_BogiesGroupedByType() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertTrue(grouped.containsKey("Sleeper"));
        assertTrue(grouped.containsKey("AC Chair"));
    }

    @Test
    public void testGrouping_MultipleBogiesInSameGroup() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertEquals(2, grouped.get("Sleeper").size());
    }

    @Test
    public void testGrouping_DifferentBogieTypes() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertEquals(3, grouped.keySet().size());
        assertTrue(grouped.containsKey("Sleeper"));
        assertTrue(grouped.containsKey("AC Chair"));
        assertTrue(grouped.containsKey("First Class"));
    }

    @Test
    public void testGrouping_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertTrue(grouped.isEmpty());
    }

    @Test
    public void testGrouping_SingleBogieCategory() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertEquals(1, grouped.keySet().size());
        assertTrue(grouped.containsKey("Sleeper"));
        assertEquals(1, grouped.get("Sleeper").size());
    }

    @Test
    public void testGrouping_MapContainsCorrectKeys() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertTrue(grouped.keySet().containsAll(List.of("Sleeper", "AC Chair", "First Class")));
    }

    @Test
    public void testGrouping_GroupSizeValidation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        Map<String, List<Bogie>> grouped = bogies.stream()
            .collect(Collectors.groupingBy(b -> b.name));
            
        assertEquals(2, grouped.get("Sleeper").size());
        assertEquals(1, grouped.get("AC Chair").size());
    }

    @Test
    public void testGrouping_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        List<Bogie> grouped = new ArrayList<>(bogies);
        bogies.stream().collect(Collectors.groupingBy(b -> b.name));
            
        assertEquals(2, bogies.size());
        assertEquals(bogies, grouped);
    }
}
