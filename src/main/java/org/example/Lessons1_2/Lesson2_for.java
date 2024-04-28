package org.example.Lessons1_2;

public class Lesson2_for {
    public static void main(String[] args) {
        int[] mass = new int[]{1,2,4,6,7,8,9,3,55,66};
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i+" element = "+mass[i]);
        }
        for (int i = mass.length-1; i>=0; i--) {
            System.out.println(i + 1 + " element = " + mass[i]);
        }
    }
}
