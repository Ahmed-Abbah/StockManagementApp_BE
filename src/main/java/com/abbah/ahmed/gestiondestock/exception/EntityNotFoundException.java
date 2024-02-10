package com.abbah.ahmed.gestiondestock.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityNotFoundException extends RuntimeException{

    private ErrorCodes errorCode;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(String message,Throwable cause){
        super(message, cause);
    }

    public EntityNotFoundException(String message,Throwable cause,ErrorCodes errorCode){
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode=errorCode;
    }
}
