package com.cuke.pattern.observersample2;

public class TestMain {

    public static void main(String[] args) {

        OilFutures oilFutures = new OilFutures();

        oilFutures.addObserver(new Bull());
        oilFutures.addObserver(new Bear());

        oilFutures.setPrice(12);
        oilFutures.setPrice(-8);
    }
}
