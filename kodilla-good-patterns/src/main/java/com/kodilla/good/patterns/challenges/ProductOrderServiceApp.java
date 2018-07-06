package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceApp {

    public static void main(String[] agrs) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new AirplaneOrderService(),
                new AirplaneOrderRepository());

        orderProcessor.process(orderRequest);

    }
}
