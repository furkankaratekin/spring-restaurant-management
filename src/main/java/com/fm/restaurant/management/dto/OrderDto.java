
package com.fm.restaurant.management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long id;
    private int tableNumber;
    private LocalDateTime orderTime;
    private Boolean status;
    private Long menuId;
}