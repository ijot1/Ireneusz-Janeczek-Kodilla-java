package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.Objects;

public class TimetableArrivals {

    private ArrayList<Arrival> timetableArrivals = new ArrayList<>();

    public TimetableArrivals(ArrayList<Arrival> timetableArrivals) {
        this.timetableArrivals = timetableArrivals;
    }

    public void addArrival(Arrival arrival) {
        timetableArrivals.add(arrival);
    }

    public ArrayList<Arrival> getTimetableArrivals() {
        return timetableArrivals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimetableArrivals)) return false;
        TimetableArrivals that = (TimetableArrivals) o;
        return getTimetableArrivals().equals(that.getTimetableArrivals());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimetableArrivals());
    }

    @Override
    public String toString() {
        return "TimetableArrivals{" +
                "timetableArrivals=" + timetableArrivals +
                '}';
    }
}
