package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class HomeAirport {
    private String homeAirport;

    public HomeAirport(String homeAirport) {
        this.homeAirport = homeAirport;
    }

    public String getHomeAirport() {
        return homeAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeAirport)) return false;
        HomeAirport that = (HomeAirport) o;
        return getHomeAirport().equals(that.getHomeAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeAirport());
    }

    @Override
    public String toString() {
        return "HomeAirport{" +
                "homeAirport='" + homeAirport + '\'' +
                '}';
    }
}
