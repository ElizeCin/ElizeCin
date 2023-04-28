package org.example.DZ_7;

public abstract class Animals {

    private String name;

    public Animals(String name) {
        this.name = name;
    }

    abstract void greets();

    public String getName() {
        return name;
    }
}
