package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.SocialPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User david = new Millenials("David Columbo");
        User carl = new YGeneration("Carl Hackelberry");
        User james = new ZGeneration("James Bond");

        //When
        String davidPublication = david.publish();
        String carlPublication = carl.publish();
        String jamesPublication = james.publish();

        //Then
        Assert.assertEquals("Facebook", davidPublication);
        Assert.assertEquals("Twitter", carlPublication);
        Assert.assertEquals("Snapchat", jamesPublication);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User david = new Millenials("David Columbo");

        //When
        david.sharePost(new SnapchatPublisher());
        String davidPublication = david.publish();

        //Then
        Assert.assertEquals("Snapchat", davidPublication);
    }
}
