package org.mamatsalay.homework.eleven.decorators;

import org.mamatsalay.homework.eleven.basepizza.Pizza;

abstract class PizzaDecorator implements Pizza
{
    protected Pizza pizza;


    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

}
