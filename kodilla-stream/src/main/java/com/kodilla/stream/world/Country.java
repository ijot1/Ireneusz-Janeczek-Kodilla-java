package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final String country;
    private final BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return country.equals(country1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}
