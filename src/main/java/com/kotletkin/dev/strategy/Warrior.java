package com.kotletkin.dev.strategy;

public abstract class Warrior {
    private final WeaponBehavior weaponBehavior;
    private final SoundBehavior soundBehavior;

    public Warrior(WeaponBehavior weaponBehavior, SoundBehavior soundBehavior) {
        this.weaponBehavior = weaponBehavior;
        this.soundBehavior = soundBehavior;
    }

    public void performWeapon() {
        weaponBehavior.doHit();
    }

    public void performSound() {
        soundBehavior.doSound();
    }

    public abstract void display();
}
