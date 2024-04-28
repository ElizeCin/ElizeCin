package org.example.lesson5_copy;
import org.example.Lesson4_Animals.BirdNew;
import org.example.Lesson4_Animals.Leopard;
import org.example.Lesson4_Animals.Mammal;
import org.example.Lesson4_Animals.animalsMain;

public class lesson52 {
    public static void main(String[] args) {
        BirdNew bird =  new BirdNew("Chizhik", 2, false, "green");
        Mammal mammal = new Mammal(true, "red", 50);
        Leopard leopard = new Leopard("Sherkhan", 33, "striped", 65, "male", "Bagira");
        animalsMain [] massive = new animalsMain[]{leopard, mammal, bird};
        printAgeInDay(massive);
    }
    public static void printAgeInDay(animalsMain[] animal) {
        for(animalsMain l:animal){
            System.out.println(l.getSumDays());
        }
    }
}
