package org.mamatsalay.homework.eleven;

import org.mamatsalay.homework.eleven.basepizza.BasePizza;
import org.mamatsalay.homework.eleven.basepizza.Pizza;
import org.mamatsalay.homework.eleven.builder.Dough;
import org.mamatsalay.homework.eleven.builder.DoughBuilder;
import org.mamatsalay.homework.eleven.decorators.CheeseDecorator;
import org.mamatsalay.homework.eleven.decorators.OliveDecorator;
import org.mamatsalay.homework.eleven.decorators.PepperoniDecorator;
import org.mamatsalay.homework.eleven.fabricmethod.FourCheesePizzaFactory;
import org.mamatsalay.homework.eleven.fabricmethod.PizzaFactory;

public class Main {

    public static void main(String[] args) {

        PizzaFactory factory = new FourCheesePizzaFactory();
        Pizza pizza = factory.createPizza();
        System.out.println("Пицца 4 сыра: " + pizza.getDescription() + " - $" + pizza.getPrice());

        Pizza customPizza = new BasePizza();
        customPizza = new CheeseDecorator(customPizza);
        customPizza = new OliveDecorator(customPizza);
        customPizza = new PepperoniDecorator(customPizza);
        System.out.println("Авторская пицца: " + customPizza.getDescription() + " - $" + customPizza.getPrice());

        DoughBuilder doughBuilder = new DoughBuilder();
        Dough thinDough = doughBuilder.setThin().build();
        System.out.println("Тип теста: " + thinDough);


    }

}
