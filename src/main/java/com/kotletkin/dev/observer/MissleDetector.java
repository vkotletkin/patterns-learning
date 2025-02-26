package com.kotletkin.dev.observer;

import java.util.HashSet;
import java.util.Set;

public class MissleDetector implements Subject {
    private final Set<Observer> observers;
    private String missleName;
    private String missleX;
    private String missleY;

    public MissleDetector() {
        observers = new HashSet<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(missleName, missleX, missleY);
        }
    }

    public void detectorsChanged() {
        notifyObservers();
    }

    public void setData(String missleName, String missleX, String missleY) {
        this.missleName = missleName;
        this.missleX = missleX;
        this.missleY = missleY;
        detectorsChanged();
    }
}
