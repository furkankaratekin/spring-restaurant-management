package com.fm.restaurant.management.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;
}
