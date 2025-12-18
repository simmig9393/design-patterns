package com.example.patterns.structural.adapter;

import com.example.patterns.creational.factory.Payment;

public class PaymentAdapter implements Payment {
    private final LegacyPaymentGateway legacy;

    public PaymentAdapter(LegacyPaymentGateway legacy) {
        this.legacy = legacy;
    }

    public void pay(double amount) {
        legacy.makePayment(amount);
    }
}
