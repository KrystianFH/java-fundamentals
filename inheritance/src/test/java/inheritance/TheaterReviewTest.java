package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterReviewTest {
    @Test
    public void testTheaterReviewToString(){
        TheaterReview test = new TheaterReview("Roz", "Fell asleep", 1, new Theater("Galaxy"), "A Star War");
        assertEquals("Should print in String", "TheaterReview{location='Galaxy', author='Roz', stars=1, movie='A Star War', body='Fell asleep'}", test.toString());
    }

    @Test public void testTheaterReviewConstructor(){
        TheaterReview test = new TheaterReview("Roz", "Fell asleep", 1, new Theater("Galaxy"), "A Star War");
        assertEquals("Author should be set", "Roz", test.getAuthor());
        assertEquals("Movie should be set", "A Star War", test.getMovie());
    }
}
