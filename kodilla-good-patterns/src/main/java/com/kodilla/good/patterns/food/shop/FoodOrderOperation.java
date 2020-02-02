package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public interface FoodOrderOperation {
    public boolean order(Supplier supplier, LocalDateTime date);
}
