package com.kotletkin.dev.strategy.human;

import com.kotletkin.dev.strategy.SoundBehavior;

public class SoundHuman implements SoundBehavior {

    @Override
    public void doSound() {
        System.out.println("Human playing sound");
    }
}
