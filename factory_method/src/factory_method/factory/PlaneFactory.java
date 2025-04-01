package factory_method.factory;

import factory_method.models.Plane;
import factory_method.models.Vehicle;

public class PlaneFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
