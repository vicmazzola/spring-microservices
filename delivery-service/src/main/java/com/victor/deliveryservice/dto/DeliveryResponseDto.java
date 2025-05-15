package com.victor.deliveryservice.dto;

import com.victor.deliveryservice.model.Delivery;
import com.victor.deliveryservice.model.DeliveryStatus;

import java.time.LocalDate;

/**
 * Response DTO for returning delivery data to clients.
 *
 * @param deliveryId     the delivery ID
 * @param orderNumber    the associated order number
 * @param deliveryPerson the delivery person's name
 * @param deliveryStatus the status of the delivery
 * @param deliveryDate   the date the delivery was completed
 */
public record DeliveryResponseDto(
        Long deliveryId,
        Long orderNumber,
        String deliveryPerson,
        DeliveryStatus deliveryStatus,
        LocalDate deliveryDate
) {
    /**
     * Constructs the response DTO from a Delivery entity.
     *
     * @param delivery the delivery entity
     */
    public DeliveryResponseDto(Delivery delivery) {
        this(
                delivery.getDeliveryId(),
                delivery.getOrderNumber(),
                delivery.getDeliveryPerson(),
                delivery.getDeliveryStatus(),
                delivery.getDeliveryDate()
        );
    }
}
