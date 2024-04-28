package org.example.Lesson4;

public class Human {
    private String name;
    private int age;
    private String sex;
    private boolean live;

    public void setAge(int age) {
        if (age >= 18 && age <= 99) {
        this.age = age;
    }else {
            this.age=18;
        }
    }
    public void setLive (boolean live){
        this.live = live;
    }
    public String getName(){
        return name;  //vernet kopiu name
    }
    public int getAge() {
        return age;
    }


    public Human() {
        this.name="John Doe";
        this.age=30;
        this.sex="undefined";
        this.live=true;
    }
    public Human(String name, int age, String sex, boolean live) {
        this.name=name;
        setAge(age);
        this.sex=sex;
        this.live=true;
    }
    public void printInfo(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nIs alive? " + live);
    }
}