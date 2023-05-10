package my.hillel.studies.DZ_4;

public class Cat extends Animal{
    private String colour;

    public Cat(boolean vegetarian, String eats, int noOfLegs, String colour) {
        super(vegetarian, eats, noOfLegs);
        this.colour = colour;
    }
    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        colour = "black";
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void printCatInfo() {
        System.out.println("Is vegetarian? - " + isVegetarian() + "\nCat's menu: " + getEats() + "\nHow many legs? - " + getNoOfLegs() + "\nCat's colour: " + getColour());
    }
}
