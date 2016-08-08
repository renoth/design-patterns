package de.renoth.decorator;

public class Calzone extends AbstractPizza {

    public Calzone() {
        description = "Calzone";
    }

    @Override
    public double cost() {
        return 4.50;
    }
}
