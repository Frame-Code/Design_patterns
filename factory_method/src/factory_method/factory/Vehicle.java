package factory_method.factory;

/**
 * This interface represents the "product".
 * Interface to categorize all vehicle types;
 * all vehicle types will be implemented in this interface (also can be an abstract class).
 * In this case, I'm put 2 methods (each vehicle can start the road and stop it)
 *
 * @author Daniel Mora Cantillo*/
public interface Vehicle {
    void start();

    void stop();
}
