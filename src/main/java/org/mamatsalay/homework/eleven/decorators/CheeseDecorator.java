package org.mamatsalay.homework.eleven.decorators;

import org.mamatsalay.homework.eleven.basepizza.Pizza;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Сыр";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.0;
    }
}
