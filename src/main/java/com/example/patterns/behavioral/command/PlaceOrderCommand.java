package com.example.patterns.behavioral.command;

public class PlaceOrderCommand implements Command {
    public void execute() {
        System.out.println("Order has been placed successfully");
    }
}
