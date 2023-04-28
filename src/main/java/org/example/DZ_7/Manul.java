package org.example.DZ_7;

public class Manul implements Pet, WildAnimal {

    private String manulName;

    public String getManulName() {
        return manulName;
    }

    public Manul(String manulName) {
        this.manulName = manulName;
    }

    @Override
    public void feed() {
        System.out.println("You can feed manul " + getManulName());

    }

    @Override
    public void play() {
        System.out.println("You can play with manul if it doesn't mind:)");
    }

    @Override
    public void walk() {
        System.out.println("Manul " + getManulName() + " walks on his own");
    }

    @Override
    public void hunting() {
        System.out.println("Manul " + getManulName() + " goes hunting every night");
    }
}



