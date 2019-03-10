package Animals;

public class OOPAnimals {

    public static void main(String[] args) {
        Mammal animal = new Mammal("krowa", 12, 13);
        Human human = new Human("Adam", 14, 15);
        Human human1 = new Human("Jusio", 23, 25);
        Dog dog = new Dog("Burek", 11, 34, human1);
        Cat cat = new Cat("Filemon", 5, 45, human);


        System.out.println(animal.toString());
        System.out.println(human1.toString());
        System.out.println(dog.toString());
        System.out.println(cat.toString());

    }

}
