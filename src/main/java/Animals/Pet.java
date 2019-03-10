package Animals;

public class Pet extends Allanimals {
    private Human owner;

    public Pet(String name, int age, int weight, Human owner) {
        super(name, age, weight);
        this.owner = owner;
    }

    @Override
    public String introduceYourself() {
        return "Jestem zwierzeciem domowym";
    }

    @Override
    public String toString() {
        return introduceYourself() + "imie " + getName() + " wiek " +getAge() + " waga " + getWeight() + " wlasciciel to " + getOwner().getName() + " o wadze " + getOwner().getAge();
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}

