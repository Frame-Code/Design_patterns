package factory_method.factory;

import factory_method.models.Truck;

/**
 * This class represents the specific class creator.
 * Subclass TruckFactory to create new object type Truck, encapsulated on the object type Interface Vehicle.
 * The abstract class VehicleFactory delegates the responsibility of object instantiation to the subclasses
 * (The specific factories)
 *
 * @author Daniel Mora Cantillo*/
public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
