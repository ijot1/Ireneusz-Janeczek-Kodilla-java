package com.kodilla.good.patterns.food.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopSuppliers {
    public static final List<String> suppliersList = Arrays.asList("ExtraFoodShop", "HealthyShop", "GlutenFreeShop");
    private int index;

    public ShopSuppliers(int index) {
        this.index = index;
    }

    public String getShopSupplier() {
        if (index >= 0 && index < suppliersList.size()) {
            return suppliersList.get(index);
        } else {
            return "There is no such supplier in our supply chain";
        }
    }
}
