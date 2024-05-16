package com.fm.restaurant.management.service.concretes;

import com.fm.restaurant.management.model.Details;
import com.fm.restaurant.management.service.abstracts.DetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsManager implements DetailsService {
    @Override
    public List<Details> getAllDetails() {
        return List.of();
    }

}
