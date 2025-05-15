package com.victor.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when an order is not found in the system.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {

    /**
     * Constructs a new OrderNotFoundException with the given message.
     *
     * @param message the detail message
     */
    public OrderNotFoundException(String message) {
        super(message);
    }
}
