package my.hillel.studies.lesson8;

public class Pult implements LG, Samsung {
    int volumeRate;
    boolean onOff;
    public void printInfo() {
        System.out.println("INFO");
    }

    @Override
    public void plus() {
        System.out.println("volume +1");

    }

    @Override
    public void minus() {

    }

    @Override
    public boolean powerOn() {
        System.out.println("power on");
        return false;
    }

    @Override
    public boolean powerOff() {
        return false;
    }

    @Override
    public boolean powerOffS() {
        return false;
    }

    @Override
    public void samsungMethodS() {

    }
}
