package Shops;


public class ShopCosmetic extends Shop {


    public ShopCosmetic() {
        super("Beauty Park",
                "косметические товары",
                new String[]{"Шампунь", "Бальзам", "Маска"},
                new int[]{950, 600, 1250}
        );
    }

    public String getShopName() {
        return this.shopName;
    }

    public void giveList(ShopCosmetic shopCos) {
        super.giveList(shopCos);
    }


    public int calculationPrice(ShopCosmetic shopCos) {
        return super.calculationPrice(shopCos);
    }

    @Override
    public void showIncome() {
        System.out.println("Общая сумма дохода:  " + this.shopName
                + " составляет:   " + sumProducts + " рублей");
    }
}