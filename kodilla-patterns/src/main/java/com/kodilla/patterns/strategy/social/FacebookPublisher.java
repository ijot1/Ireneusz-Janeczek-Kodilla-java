package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook";
    }
}
