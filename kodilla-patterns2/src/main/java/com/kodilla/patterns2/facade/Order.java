package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {
    private ProductService productService;
    private final List<Item> items = new ArrayList<>();
    private Long orderId;
    private Long userId;
    boolean isPaid = false;
    boolean isVerified = false;
    boolean isSubmitted = false;

    public Order(ProductService productService, Long orderId, Long userId) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }

    BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(productService.getPrice(item.getProductId()))
                    .multiply(new BigDecimal(item.getQty()));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
