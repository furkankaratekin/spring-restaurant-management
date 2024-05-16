package com.fm.restaurant.management.controller;

import com.fm.restaurant.management.model.Details;
import com.fm.restaurant.management.service.abstracts.DetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/details")
public class DetailsController {
    private DetailsService detailsService;

    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }
    //O günkü siparişlerin tümünü getir.(Detayli)
    @GetMapping
    public List<Details> getAllDetails() {
        return detailsService.getAllDetails();
    }

}
