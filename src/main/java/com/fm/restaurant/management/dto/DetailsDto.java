package com.fm.restaurant.management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetailsDto {

    private Long id;
    private Integer quantity;
    private Long orderId;
    private Long dailySalesId;
}
