package Train;

public class OOPfirstTrain {
    public static void main(String[] args) {
        Train train = new Train();
        Train train1 = new Train();

        Cabin cabin = new Cabin();
        cabin.setFood(true);
        cabin.setCabinClass(1);
        cabin.setPassengerNumber(15);
        cabin.setWeight(678);

        Cabin cabin1 = new Cabin();
        cabin1.setFood(false);
        cabin1.setCabinClass(2);
        cabin1.setPassengerNumber(16);
        cabin1.setWeight(765);


        train.setName("Kosciusko");
        train.setCabinQuantity(6);
        train.setPassengerNumber(134);
        train.setWeight(6578);
        train.attachCabin(cabin);
        train.attachCabin(cabin1);
       // train.attachCabin(cabin1); - mozna dodawac kolejne wagony do tego pociagu
        System.out.println(train.toString());

        System.out.println();

        train1.setName("Reymont");
        train1.setCabinQuantity(8);
        train1.setPassengerNumber(224);
        train1.setWeight(3253);
        train1.attachCabin(cabin1);
        System.out.println(train1.toString());
    }
}
