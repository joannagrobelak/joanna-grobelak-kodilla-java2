package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime dayAndTimeOfAcquisition;

    public OrderRequest(final User user, final Product product, final LocalDateTime dayAndTimeOfAcquisition) {
        this.user = user;
        this.product = product;
        this.dayAndTimeOfAcquisition = dayAndTimeOfAcquisition;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDayAndTimeOfAcquisition() {
        return dayAndTimeOfAcquisition;
    }
}
