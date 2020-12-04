package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test
    public void testReviewToString() {
        Review test = new Review("Yummy Pizza", "Ricky Bobby", 4);
        assertEquals("Review" + "{body='Yummy Pizza', author='Ricky Bobby', stars=4}", test.toString());
    }

    @Test public void testNewReview(){
        Review test = new Review("Just like my childhood memory", "Andy", 4);
        assertEquals("body should match review body", "Just like my childhood memory", test.body);
    }
}
