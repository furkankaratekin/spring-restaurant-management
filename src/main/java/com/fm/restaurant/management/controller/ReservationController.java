package com.fm.restaurant.management.controller;

import com.fm.restaurant.management.dto.ReservationDto;
import com.fm.restaurant.management.model.Order;
import com.fm.restaurant.management.model.Reservation;
import com.fm.restaurant.management.service.abstracts.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reservation")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    //Tüm rezervasyonları getir
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    //ID'ye göre rezervasyon getir
    @GetMapping("/{reservationId}")
    public Reservation getOneReservation(@PathVariable Long reservationId) {
        return reservationService.getOneReservation(reservationId);
    }

    //Rezerve Ekle
   @PostMapping
    public Reservation createReservation(@RequestBody Reservation newReservation) {
        return reservationService.createReservation(newReservation);
   }
    //Rezervasyon güncelle
   @PutMapping("/update/{reservationId}")
    public Reservation updateReservation(@PathVariable Long reservationId, @RequestBody Reservation newReservation) {
        return reservationService.updateReservation(reservationId,newReservation);
   }
    //Tüm Rezervasyon sil
    @DeleteMapping
    public ResponseEntity<?> deleteAllReservations() {
        reservationService.deleteAllReservations();
        return ResponseEntity.ok("Tüm rezervasyonlar silindi");
    }

    //Id'ye göre rezervasyon sil
    @DeleteMapping("/delete/{reservationId}")
    public ResponseEntity<?> deleteReservation(@PathVariable Long reservationId) {
        reservationService.deleteReservation(reservationId);
        return ResponseEntity.ok(reservationId + " numaralı rezervasyon başarıyla silinmiştir.");
    }
}
