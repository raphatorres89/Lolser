package com.raphaowl.lolser.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public class InternalServerException extends HttpServerErrorException {
    public InternalServerException(HttpStatus statusCode) {
        super(statusCode);
    }
}
