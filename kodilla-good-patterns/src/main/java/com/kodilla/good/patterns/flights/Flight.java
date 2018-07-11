package com.kodilla.good.patterns.flights;

import java.time.LocalDate;

public final class Flight {

    private final String departureAirport;
    private final String arrivalAirport;
    private final LocalDate dayOfService;

    public Flight(final String departureAirport, final String arrivalAirport, final LocalDate dayOfService) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.dayOfService = dayOfService;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalDate getDayOfService() {
        return dayOfService;
    }

    @Override
    public String toString() {
        return departureAirport + " - " + arrivalAirport + ", next service: " + dayOfService;
    }
}
