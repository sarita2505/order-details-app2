package com.spring.exception;

import org.omg.SendingContext.RunTime;

public class OrderDataException  extends RuntimeException {
    private Error error;
    public OrderDataException(Error error){
        error=this.error;
    }
    public OrderDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
