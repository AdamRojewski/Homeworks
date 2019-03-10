package Homeworks;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Random;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        randomNumber();
        newCalculator();

    }

    public void niceCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zadanie");
        String input = scanner.nextLine();
        System.out.println(plus(input));

    }

    private double multiply(String s) {
        String[] split = s.split("\\*");

        int v = 1;
        for (int i = 0; i < split.length; i++) {
            String t = split[i].trim();
            v = Integer.valueOf(t) * v;
        }
        return v;
    }

    private double divide(String s) {
        String[] split = s.split("\\*");

        int v = 0;
        for (int i = 0; i < split.length; i++) {
            String t = split[i].trim();
            if (i == 0) {
                v = Integer.valueOf(t);
            } else {
                v = Integer.valueOf(t) / v;
            }
        }
        return v;
    }


    private double plus(String input) {
        String[] split = input.split("\\+");
        int v = 0;
        for (int i = 0; i < split.length; i++) {
            String t = split[i];
            if (t.contains("-")) {
                v += minus(t);
            } else {
                v += Integer.valueOf(t.trim());
            }
        }
        return v;
    }

    private double minus(String input) {
        String[] split = input.split("\\-");
        int v = 0;
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                if ("".equals(split[i].trim())) {
                    continue;
                }
                v = Integer.valueOf(split[i].trim());
            } else {
                v = -Integer.valueOf(split[i].trim());
            }
        }
        return v;

    }


    private static void newCalculator() {
        String a = "7+20-15+8x2";
        System.out.println(a);
        String operators[] = a.split("[0-9]+");
        String operands[] = a.split("[+-x]+");
        int agregate = Integer.parseInt(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            if (operators[i].equals("+"))
                agregate += Integer.parseInt(operands[i]);
            else if (operators[i].equals("-"))
                agregate -= Integer.parseInt(operands[i]);
            else if (operators[i].equals("x"))
                agregate *= Integer.parseInt(operands[i]);
        }
        System.out.println(agregate);
    }

    private static void randomNumber() {
        Random random = new Random();
        int myInt = random.nextInt(50); //wylosuje liczbę < 50
        System.out.println(myInt);
    }


}







