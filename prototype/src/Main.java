import java.util.List;

/**
 * The prototype pattern allows creates new object of any class cloning an existing object
 * To avoid using 'new' when the creation of the object is complex and costly
 *
 * @author Daniel Mora Cantillo
 */
public class Main {
    public static void main(String[] args) {
        //Initial prices
        List<Product> productList = List.of(
                new Product.Builder()
                        .setName("Pc computer")
                        .setPrice(500.50)
                        .build()
                ,
                new Product.Builder()
                        .setName("Apple phone xs")
                        .setPrice(800)
                        .build()
                ,
                new Product.Builder()
                        .setName("Tablet samsung")
                        .setPrice(700)
                        .build()
        );

        Invoice invoice = new Invoice.Builder()
                .setName("Normal list")
                .setProductList(productList)
                .build();

        //Print initial list
        System.out.println(invoice.toString());

        //Print second object PriceList
        System.out.println( new Invoice.Builder()
                .setName("Preferential list")
                .setProductList(productList)
                .build());
        System.out.println(invoice.deepClone().toString());
    }
}