package normal_factory.models;

import normal_factory.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("START TRUCK!!!... ->");
    }

    @Override
    public void stop() {
        System.out.println("STOP TRUCK!!!... ->");
    }
}
