package CirleCrossAndRocks;

import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors {

    private static String[] anArray = new String[]{"scissors", "paper", "rock"};
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static int playerPoints;
    private static int computerPoints;

    private enum Move {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        welcomeMenu();
        personTurn();
        computerTurn();
        continueGame();
    }

    private static void welcomeMenu() {
        System.out.println("Hi, let's start the game!");
    }

    private static void whoWonTheTurn(){

    }



    private static void checkWhoWon() {
        if (computerPoints == 3) {
            System.out.println("Computer won!");
            System.exit(0);
        } else if (playerPoints == 3) {
            System.out.println("You won!");
            System.exit(0);
        }
    }

    private static Move personTurn() {
        System.out.println("paper / rock / scissors ?");
        String choice = scanner.nextLine();
        choice = choice.toUpperCase();
        char firstLetter = choice.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
            switch (firstLetter) {
                case 'R':
                    return Move.ROCK;
                case 'P':
                    return Move.PAPER;
                case 'S':
                    return Move.SCISSORS;

            }
        } else
            System.out.println("you choosed wrong word!");
        return personTurn();
    }

    private static void computerTurn() {

    }

    private static void continueGame() {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                personTurn();
            } else {
                computerTurn();
            }
        }
    }

}
