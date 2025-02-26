package com.kotletkin.dev.observer;

public class Headquarters implements Observer, DisplayMonitor {
    private final Subject subject;
    private String missleName;
    private String missleX;
    private String missleY;

    public Headquarters(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String missleName, String missleX, String missleY) {
        this.missleName = missleName;
        this.missleX = missleX;
        this.missleY = missleY;
        display();
    }

    @Override
    public void display() {
        System.out.println("Headquarters get data about missle: Missle Name: " + missleName +
                ". Missle X: " + missleX + ". Missle Y: " + missleY);
    }
}
