package com.example.patterns;

import com.example.patterns.creational.builder.Order;
import com.example.patterns.creational.factory.Payment;
import com.example.patterns.creational.factory.PaymentFactory;
import com.example.patterns.creational.singleton.AppConfig;
import com.example.patterns.structural.adapter.*;
import com.example.patterns.structural.decorator.*;
import com.example.patterns.structural.facade.OrderFacade;
import com.example.patterns.behavioral.strategy.*;
import com.example.patterns.behavioral.observer.*;
import com.example.patterns.behavioral.command.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Singleton ===");
        AppConfig config = AppConfig.getInstance();
        System.out.println("App Name: " + config.getAppName());

        System.out.println("\n=== Factory ===");
        Payment payment = PaymentFactory.createPayment("CARD");
        payment.pay(1000);

        System.out.println("\n=== Builder ===");
        Order order = new Order.Builder()
                .product("Laptop")
                .quantity(1)
                .giftWrap(true)
                .build();
        System.out.println(order);

        System.out.println("\n=== Strategy ===");
        PricingService pricing = new PricingService();
        pricing.setStrategy(new SeasonalDiscount());
        System.out.println("Discounted price: " + pricing.calculate(1000));

        System.out.println("\n=== Observer ===");
        OrderStatusService statusService = new OrderStatusService();
        stat
