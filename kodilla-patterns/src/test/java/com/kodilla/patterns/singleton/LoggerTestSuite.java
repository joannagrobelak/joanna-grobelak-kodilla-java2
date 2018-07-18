package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeClass
    public static void createLog() {
        logger.getInstance().log("anything");
    }
    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getInstance().getLastLog();
        System.out.println("last log is: " + lastLog);
        //Then
        Assert.assertEquals("anything", lastLog);

    }
}
