package de.renoth.observer;

import java.util.Observable;
import java.util.Observer;

public class StockIsOpenTicker implements Observer {

    private Observable observable;

    public StockIsOpenTicker(Observable stockMarket) {
        observable = stockMarket;
        stockMarket.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof StockMarketInformation) {
            System.out.println("Stock market is trading: " + ((StockMarketInformation) arg).isTrading());
        }
    }
}
