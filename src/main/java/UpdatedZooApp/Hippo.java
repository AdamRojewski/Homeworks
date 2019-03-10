package UpdatedZooApp;

public class Hippo extends AnimalsInTheZoo {

    public Hippo(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Hippo: " + "imie: " + getName() + " wiek: " + getAge();
    }
}
