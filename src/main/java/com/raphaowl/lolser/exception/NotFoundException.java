package com.raphaowl.lolser.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public class NotFoundException extends HttpServerErrorException {
    public NotFoundException(HttpStatus statusCode) {
        super(statusCode);
    }
}
