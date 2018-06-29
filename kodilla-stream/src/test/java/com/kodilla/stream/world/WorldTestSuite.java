package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Continent> world = new ArrayList<>();
        List<Country> europe = new ArrayList<>();
        List<Country> southAmerica = new ArrayList<>();
        List<Country> atlantis = new ArrayList<>();

        europe.add(new Country("Poland", new BigDecimal("38000000")));
        europe.add(new Country("Catalonia", new BigDecimal("7000000")));
        europe.add(new Country("Kosovo",new BigDecimal("2000000")));

        southAmerica.add(new Country("Mexico", new BigDecimal("125000000")));
        southAmerica.add(new Country("Argentina", new BigDecimal("44000000")));
        southAmerica.add(new Country("San Escobar", new BigDecimal("20000000")));

        atlantis.add(new Country("Atlantis", new BigDecimal("1000000")));

        world.add(new Continent(europe));
        world.add(new Continent(southAmerica));
        world.add(new Continent(atlantis));

        //When
        World theWorld = new World(world);
        BigDecimal totalPopulation = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("237000000");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }

}
