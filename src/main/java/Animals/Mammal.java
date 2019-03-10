package Animals;

public class Mammal extends Allanimals {

    public Mammal(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return introduceYourself()+ "imie " + getName() + " wiek " + getAge()+ " waga " + getWeight();
    }

    @Override
    public String introduceYourself() {
        return "Jestem ssakiem ";
    }

}
