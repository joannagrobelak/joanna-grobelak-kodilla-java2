package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: start");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator testExt1 = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> testCaseEmptyList = testExt1.exterminate(numbers);
        if(testCaseEmptyList.size() == 0) {
            System.out.println("Test \"testOddNumbersExterminatorEmptyList\" ok");
        } else {
            System.out.println("Test \"testOddNumbersExterminatorEmptyList\" failed!");
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator testExt2 = new OddNumbersExterminator();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> testCaseNormalList = testExt2.exterminate(numbers);
        for(Integer testValue : testCaseNormalList) {
            if(testValue % 2 != 0) {
                System.out.println("Test \"testOddNumbersExterminatorNormalList\" failed!");
            } else {
                System.out.println("Tested value: ok");
            }
        }

    }
}
