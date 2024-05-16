package com.fm.restaurant.management.service.concretes;

import com.fm.restaurant.management.dto.DailySalesDto;
import com.fm.restaurant.management.service.abstracts.DailySalesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailySalesManager implements DailySalesService {
    @Override
    public List<DailySalesDto> getAllDailySales() {
        return List.of();
    }
}









