package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.Objects;

public class Departure {
    private HomeAirport homeAirport;
    private String flightTo;
    private LocalTime departureTime;



    public Departure(HomeAirport homeAirport, String flightTo, LocalTime departureTime) {
        this.homeAirport = homeAirport;
        this.flightTo = flightTo;
        this.departureTime = departureTime;
    }

    public HomeAirport getHomeAirport() {
        return homeAirport;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departure)) return false;
        Departure departure = (Departure) o;
        return getHomeAirport().equals(departure.getHomeAirport()) &&
                getFlightTo().equals(departure.getFlightTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeAirport(), getFlightTo());
    }

    @Override
    public String toString() {
        return "Departure{" +
                "homeAirport=" + homeAirport +
                ", flightTo='" + flightTo + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}
