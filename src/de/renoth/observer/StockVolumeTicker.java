package de.renoth.observer;

import java.util.Observable;
import java.util.Observer;

public class StockVolumeTicker implements Observer {
    private Observable observable;

    public StockVolumeTicker(Observable stockMarket) {
        observable = stockMarket;
        stockMarket.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof StockMarketInformation) {
            System.out.println("New stock market volume: " + ((StockMarketInformation) arg).getVolume());
        }
    }
}
