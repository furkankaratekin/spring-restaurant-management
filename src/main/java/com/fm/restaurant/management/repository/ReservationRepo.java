package com.fm.restaurant.management.repository;

import com.fm.restaurant.management.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
