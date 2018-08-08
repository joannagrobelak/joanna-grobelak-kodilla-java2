package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame seed bun")
                .burgers(1)
                .sauce("BBQ")
                .ingredient("cheese")
                .ingredient("lettuce")
                .ingredient("pickles")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, numberOfIngredients);
    }
}
