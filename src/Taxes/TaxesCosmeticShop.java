package Taxes;

public class TaxesCosmeticShop implements TaxesShop, TaxesSum {
    protected int taxesTotalCosmeticShop;

    @Override
    public int calculationTaxes(int sum) {
        if (sum == 0) {
            return 0;
        }
        sum = sum * 6 / 100;
        System.out.println("Налог на прибыль составляет " + sum + " рублей");
        return sum;
    }

    @Override
    public int sumTaxes(int taxesDay) {
        return taxesTotalCosmeticShop += taxesDay;
    }
}