package factory_method.factory;

import factory_method.models.Truck;
import factory_method.models.Vehicle;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
