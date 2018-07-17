package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(10, 2);
        double subResult = calculator.sub(10, 2);
        double mulResult = calculator.mul(10, 2);
        double divResult = calculator.div(10, 2);
        //Then
        Assert.assertEquals(12, addResult, 0);
        Assert.assertEquals(8, subResult, 0);
        Assert.assertEquals(20, mulResult, 0);
        Assert.assertEquals(5, divResult, 0);
    }
}
