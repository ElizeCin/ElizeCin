package org.example.DZ7;

public abstract class Animal {
    private String name;
    abstract void greets();


    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
