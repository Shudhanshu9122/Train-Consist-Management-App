# Train Consist Management App

## App-Based Learning Using Core Java & Data Structures

### Objective
This project focuses on the design and implementation of a **Train Consist Management System** to demonstrate how Core Java and fundamental data structures are applied to solve real-world railway operations challenges.

### Use Cases

| UC  | Title                                        | Key Concepts                          |
|-----|----------------------------------------------|---------------------------------------|
| UC1 | Initialize Train & Display Consist Summary   | Class, Main Method, ArrayList, List   |
| UC2 | Add Passenger Bogies (ArrayList Operations)  | add(), remove(), contains(), CRUD     |
| UC3 | Track Unique Bogie IDs (HashSet)             | Set, HashSet, Deduplication           |
| UC4 | Maintain Ordered Bogie IDs (LinkedList)      | LinkedList, Node Structure, Ordering  |
| UC5 | Preserve Insertion Order (LinkedHashSet)     | LinkedHashSet, Ordered Uniqueness     |
| UC6 | Map Bogie to Capacity (HashMap)              | HashMap, Key-Value Mapping            |
| UC7 | Sort Bogies by Capacity (Comparator)         | Comparator, Custom Objects, Lambda    |
| UC8 | Filter Passenger Bogies Using Streams        | Stream API, filter(), collect()       |
| UC9 | Group Bogies by Type (Collectors.groupingBy)  | groupingBy(), Map Output              |
| UC10| Count Total Seats in Train (reduce)          | map(), reduce(), Aggregation          |
| UC11| Validate Formats Using Regex                 | Pattern, Matcher, matches()           |
| UC12| Safety Validation (Streams allMatch)         | Streams, allMatch(), Lambda           |
| UC13| Benchmark Loop vs Stream                     | System.nanoTime(), Benchmarking       |
| UC14| Prevent Invalid Passenger Bogies             | Custom Checked Exception, throw       |
| UC15| Handle Unsafe Cargo Assignment               | try-catch-finally, Runtime Exception  |
| UC16| Bubble Sort Passengers                       | Custom logic, O(n^2), array traversal |
| UC17| Built-in Sort Bogie Types                    | Arrays.sort(), O(n log n)             |
| UC18| Linear Search Bogie ID                       | Linear sequence, O(n), traversal      |
| UC19| Binary Search Bogie ID                       | Divide & conquer, O(log n)            |
| UC20| Prevent Search on Empty Train                | Defensive programming, fail-fast      |

### Branch Strategy
Each use case is developed in its own branch:
- `main` — Project overview
- `UC1` through `UC20` — Incremental feature branches

### How to Run
```bash
# Compile
javac -d out src/main/java/com/trainconsist/*.java

# Run
java -cp out com.trainconsist.TrainConsistApp
```

### Learning Approach
The application is developed incrementally, with each use case introducing one new concept at a time while reinforcing previously learned ideas.

### Scope & Focus
- Emphasis on **data structures**, **OOP design**, and **advanced Java concepts**
- Console-based, deterministic operations
- Minimal UI complexity to maintain focus on core logic
