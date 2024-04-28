package org.example.Lesson4;

public class Lesson_4_practice {
    public void colour() {
        System.out.println("Multicoloured");
    }
    public void speed(int speed) {
        System.out.println("Can fly at " + speed + " km");
    }

    public static void main(String[] args){
        Lesson_4_practice birds = new Lesson_4_practice();
        birds.colour();
        birds.speed(50);

    }
}
