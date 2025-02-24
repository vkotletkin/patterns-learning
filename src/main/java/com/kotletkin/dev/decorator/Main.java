package com.kotletkin.dev.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Marshmellow(espresso);
        espresso = new Chocolate(espresso);
        System.out.println(espresso.getDescription() + ". Price: " + espresso.getCost());
    }
}
