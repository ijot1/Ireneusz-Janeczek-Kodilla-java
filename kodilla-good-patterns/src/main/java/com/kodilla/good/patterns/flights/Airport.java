package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Airport {
    private HomeAirport homeAirport;
    TimetableDepartures departures;
    TimetableArrivals arrivals;

    public Airport(HomeAirport homeAirport, TimetableDepartures departures, TimetableArrivals arrivals) {
        this.homeAirport = homeAirport;
        this.departures = departures;
        this.arrivals = arrivals;
    }

    public HomeAirport getHomeAirport() {
        return homeAirport;
    }

    public TimetableDepartures getDepartures() {
        return departures;
    }

    public TimetableArrivals getArrivals() {
        return arrivals;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return getHomeAirport().equals(airport.getHomeAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeAirport());
    }

    @Override
    public String toString() {
        return "Airport{" +
                "homeAirport=" + homeAirport +
                ", departures=" + departures +
                ", arrivals=" + arrivals +
                '}';
    }
}
