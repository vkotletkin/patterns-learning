package com.kotletkin.dev.strategy.skeleton;

import com.kotletkin.dev.strategy.Warrior;

public class Skeleton extends Warrior {
    public Skeleton() {
        soundBehavior = new SoundSkeleton();
        weaponBehavior = new HitSkeleton();
    }

    @Override
    public void display() {
        System.out.println("I'am skeleton!");
    }
}
