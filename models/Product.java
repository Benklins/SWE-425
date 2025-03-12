package models;

import java.util.Objects;

public class Product {
    private String productNumber;
    private final double price;
    String description;

    public Product(String productNumber, double price, String description) {
        super();
        this.productNumber = productNumber;
        this.price = price;
        this.description = description;
    }


    public String getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Double.compare(getPrice(),
                product.getPrice()) == 0 && Objects.equals(getProductNumber(), product.getProductNumber()) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductNumber(), getPrice(), description);
    }


}
