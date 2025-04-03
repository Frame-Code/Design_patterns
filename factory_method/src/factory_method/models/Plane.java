package factory_method.models;


import factory_method.factory.Vehicle;

/**
 * This class represents the specific product.
 * An Entity class to implement the interface Vehicle because a Plane is a vehicle
 *
 * @author Daniel Mora Cantillo*/
public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("RUN PLANE!!");
    }

    @Override
    public void stop() {
        System.out.println("STOP PLANE!!");
    }

    public void fly() {
        System.out.println("Take off the plane");
    }
}
