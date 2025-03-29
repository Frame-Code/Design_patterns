import java.util.List;

/**
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

        PriceList priceList = new PriceList.Builder()
                .setName("Normal list")
                .setProductList(productList)
                .build();

        //Print initial list
        System.out.println(priceList.toString());

        //Print second object PriceList
        System.out.println( new PriceList.Builder()
                .setName("Preferential list")
                .setProductList(productList)
                .build());
        System.out.println(priceList.deepClone().toString());
    }
}