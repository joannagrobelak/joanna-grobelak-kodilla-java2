package com.kodilla.good.patterns.challenges.POS.process;

import com.kodilla.good.patterns.challenges.POS.process.OrderRequest;
import com.kodilla.good.patterns.challenges.POS.product.Product;
import com.kodilla.good.patterns.challenges.POS.user.User;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Anna", "Kowalska");
        Product product = new Product("a jet");
        LocalDateTime dayAndTimeOfAcquisition = LocalDateTime.of(2018,7,6,12,24);

        return new OrderRequest(user, product, dayAndTimeOfAcquisition);
    }
}
