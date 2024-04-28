package org.example.DZ4_copy;

public class Animal_copy {
    private String eats;
    private int numberOfLegs;  
    private boolean vegetarian;

    public Animal_copy() {
    }
    public Animal_copy (String eats, int numberOfLegs, boolean vegetarian) {
        this.eats = eats;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    public void setEats (String newEats){
        this.eats= newEats;
    }
    public void setNumberOfLegs (int newNumberOfLegs) {
        this.numberOfLegs = newNumberOfLegs;
    }
    public void setVegetarian (boolean newVegetarian) {
        this.vegetarian = newVegetarian;
    }
}
