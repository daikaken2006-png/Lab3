package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Media m1 = new DigitalVideoDisc("Lion King", "Animation", "Roger", 90, 19.95f);
        Media m2 = new DigitalVideoDisc("Star Wars", "Sci-fi", "Lucas", 120, 24.95f);

        cart.addMedia(m1);
        cart.addMedia(m2);

        cart.print();

        System.out.println("Search:");
        cart.searchByTitle("star");
    }
}