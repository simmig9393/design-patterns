package com.example.patterns.behavioral.strategy;

public class SeasonalDiscount implements DiscountStrategy {
    public double apply(double price) {
        return price * 0.9;
    }
}
