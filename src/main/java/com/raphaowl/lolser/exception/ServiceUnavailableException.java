package com.raphaowl.lolser.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public class ServiceUnavailableException extends HttpServerErrorException {
    public ServiceUnavailableException(HttpStatus statusCode) {
        super(statusCode);
    }
}
