package com.cuke.pattern.observer;

/**
 * 观察者主题实体
 */
public class SubjectEntity extends Subject {

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
