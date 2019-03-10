package Tank;

public class Tank {


    private int weight;
    private String name;
    private double capacity;
    private double combustion;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    @Override
    public String toString() {
        return "Jestem czolgiem o masie " + weight +
                ", nazwie " + name +
                ", oraz spalam " + combustion +
                "L na 100 km";
    }

    public String fuelConsumption(double fuelLiters) {
        return "Zasieg czolgu wynosi " + fuelLiters * 100 / combustion + " km" + " przy " + fuelLiters + " litrach paliwa.";
    }

}
