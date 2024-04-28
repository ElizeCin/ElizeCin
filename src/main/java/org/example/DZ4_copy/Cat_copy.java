package org.example.DZ4_copy;

public class Cat_copy extends Animal_copy {
    private String colour;
    public Cat_copy(String eats, int numberOfLegs, boolean vegetarian, String colour) {
        super(eats, numberOfLegs, vegetarian);
        this.colour = colour;
    }
    public Cat_copy (String eats, int numberOfLegs, boolean vegetarian){
        super(eats, numberOfLegs, vegetarian);
        colour = "red";
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String newColour) {
        this.colour = newColour;
    }
    public void printCat() {
        System.out.println("Is vegetarian? - " + isVegetarian() + "\nCat's menu: " +
                getEats() + "\nHow many legs? - " + getNumberOfLegs() + "\nCat's colour: " + getColour());
    }
}
