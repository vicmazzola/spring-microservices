package com.victor.deliveryservice.service;

import com.victor.deliveryservice.dto.DeliveryDto;
import com.victor.deliveryservice.dto.DeliveryResponseDto;
import com.victor.deliveryservice.exception.DeliveryNotFoundException;
import com.victor.deliveryservice.model.Delivery;
import com.victor.deliveryservice.repository.DeliveryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class responsible for business logic related to deliveries.
 */
@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    /**
     * Creates and saves a new delivery.
     *
     * @param deliveryDto the delivery data
     * @return the saved delivery as a response DTO
     */
    public DeliveryResponseDto create(DeliveryDto deliveryDto) {
        Delivery delivery = new Delivery();
        BeanUtils.copyProperties(deliveryDto, delivery);
        Delivery saved = deliveryRepository.save(delivery);
        return new DeliveryResponseDto(saved);
    }

    /**
     * Finds a delivery by its ID.
     *
     * @param deliveryId the delivery ID
     * @return the delivery as a response DTO
     */
    public DeliveryResponseDto findById(Long deliveryId) {
        Optional<Delivery> optional = deliveryRepository.findById(deliveryId);
        return optional.map(DeliveryResponseDto::new)
                .orElseThrow(() -> new DeliveryNotFoundException("Delivery not found!"));
    }

    /**
     * Returns all deliveries in the system.
     *
     * @return list of response DTOs
     */
    public List<DeliveryResponseDto> findAll() {
        return deliveryRepository.findAll()
                .stream()
                .map(DeliveryResponseDto::new)
                .toList();
    }

    /**
     * Deletes a delivery by ID.
     *
     * @param deliveryId the ID of the delivery to delete
     */
    public void delete(Long deliveryId) {
        Optional<Delivery> optional = deliveryRepository.findById(deliveryId);
        if (optional.isPresent()) {
            deliveryRepository.delete(optional.get());
        } else {
            throw new DeliveryNotFoundException("Delivery not found!");
        }
    }

    /**
     * Updates an existing delivery.
     *
     * @param deliveryDto the updated delivery data
     * @return the updated delivery as a response DTO
     */
    public DeliveryResponseDto update(DeliveryDto deliveryDto) {
        Delivery delivery = new Delivery();
        BeanUtils.copyProperties(deliveryDto, delivery);
        Delivery updated = deliveryRepository.save(delivery);
        return new DeliveryResponseDto(updated);
    }
}
