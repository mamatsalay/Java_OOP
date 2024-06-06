package org.mamatsalay.homework.ten.driverProducts;

import org.mamatsalay.homework.ten.abstractProducts.Driver;

public class Trucker extends Driver {

    @Override
    public void drive() {
        System.out.println("Дальнобойщик управляет грузовиком");
    }
}
