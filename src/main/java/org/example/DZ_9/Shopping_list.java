package org.example.DZ_9;

import java.util.*;

public class Shopping_list {

    public static void main(String[] args) {
        shoppingList("butter, butter, milk, sausages, chocolate");
    }

    public static void shoppingList(String shop) {
        String[] myshopping = shop.replace(",", "").replace(".","").split(" ");
        Set<String> something = new HashSet<>(Arrays.asList(myshopping));
        for (String s : something) {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        }
    }
}















