package factory_method.factory;

/**
 * This is the abstract creator class to define the contract of all subclasses factories
 *
 * @author Daniel Mora Cantillo
 * */
public abstract class VehicleFactory {

    /**
     * Abstract method to create new Vehicles.
     * All factories will be implemented this method with the unique necessary logic
     * @return an object types the interface Vehicle
     * */
    public abstract Vehicle createVehicle();
}
