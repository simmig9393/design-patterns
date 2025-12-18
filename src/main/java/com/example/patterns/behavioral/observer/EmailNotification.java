package com.example.patterns.behavioral.observer;

public class EmailNotification implements Observer {
    public void update(String status) {
        System.out.println("Email sent: Order status changed to " + status);
    }
}
