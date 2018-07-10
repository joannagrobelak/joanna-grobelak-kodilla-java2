package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.product.Product;
import com.kodilla.good.patterns.food2door.supplier.Supplier;

public class OrderRetriever {

    public Order retrieve() {
        Supplier supplier = new Supplier("HealthyShop");
        Product product = new Product("artichoke", 3);

        return new Order(supplier, product);
    }
}
