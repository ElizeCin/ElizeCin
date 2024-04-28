package org.example.Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(sumNumbers("Viva", 2, 5, 6, 7, 77, 777));
    }
    static int sumNumbers(int... numbers) {
        int sum=0;
        for(int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }

    static int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }

    static int sumNumbers(String in, int... numbers){
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }
}
