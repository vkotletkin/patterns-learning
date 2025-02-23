package com.kotletkin.dev.strategy.human;

import com.kotletkin.dev.strategy.WeaponBehavior;

public class HitHuman implements WeaponBehavior {
    @Override
    public void doHit() {
        System.out.println("I am hit - Human.");
    }
}
