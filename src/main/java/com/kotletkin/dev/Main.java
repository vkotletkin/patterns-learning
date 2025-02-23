package com.kotletkin.dev;

import com.kotletkin.dev.strategy.Warrior;
import com.kotletkin.dev.strategy.human.HitHuman;
import com.kotletkin.dev.strategy.human.Human;
import com.kotletkin.dev.strategy.human.SoundHuman;
import com.kotletkin.dev.strategy.skeleton.HitSkeleton;
import com.kotletkin.dev.strategy.skeleton.Skeleton;
import com.kotletkin.dev.strategy.skeleton.SoundSkeleton;

public class Main {
    public static void main(String[] args) {
        Warrior skeleton = new Skeleton(new HitSkeleton(), new SoundSkeleton());
        skeleton.performSound();
        skeleton.performWeapon();
        skeleton.display();

        System.out.println();

        Warrior human = new Human(new HitHuman(), new SoundHuman());
        human.performSound();
        human.performWeapon();
        human.display();
    }
}