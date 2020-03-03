package com.cuke.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private int state;//���۲��������״̬����״̬�仯�����ж����߷�����Ӧ

    //�۲���/������ ����
    protected List<Observer> observers = new ArrayList();

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * ֪ͨ�۲���
     */
    public abstract void notifyObserver();

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }
}
