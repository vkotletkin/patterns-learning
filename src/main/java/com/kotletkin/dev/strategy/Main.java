package com.kotletkin.dev.strategy;

import com.kotletkin.dev.strategy.human.Human;
import com.kotletkin.dev.strategy.skeleton.Skeleton;

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