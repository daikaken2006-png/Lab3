package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private Media[] itemsInStore = new Media[100];
    private int qty = 0;

    public void addMedia(Media media) {
        itemsInStore[qty++] = media;
    }

    public void removeMedia(Media media) {
        for (int i = 0; i < qty; i++) {
            if (itemsInStore[i] == media) {
                for (int j = i; j < qty - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[--qty] = null;
                break;
            }
        }
    }
}