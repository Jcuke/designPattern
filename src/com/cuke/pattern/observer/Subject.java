package com.cuke.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private int state;//被观察者主题的状态，此状态变化，所有订阅者发出响应

    //观察者/订阅者 集合
    protected List<Observer> observers = new ArrayList();

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyObserver();

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }
}
