package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    public void createOrder(User user, LocalDateTime date);
}
