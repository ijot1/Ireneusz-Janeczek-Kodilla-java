package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

//Getting data to application, -> next approach: Controller
public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("Carlo", "Rossi");

        LocalDateTime date = LocalDateTime.of(2020, 2, 2, 10, 0);

        return new OrderRequest(user, date);
    }
}
