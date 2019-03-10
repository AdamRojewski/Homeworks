package Lotto;

import java.util.Random;
import java.util.Scanner;

public class NewLottoApp {
    public static void main(String[] args) {


        // check if user types numbers,  wypisac ile user trafil liczb. Dorobic opcje szczesliwego numerka.
        // Czyli dwie opcje gry, jedna, ze gramy normalne lotto, druga to szczesliwy numerek.


        int[] winningNumbers = new int[6];
        int[] customerNumbers = new int[6];
        Scanner theNumbers = new Scanner(System.in);
        int guesses;
        int counter = 0;


        System.out.println("Input 6 numbers");
        for (int i = 0; i < customerNumbers.length; i++) {
            guesses = theNumbers.nextInt();
            customerNumbers[i] = guesses;
            // System.out.println(customerNumbers[i]);

            if (winningNumbers[i] == customerNumbers[i]) {
                counter += 1;
            }
        }


        if (counter == 6) {
            System.out.println("You won");
        } else
            System.out.println("You lost.");
        System.out.println("Please see winning numbers");


        for (int i = 0; i < winningNumbers.length; i++) {
            int randomNumbs = new Random().nextInt(12) + 1;
            winningNumbers[i] = randomNumbs;
            System.out.println(winningNumbers[i]);
        }
    }


}
