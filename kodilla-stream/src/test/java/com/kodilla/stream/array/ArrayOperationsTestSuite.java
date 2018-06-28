package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int [] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};

        //When
        double testAverage = ArrayOperations.getAverage(numbers);

        //Then
        int sumOfNumbers = 0;
        for(int number : numbers) {
            sumOfNumbers = sumOfNumbers + number;
        }
        double averageOfNumbers = (double)sumOfNumbers / numbers.length;
        Assert.assertEquals(averageOfNumbers, testAverage, 0);
    }
}
