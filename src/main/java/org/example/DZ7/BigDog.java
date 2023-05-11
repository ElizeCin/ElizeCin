package org.example.DZ7;

public class BigDog extends Dog {

    public BigDog(String name){
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Big dog " + getName() + " says Woooooof");
    }

    @Override
    void greets(Dog another) {
        System.out.println("Big dog " + getName() + " says Wooooooof to " + another.getName());;
    }
}
