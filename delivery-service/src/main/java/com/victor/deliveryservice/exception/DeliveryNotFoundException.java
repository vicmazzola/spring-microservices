package com.victor.deliveryservice.exception;

/**
 * Exception thrown when a delivery is not found in the system.
 */
public class DeliveryNotFoundException extends RuntimeException {

    /**
     * Constructs a new DeliveryNotFoundException with a given message.
     *
     * @param message the detail message
     */
    public DeliveryNotFoundException(String message) {
        super(message);
    }
}
