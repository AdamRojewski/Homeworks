package Lotto;

public class LottoApp {
    public static void main(String[] args) {

        int[] lottery = new int[6];
        int randomNum;

        for (int i = 0; i < 6; i++) {
            randomNum = (int) (Math.random() * 12);
            for (int j = 0; j < i; j++) {
                if (lottery[j] == randomNum) {
                    randomNum = (int) (Math.random() * 12);
                    j = -1;
                }
            }
            lottery[i] = randomNum;
        }
        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");
    }
}
