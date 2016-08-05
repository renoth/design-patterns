import de.renoth.observer.*;
import de.renoth.strategy.BrabbleBehaviour;
import de.renoth.strategy.Person;
import de.renoth.strategy.QuietBehaviour;

public class Main {

    public static void main(String[] args) {
        strategyPattern();
        observerPattern();
    }

    private static void strategyPattern() {
        System.out.println("Strategy Pattern\n");

        System.out.println("Brabbling Person: ");
        Person brabbler = new Person();
        brabbler.setTalkBehaviour(new BrabbleBehaviour());
        brabbler.talk();

        System.out.println("Quiet Person: ");

        Person quietPerson = new Person();
        quietPerson.setTalkBehaviour(new QuietBehaviour());
        quietPerson.talk();
    }

    private static void observerPattern() {
        System.out.println("\n\nObserver Pattern\n");

        StockMarket stockMarket = new StockMarket(new StockMarketInformation(1000, 0, false));

        StockIndexTicker indexTicker = new StockIndexTicker(stockMarket);
        StockVolumeTicker volumeTicker = new StockVolumeTicker(stockMarket);

        System.out.println("Changing stock market information\n");

        stockMarket.setIndex(1010);

        StockIsOpenTicker isOpenTicker = new StockIsOpenTicker(stockMarket);

        System.out.println("\nChanging stock market information\n");

        stockMarket.setTrading(true);

        System.out.println("\nChanging stock market information\n");

        stockMarket.deleteObserver(isOpenTicker);
        stockMarket.setVolume(1000);
    }
}
