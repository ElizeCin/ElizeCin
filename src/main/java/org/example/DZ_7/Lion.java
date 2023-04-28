package org.example.DZ_7;

public class Lion extends Animals implements WildAnimal {

    public Lion(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Lion " + getName() + " says Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Lion " + getName() + " goes hunting");
    }
}
