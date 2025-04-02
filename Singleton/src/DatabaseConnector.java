/** Defining a Singleton class
 * Is necessary to define a static attribute type this class (This attribute will be the Instance of this class).
 * The constructor of this class will be private to negate the new objects creation of this class.
 * Finally, to define the method getInstance() to return the unique instance of this class, if the variable previously mentioned
 * isn't defined, the method define it, create it and return the object necessary.
 *
 * @author Daniel Mora Cantillo
 */
public class DatabaseConnector {
    private static DatabaseConnector INSTANCE;

    private DatabaseConnector() { //restringiendo creacion de objetos
        System.out.println("Creating object");
    }

    public static synchronized DatabaseConnector getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }

        return new DatabaseConnector();
    }

    @Override
    public String toString() {
        return "DatabaseConnector{}";
    }
}
