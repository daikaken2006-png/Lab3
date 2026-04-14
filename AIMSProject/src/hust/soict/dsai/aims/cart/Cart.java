package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private Media[] itemsOrdered = new Media[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addMedia(Media media) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = media;
        } else {
            System.out.println("Cart is full");
        }
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i]);
            total += itemsOrdered[i].getCost();
        }

        System.out.println("Total cost: " + total);
        System.out.println("***************************************************");
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media m : itemsOrdered) {
            if (m != null && m.isMatch(title)) {
                System.out.println(m);
                found = true;
            }
        }
        if (!found) System.out.println("Not found");
    }
}