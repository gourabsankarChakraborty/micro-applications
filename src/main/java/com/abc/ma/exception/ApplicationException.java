package com.abc.ma.exception;

import lombok.Generated;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Generated
public class ApplicationException extends RuntimeException {
    public ApplicationException(String message){
        super(message);
    }

    public ApplicationException(String message, Throwable ex){
        super( message, ex);
    }
}
