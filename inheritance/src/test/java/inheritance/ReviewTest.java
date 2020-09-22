package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test
    public void testReview() {
        Review test = new Review("Yummy Pizza", "Ricky Bobby", 4.8);
        assertEquals("Review" + "{body='Yummy Pizza', author='Ricky Bobby', stars=4.8}", test.toString());
    }

}
