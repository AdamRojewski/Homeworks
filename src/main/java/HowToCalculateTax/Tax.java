package HowToCalculateTax;

import HowToCalculateTax.PolishTaxCalculator;
import HowToCalculateTax.RussianTaxCalculator;
import HowToCalculateTax.SpanishTaxCalculator;
import HowToCalculateTax.TaxCalculator;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        System.out.println("please enter an amount");
        Scanner scanner = new Scanner(System.in);
        int amountToCalculate = scanner.nextInt();
        showNationalityMenu();
        int nationalityChoice = scanner.nextInt();
        calculateTaxAmount(nationalityChoice, amountToCalculate);
    }

    private static void calculateTaxAmount(int nationalityChoice, int amountToCalculate) {
        TaxCalculator taxCalculator = null;

        if (nationalityChoice == 1) {
            taxCalculator = new PolishTaxCalculator();
        } else if (nationalityChoice == 2) {
            taxCalculator = new RussianTaxCalculator();
        } else if (nationalityChoice == 3) {
            taxCalculator = new SpanishTaxCalculator();
        }
        if (taxCalculator == null) {
            System.out.println("Wrong nationality number");
            return;
        }
        int amountWithTax = taxCalculator.calculateTax(amountToCalculate);
        System.out.println("Calculated amount :" + amountWithTax);
    }

    private static void showNationalityMenu() {
        System.out.println("choose nationality:");
        System.out.println("1. Poland:");
        System.out.println("2. Russia");
        System.out.println("3. Spain");
    }
}




