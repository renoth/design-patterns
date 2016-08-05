package de.renoth.observer;

public class StockMarketInformation {
    private double index;
    private long volume;
    private boolean isTrading;

    public StockMarketInformation(double index, long volume, boolean isTrading) {
        this.index = index;
        this.volume = volume;
        this.isTrading = isTrading;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public boolean isTrading() {
        return isTrading;
    }

    public void setTrading(boolean trading) {
        isTrading = trading;
    }
}
