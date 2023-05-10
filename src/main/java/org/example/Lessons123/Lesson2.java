package my.hillel.studies.Lessons123;

public class Lesson2 {
    public static void main(String[] args) {
        int[] massive = new int[10];
        int i = 3;
        char symbol;
        massive[3] = 98;
        System.out.println("#" + i + " " + massive[i]);
        double[] numbers2 = new double[]{1.0, 1.5, 3.6};
        char[] symbols = {'a', 'b', 'c', 'd'};
//       String[] words = {};
//       boolean;
        System.out.println(symbols[2]);
        symbols[2] = 'f';
        System.out.println(symbols[2]);
        symbol = symbols[2];
        int[][] matrix = new int[][]{
                {5, 6, 7},
                {3, 2, 1},
                {7, 8, 9}
        };
        System.out.println("=========matrix start======");
        System.out.println(matrix[0][1]);
    }
}








