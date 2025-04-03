package factory_method;

import factory_method.factory.CarFactory;
import factory_method.factory.MotorcycleFactory;
import factory_method.factory.PlaneFactory;
import factory_method.factory.TruckFactory;
import factory_method.factory.Vehicle;

/**
 * The factory method defines an interface or an abstract class to create a general object delegating (product)
 * to the subclass define the object type (specific product),
 * and different class with the responsibility to instance that object.
 * Factory method has 4 important parts:
 * Product: Generalization or Categorization of the specific product,
 * Specific product: The implementation or extension of the Product,
 * Abstract Factory: An abstract class with the abstract method to create a new object returning an object type Product,
 * Specific factories: The extension of the abstract class with the necessary logic to create the specific product
 * (one specific factory per specific product)
 *
 * @author Daniel Mora Cantillo
 * */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        car.start();

        Vehicle truck = new TruckFactory().createVehicle();
        truck.start();

        Vehicle plane = new PlaneFactory().createVehicle();
        plane.start();
        plane.stop();

        Vehicle motorcycle = new MotorcycleFactory().createVehicle();
        motorcycle.start();

    }
}
