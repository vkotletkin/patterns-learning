package com.kotletkin.dev.observer;

public class Main {
    public static void main(String[] args) {
        MissleDetector missleDetector = new MissleDetector();

        Observer headquarters = new Headquarters(missleDetector);
        Observer rocketShield = new RocketShield(missleDetector);

        missleDetector.setData("Storm Shadow", "56.12", "42.42");
        missleDetector.setData("Caliber", "12.32", "42.41");
    }
}
