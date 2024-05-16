package com.fm.restaurant.management.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private LocalDateTime reservationTime;
    private Integer numberOfPeople;
    private Integer tableNumber;
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "order_id", nullable = false)
    Order order;


}
