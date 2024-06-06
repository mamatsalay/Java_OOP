package org.mamatsalay.homework.ten.factoryProducts;

import org.mamatsalay.homework.ten.abstractProducts.Driver;
import org.mamatsalay.homework.ten.abstractProducts.Factory;
import org.mamatsalay.homework.ten.abstractProducts.Movement;
import org.mamatsalay.homework.ten.driverProducts.Trucker;
import org.mamatsalay.homework.ten.movementProducts.Crawl;

public class truckFactory extends Factory {
    @Override
    public Driver createDriver() {
        return new Trucker();
    }

    @Override
    public Movement createMovement() {
        return new Crawl();
    }
}
