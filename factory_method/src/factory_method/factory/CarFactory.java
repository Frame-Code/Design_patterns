package factory_method.factory;

import factory_method.models.Car;

/**
 * This class represents the specific class creator.
 * Subclass CarFactory to create new object type Car, encapsulated on the object type Interface Vehicle.
 * The abstract class VehicleFactory delegates the responsibility of object instantiation to the subclasses
 * (The specific factories)
 *
 * @author Daniel Mora Cantillo*/
public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
