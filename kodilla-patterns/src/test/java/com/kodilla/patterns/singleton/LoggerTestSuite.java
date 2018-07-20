package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("anything");
    }
    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("last log is: " + lastLog);
        //Then
        Assert.assertEquals("anything", lastLog);

    }
}
