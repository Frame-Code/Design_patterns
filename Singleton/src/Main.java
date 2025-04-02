/**
 * The singleton pattern allows to create a unique object of any class in all the program,
 * to access it (the unique instance) in any part of the program
 *
 * @author Daniel Mora Cantillo
 */
public class Main {
    public static void main(String[] args) {
        //The variables are different but the object DatabaseConnector is the same
        DatabaseConnector connector = DatabaseConnector.getInstance();
        DatabaseConnector connector1 = DatabaseConnector.getInstance();

        System.out.println(connector);
        System.out.println(connector1);
    }
}