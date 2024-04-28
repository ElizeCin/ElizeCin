package org.example.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Lesson4_1_method human = new Lesson4_1_method();
        human.name = "Vasiliy";
        human.age = 34;
        human.sex = "male";
        human.eyes = "green";
        human.live = true;
        Lesson4_1_method human1 = new Lesson4_1_method();
        human1.name = "Ihor";
        human1.age = 25;
        human1.sex= "male";
        human1.eyes = "blue";
//        System.out.println(human.name);
//        System.out.println(human1.name);
        human.printInfo();
        System.out.println("");
        human1.printInfo();
    }
}
