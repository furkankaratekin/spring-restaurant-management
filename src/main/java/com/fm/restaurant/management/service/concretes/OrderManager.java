package com.fm.restaurant.management.service.concretes;

import com.fm.restaurant.management.dto.OrderDto;
import com.fm.restaurant.management.model.Menu;
import com.fm.restaurant.management.model.Order;
import com.fm.restaurant.management.repository.OrderRepo;
import com.fm.restaurant.management.service.abstracts.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderManager implements OrderService {

    private final OrderRepo orderRepo;

    @Autowired
    public OrderManager(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }


    @Override
    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    @Override
    public Order getOneOrder(Long orderId) {
        return orderRepo.findById(orderId).orElse(null);
    }

    @Override
    public Order createOrder(Order newOrder) {
        return orderRepo.save(newOrder);
    }

    @Override
    public Order updateOneOrder(Long orderId, OrderDto newUpdateOrder) {
        Optional<Order> order = orderRepo.findById(orderId);
        if (order.isPresent()) {
            Order foundOrder = order.get();
            foundOrder.setOrderTime(newUpdateOrder.getOrderTime());
            foundOrder.setStatus(newUpdateOrder.getStatus());
            foundOrder.setTableNumber(newUpdateOrder.getTableNumber());
            orderRepo.save(foundOrder);
            return foundOrder;
        }else {
        return null;
        }
    }

    @Override
    public void deleteOneOrder(Long orderId) {
        orderRepo.deleteById(orderId);
    }
}
