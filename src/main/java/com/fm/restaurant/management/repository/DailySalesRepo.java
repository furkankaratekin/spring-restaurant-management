package com.fm.restaurant.management.repository;

import com.fm.restaurant.management.model.DailySales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailySalesRepo extends JpaRepository<DailySales,Long> {

}
