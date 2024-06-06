package org.mamatsalay.homework.ten.factoryProducts;

import org.mamatsalay.homework.ten.abstractProducts.Driver;
import org.mamatsalay.homework.ten.abstractProducts.Factory;
import org.mamatsalay.homework.ten.abstractProducts.Movement;
import org.mamatsalay.homework.ten.driverProducts.Racer;
import org.mamatsalay.homework.ten.movementProducts.Racing;

public class carFactory extends Factory {
    @Override
    public Driver createDriver() {
        return new Racer();
    }

    @Override
    public Movement createMovement() {
        return new Racing();
    }
}
