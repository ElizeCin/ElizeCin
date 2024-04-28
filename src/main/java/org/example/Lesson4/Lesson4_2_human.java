package org.example.Lesson4;

public class Lesson4_2_human {
    public static void main(String[] args) {
        int i = 25;
        Human human = new Human("Viktoria", i, "female", true);
        human.printInfo();
        System.out.println("==========");

        Human human1 = new Human("Viktor", 12333, "male", true);
        human1.printInfo();
        System.out.println("==========");

        Human human2=new Human();
        human2.printInfo();
        System.out.println("==========");

//        human.name="Ihor";
        System.out.println(human2.getName());

    }
}
