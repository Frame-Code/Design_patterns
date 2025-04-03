package simple_factory.models;

import simple_factory.Vehicle;

/**
 * This class represents the specific product.
 * Class model to implements the Interface Vehicle to categorized it
 *
 * @author Daniel Mora Cantillo
 * */
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("RUN CAR!!");
    }

    @Override
    public void stop() {
        System.out.println("STOP CAR!");
    }
}
