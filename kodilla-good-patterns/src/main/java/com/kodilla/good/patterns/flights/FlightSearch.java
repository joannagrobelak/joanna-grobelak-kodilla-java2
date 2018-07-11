package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightSearch {

    private static final int NO_FLIGHTS = 0;

    AvailableFlights availableFlights = new AvailableFlights();

    public void findFlightFrom(String departureAirport) {

        List<Flight>  flightsFromChosenAirport = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        if(flightsFromChosenAirport.size() > NO_FLIGHTS) {
            System.out.println("Available direct flights from " + departureAirport + ": \n");
            flightsFromChosenAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("There aren't any flights from " + departureAirport + " airport.");
        }

    }

    public void findFlightTo(String arrivalAirport) {

        List<Flight> flightsToChosenAirport = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        if(flightsToChosenAirport.size() > NO_FLIGHTS) {
            System.out.println("\nAvailable direct flights to " + arrivalAirport + ": \n");
            flightsToChosenAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("There aren't any flights to " + arrivalAirport + " airport.");
        }

    }

    public void findConnectingFlight(String departureAirport, String transferAirport, String arrivalAirport) {

        Optional<Flight> fromDepartureToTransfer = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .filter(flights -> flights.getArrivalAirport().equals(transferAirport))
                .findAny();

        Optional<Flight> fromTransferToArrival = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(transferAirport))
                .filter(flights -> flights.getArrivalAirport().equals(arrivalAirport))
                .findAny();

        if(fromDepartureToTransfer.isPresent() && fromTransferToArrival.isPresent()) {
            System.out.println("\nChosen connecting flight " + departureAirport + " - " + transferAirport + " - " +
            arrivalAirport + " is available.");
        } else {
            System.out.println("\nChosen connecting flight " + departureAirport + " - " + transferAirport + " - " +
                    arrivalAirport + " is not available.");
        }

    }
}
