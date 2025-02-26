package com.kotletkin.dev.observer.internal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CatholicChurch {
    private final PropertyChangeSupport supports;
    private String news;

    public CatholicChurch() {
        supports = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        supports.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        supports.removePropertyChangeListener(listener);
    }

    public void setNews(String news) {
        supports.firePropertyChange("news", this.news, news);
        this.news = news;
    }
}
