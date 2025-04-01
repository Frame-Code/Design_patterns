package normal_factory.factory;

import normal_factory.Vehicle;
import normal_factory.TypeOFVehicle;
import normal_factory.models.Car;
import normal_factory.models.Motorcycle;
import normal_factory.models.Plane;
import normal_factory.models.Truck;

public class VehicleFactory {

    public Vehicle createVehicle(String typeOfVehicle) {

        if(typeOfVehicle.equalsIgnoreCase(TypeOFVehicle.CAR.name())) {
            return new Car();
        }

        if(typeOfVehicle.equalsIgnoreCase(TypeOFVehicle.MOTORCYCLE.name())) {
            return new Motorcycle();
        }

        if(typeOfVehicle.equalsIgnoreCase(TypeOFVehicle.TRUCK.name())) {
            return new Truck();
        }

        if(typeOfVehicle.equalsIgnoreCase("Plane")) {
            return new Plane();
        }

        return null;
    }
}
