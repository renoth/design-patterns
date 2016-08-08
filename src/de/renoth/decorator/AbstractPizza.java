package de.renoth.decorator;

public abstract class AbstractPizza {
    String description = "Abstractizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
