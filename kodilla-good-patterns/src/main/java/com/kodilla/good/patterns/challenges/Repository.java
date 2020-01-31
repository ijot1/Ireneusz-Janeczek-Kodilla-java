package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Repository implements OrderRepository {

    @Override
    public void createOrder(User user, LocalDateTime date) {
        System.out.println("Order by" + user.getName() + " " + user.getSurname() + "; " + "date " + date.toString());
    }
}
