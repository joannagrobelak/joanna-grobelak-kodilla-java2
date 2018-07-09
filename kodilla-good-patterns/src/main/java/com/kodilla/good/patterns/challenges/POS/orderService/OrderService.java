package com.kodilla.good.patterns.challenges.POS.orderService;

import com.kodilla.good.patterns.challenges.POS.product.Product;
import com.kodilla.good.patterns.challenges.POS.user.User;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, Product product, LocalDateTime dayAndTimeOfAcquisition);

}
