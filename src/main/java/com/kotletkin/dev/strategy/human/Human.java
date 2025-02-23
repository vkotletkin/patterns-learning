package com.kotletkin.dev.strategy.human;

import com.kotletkin.dev.strategy.Warrior;

public class Human extends Warrior {
    public Human() {
        this.soundBehavior = new SoundHuman();
        this.weaponBehavior = new HitHuman();
    }

    @Override
    public void display() {
        System.out.println("Human");
    }
}
