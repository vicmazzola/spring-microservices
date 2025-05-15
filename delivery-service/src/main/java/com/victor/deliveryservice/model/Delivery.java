package com.victor.deliveryservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;

/**
 * Entity representing a delivery related to an order.
 */
@Entity
@Table(name = "tbl_deliveries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Delivery {

    /**
     * The unique ID of the delivery.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Long deliveryId;

    /**
     * The order number associated with this delivery.
     */
    @NotNull
    @Positive
    @Column(name = "order_number")
    private Long orderNumber;

    /**
     * The name of the delivery person.
     */
    @Column(name = "delivery_person")
    private String deliveryPerson;

    /**
     * The current delivery status.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "delivery_status")
    private DeliveryStatus deliveryStatus;

    /**
     * The date when the delivery was completed.
     */
    @Column(name = "delivery_date")
    private LocalDate deliveryDate;
}
