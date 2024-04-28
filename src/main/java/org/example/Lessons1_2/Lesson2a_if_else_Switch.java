package my.hillel.studies.Lessons123;

public class Lesson2a_if_else_Switch {
    public static void main(String[] args) {
        int h = 5;
        if (h > 12 && h < 19) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }

        String str="fgh";
        switch (str) {
            case "Vasiliy":
                System.out.println("Hello Vasiliy");
                break;
            case "Sharik":
                System.out.println("Sharik is a dog");
                break;
            default:
                System.out.println("No such string variable");
                break;
        }
    }
}

// If-else i Ternary expression
