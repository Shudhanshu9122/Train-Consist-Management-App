package com.trainconsist;

public class Bogie {
    public String name;
    public int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero. Provided: " + capacity);
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{name='" + name + "', capacity=" + capacity + "}";
    }
}
