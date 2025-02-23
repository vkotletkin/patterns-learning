package com.kotletkin.dev.strategy.skeleton;

import com.kotletkin.dev.strategy.WeaponBehavior;

public class HitSkeleton implements WeaponBehavior {
    @Override
    public void doHit() {
        System.out.println("HitSkeleton");
    }
}
