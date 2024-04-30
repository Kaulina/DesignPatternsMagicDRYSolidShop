package Taxes;

import Shops.Shop;
import Shops.ShopMeal;

import java.util.Arrays;

public class TaxesMealShop implements TaxesShop, TaxesSum, SalesRate {
    protected int taxesTotalShopMeal;

    @Override
    public int calculationTaxes(int sum) {
        if (sum == 0) {
            return 0;
        }
        calculationSale(sum);
        sum = sum * 15 / 100;
        System.out.println("Налог на прибыль составляет " + sum + " рублей");
        return sum;

    }
    @Override
    public int sumTaxes(int taxesDay) {
        return taxesTotalShopMeal += taxesDay;
    }

    @Override
    public void calculationSale(int sales) {

        Shop shopMeal = new ShopMeal();
        System.out.println(sales > Arrays.stream(shopMeal.getPrices()).sum() ? "Отличная работа" :
                "недостаточный объем продаж, нужно увеличить объемы, а то надбавки не будет, получишь фигу! ");
        // }


    }
}