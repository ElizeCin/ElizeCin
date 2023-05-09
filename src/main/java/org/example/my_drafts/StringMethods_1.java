package org.example.my_drafts;

import java.util.ArrayList;

public class StringMethods_1 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("hawk");
//        list.add(true);
//        System.out.println(list); // [hawk, true]
//        for (Object l:list){
//            if(l instanceof String str){
//                System.out.println(str.toUpperCase());
//            }
//        }

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        safer.add("true");
        System.out.println(safer.size());

//        for(String l:safer) {
//            System.out.println(l);
//        }

        safer.add(String.valueOf(true));
        System.out.println(safer.size());
//        safer.remove("true");  //removes only first true
        System.out.println("="+ safer.remove("true"));
        System.out.println("-" +safer.remove(0));
    }
}
