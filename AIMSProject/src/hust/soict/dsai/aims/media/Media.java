package hust.soict.dsai.aims.media;

public class Media {
    protected String title;
    protected String category;
    protected float cost;

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    @Override
    public String toString() {
        return title + " - " + category + " - " + cost + "$";
    }
}