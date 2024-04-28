package org.example.Lessons1_2;

import java.util.Arrays;
import java.util.Random;

public class Lesson2_for_each {
    public static void main(String[] args) {
        int length=20;
        int[] mass = new int[length];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));

        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] % 2 == 0) {
                System.out.print( mass[i] + " ");
            }
        }

        for(int l:mass){
            System.out.print( l+ " + ");
        }
    }
}
