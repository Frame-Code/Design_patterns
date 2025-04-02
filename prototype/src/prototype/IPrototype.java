package prototype;

/**
 * This interface declares the 2 different methods to clone and object: simple clone and deep clone
 * Is necessary to the interface extends of Cloneable.
 * Any class to implement this interface become cloneable
 *
 * @author Daniel Mora Cantillo
 */
public interface IPrototype<T extends IPrototype> extends Cloneable{
    //Simple
    T clone();

    //Deep
    T deepClone();
}
