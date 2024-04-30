###  Magics, DRY, SOLID

Есть два магазина: "Фрукты и овощи" и косметика, у каждого своя система налогооблажения, так же в продуктовом магазине необходимо продавать на определенную сумму, так как продукты имеют срок-годности.

1. Magics: класс *Shop* - используются независимо от значений в классах наследниках: *ShopMeal* и *ShopCosmetic*.
В классах из пакета Taxes: в *TaxesShopMeal*.

2. DRY: в классе *Shop* - в методах - giveList(Shop shop), calculationPrice(Shop shop) логика в классах *ShopMeal* и  *ShopCosmetic* в соответсвующих методах не повторяется.
   
3. SOLID: 
   - S: *TaxesShopMeal*  и *TaxesShopCosmetic*  отвечают за подсчет налогов, а классы *ShopMeal* и  *ShopCosmetic* за сбор информации, предоставление списков товара.
   - О: пакет *Taxes*, классы *TaxesShopMeal*  и *TaxesShopCosmetic*  
   - L: *ShopMeal* и  *ShopCosmetic* наследуются 
   - I: в пакете *Taxes* интерфейсы разделены 
  
  
