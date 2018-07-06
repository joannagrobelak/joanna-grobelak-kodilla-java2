package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Anna", "Kowalska");
        Product product = new Product("a jet");
        LocalDateTime dayAndTimeOfAcquisition = LocalDateTime.of(2018,7,6,12,24);

        return new OrderRequest(user, product, dayAndTimeOfAcquisition);
    }
}
