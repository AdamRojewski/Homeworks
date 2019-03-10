package Animals;

public class Human extends Mammal {


    public Human(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String introduceYourself() {
        return "Jestem czlowiekiem ";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
