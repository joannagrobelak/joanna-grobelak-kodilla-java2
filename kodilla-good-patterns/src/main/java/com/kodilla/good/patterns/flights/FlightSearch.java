package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    AvailableFlights availableFlights = new AvailableFlights();

    public void findFlightFrom(String departureAirport) {

        List<Flight>  flightsFromChosenAirport = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        if(flightsFromChosenAirport.size() > 0) {
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

        if(flightsToChosenAirport.size() > 0) {
            System.out.println("\nAvailable direct flights to " + arrivalAirport + ": \n");
            flightsToChosenAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("There aren't any flights to " + arrivalAirport + " airport.");
        }

    }

    public void findConnectingFlight(String departureAirport, String transferAirport, String arrivalAirport) {

        List<Flight> flightsFromChosenAirportToChosenTransferAirport = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departureAirport))
                .filter(flights -> flights.getArrivalAirport().equals(transferAirport))
                .collect(Collectors.toList());

        List<Flight> flightsFromChosenTranserAirportToFinalDestionation = availableFlights.getListOfFlights().stream()
                .filter(flights -> flights.getDepartureAirport().equals(transferAirport))
                .filter(flights -> flights.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        if(flightsFromChosenAirportToChosenTransferAirport.size() == 1
                && flightsFromChosenTranserAirportToFinalDestionation.size() == 1) {
            System.out.println("\nChosen connecting flight " + departureAirport + " - " + transferAirport + " - " +
            arrivalAirport + " is available.");
        } else {
            System.out.println("\nChosen connecting flight " + departureAirport + " - " + transferAirport + " - " +
                    arrivalAirport + " is not available.");
        }

    }
}
