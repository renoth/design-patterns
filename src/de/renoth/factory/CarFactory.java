package de.renoth.factory;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        System.out.println("Building new car ...");
        return new Car();
    }
}
