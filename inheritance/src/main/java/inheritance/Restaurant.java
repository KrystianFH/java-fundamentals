package inheritance;

public class Restaurant {

    public boolean someLibraryMethod() {
        return true;
    }


    protected String name;
    protected String price;
    protected double stars;


    public Restaurant(String name, String price, double stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stars=" + stars +
                '}';
    }

    public String getName(){
        return this.name;
    }

    public String getPrice() {
        return price;
    }

    public double getStars() {
        return stars;
    }

}




