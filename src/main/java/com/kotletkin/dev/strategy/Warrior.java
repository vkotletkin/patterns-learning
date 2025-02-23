package com.kotletkin.dev.strategy;

public abstract class Warrior {
    protected WeaponBehavior weaponBehavior;
    protected SoundBehavior soundBehavior;

    public void performWeapon() {
        weaponBehavior.doHit();
    }

    public void performSound() {
        soundBehavior.doSound();
    }

    public abstract void display();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
