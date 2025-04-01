package normal_factory;

import normal_factory.factory.VehicleFactory;
import normal_factory.models.Car;
import normal_factory.models.Motorcycle;
import normal_factory.models.Plane;
import normal_factory.models.Truck;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(Car.class.getSimpleName());
        car.start();

        Vehicle truck = vehicleFactory.createVehicle(Truck.class.getSimpleName());
        truck.start();

        Vehicle motorcycle = vehicleFactory.createVehicle(Motorcycle.class.getSimpleName());
        motorcycle.start();

        Vehicle plane = vehicleFactory.createVehicle(Plane.class.getSimpleName());
        plane.start();


    }
}