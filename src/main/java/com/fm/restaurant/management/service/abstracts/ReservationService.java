package com.fm.restaurant.management.service.abstracts;

import com.fm.restaurant.management.dto.ReservationDto;
import com.fm.restaurant.management.model.Reservation;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    List<Reservation> getAllReservations();

    Reservation getOneReservation(Long reservationId);

    Reservation createReservation(Reservation newReservation);

    Reservation updateReservation(Long reservationId, Reservation newReservation);

    void deleteAllReservations();

    void deleteReservation(Long reservationId);
}
