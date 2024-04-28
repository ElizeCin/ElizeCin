package org.example.Lesson3;

public class Lesson3_calculator {
    public static int calculate(int number1, int number2, String symbol){
        int result = 0;
        switch (symbol){
            case "+":
                result = sum(number1, number2);
            break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        return result;
    }
    private static int sum(int number1, int number2){
        return number1 + number2;

    }
}
