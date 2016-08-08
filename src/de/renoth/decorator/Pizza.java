package de.renoth.decorator;

public class Pizza extends AbstractPizza {

    public Pizza() {
        description = "Pizza";
    }

    @Override
    public double cost() {
        return 4;
    }
}
