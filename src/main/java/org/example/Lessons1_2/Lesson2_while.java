package org.example.Lessons1_2;

import java.util.Random;

public class Lesson2_while {
    public static void main(String[] args) {
        int length=10;
        int[] mass=new int[length];
        Random random= new Random();
        while (length>0) {
            mass[length-1]= random.nextInt(20);
            length--;
        }
        int i=0;
        while (i< mass.length){
            System.out.print(mass[i]+" ");
            i++;
        }
        System.out.println("");
        int t=0;
        do{
            System.out.print(mass[t]+" ");
            t++;
        } while (t<mass.length);
    }
}