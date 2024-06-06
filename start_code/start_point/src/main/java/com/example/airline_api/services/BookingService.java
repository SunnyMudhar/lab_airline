package com.example.airline_api.services;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.BookingDTO;
import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    PassengerService passengerService;

    @Autowired
    FlightService flightService;

    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> findSingleBooking(Long id) {
        return bookingRepository.findById(id);
    }

    public Booking createBooking(BookingDTO bookingDTO) {
        Passenger passenger = passengerService.findSinglePassenger(bookingDTO.getPassenger().getId()).get();
        Flight flight = flightService.findSingleFlight(bookingDTO.getFlight().getId()).get();
        Booking booking = new Booking(
                flight,
                passenger,
                bookingDTO.getSeatNumber()
                //bookingDTO.getMealPreference()
        );
        saveBooking(booking);
        return booking;
    }
}
