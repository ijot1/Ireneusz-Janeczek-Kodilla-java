package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.Objects;

public class AirLinkRequestDTO {
    private HomeAirport homeAirport;
    private Service service;
    private LocalTime time;
    private boolean isOrdered;

    public AirLinkRequestDTO(HomeAirport homeAirport, Service service, LocalTime time, boolean isOrdered) {
        this.homeAirport = homeAirport;
        this.service = service;
        this.time = time;
        this.isOrdered = isOrdered;
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

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirLinkRequestDTO)) return false;
        AirLinkRequestDTO that = (AirLinkRequestDTO) o;
        return getHomeAirport().equals(that.getHomeAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeAirport());
    }

    @Override
    public String toString() {
        return "AirLinkRequestDTO{" +
                "name=" + homeAirport +
                ", service=" + service +
                ", time=" + time +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
