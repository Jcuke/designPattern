package com.cuke.pattern.observersample2;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者，多方.
 */
public class Bull implements Observer {


    /**
     * @param o                      观察者主体
     * @param observableEntityStatus 观察者主体的状态
     */
    @Override
    public void update(Observable o, Object observableEntityStatus) {

        float price = (Float) observableEntityStatus;
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + -price + "元，空方高兴了！");
        }
    }
}
