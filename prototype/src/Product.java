import prototype.IPrototype;

/**
 * This is a class to implement the interface IPrototype to become this class cloneable
 * Is a simple class to exemplify a simple clone.
 * Simple clone: If the class have relations with other classes (objects in this class) this object is cloned
 * but that relations (objects) are not cloned, the new object only points in the same memory direction of the principal object.
 * All attributes that are not relations (simples variables) is cloned.
 *
 * Graphic example:
 *                  --> object 1 <----------------------------
 *                /                                           \
 * object product --> simple variable       --clone()-->      Product cloned --> simple variable cloned
 *               \                                           /
 *                --> object 2 <----------------------------
 *
 * But in this case this class doesn't have relations, all attributes are simples, for that reason
 * the method deepClone() just call to the method clone.
 *
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
