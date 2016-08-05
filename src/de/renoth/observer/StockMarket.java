package de.renoth.observer;

import java.util.Observable;

public class StockMarket extends Observable {
    private StockMarketInformation information;
    private double volume;
    private boolean isTrading;

    public StockMarket(StockMarketInformation information) {
        this.information = information;
    }

    public void setIndex(double newIndex) {
        information.setIndex(newIndex);
        propagateChanges();
    }

    public void setTrading(boolean isTrading) {
        information.setTrading(isTrading);
        propagateChanges();
    }

    public void setVolume(long volume) {
        information.setVolume(volume);
        propagateChanges();
    }

    private void propagateChanges() {
        setChanged();
        notifyObservers(information);
    }
}
