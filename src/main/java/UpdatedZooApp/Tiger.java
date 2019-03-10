package UpdatedZooApp;

public class Tiger extends AnimalsInTheZoo {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Tiger: " + "imie: " + getName() + ", wiek: " + getAge();
    }
}
