package 第二次考核.task1;


public class customer {
    public static void main(String[] args) {
        West2FriedChickenRestaurant ws = new West2FriedChickenRestaurant();
        ws.balance = 20000;
        ws.BulkPurchase(West2FriedChickenRestaurant.corona,2000);
        ws.BulkPurchase(West2FriedChickenRestaurant.cola,20);
        ws.BulkPurchase(West2FriedChickenRestaurant.melonjuice,1);
        ws.BulkPurchase(West2FriedChickenRestaurant.lemonade,2);
ws.SalesMeal(West2FriedChickenRestaurant.meala,2);
        ws.SalesMeal(West2FriedChickenRestaurant.mealb,3);
        ws.SalesMeal(West2FriedChickenRestaurant.mealc,1);
        ws.SalesMeal(West2FriedChickenRestaurant.meald,1);


    }
}
