package de.renoth.factory;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        System.out.println("Building new motorcyclez` ...");
        return new Motorcycle();
    }
}
