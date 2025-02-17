package com.enviro.assessment.grad001.ntwanano.mongwe.demo.exceptions;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.exceptions.customExeption.DuplicateResourceException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//Class handles a specific exception
@ControllerAdvice
public class GlobalExceptions {

    /*
    Custom error response handling for not found error, this is used when EntityNotFound exception is thrown
    this will set the custom error message in request response to user (Postman/UI)
    e,g when querying data that is not found in database
     */
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorReply> handleEntityNotFound(EntityNotFoundException ex) {
        ErrorReply error = new ErrorReply(HttpStatus.NOT_FOUND.value(), "Request Error",ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    /*
    Custom error response handling for already in use, this is used when DuplicateResourceException exception is thrown
    this will set the custom error message in request response to user (Postman/UI)
    e,g when inserting data that is already in use
     */
    @ExceptionHandler(DuplicateResourceException.class)
    @ResponseStatus(HttpStatus.IM_USED)
    public ResponseEntity<ErrorReply> handleDuplicateResource(DuplicateResourceException ex){
        ErrorReply error = new ErrorReply(HttpStatus.IM_USED.value(), "Insert Error", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
