package com.curriculum.exception;

public class ModeloNotFoundException extends RuntimeException{

    public ModeloNotFoundException(String message) {
        super(message);
    }
}
