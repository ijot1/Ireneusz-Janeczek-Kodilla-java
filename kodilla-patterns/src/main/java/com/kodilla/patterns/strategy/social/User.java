package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.SocialPublisher;

public class User {
    String name;
    SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String publish() {
        return socialPublisher.share();
    }

    public void sharePost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
