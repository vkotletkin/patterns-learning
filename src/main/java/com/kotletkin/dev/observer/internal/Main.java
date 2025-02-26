package com.kotletkin.dev.observer.internal;

public class Main {
    public static void main(String[] args) {
        CatholicChurch observable = new CatholicChurch();

        observable.addPropertyChangeListener(new Parishioner("Martin Luter"));
        observable.addPropertyChangeListener(new Parishioner("Zhan Calvin"));

        observable.setNews("Church is closed.");
        observable.setNews("All died.");
    }
}
