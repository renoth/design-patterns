package de.renoth.factory;

public class Car extends Vehicle {
    public Car() {
        super("I am a car!");
    }

    @Override
    public void drive() {
        System.out.println("I am driving a car.");
    }
}
