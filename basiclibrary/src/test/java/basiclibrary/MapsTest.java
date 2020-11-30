package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapsTest {
    @Test public void testWeatherData() {
        Maps test = new Maps();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

      String expectedOutputs = "High Temp: 72\n" +
              "Low Temp: 51\n" +
              "Unseen temperature: 63\n" +
              "Unseen temperature: 67\n" +
              "Unseen temperature: 68\n" +
              "Unseen temperature: 69";

      assertEquals(expectedOutputs, test.analyzeWeatherData(weeklyMonthTemperatures));
    }

    @Test public void testTally() {
        Maps test2 = new Maps();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        assertEquals("Expected Winner is 'Bush'", "Bush", test2.tally(votes));
        assertEquals("Expected Winner is 'None'", "None", test2.tally(new ArrayList<String>()));

    }
}
