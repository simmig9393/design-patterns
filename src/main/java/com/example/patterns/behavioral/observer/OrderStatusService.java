package com.example.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusService {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void updateStatus(String status) {
        observers.forEach(o -> o.update(status));
    }
}
