package NewZooApp;

import HomeworkFoodForAnimals.Animal;

public class ZooApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Zoo");
        Hamster hamster = new Hamster("Chomiczek", 23);
        Cat cat = new Cat("Filemon", 15);
        Dog dog = new Dog("Burek", 12);


        AnimalsInZoo animalsInZoo = new AnimalsInZoo();
        animalsInZoo.showMeAnimals();


        System.out.println(hamster.toString());
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}
