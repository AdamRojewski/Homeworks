package Train;

import java.util.Arrays;

public class Train {


    private int weight;
    private String name;
    private int passengerNumber;
    private int cabinQuantity;
    private Cabin[] attachedCabin;

    public void attachCabin(Cabin oneCabin){
        if (getAttachedCabin() == null){
            setAttachedCabin(new Cabin[]{});
        }
        attachedCabin = Arrays.copyOf(attachedCabin, attachedCabin.length +1);
        attachedCabin [attachedCabin.length - 1] = oneCabin;
    }

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

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getCabinQuantity() {
        return cabinQuantity;
    }

    public void setCabinQuantity(int cabinQuantity) {
        this.cabinQuantity = cabinQuantity;
    }

    public Cabin[] getAttachedCabin() {
        return attachedCabin;
    }

    public void setAttachedCabin(Cabin[] attachedCabin) {
        this.attachedCabin = attachedCabin;
    }


    @Override
    public String toString() {
        return "Train " +
                "\n weight=" + weight +
                "\n name='" + name + '\'' +
                "\n passengerNumber=" + passengerNumber +
                "\n cabinQuantity=" + cabinQuantity +
                "\n attachedCabin=" + Arrays.toString(attachedCabin);


    }
}

