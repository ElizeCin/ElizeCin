package org.example.Lesson4_Animals;

public class BirdNew extends animalsMain {
    private boolean ifFly;
    private String feathersColour;

    public BirdNew(String name, int age, boolean ifFly, String feathersColour) {
        super(name, age);
        this.ifFly = ifFly;
        this.feathersColour = feathersColour;
    }
    public void fly() {
        System.out.println(ifFly ? "I " + getName()+ " can fly" : "I " + getName() + " can't fly");
    }

    @Override
    public int getSumDays() {
        return getAge()*365*4;
    }
}
