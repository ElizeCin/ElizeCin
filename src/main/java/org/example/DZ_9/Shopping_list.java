package org.example.DZ_9;

import java.util.*;

public class Shopping_list {

    public static void main(String[] args) {
        print("butter, butter, milk, sausages, chocolate");
    }

    public static void print(String shoppingList) {
        String[] myShopping = shoppingList.replace(",","").split(" ");
        Set<String> something = new HashSet<>(Arrays.asList(myShopping));
        for (String s : something) {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        }
    }
}















