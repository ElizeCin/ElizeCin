package org.example.Lesson4_Animals;

public abstract class animalsMain {
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    private String name;
    private int age;

    public animalsMain(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void printName(){
        System.out.println(this.name);
    }
    public abstract int getSumDays();
}
