package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class RepositoryOfFoodOrders implements FoodOrderRepository {

    @Override
    public void createOrder(Supplier supplier, FoodOrderDTO foodOrderDTO, LocalDateTime date) {
        System.out.println("Order by: " + supplier.toString() + "; \nOrdered product: " + foodOrderDTO.toString() + "; date " + date.toString());
    }
}
