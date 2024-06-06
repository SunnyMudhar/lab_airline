package com.example.airline_api.models;

public class BookingDTO {

    private     Flight      flight;
    private     Passenger   passenger;
    private     int         seatNumber;
    private     String      mealPreference;

    public BookingDTO(Flight flight, Passenger passenger, int seatNumber, String mealPreference) {
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.mealPreference = mealPreference;
    }

    public BookingDTO() {
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMealPreference() {
        return mealPreference;
    }

    public void setMealPreference(String mealPreference) {
        this.mealPreference = mealPreference;
    }
}
