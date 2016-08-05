package de.renoth.observer;

import java.util.Observable;
import java.util.Observer;

public class StockIndexTicker implements Observer {

    private Observable observable;

    public StockIndexTicker(Observable stockMarket) {
        observable = stockMarket;
        stockMarket.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof StockMarketInformation) {
            System.out.println("New stock market index: " + ((StockMarketInformation) arg).getIndex());
        }
    }
}
