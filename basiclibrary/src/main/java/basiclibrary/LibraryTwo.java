package basiclibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class LibraryTwo {
    public boolean someLibraryMethod() {
        return true;
    }

    public String analyzeWeatherData (int[][] arr) {

        HashSet<Integer> tempSet = new HashSet<>();
        HashSet<String> oddtemps = new HashSet<>();

        for (int[] outer : arr) {
            for (int vals : outer) {
                tempSet.add(vals);
            }
        }

        int maxTemp = Collections.max(tempSet);
        int minTemp = Collections.min(tempSet);


        String tings = "High: " + maxTemp + "\n" +
                       "Low: " + minTemp + "\n";

        for(int i = minTemp; i < maxTemp; i++){
            if(!tempSet.contains(i) ){
                tings += "Never saw temp: " + i + "\n";
            }
        }
        System.out.println(tings);
        return tings;
    }

    public static String tally (List<String> votes){
        Set<String> uniquevotes = new HashSet<>(votes);

        int winNum = Integer.MIN_VALUE;
        String winString = "";

        for(String candidate : uniquevotes){
            int votesNum = Collections.frequency(votes, candidate);

            if(votesNum > winNum ){
                winString = candidate;
                winNum = votesNum;
            }
        }
        return winString;
    }
}
