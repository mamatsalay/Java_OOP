package org.mamatsalay.homework.eleven.fabricmethod;

import org.mamatsalay.homework.eleven.basepizza.BasePizza;
import org.mamatsalay.homework.eleven.basepizza.Pizza;
import org.mamatsalay.homework.eleven.decorators.PepperoniDecorator;

public class PepperoniPizza extends PizzaFactory
{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasePizza();
        pizza = new PepperoniDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        return pizza;
    }
}
