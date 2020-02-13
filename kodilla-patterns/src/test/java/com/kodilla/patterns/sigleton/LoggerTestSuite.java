package com.kodilla.patterns.sigleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("NiceGuy");
        //Then
        Assert.assertEquals("NiceGuy", logger.getLastLog());
    }
}
