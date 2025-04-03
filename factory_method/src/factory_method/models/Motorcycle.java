package factory_method.models;

import factory_method.factory.Vehicle;

/**
 * This class represents the specific product.
 * An Entity class to implement the interface Vehicle because a Motorcycle is a vehicle
 *
 * @author Daniel Mora Cantillo*/
public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("RUN MOTORCYCLE");
    }

    @Override
    public void stop() {
        System.out.println("STOP MOTORCYCLE");
    }
}
