package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithHamMushroomsExtraCheeseGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(23), thePrice);
    }

    @Test
    public void testPizzaWithHamMushroomsExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        //When
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals("ingredients of ordered pizza: tomato sauce, cheese, mushrooms, ham + extra cheese", theDescription);
    }
}
