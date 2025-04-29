package com.antonio.exercise.exceptions;

public class InvalidBrowserType extends Exception {

    public InvalidBrowserType(String message) {
        super(message);
    }

    public InvalidBrowserType(String message, Throwable cause) {
        super(message, cause);
    }
}
