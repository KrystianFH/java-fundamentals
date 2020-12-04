package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RestaurantTest {
    @Test public void testRestaurantToString() {
        Restaurant test = new Restaurant("Pizza Planet", 1);
        assertEquals("should print Pizza Planet with one dollar sign", "Restaurant{name='Pizza Planet', price='$', stars=0, reviewList=[]}", test.toString());
    }

    @Test public void testRestaurantConstructor(){
        Restaurant test = new Restaurant("Pizza Planet", 1);
        assertEquals("price should output as '$'", "$", test.getPrice());
        assertEquals("name field should be set to 'Pizza Planet'", "Pizza Planet", test.getName());
    }

    @Test public void testAddTheaterReview(){
        Restaurant test = new Restaurant("Pizza Planet", 1);
        Review testReview = new Review("Andy", "Yummy", 5, test);
        test.addReview(testReview);
        assertEquals("Andy's Yummy review should populate first in list", "Andy", test.getReviewList().getFirst().getAuthor());
        TheaterReview testTheaterReview = new TheaterReview("June", "Not bad", 3, test, "Toy Story");
        assertThrows("Exception should be thrown", Exception.class, () -> test.addReview(testTheaterReview));

    }
}
