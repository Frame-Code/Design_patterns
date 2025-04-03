package factory_method.factory;

import factory_method.models.Motorcycle;

/**
 * This class represents the specific class creator.
 * Subclass MotorcycleFactory to create new object type Motorcycle, encapsulated on the object type Interface Vehicle.
 * The abstract class VehicleFactory delegates the responsibility of object instantiation to the subclasses
 * (The specific factories)
 *
 * @author Daniel Mora Cantillo*/
public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
