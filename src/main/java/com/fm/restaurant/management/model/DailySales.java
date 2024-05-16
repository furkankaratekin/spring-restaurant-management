package com.fm.restaurant.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "dailysales")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DailySales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private Double totalSalesAmount;
    private Integer numberOfOrders;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    Order order;



}
