package com.victor.orderservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Entity representing an order placed by a customer.
 */
@Entity
@Table(name = "tb_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {

    /**
     * Unique order identifier (primary key).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_number")
    private Long orderNumber;

    /**
     * Full name of the customer.
     */
    @NotBlank
    @Size(min = 3, max = 100)
    @Column(name = "customer_name")
    private String customerName;

    /**
     * Date when the order was placed.
     */
    @Column(name = "order_date")
    private LocalDate orderDate;

    /**
     * Total amount of the order.
     */
    @NotNull
    @Positive
    private BigDecimal value;

    /**
     * Delivery status of the order.
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "delivery_status")
    private DeliveryStatus deliveryStatus;
}
