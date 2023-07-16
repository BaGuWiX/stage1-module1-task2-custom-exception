package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    private static final String MESSAGE_FORMAT = "Could not find student with ID %d";

    public StudentNotFoundException(long id) {
        super(String.format(MESSAGE_FORMAT, id));
    }
}