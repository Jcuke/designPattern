package com.cuke.pattern.observer;

/**
 * ��һ���۲���ʵ��
 */
public class ObserverEntity1 implements Observer {

    @Override
    public void response() {
        System.out.println("�۲���1������Ӧ");
    }
}
