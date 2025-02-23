package com.kotletkin.dev.strategy.skeleton;

import com.kotletkin.dev.strategy.SoundBehavior;

public class SoundSkeleton implements SoundBehavior {
    @Override
    public void doSound() {
        System.out.println("Skeleton Sound!!!");
    }
}
