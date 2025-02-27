package com.kotletkin.dev.singleton;

public class SingletonSimple {
    private static final SingletonSimple instance = new SingletonSimple();

    private SingletonSimple() {
    }

    public static SingletonSimple getInstance() {
        return instance;
    }
}
