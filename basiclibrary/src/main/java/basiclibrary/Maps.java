package basiclibrary;

import java.util.*;

public class Maps {
    public boolean someLibraryMethod() {
        return true;
    }

    public String analyzeWeatherData (int[][] weatherData) {

        //    ================ Lab 3 'Analyze Weather Data' Revision Below =====================
        HashSet<Integer> uniqueTemperatures = new HashSet<>();
        String output = "";
        int lowValue = Integer.MAX_VALUE;
        int highValue = Integer.MIN_VALUE;

        for(int[] weeklyTemperatures : weatherData){
            for(int temperature : weeklyTemperatures){
                uniqueTemperatures.add(temperature);
                if(temperature < lowValue){
                    lowValue = temperature;
                } else if (temperature > highValue){
                    highValue = temperature;
                }
            }
        }

        output += "High Temp: " + Integer.toString(highValue) + "\n";
        output += "Low Temp: " + Integer.toString(lowValue);

        for(int n = lowValue + 1; n < highValue; n++){
            if(!uniqueTemperatures.contains(n)){
                output += "" + "\n";
                output += "Unseen temperature: " + Integer.toString(n);
            }
        }

        return output;
    }

    //    ================ Lab 3 'Tally' Revision Below =====================

    public static String tally (List<String> votes){
        HashMap<String, Integer> voteTally = new HashMap<>();

        for(String vote : votes) {
            int voteCount = voteTally.containsKey(vote) ? voteTally.get(vote) : 0;
            voteTally.put(vote, voteCount + 1);
        }

        int highestVotes = 0;
        String winner = "None";
        for(String candidate : voteTally.keySet()){
            if(voteTally.get(candidate) > highestVotes){
                winner = candidate;
                highestVotes = voteTally.get(candidate);
            }
        }
        return winner;
    }
}
