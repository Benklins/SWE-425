import models.Product;
import models.CartLine;
import models.ShoppingCart;


public class ShoppingCartApp {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product tv = new Product("SA123", 100.0, "Samsung smart A431 TV");

        Product mp3Player = new Product("MP665", 75.0, "Samsung MP3 Player");

        Product headSet = new Product("HS665", 75.0, "Sony Head Set");

        CartLine tvCartLine = new CartLine(1, tv);
        CartLine mp3PlayerCartLine = new CartLine(1, mp3Player);
        CartLine headSetCartLine = new CartLine(2, headSet);

        cart.addCartLine(tvCartLine);
        cart.addCartLine(mp3PlayerCartLine);
        cart.addCartLine(headSetCartLine);
        cart.incrementCartLineQuantity(tvCartLine);
        cart.incrementCartLineQuantity(mp3PlayerCartLine);


        System.out.println(cart);

    }

}
