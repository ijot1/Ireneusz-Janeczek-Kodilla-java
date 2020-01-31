package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<String, Boolean>();
        flights.put("Heathrow", true);
        flights.put("Beijing Capital", true);
        flights.put("Dolpa", false);
        flights.put("Berlin Tegel", true);
        flights.put("Munich", true);
        flights.put("Oslo", true);
        flights.put("Helsinki Malmi", false);
        flights.put("Klagenfurt", true);
        flights.put("Magadan", false);

        boolean searchOutcome = false;

        if (flights.containsKey(flight.getArrivalAirport())) {
            searchOutcome = flights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("There is no such airport on our list");
        }
        return searchOutcome;
    }
}
