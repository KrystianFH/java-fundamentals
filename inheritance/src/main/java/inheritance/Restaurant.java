package inheritance;

import java.util.LinkedList;

public class Restaurant {

    public boolean someLibraryMethod() {
        return true;
    }


    protected String name;
    protected String price;
    protected int stars;
    LinkedList<Review> reviewList = new LinkedList<>();


    public Restaurant(String name, String price, int stars) {
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
                ", reviewList=" + reviewList +
                '}';
    }

    //    public String getName(){
//        return this.name;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public double getStars() {
//        return stars;
//    }

    public void addReview(Review review){
        reviewList.addFirst(review);
        updateStars();
    }

    private void updateStars(){
        int total = reviewList.stream().mapToInt(review -> review.stars).sum();
        stars = (total / reviewList.size());
    }
}




