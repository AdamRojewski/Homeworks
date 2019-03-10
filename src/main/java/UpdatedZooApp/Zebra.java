package UpdatedZooApp;

public class Zebra extends AnimalsInTheZoo {

    @Override
    public String introduceYourself() {
        return "Zebra: " + "imie: " + getName() + "wiek: " + getAge();
    }

    public Zebra(String name, int age) {
        super(name, age);

    }
}
