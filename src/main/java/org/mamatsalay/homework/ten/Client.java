package org.mamatsalay.homework.ten;

import org.mamatsalay.homework.ten.abstractProducts.Driver;
import org.mamatsalay.homework.ten.abstractProducts.Factory;
import org.mamatsalay.homework.ten.abstractProducts.Movement;

public class Client {
    private Driver driver;
    private Movement movement;

    Client(Factory factory){
        driver = factory.createDriver();
        movement = factory.createMovement();
    }

    void order(){
        driver.drive();
        movement.move();
    }
}
