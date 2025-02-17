package com.enviro.assessment.grad001.ntwanano.mongwe.demo.exceptions.customExeption;
/*
Custom exception, this will be thrown when an attempt to add an item that already exists in the database,
it extends runtime exception and will override or update the error message with the message parsed in its constructor
 */
public class DuplicateResourceException extends RuntimeException{
    public DuplicateResourceException(String message) {
        super(message);
    }
}
