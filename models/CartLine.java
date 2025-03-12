package models;

import java.util.Objects;


public class CartLine {
    private int quantity;

    private final Product product;


    public CartLine(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;

    }


    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

    public int getQuantity() {
        return quantity;
    }

    private Product getProduct() {
        return product;
    }

    public double getCartLinePrice() {
        return product.getPrice() * quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CartLine cartLine)) return false;
        return getQuantity() == cartLine.getQuantity() && getProduct().equals(cartLine.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantity(), getProduct());
    }


    @Override
    public String toString() {

            return String.format("Product Number: %s\n UnitPrice: %.2f\n Quantity: %d\n Description: %s",
                    getProduct().getProductNumber(),
                    getProduct().getPrice(),
                    quantity,
                    getProduct().getDescription());

    }
}




