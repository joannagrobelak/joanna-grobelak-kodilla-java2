package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    private static int counter = 0;

    @Before
    public void before() {
        counter++;
        System.out.println("Test Case " + counter + ": start");
    }

    @After
    public void after() {
        System.out.println("Test Case " + counter + ": end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //given

        OddNumbersExterminator testExt1 = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //when

        ArrayList<Integer> testCaseEmptyList = testExt1.exterminate(numbers);

        //then

        Assert.assertEquals(0, testCaseEmptyList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //given

        OddNumbersExterminator testExt2 = new OddNumbersExterminator();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        //when

        ArrayList<Integer> testCaseNormalList = testExt2.exterminate(numbers);

        //then

        for(Integer testValue : testCaseNormalList) {
            Assert.assertEquals(testValue % 2, 0);
        }

    }
}
