package NewZooApp;

public class ZooAnimal {

    private String name;
    private int age;


    public ZooAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduceYourself() {
        return "Jestem Zwierzeciem";
    }

    @Override
    public String toString() {
        return introduceYourself() +
                " imie '" + getName() + '\'' +
                ", wiek " + getAge();

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


}

