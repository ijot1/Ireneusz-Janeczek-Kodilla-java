package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class FoodOrderDTO {
    public Supplier supplier;
    public Product product;
    public double quantity;
    public LocalDateTime date;
    public boolean isOrdered;

    public FoodOrderDTO(Supplier supplier, Product product, double quantity, LocalDateTime date, boolean isOrdered) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "FoodOrderDTO{" +
                "supplier=" + supplier +
                ", product=" + product +
                ", quantity=" + quantity +
                ", date=" + date +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
