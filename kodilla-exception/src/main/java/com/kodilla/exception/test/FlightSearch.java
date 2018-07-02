package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Wrocław", true);
        airports.put("Sevilla", true);
        airports.put("Praha", true);
        airports.put("Carcassonne", false);
        airports.put("Faro", true);
        airports.put("Radom", false);

        if(!airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Route not found.");
        } else {
            boolean destinationAvailable = airports.get(flight.getArrivalAirport());
            if(destinationAvailable) {
                System.out.println("Chosen flight is available. Click the green button and check for details.");
            } else {
                System.out.println("Chosen flight is not available. Try another destination.");
            }
        }


    }
}
