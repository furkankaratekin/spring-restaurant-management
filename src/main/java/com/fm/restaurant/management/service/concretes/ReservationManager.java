package com.fm.restaurant.management.service.concretes;

import com.fm.restaurant.management.dto.ReservationDto;
import com.fm.restaurant.management.model.Menu;
import com.fm.restaurant.management.model.Order;
import com.fm.restaurant.management.model.Reservation;
import com.fm.restaurant.management.repository.ReservationRepo;
import com.fm.restaurant.management.service.abstracts.ReservationService;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReservationManager implements ReservationService {


    private final ReservationRepo reservationRepo;

    @Autowired
    public ReservationManager(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }


    //Bütün rezervasyonlar
    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    //ID'ye göre rezervasyon
    @Override
    public Reservation getOneReservation(Long reservationId) {
        return reservationRepo.findById(reservationId).orElse(null);
    }

    //Yeni rezervasyon
    @Override
    public Reservation createReservation(Reservation newReservation) {
        return reservationRepo.save(newReservation);
    }

    //rezervasyon güncelleme
    @Override
    public Reservation updateReservation(Long reservationId, Reservation newReservation) {
        Optional<Reservation> reservation = reservationRepo.findById(reservationId);
        if(reservation.isPresent()) {
            Reservation foundReservation = reservation.get();
            foundReservation.setCustomerName(newReservation.getCustomerName());
            foundReservation.setReservationTime(newReservation.getReservationTime());
            foundReservation.setNumberOfPeople(newReservation.getNumberOfPeople());
            foundReservation.setTableNumber(newReservation.getTableNumber());
            reservationRepo.save(foundReservation);
            return foundReservation;
        }else{
            return null;
        }
    }
    //Tüm rezervasyonları silme
    @Override
    public void deleteAllReservations() {
        reservationRepo.deleteAll();
    }

    //ID'ye göre rezervasyon silme
    @Override
    public void deleteReservation(Long reservationId) {
        reservationRepo.deleteById(reservationId);
    }
}
