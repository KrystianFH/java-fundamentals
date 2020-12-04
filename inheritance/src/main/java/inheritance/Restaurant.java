package inheritance;

import java.util.LinkedList;

public class Restaurant extends Location{

    public boolean someLibraryMethod() {
        return true;
    }

    private int price;

    public Restaurant(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + this.getName() + '\'' +
                ", price='" + this.getPrice() + '\'' +
                ", stars=" + this.getStars() +
                ", reviewList=" + this.getReviewList() +
                '}';
    }



    public String getPrice() {
        String outputDSigns = "";
        for (int i=0; i < price; i++){
            outputDSigns += '$';
        }
        return outputDSigns;
    }


    public void addReview(TheaterReview review) throws Exception{

        System.out.println(String.format("Theater Reviews not accepted by %ss.", this.getClass().getSimpleName()));
        throw new Exception("Movie reviews not accepted");
    }
}




