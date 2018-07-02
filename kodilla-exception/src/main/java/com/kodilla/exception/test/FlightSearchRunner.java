package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Wrocław", "Sevilla");
        Flight flight2 = new Flight("Praha", "Radom");
        Flight flight3 = new Flight("Centralny Port Komunikacyjny", "Faro");

        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found! Check for another departure and / or arrival airport.");
        } finally {
            System.out.println("Search completed. Enter departure airport and destination to search again.\n");
        }

        try {
            flightSearch.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found! Check for another departure and / or arrival airport.");
        } finally {
            System.out.println("Search completed. Enter departure airport and destination to search again.\n");
        }

        try {
            flightSearch.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found! Check for another departure and / or arrival airport.");
        } finally {
            System.out.println("Search completed. Enter departure airport and destination to search again.\n");
        }

    }

}
