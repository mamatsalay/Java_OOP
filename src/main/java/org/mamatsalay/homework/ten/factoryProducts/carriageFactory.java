package org.mamatsalay.homework.ten.factoryProducts;

import org.mamatsalay.homework.ten.abstractProducts.Driver;
import org.mamatsalay.homework.ten.abstractProducts.Factory;
import org.mamatsalay.homework.ten.abstractProducts.Movement;
import org.mamatsalay.homework.ten.driverProducts.Coachman;
import org.mamatsalay.homework.ten.movementProducts.Gallop;

public class carriageFactory extends Factory {
    @Override
    public Driver createDriver() {
        return new Coachman();
    }

    @Override
    public Movement createMovement() {
        return new Gallop();
    }
}
