package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ServiceOfOrders implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime date) {
        System.out.println("Creating order: Customer - " + user.toString() + ", Date - " + date.toString());
        return true;
    }
}
