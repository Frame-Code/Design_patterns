package factory_method.models;

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
