package com.kotletkin.dev.decorator;

public class Milkshake extends Beverage {
    public Milkshake() {
        description = "Milkshake";
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}
