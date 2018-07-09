package com.kodilla.good.patterns.challenges.POS.orderService;

import com.kodilla.good.patterns.challenges.POS.orderService.OrderService;
import com.kodilla.good.patterns.challenges.POS.product.Product;
import com.kodilla.good.patterns.challenges.POS.user.User;

import java.time.LocalDateTime;

public class AirplaneOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime dayAndTimeOfAcquisition) {
        return true;
    }
}
