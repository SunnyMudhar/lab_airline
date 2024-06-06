package com.example.airline_api.comoponents;

import com.example.airline_api.models.Booking;
import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Flight bhxToAms = new Flight("Amsterdam", 100, "07/06/2024", "18:00");
        flightService.saveFlight(bhxToAms);
        Passenger sunny = new Passenger("Sunny", "sunny@sunny.com");
        passengerService.savePassenger(sunny);
        Booking booking1 = new Booking(bhxToAms, sunny, 20);
        bookingRepository.save(booking1);

        Flight manToKef = new Flight("Iceland", 50, "21/07/2024", "08:00");
        flightService.saveFlight(manToKef);
        Passenger joe = new Passenger("Joe", "joe@joe.com");
        passengerService.savePassenger(joe);
        Passenger reece = new Passenger("Reece", "reece@reece.com");
        passengerService.savePassenger(reece);
        Passenger adam = new Passenger("Adam", "adam@adam.com");
        passengerService.savePassenger(adam);
        Booking booking2 = new Booking(manToKef, joe, 1);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking(manToKef, reece, 23);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking(manToKef, adam, 3);
        bookingRepository.save(booking4);
    }
}
