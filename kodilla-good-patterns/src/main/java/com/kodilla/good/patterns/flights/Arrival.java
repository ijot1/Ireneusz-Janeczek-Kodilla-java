package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.Objects;

public class Arrival {
    private HomeAirport homeAirport;
    private String flightFrom;
    private LocalTime arrivalTime;

    public Arrival(HomeAirport homeAirport, String flightFrom, LocalTime arrivalTime) {
        this.homeAirport = homeAirport;
        this.flightFrom = flightFrom;
        this.arrivalTime = arrivalTime;
    }

    public HomeAirport getHomeAirport() {
        return homeAirport;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arrival)) return false;
        Arrival arrival = (Arrival) o;
        return getHomeAirport().equals(arrival.getHomeAirport()) &&
                getFlightFrom().equals(arrival.getFlightFrom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeAirport(), getFlightFrom());
    }

    @Override
    public String toString() {
        return "Arrival{" +
                "name=" + homeAirport +
                ", flightFrom='" + flightFrom + '\'' +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
