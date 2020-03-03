package com.cuke.pattern.observersample2;

import java.util.Observable;

/**
 * 被观察者，目标类
 * 原油期货
 */
public class OilFutures extends Observable {

    //被观察者，主体的状态，这里即原油价格
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        //价格变动多个发通知
        super.setChanged();//主体状态变更
        super.notifyObservers(price);
    }
}
