package com.kodilla.good.patterns.food.shop;

public class Product {
    private String product;
    private String unit;

    public Product(String product, String unit) {
        this.product = product;
        this.unit = unit;
    }

    public String getProduct() {
        return product;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
