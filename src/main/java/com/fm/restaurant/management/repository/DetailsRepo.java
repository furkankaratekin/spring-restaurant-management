package com.fm.restaurant.management.repository;

import com.fm.restaurant.management.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepo extends JpaRepository<Details, Long> {
}
