package com.cuke.pattern.observersample2;

import java.util.Observable;

/**
 * ���۲��ߣ�Ŀ����
 * ԭ���ڻ�
 */
public class OilFutures extends Observable {

    //���۲��ߣ������״̬�����Ｔԭ�ͼ۸�
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        //�۸�䶯�����֪ͨ
        super.setChanged();//����״̬���
        super.notifyObservers(price);
    }
}
