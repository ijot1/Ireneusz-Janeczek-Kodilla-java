package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("Carlo", "Rossi");

        LocalDateTime date = LocalDateTime.of(2020, 2, 2, 10, 0);

        return new OrderRequest(user, date);
    }
}
