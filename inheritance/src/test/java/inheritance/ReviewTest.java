package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test public void testReviewToString(){
        Location test = new Location("Pizza Planet");
        Review testReview = new Review("Nich", "So good.", 4, test);
        assertEquals("Review should print out in String", "Review{author='Nich', body='So good.', stars=4, location=Pizza Planet}", testReview.toString());
    }

    @Test
    public void testAddNewReview() {
        Location test = new Location("Pizza Planet");
        Review testReview = new Review("Nich", "So good.", 4, test);
        assertEquals("Andy should be set as the review's author", "Nich", testReview.getAuthor());
        assertEquals("This review should be added to the review list", testReview, test.getReviewList().getFirst());
        assertEquals("the body of the review should be set", "So good.", testReview.getBody());
    }
}
