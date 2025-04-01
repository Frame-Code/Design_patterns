package factory_method.factory;

import factory_method.models.Motorcycle;
import factory_method.models.Vehicle;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
