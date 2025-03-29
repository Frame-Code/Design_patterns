import prototype.IPrototype;

/**
 * @author Daniel Mora Cantillo
 */
public class Product implements IPrototype<Product> {
    private String name;
    private double price;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    @Override
    public Product clone() {
        return new Product.Builder()
                .setName(this.name)
                .setPrice(this.price)
                .build();
    }

    @Override
    public Product deepClone() {
        return clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Integer.toString(System.identityHashCode(this)) + " - Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String name;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
