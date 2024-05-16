package com.fm.restaurant.management.controller;


import com.fm.restaurant.management.dto.OrderDto;
import com.fm.restaurant.management.model.Menu;
import com.fm.restaurant.management.model.Order;
import com.fm.restaurant.management.service.abstracts.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //Tüm siparişleri getir
    @GetMapping
    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }

    //Id'ye göre siparişleri getir
    @GetMapping("/{orderId}")
    public Order getOneOrder(@PathVariable Long orderId) {
        return orderService.getOneOrder(orderId);
    }
    //Sipariş Ekle
    @PostMapping()
    public Order createOrder(@RequestBody Order newOrder){
        return orderService.createOrder(newOrder);
    }
    //Siparişi Güncelle
    @PutMapping("/update/{orderId}")
    public Order updateOneOrder(@PathVariable Long orderId, @RequestBody OrderDto newUpdateOrder){
        return orderService.updateOneOrder(orderId,newUpdateOrder);
    }
    //Id'ye göre siparişi sil
    @DeleteMapping("/delete/{orderId}")
    public ResponseEntity deleteOneOrder(@PathVariable Long orderId){
        orderService.deleteOneOrder(orderId);
        return ResponseEntity.ok("Başarı ile silinmiştir");
    }



}
