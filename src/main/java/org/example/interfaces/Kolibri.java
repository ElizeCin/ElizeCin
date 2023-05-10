package my.hillel.studies.interfaces;

public class Kolibri implements Bird {

    @Override
    public void fly(int speed) {
        System.out.println("KOlibri flies with speed: " + speed);
    }

    @Override
    public void voice() {
        System.out.println("Has very nice voice");
    }
    @Override
    public void swims() {
        System.out.println("Kolibri doesnt swim");
    }
}
