package com.example.patterns.creational.builder;

public class Order {
    private final String product;
    private final int quantity;
    private final boolean giftWrap;

    private Order(Builder builder) {
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.giftWrap = builder.giftWrap;
    }

    public static class Builder {
        private String product;
        private int quantity;
        private boolean giftWrap;

        public Builder product(String product) {
            this.product = product;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public String toString() {
        return "Order{product='" + product + "', quantity=" + quantity +
                ", giftWrap=" + giftWrap + "}";
    }
}
