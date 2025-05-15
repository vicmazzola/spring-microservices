package com.victor.orderservice.model;

/**
 * Enum representing the delivery status of an order.
 */
public enum DeliveryStatus {

    /**
     * The order is being prepared for shipment.
     */
    PROCESSING,

    /**
     * The order is in transit to the customer.
     */
    IN_TRANSIT,

    /**
     * The order has been delivered.
     */
    DELIVERED
}
