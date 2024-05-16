package com.fm.restaurant.management.dto;

import com.fm.restaurant.management.model.Order;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DailySalesDto {
    private Long id;
    private LocalDateTime date;
    private Double totalSalesAmount;
    private Integer numberOfOrders;
    private Long orderId;
}
