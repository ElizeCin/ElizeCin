package org.example.lesson5_copy;

import org.example.Lesson4_Animals.Leopard;

public class lesson51 {
    public static void main(String[] args) {
        Leopard leo1 = new Leopard("Tomy", 5, "red", 50, "male", "Tais");
        Leopard leo2 = new Leopard("Tomy", 5, "red", 50, "male", "Tais");
        System.out.println(leo1==leo2);
        System.out.println(leo1.equals(leo2));

    }
}
