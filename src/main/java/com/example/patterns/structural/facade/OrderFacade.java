package com.example.patterns.structural.facade;

public class OrderFacade {
    public void placeOrder() {
        System.out.println("Validating order");
        System.out.println("Processing payment");
        System.out.println("Shipping order");
    }
}
