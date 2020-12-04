package inheritance;

import java.util.HashSet;

public class Theater extends Location {

    private HashSet<String> moviesShowingList = new HashSet<>();

    public Theater(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + this.getName() + '\'' +
                ", moviesShowingList=" + moviesShowingList +
                '}';
    }

    public void addMovie(String movie){
        moviesShowingList.add(movie);
    }

    public void removeMovie(String movie){
        moviesShowingList.remove(movie);
    }

    public HashSet<String> getMoviesShowingList(){
        return moviesShowingList;
    }
}
