package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.process.OrderProcessor;

public class OrderExecutor {

    private OrderProcessor orderProcessor;

    public OrderExecutor(final OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public OrderDto execute(final Order order) {
        boolean isOrdered = orderProcessor.process();
        if(isOrdered) {
            return new OrderDto(order.getSupplier(), true);
        } else {
            return new OrderDto(order.getSupplier(), false);
        }
    }
}
