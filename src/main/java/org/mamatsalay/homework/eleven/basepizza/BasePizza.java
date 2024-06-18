package org.mamatsalay.homework.eleven.basepizza;

public class BasePizza implements Pizza
{
    @Override
    public String getDescription() {
        return "Пицца";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
