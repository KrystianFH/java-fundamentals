package inheritance;

public class Shop extends Restaurant{

    private String description;

    public Shop(String name, String description, int price) {
        super(name, price);
        this.description = description;

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + this.getName() + '\'' +
                ", description='" + description + '\'' +
                ", price='" + this.getPrice() + '\'' +
                '}';
    }

    public String getDescription(){
        return description;
    }
}
