package factory_method.factory;

import factory_method.models.Plane;

/**
 * This class represents the specific class creator.
 * Subclass PlaneFactory to create new object type Plane, encapsulated on the object type Interface Vehicle.
 * The abstract class VehicleFactory delegates the responsibility of object instantiation to the subclasses
 * (The specific factories)
 *
 * @author Daniel Mora Cantillo*/
public class PlaneFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
