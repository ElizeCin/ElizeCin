package my.hillel.studies.Lessons123;

import java.util.Arrays;
import java.util.Random;

public class Lesson_2_task {
    public static void main(String[] args) {

// 1 Cоздать массив типа int из 20 елементов.
        int length = 20;
        int[] cinnamon = new int[length];
        Random random = new Random();
        for (int i = 0; i < cinnamon.length; i++) {
            cinnamon[i] = random.nextInt(-100, 100);
        }
        String numbers = Arrays.toString(cinnamon);
        System.out.println();
        System.out.println("1)Show me 20 random numbers between -100 and 100:");
        System.out.println(numbers);

// 2   Bывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
        System.out.println();
        System.out.println("2)All numbers between 5 and 45:");
        int sum = 0;
        for (int i : cinnamon) {
            if (i >= 5 && i <= 45) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Their sum:" + sum);
        System.out.println();

// 3  Bывести в консоль все четные положительные числа.
        System.out.println("3)Show me all even numbers:");
        for (int i = cinnamon.length - 1; i >= 0; i--) {
            if (cinnamon[i] % 2 == 0) {
                System.out.print(cinnamon[i] + " ");
            }
        }
    }
}
