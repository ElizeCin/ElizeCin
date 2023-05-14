package org.example.my_drafts;
import java.util.*;

public class ShoppingList_v2 {
    public static void main(String[] args) {
        homework("milk, milk, water, butter, beer");
    }

    public static void homework(String str){
        Set<String> stringSet=new HashSet<>(Arrays.stream(str.replace(",", "").replace(".", "").split(" ")).toList());
        for (String string : stringSet) {
            System.out.println(string.substring(0, 1).toUpperCase() + string.substring(1));

        }
    }
}