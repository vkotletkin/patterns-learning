package com.kotletkin.dev.strategy.human;

import com.kotletkin.dev.strategy.SoundBehavior;
import com.kotletkin.dev.strategy.Warrior;
import com.kotletkin.dev.strategy.WeaponBehavior;

public class Human extends Warrior {
    public Human(WeaponBehavior weaponBehavior, SoundBehavior soundBehavior) {
        super(weaponBehavior, soundBehavior);
    }

    @Override
    public void display() {
        System.out.println("Human");
    }
}
