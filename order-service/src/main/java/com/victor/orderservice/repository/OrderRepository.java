package com.victor.orderservice.repository;

import com.victor.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing Order entities in the database.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
