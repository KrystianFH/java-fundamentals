package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test public void testTheaterToString(){
        Theater test = new Theater("Galaxy");
        test.addMovie("Toy Story II");
        assertEquals("Theater and movie should print in String", "Theater{name='Galaxy', moviesShowingList=[Toy Story II]}", test.toString());
    }

    @Test public void testTheaterConstructor(){
        Theater test = new Theater("Galaxy");
        assertEquals("Name of the theater should be set", "Galaxy", test.getName());
    }

    @Test public void testAddMovie(){
        Theater test = new Theater("Galaxy");
        test.addMovie("Toy Story II");
        assertTrue("The moviesShowingList should contain the movie", test.getMoviesShowingList().contains("Toy Story II"));
    }

    @Test public void testRemoveMovie(){
        Theater test = new Theater("Galaxy");
        test.addMovie("Toy Story");
        test.addMovie("Toy Story II");
        test.addMovie("Toy Story III");
        test.removeMovie("Toy Story");
        assertFalse("Toy Story should not be in our list", test.getMoviesShowingList().contains("Toy Story"));
    }
}
