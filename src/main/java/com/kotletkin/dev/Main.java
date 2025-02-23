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

        /*
        Паттерн Стратегия определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
        Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента
        */

        Warrior skeleton = new Skeleton();
        skeleton.performSound();
        skeleton.performWeapon();
        skeleton.display();

        System.out.println();

        Warrior human = new Human();
        human.performSound();
        human.performWeapon();
        human.display();
    }
}