package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class ServiceOfFoodOrders implements FoodOrderOperation {


    @Override
    public boolean order(Supplier supplier, LocalDateTime date) {
        System.out.println("Creating order: Supplier - " + supplier.toString() + ", Date - " + date.toString()+ "\n");
        return true;
    }
}
