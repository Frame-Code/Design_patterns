package simple_factory.factory;

import simple_factory.Vehicle;
import simple_factory.VehicleType;
import simple_factory.models.Car;
import simple_factory.models.Motorcycle;
import simple_factory.models.Plane;
import simple_factory.models.Truck;

/**
 * This class represents the creator class.
 * This is the Factory class (simple factory); the class have one method to create different vehicles
 * (this not follows the solid principle open-closed, for that reason is a example of simple factory)
 * The class Factory has the responsibility to create different objects of the categorized type,
 * in this case 'Vehicle'.
 *
 * @author Daniel Mora Cantillo
 * */

public class VehicleFactory {

    /**
     * Factory method to create different vehicles types
     * This method return an object to implement the interface Vehicle
     *
     * @param vehicleType ENUM VehicleType with all vehicle types
     * */
    public Vehicle createVehicle(VehicleType vehicleType) {

        if(vehicleType == VehicleType.CAR) {
            return new Car();
        }

        if(vehicleType == VehicleType.MOTORCYCLE) {
            return new Motorcycle();
        }

        if(vehicleType == VehicleType.TRUCK) {
            return new Truck();
        }

        if(vehicleType == VehicleType.PLANE) {
            return new Plane();
        }

        return null;
    }
}
