package de.renoth.factory;

public abstract class Vehicle {
    private String description;

    public Vehicle(String description) {
        this.description = description;
    }

    public abstract void drive();
}
