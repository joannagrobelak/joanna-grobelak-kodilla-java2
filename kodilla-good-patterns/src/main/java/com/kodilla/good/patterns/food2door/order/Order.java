package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.product.Product;
import com.kodilla.good.patterns.food2door.supplier.Supplier;

public class Order {

    private Supplier supplier;
    private Product product;

    public Order(final Supplier supplier, final Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
