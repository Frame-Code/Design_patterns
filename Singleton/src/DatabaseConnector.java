/** El objeto se crea dentro de la misma clase
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
}
