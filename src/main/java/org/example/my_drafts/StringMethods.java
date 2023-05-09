package org.example.my_drafts;

public class StringMethods {
    public static void main(String[] args) {
        String string = "animals";
//            System.out.println(string.substring(0, 5));
//        System.out.println(string);
        System.out.println((capitalize(string)));
        String sentence = "Hello my dear friend!";
        String[] words = sentence.split(" ");
        for (String l : words) {
            System.out.println(l);
        }
    }

    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring((1));
    }

}







