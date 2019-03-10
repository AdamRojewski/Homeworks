package CirleCrossAndRocks;

import java.util.Random;
import java.util.Scanner;

public class MyGame {
//TODO Scanner - only int

    private static String[] gameArray = new String[9];
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        //  fillStartArray();
        //  checkIfWin();
        //  continueGame();

        chooseGame();
    }

    private static void chooseGame() {
        System.out.println("Choose type of the game:");
        System.out.println("1. Multiplayer");
        System.out.println("2. Game with computer");
        System.out.println("3. Exit");

        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                fillStartArray();
                checkIfWin();
                continueGame();

                break;
            case 2:
                gameWithComputer();
            case 3:
                System.exit(0);
                break;
                default:
                    System.out.println("Choose one of the available options");
        }
        anotherGame();

    }

    private static void gameWithComputer() {
        fillStartArray();
        checkIfWin();
        ComputerPlayerGame();
    }

    private static void ComputerPlayerGame() {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                xTurn();
            } else {
                computerTurn();
            }
        }
    }

    private static void computerTurn() {
        int computerTurn = random.nextInt(9 - 1) + 1;
        if (gameArray[computerTurn - 1].equals("-")) {
            gameArray[computerTurn - 1] = "O";
            printGameArray();
            checkIfWin();
        } else {
            computerTurn();
        }
    }

    private static void checkIfWin() {
        if (gameArray[0].equals(gameArray[1]) && (gameArray[0].equals(gameArray[2])) && (gameArray[0].equals("X") || gameArray[0].equals("O"))) {
            System.out.println(gameArray[0] + " Wins");
            anotherGame();
        } else if (gameArray[0].equals(gameArray[3]) && (gameArray[0].equals(gameArray[6])) && (gameArray[0].equals("X") || gameArray[0].equals("O"))) {
            System.out.println(gameArray[0] + " Wins");
            anotherGame();
        } else if (gameArray[0].equals(gameArray[4]) && (gameArray[0].equals(gameArray[8])) && (gameArray[0].equals("X") || gameArray[0].equals("O"))) {
            System.out.println(gameArray[0] + " Wins");
            anotherGame();
        } else if (gameArray[1].equals(gameArray[4]) && (gameArray[0].equals(gameArray[7])) && (gameArray[1].equals("X") || gameArray[1].equals("O"))) {
            System.out.println(gameArray[1] + " Wins");
            anotherGame();
        } else if (gameArray[2].equals(gameArray[4]) && (gameArray[0].equals(gameArray[6])) && (gameArray[2].equals("X") || gameArray[2].equals("O"))) {
            System.out.println(gameArray[2] + " Wins");
            anotherGame();
        } else if (gameArray[2].equals(gameArray[5]) && (gameArray[0].equals(gameArray[8])) && (gameArray[2].equals("X") || gameArray[2].equals("O"))) {
            System.out.println(gameArray[2] + " Wins");
            anotherGame();
        } else if (gameArray[3].equals(gameArray[4]) && (gameArray[3].equals(gameArray[5])) && (gameArray[3].equals("X") || gameArray[3].equals("O"))) {
            System.out.println(gameArray[3] + " Wins");
            anotherGame();
        } else if (gameArray[6].equals(gameArray[7]) && (gameArray[6].equals(gameArray[8])) && (gameArray[6].equals("X") || gameArray[6].equals("O"))) {
            System.out.println(gameArray[6] + " Wins");
            anotherGame();
        }
    }

    private static void anotherGame() {
        System.out.println("next game (y / n) ?");
        String question = scanner.next();
        if (question.equals("y")) {
            fillStartArray();
            continueGame();
        } else if (question.equals("n")) {
            System.out.println("Good bye");
            System.exit(0);
        } else
            System.out.println("Good bye");
        System.exit(0);

    }

    private static void continueGame() {
        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0) {
                xTurn();
            } else {
                oTurn();
            }

        }
    }

    private static void xTurn() {
        System.out.println("Choose field form 1-9");
        Integer position = scanner.nextInt();


        while (position > gameArray.length || position < 1) {
            System.out.println("Enter the number from 1-9 range");
            position = scanner.nextInt();
        }
        if (gameArray[position - 1].equals("-")) {
            gameArray[position - 1] = "X";
            printGameArray();
            checkIfWin();
        } else {
            System.out.println("This field is taken, choose another one");
            xTurn();
        }
        System.out.println();

    }

    private static void oTurn() {
        System.out.println("Choose field form 1-9");
        Integer position = scanner.nextInt();

        while (position > gameArray.length || position < 1) {
            System.out.println("Enter the number from 1-9 range");
            position = scanner.nextInt();
        }
        if (gameArray[position - 1].equals("-")) {
            gameArray[position - 1] = "O";
            printGameArray();
            checkIfWin();
        } else {
            System.out.println("This field is taken, choose another one");
            oTurn();
        }
    }

    private static void printGameArray() {
        System.out.println(gameArray[0] + " " + gameArray[1] + " " + gameArray[2]);
        System.out.println(gameArray[3] + " " + gameArray[4] + " " + gameArray[5]);
        System.out.println(gameArray[6] + " " + gameArray[7] + " " + gameArray[8]);
    }

    private static void fillStartArray() {
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = "-";
        }
        printGameArray();

    }
}
