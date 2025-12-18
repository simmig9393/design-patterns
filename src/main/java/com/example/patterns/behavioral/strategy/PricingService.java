package com.example.patterns.behavioral.strategy;

public class PricingService {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double price) {
        return strategy.apply(price);
    }
}
