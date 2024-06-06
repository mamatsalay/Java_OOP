package org.mamatsalay.homework.ten;

import org.mamatsalay.homework.ten.abstractProducts.Factory;
import org.mamatsalay.homework.ten.factoryProducts.motorcycleFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new motorcycleFactory();
        Client client = new Client(factory1);

        client.order();
    }
}
