package com.enviro.assessment.grad001.ntwanano.mongwe.demo.util;

import org.springframework.http.HttpStatus;

public class SuccessResponse {

    private final int returnResponse;
    private final String message;
    private Object object;

    public SuccessResponse(Object object) {
        this.returnResponse = 0;
        this.message = "Success";
        this.object = object;
    }


    public int getReturnResponse() {
        return returnResponse;
    }

    public String getMessage() {
        return message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
