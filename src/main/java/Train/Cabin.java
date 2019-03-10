package Train;

public class Cabin {
    @Override
    public String toString() {
        return "Cabin{" +
                "weight=" + weight +
                ", cabinClass=" + cabinClass +
                ", passengerNumber=" + passengerNumber +
                ", isFood=" + foodAvailability +
                '}';
    }

    private int weight;
    private int cabinClass;
    private int passengerNumber;
    private boolean foodAvailability;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(int cabinClass) {
        this.cabinClass = cabinClass;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public boolean isFoodAvailability() {
        return foodAvailability;
    }

    public void setFood(boolean foodAvailability) {
        this.foodAvailability = foodAvailability;
    }
}
