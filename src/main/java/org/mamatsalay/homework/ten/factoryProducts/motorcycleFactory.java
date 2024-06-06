package org.mamatsalay.homework.ten.factoryProducts;

import org.mamatsalay.homework.ten.abstractProducts.Driver;
import org.mamatsalay.homework.ten.abstractProducts.Factory;
import org.mamatsalay.homework.ten.abstractProducts.Movement;
import org.mamatsalay.homework.ten.driverProducts.Biker;
import org.mamatsalay.homework.ten.movementProducts.Ride;

public class motorcycleFactory extends Factory {
    @Override
    public Driver createDriver() {
        return new Biker();
    }

    @Override
    public Movement createMovement() {
        return new Ride();
    }
}
