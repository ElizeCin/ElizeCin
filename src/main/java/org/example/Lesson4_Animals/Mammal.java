package org.example.Lesson4_Animals;

public class Mammal extends animalsMain {
    boolean predator;
    String colour;
    int speed;

    public Mammal(String name, int age, String colour, int speed) {
        super(name, age);
        this.colour = colour;
        this.speed = speed;
    }

    public Mammal(String name, int age, boolean predator, String colour, int speed) {
        super(name, age);
        this.predator = predator;
        this.colour = colour;
        this.speed = speed;
    }

    public Mammal(boolean predator, String colour, int speed){
        super("John", 5);
        this.predator=predator;
        this.colour=colour;
        this.speed=speed;
    }
    public void move(){
        System.out.println("I can move");
    }

    @Override
    public int getSumDays() {
        return getAge()*365*2;
    }
}
