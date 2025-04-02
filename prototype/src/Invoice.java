import prototype.IPrototype;

import java.util.List;

/**
 * This is a class to implement the interface IPrototype to become this class cloneable
 * Is a composite class to exemplify a deep clone.
 * Deep clone: If the class have relations with other classes (objects in this class) this object is cloned
 * and every relation is cloned, the new object creates new memory direction each relation (object).
 * All attributes that are not relations (simples variables) is cloned.
 *
 * Graphic example:
 *                  --> object 1                                          --> object 1
 *                /                                                     /
 * object product --> simple variable   ---deepClone()--->    Product cloned --> simple variable cloned
 *               \                                                     \
 *                --> object 3                                          --> object 2
 *
 * In this case this class have relations, but that reason the method deepClone()
 * set a new ProductList when each object of the list is cloned
 *
 * @author Daniel Mora Cantillo
 */
public class Invoice implements IPrototype<Invoice> {
    private String title;
    private List<Product> productList;

    private Invoice(Builder builder) {
        this.title = builder.title;
        this.productList = builder.productList;
    }

    @Override
    public Invoice clone() {
        return new Invoice.Builder()
                .setName(this.title)
                .setProductList(productList)
                .build();
    }

    @Override
    public Invoice deepClone() {
        return new Invoice.Builder()
                .setName(this.title)
                .setProductList(this.productList.stream().map(Product::clone).toList())
                .build();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return Integer.toString(System.identityHashCode(this)) + " - PriceList{" +
                "title='" + title + '\'' +
                ", productList=" + productList +
                '}';
    }

    public static class Builder {
        private String title;
        private List<Product> productList;

        public Builder setName(String title) {
            this.title = title;
            return this;
        }

        public Builder setProductList(List<Product> productList) {
            this.productList = productList;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}

