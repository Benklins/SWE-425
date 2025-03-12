package models;

import java.util.ArrayList;


import java.util.List;

public class ShoppingCart {
    private final List<CartLine> cartLines;


    public ShoppingCart() {
        cartLines = new ArrayList<>();
    }


    public double totalPrice() {
        double total = 0;
        for (CartLine cartLine : cartLines) {
            total += cartLine.getCartLinePrice();
        }
        return total;
    }


    public void decrementCartLineQuantity(CartLine cartLine) {
        if (cartLines.contains(cartLine)) {
            cartLine.decrementQuantity();
        }
    }


    public void incrementCartLineQuantity(CartLine cartLine) {
        if (cartLines.contains(cartLine)) {
            cartLine.incrementQuantity();
        }
    }


    public void addCartLine(CartLine cartLine) {
        cartLines.add(cartLine);
    }

    public void removeCartLine(CartLine cartLine) {
        cartLines.remove(cartLine);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("""
                    \s
                     Shopping Cart Details
                 _______________________________
                \s""");

        for (CartLine cartLine : cartLines) {
            builder.append(cartLine).append("\n\n");

        }
        builder.append("__________Total Price: ").append(totalPrice()).append("\n");
        return builder.toString();
    }



}
