package de.renoth.decorator;

public class Cheese extends PizzaIngredientDecorator {
    public Cheese(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Cheese";
    }

    @Override
    public double cost() {
        return 0.20 + pizza.cost();
    }
}
