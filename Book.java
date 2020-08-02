public class Book {
    String title;
    int price;
    String kind;

    public Book(String title, int price, String kind) {
        this.title = title;
        this.price = price;
        this.kind = kind;
    }

    public String toString() {
        return "[" + title + " : " + price + "]";
    }
}
