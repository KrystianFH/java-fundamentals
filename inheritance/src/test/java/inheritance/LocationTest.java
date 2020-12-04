package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationTest {

    @Test public void testLocationToString(){
        Location test = new Location("Pizza Planet");
        assertEquals("Should print out location with default info", "Location{name='Pizza Planet', stars=0, reviewList=[]}", test.toString());
    }

    @Test public void testLocationConstructor(){
        Location test = new Location("Pizza Planet");
        assertEquals("Name should be set as Pizza Planet", "Pizza Planet", test.getName());
        assertEquals("Stars should default to zero", 0, test.getStars());
    }

    @Test public void testLocationAddReview(){
        Location test = new Location("Pizza Planet");
        test.addReview(new Review("Andy", "Just like my childhood memory", 4, test));
        assertEquals("This review should be at the beginning of reviewList", "Just like my childhood memory", test.getReviewList().getFirst().getBody());
        assertEquals("star rating updated", 4, test.getStars());
    }
}
