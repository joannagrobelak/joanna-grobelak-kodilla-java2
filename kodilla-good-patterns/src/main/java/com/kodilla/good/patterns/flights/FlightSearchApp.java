package com.kodilla.good.patterns.flights;

public class FlightSearchApp {

    public static void main(String[]  args) {

        FlightSearch flightSearch = new FlightSearch();

        flightSearch.findFlightFrom("Wrocław");
        flightSearch.findFlightTo("Wrocław");
        flightSearch.findConnectingFlight("Wrocław", "Lublin", "Gdańsk");
        flightSearch.findConnectingFlight("Kraków", "Katowice", "Wrocław");

    }

}
