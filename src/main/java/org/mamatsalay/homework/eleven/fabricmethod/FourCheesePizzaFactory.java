package org.mamatsalay.homework.eleven.fabricmethod;

import org.mamatsalay.homework.eleven.basepizza.BasePizza;
import org.mamatsalay.homework.eleven.basepizza.Pizza;
import org.mamatsalay.homework.eleven.decorators.CheeseDecorator;

public class FourCheesePizzaFactory extends PizzaFactory
{
    @Override
    public Pizza createPizza() {
        Pizza pizza = new BasePizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        return pizza;
    }
}
