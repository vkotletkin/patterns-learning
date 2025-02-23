package com.kotletkin.dev.strategy.skeleton;

import com.kotletkin.dev.strategy.SoundBehavior;
import com.kotletkin.dev.strategy.Warrior;
import com.kotletkin.dev.strategy.WeaponBehavior;

public class Skeleton extends Warrior {
    public Skeleton(WeaponBehavior weaponBehavior, SoundBehavior soundBehavior) {
        super(weaponBehavior, soundBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'am skeleton!");
    }
}
