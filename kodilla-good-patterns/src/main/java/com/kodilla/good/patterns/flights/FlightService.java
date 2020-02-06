package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private List<Flight> flights = new ArrayList<>();

    public List<Flight> findFlightsTo(String departure) {

        return flights
                .stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightsFrom(String arrival) {
        return flights
                .stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> findChangeFligts(String departure, String arrival, String change) {
        List<Flight> changeToDeparture = new ArrayList<>();
        List<Flight> arrivalToChange = new ArrayList<>();

        return flights
                .stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public FlightService() {
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("WRO", "WAW"));
        flights.add(new Flight("POZ", "WAW"));
        flights.add(new Flight("WAW", "KTW"));
    }
}
