package org.example.Lessons1_2;
import java.util.Arrays;
import java.util.Random;
public class Lesson2_random {
    public static void main(String[] args) {
        int length = 20;
        int[] mass = new int[length];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }
        printMassive(mass);
    }

    private static void printMassive (int[] massive) {
        for (int i : massive) {
            System.out.print(i + " ");
            }
        }
    }


