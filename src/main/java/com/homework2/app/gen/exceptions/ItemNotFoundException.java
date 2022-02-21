package com.homework2.app.gen.exceptions;

import com.homework2.app.enums.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(ErrorMessage message) {
        super(message.getMessage());
    }
}
