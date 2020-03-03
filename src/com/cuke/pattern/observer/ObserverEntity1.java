package com.cuke.pattern.observer;

/**
 * 第一正观察者实体
 */
public class ObserverEntity1 implements Observer {

    @Override
    public void response() {
        System.out.println("观察者1做出反应");
    }
}
