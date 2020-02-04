package com.kodilla.good.patterns.flights;

public class Service {
    private String service;

    public Service(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Service{" +
                "service='" + service + '\'' +
                '}';
    }
}
