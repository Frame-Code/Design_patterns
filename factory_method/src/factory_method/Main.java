package factory_method;

import factory_method.factory.CarFactory;
import factory_method.factory.MotorcycleFactory;
import factory_method.factory.PlaneFactory;
import factory_method.factory.TruckFactory;
import factory_method.models.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        car.start();

        Vehicle truck = new TruckFactory().createVehicle();
        truck.start();

        Vehicle plane = new PlaneFactory().createVehicle();
        plane.start();
        plane.stop();

        Vehicle motorcycle = new MotorcycleFactory().createVehicle();
        motorcycle.start();

    }
}
