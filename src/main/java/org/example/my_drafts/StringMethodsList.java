package org.example.my_drafts;
import java.util.*;

public class StringMethodsList {
    public static void main(String[] args) {
        String [] strings = new String[] {"qwe", "sdf", "ert", "ert"};

        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
//        stringList.add("ert");
        System.out.println(stringList);

        Set<String> stringSet = new TreeSet<>(stringList);
//        stringSet.add("ert");
//        stringSet.add("yui");
        System.out.println(stringSet);
    }
}
