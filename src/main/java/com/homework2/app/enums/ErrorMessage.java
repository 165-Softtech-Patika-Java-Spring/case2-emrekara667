package com.homework2.app.enums;

public enum ErrorMessage {
    ADDRESS_ERROR_MESSAGE("Address not found!"),
    ;

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
