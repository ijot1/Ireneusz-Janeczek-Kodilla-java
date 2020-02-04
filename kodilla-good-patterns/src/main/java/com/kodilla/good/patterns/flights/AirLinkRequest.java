package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.Objects;

public class AirLinkRequest {
    private HomeAirport homeAirport;
    private Service service;
    private LocalTime time;

    public AirLinkRequest(HomeAirport homeAirport, Service service, LocalTime time) {
        this.homeAirport = homeAirport;
        this.service = service;
        this.time = time;
    }

    public HomeAirport getHomeAirport() {
        return homeAirport;
    }

    public Service getService() {
        return service;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirLinkRequest)) return false;
        AirLinkRequest that = (AirLinkRequest) o;
        return getHomeAirport().equals(that.getHomeAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeAirport());
    }

    @Override
    public String toString() {
        return "AirLinkRequest{" +
                "name=" + homeAirport +
                ", service=" + service +
                ", time=" + time +
                '}';
    }
}
