package Animals;

public class Cat extends Pet {

    @Override
    public String introduceYourself() {
        return "Jestem kotem ";
    }

    public Cat(String name, int age, int weight, Human owner) {
        super(name, age, weight, owner);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
