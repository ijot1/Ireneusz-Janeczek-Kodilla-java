package com.kodilla.stream.world;

import java.util.*;

public class Continent {
    private final String continent;
    private final Set<Country> countrySet = new HashSet<Country>();

    public Continent(String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country){
        countrySet.add(country);
    }

    public String getContinent() {
        return continent;
    }

    public Set<Country> getCountrySet() {
        return countrySet;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                ", countrySet=" + countrySet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent1 = (Continent) o;
        return continent.equals(continent1.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continent);
    }
}
