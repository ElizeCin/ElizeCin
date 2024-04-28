package org.example.Lesson4_Animals;

import java.util.Objects;

public class Leopard extends Mammal {
    private String sex;
    private String ownerName;
    public String getOwnerName(){
        return ownerName;
    }

    public Leopard(String name, int age, String colour, int speed, String sex, String ownerName) {
        super(name, age, colour, speed);
        this.sex = sex;
        this.ownerName = ownerName;
    }
    public Leopard(){
        this("v", 34, "yellow", 44, "male", "Maugli");
    }
    public void printInfo(){
        System.out.println("Leopard Info");
    }
    @Override
    public void printName() {
        System.out.println("I am a leopard, my name is " + getName());
    }
}
