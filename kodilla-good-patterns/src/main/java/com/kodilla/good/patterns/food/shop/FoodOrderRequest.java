package com.kodilla.good.patterns.food.shop;

import java.time.LocalDateTime;

public class FoodOrderRequest {
    private Supplier supplier;
    private Product product;
    private double quantity;
    private LocalDateTime date;

    public FoodOrderRequest(Supplier supplier, Product product, double quantity, LocalDateTime date) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public Supplier getSupplier() { return supplier; }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "FoodOrderRequest{" +
                "supplier=" + supplier +
                ", product=" + product +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}

