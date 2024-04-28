package org.example.Lesson3;

public class Lesson3_methods_return {
    public static void main(String[] args) {
        printInfo("Vasiliy", 34, "male");
    }
    public static void printInfo(String name){
        System.out.println(name);
    }
    public static void printInfo(String name, int age){
        System.out.println(name + " age " + age);
    }
    public static void printInfo(String name, int age, String sex){
        System.out.println(name + " age " + age + " sex " + sex);
    }
}
