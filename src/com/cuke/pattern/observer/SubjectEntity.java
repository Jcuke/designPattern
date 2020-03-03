package com.cuke.pattern.observer;

/**
 * �۲�������ʵ��
 */
public class SubjectEntity extends Subject {

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
