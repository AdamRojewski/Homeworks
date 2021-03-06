package UpdatedZooApp;

public abstract class AnimalsInTheZoo implements Introduction {
    private String name;
    private int age;

    @Override
    public String introduceYourself() {
        return "imie " + name + "wiek " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalsInTheZoo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
