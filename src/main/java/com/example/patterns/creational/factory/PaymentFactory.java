package com.example.patterns.creational.factory;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        return switch (type) {
            case "CARD" -> new CreditCardPayment();
            case "UPI" -> new UpiPayment();
            default -> throw new IllegalArgumentException("Invalid payment type");
        };
    }
}
