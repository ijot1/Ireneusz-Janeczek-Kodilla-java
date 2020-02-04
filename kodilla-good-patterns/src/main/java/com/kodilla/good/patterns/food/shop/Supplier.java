package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class Supplier implements SupplierProcess{
    private String name;

    @Override
    public FoodOrderDTO process(FoodOrderRequest foodOrderRequest) {
        Supplier supplier = foodOrderRequest.getSupplier();
        Product product = foodOrderRequest.getProduct();
        double quantity = foodOrderRequest.getQuantity();
        LocalDateTime date = foodOrderRequest.getDate();
        boolean isOrdered = true;

        return new FoodOrderDTO(supplier, product, quantity, date, true);
    }

    public Supplier(String name, FoodOrderDTO foodOrderDTO) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Supplier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                '}';
    }
}
