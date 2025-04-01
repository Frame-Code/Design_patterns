package factory_method.models;


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
