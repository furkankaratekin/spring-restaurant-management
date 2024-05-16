package com.fm.restaurant.management.service.abstracts;

import com.fm.restaurant.management.dto.OrderDto;
import com.fm.restaurant.management.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrder();

    Order getOneOrder(Long orderId);

    Order createOrder(Order newOrder);

    Order updateOneOrder(Long orderId, OrderDto newUpdateOrder);

    void deleteOneOrder(Long orderId);
}
