package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RestaurantTest {
    @Test public void testRestaurantToString() {
        Restaurant test = new Restaurant("Pizza Planet", "$", 4);
        assertEquals("Restaurant" + "{name='Pizza Planet', price='$', stars=4}", test.toString());
    }

    @Test public void testRestaurantAddReview(){
        Restaurant test = new Restaurant("Pizza Planet", "$", 4);
        test.addReview(new Review("Just like my childhood memory", "Andy", 4));
        assertEquals("This review should be at the beginning of reviewList", "Just like my childhood memory", test.reviewList.getFirst().body);
        assertEquals("star rating updated", 4, test.stars);
    }
}
