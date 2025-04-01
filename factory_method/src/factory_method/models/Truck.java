package factory_method.models;

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
