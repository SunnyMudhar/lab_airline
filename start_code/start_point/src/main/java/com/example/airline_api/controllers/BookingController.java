package com.example.airline_api.controllers;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.BookingDTO;
import com.example.airline_api.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Booking> addNewBooking(@RequestBody BookingDTO bookingDTO){
        Booking booking = bookingService.createBooking(bookingDTO);
        return new ResponseEntity<>(booking, HttpStatus.CREATED);
    }

    // TODO: Extension - Update passenger meal preference
    @PatchMapping
    public ResponseEntity<Booking> updateMealPreference(){
        return null;
    }

}
