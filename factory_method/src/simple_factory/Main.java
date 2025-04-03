package simple_factory;

import simple_factory.factory.VehicleFactory;

/**
 * The factory method defines one generalization or categorization to create an object
 * (using an interface or an abstract class) where each subclass allow defines the type object to create.
 * Finally, we have a creator class to create each subclass and return it.
 * The factory simple method has 3 principal parts:
 * - Product (Generally one interface to categorize or generalize the specific product).
 * - Specific product (The implementation of the interface).
 * - A creator class (The class with the factory method to create different specific products,
 * but that method returns an object type Product (the generalization or categorization)).
 * In this case,
 * Product: Interface called 'Vehicle' (a categorization of all vehicle types)
 * Specific product: The classes called 'Car', 'Truck', 'Motorcycle' and 'Plane',
 * Each of these classes implements the interface 'Vehicle'
 * */
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(VehicleType.CAR);
        car.start();

        Vehicle truck = vehicleFactory.createVehicle(VehicleType.TRUCK);
        truck.start();

        Vehicle motorcycle = vehicleFactory.createVehicle(VehicleType.MOTORCYCLE);
        motorcycle.start();

        Vehicle plane = vehicleFactory.createVehicle(VehicleType.PLANE);
        plane.start();


    }
}