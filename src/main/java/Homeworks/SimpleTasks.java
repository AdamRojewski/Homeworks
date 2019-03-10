package Homeworks;

import java.util.Scanner;

public class SimpleTasks {
    public static void main(String[] args) {
        TextLenght();
        ShowingText();
        Scanner();
        counterToZero(10, 1);
        newArray();
        wordInStars(5, 5, 4);
        calculator(1, 2, "+");

    }

    private static void newArray() {
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = i + 1;
            System.out.print(table[i]);

            System.out.println();

        }
    }


    private static void counterToZero(int startNumber, int endNumber) {
        for (int i = startNumber; i >= endNumber; i--) {
            System.out.println(i);
        }

    }

    private static void Scanner() { // todo zrobic tak, aby loop obejmowal nieskonczona liczbe pustych pol, gdzie break?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Powiedz jak masz na imie");
        String text = scanner.nextLine();

        if (text.equals("")) {
            System.out.println("Pole zostalo puste. Wpisz imie");
            String nextValue = scanner.nextLine();
            System.out.println("Mam na imie " + nextValue);
        } else {
            System.out.println("Mam na imie " + text);

            System.out.println();
        }
    }


    private static void ShowingText() {
        int weight = 123;
        float secondWeight = 65.45678f;

        System.out.printf("Adam wazy %d kilogramow", weight);
        System.out.println();
        System.out.printf("Maciej chcialby wazyc %.2f kilo", secondWeight);
        System.out.println();
        System.out.printf("%.2f", 3.14159 * 2);
        System.out.println();
    }

    private static void TextLenght() {
        String textNew = new String("Adam");
        "Adam".length();
        System.out.println(textNew.length());
    }


    public static void wordInStars(int height, int width, int distance) { // todo dokonczyc zadanie
        for (int i = 0; i <= height; i++) {
            if (i < height) {
                System.out.println("*");
            }
            for (int j = 0; j <= width; j++) {
                if (i == height) {
                    System.out.print("* ");
                }
            }
        }
    }

    public static void calculator(int firstNumber, int secondNumber, String task) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        firstNumber = scanner.nextInt();
        System.out.println("Wprowadz druga liczbe");
        secondNumber = scanner.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.println("Please enter name of the operation");
        task = operation.next();

        if (task == "+") ;
        {
            System.out.println("Your result is " + (firstNumber + secondNumber));
        }
        if (task == "-") ;
        {
            System.out.println("your result is " + (firstNumber - secondNumber));
        }


    }
}

