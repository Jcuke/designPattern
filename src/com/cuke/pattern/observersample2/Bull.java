package com.cuke.pattern.observersample2;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲��ߣ��෽.
 */
public class Bull implements Observer {


    /**
     * @param o                      �۲�������
     * @param observableEntityStatus �۲��������״̬
     */
    @Override
    public void update(Observable o, Object observableEntityStatus) {

        float price = (Float) observableEntityStatus;
        if (price > 0) {
            System.out.println("�ͼ�����" + price + "Ԫ���෽�����ˣ�");
        } else {
            System.out.println("�ͼ��µ�" + -price + "Ԫ���շ������ˣ�");
        }
    }
}
