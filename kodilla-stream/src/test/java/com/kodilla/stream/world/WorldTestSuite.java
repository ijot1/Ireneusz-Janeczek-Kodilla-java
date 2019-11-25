package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Country1", new BigDecimal("1111111111"));
        Country country2 = new Country("Country2", new BigDecimal("1212121212"));
        Country country3 = new Country("Country3", new BigDecimal("1313131313"));
        Country country4 = new Country("Country4", new BigDecimal("1414141414"));
        Country country5 = new Country("Country5", new BigDecimal("1515151515"));
        Country country6 = new Country("Country6", new BigDecimal("2222222222"));
        Country country7 = new Country("Country7", new BigDecimal("2121212121"));
        Country country8 = new Country("Country8", new BigDecimal("2222222222"));
        Country country9 = new Country("Country9", new BigDecimal("2323232323"));
        Country country10 = new Country("Country10", new BigDecimal("2424242424"));
        Country country11 = new Country("Country11", new BigDecimal("3333333333"));
        Country country12 = new Country("Country12", new BigDecimal("3131313131"));
        Country country13 = new Country("Country13", new BigDecimal("3232323232"));
        Country country14 = new Country("Country14", new BigDecimal("3434343434"));
        Country country15 = new Country("Country15", new BigDecimal("3535353535"));

        Continent continent1 = new Continent("Europe");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);
        continent1.addCountry(country5);

        Continent continent2 = new Continent("Afrika");
        continent2.addCountry(country6);
        continent2.addCountry(country7);
        continent2.addCountry(country8);
        continent2.addCountry(country9);
        continent2.addCountry(country10);

        Continent continent3 = new Continent("Asia");
        continent3.addCountry(country11);
        continent3.addCountry(country12);
        continent3.addCountry(country13);
        continent3.addCountry(country14);
        continent3.addCountry(country15);

        World allCountriesOfTheWorld = new World();
        allCountriesOfTheWorld.addContinent(continent1);
        allCountriesOfTheWorld.addContinent(continent2);
        allCountriesOfTheWorld.addContinent(continent3);

        //When
        BigDecimal totalPopulationOfTheWorld = allCountriesOfTheWorld.getPeopleQuantity();

        //Then

        BigDecimal expectedNumber = new BigDecimal("34545454542");
        Assert.assertEquals(totalPopulationOfTheWorld, expectedNumber);
    }
}
