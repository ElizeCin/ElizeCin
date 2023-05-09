package org.example.my_drafts;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> info = new HashMap<>();
        info.put("name", "BIll");
        info.put("phone", "222333444");
        info.put("address", "Kyiv");
        System.out.println(info);
//        info.clear();
        info.put("name", "Vasil");
        info.put("names", "someone");
        System.out.println(info.put("names", "Liza"));
        System.out.println(info);
        System.out.println("isEmpty = " + info.isEmpty());
        System.out.println(info.size());
        System.out.println(info.containsValue("Liza"));
        String str = info.get("name").toUpperCase();
        System.out.println(info.get("name").toUpperCase());
        System.out.println(info.remove("name"));
        System.out.println(info.keySet());
        System.out.println(info.values());
        for(Map.Entry<String, String> l:info.entrySet()) {
            System.out.println(l);
            System.out.println(l.getValue().toUpperCase());
            l.setValue("Vasiliy");
        }
        System.out.println(info);
    }
}
