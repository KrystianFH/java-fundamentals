package inheritance;

public class Review extends Restaurant{

    private String body;
    private String author;
    private double stars;



    public Review(String name, String price, double stars) {
        super(name, price, stars);
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
