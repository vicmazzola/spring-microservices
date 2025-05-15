package com.victor.orderservice.dto;

import com.victor.orderservice.model.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Data Transfer Object (DTO) used for creating or updating an order.
 */
@Getter
@Setter
public class OrderDto {

    /**
     * Unique identifier of the order.
     */
    private Long orderNumber;

    /**
     * Name of the customer placing the order.
     */
    private String customerName;

    /**
     * Date when the order was placed.
     */
    private LocalDate orderDate;

    /**
     * Total value of the order.
     */
    private BigDecimal value;

//    /**
//     * Current delivery status of the order.
//     */
//    private DeliveryStatus deliveryStatus;
}
