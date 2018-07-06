package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class AirplaneOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime dayAndTimeOfAcquisition) {
        return true;
    }
}
