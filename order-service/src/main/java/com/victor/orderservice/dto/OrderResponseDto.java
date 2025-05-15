package com.victor.orderservice.dto;

//import com.victor.orderservice.model.DeliveryStatus;
import com.victor.orderservice.model.Order;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DTO used to display order information in responses.
 *
 * @param orderNumber     Unique identifier of the order
 * @param customerName    Full name of the customer
 * @param orderDate       Date when the order was placed
 * @param value           Total value of the order
// * @param deliveryStatus  Current delivery status
 */
public record OrderResponseDto(
        Long orderNumber,
        String customerName,
        LocalDate orderDate,
        BigDecimal value
//        DeliveryStatus deliveryStatus
) {
    /**
     * Creates an OrderResponseDto from an Order entity.
     *
     * @param order the order entity
     */
    public OrderResponseDto(Order order) {
        this(
                order.getOrderNumber(),
                order.getCustomerName(),
                order.getOrderDate(),
                order.getValue()
//                order.getDeliveryStatus()
        );
    }
}
