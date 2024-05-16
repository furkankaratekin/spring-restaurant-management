package com.fm.restaurant.management.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  int tableNumber;

    private LocalDateTime orderTime;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "menu_id",nullable = false)
    Menu menu;


//    @ManyToMany
//    @JoinTable(name = "order_menus", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "menu_id"))
//    Set<Menu> menus;

}
