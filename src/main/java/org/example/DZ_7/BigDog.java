package org.example.DZ_7;

public class BigDog extends Dog {

    public BigDog(String name) {
    super(name);
    }

    @Override
    void greets() {
        System.out.println("Big dog " + getName() + " says Woooooooof");
    }

    @Override
    void greets(Dog another) {
        System.out.println("Big dog " + getName() + " says Wooooooooof to " + another.getName());
    }
}
