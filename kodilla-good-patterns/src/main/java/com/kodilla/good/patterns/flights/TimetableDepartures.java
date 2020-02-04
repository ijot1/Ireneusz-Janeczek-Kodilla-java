package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Objects;

public class TimetableDepartures {
    private ArrayList<Departure> timetableDepartures = new ArrayList<>();

    public TimetableDepartures(ArrayList<Departure> timetableDepartures) {
        this.timetableDepartures = timetableDepartures;
    }

    public void addDeparture(Departure departure) {
        timetableDepartures.add(departure);
    }

    public ArrayList<Departure> getTimetableDepartures() {
        return timetableDepartures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimetableDepartures)) return false;
        TimetableDepartures that = (TimetableDepartures) o;
        return getTimetableDepartures().equals(that.getTimetableDepartures());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimetableDepartures());
    }

    @Override
    public String toString() {
        return "TimetableDepartures{" +
                "timetableDepartures=" + timetableDepartures +
                '}';
    }
}
