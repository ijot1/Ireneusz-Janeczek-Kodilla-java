package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Flight flightTo1stDestination = new Flight("home", "Reykyavik");
        Flight flightTo2ndDestination = new Flight("home", "Heathrow");
        Flight flightTo3rdDestination = new Flight("home", "Magadan");

        FlightFinder flightFinder = new FlightFinder();

        //destination #1
        try {
            boolean outcome = flightFinder.findFlight(flightTo1stDestination);
            if (outcome) {
                System.out.println("You can flight to " + flightTo1stDestination.getArrivalAirport());
            } else {
                System.out.println(flightTo1stDestination.getArrivalAirport() + " airport is closed until further notice");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Attempt at finding flight connection from home airport\n");
        }

        //destination #2
        try {
            boolean outcome = flightFinder.findFlight(flightTo2ndDestination);
            if (outcome) {
                System.out.println("You can flight to " + flightTo2ndDestination.getArrivalAirport());
            } else {
                System.out.println(flightTo2ndDestination.getArrivalAirport() + " airport is closed until further notice");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Attempt at finding flight connection from home airport\n");
        }

        //destination #3
        try {
            boolean outcome = flightFinder.findFlight(flightTo3rdDestination);
            if (outcome) {
                System.out.println("You can flight to " + flightTo3rdDestination.getArrivalAirport());
            } else {
                System.out.println(flightTo3rdDestination.getArrivalAirport() + " airport is closed until further notice");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Attempt at finding flight connection from home airport\n");
        }
    }
}
