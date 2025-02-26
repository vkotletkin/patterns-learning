package com.kotletkin.dev.observer.internal;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Parishioner implements PropertyChangeListener {
    private final String name;

    public Parishioner(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    private void setNews(String news) {
        System.out.println(name + " узнал новость " + news);
    }
}
