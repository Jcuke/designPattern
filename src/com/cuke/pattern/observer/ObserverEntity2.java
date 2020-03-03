package com.cuke.pattern.observer;

/**
 * 第二种观察者实体
 */
public class ObserverEntity2 implements Observer {

    @Override
    public void response() {
        System.out.println("观察者2做出反应");
    }
}
