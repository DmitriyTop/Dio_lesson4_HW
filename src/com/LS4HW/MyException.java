package com.LS4HW;

public class MyException extends RuntimeException {
    private final String errorMessage;

    public MyException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public String getErrorCode() {
        return errorMessage;
    }
}
