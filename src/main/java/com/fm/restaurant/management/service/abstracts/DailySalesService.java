package com.fm.restaurant.management.service.abstracts;

import com.fm.restaurant.management.dto.DailySalesDto;

import java.util.List;

public interface DailySalesService {
    List<DailySalesDto> getAllDailySales();
}
