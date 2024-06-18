package org.mamatsalay.homework.eleven.decorators;

import org.mamatsalay.homework.eleven.basepizza.Pizza;

public class OliveDecorator extends PizzaDecorator
{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Оливки";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.75;
    }
}
