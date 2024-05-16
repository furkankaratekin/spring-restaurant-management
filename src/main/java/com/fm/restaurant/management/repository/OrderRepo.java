package com.fm.restaurant.management.repository;

import com.fm.restaurant.management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
