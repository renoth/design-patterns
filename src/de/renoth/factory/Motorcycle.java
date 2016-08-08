package de.renoth.factory;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super("Building Motorcycle. meep meep.");
    }

    @Override
    public void drive() {
        System.out.println("Im driving a motorcycle");
    }
}
