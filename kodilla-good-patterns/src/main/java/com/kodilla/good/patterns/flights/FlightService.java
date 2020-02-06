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
        //                                        "POZ",            "KTW",         "WAW");
        List<Flight> changeFlights = new ArrayList<>();

        changeFlights.addAll(flights
                .stream()
                .filter(f -> f.getDeparture().equals(change))
                .collect(Collectors.toList()));

        changeFlights.addAll(flights
                .stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList()));

        changeFlights.addAll(flights
                .stream()
                .filter(f -> {
                    return f.getArrival().equals(arrival);
                })
                .collect(Collectors.toList()));

        return changeFlights;
    }

    public FlightService() {
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("WRO", "WAW"));
        flights.add(new Flight("POZ", "WAW"));
        flights.add(new Flight("WAW", "KTW"));
    }
}
