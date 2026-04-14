package com.trainconsist;

/**
 * Custom checked exception for invalid bogie capacity.
 */
public class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}
