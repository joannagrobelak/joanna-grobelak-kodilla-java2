package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.POS.infoService.MailService;
import com.kodilla.good.patterns.challenges.POS.orderService.AirplaneOrderService;
import com.kodilla.good.patterns.challenges.POS.process.OrderProcessor;
import com.kodilla.good.patterns.challenges.POS.process.OrderRequest;
import com.kodilla.good.patterns.challenges.POS.process.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.POS.repository.AirplaneOrderRepository;

public class ProductOrderServiceApp {

    public static void main(String[] agrs) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new AirplaneOrderService(),
                new AirplaneOrderRepository());

        orderProcessor.process(orderRequest);

    }
}
