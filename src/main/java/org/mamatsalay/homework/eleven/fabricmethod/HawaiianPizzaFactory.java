package org.mamatsalay.homework.eleven.fabricmethod;

import org.mamatsalay.homework.eleven.basepizza.BasePizza;
import org.mamatsalay.homework.eleven.basepizza.Pizza;
import org.mamatsalay.homework.eleven.decorators.CheeseDecorator;
import org.mamatsalay.homework.eleven.decorators.OliveDecorator;
import org.mamatsalay.homework.eleven.decorators.PepperoniDecorator;

public class HawaiianPizzaFactory extends PizzaFactory
{
    @Override
    public Pizza createPizza()
    {
        Pizza pizza = new BasePizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        return pizza;
    }
}
