package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class InfoOrderFoodService implements InfoOrderService {

    public void inform(Supplier supplier) {
        System.out.println("Mail to: " + supplier.toString() + "\n" + "Your order is registered.\n");
    }
}