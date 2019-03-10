package HowToCalculateTax;

public class SpanishTaxCalculator implements TaxCalculator {
    @Override
    public int calculateTax(int amountToCalculate) {
        return (int) (amountToCalculate * 2.2);
    }
}
