package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class FoodOrderRequestRetriever {
    public FoodOrderRequest retrieve() {

        Supplier supplier = new Supplier(new ShopSuppliers(ShopSupplierChoice.menu()-1).getShopSupplier());
        Product product = new Product("Low-fat Cheddar", "kg");
        double quantity = 3.5;
        LocalDateTime date = LocalDateTime.of(2020, 1, 2, 11, 10);

        return new FoodOrderRequest(supplier, product, quantity, date);
    }
}
