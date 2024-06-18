package org.mamatsalay.homework.eleven.decorators;

import org.mamatsalay.homework.eleven.basepizza.Pizza;

public class PepperoniDecorator extends PizzaDecorator
{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Пепперони";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.5;
    }

}
