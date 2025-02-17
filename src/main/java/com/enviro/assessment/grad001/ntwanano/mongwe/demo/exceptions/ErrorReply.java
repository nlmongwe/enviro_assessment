package com.enviro.assessment.grad001.ntwanano.mongwe.demo.exceptions;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/*
This class will be the template for an error response of any type (Custom error response)
 */
public class ErrorReply {
    private String timestamp;
    private int status;
    private String error;
    private String message;


    public ErrorReply(int status, String error, String message) {
        this.timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        this.status = status;
        this.error = error;
        this.message = message;

    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
