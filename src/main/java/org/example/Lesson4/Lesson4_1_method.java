package org.example.Lesson4;

public class Lesson4_1_method {
    public String name;
    public String lastName;
    public String sex;
    public int age;
    public boolean live;
    public String eyes;
    public void printInfo(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nEyes colour: " + eyes + "\nIs alive? " + live);
    }
    private int countDay(){
        return age*365;
    }

}
