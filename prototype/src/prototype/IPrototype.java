package prototype;

/**
 * Se puede clonar cualquier objeto que tenga implementada esta interface
 *
 * @author Daniel Mora Cantillo
 */
public interface IPrototype<T extends IPrototype> extends Cloneable{
    //Simple
    T clone();

    //Deep
    T deepClone();
}
