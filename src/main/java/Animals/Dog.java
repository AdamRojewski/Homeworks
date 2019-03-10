package Animals;

public class Dog extends Pet {
    @Override
    public String introduceYourself() {
        return "Jestem psem ";
    }

    public Dog(String name, int age, int weight, Human owner) {
        super(name, age, weight, owner);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
