package com.example.patterns.structural.adapter;

public class LegacyPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Legacy Gateway");
    }
}
