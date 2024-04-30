import Shops.ShopCosmetic;
import Shops.ShopMeal;
import Shops.Shop;
import Taxes.TaxesCosmeticShop;
import Taxes.TaxesMealShop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка продаж в магазинах и расчет разных налоговых ставок");

        Shop shopCos = new ShopCosmetic();
        System.out.println(shopCos);
        int sumCos = shopCos.calculationPrice(shopCos);
        shopCos.showIncome();
        TaxesCosmeticShop taxesCosmeticShop = new TaxesCosmeticShop();
        taxesCosmeticShop.calculationTaxes(sumCos);

        Shop shopMeal = new ShopMeal();
        System.out.println(shopMeal);
        int sumMeal = shopMeal.calculationPrice(shopMeal);
        shopMeal.showIncome();
        TaxesMealShop taxesSum = new TaxesMealShop();
        taxesSum.calculationTaxes(sumMeal);

    }
}