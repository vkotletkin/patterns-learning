package com.kotletkin.dev.decorator;

public abstract class Beverage {
    protected String description;

    public Beverage() {
        this.description = "Unknown Beverage";
    }

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
