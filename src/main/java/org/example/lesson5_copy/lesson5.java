package org.example.lesson5_copy;

import org.example.Lesson4_Animals.Leopard;

public class lesson5 {
    public static void main(String[] args) {
        Leopard leo = new Leopard("Tomy", 5, "red", 50, "male", "Tais");
        leo.printName();
        System.out.println(leo); //will show only: org.example.Lesson4_Animals.Leopard@4eec7777
    }
}
