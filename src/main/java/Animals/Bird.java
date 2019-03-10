package Animals;

public class Bird extends Pet {

    @Override
    public String introduceYourself() {
        return "Jestem ptakiem";
    }

    public Bird(String name, int age, int weight, Human owner) {
        super(name, age, weight, owner);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
