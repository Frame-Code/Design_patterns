package factory_method.factory;

import factory_method.models.Car;
import factory_method.models.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
