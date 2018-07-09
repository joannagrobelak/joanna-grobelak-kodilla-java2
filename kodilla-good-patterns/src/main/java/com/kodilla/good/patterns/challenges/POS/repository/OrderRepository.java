package com.kodilla.good.patterns.challenges.POS.repository;

import com.kodilla.good.patterns.challenges.POS.product.Product;
import com.kodilla.good.patterns.challenges.POS.user.User;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, Product product, LocalDateTime dayAndTimeOfAcquisition);

}
