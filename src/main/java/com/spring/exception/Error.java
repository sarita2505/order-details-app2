package com.spring.exception;

public class Error {
    String message;
    int statusCode;

    public Error() {
    }

    public Error(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }
}
