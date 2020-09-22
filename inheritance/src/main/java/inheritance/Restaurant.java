package inheritance;

public class Restaurant {

    public boolean someLibraryMethod() {
        return true;
    }


    private String name;
    private String price;
    private double stars;


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
}




