package com.cuke.pattern.observer;

public class TestMain {

    public static void main(String[] args) {

        //抽象目标，被观察者
        Subject subject = new SubjectEntity();

        //订阅/注册
        ObserverEntity1 observerEntity1 = new ObserverEntity1();
        ObserverEntity2 observerEntity2 = new ObserverEntity2();
        subject.add(observerEntity1);
        subject.add(observerEntity2);

        //主题状态变更，所有订阅者发出响应
        subject.setState(0);
        subject.setState(1);
    }
}
