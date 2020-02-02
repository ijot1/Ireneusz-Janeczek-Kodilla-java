package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public interface FoodOrderRepository {
    public void createOrder(Supplier supplier, FoodOrderDTO foodOrderDTO, LocalDateTime date);
}
