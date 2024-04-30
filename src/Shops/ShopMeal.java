package Shops;

public class ShopMeal extends Shop {

    public ShopMeal() {
        super("Вкусника",
                "фрукты и овощи",
                new String[]{"Яблоки", "Груши", "Капуста", "Манго", "Брокколи"},
                new int[]{120, 300, 50, 500, 400}
        );
    }

    public String getShopName() {
        return this.shopName;
    }


    public int[] getPrices() {
        return this.prices;
    }

    public String[] getProducts() {
        return products;
    }

    public void giveList(ShopMeal shopMeal) {
        super.giveList(shopMeal);
    }


    public int calculationPrice(ShopMeal shopMeal) {
        return super.calculationPrice(shopMeal);
    }

    @Override
    public void showIncome() {
        System.out.println("Общая сумма дохода в магазине" + this.shopName
                + " составляет:   " + sumProducts + " рублей");

    }
}
