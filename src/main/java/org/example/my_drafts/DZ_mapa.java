package org.example.my_drafts;
import java.util.*;

public class DZ_mapa {
    public static void main(String[] args) {
        Map<Integer, Miyadzaki>  showMovie = new HashMap<>();
        showMovie.put(234, new Miyadzaki("Totoro", 1965));
        showMovie.put(567, new Miyadzaki("Howl", 1987));
        showMovie.put(34, new Miyadzaki("Mononoke", 1967));
        showMovie.put(123, new Miyadzaki("Spirited away", 1678));
        printInfo(showMovie);
        System.out.println(showMovie.keySet());
        printMovieInfo(showMovie.get(234));
    }


    public static void printInfo(Map<Integer, Miyadzaki> movieMap) {
        for(Map.Entry<Integer, Miyadzaki> l:movieMap.entrySet()) {
            System.out.println(l.getValue().getMovieName() + " " + l.getValue().getYear());
        }
    }

    public static void printMovieInfo(Miyadzaki miyadzaki) {
        miyadzaki.printInfo();
    }
}
