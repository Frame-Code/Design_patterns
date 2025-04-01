package factory_method.models;


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
