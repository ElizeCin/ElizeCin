package my.hillel.studies.Lessons123;

public class DZ3_calculator {

    public static void main(String[] args) {
        double result = calculate(200, 0, "/");
        System.out.println(result);
    }
    public static double calculate(int number, int number2, String symbol) {
        double result = 0;
        switch (symbol) {
            case "+":
                result= sum(number,number2);
                break;
            case "-":
                result= minus(number,number2);
                break;
            case "*":
                result=multiply(number,number2);
                break;
            case "/":
                if (number2 != 0) {
                    result = division(number,number2);
                } else {
                    System.out.println("Error: division by 0 impossible");
                    System.exit(0);
                }
                break;
            case "%":
                result=percent(number,number2);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        return result;
    }
    private static int sum(int number, int number2) {
        return number+number2;
    }
    private static int minus(int number, int number2) {
        return  number-number2;
    }
    private static int multiply(int number, int number2) {
        return  number*number2;
    }
    private static double division(double number, double number2) {
        return  number/number2;
    }
    private static int percent(int number, int number2) {
        return  number/100 *number2;
    }
}
