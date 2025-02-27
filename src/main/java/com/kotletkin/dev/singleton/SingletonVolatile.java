package com.kotletkin.dev.singleton;

public class SingletonVolatile {
    private static volatile SingletonVolatile instance;

    private SingletonVolatile() {
    }

    public static SingletonVolatile getInstance() {
        if (instance == null) {
            synchronized (SingletonVolatile.class) {
                if (instance == null) {
                    instance = new SingletonVolatile();
                }
            }
        }
        return instance;
    }
}
