import de.renoth.command.CommandUser;
import de.renoth.command.DoThatCommand;
import de.renoth.command.DoThisCommand;
import de.renoth.decorator.*;
import de.renoth.factory.CarFactory;
import de.renoth.factory.MotorcycleFactory;
import de.renoth.factory.Vehicle;
import de.renoth.factory.VehicleFactory;
import de.renoth.observer.*;
import de.renoth.singleton.CounterSingleton;
import de.renoth.strategy.BrabbleBehaviour;
import de.renoth.strategy.Person;
import de.renoth.strategy.QuietBehaviour;

public class Main {

    public static void main(String[] args) {
        strategyPattern();
        observerPattern();
        decoratorPattern();
        factoryPattern();
        singletonPattern();
        commandPattern();
    }

    private static void commandPattern() {
        System.out.println("\n\nCommand Pattern\n");
        CommandUser commandUser = new CommandUser();

        commandUser.receiveCommand(new DoThisCommand());
        commandUser.receiveCommand(new DoThatCommand());

        commandUser.executeCommands();
        commandUser.executeCommands();
        commandUser.receiveCommand(new DoThatCommand());
        commandUser.executeCommands();
    }

    private static void singletonPattern() {
        System.out.println("\n\nSingleton Pattern\n");

        CounterSingleton singleton = CounterSingleton.get();
        System.out.println(singleton.getCounterValue());

        CounterSingleton.get();

        System.out.println(singleton.getCounterValue());
        System.out.println(CounterSingleton.get().getCounterValue());
        System.out.println(singleton.getCounterValue());
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

    private static void decoratorPattern() {
        System.out.println("\n\nDecorator Pattern\n");

        AbstractPizza pizza = new Pizza();
        pizza = new Cheese(pizza);
        pizza = new Salami(pizza);

        AbstractPizza calzone = new Calzone();
        calzone = new Salami(calzone);

        System.out.println(pizza.getDescription() + " : " + pizza.cost());
        System.out.println(calzone.getDescription() + " : " + calzone.cost());
    }

    private static void factoryPattern() {
        System.out.println("\n\nFactory Pattern\n");

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.create();
        car.drive();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.create();
        motorcycle.drive();
    }
}
