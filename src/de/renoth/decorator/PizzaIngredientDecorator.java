package de.renoth.decorator;

public abstract class PizzaIngredientDecorator extends AbstractPizza {

    AbstractPizza pizza;

    public PizzaIngredientDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    protected PizzaIngredientDecorator() {
    }

    public abstract String getDescription();
}
