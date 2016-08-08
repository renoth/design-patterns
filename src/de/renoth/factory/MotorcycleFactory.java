package de.renoth.factory;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        System.out.println("Building new motorcycle ...");
        return new Motorcycle();
    }
}
