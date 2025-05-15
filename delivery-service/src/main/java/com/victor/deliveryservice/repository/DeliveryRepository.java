package com.victor.deliveryservice.repository;

import com.victor.deliveryservice.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Delivery entities.
 */
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
