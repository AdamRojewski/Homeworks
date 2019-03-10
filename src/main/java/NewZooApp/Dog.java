package NewZooApp;

public  class Dog extends ZooAnimal {

    @Override
    public String introduceYourself() {
        return "Jestem psem";
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
