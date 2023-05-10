package my.hillel.studies.DZ_4;

public class Animal {
    private boolean vegetarian;
    private int noOfLegs;
    private String eats;

    public Animal() {
    }
        public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }
    //Getters
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
    //Setters
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public void setEats(String newEats) {
        this.eats = newEats;
    }
    public void setNoOfLegs(int newNoOfLegs) {
        this.noOfLegs = newNoOfLegs;
    }
}
