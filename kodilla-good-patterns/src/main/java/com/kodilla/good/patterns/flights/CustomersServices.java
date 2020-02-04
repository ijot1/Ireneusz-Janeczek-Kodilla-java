package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.List;

public class CustomersServices {
    public static final List<String> suppliersList = Arrays.asList("Departures", "Arrivals", "ChangeLinks");
    private int index;

    public CustomersServices(int index) {
        this.index = index;
    }

    public String getCustomerService() {
        if (index >= 0 && index < suppliersList.size()) {
            return suppliersList.get(index);
        } else {
            return "There is no such service";
        }
    }
}
