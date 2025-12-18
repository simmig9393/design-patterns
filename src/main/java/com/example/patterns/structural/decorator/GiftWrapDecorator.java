package com.example.patterns.structural.decorator;

public class GiftWrapDecorator implements OrderCost {
    private final OrderCost order;

    public GiftWrapDecorator(OrderCost order) {
        this.order = order;
    }

    public double cost() {
        return order.cost() + 50;
    }
}
