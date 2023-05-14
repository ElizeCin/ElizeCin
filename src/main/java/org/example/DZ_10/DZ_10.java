package org.example.DZ_10;
import java.util.*;

public class DZ_10 {
    public static void main(String[] args) {
        Map<Integer, String> miyadzaki = new HashMap<>();
        miyadzaki.put(1987, "Totoro");
        miyadzaki.put(1995, "Princess Mononoke");
        miyadzaki.put(1992, "Howl's flying castle ");
        miyadzaki.put(1989, "Spirited away");
        printMoviesNames(miyadzaki);
    }

    public static void printMoviesNames (Map<Integer, String> map) {
        Map<Integer, String> newMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> movie : newMap.entrySet()) {
            System.out.println(movie.getKey() + " = " + movie.getValue());
        }
    }
}


