package my.hillel.studies.DZ7;

public class AnimalShelter {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        greets(cat);
        feed(cat);
        walk(cat);
        play(cat);

        Dog dog = new Dog("Karat");
        feed(dog);
        walk(dog);
        play(dog);

        dog.greets();

        Dog another = new Dog("Spyke");
        another.greets(dog);

        BigDog big = new BigDog("Bujvol");
        big.greets();

        BigDog another1 = new BigDog("Beethoven");
        another1.greets(dog);

        BigDog another2 = new BigDog("Beethoven");
        another2.greets(big);


        Lion lion = new Lion("Simba");
        greets(lion);
        hunting(lion);


        Wolf wolf = new Wolf("Akela");
        greets(wolf);
        hunting(wolf);

    }

    private static void feed(Pet pet) {
        pet.feed();
    }

    private static void walk(Pet pet) {
        pet.walk();
    }

    private static void play(Pet pet) {
        pet.play();
    }

    private static void greets(Cat cat) {
        cat.greets();
    }

    private static void greets(Dog dog) {
        dog.greets();
    }

    private static void greets(BigDog big) {
        big.greets();
    }

    private static void greets(Lion lion) {
        lion.greets();
    }

    private static void greets(Wolf wolf) {
        wolf.greets();
    }

    private static void hunting(WildAnimal wildAnimal) {
        wildAnimal.hunting();
    }

}