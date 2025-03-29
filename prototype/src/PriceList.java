import prototype.IPrototype;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel Mora Cantillo
 */
public class PriceList implements IPrototype<PriceList> {
    private String name;
    private List<Product> productList;

    private PriceList(Builder builder) {
        this.name = builder.name;
        this.productList = builder.productList;
    }

    @Override
    public PriceList clone() {
        return new PriceList.Builder()
                .setName(this.name)
                .setProductList(productList)
                .build();
    }

    @Override
    public PriceList deepClone() {
        return new PriceList.Builder()
                .setName(this.name)
                .setProductList(this.productList.stream().map(Product::clone).toList())
                .build();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }

    public static class Builder {
        private String name;
        private List<Product> productList;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setProductList(List<Product> productList) {
            this.productList = productList;
            return this;
        }

        public PriceList build() {
            return new PriceList(this);
        }
    }
}

