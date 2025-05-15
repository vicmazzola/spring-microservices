package com.victor.orderservice.controller;

import com.victor.orderservice.dto.OrderDto;
import com.victor.orderservice.dto.OrderResponseDto;
import com.victor.orderservice.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing orders.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    /**
     * Creates a new order.
     *
     * @param orderDto the order data
     * @return the created order
     */
    @PostMapping
    public OrderResponseDto create(@RequestBody @Valid OrderDto orderDto) {
        return service.create(orderDto);
    }

    /**
     * Retrieves an order by its ID.
     *
     * @param orderNumber the ID of the order
     * @return the order found
     */
    @GetMapping("{orderNumber}")
    public ResponseEntity<OrderResponseDto> findById(@PathVariable Long orderNumber) {
        return ResponseEntity.ok(service.findById(orderNumber));
    }

    /**
     * Lists all orders.
     *
     * @return list of all orders
     */
    @GetMapping
    public ResponseEntity<List<OrderResponseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    /**
     * Deletes an order by its ID.
     *
     * @param orderNumber the ID of the order
     */
    @DeleteMapping("{orderNumber}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long orderNumber) {
        service.delete(orderNumber);
    }

    /**
     * Updates an existing order.
     *
     * @param orderDto the updated order data
     * @return the updated order
     */
    @PutMapping
    public OrderResponseDto update(@RequestBody @Valid OrderDto orderDto) {
        return service.update(orderDto);
    }
}
