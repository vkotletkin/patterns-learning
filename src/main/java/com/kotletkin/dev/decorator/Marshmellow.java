package com.kotletkin.dev.decorator;

public class Marshmellow extends CondimentDecorator {
    Beverage beverage;

    public Marshmellow(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Marshmellow";
    }

    @Override
    public double getCost() {
        return 0.15 + beverage.getCost();
    }
}
