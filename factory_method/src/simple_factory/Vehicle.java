package simple_factory;

/**
 * This interface represents the product.
 * Interface necessary to categorize the different models.
 * In this project, we have the models: Car, Motorcycle, Truck and Plane,
 * and all of these models will be categorized with an Interface called 'Vehicle'
 * because all of these models are Vehicles.
 * In this case, I'm put two different methods just as an example.
 *
 * @author Daniel Mora Cantillo
 * */
public interface Vehicle {
    void start();
    void stop();
}
