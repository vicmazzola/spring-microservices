package com.victor.deliveryservice.controller;

import com.victor.deliveryservice.dto.DeliveryDto;
import com.victor.deliveryservice.dto.DeliveryResponseDto;
import com.victor.deliveryservice.service.DeliveryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing deliveries.
 */
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService service;

    /**
     * Creates a new delivery.
     *
     * @param deliveryDto the delivery data
     * @return the created delivery
     */
    @PostMapping
    public DeliveryResponseDto create(@RequestBody @Valid DeliveryDto deliveryDto) {
        return service.create(deliveryDto);
    }

    /**
     * Retrieves a delivery by its ID.
     *
     * @param deliveryId the delivery ID
     * @return the delivery data
     */
    @GetMapping("{deliveryId}")
    public ResponseEntity<DeliveryResponseDto> findById(@PathVariable Long deliveryId) {
        return ResponseEntity.ok(service.findById(deliveryId));
    }

    /**
     * Lists all deliveries.
     *
     * @return list of all deliveries
     */
    @GetMapping
    public ResponseEntity<List<DeliveryResponseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    /**
     * Deletes a delivery by its ID.
     *
     * @param deliveryId the delivery ID
     */
    @DeleteMapping("{deliveryId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long deliveryId) {
        service.delete(deliveryId);
    }

    /**
     * Updates an existing delivery.
     *
     * @param deliveryDto the delivery data to update
     * @return the updated delivery
     */
    @PutMapping
    public DeliveryResponseDto update(@RequestBody @Valid DeliveryDto deliveryDto) {
        return service.update(deliveryDto);
    }
}
