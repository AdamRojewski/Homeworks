package NewZooApp;

public  class Cat extends ZooAnimal {

    @Override
    public String introduceYourself() {
        return "Jestem kotem";
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

