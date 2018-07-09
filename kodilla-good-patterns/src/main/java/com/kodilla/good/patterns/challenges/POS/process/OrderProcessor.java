package com.kodilla.good.patterns.challenges.POS.process;

import com.kodilla.good.patterns.challenges.POS.infoService.InfoService;
import com.kodilla.good.patterns.challenges.POS.orderService.OrderService;
import com.kodilla.good.patterns.challenges.POS.repository.OrderRepository;

public class OrderProcessor {

    private InfoService infoService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InfoService infoService, final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getDayAndTimeOfAcquisition());

        if(isOrdered) {
            infoService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getDayAndTimeOfAcquisition());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }

    }
}
