package my.hillel.studies.interfaces;

public class Penguin implements Bird {

    @Override
    public void fly(int speed) {
        System.out.println("Doesnt fly");
    }

    @Override
    public void voice() {
        System.out.println("Penguin squiks");

    }

    @Override
    public void swims() {
        System.out.println("Penguin likes to swim a lot");
    }

    public void hasKids() {
        System.out.println("Males carry eggs");
    }
}
