package NewZooApp;

public  class Hamster extends ZooAnimal{

    @Override
    public String introduceYourself() {
        return "Jestem chomikiem";
    }

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
