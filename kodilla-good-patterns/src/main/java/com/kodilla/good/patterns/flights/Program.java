package com.kodilla.good.patterns.flights;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        List<Flight> result = flightService.findFlightsTo("WAW");
        System.out.println("fligts to: " + result);
        result = flightService.findFlightsFrom("WAW");
        System.out.println("fligts from: " + result);
        result = flightService.findChangeFligts("POZ", "KTW", "WAW");
        System.out.println("change fligts from: " + result);
    }
}
