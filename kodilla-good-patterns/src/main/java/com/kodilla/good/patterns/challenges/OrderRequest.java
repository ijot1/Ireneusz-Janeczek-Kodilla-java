package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime date;

    public OrderRequest(final User user, final LocalDateTime date) {
        this.user = user;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
