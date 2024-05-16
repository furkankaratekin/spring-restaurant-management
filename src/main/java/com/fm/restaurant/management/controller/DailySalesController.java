package com.fm.restaurant.management.controller;

import com.fm.restaurant.management.dto.DailySalesDto;
import com.fm.restaurant.management.service.abstracts.DailySalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/daily-sales")
public class DailySalesController {

    private DailySalesService dailySalesService;

    public DailySalesController(DailySalesService dailySalesService) {
        this.dailySalesService = dailySalesService;
    }

    //O günkü yapılan satışlardaki toplam tutarı ve siparis adetini getir
    @GetMapping
    public List<DailySalesDto> getAllDailySales(){
        return dailySalesService.getAllDailySales();
    }
}
