package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {

        Store store = new Store();

        DigitalVideoDisc d1 = new DigitalVideoDisc("A", "A", "A", 10, 1);
        DigitalVideoDisc d2 = new DigitalVideoDisc("B", "B", "B", 20, 2);

        store.addMedia(d1);
        store.addMedia(d2);

        store.removeMedia(d1);

        System.out.println("Done");
    }
}