package org.example.my_drafts;
import java.util.HashMap;
import java.util.Map;

public class Mapa_2 {
    public static void main(String[] args) {
        Map<Integer,Human> humans = new HashMap<>();
        humans.put(2,new Human("Vasiliy", 34, "male"));
        humans.put(1, new Human());
        printInfo(humans);
        printHumanInfo(humans.get(2));
//        Map<String,Animal> showAnimal = new HashMap<>();
//        showAnimal.put("animal",new Animal("Cat"));
//        showAnimal.put("mammal",new Animal("Tiger"));
//        printAnimalInfo(showAnimal);

    }
    public static void printInfo(Map<Integer,Human> humanMap){
        for(Map.Entry<Integer,Human> l:humanMap.entrySet()){
            System.out.println(l.getValue().getName() + " " + l.getValue().getAge() + " " + l.getValue().getSex());
        }
    }
    public static void printHumanInfo(Human human) {
        human.printInfo();
    }


//    public static void printAnimalInfo(Map<String, Animal> animalMap){
//        for(Map.Entry<String, Animal> l:animalMap.entrySet()) {
//            System.out.println(l.getValue().getAnimalName());
//        }
//    }
}
