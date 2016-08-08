package de.renoth.decorator;

public class Salami extends PizzaIngredientDecorator {

    public Salami(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Salami";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.35;
    }
}
