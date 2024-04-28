package org.example.Lesson4_Animals;

public class Animals_psvm {
    public static void main(String[] args) {
        animalsMain animal = new animalsMain("Dzhungo", 3) {
            @Override
            public int getSumDays() {
                return 0;
            }
        };
        animal.printName();
        BirdNew bird =  new BirdNew("Chizhik", 2, false, "green");
        bird.printName();
        bird.fly();
        Mammal mammal = new Mammal(true, "red", 50);
        mammal.printName();
        Leopard leopard = new Leopard("Sherkhan", 33, "striped", 65, "male", "Bagira");
        System.out.println(leopard.getOwnerName());
        printName(bird);
        animal.printName();
    }
    private static void printName( animalsMain anyAnimal){
        anyAnimal.printName();
    }
}
