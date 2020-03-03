package com.cuke.pattern.observer;

public class TestMain {

    public static void main(String[] args) {

        //����Ŀ�꣬���۲���
        Subject subject = new SubjectEntity();

        //����/ע��
        ObserverEntity1 observerEntity1 = new ObserverEntity1();
        ObserverEntity2 observerEntity2 = new ObserverEntity2();
        subject.add(observerEntity1);
        subject.add(observerEntity2);

        //����״̬��������ж����߷�����Ӧ
        subject.setState(0);
        subject.setState(1);
    }
}
