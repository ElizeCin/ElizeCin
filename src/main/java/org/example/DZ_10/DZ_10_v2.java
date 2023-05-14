package org.example.DZ_10;

import java.util.*;

public class DZ_10_v2 {
    public static void main(String[] args) {
        Map<Integer, String> miyadzaki = new HashMap<>();
        miyadzaki.put(1987, "Totoro");
        miyadzaki.put(1995, "Princess Mononoke");
        miyadzaki.put(1992, "Howl's flying castle ");
        miyadzaki.put(1989, "Spirited away");
        printSortedMap(miyadzaki);

    }

   public static void printSortedMap(Map<Integer, String> map) {
        Set<Integer> integerSet = new TreeSet<>(map.keySet());
        for (Integer integer : integerSet) {
            System.out.println(integer + " = " + map.get(integer));
        }

    }
}
