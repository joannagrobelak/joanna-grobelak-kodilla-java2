package com.kodilla.good.patterns.challenges.POS.process;

import com.kodilla.good.patterns.challenges.POS.product.Product;
import com.kodilla.good.patterns.challenges.POS.user.User;

import java.time.LocalDateTime;

public class ProductOrderService {

    public boolean order(final User user, final Product product, final LocalDateTime dayAndTimeOfAcquisition) {

        System.out.println("User " + user.getFirstName() + " " + user.getLastName() +
                " bought " + product.getProductName() + " (date and time of acquisition: " +
                dayAndTimeOfAcquisition + ").");
        return true;
    }
}
