package com.kotletkin.dev.decorator;

public class Chocolate extends CondimentDecorator {
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return 0.05 + beverage.getCost();
    }
}
