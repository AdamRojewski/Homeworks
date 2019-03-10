package Tank;

public class FirstTank {
    public static void main(String[] args) {

        Tank tank = new Tank();
        tank.setName("Rudy");
        tank.setWeight(100);
        tank.setCapacity(345);
        tank.setCombustion(34);
        System.out.println(tank.toString());
        System.out.println(tank.fuelConsumption(34.23));
    }
}
