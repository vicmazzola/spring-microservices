package com.victor.deliveryservice.dto;

import com.victor.deliveryservice.model.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Data Transfer Object for creating or updating a delivery.
 */
@Getter
@Setter
public class DeliveryDto {

    /**
     * The unique ID of the delivery.
     */
    private Long deliveryId;

    /**
     * The order number associated with the delivery.
     */
    private Long orderNumber;

    /**
     * The name of the delivery person.
     */
    private String deliveryPerson;

    /**
     * The current delivery status.
     */
    private DeliveryStatus deliveryStatus;

    /**
     * The date of delivery.
     */
    private LocalDate deliveryDate;
}
