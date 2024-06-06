package com.example.airline_api.models;

import java.util.List;

public class PassengerDTO {

    private     String          name;
    private     String          email;
    private     List<Booking>   bookings;

    public PassengerDTO(String name, String email, List<Booking> bookings) {
        this.name = name;
        this.email = email;
        this.bookings = bookings;
    }

    public PassengerDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
