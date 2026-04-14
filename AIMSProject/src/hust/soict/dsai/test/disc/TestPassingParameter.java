package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        String temp = o1.getTitle();
        o1.setTitle(o2.getTitle());
        o2.setTitle(temp);
    }

    public static void main(String[] args) {
        DigitalVideoDisc d1 = new DigitalVideoDisc("Jungle", "A", "A", 10, 1);
        DigitalVideoDisc d2 = new DigitalVideoDisc("Cinderella", "B", "B", 20, 2);

        swap(d1, d2);

        System.out.println(d1.getTitle());
        System.out.println(d2.getTitle());
    }
}