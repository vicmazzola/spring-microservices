package com.victor.orderservice.service;

import com.victor.orderservice.dto.OrderDto;
import com.victor.orderservice.dto.OrderResponseDto;
import com.victor.orderservice.model.Order;
import com.victor.orderservice.repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class responsible for business logic related to orders.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * Creates a new order and saves it to the database.
     *
     * @param orderDto the order data
     * @return the saved order as a response DTO
     */
    public OrderResponseDto create(OrderDto orderDto) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDto, order);
//        order.setDeliveryStatus(DeliveryStatus.PROCESSING);
        Order created = orderRepository.save(order);
        return new OrderResponseDto(created);
    }

    /**
     * Finds an order by its ID.
     *
     * @param orderNumber the ID of the order
     * @return the order as a response DTO
     */


    /**
     * Returns a list of all orders in the system.
     *
     * @return list of response DTOs
     */
    public List<OrderResponseDto> findAll() {
        return orderRepository.findAll()
                .stream()
                .map(OrderResponseDto::new)
                .toList();
    }


    /**
     * Updates an existing order with the provided data.
     *
     * @param orderDto the updated order data
     * @return the updated order as a response DTO
     */
    public OrderResponseDto update(OrderDto orderDto) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDto, order);
        Order updated = orderRepository.save(order);
        return new OrderResponseDto(updated);
    }
}
