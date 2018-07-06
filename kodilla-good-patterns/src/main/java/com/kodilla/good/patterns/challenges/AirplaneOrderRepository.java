package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class AirplaneOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime dayAndTimeOfAcquisition) {
        return true;
    }
}
